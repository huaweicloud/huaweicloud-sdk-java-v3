package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ExecuteScalingPolicyRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ExecuteScalingPolicyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_policy_id")
    
    private String scalingPolicyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ExecuteScalingPolicyRequestBody body = null;

    public ExecuteScalingPolicyRequest withScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }

    


    /**
     * Get scalingPolicyId
     * @return scalingPolicyId
     */
    public String getScalingPolicyId() {
        return scalingPolicyId;
    }

    public void setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
    }

    public ExecuteScalingPolicyRequest withBody(ExecuteScalingPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public ExecuteScalingPolicyRequest withBody(Consumer<ExecuteScalingPolicyRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ExecuteScalingPolicyRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ExecuteScalingPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(ExecuteScalingPolicyRequestBody body) {
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
        ExecuteScalingPolicyRequest executeScalingPolicyRequest = (ExecuteScalingPolicyRequest) o;
        return Objects.equals(this.scalingPolicyId, executeScalingPolicyRequest.scalingPolicyId) &&
            Objects.equals(this.body, executeScalingPolicyRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingPolicyId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteScalingPolicyRequest {\n");
            sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
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

