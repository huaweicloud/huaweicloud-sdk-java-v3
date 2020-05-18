package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class InvokeFunctionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private String result;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log")
    
    private String log;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public InvokeFunctionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public InvokeFunctionResponse withResult(String result) {
        this.result = result;
        return this;
    }

    


    /**
     * 函数执行结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public InvokeFunctionResponse withLog(String log) {
        this.log = log;
        return this;
    }

    


    /**
     * 函数执行返回日志
     * @return log
     */
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public InvokeFunctionResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 函数执行返回状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvokeFunctionResponse invokeFunctionResponse = (InvokeFunctionResponse) o;
        return Objects.equals(this.requestId, invokeFunctionResponse.requestId) &&
            Objects.equals(this.result, invokeFunctionResponse.result) &&
            Objects.equals(this.log, invokeFunctionResponse.log) &&
            Objects.equals(this.status, invokeFunctionResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, result, log, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvokeFunctionResponse {\n");
            sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
            sb.append("    result: ").append(toIndentedString(result)).append("\n");
            sb.append("    log: ").append(toIndentedString(log)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

