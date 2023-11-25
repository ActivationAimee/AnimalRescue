package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalSearch;
import vo.AnimalSearchDAO;

public class SearchAListAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalSearchDAO dao = new AnimalSearchDAO();
		int attribute = 0;
		int now = 0;
		ArrayList<AnimalSearch> aSearchList = dao.listSearch(attribute,now);
		
		
		if(aSearchList.size()==0) {
			aSearchList=null;
		}
		
		request.setAttribute("now", now);
		request.setAttribute("attri", attribute);
		request.setAttribute("SearchList", aSearchList);
		ActionForward af = new ActionForward("/search/animalSearch.jsp",false);
		return af;
	}
}
