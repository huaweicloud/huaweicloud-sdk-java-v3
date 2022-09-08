package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateL7policyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy")

    private CreateL7policyReq l7policy;

    public CreateL7policyRequestBody withL7policy(CreateL7policyReq l7policy) {
        this.l7policy = l7policy;
        return this;
    }

    public CreateL7policyRequestBody withL7policy(Consumer<CreateL7policyReq> l7policySetter) {
        if (this.l7policy == null) {
            this.l7policy = new CreateL7policyReq();
            l7policySetter.accept(this.l7policy);
        }

        return this;
    }

    /**
     * Get l7policy
     * @return l7policy
     */
    public CreateL7policyReq getL7policy() {
        return l7policy;
    }

    public void setL7policy(CreateL7policyReq l7policy) {
        this.l7policy = l7policy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateL7policyRequestBody createL7policyRequestBody = (CreateL7policyRequestBody) o;
        return Objects.equals(this.l7policy, createL7policyRequestBody.l7policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l7policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateL7policyRequestBody {\n");
        sb.append("    l7policy: ").append(toIndentedString(l7policy)).append("\n");
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
