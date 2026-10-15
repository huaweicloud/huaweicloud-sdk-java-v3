package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowReplayRecordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_records")

    private List<ReplayExecuteRecords> sqlRecords = null;

    public ShowReplayRecordResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 列表中的项目总数，与分页无关。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowReplayRecordResponse withSqlRecords(List<ReplayExecuteRecords> sqlRecords) {
        this.sqlRecords = sqlRecords;
        return this;
    }

    public ShowReplayRecordResponse addSqlRecordsItem(ReplayExecuteRecords sqlRecordsItem) {
        if (this.sqlRecords == null) {
            this.sqlRecords = new ArrayList<>();
        }
        this.sqlRecords.add(sqlRecordsItem);
        return this;
    }

    public ShowReplayRecordResponse withSqlRecords(Consumer<List<ReplayExecuteRecords>> sqlRecordsSetter) {
        if (this.sqlRecords == null) {
            this.sqlRecords = new ArrayList<>();
        }
        sqlRecordsSetter.accept(this.sqlRecords);
        return this;
    }

    /**
     * 回放任务的SQL执行记录。
     * @return sqlRecords
     */
    public List<ReplayExecuteRecords> getSqlRecords() {
        return sqlRecords;
    }

    public void setSqlRecords(List<ReplayExecuteRecords> sqlRecords) {
        this.sqlRecords = sqlRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReplayRecordResponse that = (ShowReplayRecordResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.sqlRecords, that.sqlRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, sqlRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReplayRecordResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    sqlRecords: ").append(toIndentedString(sqlRecords)).append("\n");
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
