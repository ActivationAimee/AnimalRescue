package action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalSearch;
import vo.AnimalSearchDAO;

public class SearchModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalSearchDAO dao = new AnimalSearchDAO();
		int no = Integer.parseInt(request.getParameter("ani_no"));
		AnimalSearch as = dao.viewSearch(no);
		SimpleDateFormat tf = new SimpleDateFormat("yyyy-MM-dd");
		String date = tf.format(as.getAni_date());
		System.out.println(date);
		String date1 = date.substring(0, 4);
		System.out.println(date1);
		String date2 = date.substring(5, 7);
		System.out.println(date2);
		String date3 = date.substring(8);
		System.out.println(date3);
		request.setAttribute("as", as);
		request.setAttribute("date1", date1);
		request.setAttribute("date2", date2);
		request.setAttribute("date3", date3);
		ActionForward af = new ActionForward("search/aniModify.jsp", false);
		return af;
	}

}
