package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowForwardingConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwarding_type")

    private String forwardingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwarding_config_id")

    private String forwardingConfigId;

    public ShowForwardingConfigRequest withInstanceId(String instanceId) {
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

    public ShowForwardingConfigRequest withForwardingType(String forwardingType) {
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

    public ShowForwardingConfigRequest withForwardingConfigId(String forwardingConfigId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowForwardingConfigRequest that = (ShowForwardingConfigRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.forwardingType, that.forwardingType)
            && Objects.equals(this.forwardingConfigId, that.forwardingConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, forwardingType, forwardingConfigId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowForwardingConfigRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    forwardingType: ").append(toIndentedString(forwardingType)).append("\n");
        sb.append("    forwardingConfigId: ").append(toIndentedString(forwardingConfigId)).append("\n");
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
