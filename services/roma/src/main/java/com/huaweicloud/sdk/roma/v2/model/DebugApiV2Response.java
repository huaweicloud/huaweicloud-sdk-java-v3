package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class DebugApiV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request")

    private String request;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private String response;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency")

    private String latency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    private String log;

    public DebugApiV2Response withRequest(String request) {
        this.request = request;
        return this;
    }

    /** 调试请求报文内容
     * 
     * @return request */
    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public DebugApiV2Response withResponse(String response) {
        this.response = response;
        return this;
    }

    /** 调试响应报文内容，响应消息体最大支持2097152字节，超过部分会被截断 > 响应消息体超过限制长度时，超过部分会被截断，并追加\"[TRUNCATED]\"信息。
     * 
     * @return response */
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public DebugApiV2Response withLatency(String latency) {
        this.latency = latency;
        return this;
    }

    /** 调试耗时，单位：毫秒
     * 
     * @return latency */
    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }

    public DebugApiV2Response withLog(String log) {
        this.log = log;
        return this;
    }

    /** 调试过程日志
     * 
     * @return log */
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebugApiV2Response debugApiV2Response = (DebugApiV2Response) o;
        return Objects.equals(this.request, debugApiV2Response.request)
            && Objects.equals(this.response, debugApiV2Response.response)
            && Objects.equals(this.latency, debugApiV2Response.latency)
            && Objects.equals(this.log, debugApiV2Response.log);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, response, latency, log);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugApiV2Response {\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
        sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
