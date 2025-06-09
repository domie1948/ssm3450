package com.entity.view;

import com.entity.XiaoshuoleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 小说类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
@TableName("xiaoshuoleixing")
public class XiaoshuoleixingView  extends XiaoshuoleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoshuoleixingView(){
	}
 
 	public XiaoshuoleixingView(XiaoshuoleixingEntity xiaoshuoleixingEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoshuoleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
