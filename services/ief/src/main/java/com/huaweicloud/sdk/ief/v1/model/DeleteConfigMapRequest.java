package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteConfigMapRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configmap_id")

    private String configmapId;

    public DeleteConfigMapRequest withIefInstanceId(String iefInstanceId) {
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

    public DeleteConfigMapRequest withConfigmapId(String configmapId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteConfigMapRequest deleteConfigMapRequest = (DeleteConfigMapRequest) o;
        return Objects.equals(this.iefInstanceId, deleteConfigMapRequest.iefInstanceId)
            && Objects.equals(this.configmapId, deleteConfigMapRequest.configmapId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, configmapId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteConfigMapRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    configmapId: ").append(toIndentedString(configmapId)).append("\n");
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
