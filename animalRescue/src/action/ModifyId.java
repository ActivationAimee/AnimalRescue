package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.ActionForward;
import vo.Member;
import vo.MemberDAO;

public class ModifyId implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String age = request.getParameter("age");
		
		int age1 = 0;
		
		try {
			age1 = Integer.parseInt(age);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		MemberDAO dao = new MemberDAO();
		Member member = new Member(id,pwd,name,phone,age1);
		dao.updateMember(member);
		
		HttpSession session = request.getSession();
		session.setAttribute("member", member);
		ActionForward af = new ActionForward("member_login/mypage.jsp", false);
		return af;
	}

}
