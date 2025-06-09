package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZuoyewanchengxinxiEntity;
import com.entity.view.ZuoyewanchengxinxiView;

import com.service.ZuoyewanchengxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 作业完成信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
@RestController
@RequestMapping("/zuoyewanchengxinxi")
public class ZuoyewanchengxinxiController {
    @Autowired
    private ZuoyewanchengxinxiService zuoyewanchengxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuoyewanchengxinxiEntity zuoyewanchengxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			zuoyewanchengxinxi.setLaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			zuoyewanchengxinxi.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZuoyewanchengxinxiEntity> ew = new EntityWrapper<ZuoyewanchengxinxiEntity>();
		PageUtils page = zuoyewanchengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoyewanchengxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuoyewanchengxinxiEntity zuoyewanchengxinxi, 
		HttpServletRequest request){
        EntityWrapper<ZuoyewanchengxinxiEntity> ew = new EntityWrapper<ZuoyewanchengxinxiEntity>();
		PageUtils page = zuoyewanchengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoyewanchengxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuoyewanchengxinxiEntity zuoyewanchengxinxi){
       	EntityWrapper<ZuoyewanchengxinxiEntity> ew = new EntityWrapper<ZuoyewanchengxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuoyewanchengxinxi, "zuoyewanchengxinxi")); 
        return R.ok().put("data", zuoyewanchengxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuoyewanchengxinxiEntity zuoyewanchengxinxi){
        EntityWrapper< ZuoyewanchengxinxiEntity> ew = new EntityWrapper< ZuoyewanchengxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuoyewanchengxinxi, "zuoyewanchengxinxi")); 
		ZuoyewanchengxinxiView zuoyewanchengxinxiView =  zuoyewanchengxinxiService.selectView(ew);
		return R.ok("查询作业完成信息成功").put("data", zuoyewanchengxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuoyewanchengxinxiEntity zuoyewanchengxinxi = zuoyewanchengxinxiService.selectById(id);
        return R.ok().put("data", zuoyewanchengxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuoyewanchengxinxiEntity zuoyewanchengxinxi = zuoyewanchengxinxiService.selectById(id);
        return R.ok().put("data", zuoyewanchengxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuoyewanchengxinxiEntity zuoyewanchengxinxi, HttpServletRequest request){
    	zuoyewanchengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuoyewanchengxinxi);

        zuoyewanchengxinxiService.insert(zuoyewanchengxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuoyewanchengxinxiEntity zuoyewanchengxinxi, HttpServletRequest request){
    	zuoyewanchengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuoyewanchengxinxi);

        zuoyewanchengxinxiService.insert(zuoyewanchengxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZuoyewanchengxinxiEntity zuoyewanchengxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuoyewanchengxinxi);
        zuoyewanchengxinxiService.updateById(zuoyewanchengxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuoyewanchengxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZuoyewanchengxinxiEntity> wrapper = new EntityWrapper<ZuoyewanchengxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			wrapper.eq("laoshizhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshengzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zuoyewanchengxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
