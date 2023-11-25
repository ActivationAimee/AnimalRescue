package action;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;
import vo.AnimalSearch;
import vo.AnimalSearchDAO;

public class SearchSearchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		AnimalSearchDAO dao = new AnimalSearchDAO();
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		String today = year+"-"+month+"-"+day;
		ArrayList<AnimalSearch> list = new ArrayList<AnimalSearch>();
		String s = request.getParameter("s_date");
		System.out.println(s);
		String e = request.getParameter("e_date");
		System.out.println(e);
		Date sdate = null;
		Date edate = null;
		int now = 0;
		
		if(s.length()!=0&&e.length()!=0) {
			sdate = java.sql.Date.valueOf(s);
			edate = java.sql.Date.valueOf(e);
		}else if(s.length()!=0&&e==null) {
			e = today;
		}
		String area = request.getParameter("area");
		String kind = request.getParameter("kind");
		int attri = Integer.parseInt(request.getParameter("attribute"));
		
		if(sdate==null&&edate==null&&area.length()==0&&kind.length()==0){
			list = dao.listSearch(attri,now);
		}else if(sdate==null&&edate==null&&area.length()==0) {
			list = dao.selectKind(kind,attri,now);
		}else if(sdate==null&&edate==null&&kind.length()==0) {
			list = dao.selectArea(area,attri,now);
		}else if(area.length()==0&&kind.length()==0) {
			list = dao.selectPeriod(sdate, edate,attri,now);
		}else if(sdate==null&&edate==null) {
			list = dao.selectAreaKind(area, kind,attri,now);
		}else if(area.length()==0) {
			list = dao.selectPeriKind(sdate, edate, kind,attri,now);
		}else if(kind.length()==0) {
			list = dao.selectPeriArea(sdate, edate, area,attri,now);
		}else {
			list = dao.selectAll(sdate, edate, area, kind,attri,now);
		}
		
		if(list.size()==0) {
			list=null;
		}
		request.setAttribute("now", now);
		request.setAttribute("attri", attri);
		request.setAttribute("SearchList", list);
		ActionForward af = new ActionForward("search/animalSearch.jsp", false);
		return af;
	}

}
