package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalSearch;
import vo.AnimalSearchDAO;

public class SearchViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalSearchDAO dao = new AnimalSearchDAO();
		int ani_no = Integer.parseInt(request.getParameter("ani_no"));
		AnimalSearch as = dao.viewSearch(ani_no);
		
		request.setAttribute("aniView", as);
		ActionForward af = new ActionForward("search/aniView.jsp",false);
		return af;
	}

}
