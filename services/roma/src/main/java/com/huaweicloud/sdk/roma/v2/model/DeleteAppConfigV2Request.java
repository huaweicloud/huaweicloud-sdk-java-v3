package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAppConfigV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_config_id")

    @JacksonXmlProperty(localName = "app_config_id")

    private String appConfigId;

    public DeleteAppConfigV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteAppConfigV2Request withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public DeleteAppConfigV2Request withAppConfigId(String appConfigId) {
        this.appConfigId = appConfigId;
        return this;
    }

    /**
     * 应用配置编号
     * @return appConfigId
     */
    public String getAppConfigId() {
        return appConfigId;
    }

    public void setAppConfigId(String appConfigId) {
        this.appConfigId = appConfigId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAppConfigV2Request deleteAppConfigV2Request = (DeleteAppConfigV2Request) o;
        return Objects.equals(this.instanceId, deleteAppConfigV2Request.instanceId)
            && Objects.equals(this.appId, deleteAppConfigV2Request.appId)
            && Objects.equals(this.appConfigId, deleteAppConfigV2Request.appConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, appId, appConfigId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAppConfigV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appConfigId: ").append(toIndentedString(appConfigId)).append("\n");
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
