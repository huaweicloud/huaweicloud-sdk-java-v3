package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSqlPatchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_patch_infos")

    private List<SqlPatchInfosResult> sqlPatchInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListSqlPatchResponse withSqlPatchInfos(List<SqlPatchInfosResult> sqlPatchInfos) {
        this.sqlPatchInfos = sqlPatchInfos;
        return this;
    }

    public ListSqlPatchResponse addSqlPatchInfosItem(SqlPatchInfosResult sqlPatchInfosItem) {
        if (this.sqlPatchInfos == null) {
            this.sqlPatchInfos = new ArrayList<>();
        }
        this.sqlPatchInfos.add(sqlPatchInfosItem);
        return this;
    }

    public ListSqlPatchResponse withSqlPatchInfos(Consumer<List<SqlPatchInfosResult>> sqlPatchInfosSetter) {
        if (this.sqlPatchInfos == null) {
            this.sqlPatchInfos = new ArrayList<>();
        }
        sqlPatchInfosSetter.accept(this.sqlPatchInfos);
        return this;
    }

    /**
     * **参数解释**: SQL Patch信息列表。
     * @return sqlPatchInfos
     */
    public List<SqlPatchInfosResult> getSqlPatchInfos() {
        return sqlPatchInfos;
    }

    public void setSqlPatchInfos(List<SqlPatchInfosResult> sqlPatchInfos) {
        this.sqlPatchInfos = sqlPatchInfos;
    }

    public ListSqlPatchResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 返回的SQL Patch数量。 **取值范围**: 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlPatchResponse that = (ListSqlPatchResponse) obj;
        return Objects.equals(this.sqlPatchInfos, that.sqlPatchInfos) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlPatchInfos, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlPatchResponse {\n");
        sb.append("    sqlPatchInfos: ").append(toIndentedString(sqlPatchInfos)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
