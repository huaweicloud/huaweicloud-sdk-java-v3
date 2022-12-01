package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowUpgradeProgressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cause")

    private String cause;

    public ShowUpgradeProgressResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 升级的固件版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowUpgradeProgressResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 固件升级状态，1:升级中 2:升级失败 3:升级成功
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowUpgradeProgressResponse withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 固件升级进度，用数字0-100表示
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public ShowUpgradeProgressResponse withCause(String cause) {
        this.cause = cause;
        return this;
    }

    /**
     * 固件升级失败原因
     * @return cause
     */
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowUpgradeProgressResponse showUpgradeProgressResponse = (ShowUpgradeProgressResponse) o;
        return Objects.equals(this.version, showUpgradeProgressResponse.version)
            && Objects.equals(this.status, showUpgradeProgressResponse.status)
            && Objects.equals(this.progress, showUpgradeProgressResponse.progress)
            && Objects.equals(this.cause, showUpgradeProgressResponse.cause);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, status, progress, cause);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUpgradeProgressResponse {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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
