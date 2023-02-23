package com.huaweicloud.sdk.ges.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DeregisterScenes2Response extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="success")
    
    private List<String> success = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failure")
    
    private List<String> failure = null;
    
    public DeregisterScenes2Response withSuccess(List<String> success) {
        this.success = success;
        return this;
    }

    
    public DeregisterScenes2Response addSuccessItem(String successItem) {
        if(this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public DeregisterScenes2Response withSuccess(Consumer<List<String>> successSetter) {
        if(this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 取消订阅成功的SceneApplication。
     * @return success
     */
    public List<String> getSuccess() {
        return success;
    }

    public void setSuccess(List<String> success) {
        this.success = success;
    }

    

    public DeregisterScenes2Response withFailure(List<String> failure) {
        this.failure = failure;
        return this;
    }

    
    public DeregisterScenes2Response addFailureItem(String failureItem) {
        if(this.failure == null) {
            this.failure = new ArrayList<>();
        }
        this.failure.add(failureItem);
        return this;
    }

    public DeregisterScenes2Response withFailure(Consumer<List<String>> failureSetter) {
        if(this.failure == null) {
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /**
     * 取消订阅失败的SceneApplication。
     * @return failure
     */
    public List<String> getFailure() {
        return failure;
    }

    public void setFailure(List<String> failure) {
        this.failure = failure;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeregisterScenes2Response deregisterScenes2Response = (DeregisterScenes2Response) o;
        return Objects.equals(this.success, deregisterScenes2Response.success) &&
            Objects.equals(this.failure, deregisterScenes2Response.failure);
    }
    @Override
    public int hashCode() {
        return Objects.hash(success, failure);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeregisterScenes2Response {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
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

