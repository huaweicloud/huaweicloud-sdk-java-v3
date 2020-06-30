package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AgencyPolicyRoleOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CreateAgencyCustomPolicyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private AgencyPolicyRoleOption role = null;

    public CreateAgencyCustomPolicyRequestBody withRole(AgencyPolicyRoleOption role) {
        this.role = role;
        return this;
    }

    public CreateAgencyCustomPolicyRequestBody withRole(Consumer<AgencyPolicyRoleOption> roleSetter) {
        if(this.role == null ){
            this.role = new AgencyPolicyRoleOption();
            roleSetter.accept(this.role);
        }
        
        return this;
    }


    /**
     * Get role
     * @return role
     */
    public AgencyPolicyRoleOption getRole() {
        return role;
    }

    public void setRole(AgencyPolicyRoleOption role) {
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
        CreateAgencyCustomPolicyRequestBody createAgencyCustomPolicyRequestBody = (CreateAgencyCustomPolicyRequestBody) o;
        return Objects.equals(this.role, createAgencyCustomPolicyRequestBody.role);
    }
    @Override
    public int hashCode() {
        return Objects.hash(role);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgencyCustomPolicyRequestBody {\n");
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

