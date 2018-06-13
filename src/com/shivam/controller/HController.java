package com.shivam.controller;

import com.shivam.db.*;
import com.shivam.entity.UserInfo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*public class Controller extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("obj1","Shivam Pathak");
		return mv;
	}
	
	 

}
*/
@Controller
public class HController {

	@RequestMapping("/home.html")
	public ModelAndView Page1F() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

	/*@RequestMapping("/Admission.html")
	public ModelAndView Page2F() {
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}*/

	@RequestMapping("/newUser.html")
	public ModelAndView newUser() {
		ModelAndView mv = new ModelAndView("SignUp");
		return mv;
	}

	@ModelAttribute
	public void addCommon(Model mv) {
		mv.addAttribute("common", "Shivam Pvt Ltd");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[]{"StudentMobile"});
	}

	@RequestMapping(value = "/sumbitForm.html", method = RequestMethod.POST)
	public ModelAndView SubmitAction(@ModelAttribute("userInfo") UserInfo user, BindingResult result) {

		Login l = new Login();
		ModelAndView mv;
		if (1 == l.getData(user)) {
			mv = new ModelAndView("Success");
			mv.addObject("msg", "Welcome ");
			return mv;
		}
		mv = new ModelAndView("Success");
		mv.addObject("msg", "Failure");
		return mv;

	}

	@RequestMapping(value = "/signup.html", method = RequestMethod.POST)
	public ModelAndView CreateUser(@ModelAttribute("userInfo") UserInfo user, BindingResult result) {
		ModelAndView mv;
		if (result.hasErrors()) {
			mv = new ModelAndView("SignUp");
			mv.addObject("msg", "Welcome ");
		} else {
			Login l = new Login();
			l.saveData(user);
			mv = new ModelAndView("Success");
			mv.addObject("msg", "Welcome ");
		}
		return mv;
	}

}