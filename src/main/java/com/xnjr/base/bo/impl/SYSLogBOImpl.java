/**
 * @Title SYSLogBOImpl.java 
 * @Package com.xnjr.moom.bo.impl 
 * @Description 
 * @author haiqingzheng  
 * @date 2016年4月16日 下午9:37:33 
 * @version V1.0   
 */
package com.xnjr.base.bo.impl;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xnjr.base.bo.ISYSLogBO;
import com.xnjr.base.bo.base.PaginableBOImpl;
import com.xnjr.base.core.OrderNoGenerater;
import com.xnjr.base.dao.ISYSLogDAO;
import com.xnjr.base.domain.SYSLog;
import com.xnjr.base.enums.ELogOperateType;
import com.xnjr.base.enums.ELogSystem;
import com.xnjr.base.exception.BizException;

/** 
 * @author: haiqingzheng 
 * @since: 2016年4月16日 下午9:37:33 
 * @history:
 */
@Component
public class SYSLogBOImpl extends PaginableBOImpl<SYSLog> implements ISYSLogBO {
    @Autowired
    private ISYSLogDAO sysLogDAO;

    @Override
    public String saveInsertLog(String toTable, String toRow, String operater,
            Date operateDatetime) {
        return savaLog(toTable, toRow, operater, ELogOperateType.INSERT,
            operateDatetime);
    }

    @Override
    public String saveDeleteLog(String toTable, String toRow, String operater,
            Date operateDatetime) {
        return savaLog(toTable, toRow, operater, ELogOperateType.DELETE,
            operateDatetime);
    }

    @Override
    public String saveUpdateLog(String toTable, String toRow, String toColumn,
            String preValue, String postValue, String operater,
            Date operateDatetime) {
        checkBlank2(toTable, toRow, toColumn, preValue, postValue, operater,
            operateDatetime);
        // 开始insert
        SYSLog log = new SYSLog();
        String code = OrderNoGenerater.generateM("LOG");
        log.setCode(code);
        log.setToSystem(ELogSystem.MOOM.getCode());
        log.setToTable(toTable);
        log.setToRow(toRow);
        log.setToColumn(toColumn);

        log.setOperateType(ELogOperateType.UPDATE.getCode());
        log.setPreValue(preValue);
        log.setPostValue(postValue);
        log.setOperater(operater);
        log.setOperateDatetime(new Date());
        sysLogDAO.insert(log);
        return code;
    }

    @Override
    public String saveLoginLog(String toTable, String toRow, String operater,
            Date operateDatetime) {
        return savaLog(toTable, toRow, operater, ELogOperateType.LOGIN,
            operateDatetime);

    }

    private String savaLog(String toTable, String toRow, String operater,
            ELogOperateType operateType, Date operateDatetime) {
        // 非空检查
        checkBlank(toTable, toRow, operater, operateDatetime);
        // 开始insert
        SYSLog log = new SYSLog();
        String code = OrderNoGenerater.generateM("LOG");
        log.setCode(code);
        log.setToSystem(ELogSystem.MOOM.getCode());
        log.setToTable(toTable);
        log.setToRow(toRow);
        log.setOperateType(operateType.getCode());

        log.setOperater(operater);
        log.setOperateDatetime(operateDatetime);
        sysLogDAO.insert(log);
        return code;
    }

    private void checkBlank(String toTable, String toRow, String operater,
            Date operateDatetime) {
        if (StringUtils.isBlank(toTable)) {
            throw new BizException("XNsys0000", "针对表不能为空");
        }
        if (StringUtils.isBlank(toRow)) {
            throw new BizException("XNsys0000", "针对记录不能为空");
        }
        if (StringUtils.isBlank(operater)) {
            throw new BizException("XNsys0000", "操作人不能为空");
        }
        if (operateDatetime == null) {
            throw new BizException("XNsys0000", "操作时间不能为空");
        }

    }

    private void checkBlank2(String toTable, String toRow, String toColumn,
            String preValue, String postValue, String operater,
            Date operateDatetime) {
        if (StringUtils.isBlank(toTable)) {
            throw new BizException("XNsys0000", "针对表不能为空");
        }
        if (StringUtils.isBlank(toRow)) {
            throw new BizException("XNsys0000", "针对记录不能为空");
        }
        if (StringUtils.isBlank(toColumn)) {
            throw new BizException("XNsys0000", "针对字段不能为空");
        }
        if (StringUtils.isBlank(preValue)) {
            throw new BizException("XNsys0000", "操作前字段不能为空");
        }
        if (StringUtils.isBlank(postValue)) {
            throw new BizException("XNsys0000", "操作后字段不能为空");
        }
        if (StringUtils.isBlank(operater)) {
            throw new BizException("XNsys0000", "操作人不能为空");
        }
        if (operateDatetime == null) {
            throw new BizException("XNsys0000", "操作时间不能为空");
        }

    }

    @Override
    public String saveUpdateLog(String toTable, String toRow, String operater,
            Date operateDatetime) {
        return savaLog(toTable, toRow, operater, ELogOperateType.UPDATE,
            operateDatetime);
    }

}
