package com.dao;

import com.entity.XiaoshuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoshuoVO;
import com.entity.view.XiaoshuoView;


/**
 * 小说
 * 
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
public interface XiaoshuoDao extends BaseMapper<XiaoshuoEntity> {
	
	List<XiaoshuoVO> selectListVO(@Param("ew") Wrapper<XiaoshuoEntity> wrapper);
	
	XiaoshuoVO selectVO(@Param("ew") Wrapper<XiaoshuoEntity> wrapper);
	
	List<XiaoshuoView> selectListView(@Param("ew") Wrapper<XiaoshuoEntity> wrapper);

	List<XiaoshuoView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshuoEntity> wrapper);
	
	XiaoshuoView selectView(@Param("ew") Wrapper<XiaoshuoEntity> wrapper);
	
}
