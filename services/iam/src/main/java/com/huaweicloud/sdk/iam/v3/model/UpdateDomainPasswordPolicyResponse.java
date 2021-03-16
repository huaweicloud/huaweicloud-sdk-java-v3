package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.PasswordPolicyResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateDomainPasswordPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password_policy")
    
    private PasswordPolicyResult passwordPolicy;

    public UpdateDomainPasswordPolicyResponse withPasswordPolicy(PasswordPolicyResult passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }

    public UpdateDomainPasswordPolicyResponse withPasswordPolicy(Consumer<PasswordPolicyResult> passwordPolicySetter) {
        if(this.passwordPolicy == null ){
            this.passwordPolicy = new PasswordPolicyResult();
            passwordPolicySetter.accept(this.passwordPolicy);
        }
        
        return this;
    }


    /**
     * Get passwordPolicy
     * @return passwordPolicy
     */
    public PasswordPolicyResult getPasswordPolicy() {
        return passwordPolicy;
    }

    public void setPasswordPolicy(PasswordPolicyResult passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainPasswordPolicyResponse updateDomainPasswordPolicyResponse = (UpdateDomainPasswordPolicyResponse) o;
        return Objects.equals(this.passwordPolicy, updateDomainPasswordPolicyResponse.passwordPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(passwordPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainPasswordPolicyResponse {\n");
        sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
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

