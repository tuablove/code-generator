package com.github.zhuyizhuo.generator.mybatis.convention;

import java.text.MessageFormat;

/**
 * 方法名信息
 * @author yizhuo
 * @version 1.0
 * time: 2018/7/29 15:40
 */
public class MethodInfo {

    /** 新增方法名 */
    private static final String INSERT_METHOD_FORMAT = "insert{0}";
    /** 删除方法名 */
    private static final String DELETE_METHOD_FORMAT = "delete{0}ByWhere";
    /** 根据主键删除方法名 */
    private static final String DELETE_BY_PRIMARY_KEY_METHOD_FORMAT = "delete{0}ByPrimaryKey";
    /** 更新方法名 */
    private static final String UPDATE_METHOD_FORMAT = "update{0}ByWhere";
    /** 根据主键更新方法名 */
    private static final String UPDATE_BY_PRIMARY_KEY_METHOD_FORMAT = "update{0}ByPrimaryKey";
    /** 查询方法名 */
    private static final String QUERY_METHOD_FORMAT = "query{0}List";
    /** 批量新增方法名*/
    private static final String BATCH_INSERT_METHOD_FORMAT = "batchInsert{0}";
    /** 分页查询方法名 */
    private static final String PAGING_QUERY_METHOD_FORMAT = "pagingQuery{0}";
    /** 查询总数方法名 */
    private static final String COUNT_METHOD_FORMAT = "count{0}";

    private String insertMethodName;
    private String updateMethodName;
    private String updateByPrimaryKeyMethodName;
    private String deleteByPrimaryKeyMethodName;
    private String deleteMethodName;
    private String queryMethodName;
    private String countMethodName;

    public String getInsertMethodName() {
        return insertMethodName;
    }

    public void setInsertMethodName(String insertMethodName) {
        this.insertMethodName = formatMethodName(INSERT_METHOD_FORMAT,insertMethodName);
    }

    public String getUpdateMethodName() {
        return updateMethodName;
    }

    public void setUpdateMethodName(String updateMethodName) {
        this.updateMethodName = formatMethodName(UPDATE_METHOD_FORMAT,updateMethodName);
    }

    public String getDeleteMethodName() {
        return deleteMethodName;
    }

    public void setDeleteMethodName(String deleteMethodName) {
        this.deleteMethodName = formatMethodName(DELETE_METHOD_FORMAT,deleteMethodName);
    }

    public String getQueryMethodName() {
        return queryMethodName;
    }

    public void setQueryMethodName(String queryMethodName) {
        this.queryMethodName = formatMethodName(QUERY_METHOD_FORMAT,queryMethodName);
    }

    public String getCountMethodName() {
        return countMethodName;
    }

    public void setCountMethodName(String countMethodName) {
        this.countMethodName = formatMethodName(COUNT_METHOD_FORMAT,countMethodName);;
    }

    public String getDeleteByPrimaryKeyMethodName() {
        return deleteByPrimaryKeyMethodName;
    }

    public void setDeleteByPrimaryKeyMethodName(String deleteByPrimaryKeyMethodName) {
        this.deleteByPrimaryKeyMethodName = formatMethodName(DELETE_BY_PRIMARY_KEY_METHOD_FORMAT,deleteByPrimaryKeyMethodName);
    }

    public String getUpdateByPrimaryKeyMethodName() {
        return updateByPrimaryKeyMethodName;
    }

    public void setUpdateByPrimaryKeyMethodName(String updateByPrimaryKeyMethodName) {
        this.updateByPrimaryKeyMethodName = formatMethodName(UPDATE_BY_PRIMARY_KEY_METHOD_FORMAT,updateByPrimaryKeyMethodName);
    }

    /**
     * 格式化方法名
     * @param format 方法名格式化模板 例如 countTotal{0}
     * @param tableName 表名
     * @return 格式化后的方法名
     */
    public static String formatMethodName(String format,String tableName){
        return MessageFormat.format(format,tableName);
    }

    public void initMethodName(String javaTableName) {
        setInsertMethodName(javaTableName);
        setDeleteMethodName(javaTableName);
        setDeleteByPrimaryKeyMethodName(javaTableName);
        setUpdateMethodName(javaTableName);
        setUpdateByPrimaryKeyMethodName(javaTableName);
        setQueryMethodName(javaTableName);
        setCountMethodName(javaTableName);
    }

}
