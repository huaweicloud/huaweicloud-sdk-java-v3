package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 攻击类型 */
public class ListEventResponseBodyItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sip")

    private String sip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack")

    private String attack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private String rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload")

    private String payload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_line")

    private String requestLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private ListEventResponseBodyHeaders headers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cookie")

    private String cookie;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_time")

    private Long responseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_size")

    private Integer responseSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_body")

    private String responseBody;

    public ListEventResponseBodyItems withId(String id) {
        this.id = id;
        return this;
    }

    /** 事件id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListEventResponseBodyItems withTime(Long time) {
        this.time = time;
        return this;
    }

    /** 次数
     * 
     * @return time */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public ListEventResponseBodyItems withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /** 策略id
     * 
     * @return policyid */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public ListEventResponseBodyItems withSip(String sip) {
        this.sip = sip;
        return this;
    }

    /** 源ip
     * 
     * @return sip */
    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public ListEventResponseBodyItems withHost(String host) {
        this.host = host;
        return this;
    }

    /** 域名
     * 
     * @return host */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ListEventResponseBodyItems withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 攻击的url链接
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ListEventResponseBodyItems withAttack(String attack) {
        this.attack = attack;
        return this;
    }

    /** 攻击类型
     * 
     * @return attack */
    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public ListEventResponseBodyItems withRule(String rule) {
        this.rule = rule;
        return this;
    }

    /** 命中的规则id
     * 
     * @return rule */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public ListEventResponseBodyItems withPayload(String payload) {
        this.payload = payload;
        return this;
    }

    /** 命中的载荷
     * 
     * @return payload */
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public ListEventResponseBodyItems withAction(String action) {
        this.action = action;
        return this;
    }

    /** 防护动作
     * 
     * @return action */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListEventResponseBodyItems withRequestLine(String requestLine) {
        this.requestLine = requestLine;
        return this;
    }

    /** 请求方法和路径
     * 
     * @return requestLine */
    public String getRequestLine() {
        return requestLine;
    }

    public void setRequestLine(String requestLine) {
        this.requestLine = requestLine;
    }

    public ListEventResponseBodyItems withHeaders(ListEventResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }

    public ListEventResponseBodyItems withHeaders(Consumer<ListEventResponseBodyHeaders> headersSetter) {
        if (this.headers == null) {
            this.headers = new ListEventResponseBodyHeaders();
            headersSetter.accept(this.headers);
        }

        return this;
    }

    /** Get headers
     * 
     * @return headers */
    public ListEventResponseBodyHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(ListEventResponseBodyHeaders headers) {
        this.headers = headers;
    }

    public ListEventResponseBodyItems withCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }

    /** 请求cookie
     * 
     * @return cookie */
    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public ListEventResponseBodyItems withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 响应码状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListEventResponseBodyItems withRegion(String region) {
        this.region = region;
        return this;
    }

    /** 区域
     * 
     * @return region */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListEventResponseBodyItems withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /** 域名id
     * 
     * @return hostId */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListEventResponseBodyItems withResponseTime(Long responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    /** 响应时长
     * 
     * @return responseTime */
    public Long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
    }

    public ListEventResponseBodyItems withResponseSize(Integer responseSize) {
        this.responseSize = responseSize;
        return this;
    }

    /** 响应体大小
     * 
     * @return responseSize */
    public Integer getResponseSize() {
        return responseSize;
    }

    public void setResponseSize(Integer responseSize) {
        this.responseSize = responseSize;
    }

    public ListEventResponseBodyItems withResponseBody(String responseBody) {
        this.responseBody = responseBody;
        return this;
    }

    /** 响应体
     * 
     * @return responseBody */
    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventResponseBodyItems listEventResponseBodyItems = (ListEventResponseBodyItems) o;
        return Objects.equals(this.id, listEventResponseBodyItems.id)
            && Objects.equals(this.time, listEventResponseBodyItems.time)
            && Objects.equals(this.policyid, listEventResponseBodyItems.policyid)
            && Objects.equals(this.sip, listEventResponseBodyItems.sip)
            && Objects.equals(this.host, listEventResponseBodyItems.host)
            && Objects.equals(this.url, listEventResponseBodyItems.url)
            && Objects.equals(this.attack, listEventResponseBodyItems.attack)
            && Objects.equals(this.rule, listEventResponseBodyItems.rule)
            && Objects.equals(this.payload, listEventResponseBodyItems.payload)
            && Objects.equals(this.action, listEventResponseBodyItems.action)
            && Objects.equals(this.requestLine, listEventResponseBodyItems.requestLine)
            && Objects.equals(this.headers, listEventResponseBodyItems.headers)
            && Objects.equals(this.cookie, listEventResponseBodyItems.cookie)
            && Objects.equals(this.status, listEventResponseBodyItems.status)
            && Objects.equals(this.region, listEventResponseBodyItems.region)
            && Objects.equals(this.hostId, listEventResponseBodyItems.hostId)
            && Objects.equals(this.responseTime, listEventResponseBodyItems.responseTime)
            && Objects.equals(this.responseSize, listEventResponseBodyItems.responseSize)
            && Objects.equals(this.responseBody, listEventResponseBodyItems.responseBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            time,
            policyid,
            sip,
            host,
            url,
            attack,
            rule,
            payload,
            action,
            requestLine,
            headers,
            cookie,
            status,
            region,
            hostId,
            responseTime,
            responseSize,
            responseBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventResponseBodyItems {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    attack: ").append(toIndentedString(attack)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    requestLine: ").append(toIndentedString(requestLine)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
        sb.append("    responseSize: ").append(toIndentedString(responseSize)).append("\n");
        sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
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
