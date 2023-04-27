package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowNextflowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private Long workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Double progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_status")

    private String cacheStatus;

    public ShowNextflowResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 引擎版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowNextflowResponse withWorkspace(Long workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 用作路径用量，单位：byte
     * @return workspace
     */
    public Long getWorkspace() {
        return workspace;
    }

    public void setWorkspace(Long workspace) {
        this.workspace = workspace;
    }

    public ShowNextflowResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowNextflowResponse withProgress(Double progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 进度
     * @return progress
     */
    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public ShowNextflowResponse withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public ShowNextflowResponse withCacheStatus(String cacheStatus) {
        this.cacheStatus = cacheStatus;
        return this;
    }

    /**
     * 缓存清理状态
     * @return cacheStatus
     */
    public String getCacheStatus() {
        return cacheStatus;
    }

    public void setCacheStatus(String cacheStatus) {
        this.cacheStatus = cacheStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNextflowResponse showNextflowResponse = (ShowNextflowResponse) o;
        return Objects.equals(this.version, showNextflowResponse.version)
            && Objects.equals(this.workspace, showNextflowResponse.workspace)
            && Objects.equals(this.status, showNextflowResponse.status)
            && Objects.equals(this.progress, showNextflowResponse.progress)
            && Objects.equals(this.failedReason, showNextflowResponse.failedReason)
            && Objects.equals(this.cacheStatus, showNextflowResponse.cacheStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, workspace, status, progress, failedReason, cacheStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNextflowResponse {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    cacheStatus: ").append(toIndentedString(cacheStatus)).append("\n");
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
