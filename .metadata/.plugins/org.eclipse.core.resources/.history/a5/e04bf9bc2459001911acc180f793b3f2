package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalDAO;
import vo.AnimalSearch;
import vo.Animal_adopt;

public class Animal_adoptSelect implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalSearch as = new AnimalSearch();
		AnimalDAO dao = new AnimalDAO();
		ActionForward af = null;
	
		int no = Integer.parseInt(request.getParameter("ani_no"));
		Animal_adopt aa = dao.adoptSelect(no);
		as = dao.animal_adoptImg(aa.getAni_w());
		String img = as.getAni_image();
		String kind = as.getAni_kind();
	
		request.setAttribute("aa", aa);
		request.setAttribute("img", img);
		request.setAttribute("kind", kind);
		String url = "adopt/adopt_select.jsp";
		
		af = new ActionForward(url,false);
		
		return af;
	}
}
