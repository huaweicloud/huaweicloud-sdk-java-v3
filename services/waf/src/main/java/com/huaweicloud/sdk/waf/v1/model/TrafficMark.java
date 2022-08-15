package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流量标识（用于攻击惩罚），WAF根据这些配置判断如何在Header中识别客户端IP（代理模式）、如何在Cookie中识别Session、如何在参数中识别User。
 */
public class TrafficMark {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sip")

    private List<String> sip = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cookie")

    private String cookie;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private String params;

    public TrafficMark withSip(List<String> sip) {
        this.sip = sip;
        return this;
    }

    public TrafficMark addSipItem(String sipItem) {
        if (this.sip == null) {
            this.sip = new ArrayList<>();
        }
        this.sip.add(sipItem);
        return this;
    }

    public TrafficMark withSip(Consumer<List<String>> sipSetter) {
        if (this.sip == null) {
            this.sip = new ArrayList<>();
        }
        sipSetter.accept(this.sip);
        return this;
    }

    /**
     * IP标记，客户端最原始的IP地址的HTTP请求头字段。
     * @return sip
     */
    public List<String> getSip() {
        return sip;
    }

    public void setSip(List<String> sip) {
        this.sip = sip;
    }

    public TrafficMark withCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }

    /**
     * Session标记，用于Cookie恶意请求的攻击惩罚功能。在选择Cookie拦截的攻击惩罚功能前，必须配置该标识
     * @return cookie
     */
    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public TrafficMark withParams(String params) {
        this.params = params;
        return this;
    }

    /**
     * User标记，用于Params恶意请求的攻击惩罚功能。在选择Params拦截的攻击惩罚功能前，必须配置该标识。
     * @return params
     */
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrafficMark trafficMark = (TrafficMark) o;
        return Objects.equals(this.sip, trafficMark.sip) && Objects.equals(this.cookie, trafficMark.cookie)
            && Objects.equals(this.params, trafficMark.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sip, cookie, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrafficMark {\n");
        sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
        sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
