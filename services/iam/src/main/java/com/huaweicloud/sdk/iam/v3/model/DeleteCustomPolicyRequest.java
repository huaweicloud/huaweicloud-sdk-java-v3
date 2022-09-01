package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCustomPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    @JacksonXmlProperty(localName = "role_id")

    private String roleId;

    public DeleteCustomPolicyRequest withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 待删除的自定义策略ID，获取方式请参见：[自定义策略ID](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=IAM&api=ListCustomPolicies)。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteCustomPolicyRequest deleteCustomPolicyRequest = (DeleteCustomPolicyRequest) o;
        return Objects.equals(this.roleId, deleteCustomPolicyRequest.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCustomPolicyRequest {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
