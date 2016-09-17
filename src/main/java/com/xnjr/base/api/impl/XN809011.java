package com.xnjr.base.api.impl;

import com.xnjr.base.ao.ISYSConfigAO;
import com.xnjr.base.api.AProcessor;
import com.xnjr.base.common.JsonUtil;
import com.xnjr.base.core.StringValidater;
import com.xnjr.base.domain.SYSConfig;
import com.xnjr.base.dto.req.XN809011Req;
import com.xnjr.base.dto.res.BooleanRes;
import com.xnjr.base.exception.BizException;
import com.xnjr.base.exception.ParaException;
import com.xnjr.base.spring.SpringContextHolder;

/**
 * 修改系统参数
 * @author: xieyj 
 * @since: 2016年9月17日 下午1:54:21 
 * @history:
 */
public class XN809011 extends AProcessor {
    private ISYSConfigAO sysConfigAO = SpringContextHolder
        .getBean(ISYSConfigAO.class);

    private XN809011Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        SYSConfig data = new SYSConfig();
        data.setId(req.getId());
        data.setCvalue(req.getCvalue());
        data.setNote(req.getNote());
        data.setUpdater(req.getUpdater());
        data.setRemark(req.getRemark());
        sysConfigAO.editSYSConfig(data);
        return new BooleanRes(true);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN809011Req.class);
        StringValidater.validateBlank(req.getCvalue(), req.getNote(),
            req.getUpdater());

    }

}
