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


import com.dao.XiaoshuoleixingDao;
import com.entity.XiaoshuoleixingEntity;
import com.service.XiaoshuoleixingService;
import com.entity.vo.XiaoshuoleixingVO;
import com.entity.view.XiaoshuoleixingView;

@Service("xiaoshuoleixingService")
public class XiaoshuoleixingServiceImpl extends ServiceImpl<XiaoshuoleixingDao, XiaoshuoleixingEntity> implements XiaoshuoleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoshuoleixingEntity> page = this.selectPage(
                new Query<XiaoshuoleixingEntity>(params).getPage(),
                new EntityWrapper<XiaoshuoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoshuoleixingEntity> wrapper) {
		  Page<XiaoshuoleixingView> page =new Query<XiaoshuoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoshuoleixingVO> selectListVO(Wrapper<XiaoshuoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoshuoleixingVO selectVO(Wrapper<XiaoshuoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoshuoleixingView> selectListView(Wrapper<XiaoshuoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoshuoleixingView selectView(Wrapper<XiaoshuoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
