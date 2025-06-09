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


import com.dao.DiscussxiaoshuoDao;
import com.entity.DiscussxiaoshuoEntity;
import com.service.DiscussxiaoshuoService;
import com.entity.vo.DiscussxiaoshuoVO;
import com.entity.view.DiscussxiaoshuoView;

@Service("discussxiaoshuoService")
public class DiscussxiaoshuoServiceImpl extends ServiceImpl<DiscussxiaoshuoDao, DiscussxiaoshuoEntity> implements DiscussxiaoshuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxiaoshuoEntity> page = this.selectPage(
                new Query<DiscussxiaoshuoEntity>(params).getPage(),
                new EntityWrapper<DiscussxiaoshuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxiaoshuoEntity> wrapper) {
		  Page<DiscussxiaoshuoView> page =new Query<DiscussxiaoshuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxiaoshuoVO> selectListVO(Wrapper<DiscussxiaoshuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxiaoshuoVO selectVO(Wrapper<DiscussxiaoshuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxiaoshuoView> selectListView(Wrapper<DiscussxiaoshuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxiaoshuoView selectView(Wrapper<DiscussxiaoshuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
