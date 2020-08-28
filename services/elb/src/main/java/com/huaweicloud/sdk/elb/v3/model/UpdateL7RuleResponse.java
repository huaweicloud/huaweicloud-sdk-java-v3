package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.L7Rule;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateL7RuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule")
    
    private L7Rule rule = null;

    public UpdateL7RuleResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。 注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateL7RuleResponse withRule(L7Rule rule) {
        this.rule = rule;
        return this;
    }

    public UpdateL7RuleResponse withRule(Consumer<L7Rule> ruleSetter) {
        if(this.rule == null ){
            this.rule = new L7Rule();
            ruleSetter.accept(this.rule);
        }
        
        return this;
    }


    /**
     * Get rule
     * @return rule
     */
    public L7Rule getRule() {
        return rule;
    }

    public void setRule(L7Rule rule) {
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
        UpdateL7RuleResponse updateL7RuleResponse = (UpdateL7RuleResponse) o;
        return Objects.equals(this.requestId, updateL7RuleResponse.requestId) &&
            Objects.equals(this.rule, updateL7RuleResponse.rule);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, rule);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateL7RuleResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

