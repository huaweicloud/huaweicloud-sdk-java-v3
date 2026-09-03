package com.huaweicloud.sdk.das.v3.model;

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
public class ExecuteSplitSqlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_list")

    private List<String> sqlList = null;

    public ExecuteSplitSqlResponse withSqlList(List<String> sqlList) {
        this.sqlList = sqlList;
        return this;
    }

    public ExecuteSplitSqlResponse addSqlListItem(String sqlListItem) {
        if (this.sqlList == null) {
            this.sqlList = new ArrayList<>();
        }
        this.sqlList.add(sqlListItem);
        return this;
    }

    public ExecuteSplitSqlResponse withSqlList(Consumer<List<String>> sqlListSetter) {
        if (this.sqlList == null) {
            this.sqlList = new ArrayList<>();
        }
        sqlListSetter.accept(this.sqlList);
        return this;
    }

    /**
     * 切分后的SQL语句列表
     * @return sqlList
     */
    public List<String> getSqlList() {
        return sqlList;
    }

    public void setSqlList(List<String> sqlList) {
        this.sqlList = sqlList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteSplitSqlResponse that = (ExecuteSplitSqlResponse) obj;
        return Objects.equals(this.sqlList, that.sqlList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteSplitSqlResponse {\n");
        sb.append("    sqlList: ").append(toIndentedString(sqlList)).append("\n");
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
