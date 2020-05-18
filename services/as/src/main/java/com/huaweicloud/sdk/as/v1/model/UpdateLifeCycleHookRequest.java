package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.UpdateLifeCycleHookRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class UpdateLifeCycleHookRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_id")
    
    private String scalingGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lifecycle_hook_name")
    
    private String lifecycleHookName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateLifeCycleHookRequestBody body = null;

    public UpdateLifeCycleHookRequest withScalingGroupId(String scalingGroupId) {
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

    public UpdateLifeCycleHookRequest withLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    


    /**
     * Get lifecycleHookName
     * @return lifecycleHookName
     */
    public String getLifecycleHookName() {
        return lifecycleHookName;
    }

    public void setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }

    public UpdateLifeCycleHookRequest withBody(UpdateLifeCycleHookRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateLifeCycleHookRequest withBody(Consumer<UpdateLifeCycleHookRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateLifeCycleHookRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateLifeCycleHookRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateLifeCycleHookRequestBody body) {
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
        UpdateLifeCycleHookRequest updateLifeCycleHookRequest = (UpdateLifeCycleHookRequest) o;
        return Objects.equals(this.scalingGroupId, updateLifeCycleHookRequest.scalingGroupId) &&
            Objects.equals(this.lifecycleHookName, updateLifeCycleHookRequest.lifecycleHookName) &&
            Objects.equals(this.body, updateLifeCycleHookRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupId, lifecycleHookName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLifeCycleHookRequest {\n");
            sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
            sb.append("    lifecycleHookName: ").append(toIndentedString(lifecycleHookName)).append("\n");
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

