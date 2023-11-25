package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalSearch;
import vo.AnimalSearchDAO;

public class SearchCListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalSearchDAO dao = new AnimalSearchDAO();
		int now = 1;
		ArrayList<AnimalSearch> cSearchList = dao.listSearch(now);
		
		
		if(cSearchList.size()==0) {
			cSearchList=null;
		}
		
		request.setAttribute("now", now);
		request.setAttribute("SearchList", cSearchList);
		ActionForward af = new ActionForward("/search/animalSearch.jsp",false);
		return af;
	}

}
