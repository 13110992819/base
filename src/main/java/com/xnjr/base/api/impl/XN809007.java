package com.xnjr.base.api.impl;

import com.xnjr.base.ao.ISYSDictAO;
import com.xnjr.base.api.AProcessor;
import com.xnjr.base.common.JsonUtil;
import com.xnjr.base.core.StringValidater;
import com.xnjr.base.dto.req.XN809007Req;
import com.xnjr.base.exception.BizException;
import com.xnjr.base.exception.ParaException;
import com.xnjr.base.spring.SpringContextHolder;

/**
 * 详情查询数据字典
 * @author: xieyj 
 * @since: 2016年9月17日 下午1:50:23 
 * @history:
 */
public class XN809007 extends AProcessor {
    private ISYSDictAO sysDictAO = SpringContextHolder
        .getBean(ISYSDictAO.class);

    private XN809007Req req = null;

    /** 
     * @see com.xnjr.base.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        return sysDictAO.getSYSDict(StringValidater.toLong(req.getId()));
    }

    /** 
     * @see com.xnjr.base.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN809007Req.class);
        StringValidater.validateBlank(req.getId());
    }
}
