package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.Protect;
import vo.ProtectDAO;

public class ProtectModifySuccessAction implements Action {

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
		ProtectDAO dao = new ProtectDAO();
		
		dao.updateProtect(area, name, tel, adress, open, maplat1, maplng1, content, num);
		
		Protect pt = new Protect();
		pt = dao.selectProtectNum(num);
		
		request.setAttribute("ptList", pt);
		ActionForward af = new ActionForward("Protect/protectClickBoard.jsp", false);
		
		return af;
	}

}
