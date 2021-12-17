package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** RunDetail */
public class RunDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_id")

    private String detailId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_job")

    private SqlJobRunDetail sqlJob;

    public RunDetail withDetailId(String detailId) {
        this.detailId = detailId;
        return this;
    }

    /** 作业运行详情ID。
     * 
     * @return detailId */
    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public RunDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 此作业的当前状态，包含提交（LAUNCHING）、运行中（RUNNING）、完成（FINISHED）、失败（FAILED）、取消（CANCELLED）。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RunDetail withSqlJob(SqlJobRunDetail sqlJob) {
        this.sqlJob = sqlJob;
        return this;
    }

    public RunDetail withSqlJob(Consumer<SqlJobRunDetail> sqlJobSetter) {
        if (this.sqlJob == null) {
            this.sqlJob = new SqlJobRunDetail();
            sqlJobSetter.accept(this.sqlJob);
        }

        return this;
    }

    /** Get sqlJob
     * 
     * @return sqlJob */
    public SqlJobRunDetail getSqlJob() {
        return sqlJob;
    }

    public void setSqlJob(SqlJobRunDetail sqlJob) {
        this.sqlJob = sqlJob;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunDetail runDetail = (RunDetail) o;
        return Objects.equals(this.detailId, runDetail.detailId) && Objects.equals(this.status, runDetail.status)
            && Objects.equals(this.sqlJob, runDetail.sqlJob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailId, status, sqlJob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunDetail {\n");
        sb.append("    detailId: ").append(toIndentedString(detailId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sqlJob: ").append(toIndentedString(sqlJob)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
