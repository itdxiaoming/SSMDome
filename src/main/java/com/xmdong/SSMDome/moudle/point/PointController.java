package com.xmdong.SSMDome.moudle.point;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.xmdong.SSMDome.moudle.point.service.PointService;
import com.xmdong.SSMDome.utils.Msg;

@Controller
public class PointController {

	@Autowired
	PointService pointService;
	
	@RequestMapping("/points")
	@ResponseBody
	public Msg getAllPoint() {
		return pointService.getPoint();
	}
	
	@RequestMapping("/addPoint")
	@ResponseBody
 	public Msg addPoint(Float x, Float y) {
		
		System.out.println("x = " + x + "  --------  >    y = "  + y);
		return pointService.insertPint(x,y);
	}
}
