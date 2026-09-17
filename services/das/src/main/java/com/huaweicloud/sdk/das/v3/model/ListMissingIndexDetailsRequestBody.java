package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取缺失索引详情列表请求体
 */
public class ListMissingIndexDetailsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<MissingIndexCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_asc")

    private Boolean sortAsc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private Integer curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private Integer perPage;

    public ListMissingIndexDetailsRequestBody withConditions(List<MissingIndexCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ListMissingIndexDetailsRequestBody addConditionsItem(MissingIndexCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public ListMissingIndexDetailsRequestBody withConditions(Consumer<List<MissingIndexCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 过滤条件
     * @return conditions
     */
    public List<MissingIndexCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<MissingIndexCondition> conditions) {
        this.conditions = conditions;
    }

    public ListMissingIndexDetailsRequestBody withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 表名称
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public ListMissingIndexDetailsRequestBody withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public ListMissingIndexDetailsRequestBody withSortAsc(Boolean sortAsc) {
        this.sortAsc = sortAsc;
        return this;
    }

    /**
     * 排序是否升序
     * @return sortAsc
     */
    public Boolean getSortAsc() {
        return sortAsc;
    }

    public void setSortAsc(Boolean sortAsc) {
        this.sortAsc = sortAsc;
    }

    public ListMissingIndexDetailsRequestBody withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * 当前页
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public ListMissingIndexDetailsRequestBody withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 页大小
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMissingIndexDetailsRequestBody that = (ListMissingIndexDetailsRequestBody) obj;
        return Objects.equals(this.conditions, that.conditions) && Objects.equals(this.objectName, that.objectName)
            && Objects.equals(this.sortField, that.sortField) && Objects.equals(this.sortAsc, that.sortAsc)
            && Objects.equals(this.curPage, that.curPage) && Objects.equals(this.perPage, that.perPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditions, objectName, sortField, sortAsc, curPage, perPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMissingIndexDetailsRequestBody {\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortAsc: ").append(toIndentedString(sortAsc)).append("\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
