package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 可信上下文信息。
 */
public class ProvidedContextDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "context_provider_urn")

    private String contextProviderUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "context_assertion")

    private String contextAssertion;

    public ProvidedContextDto withContextProviderUrn(String contextProviderUrn) {
        this.contextProviderUrn = contextProviderUrn;
        return this;
    }

    /**
     * **参数解释**： 生成可信上下文断言的提供者的URN。  **约束限制**： 长度最多为1500个字符。格式为5段，用\":\"分隔，各段允许大小写字母、数字、\"+\"、\"/\"、\"=\"、\"-\"、\"_\"（第2段还额外允许 \"*\"），长度限制为：第1段至少1位，第2段0~255位，第3段1~64位，第4段1~64位，第5段至少1位（任意字符）。  **取值范围**： 不涉及。  **默认取值**： 不涉及。 
     * @return contextProviderUrn
     */
    public String getContextProviderUrn() {
        return contextProviderUrn;
    }

    public void setContextProviderUrn(String contextProviderUrn) {
        this.contextProviderUrn = contextProviderUrn;
    }

    public ProvidedContextDto withContextAssertion(String contextAssertion) {
        this.contextAssertion = contextAssertion;
        return this;
    }

    /**
     * **参数解释**： 经过签名和加密的可信上下文断言。  **约束限制**： 不涉及。  **取值范围**： 不涉及。  **默认取值**： 不涉及。 
     * @return contextAssertion
     */
    public String getContextAssertion() {
        return contextAssertion;
    }

    public void setContextAssertion(String contextAssertion) {
        this.contextAssertion = contextAssertion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProvidedContextDto that = (ProvidedContextDto) obj;
        return Objects.equals(this.contextProviderUrn, that.contextProviderUrn)
            && Objects.equals(this.contextAssertion, that.contextAssertion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contextProviderUrn, contextAssertion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvidedContextDto {\n");
        sb.append("    contextProviderUrn: ").append(toIndentedString(contextProviderUrn)).append("\n");
        sb.append("    contextAssertion: ").append(toIndentedString(contextAssertion)).append("\n");
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
