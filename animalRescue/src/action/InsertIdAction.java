package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Member;
import vo.MemberDAO;

public class InsertIdAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String idnumber1 = request.getParameter("idnumber1");
		String idnumber2 = request.getParameter("idnumber2");
		String idnumber3 = idnumber1+idnumber2;
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String age = request.getParameter("age");
		
		int admin = 0;
		int age1 = 0;
		
		try {
			age1 = Integer.parseInt(age);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Member member = null;
		member = new Member(id, idnumber3, pass, name, phone, age1, admin);
		
		MemberDAO dao = new MemberDAO();
		dao.insertMember(member);
		
		request.setAttribute("id", id);
		
		ActionForward af = new ActionForward("member_reg/mem_registerSuccess.jsp", false);
		return af;
	}

}
