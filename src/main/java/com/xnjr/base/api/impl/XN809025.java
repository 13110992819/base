package com.xnjr.base.api.impl;

import org.apache.commons.lang3.StringUtils;

import com.xnjr.base.ao.ISYSLogAO;
import com.xnjr.base.api.AProcessor;
import com.xnjr.base.common.DateUtil;
import com.xnjr.base.common.JsonUtil;
import com.xnjr.base.core.StringValidater;
import com.xnjr.base.domain.SYSLog;
import com.xnjr.base.dto.req.XN809025Req;
import com.xnjr.base.exception.BizException;
import com.xnjr.base.exception.ParaException;
import com.xnjr.base.spring.SpringContextHolder;

/**
 * 分页查询操作日志
 * @author: xieyj 
 * @since: 2016年9月17日 下午1:44:27 
 * @history:
 */
public class XN809025 extends AProcessor {
    private ISYSLogAO sysLogAO = SpringContextHolder.getBean(ISYSLogAO.class);

    XN809025Req req = null;

    /** 
     * @see com.xnjr.base.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        SYSLog condition = new SYSLog();
        condition.setToTable(req.getToTable());
        condition.setOperater(req.getOperater());
        condition.setOperateType(req.getOperateType());
        condition.setOperateDatetimeStart(DateUtil.getFrontDate(
            req.getDateStart(), false));
        condition.setOperateDatetimeEnd(DateUtil.getFrontDate(req.getDateEnd(),
            true));
        String orderColumn = req.getOrderColumn();
        if (StringUtils.isBlank(orderColumn)) {
            orderColumn = ISYSLogAO.DEFAULT_ORDER_COLUMN;
        }
        condition.setOrder(orderColumn, req.getOrderDir());
        int start = StringValidater.toInteger(req.getStart());
        int limit = StringValidater.toInteger(req.getLimit());
        return sysLogAO.querySYSLogPage(start, limit, condition);
    }

    /** 
     * @see com.xnjr.base.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN809025Req.class);
        StringValidater.validateBlank(req.getStart(), req.getLimit());
    }
}
