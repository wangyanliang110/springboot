package com.springboot.controller;

import com.springboot.domain.Car;
import com.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@SessionAttributes(types = {String.class},names = {"car"})
@Controller
public class CarController {

  @Autowired
  private CarService carService;

  @RequestMapping("hithymeleaf")
  public String hiThymeleaf(
          @RequestParam(value = "name",required = false,defaultValue = "world") String name, Model model
  ){
    //模型数据
    model.addAttribute("name",name);
    //视图（resources 下的模板中的html：hello.html)
    return "hello";
  }

  @GetMapping("carlist") // 跳转版 line 17 | 18
  public ModelAndView list() {
    List<Car> cars = carService.list();
    ModelAndView mv = new ModelAndView();
    mv.setViewName("carlist");//carlist.html
    mv.addObject("cars",cars);//模型数据

    Car car = new Car();
    car.setId(4);
    car.setName("cc");
    car.setPrice(8989d);
    car.setCreateDate(new Date());
    mv.addObject("car",car);

    return mv;
  }

}

