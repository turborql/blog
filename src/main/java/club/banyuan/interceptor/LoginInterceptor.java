package club.banyuan.interceptor;

import club.banyuan.bean.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        // 如果用户已经登录了，就会在Session中以"CURRENT_USER"属性保存当前用户对应的User对象
        User user = (User) request.getSession().getAttribute("CURRENT_USER");
        if (user != null) {
            request.setAttribute("user", user);
            return true;
        }

        response.sendRedirect("/login?next=".concat(request.getRequestURI()));
        return false;
    }
}
