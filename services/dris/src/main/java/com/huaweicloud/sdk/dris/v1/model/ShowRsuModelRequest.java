package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowRsuModelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsu_model_id")

    private String rsuModelId;

    public ShowRsuModelRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * \"**参数说明**：实例ID。dris物理实例的唯一标识。获取方法参见[获取Instance-Id](https://support.huaweicloud.com/api-v2x/v2x_04_0030.html)。  **取值范围**：仅支持数字，小写字母和横杠（-）的组合，长度36。\"
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowRsuModelRequest withRsuModelId(String rsuModelId) {
        this.rsuModelId = rsuModelId;
        return this;
    }

    /**
     * **参数说明**：RSU型号ID，用于唯一标识一个RSU型号，在平台创建RSU型号后由平台分配获得。  **取值范围**：长度不小于1不超过36，只允许字母、数字、连接符（-）的组合。 
     * @return rsuModelId
     */
    public String getRsuModelId() {
        return rsuModelId;
    }

    public void setRsuModelId(String rsuModelId) {
        this.rsuModelId = rsuModelId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRsuModelRequest showRsuModelRequest = (ShowRsuModelRequest) o;
        return Objects.equals(this.instanceId, showRsuModelRequest.instanceId)
            && Objects.equals(this.rsuModelId, showRsuModelRequest.rsuModelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, rsuModelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRsuModelRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    rsuModelId: ").append(toIndentedString(rsuModelId)).append("\n");
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
