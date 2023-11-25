package action;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import vo.ActionForward;
import vo.AnimalSearch;
import vo.AnimalSearchDAO;

public class SearchModifySuccessAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ServletContext ctx=request.getServletContext();
		String saveFolder="/img";
		String realPath=ctx.getRealPath(saveFolder);
		int size=5 * 1024 * 1024;//5MB -한번에 업로드하는 파일크기
		String encType="UTF-8";
		
		MultipartRequest multi=
				new MultipartRequest(request, realPath, size, encType, new DefaultFileRenamePolicy());
		
		
		AnimalSearchDAO dao = new AnimalSearchDAO();
		int no = Integer.parseInt(multi.getParameter("ani_no"));
		String subject = multi.getParameter("ani_subject");
		String content =multi.getParameter("ani_content");
		String area = multi.getParameter("ani_area");
		String d = multi.getParameter("ani_date1")+"-"+multi.getParameter("ani_date2")+"-"+multi.getParameter("ani_date3");
		Date date = java.sql.Date.valueOf(d);
		String kind = multi.getParameter("ani_kind");
		String image = multi.getFilesystemName("ani_image");
		if(image==null) {
			image=multi.getParameter("ani_image_origin");
		}
		String name = multi.getParameter("ani_name");
		String tel = multi.getParameter("ani_tel");
		String id = multi.getParameter("ani_id");
		int attribute = Integer.parseInt(multi.getParameter("ani_attribute"));
		System.out.println(attribute);
		int now = Integer.parseInt(multi.getParameter("ani_now"));
		AnimalSearch as = new AnimalSearch(no,subject,content,area,date,kind,image,name,tel,id,attribute,now);
		dao.updateAni(as);
		if(now==1) {
			ArrayList<AnimalSearch> SearchList = dao.listSearch(now);
			if(SearchList.size()==0) {
				SearchList=null;
			}
			request.setAttribute("attri", attribute);
			request.setAttribute("SearchList", SearchList);
		}else if(now==0){
			ArrayList<AnimalSearch> SearchList = dao.listSearch(attribute,now);
			if(SearchList.size()==0) {
				SearchList=null;
			}
			request.setAttribute("attri", attribute);
			request.setAttribute("SearchList", SearchList);
		}
		ActionForward af = new ActionForward("/search/animalSearch.jsp",false);
		return af;
		
		
		
	}

}
