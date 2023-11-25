package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Support;
import vo.SupportDAO;

public class SupportListAction implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SupportDAO dao = new SupportDAO();
		
		int pagecount = 10;
		int content = 0;
		int[] page = null;
		int blockstartnum = 0;
		int blocklastnum = 0;
		int curpage = 1;
		
		content = dao.serchContent();
		if(content%pagecount == 0) {
			page = new int[content/pagecount];
		}else {
			page = new int[(content/pagecount)+1];
		}
		

		blockstartnum = (pagecount * (curpage-1)) + 1;
		blocklastnum = blockstartnum + (pagecount-1);
		
		System.out.println(blockstartnum);
		System.out.println(blocklastnum);
		
		ArrayList<Support> list = null;
		list = dao.selectSupportList(blockstartnum, blocklastnum);
		for(int x=0; x<list.size(); x++) {
			System.out.println(list.get(x));
		}
		if(list.size()==0) {
			list = null;
		}
		request.setAttribute("page", page);
		request.setAttribute("list", list);
		ActionForward af = new ActionForward("support/supportboard.jsp", false);
		return af;
	}
}
