package com.dao;

import com.entity.ZuoyepigaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyepigaixinxiVO;
import com.entity.view.ZuoyepigaixinxiView;


/**
 * 作业批改信息
 * 
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
public interface ZuoyepigaixinxiDao extends BaseMapper<ZuoyepigaixinxiEntity> {
	
	List<ZuoyepigaixinxiVO> selectListVO(@Param("ew") Wrapper<ZuoyepigaixinxiEntity> wrapper);
	
	ZuoyepigaixinxiVO selectVO(@Param("ew") Wrapper<ZuoyepigaixinxiEntity> wrapper);
	
	List<ZuoyepigaixinxiView> selectListView(@Param("ew") Wrapper<ZuoyepigaixinxiEntity> wrapper);

	List<ZuoyepigaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyepigaixinxiEntity> wrapper);
	
	ZuoyepigaixinxiView selectView(@Param("ew") Wrapper<ZuoyepigaixinxiEntity> wrapper);
	
}
