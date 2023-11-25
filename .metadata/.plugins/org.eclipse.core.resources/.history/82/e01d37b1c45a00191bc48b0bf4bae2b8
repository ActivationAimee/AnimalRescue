package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalDAO;
import vo.AnimalSearch;
import vo.AnimalSearchDAO;

public class Animal_adoptWriteForm implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalSearchDAO dao = new AnimalSearchDAO();
		int ani_w=Integer.parseInt(request.getParameter("ani_w"));
		AnimalSearch as = dao.viewSearch(ani_w);
		
		request.setAttribute("as", as);
		request.setAttribute("ani_w", ani_w);
		ActionForward af = new ActionForward("adopt/adopt_writeForm.jsp", false);
		return af;
		
	}
}
