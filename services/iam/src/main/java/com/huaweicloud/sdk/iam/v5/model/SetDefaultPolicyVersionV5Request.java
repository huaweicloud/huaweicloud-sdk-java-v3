package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class SetDefaultPolicyVersionV5Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    public SetDefaultPolicyVersionV5Request withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 身份策略ID，长度为1到64个字符，只包含字母、数字和\"-\"的字符串。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public SetDefaultPolicyVersionV5Request withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 身份策略版本号，以\"v\"开头后跟数字的字符串，例如\"v5\"。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetDefaultPolicyVersionV5Request that = (SetDefaultPolicyVersionV5Request) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.versionId, that.versionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, versionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetDefaultPolicyVersionV5Request {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
