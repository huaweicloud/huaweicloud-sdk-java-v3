package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateAppConfigV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_config_id")

    private String appConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AppConfigModifyRequestV2 body;

    public UpdateAppConfigV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateAppConfigV2Request withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 应用编号
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UpdateAppConfigV2Request withAppConfigId(String appConfigId) {
        this.appConfigId = appConfigId;
        return this;
    }

    /** 应用配置编号
     * 
     * @return appConfigId */
    public String getAppConfigId() {
        return appConfigId;
    }

    public void setAppConfigId(String appConfigId) {
        this.appConfigId = appConfigId;
    }

    public UpdateAppConfigV2Request withBody(AppConfigModifyRequestV2 body) {
        this.body = body;
        return this;
    }

    public UpdateAppConfigV2Request withBody(Consumer<AppConfigModifyRequestV2> bodySetter) {
        if (this.body == null) {
            this.body = new AppConfigModifyRequestV2();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public AppConfigModifyRequestV2 getBody() {
        return body;
    }

    public void setBody(AppConfigModifyRequestV2 body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAppConfigV2Request updateAppConfigV2Request = (UpdateAppConfigV2Request) o;
        return Objects.equals(this.instanceId, updateAppConfigV2Request.instanceId)
            && Objects.equals(this.appId, updateAppConfigV2Request.appId)
            && Objects.equals(this.appConfigId, updateAppConfigV2Request.appConfigId)
            && Objects.equals(this.body, updateAppConfigV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, appId, appConfigId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAppConfigV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appConfigId: ").append(toIndentedString(appConfigId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
