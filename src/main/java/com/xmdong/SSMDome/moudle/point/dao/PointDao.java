package com.xmdong.SSMDome.moudle.point.dao;

import java.util.List;

import com.xmdong.SSMDome.moudle.point.bin.Point;

public interface PointDao {

	int insertPointByXY(Point point);
	
	List<Point> getAll();

}
