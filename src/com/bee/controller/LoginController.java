package com.bee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bee.bean.LoginBean;
import com.bee.model.Login;
import com.bee.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping("/index")
	public ModelAndView log(@ModelAttribute("command")  LoginBean loginBean,
			BindingResult result) {
		return new ModelAndView("login","message","");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("command") LoginBean loginBean, 
			BindingResult result) {
		Login login = prepareModel(loginBean);
		Login rest = loginService.getUser(login.getUsername());
		if(result.hasErrors())
			return new ModelAndView("login","message","");
		if(rest == null){
			return new ModelAndView("login","message","Anda Belum terdaftar, silahkan daftar terlbih dahulu");
		}else {
			if(login.getPassword().equals(login.getPassword())){
				return new ModelAndView("redirect:/report.html");
			}else{
				return new ModelAndView("login","message","Password Salah");
			}
		}
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(@ModelAttribute("command") LoginBean loginBean, 
			BindingResult result){
		return new ModelAndView("register","message","");
	}
	
	@RequestMapping(value = "/create_user", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("command") @Valid LoginBean loginBean, 
			BindingResult result){
		Login login = prepareModel(loginBean);
		Login rest = loginService.getUser(login.getUsername());
		if(rest!=null){
			return new ModelAndView("register","message","username Sudah Terdaftar");
		}
		if(!loginBean.getPassword().equals(loginBean.getRetypePassword())){
			return new ModelAndView("register","message","Password tidak sama");
		}
		loginService.add(login);
		return new ModelAndView("redirect:/index.html");
	}
	private Login prepareModel(LoginBean loginBean) {		
		Login login = new Login();
		login.setUsername(loginBean.getUsername());
		login.setPassword(loginBean.getPassword());
		login.setEmail(loginBean.getEmail());
		return login;
	}
}
