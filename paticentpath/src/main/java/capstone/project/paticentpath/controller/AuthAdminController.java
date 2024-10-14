package capstone.project.paticentpath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import capstone.project.paticentpath.models.Adminuser;
import capstone.project.paticentpath.models.User;
import capstone.project.paticentpath.services.impl.AdminUserServiceImpl;

@RestController
@RequestMapping("admin")
public class AuthAdminController {

	@Autowired
	AdminUserServiceImpl adminser;
	
	@PostMapping
	public ResponseEntity<Boolean> addAdmin(@RequestBody Adminuser user ){
		Adminuser admin = adminser.addAdmin(user);
		boolean res=false;
		if(admin!=null) {
			res=true;
		}
		return new ResponseEntity<Boolean>(res,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("login")
	public ResponseEntity<Boolean> loginUser(@RequestBody Adminuser  login){
		boolean res = adminser.adminLogin(login.getEmail(), login.getPassword());
		
		
		return new  ResponseEntity<>(res,HttpStatus.ACCEPTED);
		
	}
}
