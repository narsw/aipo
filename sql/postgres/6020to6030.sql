-- 20111014
-- modify table struct
ALTER TABLE EIP_T_TODO ADD CREATE_USER_ID INTEGER NOT NULL DEFAULT 0;
UPDATE EIP_T_TODO SET CREATE_USER_ID = USER_ID;
-- 20111014

-- 20111019
-- change ACL settings
UPDATE EIP_T_ACL_PORTLET_FEATURE SET ACL_TYPE = 31 WHERE FEATURE_NAME = 'todo_todo_other';
UPDATE EIP_T_ACL_ROLE SET ACL_TYPE = 31, NOTE = '＊詳細表示、追加、削除は一覧表示の権限を持っていないと使用できません' WHERE FEATURE_ID IN (SELECT FEATURE_ID FROM EIP_T_ACL_PORTLET_FEATURE WHERE FEATURE_NAME = 'todo_todo_other');

-- modify table struct
ALTER TABLE EIP_T_TODO_CATEGORY ADD UPDATE_USER_ID INTEGER NOT NULL DEFAULT 0;
UPDATE EIP_T_TODO_CATEGORY SET UPDATE_USER_ID = USER_ID;

-- add new ACL setting
INSERT INTO EIP_T_ACL_PORTLET_FEATURE VALUES(NEXTVAL('pk_eip_t_acl_portlet_feature'),'todo_category_other','ToDo（他ユーザのカテゴリ）操作',27);
INSERT INTO EIP_T_ACL_ROLE VALUES(NEXTVAL('pk_eip_t_acl_role'), 'ToDo（他ユーザのカテゴリ）管理者', (SELECT FEATURE_ID from EIP_T_ACL_PORTLET_FEATURE WHERE FEATURE_NAME = 'todo_category_other' LIMIT 1),27,'＊詳細表示、編集、削除は一覧表示の権限を持っていないと使用できません');
-- 20111019

-- 20111021
-- create table struct
CREATE TABLE eip_m_inactive_application (
    ID INTEGER NOT NULL,
    NAME varchar(128) NULL,
    PRIMARY KEY (ID)
)
;
CREATE SEQUENCE pk_eip_m_inactive_application INCREMENT 20 START 200;

INSERT INTO EIP_M_MAIL_NOTIFY_CONF VALUES(NEXTVAL('pk_eip_m_mail_notify_conf'),1,25,3,NULL,now(),now());

-- 20111021

-- 20111025
INSERT INTO EIP_T_CABINET_FOLDER_MAP VALUES(NEXTVAL('pk_eip_t_cabinet_folder_map'),1,0,null);
-- 20111025