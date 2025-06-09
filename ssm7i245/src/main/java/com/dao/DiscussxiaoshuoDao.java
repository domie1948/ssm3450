package com.dao;

import com.entity.DiscussxiaoshuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxiaoshuoVO;
import com.entity.view.DiscussxiaoshuoView;


/**
 * 小说评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
public interface DiscussxiaoshuoDao extends BaseMapper<DiscussxiaoshuoEntity> {
	
	List<DiscussxiaoshuoVO> selectListVO(@Param("ew") Wrapper<DiscussxiaoshuoEntity> wrapper);
	
	DiscussxiaoshuoVO selectVO(@Param("ew") Wrapper<DiscussxiaoshuoEntity> wrapper);
	
	List<DiscussxiaoshuoView> selectListView(@Param("ew") Wrapper<DiscussxiaoshuoEntity> wrapper);

	List<DiscussxiaoshuoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxiaoshuoEntity> wrapper);
	
	DiscussxiaoshuoView selectView(@Param("ew") Wrapper<DiscussxiaoshuoEntity> wrapper);
	
}
