package ${stratificationInfo.daoFullPackage};

import java.util.List;

import ${stratificationInfo.pojoFullPackage}.${stratificationInfo.pojoName};

/**
 * description : ${tableInfo.tableName} table dao layer interface <br/>
<#include "java/comment.ftl"/>
 */
public interface ${stratificationInfo.daoName} {

	int ${methodInfo.insertMethodName}(${stratificationInfo.pojoName} ${stratificationInfo.pojoName?uncap_first});<#if tableInfo.hasPrimaryKey>

    int ${methodInfo.deleteByPrimaryKeyMethodName}(${stratificationInfo.pojoName} ${stratificationInfo.pojoName?uncap_first});

    int ${methodInfo.updateByPrimaryKeyMethodName}(${stratificationInfo.pojoName} ${stratificationInfo.pojoName?uncap_first});</#if>

    int ${methodInfo.countMethodName}(${stratificationInfo.pojoName} ${stratificationInfo.pojoName?uncap_first});

    List<${stratificationInfo.pojoName}> ${methodInfo.queryMethodName}(${stratificationInfo.pojoName} ${stratificationInfo.pojoName?uncap_first});

}