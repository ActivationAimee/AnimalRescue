package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Hospital;
import vo.HospitalDAO;

public class HospitalModifySuccessAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name"); 
		String area = request.getParameter("area");
		String adress = request.getParameter("adress");
		String open = request.getParameter("open");
		String tel = request.getParameter("tel");
		String content = request.getParameter("content");
		String maplat = request.getParameter("maplat");
		String maplng = request.getParameter("maplng");
		String str = request.getParameter("num");
		
		double maplat1 = Double.parseDouble(maplat);
		double maplng1 = Double.parseDouble(maplng);
		
		int num = 0;
		
		try {
			num = Integer.parseInt(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		HospitalDAO dao = new HospitalDAO();
		
		dao.updateHospital(area, name, tel, adress, open, maplat1, maplng1, content, num);
		
		Hospital hp = new Hospital();
		hp = dao.selectHospitalNum(num);
		
		request.setAttribute("hpList", hp);
		ActionForward af = new ActionForward("Hospital/hospitalClickBoard.jsp", false);
		return af;
	}

}
