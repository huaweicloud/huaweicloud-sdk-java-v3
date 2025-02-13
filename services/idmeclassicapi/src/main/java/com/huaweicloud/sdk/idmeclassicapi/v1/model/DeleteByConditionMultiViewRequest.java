package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteByConditionMultiViewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mvModelName")

    private String mvModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RDMParamVODeleteByConditionVo body;

    public DeleteByConditionMultiViewRequest withMvModelName(String mvModelName) {
        this.mvModelName = mvModelName;
        return this;
    }

    /**
     * **参数解释：**  数据模型的英文名称。  **约束限制：**  不涉及。  **取值范围：**  大写字母开头，只能包含字母、数字、“_”，且长度为[1-60]个字符。  **默认取值：**  不涉及。 
     * @return mvModelName
     */
    public String getMvModelName() {
        return mvModelName;
    }

    public void setMvModelName(String mvModelName) {
        this.mvModelName = mvModelName;
    }

    public DeleteByConditionMultiViewRequest withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 应用ID。
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public DeleteByConditionMultiViewRequest withBody(RDMParamVODeleteByConditionVo body) {
        this.body = body;
        return this;
    }

    public DeleteByConditionMultiViewRequest withBody(Consumer<RDMParamVODeleteByConditionVo> bodySetter) {
        if (this.body == null) {
            this.body = new RDMParamVODeleteByConditionVo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RDMParamVODeleteByConditionVo getBody() {
        return body;
    }

    public void setBody(RDMParamVODeleteByConditionVo body) {
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
        DeleteByConditionMultiViewRequest that = (DeleteByConditionMultiViewRequest) obj;
        return Objects.equals(this.mvModelName, that.mvModelName) && Objects.equals(this.identifier, that.identifier)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mvModelName, identifier, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteByConditionMultiViewRequest {\n");
        sb.append("    mvModelName: ").append(toIndentedString(mvModelName)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
