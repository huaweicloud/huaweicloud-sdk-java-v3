package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流量标识（用于攻击惩罚）
 */
public class WafTrafficMark {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sip")

    private List<String> sip = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cookie")

    private String cookie;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private String params;

    public WafTrafficMark withSip(List<String> sip) {
        this.sip = sip;
        return this;
    }

    public WafTrafficMark addSipItem(String sipItem) {
        if (this.sip == null) {
            this.sip = new ArrayList<>();
        }
        this.sip.add(sipItem);
        return this;
    }

    public WafTrafficMark withSip(Consumer<List<String>> sipSetter) {
        if (this.sip == null) {
            this.sip = new ArrayList<>();
        }
        sipSetter.accept(this.sip);
        return this;
    }

    /**
     * 惩罚ip
     * @return sip
     */
    public List<String> getSip() {
        return sip;
    }

    public void setSip(List<String> sip) {
        this.sip = sip;
    }

    public WafTrafficMark withCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }

    /**
     * cookie
     * @return cookie
     */
    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public WafTrafficMark withParams(String params) {
        this.params = params;
        return this;
    }

    /**
     * 参数
     * @return params
     */
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WafTrafficMark that = (WafTrafficMark) obj;
        return Objects.equals(this.sip, that.sip) && Objects.equals(this.cookie, that.cookie)
            && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sip, cookie, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WafTrafficMark {\n");
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
