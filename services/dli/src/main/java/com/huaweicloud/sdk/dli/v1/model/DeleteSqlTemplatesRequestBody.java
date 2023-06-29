package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteSqlTemplatesRequestBody
 */
public class DeleteSqlTemplatesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_ids")

    private List<String> sqlIds = null;

    public DeleteSqlTemplatesRequestBody withSqlIds(List<String> sqlIds) {
        this.sqlIds = sqlIds;
        return this;
    }

    public DeleteSqlTemplatesRequestBody addSqlIdsItem(String sqlIdsItem) {
        if (this.sqlIds == null) {
            this.sqlIds = new ArrayList<>();
        }
        this.sqlIds.add(sqlIdsItem);
        return this;
    }

    public DeleteSqlTemplatesRequestBody withSqlIds(Consumer<List<String>> sqlIdsSetter) {
        if (this.sqlIds == null) {
            this.sqlIds = new ArrayList<>();
        }
        sqlIdsSetter.accept(this.sqlIds);
        return this;
    }

    /**
     * 待删除的sql模板ID列表。
     * @return sqlIds
     */
    public List<String> getSqlIds() {
        return sqlIds;
    }

    public void setSqlIds(List<String> sqlIds) {
        this.sqlIds = sqlIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteSqlTemplatesRequestBody that = (DeleteSqlTemplatesRequestBody) obj;
        return Objects.equals(this.sqlIds, that.sqlIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSqlTemplatesRequestBody {\n");
        sb.append("    sqlIds: ").append(toIndentedString(sqlIds)).append("\n");
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
