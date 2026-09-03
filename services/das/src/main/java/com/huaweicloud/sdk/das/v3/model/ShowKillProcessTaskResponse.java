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
public class ShowKillProcessTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_killing_task_resp_list")

    private List<SqlKillingTaskResp> sqlKillingTaskRespList = null;

    public ShowKillProcessTaskResponse withSqlKillingTaskRespList(List<SqlKillingTaskResp> sqlKillingTaskRespList) {
        this.sqlKillingTaskRespList = sqlKillingTaskRespList;
        return this;
    }

    public ShowKillProcessTaskResponse addSqlKillingTaskRespListItem(SqlKillingTaskResp sqlKillingTaskRespListItem) {
        if (this.sqlKillingTaskRespList == null) {
            this.sqlKillingTaskRespList = new ArrayList<>();
        }
        this.sqlKillingTaskRespList.add(sqlKillingTaskRespListItem);
        return this;
    }

    public ShowKillProcessTaskResponse withSqlKillingTaskRespList(
        Consumer<List<SqlKillingTaskResp>> sqlKillingTaskRespListSetter) {
        if (this.sqlKillingTaskRespList == null) {
            this.sqlKillingTaskRespList = new ArrayList<>();
        }
        sqlKillingTaskRespListSetter.accept(this.sqlKillingTaskRespList);
        return this;
    }

    /**
     * 自动kill会话任务列表
     * @return sqlKillingTaskRespList
     */
    public List<SqlKillingTaskResp> getSqlKillingTaskRespList() {
        return sqlKillingTaskRespList;
    }

    public void setSqlKillingTaskRespList(List<SqlKillingTaskResp> sqlKillingTaskRespList) {
        this.sqlKillingTaskRespList = sqlKillingTaskRespList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKillProcessTaskResponse that = (ShowKillProcessTaskResponse) obj;
        return Objects.equals(this.sqlKillingTaskRespList, that.sqlKillingTaskRespList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlKillingTaskRespList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKillProcessTaskResponse {\n");
        sb.append("    sqlKillingTaskRespList: ").append(toIndentedString(sqlKillingTaskRespList)).append("\n");
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
