package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalDAO;
import vo.Animal_adopt;

public class Animal_adoptModify implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalDAO dao = new AnimalDAO();
		ActionForward af = null;
		Animal_adopt aa = new Animal_adopt();

		aa.setAni_no(Integer.parseInt(request.getParameter("ani_no")));
		aa.setAni_name(request.getParameter("ani_name"));
		aa.setAni_subject(request.getParameter("ani_subject"));
		aa.setAni_tel(request.getParameter("ani_tel"));
		aa.setAni_pass(request.getParameter("ani_pass"));
		aa.setAni_content(request.getParameter("ani_content"));
		aa.setAni_date(request.getParameter("ani_date"));

		int a = dao.animal_adoptUpdate(aa);
		if (a > 0) {
			af = new ActionForward("adopt/adopt_success.jsp", false);
		} else {
			request.setAttribute("error", "修正に失敗しました。もう一度入力してください。");
			request.setAttribute("aa", aa);
			request.setAttribute("ani_no", aa.getAni_no());
			af = new ActionForward("adopt/adopt_modifyForm.jsp", false);
		}
		return af;
	}
}
