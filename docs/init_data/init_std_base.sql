/*
-- Query: select `to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,now() as `update_datetime`,`remark` from tsys_dict
LIMIT 0, 50000

-- Date: 2016-07-28 16:27
*/
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'user_status','用户状态','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','user_status','0','正常','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','user_status','1','程序锁定','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','user_status','2','人工锁定','admin',now(),'');

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'id_kind','证件类型','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','id_kind','1','身份证','admin',now(),'');

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'role_level','角色等级','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','role_level','1','管理员级别','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','role_level','2','运营级别','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','role_level','3','财务级别','admin',now(),'');

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'res_type','资源类型','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','res_type','1','菜单','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','res_type','2','按钮','admin',now(),'');

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'lock_direction','锁定方向','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','lock_direction','1','用锁','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','lock_direction','2','解锁','admin',now(),'');

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'account_status','账户状态','admin',now(),'账户状态');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','account_status','0','正常','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','account_status','1','程序锁定','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','account_status','2','人工锁定','admin',now(),'');

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'account_direction','账户方向','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','account_direction','1','蓝补','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','account_direction','0','红冲','admin',now(),'');

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'rb_order_status','红冲蓝补状态','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','rb_order_status','1','待审批','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','rb_order_status','2','审批不通过','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','rb_order_status','3','审批通过','admin',now(),'');

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'jour_status','流水状态','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','jour_status','0','免对账','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','jour_status','1','待对账','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','jour_status','2','已对账待调帐','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','jour_status','9','已对账且账已平','admin',now(),'');

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'true_false','对错','admin',now(),NULL);
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','true_false','1','是','admin',now(),NULL);
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','true_false','0','否','admin',now(),NULL);

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'recharge_status','充值状态','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','recharge_status','1','待审批','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','recharge_status','2','审批不通过','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','recharge_status','3','已审批通过','admin',now(),'');

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'withdraw_status','取现状态','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','withdraw_status','1','待审批','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','withdraw_status','2','审批不通过','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','withdraw_status','3','已审批-待支付','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','withdraw_status','4','不用审批-待支付','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','withdraw_status','5','支付失败','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','withdraw_status','6','支付成功','admin',now(),'');

INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','0',NULL,'account-status','账号状态','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','account-status','1','启用','admin',now(),'');
INSERT INTO `tsys_dict` (`to_system`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('8','1','account-status','0','未启用','admin',now(),'');
