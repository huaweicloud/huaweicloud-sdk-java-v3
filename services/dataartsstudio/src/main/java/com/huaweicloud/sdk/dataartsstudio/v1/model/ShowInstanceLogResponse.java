package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_bridge")

    private Boolean enableBridge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_profile")

    private Boolean enableProfile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_classification")

    private Boolean enableClassification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bridge_status")

    private String bridgeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile_status")

    private String profileStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification_status")

    private String classificationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bridge_job_log")

    private String bridgeJobLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile_job_log")

    private String profileJobLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification_job_log")

    private String classificationJobLog;

    public ShowInstanceLogResponse withEnableBridge(Boolean enableBridge) {
        this.enableBridge = enableBridge;
        return this;
    }

    /**
     * 是否开启桥接模式
     * @return enableBridge
     */
    public Boolean getEnableBridge() {
        return enableBridge;
    }

    public void setEnableBridge(Boolean enableBridge) {
        this.enableBridge = enableBridge;
    }

    public ShowInstanceLogResponse withEnableProfile(Boolean enableProfile) {
        this.enableProfile = enableProfile;
        return this;
    }

    /**
     * 是否启用配置
     * @return enableProfile
     */
    public Boolean getEnableProfile() {
        return enableProfile;
    }

    public void setEnableProfile(Boolean enableProfile) {
        this.enableProfile = enableProfile;
    }

    public ShowInstanceLogResponse withEnableClassification(Boolean enableClassification) {
        this.enableClassification = enableClassification;
        return this;
    }

    /**
     * 是否开启分类
     * @return enableClassification
     */
    public Boolean getEnableClassification() {
        return enableClassification;
    }

    public void setEnableClassification(Boolean enableClassification) {
        this.enableClassification = enableClassification;
    }

    public ShowInstanceLogResponse withBridgeStatus(String bridgeStatus) {
        this.bridgeStatus = bridgeStatus;
        return this;
    }

    /**
     * 桥接状态
     * @return bridgeStatus
     */
    public String getBridgeStatus() {
        return bridgeStatus;
    }

    public void setBridgeStatus(String bridgeStatus) {
        this.bridgeStatus = bridgeStatus;
    }

    public ShowInstanceLogResponse withProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
        return this;
    }

    /**
     * 配置状态
     * @return profileStatus
     */
    public String getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
    }

    public ShowInstanceLogResponse withClassificationStatus(String classificationStatus) {
        this.classificationStatus = classificationStatus;
        return this;
    }

    /**
     * 分类状态
     * @return classificationStatus
     */
    public String getClassificationStatus() {
        return classificationStatus;
    }

    public void setClassificationStatus(String classificationStatus) {
        this.classificationStatus = classificationStatus;
    }

    public ShowInstanceLogResponse withBridgeJobLog(String bridgeJobLog) {
        this.bridgeJobLog = bridgeJobLog;
        return this;
    }

    /**
     * 桥接作业日志
     * @return bridgeJobLog
     */
    public String getBridgeJobLog() {
        return bridgeJobLog;
    }

    public void setBridgeJobLog(String bridgeJobLog) {
        this.bridgeJobLog = bridgeJobLog;
    }

    public ShowInstanceLogResponse withProfileJobLog(String profileJobLog) {
        this.profileJobLog = profileJobLog;
        return this;
    }

    /**
     * 配置作业日志
     * @return profileJobLog
     */
    public String getProfileJobLog() {
        return profileJobLog;
    }

    public void setProfileJobLog(String profileJobLog) {
        this.profileJobLog = profileJobLog;
    }

    public ShowInstanceLogResponse withClassificationJobLog(String classificationJobLog) {
        this.classificationJobLog = classificationJobLog;
        return this;
    }

    /**
     * 分类作业日志
     * @return classificationJobLog
     */
    public String getClassificationJobLog() {
        return classificationJobLog;
    }

    public void setClassificationJobLog(String classificationJobLog) {
        this.classificationJobLog = classificationJobLog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceLogResponse that = (ShowInstanceLogResponse) obj;
        return Objects.equals(this.enableBridge, that.enableBridge)
            && Objects.equals(this.enableProfile, that.enableProfile)
            && Objects.equals(this.enableClassification, that.enableClassification)
            && Objects.equals(this.bridgeStatus, that.bridgeStatus)
            && Objects.equals(this.profileStatus, that.profileStatus)
            && Objects.equals(this.classificationStatus, that.classificationStatus)
            && Objects.equals(this.bridgeJobLog, that.bridgeJobLog)
            && Objects.equals(this.profileJobLog, that.profileJobLog)
            && Objects.equals(this.classificationJobLog, that.classificationJobLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableBridge,
            enableProfile,
            enableClassification,
            bridgeStatus,
            profileStatus,
            classificationStatus,
            bridgeJobLog,
            profileJobLog,
            classificationJobLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceLogResponse {\n");
        sb.append("    enableBridge: ").append(toIndentedString(enableBridge)).append("\n");
        sb.append("    enableProfile: ").append(toIndentedString(enableProfile)).append("\n");
        sb.append("    enableClassification: ").append(toIndentedString(enableClassification)).append("\n");
        sb.append("    bridgeStatus: ").append(toIndentedString(bridgeStatus)).append("\n");
        sb.append("    profileStatus: ").append(toIndentedString(profileStatus)).append("\n");
        sb.append("    classificationStatus: ").append(toIndentedString(classificationStatus)).append("\n");
        sb.append("    bridgeJobLog: ").append(toIndentedString(bridgeJobLog)).append("\n");
        sb.append("    profileJobLog: ").append(toIndentedString(profileJobLog)).append("\n");
        sb.append("    classificationJobLog: ").append(toIndentedString(classificationJobLog)).append("\n");
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
