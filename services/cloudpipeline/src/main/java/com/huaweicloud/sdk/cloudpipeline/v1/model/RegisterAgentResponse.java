package com.huaweicloud.sdk.cloudpipeline.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RegisterAgentResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private Object result = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error")
    
    private Object error = null;

    public RegisterAgentResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态信息
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RegisterAgentResponse withResult(Object result) {
        this.result = result;
        return this;
    }

    


    /**
     * 返回结果
     * @return result
     */
    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public RegisterAgentResponse withError(Object error) {
        this.error = error;
        return this;
    }

    


    /**
     * 返回错误
     * @return error
     */
    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegisterAgentResponse registerAgentResponse = (RegisterAgentResponse) o;
        return Objects.equals(this.status, registerAgentResponse.status) &&
            Objects.equals(this.result, registerAgentResponse.result) &&
            Objects.equals(this.error, registerAgentResponse.error);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, result, error);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterAgentResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

