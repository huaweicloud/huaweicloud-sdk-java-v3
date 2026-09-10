package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 训练Agent。
 */
public class OpsTuningTrainAgent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_provider_id")

    private String modelProviderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    public OpsTuningTrainAgent withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 智能体ID，训练实例关联的智能体。  **取值范围：** 有效标识符字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsTuningTrainAgent withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 智能体版本。  **取值范围：** 版本号字符串。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OpsTuningTrainAgent withModelProviderId(String modelProviderId) {
        this.modelProviderId = modelProviderId;
        return this;
    }

    /**
     * **参数解释：** 训练模型的供应商ID，标识模型来源的服务商。  **取值范围：** 供应商标识字符串。
     * @return modelProviderId
     */
    public String getModelProviderId() {
        return modelProviderId;
    }

    public void setModelProviderId(String modelProviderId) {
        this.modelProviderId = modelProviderId;
    }

    public OpsTuningTrainAgent withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * **参数解释：** 训练模型ID，标识正在被训练的具体模型实例。  **取值范围：** 模型标识字符串。
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTuningTrainAgent that = (OpsTuningTrainAgent) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.version, that.version)
            && Objects.equals(this.modelProviderId, that.modelProviderId) && Objects.equals(this.modelId, that.modelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, modelProviderId, modelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTuningTrainAgent {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    modelProviderId: ").append(toIndentedString(modelProviderId)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
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
