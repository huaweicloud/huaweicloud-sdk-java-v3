package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CopyParameterGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_id")

    private String configId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ConfigurationCopyReqV3 body;

    public CopyParameterGroupRequest withConfigId(String configId) {
        this.configId = configId;
        return this;
    }

    /**
     * **参数解释**：  参数组ID。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，长度为36个字符。  **默认取值**：  不涉及。
     * @return configId
     */
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public CopyParameterGroupRequest withBody(ConfigurationCopyReqV3 body) {
        this.body = body;
        return this;
    }

    public CopyParameterGroupRequest withBody(Consumer<ConfigurationCopyReqV3> bodySetter) {
        if (this.body == null) {
            this.body = new ConfigurationCopyReqV3();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ConfigurationCopyReqV3 getBody() {
        return body;
    }

    public void setBody(ConfigurationCopyReqV3 body) {
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
        CopyParameterGroupRequest that = (CopyParameterGroupRequest) obj;
        return Objects.equals(this.configId, that.configId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyParameterGroupRequest {\n");
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
