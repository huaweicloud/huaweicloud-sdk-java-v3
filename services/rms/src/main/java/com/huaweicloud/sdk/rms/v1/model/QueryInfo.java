package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryInfo
 */
public class QueryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_fields")

    private List<String> selectFields = null;

    public QueryInfo withSelectFields(List<String> selectFields) {
        this.selectFields = selectFields;
        return this;
    }

    public QueryInfo addSelectFieldsItem(String selectFieldsItem) {
        if (this.selectFields == null) {
            this.selectFields = new ArrayList<>();
        }
        this.selectFields.add(selectFieldsItem);
        return this;
    }

    public QueryInfo withSelectFields(Consumer<List<String>> selectFieldsSetter) {
        if (this.selectFields == null) {
            this.selectFields = new ArrayList<>();
        }
        selectFieldsSetter.accept(this.selectFields);
        return this;
    }

    /**
     * ResourceQL 查询字段
     * @return selectFields
     */
    public List<String> getSelectFields() {
        return selectFields;
    }

    public void setSelectFields(List<String> selectFields) {
        this.selectFields = selectFields;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryInfo queryInfo = (QueryInfo) o;
        return Objects.equals(this.selectFields, queryInfo.selectFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryInfo {\n");
        sb.append("    selectFields: ").append(toIndentedString(selectFields)).append("\n");
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
