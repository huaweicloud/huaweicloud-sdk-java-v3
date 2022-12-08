package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRsuRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsu_id")

    private String rsuId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ModifyRsuRequestDTO body;

    public UpdateRsuRequest withInstanceId(String instanceId) {
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

    public UpdateRsuRequest withRsuId(String rsuId) {
        this.rsuId = rsuId;
        return this;
    }

    /**
     * **参数说明**：RSU的唯一标识符，在平台创建RSU时由平台生成。
     * @return rsuId
     */
    public String getRsuId() {
        return rsuId;
    }

    public void setRsuId(String rsuId) {
        this.rsuId = rsuId;
    }

    public UpdateRsuRequest withBody(ModifyRsuRequestDTO body) {
        this.body = body;
        return this;
    }

    public UpdateRsuRequest withBody(Consumer<ModifyRsuRequestDTO> bodySetter) {
        if (this.body == null) {
            this.body = new ModifyRsuRequestDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ModifyRsuRequestDTO getBody() {
        return body;
    }

    public void setBody(ModifyRsuRequestDTO body) {
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
        UpdateRsuRequest updateRsuRequest = (UpdateRsuRequest) o;
        return Objects.equals(this.instanceId, updateRsuRequest.instanceId)
            && Objects.equals(this.rsuId, updateRsuRequest.rsuId) && Objects.equals(this.body, updateRsuRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, rsuId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRsuRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    rsuId: ").append(toIndentedString(rsuId)).append("\n");
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
