package com.xnjr.base.api.impl;

import com.xnjr.base.ao.ISYSDictAO;
import com.xnjr.base.api.AProcessor;
import com.xnjr.base.common.JsonUtil;
import com.xnjr.base.core.StringValidater;
import com.xnjr.base.dto.req.XN809000Req;
import com.xnjr.base.dto.res.PKIdRes;
import com.xnjr.base.exception.BizException;
import com.xnjr.base.exception.ParaException;
import com.xnjr.base.spring.SpringContextHolder;

/**
 * 新增数据字典
 * @author: xieyj 
 * @since: 2016年9月17日 下午1:45:23 
 * @history:
 */
public class XN809000 extends AProcessor {
    private ISYSDictAO sysDictAO = SpringContextHolder
        .getBean(ISYSDictAO.class);

    private XN809000Req req = null;

    /** 
     * @see com.xnjr.base.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        return new PKIdRes(sysDictAO.addSYSDict(req.getType(),
            req.getParentKey(), req.getDkey(), req.getDvalue(),
            req.getUpdater(), req.getRemark()));
    }

    /** 
     * @see com.xnjr.base.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN809000Req.class);
        StringValidater.validateBlank(req.getType(), req.getDkey(),
            req.getDvalue(), req.getUpdater());
    }
}
