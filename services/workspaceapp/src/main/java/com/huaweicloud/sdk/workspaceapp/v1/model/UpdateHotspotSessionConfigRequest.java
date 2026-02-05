package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateHotspotSessionConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_id")

    private String configId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateHotspotSessionConfigReq body;

    public UpdateHotspotSessionConfigRequest withConfigId(String configId) {
        this.configId = configId;
        return this;
    }

    /**
     * 热点会话迁移配置ID。
     * @return configId
     */
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public UpdateHotspotSessionConfigRequest withBody(UpdateHotspotSessionConfigReq body) {
        this.body = body;
        return this;
    }

    public UpdateHotspotSessionConfigRequest withBody(Consumer<UpdateHotspotSessionConfigReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateHotspotSessionConfigReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateHotspotSessionConfigReq getBody() {
        return body;
    }

    public void setBody(UpdateHotspotSessionConfigReq body) {
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
        UpdateHotspotSessionConfigRequest that = (UpdateHotspotSessionConfigRequest) obj;
        return Objects.equals(this.configId, that.configId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHotspotSessionConfigRequest {\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
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
