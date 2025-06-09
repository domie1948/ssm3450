package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZuoyewanchengxinxiDao;
import com.entity.ZuoyewanchengxinxiEntity;
import com.service.ZuoyewanchengxinxiService;
import com.entity.vo.ZuoyewanchengxinxiVO;
import com.entity.view.ZuoyewanchengxinxiView;

@Service("zuoyewanchengxinxiService")
public class ZuoyewanchengxinxiServiceImpl extends ServiceImpl<ZuoyewanchengxinxiDao, ZuoyewanchengxinxiEntity> implements ZuoyewanchengxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyewanchengxinxiEntity> page = this.selectPage(
                new Query<ZuoyewanchengxinxiEntity>(params).getPage(),
                new EntityWrapper<ZuoyewanchengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyewanchengxinxiEntity> wrapper) {
		  Page<ZuoyewanchengxinxiView> page =new Query<ZuoyewanchengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyewanchengxinxiVO> selectListVO(Wrapper<ZuoyewanchengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyewanchengxinxiVO selectVO(Wrapper<ZuoyewanchengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyewanchengxinxiView> selectListView(Wrapper<ZuoyewanchengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyewanchengxinxiView selectView(Wrapper<ZuoyewanchengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
