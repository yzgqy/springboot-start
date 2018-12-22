package com.gqy.springbootstart.exception;

import com.gqy.springbootstart.entity.common.JSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class MyExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public JSONResult defaultErrorHandler(HttpServletRequest req,
                                          Exception e) throws Exception {

        e.printStackTrace();
        return JSONResult.errorException(e.getMessage());
    }


//    下面是结合了页面出错和ajax出错的解决办法

//    public static final String IMOOC_ERROR_VIEW = "error";

//    @ExceptionHandler(value = Exception.class)
//    public Object errorHandler(HttpServletRequest reqest,
//                               HttpServletResponse response, Exception e) throws Exception {
//
//        e.printStackTrace();
//
//        if (isAjax(reqest)) {
//            return JSONResult.errorException(e.getMessage());
//        } else {
//            ModelAndView mav = new ModelAndView();
//            mav.addObject("exception", e);
//            mav.addObject("url", reqest.getRequestURL());
//            mav.setViewName(IMOOC_ERROR_VIEW);
//            return mav;
//        }
//    }

    /**
     * @Description: 判断是否是ajax请求
     */
    public static boolean isAjax(HttpServletRequest httpRequest){
        return  (httpRequest.getHeader("X-Requested-With") != null
                && "XMLHttpRequest"
                .equals( httpRequest.getHeader("X-Requested-With").toString()) );
    }
}
