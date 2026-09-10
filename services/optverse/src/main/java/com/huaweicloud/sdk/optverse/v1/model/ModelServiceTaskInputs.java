package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模型服务任务输入
 */
public class ModelServiceTaskInputs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_data")

    private String modelData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_request")

    private String modelRequest;

    public ModelServiceTaskInputs withModelData(String modelData) {
        this.modelData = modelData;
        return this;
    }

    /**
     * **参数解释**： 创建沙箱任务输入数据文件路径。支持求解助手类型的模型服务任务时使用，优先级高于model_request。 **约束限制**： 不涉及 **取值范围**： 长度为[0-2048]个字符。 **默认取值**： 不涉及 
     * @return modelData
     */
    public String getModelData() {
        return modelData;
    }

    public void setModelData(String modelData) {
        this.modelData = modelData;
    }

    public ModelServiceTaskInputs withModelRequest(String modelRequest) {
        this.modelRequest = modelRequest;
        return this;
    }

    /**
     * **参数解释**： 创建沙箱任务输入请求体。 **约束限制**： 不涉及 **取值范围**： 长度为[0-12582912]个字符，上限12MB。 **默认取值**： 不涉及 
     * @return modelRequest
     */
    public String getModelRequest() {
        return modelRequest;
    }

    public void setModelRequest(String modelRequest) {
        this.modelRequest = modelRequest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelServiceTaskInputs that = (ModelServiceTaskInputs) obj;
        return Objects.equals(this.modelData, that.modelData) && Objects.equals(this.modelRequest, that.modelRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelData, modelRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelServiceTaskInputs {\n");
        sb.append("    modelData: ").append(toIndentedString(modelData)).append("\n");
        sb.append("    modelRequest: ").append(toIndentedString(modelRequest)).append("\n");
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
