package com.xnjr.base.api.impl;

import org.apache.commons.lang3.StringUtils;

import com.xnjr.base.ao.ISYSConfigAO;
import com.xnjr.base.api.AProcessor;
import com.xnjr.base.common.JsonUtil;
import com.xnjr.base.core.StringValidater;
import com.xnjr.base.domain.SYSConfig;
import com.xnjr.base.dto.req.XN809015Req;
import com.xnjr.base.exception.BizException;
import com.xnjr.base.exception.ParaException;
import com.xnjr.base.spring.SpringContextHolder;

/**
 * 分页查询系统参数
 * @author: xieyj 
 * @since: 2016年9月17日 下午1:55:07 
 * @history:
 */
public class XN809015 extends AProcessor {
    private ISYSConfigAO sysConfigAO = SpringContextHolder
        .getBean(ISYSConfigAO.class);

    private XN809015Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        SYSConfig data = new SYSConfig();
        data.setCkeyForQuery(req.getCkey());
        String orderColumn = req.getOrderColumn();
        if (StringUtils.isBlank(orderColumn)) {
            orderColumn = ISYSConfigAO.DEFAULT_ORDER_COLUMN;
        }
        data.setOrder(orderColumn, req.getOrderDir());
        int start = StringValidater.toInteger(req.getStart());
        int limit = StringValidater.toInteger(req.getLimit());
        return sysConfigAO.querySYSConfigPage(start, limit, data);
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN809015Req.class);
        StringValidater.validateBlank(req.getStart(), req.getLimit());
    }

}
