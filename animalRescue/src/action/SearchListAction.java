package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalSearch;
import vo.AnimalSearchDAO;

public class SearchListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalSearchDAO dao = new AnimalSearchDAO();

		ArrayList<AnimalSearch> SearchList = dao.listSearch();
		
		if(SearchList.size()==0) {
			SearchList=null;
		}
		
		request.setAttribute("SearchList", SearchList);
		ActionForward af = new ActionForward("/search/animalSearch.jsp",false);
		return af;
	}

}
