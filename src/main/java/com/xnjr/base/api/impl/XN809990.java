package com.xnjr.base.api.impl;

import java.util.Date;

import com.xnjr.base.api.AProcessor;
import com.xnjr.base.exception.BizException;
import com.xnjr.base.exception.ParaException;

/**
 * 获取服务器时间
 * @author: myb858 
 * @since: 2015年11月26日 下午5:18:23 
 * @history:
 */
public class XN809990 extends AProcessor {

    @Override
    public Object doBusiness() throws BizException {
        return new Date();
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
    }
}
