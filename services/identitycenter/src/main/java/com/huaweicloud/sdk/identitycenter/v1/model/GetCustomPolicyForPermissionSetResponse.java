package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class GetCustomPolicyForPermissionSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_policy")

    private String customPolicy;

    public GetCustomPolicyForPermissionSetResponse withCustomPolicy(String customPolicy) {
        this.customPolicy = customPolicy;
        return this;
    }

    /**
     * 附加到权限集的自定义身份策略
     * @return customPolicy
     */
    public String getCustomPolicy() {
        return customPolicy;
    }

    public void setCustomPolicy(String customPolicy) {
        this.customPolicy = customPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetCustomPolicyForPermissionSetResponse that = (GetCustomPolicyForPermissionSetResponse) obj;
        return Objects.equals(this.customPolicy, that.customPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCustomPolicyForPermissionSetResponse {\n");
        sb.append("    customPolicy: ").append(toIndentedString(customPolicy)).append("\n");
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
