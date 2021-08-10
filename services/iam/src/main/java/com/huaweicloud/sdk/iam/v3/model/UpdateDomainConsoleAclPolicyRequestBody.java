package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateDomainConsoleAclPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console_acl_policy")

    private AclPolicyOption consoleAclPolicy;

    public UpdateDomainConsoleAclPolicyRequestBody withConsoleAclPolicy(AclPolicyOption consoleAclPolicy) {
        this.consoleAclPolicy = consoleAclPolicy;
        return this;
    }

    public UpdateDomainConsoleAclPolicyRequestBody withConsoleAclPolicy(
        Consumer<AclPolicyOption> consoleAclPolicySetter) {
        if (this.consoleAclPolicy == null) {
            this.consoleAclPolicy = new AclPolicyOption();
            consoleAclPolicySetter.accept(this.consoleAclPolicy);
        }

        return this;
    }

    /** Get consoleAclPolicy
     * 
     * @return consoleAclPolicy */
    public AclPolicyOption getConsoleAclPolicy() {
        return consoleAclPolicy;
    }

    public void setConsoleAclPolicy(AclPolicyOption consoleAclPolicy) {
        this.consoleAclPolicy = consoleAclPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainConsoleAclPolicyRequestBody updateDomainConsoleAclPolicyRequestBody =
            (UpdateDomainConsoleAclPolicyRequestBody) o;
        return Objects.equals(this.consoleAclPolicy, updateDomainConsoleAclPolicyRequestBody.consoleAclPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consoleAclPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainConsoleAclPolicyRequestBody {\n");
        sb.append("    consoleAclPolicy: ").append(toIndentedString(consoleAclPolicy)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
