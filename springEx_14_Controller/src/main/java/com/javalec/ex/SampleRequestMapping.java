package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/board")
public class SampleRequestMapping {
	
	@RequestMapping("/view1")
	public String view()
	{
		return "/board/view1";
	}
	
	// /board + /view = /board/view

}
