package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateForwardingConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwarding_type")

    private String forwardingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwarding_config_id")

    private String forwardingConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateForwardingConfigRequestDTO body;

    public UpdateForwardingConfigRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数说明**：实例ID。dris物理实例的唯一标识。获取方法参见[获取Instance-Id](https://support.huaweicloud.com/api-v2x/v2x_04_0030.html)。  **取值范围**：仅支持数字，小写字母和连接符（-）的组合，长度36。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateForwardingConfigRequest withForwardingType(String forwardingType) {
        this.forwardingType = forwardingType;
        return this;
    }

    /**
     * **参数说明**：转发配置的类型。  **取值范围**：当前仅支持“kafka，mrskafka”。
     * @return forwardingType
     */
    public String getForwardingType() {
        return forwardingType;
    }

    public void setForwardingType(String forwardingType) {
        this.forwardingType = forwardingType;
    }

    public UpdateForwardingConfigRequest withForwardingConfigId(String forwardingConfigId) {
        this.forwardingConfigId = forwardingConfigId;
        return this;
    }

    /**
     * **参数说明**：转发配置的唯一ID。
     * @return forwardingConfigId
     */
    public String getForwardingConfigId() {
        return forwardingConfigId;
    }

    public void setForwardingConfigId(String forwardingConfigId) {
        this.forwardingConfigId = forwardingConfigId;
    }

    public UpdateForwardingConfigRequest withBody(UpdateForwardingConfigRequestDTO body) {
        this.body = body;
        return this;
    }

    public UpdateForwardingConfigRequest withBody(Consumer<UpdateForwardingConfigRequestDTO> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateForwardingConfigRequestDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateForwardingConfigRequestDTO getBody() {
        return body;
    }

    public void setBody(UpdateForwardingConfigRequestDTO body) {
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
        UpdateForwardingConfigRequest updateForwardingConfigRequest = (UpdateForwardingConfigRequest) o;
        return Objects.equals(this.instanceId, updateForwardingConfigRequest.instanceId)
            && Objects.equals(this.forwardingType, updateForwardingConfigRequest.forwardingType)
            && Objects.equals(this.forwardingConfigId, updateForwardingConfigRequest.forwardingConfigId)
            && Objects.equals(this.body, updateForwardingConfigRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, forwardingType, forwardingConfigId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateForwardingConfigRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    forwardingType: ").append(toIndentedString(forwardingType)).append("\n");
        sb.append("    forwardingConfigId: ").append(toIndentedString(forwardingConfigId)).append("\n");
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
