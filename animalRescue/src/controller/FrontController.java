package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.Animal_adoptDelete;
import action.Animal_adoptDeleteForm;
import action.Animal_adoptList;
import action.Animal_adoptModify;
import action.Animal_adoptModifyCheck;
import action.Animal_adoptSelect;
import action.Animal_adoptWrite;
import action.Animal_adoptWriteForm;
import action.Animal_adoptsuccess;
import action.DeleteFormAction;
import action.DeleteId;
import action.DeleteUserAction;
import action.HospitalClickAction;
import action.HospitalDeleteAction;
import action.HospitalListAction;
import action.HospitalMapAction;
import action.HospitalModifyAction;
import action.HospitalModifySuccessAction;
import action.HospitalSerchAction;
import action.HospitalWriteAction;
import action.IdCheckAction;
import action.IdSearchAction;
import action.InsertIdAction;
import action.ListUserAction;
import action.LoginIdAction;
import action.LogoutIdAction;
import action.ModifyId;
import action.PassSearchAction;
import action.ProtectClickAction;
import action.ProtectDeleteAction;
import action.ProtectListAction;
import action.ProtectMapAction;
import action.ProtectModifyAction;
import action.ProtectModifySuccessAction;
import action.ProtectSearchAction;
import action.ProtectWriteAction;
import action.SearchAListAction;
import action.SearchCListAction;
import action.SearchDeleteAction;
import action.SearchHListAction;
import action.SearchListAction;
import action.SearchModifyAction;
import action.SearchModifySuccessAction;
import action.SearchSearchAction;
import action.SearchViewAction;
import action.SearchWriteAction;
import action.SupportDeleteAction;
import action.SupportListAction;
import action.SupportModifyAction;
import action.SupportModifySuccessAction;
import action.SupportViewAction;
import action.SupportWriteAction;
import vo.ActionForward;

@WebServlet("*.anires")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String requestURI = request.getRequestURI();
		ServletContext ctx = request.getServletContext();
		String contextPath = ctx.getContextPath();
		
		String command = requestURI.substring(contextPath.length());
		System.out.println(command);
		Action action = null;
		ActionForward af = null;
		
		
		if(command.equals("/SearchList.anires")) {
			action = new SearchListAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/aSearchList.anires")) {
			action = new SearchAListAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/hSearchList.anires")) {
			action = new SearchHListAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/cSearchList.anires")) {
			action = new SearchCListAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/searchWrite.anires")) {
			action = new SearchWriteAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/searchDelete.anires")) {
			action = new SearchDeleteAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/searchModify.anires")) {
			action = new SearchModifyAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/searchModifySuccess.anires")) {
			action = new SearchModifySuccessAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/searchView.anires")) {
			action = new SearchViewAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/searchSearch.anires")) {
			action = new SearchSearchAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/list.anires")) { 
			action = new HospitalListAction(); 
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/click.anires")) {
			action = new HospitalClickAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/search.anires")) {
			action = new HospitalSerchAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/write.anires")) {
			action = new HospitalWriteAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/modify.anires")) {
			action = new HospitalModifyAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/modifySuccess.anires")) {
			action = new HospitalModifySuccessAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/delete.anires")) {
			action = new HospitalDeleteAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/protectList.anires")) {
			action = new ProtectListAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/protectClick.anires")) {
			action = new ProtectClickAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/protectSearch.anires")) {
			action = new ProtectSearchAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/protectWrite.anires")) {
			action = new ProtectWriteAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/protectModify.anires")) {
			action = new ProtectModifyAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/protectModifySuccess.anires")) {
			action = new ProtectModifySuccessAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/protectDelete.anires")) {
			action = new ProtectDeleteAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("/adopt_list.anires")) {
			action = new Animal_adoptList();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/adopt_writeForm.anires")) {
			action = new Animal_adoptWriteForm();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/adopt_write.anires")) {
			action = new Animal_adoptWrite();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/adopt_success.anires")) {
			action = new Animal_adoptsuccess();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/adopt_select.anires")) {
			action = new Animal_adoptSelect();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/adopt_modify.anires")) {
			action = new Animal_adoptModify();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("/adopt_modifycheck.anires")) {
			action = new Animal_adoptModifyCheck();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}  else if (command.equals("/adopt_delete.anires")) {
			action = new Animal_adoptDelete();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/adopt_deleteForm.anires")) {
			action = new Animal_adoptDeleteForm();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/idCheck.anires")) {
			action = new IdCheckAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/insertId.anires")) {
			action = new InsertIdAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/loginId.anires")) {
			action = new LoginIdAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/logOutId.anires")) {
			action = new LogoutIdAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/modifyId.anires")) {
			action = new ModifyId();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/deleteId.anires")) {
			action = new DeleteId();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/idSearch.anires")) {
			action = new IdSearchAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/passSearch.anires")) {
			action = new PassSearchAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/supportboard.anires")) {
			action = new SupportListAction();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("/supportWrite.anires")) {
			action = new SupportWriteAction();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}  else if(command.equals("/supportView.anires")) {
			action = new SupportViewAction();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("/supportModify.anires")) {
			action = new SupportModifyAction();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("/supportDelete.anires")) {
			action = new SupportDeleteAction();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("/supportModifySuccess.anires")) {
			action = new SupportModifySuccessAction();
			try {
				af = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("/hospitalMap.anires")) {
			action = new HospitalMapAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/protectMap.anires")) {
			action = new ProtectMapAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/deleteUser.anires")) {
			action = new DeleteUserAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/listUser.anires")) {
			action = new ListUserAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/deleteForm.anires")) {
			action = new DeleteFormAction();
			try {
				af = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(af!=null) {
			if(af.isRedirect()) {
				response.sendRedirect(af.getPath());
			}else {
				RequestDispatcher rdp = request.getRequestDispatcher(af.getPath());
				rdp.forward(request, response);
			}
		}
	}
}
