package com.huaweicloud.sdk.iam.v3.model;


import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AgencyPolicyRoleResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAgencyCustomPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private AgencyPolicyRoleResult role = null;

    public CreateAgencyCustomPolicyResponse withRole(AgencyPolicyRoleResult role) {
        this.role = role;
        return this;
    }

    public CreateAgencyCustomPolicyResponse withRole(Consumer<AgencyPolicyRoleResult> roleSetter) {
        if(this.role == null ){
            this.role = new AgencyPolicyRoleResult();
        }
        roleSetter.accept(this.role);
        return this;
    }


    /**
     * Get role
     * @return role
     */
    public AgencyPolicyRoleResult getRole() {
        return role;
    }

    public void setRole(AgencyPolicyRoleResult role) {
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
        CreateAgencyCustomPolicyResponse createAgencyCustomPolicyResponse = (CreateAgencyCustomPolicyResponse) o;
        return Objects.equals(this.role, createAgencyCustomPolicyResponse.role);
    }
    @Override
    public int hashCode() {
        return Objects.hash(role);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgencyCustomPolicyResponse {\n");
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

