package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowGetByUniqueKeyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modelName")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "getUniqueFieldMethod")

    private String getUniqueFieldMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RDMParamVOPersistableModelUniqueKeyDTO body;

    public ShowGetByUniqueKeyRequest withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * **参数解释：**  应用唯一标识。  **约束限制：**  不涉及。  **取值范围：**  由英文字母和数字组成，且长度为32个字符。  **默认取值：**  不涉及。 
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ShowGetByUniqueKeyRequest withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：**  数据模型的英文名称。  **约束限制：**  不涉及。  **取值范围：**  大写字母开头，只能包含字母、数字、“_”，且长度为[1-60]个字符。  **默认取值：**  不涉及。 
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public ShowGetByUniqueKeyRequest withGetUniqueFieldMethod(String getUniqueFieldMethod) {
        this.getUniqueFieldMethod = getUniqueFieldMethod;
        return this;
    }

    /**
     * **参数解释：**  方法名称，格式为：getBy{uniqueName}。  uniqueName：表示“唯一键”为“是”的属性英文名称。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return getUniqueFieldMethod
     */
    public String getGetUniqueFieldMethod() {
        return getUniqueFieldMethod;
    }

    public void setGetUniqueFieldMethod(String getUniqueFieldMethod) {
        this.getUniqueFieldMethod = getUniqueFieldMethod;
    }

    public ShowGetByUniqueKeyRequest withBody(RDMParamVOPersistableModelUniqueKeyDTO body) {
        this.body = body;
        return this;
    }

    public ShowGetByUniqueKeyRequest withBody(Consumer<RDMParamVOPersistableModelUniqueKeyDTO> bodySetter) {
        if (this.body == null) {
            this.body = new RDMParamVOPersistableModelUniqueKeyDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RDMParamVOPersistableModelUniqueKeyDTO getBody() {
        return body;
    }

    public void setBody(RDMParamVOPersistableModelUniqueKeyDTO body) {
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
        ShowGetByUniqueKeyRequest that = (ShowGetByUniqueKeyRequest) obj;
        return Objects.equals(this.identifier, that.identifier) && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.getUniqueFieldMethod, that.getUniqueFieldMethod)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, modelName, getUniqueFieldMethod, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGetByUniqueKeyRequest {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    getUniqueFieldMethod: ").append(toIndentedString(getUniqueFieldMethod)).append("\n");
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
