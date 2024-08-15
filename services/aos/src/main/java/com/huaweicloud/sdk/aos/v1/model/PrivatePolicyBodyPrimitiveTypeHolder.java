package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivatePolicyBodyPrimitiveTypeHolder
 */
public class PrivatePolicyBodyPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_body")

    private String policyBody;

    public PrivatePolicyBodyPrimitiveTypeHolder withPolicyBody(String policyBody) {
        this.policyBody = policyBody;
        return this;
    }

    /**
     * 策略内容。仅支持OPA开源引擎识别的，以Rego（https://www.openpolicyagent.org/docs/latest/policy-language/）语言编写的策略模板。  policy_body和policy_uri 必须有且只有一个存在
     * @return policyBody
     */
    public String getPolicyBody() {
        return policyBody;
    }

    public void setPolicyBody(String policyBody) {
        this.policyBody = policyBody;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivatePolicyBodyPrimitiveTypeHolder that = (PrivatePolicyBodyPrimitiveTypeHolder) obj;
        return Objects.equals(this.policyBody, that.policyBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivatePolicyBodyPrimitiveTypeHolder {\n");
        sb.append("    policyBody: ").append(toIndentedString(policyBody)).append("\n");
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
