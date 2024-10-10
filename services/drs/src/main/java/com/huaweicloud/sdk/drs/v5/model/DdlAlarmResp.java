package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DDL告警信息响应体。
 */
public class DdlAlarmResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seqno")

    private Long seqno;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint")

    private String checkpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_timestamp")

    private Long ddlTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_text")

    private String ddlText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exe_result")

    private Boolean exeResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean_time")

    private Long cleanTime;

    public DdlAlarmResp withSeqno(Long seqno) {
        this.seqno = seqno;
        return this;
    }

    /**
     * 记录唯一序号。
     * @return seqno
     */
    public Long getSeqno() {
        return seqno;
    }

    public void setSeqno(Long seqno) {
        this.seqno = seqno;
    }

    public DdlAlarmResp withCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }

    /**
     * 数据源库位点。
     * @return checkpoint
     */
    public String getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
    }

    public DdlAlarmResp withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * DDL告警状态。0无告警，1告警中。
     * minimum: 0
     * maximum: 2147483647
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DdlAlarmResp withDdlTimestamp(Long ddlTimestamp) {
        this.ddlTimestamp = ddlTimestamp;
        return this;
    }

    /**
     * DDL在源库执行时间。
     * @return ddlTimestamp
     */
    public Long getDdlTimestamp() {
        return ddlTimestamp;
    }

    public void setDdlTimestamp(Long ddlTimestamp) {
        this.ddlTimestamp = ddlTimestamp;
    }

    public DdlAlarmResp withDdlText(String ddlText) {
        this.ddlText = ddlText;
        return this;
    }

    /**
     * DDL内容。
     * @return ddlText
     */
    public String getDdlText() {
        return ddlText;
    }

    public void setDdlText(String ddlText) {
        this.ddlText = ddlText;
    }

    public DdlAlarmResp withExeResult(Boolean exeResult) {
        this.exeResult = exeResult;
        return this;
    }

    /**
     * DDL执行结果。false执行失败，true执行成功。
     * @return exeResult
     */
    public Boolean getExeResult() {
        return exeResult;
    }

    public void setExeResult(Boolean exeResult) {
        this.exeResult = exeResult;
    }

    public DdlAlarmResp withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * 数据记录时间。
     * @return recordTime
     */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    public DdlAlarmResp withCleanTime(Long cleanTime) {
        this.cleanTime = cleanTime;
        return this;
    }

    /**
     * DDL告警清理时间。
     * @return cleanTime
     */
    public Long getCleanTime() {
        return cleanTime;
    }

    public void setCleanTime(Long cleanTime) {
        this.cleanTime = cleanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DdlAlarmResp that = (DdlAlarmResp) obj;
        return Objects.equals(this.seqno, that.seqno) && Objects.equals(this.checkpoint, that.checkpoint)
            && Objects.equals(this.status, that.status) && Objects.equals(this.ddlTimestamp, that.ddlTimestamp)
            && Objects.equals(this.ddlText, that.ddlText) && Objects.equals(this.exeResult, that.exeResult)
            && Objects.equals(this.recordTime, that.recordTime) && Objects.equals(this.cleanTime, that.cleanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seqno, checkpoint, status, ddlTimestamp, ddlText, exeResult, recordTime, cleanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DdlAlarmResp {\n");
        sb.append("    seqno: ").append(toIndentedString(seqno)).append("\n");
        sb.append("    checkpoint: ").append(toIndentedString(checkpoint)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ddlTimestamp: ").append(toIndentedString(ddlTimestamp)).append("\n");
        sb.append("    ddlText: ").append(toIndentedString(ddlText)).append("\n");
        sb.append("    exeResult: ").append(toIndentedString(exeResult)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    cleanTime: ").append(toIndentedString(cleanTime)).append("\n");
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
