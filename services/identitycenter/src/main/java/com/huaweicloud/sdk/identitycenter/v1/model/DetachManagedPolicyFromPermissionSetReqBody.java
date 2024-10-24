package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DetachManagedPolicyFromPermissionSetReqBody请求体
 */
public class DetachManagedPolicyFromPermissionSetReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_policy_id")

    private String managedPolicyId;

    public DetachManagedPolicyFromPermissionSetReqBody withManagedPolicyId(String managedPolicyId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetachManagedPolicyFromPermissionSetReqBody that = (DetachManagedPolicyFromPermissionSetReqBody) obj;
        return Objects.equals(this.managedPolicyId, that.managedPolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedPolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachManagedPolicyFromPermissionSetReqBody {\n");
        sb.append("    managedPolicyId: ").append(toIndentedString(managedPolicyId)).append("\n");
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
