package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Member;
import vo.MemberDAO;

public class ListUserAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int pagecount = 5;
		int content = 0;
		int[] page = null;
		int blockstartnum = 0;
		int blocklastnum = 0;
		
		MemberDAO dao = new MemberDAO();
		content = dao.serchContent();
		
		if(content%pagecount == 0) {
			page = new int[content/pagecount];
		}else {
			page = new int[(content/pagecount)+1];
		}
		
		int curpage = 1;
		
		blockstartnum = (pagecount * (curpage-1)) + 1;
		blocklastnum = blockstartnum + (pagecount-1);
		
		ArrayList<Member> list = dao.selectAllMember(blockstartnum, blocklastnum);
		
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		
		ActionForward af = new ActionForward("member_login/mem_listUser.jsp", false);
		
		return af;
	}

}
