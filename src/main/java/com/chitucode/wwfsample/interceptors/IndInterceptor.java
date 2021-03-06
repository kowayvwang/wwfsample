package com.chitucode.wwfsample.interceptors;

import com.chitucode.wwf.action.ActionResult;
import com.chitucode.wwf.context.BeatContext;
import com.chitucode.wwf.interceptor.WWFInterceptor;

/**
 * Created by kowaywang on 17/5/10.
 */
public class IndInterceptor implements WWFInterceptor {

    @Override
    public ActionResult before(BeatContext beatContext) {
        System.out.println("before 11111");
        //ActionResult.NULL 实际上就是null
        return ActionResult.NULL;
    }

    @Override
    public ActionResult after(BeatContext beatContext, ActionResult actionResult) {
        return ActionResult.NULL;
    }

    @Override
    public ActionResult complete(BeatContext beatContext, ActionResult actionResult) {
        return ActionResult.NULL;
    }
}
