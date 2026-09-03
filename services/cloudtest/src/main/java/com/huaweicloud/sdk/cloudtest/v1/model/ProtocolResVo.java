package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProtocolResVo
 */
public class ProtocolResVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_code")

    private List<Integer> responseCode = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_time")

    private String responseTime;

    public ProtocolResVo withResponseCode(List<Integer> responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    public ProtocolResVo addResponseCodeItem(Integer responseCodeItem) {
        if (this.responseCode == null) {
            this.responseCode = new ArrayList<>();
        }
        this.responseCode.add(responseCodeItem);
        return this;
    }

    public ProtocolResVo withResponseCode(Consumer<List<Integer>> responseCodeSetter) {
        if (this.responseCode == null) {
            this.responseCode = new ArrayList<>();
        }
        responseCodeSetter.accept(this.responseCode);
        return this;
    }

    /**
     * 期望响应的状态码
     * @return responseCode
     */
    public List<Integer> getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(List<Integer> responseCode) {
        this.responseCode = responseCode;
    }

    public ProtocolResVo withResponseTime(String responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    /**
     * 期望响应时间
     * @return responseTime
     */
    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtocolResVo that = (ProtocolResVo) obj;
        return Objects.equals(this.responseCode, that.responseCode)
            && Objects.equals(this.responseTime, that.responseTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseCode, responseTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtocolResVo {\n");
        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
        sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
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
