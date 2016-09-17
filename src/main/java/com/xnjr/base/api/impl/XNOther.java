package com.xnjr.base.api.impl;

import com.xnjr.base.api.AProcessor;
import com.xnjr.base.exception.BizException;
import com.xnjr.base.exception.ParaException;

public class XNOther extends AProcessor {

    @Override
    public Object doBusiness() throws BizException {
        throw new BizException("702xxx", "无效API功能号");
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        throw new ParaException("702xxx", "无效API功能号");

    }

}
