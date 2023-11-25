package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalSearch;
import vo.AnimalSearchDAO;

public class SearchHListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalSearchDAO dao = new AnimalSearchDAO();
		int attribute = 1;
		int now = 0;
		ArrayList<AnimalSearch> hSearchList = dao.listSearch(attribute,now);
		
		if(hSearchList.size()==0) {
			hSearchList=null;
		}
		
		request.setAttribute("now", now);
		request.setAttribute("attri", attribute);
		request.setAttribute("SearchList", hSearchList);
		ActionForward af = new ActionForward("/search/animalSearch.jsp",false);
		return af;
	}

}
