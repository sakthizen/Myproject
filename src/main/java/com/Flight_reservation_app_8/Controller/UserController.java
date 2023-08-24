package com.Flight_reservation_app_8.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_reservation_app_8.Repository.UserRepository;
import com.Flight_reservation_app_8.entity.User;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;

	
	@RequestMapping("/showreg")
	public String showReg() {
    return"login/showreg";		
	}
	

	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "login/login";
	}
     
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user")User user) {
		userRepo.save(user);
		return "login/login";
	}
	
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId")String emailId,@RequestParam("password")String password,ModelMap modelMap) {
		 User user=userRepo.findByEmail(emailId);
		 if(user!=null) {
		 if(user.getEmail().equals(emailId)&& user.getPassword().equals(password)) {
		 return "findFlights";
	}else {
		modelMap.addAttribute("error","invalid username/password");
		return "login/login";
	}
		 }else {
				modelMap.addAttribute("error","invalid username/password");
				return "login/login";
	}
	}
}
