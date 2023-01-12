package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBuiltInPolicyDefinitionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Auth-Token")

    private String xAuthToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_definition_id")

    private String policyDefinitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    public ShowBuiltInPolicyDefinitionRequest withXAuthToken(String xAuthToken) {
        this.xAuthToken = xAuthToken;
        return this;
    }

    /**
     * 用户Token。 获取Token，请参考《统一身份认证服务API参考》的“获取用户Token”章节。请求响应成功后在响应消息头中包含的“X-Subject-Token”的值即为Token值。
     * @return xAuthToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Auth-Token")
    public String getXAuthToken() {
        return xAuthToken;
    }

    public void setXAuthToken(String xAuthToken) {
        this.xAuthToken = xAuthToken;
    }

    public ShowBuiltInPolicyDefinitionRequest withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * 策略ID
     * @return policyDefinitionId
     */
    public String getPolicyDefinitionId() {
        return policyDefinitionId;
    }

    public void setPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    public ShowBuiltInPolicyDefinitionRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 选择接口返回的信息的语言，默认为\"zh-cn\"中文
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBuiltInPolicyDefinitionRequest showBuiltInPolicyDefinitionRequest = (ShowBuiltInPolicyDefinitionRequest) o;
        return Objects.equals(this.xAuthToken, showBuiltInPolicyDefinitionRequest.xAuthToken)
            && Objects.equals(this.policyDefinitionId, showBuiltInPolicyDefinitionRequest.policyDefinitionId)
            && Objects.equals(this.xLanguage, showBuiltInPolicyDefinitionRequest.xLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAuthToken, policyDefinitionId, xLanguage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBuiltInPolicyDefinitionRequest {\n");
        sb.append("    xAuthToken: ").append(toIndentedString(xAuthToken)).append("\n");
        sb.append("    policyDefinitionId: ").append(toIndentedString(policyDefinitionId)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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
