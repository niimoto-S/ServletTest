package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.InfoBean;

/**
 * Servlet implementation class InfoServlet
 */
@WebServlet("/servlet/infoServlet")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/contact.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		try {
			if(request.getParameterValues("mailKind")[0].equals("")) {
			}
		} catch (Exception e) {
			request.setAttribute("nullpo", "ぬるぽ");
		}

		InfoBean infoBean = new InfoBean(
				request.getParameter("name"),
				request.getParameter("company"),
				request.getParameter("mailAddress"),
				request.getParameter("info"),
				request.getParameterValues("mailKind"),
				request.getParameter("radio")
				);

		request.setAttribute("infoBean", infoBean);

		request.getRequestDispatcher("/jsp/result.jsp").forward(request, response);
	}

}