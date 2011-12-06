// This file is a part of dcstore project,
// licensed under GPLv2
//
// Dominik Cebula
// dominikcebula@gmail.com
package dcstore.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@ManagedBean
public class AdminWeb {
	public String isActive(String name) throws Exception {
		HttpServletRequest req=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();

		if (req.getServletPath().equals("/admin/"+name))
			return "active";
		else
			return "";
	}

	public void logout() throws Exception {
		HttpServletRequest req=(HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		HttpServletResponse res=(HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse();
		
		if (req.getRemoteUser()==null)
			return;

		req.logout();
		req.getRequestDispatcher("/admin/admin-login.xhtml").forward(req, res);
	}
}

