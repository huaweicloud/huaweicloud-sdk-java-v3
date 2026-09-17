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
public class ShowSqlLimitingRecordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_limiting_record_list")

    private List<SqlLimitingRecordInfo> sqlLimitingRecordList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_show_limit_count")

    private Boolean canShowLimitCount;

    public ShowSqlLimitingRecordResponse withSqlLimitingRecordList(List<SqlLimitingRecordInfo> sqlLimitingRecordList) {
        this.sqlLimitingRecordList = sqlLimitingRecordList;
        return this;
    }

    public ShowSqlLimitingRecordResponse addSqlLimitingRecordListItem(SqlLimitingRecordInfo sqlLimitingRecordListItem) {
        if (this.sqlLimitingRecordList == null) {
            this.sqlLimitingRecordList = new ArrayList<>();
        }
        this.sqlLimitingRecordList.add(sqlLimitingRecordListItem);
        return this;
    }

    public ShowSqlLimitingRecordResponse withSqlLimitingRecordList(
        Consumer<List<SqlLimitingRecordInfo>> sqlLimitingRecordListSetter) {
        if (this.sqlLimitingRecordList == null) {
            this.sqlLimitingRecordList = new ArrayList<>();
        }
        sqlLimitingRecordListSetter.accept(this.sqlLimitingRecordList);
        return this;
    }

    /**
     * SQL限流规则列表
     * @return sqlLimitingRecordList
     */
    public List<SqlLimitingRecordInfo> getSqlLimitingRecordList() {
        return sqlLimitingRecordList;
    }

    public void setSqlLimitingRecordList(List<SqlLimitingRecordInfo> sqlLimitingRecordList) {
        this.sqlLimitingRecordList = sqlLimitingRecordList;
    }

    public ShowSqlLimitingRecordResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * SQL限流规则总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowSqlLimitingRecordResponse withCanShowLimitCount(Boolean canShowLimitCount) {
        this.canShowLimitCount = canShowLimitCount;
        return this;
    }

    /**
     * 实例是否支持展示显示限流触发次数
     * @return canShowLimitCount
     */
    public Boolean getCanShowLimitCount() {
        return canShowLimitCount;
    }

    public void setCanShowLimitCount(Boolean canShowLimitCount) {
        this.canShowLimitCount = canShowLimitCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSqlLimitingRecordResponse that = (ShowSqlLimitingRecordResponse) obj;
        return Objects.equals(this.sqlLimitingRecordList, that.sqlLimitingRecordList)
            && Objects.equals(this.total, that.total) && Objects.equals(this.canShowLimitCount, that.canShowLimitCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlLimitingRecordList, total, canShowLimitCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlLimitingRecordResponse {\n");
        sb.append("    sqlLimitingRecordList: ").append(toIndentedString(sqlLimitingRecordList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    canShowLimitCount: ").append(toIndentedString(canShowLimitCount)).append("\n");
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
