package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalDAO;

public class Animal_adoptDeleteForm implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalDAO dao = new AnimalDAO();
		ActionForward af = null;
		String id = request.getParameter("id");
		int ani_no = Integer.parseInt(request.getParameter("ani_no"));
		System.out.println(id+"asdd"+ani_no);
		if (id.equals("admin")) {
			dao.animal_adoptDelete(ani_no);
			af = new ActionForward("adopt/adopt_success.jsp", false);
		} else {
			request.setAttribute("ani_no", ani_no);
			af = new ActionForward("adopt/adopt_deleteForm.jsp", false);
		}
		return af;

	}
}
