package com.xnjr.base.api.impl;

import com.xnjr.base.ao.ISYSDictAO;
import com.xnjr.base.api.AProcessor;
import com.xnjr.base.common.JsonUtil;
import com.xnjr.base.core.StringValidater;
import com.xnjr.base.dto.req.XN809002Req;
import com.xnjr.base.dto.res.BooleanRes;
import com.xnjr.base.exception.BizException;
import com.xnjr.base.exception.ParaException;
import com.xnjr.base.spring.SpringContextHolder;

/**
 * 修改数据字典
 * @author: xieyj 
 * @since: 2016年9月17日 下午1:48:11 
 * @history:
 */
public class XN809002 extends AProcessor {
    private ISYSDictAO sysDictAO = SpringContextHolder
        .getBean(ISYSDictAO.class);

    private XN809002Req req = null;

    /** 
     * @see com.xnjr.base.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        sysDictAO.editSYSDict(StringValidater.toLong(req.getId()),
            req.getDvalue(), req.getUpdater(), req.getRemark());
        return new BooleanRes(true);
    }

    /** 
     * @see com.xnjr.base.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN809002Req.class);
        StringValidater.validateBlank(req.getId(), req.getDvalue());
    }
}
