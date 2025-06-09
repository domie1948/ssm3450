package com.entity.model;

import com.entity.ZuoyepigaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 作业批改信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
public class ZuoyepigaixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 老师姓名
	 */
	
	private String laoshixingming;
		
	/**
	 * 学生账号
	 */
	
	private String xueshengzhanghao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 作业名称
	 */
	
	private String zuoyemingcheng;
		
	/**
	 * 作业内容
	 */
	
	private String zuoyeneirong;
		
	/**
	 * 布置时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date buzhishijian;
		
	/**
	 * 需完成时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xuwanchengshijian;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 完成内容
	 */
	
	private String wanchengneirong;
		
	/**
	 * 上传时间
	 */
	
	private String shangchuanshijian;
		
	/**
	 * 作业等级
	 */
	
	private String zuoyedengji;
		
	/**
	 * 批改备注
	 */
	
	private String pigaibeizhu;
		
	/**
	 * 作业完成附件
	 */
	
	private String zuoyewanchengfujian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：老师姓名
	 */
	 
	public void setLaoshixingming(String laoshixingming) {
		this.laoshixingming = laoshixingming;
	}
	
	/**
	 * 获取：老师姓名
	 */
	public String getLaoshixingming() {
		return laoshixingming;
	}
				
	
	/**
	 * 设置：学生账号
	 */
	 
	public void setXueshengzhanghao(String xueshengzhanghao) {
		this.xueshengzhanghao = xueshengzhanghao;
	}
	
	/**
	 * 获取：学生账号
	 */
	public String getXueshengzhanghao() {
		return xueshengzhanghao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：作业名称
	 */
	 
	public void setZuoyemingcheng(String zuoyemingcheng) {
		this.zuoyemingcheng = zuoyemingcheng;
	}
	
	/**
	 * 获取：作业名称
	 */
	public String getZuoyemingcheng() {
		return zuoyemingcheng;
	}
				
	
	/**
	 * 设置：作业内容
	 */
	 
	public void setZuoyeneirong(String zuoyeneirong) {
		this.zuoyeneirong = zuoyeneirong;
	}
	
	/**
	 * 获取：作业内容
	 */
	public String getZuoyeneirong() {
		return zuoyeneirong;
	}
				
	
	/**
	 * 设置：布置时间
	 */
	 
	public void setBuzhishijian(Date buzhishijian) {
		this.buzhishijian = buzhishijian;
	}
	
	/**
	 * 获取：布置时间
	 */
	public Date getBuzhishijian() {
		return buzhishijian;
	}
				
	
	/**
	 * 设置：需完成时间
	 */
	 
	public void setXuwanchengshijian(Date xuwanchengshijian) {
		this.xuwanchengshijian = xuwanchengshijian;
	}
	
	/**
	 * 获取：需完成时间
	 */
	public Date getXuwanchengshijian() {
		return xuwanchengshijian;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：完成内容
	 */
	 
	public void setWanchengneirong(String wanchengneirong) {
		this.wanchengneirong = wanchengneirong;
	}
	
	/**
	 * 获取：完成内容
	 */
	public String getWanchengneirong() {
		return wanchengneirong;
	}
				
	
	/**
	 * 设置：上传时间
	 */
	 
	public void setShangchuanshijian(String shangchuanshijian) {
		this.shangchuanshijian = shangchuanshijian;
	}
	
	/**
	 * 获取：上传时间
	 */
	public String getShangchuanshijian() {
		return shangchuanshijian;
	}
				
	
	/**
	 * 设置：作业等级
	 */
	 
	public void setZuoyedengji(String zuoyedengji) {
		this.zuoyedengji = zuoyedengji;
	}
	
	/**
	 * 获取：作业等级
	 */
	public String getZuoyedengji() {
		return zuoyedengji;
	}
				
	
	/**
	 * 设置：批改备注
	 */
	 
	public void setPigaibeizhu(String pigaibeizhu) {
		this.pigaibeizhu = pigaibeizhu;
	}
	
	/**
	 * 获取：批改备注
	 */
	public String getPigaibeizhu() {
		return pigaibeizhu;
	}
				
	
	/**
	 * 设置：作业完成附件
	 */
	 
	public void setZuoyewanchengfujian(String zuoyewanchengfujian) {
		this.zuoyewanchengfujian = zuoyewanchengfujian;
	}
	
	/**
	 * 获取：作业完成附件
	 */
	public String getZuoyewanchengfujian() {
		return zuoyewanchengfujian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
