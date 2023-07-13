package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateConfigMapRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_map_id")

    private String configMapId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ConfigMapModelBoxDTO body;

    public UpdateConfigMapRequest withConfigMapId(String configMapId) {
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

    public UpdateConfigMapRequest withBody(ConfigMapModelBoxDTO body) {
        this.body = body;
        return this;
    }

    public UpdateConfigMapRequest withBody(Consumer<ConfigMapModelBoxDTO> bodySetter) {
        if (this.body == null) {
            this.body = new ConfigMapModelBoxDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ConfigMapModelBoxDTO getBody() {
        return body;
    }

    public void setBody(ConfigMapModelBoxDTO body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateConfigMapRequest that = (UpdateConfigMapRequest) obj;
        return Objects.equals(this.configMapId, that.configMapId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configMapId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigMapRequest {\n");
        sb.append("    configMapId: ").append(toIndentedString(configMapId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
