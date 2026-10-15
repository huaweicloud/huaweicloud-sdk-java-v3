package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据过滤对象信息请求体  注意：           每张表仅支持添加一个校验规则。           数据过滤每次最多支持500张表。           过滤表达式不支持使用某种数据库引擎特有的package、函数、变量、常量等写法，须使用通用SQL标准。请直接输入SQL语句中WHERE之后的部分（不包含WHERE和分号，例如：sid &gt; 3 and sname like \&quot;G %\&quot;），最多支持输入512个字符。           过滤条件填写的SQL语句中，关键字需要用反引号，datatime类型（包含日期和时间）需要用单引号，例如：update &gt; &#39;2022-07-13 00:00:00&#39; and age &gt;10。           不支持对LOB字段设置过滤条件，如CLOB、BLOB、BYTEA等大字段类型。           不支持库名、表名带有换行符的对象设置过滤规则。           建议不要对非精确类型字段设置过滤条件，如FLOAT、DECIMAL、DOUBLE等。           建议不要对带有特殊字符的字段设置过滤条件。           不建议使用非幂等表达式或函数作为数据加工条件，如SYSTIMESTAMP，SYSDATE等，因其每次调用返回的结果可能会有差异，导致达不到预期。
 */
public class GeneralTransformationReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_object_list")

    private List<DataFilterObjectInfo> filterObjectList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_filter_condition")

    private String sourceFilterCondition;

    public GeneralTransformationReq withFilterObjectList(List<DataFilterObjectInfo> filterObjectList) {
        this.filterObjectList = filterObjectList;
        return this;
    }

    public GeneralTransformationReq addFilterObjectListItem(DataFilterObjectInfo filterObjectListItem) {
        if (this.filterObjectList == null) {
            this.filterObjectList = new ArrayList<>();
        }
        this.filterObjectList.add(filterObjectListItem);
        return this;
    }

    public GeneralTransformationReq withFilterObjectList(Consumer<List<DataFilterObjectInfo>> filterObjectListSetter) {
        if (this.filterObjectList == null) {
            this.filterObjectList = new ArrayList<>();
        }
        filterObjectListSetter.accept(this.filterObjectList);
        return this;
    }

    /**
     * 数据过滤对象列表。包含需要校验的具体数据库对象（库/Schema/表）信息，在简单条件过滤场景下为必填项。列表中的每个元素代表一个待过滤的数据库对象。适用条件：简单过滤条件场景下必填。
     * @return filterObjectList
     */
    public List<DataFilterObjectInfo> getFilterObjectList() {
        return filterObjectList;
    }

    public void setFilterObjectList(List<DataFilterObjectInfo> filterObjectList) {
        this.filterObjectList = filterObjectList;
    }

    public GeneralTransformationReq withSourceFilterCondition(String sourceFilterCondition) {
        this.sourceFilterCondition = sourceFilterCondition;
        return this;
    }

    /**
     * 源端数据库的过滤条件SQL语句。用于定义源库数据过滤规则，支持SQL子查询等高级过滤表达式。当数据过滤涉及子查询场景时，需要通过此字段配置查询条件。
     * @return sourceFilterCondition
     */
    public String getSourceFilterCondition() {
        return sourceFilterCondition;
    }

    public void setSourceFilterCondition(String sourceFilterCondition) {
        this.sourceFilterCondition = sourceFilterCondition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeneralTransformationReq that = (GeneralTransformationReq) obj;
        return Objects.equals(this.filterObjectList, that.filterObjectList)
            && Objects.equals(this.sourceFilterCondition, that.sourceFilterCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterObjectList, sourceFilterCondition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralTransformationReq {\n");
        sb.append("    filterObjectList: ").append(toIndentedString(filterObjectList)).append("\n");
        sb.append("    sourceFilterCondition: ").append(toIndentedString(sourceFilterCondition)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
