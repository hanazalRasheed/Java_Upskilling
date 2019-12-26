package com.hana.webtest;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "mbSecurity")
@SessionScoped
public class MBSecurity {
	String username;
	String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if (getUsername().equals("ata") && getPassword().equals("123456")) {
			password = null;
			return "home.xhtml?faces-redirect=true";
		}
		username = null;
		password = null;
		return null;
	}
	
	public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "home.xhtml?faces-redirect=true";
	}
}
