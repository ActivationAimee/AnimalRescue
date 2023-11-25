package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Hospital;
import vo.HospitalDAO;

public class HospitalModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String str = request.getParameter("num");
		int num = 0;
		
		try {
			num = Integer.parseInt(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Hospital hp = new Hospital();
		HospitalDAO dao = new HospitalDAO();
		hp = dao.selectHospitalNum(num);
		
		request.setAttribute("hpList", hp);
		
		ActionForward af = new ActionForward("Hospital/hospitalModify.jsp", false);
		
		return af;
	}

}
