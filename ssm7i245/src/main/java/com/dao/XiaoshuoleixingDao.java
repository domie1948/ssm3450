package com.dao;

import com.entity.XiaoshuoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoshuoleixingVO;
import com.entity.view.XiaoshuoleixingView;


/**
 * 小说类型
 * 
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
public interface XiaoshuoleixingDao extends BaseMapper<XiaoshuoleixingEntity> {
	
	List<XiaoshuoleixingVO> selectListVO(@Param("ew") Wrapper<XiaoshuoleixingEntity> wrapper);
	
	XiaoshuoleixingVO selectVO(@Param("ew") Wrapper<XiaoshuoleixingEntity> wrapper);
	
	List<XiaoshuoleixingView> selectListView(@Param("ew") Wrapper<XiaoshuoleixingEntity> wrapper);

	List<XiaoshuoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshuoleixingEntity> wrapper);
	
	XiaoshuoleixingView selectView(@Param("ew") Wrapper<XiaoshuoleixingEntity> wrapper);
	
}
