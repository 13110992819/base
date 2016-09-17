package com.xnjr.base.api.impl;

import com.xnjr.base.ao.ISYSConfigAO;
import com.xnjr.base.api.AProcessor;
import com.xnjr.base.common.JsonUtil;
import com.xnjr.base.core.StringValidater;
import com.xnjr.base.domain.SYSConfig;
import com.xnjr.base.dto.req.XN809010Req;
import com.xnjr.base.dto.res.PKIdRes;
import com.xnjr.base.exception.BizException;
import com.xnjr.base.exception.ParaException;
import com.xnjr.base.spring.SpringContextHolder;

/**
 * 新增系统参数
 * @author: xieyj 
 * @since: 2016年9月17日 下午1:51:37 
 * @history:
 */
public class XN809010 extends AProcessor {

    private ISYSConfigAO sysConfigAO = SpringContextHolder
        .getBean(ISYSConfigAO.class);

    private XN809010Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        SYSConfig data = new SYSConfig();
        data.setToSystem("8");// 8 代表生意家 作为服务时启用该字段
        data.setCkey(req.getCkey());
        data.setCvalue(req.getCvalue());
        data.setNote(req.getNote());
        data.setUpdater(req.getUpdater());
        data.setRemark(req.getRemark());
        return new PKIdRes(sysConfigAO.addSYSConfig(data));
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN809010Req.class);
        StringValidater.validateBlank(req.getCkey(), req.getCvalue(),
            req.getNote(), req.getUpdater());

    }

}
