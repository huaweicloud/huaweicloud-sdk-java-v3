package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateSearchConditionRequestBody
 */
public class UpdateSearchConditionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_name")

    private String conditionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    public UpdateSearchConditionRequestBody withConditionName(String conditionName) {
        this.conditionName = conditionName;
        return this;
    }

    /**
     * 检索条件名称
     * @return conditionName
     */
    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public UpdateSearchConditionRequestBody withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 查询语句
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSearchConditionRequestBody that = (UpdateSearchConditionRequestBody) obj;
        return Objects.equals(this.conditionName, that.conditionName) && Objects.equals(this.query, that.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionName, query);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSearchConditionRequestBody {\n");
        sb.append("    conditionName: ").append(toIndentedString(conditionName)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
