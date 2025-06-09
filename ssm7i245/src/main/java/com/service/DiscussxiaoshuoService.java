package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxiaoshuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxiaoshuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxiaoshuoView;


/**
 * 小说评论表
 *
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
public interface DiscussxiaoshuoService extends IService<DiscussxiaoshuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxiaoshuoVO> selectListVO(Wrapper<DiscussxiaoshuoEntity> wrapper);
   	
   	DiscussxiaoshuoVO selectVO(@Param("ew") Wrapper<DiscussxiaoshuoEntity> wrapper);
   	
   	List<DiscussxiaoshuoView> selectListView(Wrapper<DiscussxiaoshuoEntity> wrapper);
   	
   	DiscussxiaoshuoView selectView(@Param("ew") Wrapper<DiscussxiaoshuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxiaoshuoEntity> wrapper);
   	
}

