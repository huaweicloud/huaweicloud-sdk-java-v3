package com.huaweicloud.sdk.iam.v3.model;


import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.ServicePolicyRoleResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateCloudServiceCustomPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private ServicePolicyRoleResult role = null;

    public UpdateCloudServiceCustomPolicyResponse withRole(ServicePolicyRoleResult role) {
        this.role = role;
        return this;
    }

    public UpdateCloudServiceCustomPolicyResponse withRole(Consumer<ServicePolicyRoleResult> roleSetter) {
        if(this.role == null ){
            this.role = new ServicePolicyRoleResult();
        }
        roleSetter.accept(this.role);
        return this;
    }


    /**
     * Get role
     * @return role
     */
    public ServicePolicyRoleResult getRole() {
        return role;
    }

    public void setRole(ServicePolicyRoleResult role) {
        this.role = role;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCloudServiceCustomPolicyResponse updateCloudServiceCustomPolicyResponse = (UpdateCloudServiceCustomPolicyResponse) o;
        return Objects.equals(this.role, updateCloudServiceCustomPolicyResponse.role);
    }
    @Override
    public int hashCode() {
        return Objects.hash(role);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCloudServiceCustomPolicyResponse {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

