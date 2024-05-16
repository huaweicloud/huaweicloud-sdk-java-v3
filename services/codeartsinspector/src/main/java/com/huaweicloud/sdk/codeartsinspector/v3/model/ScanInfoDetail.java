package com.huaweicloud.sdk.codeartsinspector.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ScanInfoDetail
 */
public class ScanInfoDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_weak_passwd")

    private Boolean enableWeakPasswd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ScanInfoDetail withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 扫描任务创建时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ScanInfoDetail withEnableWeakPasswd(Boolean enableWeakPasswd) {
        this.enableWeakPasswd = enableWeakPasswd;
        return this;
    }

    /**
     * 弱密码检查
     * @return enableWeakPasswd
     */
    public Boolean getEnableWeakPasswd() {
        return enableWeakPasswd;
    }

    public void setEnableWeakPasswd(Boolean enableWeakPasswd) {
        this.enableWeakPasswd = enableWeakPasswd;
    }

    public ScanInfoDetail withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 扫描任务结束时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ScanInfoDetail withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 任务进度
     * minimum: 0
     * maximum: 100
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ScanInfoDetail withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 任务描述
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ScanInfoDetail withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 扫描任务状态:   * 0 运行中   * 1 已完成   * 2 手动取消   * 3 等待中   * 4 扫描失败   * 5 等待定时调度 
     * minimum: 0
     * maximum: 5
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanInfoDetail that = (ScanInfoDetail) obj;
        return Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.enableWeakPasswd, that.enableWeakPasswd)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, enableWeakPasswd, endTime, progress, reason, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanInfoDetail {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    enableWeakPasswd: ").append(toIndentedString(enableWeakPasswd)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
