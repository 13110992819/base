package com.xnjr.base.api.impl;

import com.xnjr.base.ao.ISYSConfigAO;
import com.xnjr.base.api.AProcessor;
import com.xnjr.base.common.JsonUtil;
import com.xnjr.base.core.StringValidater;
import com.xnjr.base.dto.req.XNlh5033Req;
import com.xnjr.base.exception.BizException;
import com.xnjr.base.exception.ParaException;
import com.xnjr.base.spring.SpringContextHolder;

/**
 * 详情查询系统参数
 * @author: xieyj 
 * @since: 2016年9月17日 下午1:55:26 
 * @history:
 */
public class XN809016 extends AProcessor {
    private ISYSConfigAO sysConfigAO = SpringContextHolder
        .getBean(ISYSConfigAO.class);

    private XNlh5033Req req = null;

    /** 
     * @see com.xnjr.base.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        return sysConfigAO.getSYSConfig(StringValidater.toLong(req.getId()));
    }

    /** 
     * @see com.xnjr.base.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XNlh5033Req.class);
        StringValidater.validateBlank(req.getId());
    }

}
