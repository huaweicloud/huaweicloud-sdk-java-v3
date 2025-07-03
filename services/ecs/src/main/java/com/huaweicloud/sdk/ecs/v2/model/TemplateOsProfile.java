package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OS属性
 */
public class TemplateOsProfile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_agency_name")

    private String iamAgencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_monitoring_service")

    private Boolean enableMonitoringService;

    public TemplateOsProfile withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 秘钥名称
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public TemplateOsProfile withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 注入脚本，会导致请求过大，影响虚拟机表。1. 和密码的使用冲突 2. 超大文本问题。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public TemplateOsProfile withIamAgencyName(String iamAgencyName) {
        this.iamAgencyName = iamAgencyName;
        return this;
    }

    /**
     * 委托名称。实际需要多委托。
     * @return iamAgencyName
     */
    public String getIamAgencyName() {
        return iamAgencyName;
    }

    public void setIamAgencyName(String iamAgencyName) {
        this.iamAgencyName = iamAgencyName;
    }

    public TemplateOsProfile withEnableMonitoringService(Boolean enableMonitoringService) {
        this.enableMonitoringService = enableMonitoringService;
        return this;
    }

    /**
     * 开启主机监控服务
     * @return enableMonitoringService
     */
    public Boolean getEnableMonitoringService() {
        return enableMonitoringService;
    }

    public void setEnableMonitoringService(Boolean enableMonitoringService) {
        this.enableMonitoringService = enableMonitoringService;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateOsProfile that = (TemplateOsProfile) obj;
        return Objects.equals(this.keyName, that.keyName) && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.iamAgencyName, that.iamAgencyName)
            && Objects.equals(this.enableMonitoringService, that.enableMonitoringService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyName, userData, iamAgencyName, enableMonitoringService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateOsProfile {\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    iamAgencyName: ").append(toIndentedString(iamAgencyName)).append("\n");
        sb.append("    enableMonitoringService: ").append(toIndentedString(enableMonitoringService)).append("\n");
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
