package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalDAO;
import vo.Animal_adopt;

public class Animal_adoptList implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int pagecount = 10;
		int content = 0;
		int[] page = null;
		int blockstartnum = 0;
		int blocklastnum = 0;
		
		AnimalDAO dao = new AnimalDAO();
		content = dao.serchContent();
		
		if(content%pagecount == 0) {
			page = new int[content/pagecount];
		}else {
			page = new int[(content/pagecount)+1];
		}
		
		int curpage = 1;
		
		blockstartnum = (pagecount * (curpage-1)) + 1;
		blocklastnum = blockstartnum + (pagecount-1);
		
		ArrayList<Animal_adopt> list = dao.selectanimal_adoptList(blockstartnum, blocklastnum);
		if(list.size()==0) {
			list = null;
		}
		request.setAttribute("page", page);
		request.setAttribute("s_list", list);
		String url = "adopt/adopt_list.jsp";
		ActionForward af = new ActionForward(url, false);
		return af;
	}
}
