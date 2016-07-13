/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;

/**
 *
 * @author Ricardo
 */
public class LoginInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        Map session = ai.getInvocationContext().getSession();
        Object action = ai.getAction();
        //if()
        return "not completed";
    }

    
}
