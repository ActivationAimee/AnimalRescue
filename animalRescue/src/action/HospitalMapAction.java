package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Hospital;
import vo.HospitalDAO;

public class HospitalMapAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HospitalDAO dao = new HospitalDAO();
		ArrayList<Hospital> list = new ArrayList<Hospital>();
		
		list = dao.selectAllHospital();
		
		request.setAttribute("list", list);
		
		ActionForward af = new ActionForward("Hospital/hospitalMap.jsp", false);
		return af;
	}

}
