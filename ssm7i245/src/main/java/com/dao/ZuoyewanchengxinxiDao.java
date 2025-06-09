package com.dao;

import com.entity.ZuoyewanchengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyewanchengxinxiVO;
import com.entity.view.ZuoyewanchengxinxiView;


/**
 * 作业完成信息
 * 
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
public interface ZuoyewanchengxinxiDao extends BaseMapper<ZuoyewanchengxinxiEntity> {
	
	List<ZuoyewanchengxinxiVO> selectListVO(@Param("ew") Wrapper<ZuoyewanchengxinxiEntity> wrapper);
	
	ZuoyewanchengxinxiVO selectVO(@Param("ew") Wrapper<ZuoyewanchengxinxiEntity> wrapper);
	
	List<ZuoyewanchengxinxiView> selectListView(@Param("ew") Wrapper<ZuoyewanchengxinxiEntity> wrapper);

	List<ZuoyewanchengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyewanchengxinxiEntity> wrapper);
	
	ZuoyewanchengxinxiView selectView(@Param("ew") Wrapper<ZuoyewanchengxinxiEntity> wrapper);
	
}
