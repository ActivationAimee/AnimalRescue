package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalSearch;
import vo.AnimalSearchDAO;

public class SearchDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalSearchDAO dao = new AnimalSearchDAO();
		int no = Integer.parseInt(request.getParameter("ani_no"));
		dao.deleteAnimalSearch(no);
		ActionForward af = new ActionForward("search/animalSearch.jsp", false);
		
		return af;
	}

}
