package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.LoginPolicyOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdateDomainLoginPolicyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="login_policy")
    
    private LoginPolicyOption loginPolicy = null;

    public UpdateDomainLoginPolicyRequestBody withLoginPolicy(LoginPolicyOption loginPolicy) {
        this.loginPolicy = loginPolicy;
        return this;
    }

    public UpdateDomainLoginPolicyRequestBody withLoginPolicy(Consumer<LoginPolicyOption> loginPolicySetter) {
        if(this.loginPolicy == null ){
            this.loginPolicy = new LoginPolicyOption();
            loginPolicySetter.accept(this.loginPolicy);
        }
        
        return this;
    }


    /**
     * Get loginPolicy
     * @return loginPolicy
     */
    public LoginPolicyOption getLoginPolicy() {
        return loginPolicy;
    }

    public void setLoginPolicy(LoginPolicyOption loginPolicy) {
        this.loginPolicy = loginPolicy;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainLoginPolicyRequestBody updateDomainLoginPolicyRequestBody = (UpdateDomainLoginPolicyRequestBody) o;
        return Objects.equals(this.loginPolicy, updateDomainLoginPolicyRequestBody.loginPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loginPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainLoginPolicyRequestBody {\n");
        sb.append("    loginPolicy: ").append(toIndentedString(loginPolicy)).append("\n");
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

