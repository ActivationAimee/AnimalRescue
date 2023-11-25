package action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import vo.ActionForward;
import vo.Support;
import vo.SupportDAO;

public class SupportModifySuccessAction implements Action{
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
		
		
		sp.setSnum(Integer.parseInt(multi.getParameter("snum")));
		sp.setId(multi.getParameter("id"));
		sp.setName(multi.getParameter("name"));
		sp.setSubject(multi.getParameter("subject"));
		sp.setContent(multi.getParameter("content"));
		sp.setAccount(multi.getParameter("account"));
		sp.setMoney(Integer.parseInt(multi.getParameter("money")));
		sp.setImage(multi.getFilesystemName("image"));
		sp.setPhone(multi.getParameter("phone"));
		
		dao.SupportUpdate(sp);
		
		ActionForward af = new ActionForward("support/supportboard.jsp", false);
		return af;
	}
}