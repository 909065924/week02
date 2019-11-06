package com.bwei.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bwei.beans.Brand;
import com.bwei.beans.Goods;
import com.bwei.beans.GoodsKind;
import com.bwei.service.GoodsService;
import com.bwei.utils.FileUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {

	@Resource
	private GoodsService goodsser;
	
	@RequestMapping("/getGoodsAll")
	public ModelAndView getGoodsAll(@RequestParam(defaultValue="1")Integer pageNum,Goods goods){
		
		ModelAndView mv = new ModelAndView();
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = goodsser.getGoodsAll(goods);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		mv.getModelMap().addAttribute("page", page);
		mv.setViewName("jsp/goodsList");
		return mv;
		
	}
	
	@RequestMapping("/looking")
	public void looking(String path,HttpServletRequest request,HttpServletResponse response){
		FileUtils.lookImg(path, request, response);
	}
	
	@RequestMapping("/getBrandAll")
	@ResponseBody
	public List<Brand> getBrandAll(){
		List<Brand> list = goodsser.getBrandAll();
		System.out.println(list);
		return list;
	}
	
	
	@RequestMapping("/getGoodsKindAll")
	@ResponseBody
	public List<GoodsKind> getGoodsKindAll(){
		List<GoodsKind> list = goodsser.getGoodsKindAll();
		System.out.println(list);
		return list;
	}
	
	@RequestMapping("/addGoods")
	public String addGoods(Goods goods,MultipartFile img){
		try {
			String gpic = FileUtils.upload(img);
			goods.setGpic(gpic);
			System.out.println(goods);
			goodsser.addGoods(goods);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/getGoodsAll";
	}
}
