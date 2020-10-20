package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7ruleV2Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class UpdateL7ruleRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule")
    
    private UpdateL7ruleV2Req rule = null;

    public UpdateL7ruleRequestBody withRule(UpdateL7ruleV2Req rule) {
        this.rule = rule;
        return this;
    }

    public UpdateL7ruleRequestBody withRule(Consumer<UpdateL7ruleV2Req> ruleSetter) {
        if(this.rule == null ){
            this.rule = new UpdateL7ruleV2Req();
            ruleSetter.accept(this.rule);
        }
        
        return this;
    }


    /**
     * Get rule
     * @return rule
     */
    public UpdateL7ruleV2Req getRule() {
        return rule;
    }

    public void setRule(UpdateL7ruleV2Req rule) {
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

