package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 攻击类型
 */
public class ShowEventItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    @JacksonXmlProperty(localName = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    @JacksonXmlProperty(localName = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sip")

    @JacksonXmlProperty(localName = "sip")

    private String sip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    @JacksonXmlProperty(localName = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    @JacksonXmlProperty(localName = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack")

    @JacksonXmlProperty(localName = "attack")

    private String attack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    @JacksonXmlProperty(localName = "rule")

    private String rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    @JacksonXmlProperty(localName = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cookie")

    @JacksonXmlProperty(localName = "cookie")

    private String cookie;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    @JacksonXmlProperty(localName = "headers")

    private Object headers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    @JacksonXmlProperty(localName = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload")

    @JacksonXmlProperty(localName = "payload")

    private String payload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload_location")

    @JacksonXmlProperty(localName = "payload_location")

    private String payloadLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    @JacksonXmlProperty(localName = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_time")

    @JacksonXmlProperty(localName = "process_time")

    private Integer processTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_line")

    @JacksonXmlProperty(localName = "request_line")

    private String requestLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_size")

    @JacksonXmlProperty(localName = "response_size")

    private Integer responseSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_time")

    @JacksonXmlProperty(localName = "response_time")

    private Long responseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_body")

    @JacksonXmlProperty(localName = "request_body")

    private String requestBody;

    public ShowEventItems withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 攻击发生时的时间戳（毫秒）
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public ShowEventItems withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public ShowEventItems withSip(String sip) {
        this.sip = sip;
        return this;
    }

    /**
     * 源ip，Web访问者的IP地址（攻击者IP地址）
     * @return sip
     */
    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public ShowEventItems withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 域名
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ShowEventItems withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 攻击的url链接
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowEventItems withAttack(String attack) {
        this.attack = attack;
        return this;
    }

    /**
     * 攻击类型
     * @return attack
     */
    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public ShowEventItems withRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * 命中的规则id
     * @return rule
     */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public ShowEventItems withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 防护动作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ShowEventItems withCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }

    /**
     * 攻击请求的cookie
     * @return cookie
     */
    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public ShowEventItems withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * 攻击请求的headers
     * @return headers
     */
    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    public ShowEventItems withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 被攻击的域名id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ShowEventItems withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 防护事件id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowEventItems withPayload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * 恶意负载
     * @return payload
     */
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public ShowEventItems withPayloadLocation(String payloadLocation) {
        this.payloadLocation = payloadLocation;
        return this;
    }

    /**
     * 恶意负载位置
     * @return payloadLocation
     */
    public String getPayloadLocation() {
        return payloadLocation;
    }

    public void setPayloadLocation(String payloadLocation) {
        this.payloadLocation = payloadLocation;
    }

    public ShowEventItems withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 源ip地理位置
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowEventItems withProcessTime(Integer processTime) {
        this.processTime = processTime;
        return this;
    }

    /**
     * 处理时长
     * @return processTime
     */
    public Integer getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Integer processTime) {
        this.processTime = processTime;
    }

    public ShowEventItems withRequestLine(String requestLine) {
        this.requestLine = requestLine;
        return this;
    }

    /**
     * 攻击请求的请求行
     * @return requestLine
     */
    public String getRequestLine() {
        return requestLine;
    }

    public void setRequestLine(String requestLine) {
        this.requestLine = requestLine;
    }

    public ShowEventItems withResponseSize(Integer responseSize) {
        this.responseSize = responseSize;
        return this;
    }

    /**
     * 返回大小（字节）
     * @return responseSize
     */
    public Integer getResponseSize() {
        return responseSize;
    }

    public void setResponseSize(Integer responseSize) {
        this.responseSize = responseSize;
    }

    public ShowEventItems withResponseTime(Long responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    /**
     * 响应时间（毫秒）
     * @return responseTime
     */
    public Long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
    }

    public ShowEventItems withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 响应码
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowEventItems withRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * 请求体
     * @return requestBody
     */
    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEventItems showEventItems = (ShowEventItems) o;
        return Objects.equals(this.time, showEventItems.time) && Objects.equals(this.policyid, showEventItems.policyid)
            && Objects.equals(this.sip, showEventItems.sip) && Objects.equals(this.host, showEventItems.host)
            && Objects.equals(this.url, showEventItems.url) && Objects.equals(this.attack, showEventItems.attack)
            && Objects.equals(this.rule, showEventItems.rule) && Objects.equals(this.action, showEventItems.action)
            && Objects.equals(this.cookie, showEventItems.cookie)
            && Objects.equals(this.headers, showEventItems.headers)
            && Objects.equals(this.hostId, showEventItems.hostId) && Objects.equals(this.id, showEventItems.id)
            && Objects.equals(this.payload, showEventItems.payload)
            && Objects.equals(this.payloadLocation, showEventItems.payloadLocation)
            && Objects.equals(this.region, showEventItems.region)
            && Objects.equals(this.processTime, showEventItems.processTime)
            && Objects.equals(this.requestLine, showEventItems.requestLine)
            && Objects.equals(this.responseSize, showEventItems.responseSize)
            && Objects.equals(this.responseTime, showEventItems.responseTime)
            && Objects.equals(this.status, showEventItems.status)
            && Objects.equals(this.requestBody, showEventItems.requestBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time,
            policyid,
            sip,
            host,
            url,
            attack,
            rule,
            action,
            cookie,
            headers,
            hostId,
            id,
            payload,
            payloadLocation,
            region,
            processTime,
            requestLine,
            responseSize,
            responseTime,
            status,
            requestBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventItems {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    attack: ").append(toIndentedString(attack)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    payloadLocation: ").append(toIndentedString(payloadLocation)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    processTime: ").append(toIndentedString(processTime)).append("\n");
        sb.append("    requestLine: ").append(toIndentedString(requestLine)).append("\n");
        sb.append("    responseSize: ").append(toIndentedString(responseSize)).append("\n");
        sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
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
