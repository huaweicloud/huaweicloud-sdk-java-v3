package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.CreateL7ruleV2Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreateL7ruleRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7rule")
    
    private CreateL7ruleV2Req l7rule = null;

    public CreateL7ruleRequestBody withL7rule(CreateL7ruleV2Req l7rule) {
        this.l7rule = l7rule;
        return this;
    }

    public CreateL7ruleRequestBody withL7rule(Consumer<CreateL7ruleV2Req> l7ruleSetter) {
        if(this.l7rule == null ){
            this.l7rule = new CreateL7ruleV2Req();
            l7ruleSetter.accept(this.l7rule);
        }
        
        return this;
    }


    /**
     * Get l7rule
     * @return l7rule
     */
    public CreateL7ruleV2Req getL7rule() {
        return l7rule;
    }

    public void setL7rule(CreateL7ruleV2Req l7rule) {
        this.l7rule = l7rule;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateL7ruleRequestBody createL7ruleRequestBody = (CreateL7ruleRequestBody) o;
        return Objects.equals(this.l7rule, createL7ruleRequestBody.l7rule);
    }
    @Override
    public int hashCode() {
        return Objects.hash(l7rule);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateL7ruleRequestBody {\n");
        sb.append("    l7rule: ").append(toIndentedString(l7rule)).append("\n");
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

