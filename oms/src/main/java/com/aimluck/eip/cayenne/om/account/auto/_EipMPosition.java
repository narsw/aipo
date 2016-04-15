package com.aimluck.eip.cayenne.om.account.auto;

/**
 * Class _EipMPosition was generated by Cayenne. It is probably a good idea to
 * avoid changing this class manually, since it may be overwritten next time
 * code is regenerated. If you need to make any customizations, please use
 * subclass.
 */
public class _EipMPosition extends org.apache.cayenne.CayenneDataObject {

  public static final String CREATE_DATE_PROPERTY = "createDate";

  public static final String POSITION_NAME_PROPERTY = "positionName";

  public static final String SORT_PROPERTY = "sort";

  public static final String UPDATE_DATE_PROPERTY = "updateDate";

  public static final String POSITION_ID_PK_COLUMN = "POSITION_ID";

  public void setCreateDate(java.util.Date createDate) {
    writeProperty("createDate", createDate);
  }

  public java.util.Date getCreateDate() {
    return (java.util.Date) readProperty("createDate");
  }

  public void setPositionName(String positionName) {
    writeProperty("positionName", positionName);
  }

  public String getPositionName() {
    return (String) readProperty("positionName");
  }

  public void setSort(Integer sort) {
    writeProperty("sort", sort);
  }

  public Integer getSort() {
    return (Integer) readProperty("sort");
  }

  public void setUpdateDate(java.util.Date updateDate) {
    writeProperty("updateDate", updateDate);
  }

  public java.util.Date getUpdateDate() {
    return (java.util.Date) readProperty("updateDate");
  }

}