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


import com.dao.ZuoyepigaixinxiDao;
import com.entity.ZuoyepigaixinxiEntity;
import com.service.ZuoyepigaixinxiService;
import com.entity.vo.ZuoyepigaixinxiVO;
import com.entity.view.ZuoyepigaixinxiView;

@Service("zuoyepigaixinxiService")
public class ZuoyepigaixinxiServiceImpl extends ServiceImpl<ZuoyepigaixinxiDao, ZuoyepigaixinxiEntity> implements ZuoyepigaixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyepigaixinxiEntity> page = this.selectPage(
                new Query<ZuoyepigaixinxiEntity>(params).getPage(),
                new EntityWrapper<ZuoyepigaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyepigaixinxiEntity> wrapper) {
		  Page<ZuoyepigaixinxiView> page =new Query<ZuoyepigaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyepigaixinxiVO> selectListVO(Wrapper<ZuoyepigaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyepigaixinxiVO selectVO(Wrapper<ZuoyepigaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyepigaixinxiView> selectListView(Wrapper<ZuoyepigaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyepigaixinxiView selectView(Wrapper<ZuoyepigaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
