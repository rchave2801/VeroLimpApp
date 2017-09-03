package com.verolimp.services;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.verolimp.dao.LoginDAO;


@Path("LoginService")
public class LoginService {
	
	@GET
	@Path("AuthenticateMethod")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean authenticate(@PathParam("user") String user, @PathParam("pass") String pass) {
		LoginDAO login = new LoginDAO();
		
		return login.authneticateUser(user, pass);
	}
}
