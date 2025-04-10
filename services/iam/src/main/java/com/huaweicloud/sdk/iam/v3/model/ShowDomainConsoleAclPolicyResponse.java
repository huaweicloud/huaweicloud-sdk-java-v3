package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDomainConsoleAclPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console_acl_policy")

    private ConsoleAclPolicyResult consoleAclPolicy;

    public ShowDomainConsoleAclPolicyResponse withConsoleAclPolicy(ConsoleAclPolicyResult consoleAclPolicy) {
        this.consoleAclPolicy = consoleAclPolicy;
        return this;
    }

    public ShowDomainConsoleAclPolicyResponse withConsoleAclPolicy(
        Consumer<ConsoleAclPolicyResult> consoleAclPolicySetter) {
        if (this.consoleAclPolicy == null) {
            this.consoleAclPolicy = new ConsoleAclPolicyResult();
            consoleAclPolicySetter.accept(this.consoleAclPolicy);
        }

        return this;
    }

    /**
     * Get consoleAclPolicy
     * @return consoleAclPolicy
     */
    public ConsoleAclPolicyResult getConsoleAclPolicy() {
        return consoleAclPolicy;
    }

    public void setConsoleAclPolicy(ConsoleAclPolicyResult consoleAclPolicy) {
        this.consoleAclPolicy = consoleAclPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainConsoleAclPolicyResponse that = (ShowDomainConsoleAclPolicyResponse) obj;
        return Objects.equals(this.consoleAclPolicy, that.consoleAclPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consoleAclPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainConsoleAclPolicyResponse {\n");
        sb.append("    consoleAclPolicy: ").append(toIndentedString(consoleAclPolicy)).append("\n");
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
