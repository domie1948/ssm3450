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


import com.dao.XiaoshuoDao;
import com.entity.XiaoshuoEntity;
import com.service.XiaoshuoService;
import com.entity.vo.XiaoshuoVO;
import com.entity.view.XiaoshuoView;

@Service("xiaoshuoService")
public class XiaoshuoServiceImpl extends ServiceImpl<XiaoshuoDao, XiaoshuoEntity> implements XiaoshuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoshuoEntity> page = this.selectPage(
                new Query<XiaoshuoEntity>(params).getPage(),
                new EntityWrapper<XiaoshuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoshuoEntity> wrapper) {
		  Page<XiaoshuoView> page =new Query<XiaoshuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoshuoVO> selectListVO(Wrapper<XiaoshuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoshuoVO selectVO(Wrapper<XiaoshuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoshuoView> selectListView(Wrapper<XiaoshuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoshuoView selectView(Wrapper<XiaoshuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
