package com.dao;

import com.entity.QuyuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuyuxinxiVO;
import com.entity.view.QuyuxinxiView;


/**
 * 区域信息
 * 
 * @author 
 * @email 
 * @date 2022-03-30 15:08:53
 */
public interface QuyuxinxiDao extends BaseMapper<QuyuxinxiEntity> {
	
	List<QuyuxinxiVO> selectListVO(@Param("ew") Wrapper<QuyuxinxiEntity> wrapper);
	
	QuyuxinxiVO selectVO(@Param("ew") Wrapper<QuyuxinxiEntity> wrapper);
	
	List<QuyuxinxiView> selectListView(@Param("ew") Wrapper<QuyuxinxiEntity> wrapper);

	List<QuyuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QuyuxinxiEntity> wrapper);
	
	QuyuxinxiView selectView(@Param("ew") Wrapper<QuyuxinxiEntity> wrapper);
	

}
