package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteConfigMapRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_map_id")

    private String configMapId;

    public DeleteConfigMapRequest withConfigMapId(String configMapId) {
        this.configMapId = configMapId;
        return this;
    }

    /**
     * 配置项ID，从专业版HiLens控制台配置项管理[获取配置项列表](listConfigMapUsingGET.xml)获取
     * @return configMapId
     */
    public String getConfigMapId() {
        return configMapId;
    }

    public void setConfigMapId(String configMapId) {
        this.configMapId = configMapId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteConfigMapRequest that = (DeleteConfigMapRequest) obj;
        return Objects.equals(this.configMapId, that.configMapId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configMapId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteConfigMapRequest {\n");
        sb.append("    configMapId: ").append(toIndentedString(configMapId)).append("\n");
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
