package com.huaweicloud.sdk.iam.v3.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.ServicePolicyRoleOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CreateCloudServiceCustomPolicyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private ServicePolicyRoleOption role = null;

    public CreateCloudServiceCustomPolicyRequestBody withRole(ServicePolicyRoleOption role) {
        this.role = role;
        return this;
    }

    public CreateCloudServiceCustomPolicyRequestBody withRole(Consumer<ServicePolicyRoleOption> roleSetter) {
        if(this.role == null ){
            this.role = new ServicePolicyRoleOption();
        }
        roleSetter.accept(this.role);
        return this;
    }


    /**
     * Get role
     * @return role
     */
    public ServicePolicyRoleOption getRole() {
        return role;
    }

    public void setRole(ServicePolicyRoleOption role) {
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
        CreateCloudServiceCustomPolicyRequestBody createCloudServiceCustomPolicyRequestBody = (CreateCloudServiceCustomPolicyRequestBody) o;
        return Objects.equals(this.role, createCloudServiceCustomPolicyRequestBody.role);
    }
    @Override
    public int hashCode() {
        return Objects.hash(role);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudServiceCustomPolicyRequestBody {\n");
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

