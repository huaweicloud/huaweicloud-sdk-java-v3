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
public class ListSqlPlanActionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_plan_bind_state_list")

    private List<SqlPlanStateListResponseSqlPlanBindStateList> sqlPlanBindStateList = null;

    public ListSqlPlanActionResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: sql执行计划总数。 **取值范围**: 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSqlPlanActionResponse withSqlPlanBindStateList(
        List<SqlPlanStateListResponseSqlPlanBindStateList> sqlPlanBindStateList) {
        this.sqlPlanBindStateList = sqlPlanBindStateList;
        return this;
    }

    public ListSqlPlanActionResponse addSqlPlanBindStateListItem(
        SqlPlanStateListResponseSqlPlanBindStateList sqlPlanBindStateListItem) {
        if (this.sqlPlanBindStateList == null) {
            this.sqlPlanBindStateList = new ArrayList<>();
        }
        this.sqlPlanBindStateList.add(sqlPlanBindStateListItem);
        return this;
    }

    public ListSqlPlanActionResponse withSqlPlanBindStateList(
        Consumer<List<SqlPlanStateListResponseSqlPlanBindStateList>> sqlPlanBindStateListSetter) {
        if (this.sqlPlanBindStateList == null) {
            this.sqlPlanBindStateList = new ArrayList<>();
        }
        sqlPlanBindStateListSetter.accept(this.sqlPlanBindStateList);
        return this;
    }

    /**
     * **参数解释**: 执行计划列表。 **取值范围**: 不涉及。
     * @return sqlPlanBindStateList
     */
    public List<SqlPlanStateListResponseSqlPlanBindStateList> getSqlPlanBindStateList() {
        return sqlPlanBindStateList;
    }

    public void setSqlPlanBindStateList(List<SqlPlanStateListResponseSqlPlanBindStateList> sqlPlanBindStateList) {
        this.sqlPlanBindStateList = sqlPlanBindStateList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlPlanActionResponse that = (ListSqlPlanActionResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.sqlPlanBindStateList, that.sqlPlanBindStateList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, sqlPlanBindStateList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlPlanActionResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    sqlPlanBindStateList: ").append(toIndentedString(sqlPlanBindStateList)).append("\n");
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
