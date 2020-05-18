package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.EnableOrDisableScalingGroupRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class EnableOrDisableScalingGroupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_id")
    
    private String scalingGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private EnableOrDisableScalingGroupRequestBody body = null;

    public EnableOrDisableScalingGroupRequest withScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }

    


    /**
     * Get scalingGroupId
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public EnableOrDisableScalingGroupRequest withBody(EnableOrDisableScalingGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public EnableOrDisableScalingGroupRequest withBody(Consumer<EnableOrDisableScalingGroupRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new EnableOrDisableScalingGroupRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public EnableOrDisableScalingGroupRequestBody getBody() {
        return body;
    }

    public void setBody(EnableOrDisableScalingGroupRequestBody body) {
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
        EnableOrDisableScalingGroupRequest enableOrDisableScalingGroupRequest = (EnableOrDisableScalingGroupRequest) o;
        return Objects.equals(this.scalingGroupId, enableOrDisableScalingGroupRequest.scalingGroupId) &&
            Objects.equals(this.body, enableOrDisableScalingGroupRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableOrDisableScalingGroupRequest {\n");
            sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
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

