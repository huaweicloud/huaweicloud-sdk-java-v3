package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CloudAlarmDto
 */
public class CloudAlarmDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudServiceName")

    private String cloudServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudServiceRegionId")

    private String cloudServiceRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudServiceSite")

    private String cloudServiceSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "microServiceGroupName")

    private String microServiceGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "microServiceName")

    private String microServiceName;

    public CloudAlarmDto withCloudServiceName(String cloudServiceName) {
        this.cloudServiceName = cloudServiceName;
        return this;
    }

    /**
     * 云服务名称
     * @return cloudServiceName
     */
    public String getCloudServiceName() {
        return cloudServiceName;
    }

    public void setCloudServiceName(String cloudServiceName) {
        this.cloudServiceName = cloudServiceName;
    }

    public CloudAlarmDto withCloudServiceRegionId(String cloudServiceRegionId) {
        this.cloudServiceRegionId = cloudServiceRegionId;
        return this;
    }

    /**
     * 云服务区域标识
     * @return cloudServiceRegionId
     */
    public String getCloudServiceRegionId() {
        return cloudServiceRegionId;
    }

    public void setCloudServiceRegionId(String cloudServiceRegionId) {
        this.cloudServiceRegionId = cloudServiceRegionId;
    }

    public CloudAlarmDto withCloudServiceSite(String cloudServiceSite) {
        this.cloudServiceSite = cloudServiceSite;
        return this;
    }

    /**
     * 云服务站点：默认中国站
     * @return cloudServiceSite
     */
    public String getCloudServiceSite() {
        return cloudServiceSite;
    }

    public void setCloudServiceSite(String cloudServiceSite) {
        this.cloudServiceSite = cloudServiceSite;
    }

    public CloudAlarmDto withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启CloudAlarm配置
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public CloudAlarmDto withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 告警级别
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public CloudAlarmDto withMicroServiceGroupName(String microServiceGroupName) {
        this.microServiceGroupName = microServiceGroupName;
        return this;
    }

    /**
     * 微服务组名称
     * @return microServiceGroupName
     */
    public String getMicroServiceGroupName() {
        return microServiceGroupName;
    }

    public void setMicroServiceGroupName(String microServiceGroupName) {
        this.microServiceGroupName = microServiceGroupName;
    }

    public CloudAlarmDto withMicroServiceName(String microServiceName) {
        this.microServiceName = microServiceName;
        return this;
    }

    /**
     * 微服务名称
     * @return microServiceName
     */
    public String getMicroServiceName() {
        return microServiceName;
    }

    public void setMicroServiceName(String microServiceName) {
        this.microServiceName = microServiceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudAlarmDto that = (CloudAlarmDto) obj;
        return Objects.equals(this.cloudServiceName, that.cloudServiceName)
            && Objects.equals(this.cloudServiceRegionId, that.cloudServiceRegionId)
            && Objects.equals(this.cloudServiceSite, that.cloudServiceSite) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.level, that.level)
            && Objects.equals(this.microServiceGroupName, that.microServiceGroupName)
            && Objects.equals(this.microServiceName, that.microServiceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudServiceName,
            cloudServiceRegionId,
            cloudServiceSite,
            enable,
            level,
            microServiceGroupName,
            microServiceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudAlarmDto {\n");
        sb.append("    cloudServiceName: ").append(toIndentedString(cloudServiceName)).append("\n");
        sb.append("    cloudServiceRegionId: ").append(toIndentedString(cloudServiceRegionId)).append("\n");
        sb.append("    cloudServiceSite: ").append(toIndentedString(cloudServiceSite)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    microServiceGroupName: ").append(toIndentedString(microServiceGroupName)).append("\n");
        sb.append("    microServiceName: ").append(toIndentedString(microServiceName)).append("\n");
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
