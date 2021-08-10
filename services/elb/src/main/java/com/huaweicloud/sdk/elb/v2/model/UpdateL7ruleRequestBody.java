package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class UpdateL7ruleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private UpdateL7ruleReq rule;

    public UpdateL7ruleRequestBody withRule(UpdateL7ruleReq rule) {
        this.rule = rule;
        return this;
    }

    public UpdateL7ruleRequestBody withRule(Consumer<UpdateL7ruleReq> ruleSetter) {
        if (this.rule == null) {
            this.rule = new UpdateL7ruleReq();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    /** Get rule
     * 
     * @return rule */
    public UpdateL7ruleReq getRule() {
        return rule;
    }

    public void setRule(UpdateL7ruleReq rule) {
        this.rule = rule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateL7ruleRequestBody updateL7ruleRequestBody = (UpdateL7ruleRequestBody) o;
        return Objects.equals(this.rule, updateL7ruleRequestBody.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateL7ruleRequestBody {\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
