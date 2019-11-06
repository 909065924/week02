package com.bwei.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bwei.beans.Brand;
import com.bwei.beans.Goods;
import com.bwei.beans.GoodsKind;
import com.bwei.dao.GoodsDao;
import com.bwei.service.GoodsService;
@Service
public class GoodsServiceImp implements GoodsService {
	
	@Resource
	private GoodsDao dao;

	public List<Goods> getGoodsAll(Goods goods) {
		// TODO Auto-generated method stub
		return dao.getGoodsAll(goods);
	}

	public Goods getGoodsByGid(Integer gid) {
		// TODO Auto-generated method stub
		return dao.getGoodsByGid(gid);
	}

	public void addGoods(Goods goods) {
		// TODO Auto-generated method stub
		dao.addGoods(goods);
	}

	public void updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		dao.updateGoods(goods);
	}

	public void deleteGoods(String gids) {
		// TODO Auto-generated method stub
		dao.deleteGoods(gids);
	}

	public List<Brand> getBrandAll() {
		// TODO Auto-generated method stub
		return dao.getBrandAll();
	}

	public List<GoodsKind> getGoodsKindAll() {
		// TODO Auto-generated method stub
		return dao.getGoodsKindAll();
	}

	
}
