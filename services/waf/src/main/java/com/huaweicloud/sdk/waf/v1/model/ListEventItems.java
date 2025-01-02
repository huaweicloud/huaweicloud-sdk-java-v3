package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 攻击类型
 */
public class ListEventItems {

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
    @JsonProperty(value = "payload_location")

    private String payloadLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_line")

    private String requestLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private Object headers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cookie")

    private String cookie;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_time")

    private Integer processTime;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_body")

    private String requestBody;

    public ListEventItems withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListEventItems withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 攻击发生时的时间戳(毫秒)
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public ListEventItems withPolicyid(String policyid) {
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

    public ListEventItems withSip(String sip) {
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

    public ListEventItems withHost(String host) {
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

    public ListEventItems withUrl(String url) {
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

    public ListEventItems withAttack(String attack) {
        this.attack = attack;
        return this;
    }

    /**
     * 攻击类型:   - vuln：其它攻击类型   - sqli： sql注入攻击   - lfi： 本地文件包含  - cmdi：命令注入攻击   - xss：XSS攻击   - robot：恶意爬虫   - rfi：远程文件包含   - custom_custom：精准防护   - webshell：网站木马   - custom_whiteblackip：黑白名单拦截   - custom_geoip：地理访问控制拦截   - antitamper：防篡改   - anticrawler：反爬虫    - leakage：网站信息防泄漏   - illegal：非法请求   - antiscan_high_freq_scan：高频扫描封禁   - antiscan_dir_traversal：目录遍历防护
     * @return attack
     */
    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public ListEventItems withRule(String rule) {
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

    public ListEventItems withPayload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * 命中的载荷
     * @return payload
     */
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public ListEventItems withPayloadLocation(String payloadLocation) {
        this.payloadLocation = payloadLocation;
        return this;
    }

    /**
     * 命中的载荷位置
     * @return payloadLocation
     */
    public String getPayloadLocation() {
        return payloadLocation;
    }

    public void setPayloadLocation(String payloadLocation) {
        this.payloadLocation = payloadLocation;
    }

    public ListEventItems withAction(String action) {
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

    public ListEventItems withRequestLine(String requestLine) {
        this.requestLine = requestLine;
        return this;
    }

    /**
     * 请求方法和路径
     * @return requestLine
     */
    public String getRequestLine() {
        return requestLine;
    }

    public void setRequestLine(String requestLine) {
        this.requestLine = requestLine;
    }

    public ListEventItems withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * http请求header
     * @return headers
     */
    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    public ListEventItems withCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }

    /**
     * 请求cookie
     * @return cookie
     */
    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public ListEventItems withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 响应码状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListEventItems withProcessTime(Integer processTime) {
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

    public ListEventItems withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 地理位置
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListEventItems withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 域名id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListEventItems withResponseTime(Long responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    /**
     * 响应时长
     * @return responseTime
     */
    public Long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
    }

    public ListEventItems withResponseSize(Integer responseSize) {
        this.responseSize = responseSize;
        return this;
    }

    /**
     * 响应体大小
     * @return responseSize
     */
    public Integer getResponseSize() {
        return responseSize;
    }

    public void setResponseSize(Integer responseSize) {
        this.responseSize = responseSize;
    }

    public ListEventItems withResponseBody(String responseBody) {
        this.responseBody = responseBody;
        return this;
    }

    /**
     * 响应体
     * @return responseBody
     */
    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public ListEventItems withRequestBody(String requestBody) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventItems that = (ListEventItems) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.time, that.time)
            && Objects.equals(this.policyid, that.policyid) && Objects.equals(this.sip, that.sip)
            && Objects.equals(this.host, that.host) && Objects.equals(this.url, that.url)
            && Objects.equals(this.attack, that.attack) && Objects.equals(this.rule, that.rule)
            && Objects.equals(this.payload, that.payload) && Objects.equals(this.payloadLocation, that.payloadLocation)
            && Objects.equals(this.action, that.action) && Objects.equals(this.requestLine, that.requestLine)
            && Objects.equals(this.headers, that.headers) && Objects.equals(this.cookie, that.cookie)
            && Objects.equals(this.status, that.status) && Objects.equals(this.processTime, that.processTime)
            && Objects.equals(this.region, that.region) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.responseTime, that.responseTime)
            && Objects.equals(this.responseSize, that.responseSize)
            && Objects.equals(this.responseBody, that.responseBody)
            && Objects.equals(this.requestBody, that.requestBody);
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
            payloadLocation,
            action,
            requestLine,
            headers,
            cookie,
            status,
            processTime,
            region,
            hostId,
            responseTime,
            responseSize,
            responseBody,
            requestBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventItems {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    attack: ").append(toIndentedString(attack)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    payloadLocation: ").append(toIndentedString(payloadLocation)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    requestLine: ").append(toIndentedString(requestLine)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    cookie: ").append(toIndentedString(cookie)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    processTime: ").append(toIndentedString(processTime)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
        sb.append("    responseSize: ").append(toIndentedString(responseSize)).append("\n");
        sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
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
