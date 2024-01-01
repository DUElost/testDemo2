package com.entity.vo;

import com.entity.YimiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 疫苗信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-30 15:08:53
 */
public class YimiaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 批次号
	 */
	
	private String picihao;
		
	/**
	 * 接种区域
	 */
	
	private String jiezhongquyu;
		
	/**
	 * 接种时间
	 */
	
	private String jiezhongshijian;
		
	/**
	 * 疫苗数量
	 */
	
	private Integer yimiaoshuliang;
		
	/**
	 * 适合人群
	 */
	
	private String shiherenqun;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 疫苗图片
	 */
	
	private String yimiaotupian;
				
	
	/**
	 * 设置：批次号
	 */
	 
	public void setPicihao(String picihao) {
		this.picihao = picihao;
	}
	
	/**
	 * 获取：批次号
	 */
	public String getPicihao() {
		return picihao;
	}
				
	
	/**
	 * 设置：接种区域
	 */
	 
	public void setJiezhongquyu(String jiezhongquyu) {
		this.jiezhongquyu = jiezhongquyu;
	}
	
	/**
	 * 获取：接种区域
	 */
	public String getJiezhongquyu() {
		return jiezhongquyu;
	}
				
	
	/**
	 * 设置：接种时间
	 */
	 
	public void setJiezhongshijian(String jiezhongshijian) {
		this.jiezhongshijian = jiezhongshijian;
	}
	
	/**
	 * 获取：接种时间
	 */
	public String getJiezhongshijian() {
		return jiezhongshijian;
	}
				
	
	/**
	 * 设置：疫苗数量
	 */
	 
	public void setYimiaoshuliang(Integer yimiaoshuliang) {
		this.yimiaoshuliang = yimiaoshuliang;
	}
	
	/**
	 * 获取：疫苗数量
	 */
	public Integer getYimiaoshuliang() {
		return yimiaoshuliang;
	}
				
	
	/**
	 * 设置：适合人群
	 */
	 
	public void setShiherenqun(String shiherenqun) {
		this.shiherenqun = shiherenqun;
	}
	
	/**
	 * 获取：适合人群
	 */
	public String getShiherenqun() {
		return shiherenqun;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：疫苗图片
	 */
	 
	public void setYimiaotupian(String yimiaotupian) {
		this.yimiaotupian = yimiaotupian;
	}
	
	/**
	 * 获取：疫苗图片
	 */
	public String getYimiaotupian() {
		return yimiaotupian;
	}
			
}
