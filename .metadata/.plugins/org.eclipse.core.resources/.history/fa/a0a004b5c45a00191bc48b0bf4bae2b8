package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalDAO;
import vo.Animal_adopt;

public class Animal_adoptWrite implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalDAO dao = new AnimalDAO();
		Animal_adopt aa = new Animal_adopt();
		ActionForward af = null;
		
		int no =dao.Animal_adoptNumber();
		
		aa.setAni_no(no);
		aa.setAni_name(request.getParameter("ani_name"));
		aa.setAni_subject(request.getParameter("ani_subject"));
		aa.setAni_tel(request.getParameter("ani_tel"));
		aa.setAni_pass(request.getParameter("ani_pass"));
		aa.setAni_content(request.getParameter("ani_content"));
		aa.setAni_date(request.getParameter("ani_date"));
		aa.setAni_w(Integer.parseInt(request.getParameter("ani_w")));
		
		int test = dao.animal_adoptInsert(aa);
		if(test>0) {
			af = new ActionForward("adopt/adopt_success.jsp", false);
		} else {
			request.setAttribute("error", "登録に失敗しました。もう一度入力してください。");
			request.setAttribute("ani_w", aa.getAni_w());
			af = new ActionForward("adopt/adopt_writeForm.jsp",false);
		}
		return af;
	}
}
