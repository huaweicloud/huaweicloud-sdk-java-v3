package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateConfigMapRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configmap_id")

    private String configmapId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateConfigMaps body;

    public UpdateConfigMapRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /** 铂金版实例ID，专业版实例为空值
     * 
     * @return iefInstanceId */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public UpdateConfigMapRequest withConfigmapId(String configmapId) {
        this.configmapId = configmapId;
        return this;
    }

    /** 配置项ID
     * 
     * @return configmapId */
    public String getConfigmapId() {
        return configmapId;
    }

    public void setConfigmapId(String configmapId) {
        this.configmapId = configmapId;
    }

    public UpdateConfigMapRequest withBody(UpdateConfigMaps body) {
        this.body = body;
        return this;
    }

    public UpdateConfigMapRequest withBody(Consumer<UpdateConfigMaps> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateConfigMaps();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateConfigMaps getBody() {
        return body;
    }

    public void setBody(UpdateConfigMaps body) {
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
        UpdateConfigMapRequest updateConfigMapRequest = (UpdateConfigMapRequest) o;
        return Objects.equals(this.iefInstanceId, updateConfigMapRequest.iefInstanceId)
            && Objects.equals(this.configmapId, updateConfigMapRequest.configmapId)
            && Objects.equals(this.body, updateConfigMapRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, configmapId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigMapRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    configmapId: ").append(toIndentedString(configmapId)).append("\n");
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
