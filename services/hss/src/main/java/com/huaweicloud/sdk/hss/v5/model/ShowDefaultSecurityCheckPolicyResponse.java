package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDefaultSecurityCheckPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_policy_content")

    private PwdCheckTagInfo pwdPolicyContent;

    public ShowDefaultSecurityCheckPolicyResponse withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数解释**： 策略名称 **取值范围**： 字符长度1-256位 
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ShowDefaultSecurityCheckPolicyResponse withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释**： 策略ID **取值范围**： 字符长度0-64位 
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ShowDefaultSecurityCheckPolicyResponse withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 策略详情
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ShowDefaultSecurityCheckPolicyResponse withPwdPolicyContent(PwdCheckTagInfo pwdPolicyContent) {
        this.pwdPolicyContent = pwdPolicyContent;
        return this;
    }

    public ShowDefaultSecurityCheckPolicyResponse withPwdPolicyContent(
        Consumer<PwdCheckTagInfo> pwdPolicyContentSetter) {
        if (this.pwdPolicyContent == null) {
            this.pwdPolicyContent = new PwdCheckTagInfo();
            pwdPolicyContentSetter.accept(this.pwdPolicyContent);
        }

        return this;
    }

    /**
     * Get pwdPolicyContent
     * @return pwdPolicyContent
     */
    public PwdCheckTagInfo getPwdPolicyContent() {
        return pwdPolicyContent;
    }

    public void setPwdPolicyContent(PwdCheckTagInfo pwdPolicyContent) {
        this.pwdPolicyContent = pwdPolicyContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDefaultSecurityCheckPolicyResponse that = (ShowDefaultSecurityCheckPolicyResponse) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.content, that.content)
            && Objects.equals(this.pwdPolicyContent, that.pwdPolicyContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, policyId, content, pwdPolicyContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDefaultSecurityCheckPolicyResponse {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    pwdPolicyContent: ").append(toIndentedString(pwdPolicyContent)).append("\n");
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
