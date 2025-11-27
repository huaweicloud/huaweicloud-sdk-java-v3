package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件实例的状态
 */
public class AddonInstanceStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetVersions")

    private List<String> targetVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentVersion")

    private AddonVersion currentVersion;

    public AddonInstanceStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态信息
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AddonInstanceStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 变化原因信息
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public AddonInstanceStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 变化详细信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AddonInstanceStatus withTargetVersions(List<String> targetVersions) {
        this.targetVersions = targetVersions;
        return this;
    }

    public AddonInstanceStatus addTargetVersionsItem(String targetVersionsItem) {
        if (this.targetVersions == null) {
            this.targetVersions = new ArrayList<>();
        }
        this.targetVersions.add(targetVersionsItem);
        return this;
    }

    public AddonInstanceStatus withTargetVersions(Consumer<List<String>> targetVersionsSetter) {
        if (this.targetVersions == null) {
            this.targetVersions = new ArrayList<>();
        }
        targetVersionsSetter.accept(this.targetVersions);
        return this;
    }

    /**
     * 目标版本信息
     * @return targetVersions
     */
    public List<String> getTargetVersions() {
        return targetVersions;
    }

    public void setTargetVersions(List<String> targetVersions) {
        this.targetVersions = targetVersions;
    }

    public AddonInstanceStatus withCurrentVersion(AddonVersion currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public AddonInstanceStatus withCurrentVersion(Consumer<AddonVersion> currentVersionSetter) {
        if (this.currentVersion == null) {
            this.currentVersion = new AddonVersion();
            currentVersionSetter.accept(this.currentVersion);
        }

        return this;
    }

    /**
     * Get currentVersion
     * @return currentVersion
     */
    public AddonVersion getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(AddonVersion currentVersion) {
        this.currentVersion = currentVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddonInstanceStatus that = (AddonInstanceStatus) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.message, that.message) && Objects.equals(this.targetVersions, that.targetVersions)
            && Objects.equals(this.currentVersion, that.currentVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, reason, message, targetVersions, currentVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddonInstanceStatus {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    targetVersions: ").append(toIndentedString(targetVersions)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
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
