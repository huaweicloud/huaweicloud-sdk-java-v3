package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class UpdateL7PolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy")

    private UpdateL7PolicyOption l7policy;

    public UpdateL7PolicyRequestBody withL7policy(UpdateL7PolicyOption l7policy) {
        this.l7policy = l7policy;
        return this;
    }

    public UpdateL7PolicyRequestBody withL7policy(Consumer<UpdateL7PolicyOption> l7policySetter) {
        if (this.l7policy == null) {
            this.l7policy = new UpdateL7PolicyOption();
            l7policySetter.accept(this.l7policy);
        }

        return this;
    }

    /** Get l7policy
     * 
     * @return l7policy */
    public UpdateL7PolicyOption getL7policy() {
        return l7policy;
    }

    public void setL7policy(UpdateL7PolicyOption l7policy) {
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
        UpdateL7PolicyRequestBody updateL7PolicyRequestBody = (UpdateL7PolicyRequestBody) o;
        return Objects.equals(this.l7policy, updateL7PolicyRequestBody.l7policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l7policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateL7PolicyRequestBody {\n");
        sb.append("    l7policy: ").append(toIndentedString(l7policy)).append("\n");
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
