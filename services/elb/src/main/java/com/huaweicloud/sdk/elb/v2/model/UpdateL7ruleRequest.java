package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7ruleRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateL7ruleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7policy_id")
    
    private String l7policyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7rule_id")
    
    private String l7ruleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateL7ruleRequestBody body;

    public UpdateL7ruleRequest withL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
        return this;
    }

    


    /**
     * Get l7policyId
     * @return l7policyId
     */
    public String getL7policyId() {
        return l7policyId;
    }

    public void setL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
    }

    

    public UpdateL7ruleRequest withL7ruleId(String l7ruleId) {
        this.l7ruleId = l7ruleId;
        return this;
    }

    


    /**
     * Get l7ruleId
     * @return l7ruleId
     */
    public String getL7ruleId() {
        return l7ruleId;
    }

    public void setL7ruleId(String l7ruleId) {
        this.l7ruleId = l7ruleId;
    }

    

    public UpdateL7ruleRequest withBody(UpdateL7ruleRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateL7ruleRequest withBody(Consumer<UpdateL7ruleRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateL7ruleRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateL7ruleRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateL7ruleRequestBody body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateL7ruleRequest updateL7ruleRequest = (UpdateL7ruleRequest) o;
        return Objects.equals(this.l7policyId, updateL7ruleRequest.l7policyId) &&
            Objects.equals(this.l7ruleId, updateL7ruleRequest.l7ruleId) &&
            Objects.equals(this.body, updateL7ruleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(l7policyId, l7ruleId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateL7ruleRequest {\n");
        sb.append("    l7policyId: ").append(toIndentedString(l7policyId)).append("\n");
        sb.append("    l7ruleId: ").append(toIndentedString(l7ruleId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

