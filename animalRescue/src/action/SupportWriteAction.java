package action;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import vo.ActionForward;
import vo.Support;
import vo.SupportDAO;

public class SupportWriteAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SupportDAO dao = new SupportDAO();
		Support sp = new Support();
		ServletContext ctx=request.getServletContext();
		String saveFolder="/img";
		String realPath=ctx.getRealPath(saveFolder);
		int size=5 * 1024 * 1024;//5MB -한번에 업로드하는 파일크기
		String encType="UTF-8";
		
		MultipartRequest multi=
				new MultipartRequest(request, realPath, size, encType, new DefaultFileRenamePolicy());

		System.out.println(multi.getParameter("M_id"));
		System.out.println(multi.getParameter("M_name"));
		int snum = dao.SupportNumber();
		snum++;
		System.out.println(multi.getParameter("money"));
		sp.setSnum(snum);
		sp.setId(multi.getParameter("M_id"));
		sp.setName(multi.getParameter("M_name"));
		sp.setSubject(multi.getParameter("subject"));
		sp.setContent(multi.getParameter("content"));
		sp.setAccount(multi.getParameter("account"));
		sp.setMoney(Integer.parseInt(multi.getParameter("money")));
		sp.setImage(multi.getFilesystemName("image"));
		sp.setPhone(multi.getParameter("phone"));
		
		dao.SupportInsert(sp);
		
		int pagecount = 10;
		int content = 0;
		int[] page = null;
		int blockstartnum = 0;
		int blocklastnum = 0;
		int curpage = 1;
		
		content = dao.serchContent();
		if(content%pagecount == 0) {
			page = new int[content/pagecount];
		}else {
			page = new int[(content/pagecount)+1];
		}
		

		blockstartnum = (pagecount * (curpage-1)) + 1;
		blocklastnum = blockstartnum + (pagecount-1);
		
		System.out.println(blockstartnum);
		System.out.println(blocklastnum);
		
		ArrayList<Support> list = null;
		list = dao.selectSupportList(blockstartnum, blocklastnum);
		for(int x=0; x<list.size(); x++) {
			System.out.println(list.get(x));
		}
		if(list.size()==0) {
			list = null;
		}
		request.setAttribute("page", page);
		request.setAttribute("list", list);
		
		ActionForward af = new ActionForward("support/supportboard.jsp", false);
		return af;
	}
}
