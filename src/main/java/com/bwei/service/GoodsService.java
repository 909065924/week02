package com.bwei.service;

import java.util.List;

import com.bwei.beans.Brand;
import com.bwei.beans.Goods;
import com.bwei.beans.GoodsKind;

public interface GoodsService {
	
	List<Goods> getGoodsAll(Goods goods);
	
	Goods getGoodsByGid(Integer gid);
	
	void addGoods(Goods goods);
	
	void updateGoods(Goods goods);
	
	void deleteGoods(String gids);

	List<Brand> getBrandAll();

	List<GoodsKind> getGoodsKindAll();

}
