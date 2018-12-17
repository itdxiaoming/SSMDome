package com.xmdong.SSMDome.moudle.point.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmdong.SSMDome.moudle.point.bin.Point;
import com.xmdong.SSMDome.moudle.point.dao.PointDao;
import com.xmdong.SSMDome.utils.Msg;

@Service
public class PointService {

	@Autowired
	PointDao pointDao;

	public Msg getPoint() {
		
 		return Msg.sussess(null).add("points", pointDao.getAll());
	}

	public Msg insertPint(Float pointX, Float pointY) {
		Point point = new Point();
		point.setPointX(pointX);
		point.setPointY(pointY);
 		int count = pointDao.insertPointByXY(point);
		Msg result = count == 0 ? Msg.fail("插入失败！") : Msg.sussess(null);
		return result;
	}
	
	
}
