package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 请求体
 */
public class AttachManagedPolicyToPermissionSetReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_policy_id")

    private String managedPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_policy_name")

    private String managedPolicyName;

    public AttachManagedPolicyToPermissionSetReqBody withManagedPolicyId(String managedPolicyId) {
        this.managedPolicyId = managedPolicyId;
        return this;
    }

    /**
     * IAM系统身份策略唯一标识
     * @return managedPolicyId
     */
    public String getManagedPolicyId() {
        return managedPolicyId;
    }

    public void setManagedPolicyId(String managedPolicyId) {
        this.managedPolicyId = managedPolicyId;
    }

    public AttachManagedPolicyToPermissionSetReqBody withManagedPolicyName(String managedPolicyName) {
        this.managedPolicyName = managedPolicyName;
        return this;
    }

    /**
     * IAM系统身份策略名称
     * @return managedPolicyName
     */
    public String getManagedPolicyName() {
        return managedPolicyName;
    }

    public void setManagedPolicyName(String managedPolicyName) {
        this.managedPolicyName = managedPolicyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachManagedPolicyToPermissionSetReqBody that = (AttachManagedPolicyToPermissionSetReqBody) obj;
        return Objects.equals(this.managedPolicyId, that.managedPolicyId)
            && Objects.equals(this.managedPolicyName, that.managedPolicyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedPolicyId, managedPolicyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachManagedPolicyToPermissionSetReqBody {\n");
        sb.append("    managedPolicyId: ").append(toIndentedString(managedPolicyId)).append("\n");
        sb.append("    managedPolicyName: ").append(toIndentedString(managedPolicyName)).append("\n");
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
