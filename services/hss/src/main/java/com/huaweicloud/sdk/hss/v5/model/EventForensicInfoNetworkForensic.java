package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 网络取证信息 **取值范围**： 不涉及
 */
public class EventForensicInfoNetworkForensic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_address")

    private String localAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_port")

    private Integer localPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_address")

    private String remoteAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_port")

    private Integer remotePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_protocol")

    private String appProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_direction")

    private String flowDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_time")

    private Long firstTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_time")

    private Long lastTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_method")

    private String requestMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_url")

    private String requestUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_string")

    private String queryString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_params")

    private String requestParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_header")

    private String requestHeader;

    public EventForensicInfoNetworkForensic withLocalAddress(String localAddress) {
        this.localAddress = localAddress;
        return this;
    }

    /**
     * **参数解释**： 本地ip地址 **取值范围**： 不涉及
     * @return localAddress
     */
    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public EventForensicInfoNetworkForensic withLocalPort(Integer localPort) {
        this.localPort = localPort;
        return this;
    }

    /**
     * **参数解释**： 本地端口 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return localPort
     */
    public Integer getLocalPort() {
        return localPort;
    }

    public void setLocalPort(Integer localPort) {
        this.localPort = localPort;
    }

    public EventForensicInfoNetworkForensic withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * **参数解释**： 源ip **取值范围**： 不涉及
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public EventForensicInfoNetworkForensic withRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
        return this;
    }

    /**
     * **参数解释**： 远端ip地址(攻击者ip) **取值范围**： 不涉及
     * @return remoteAddress
     */
    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public EventForensicInfoNetworkForensic withRemotePort(Integer remotePort) {
        this.remotePort = remotePort;
        return this;
    }

    /**
     * **参数解释**： 远程端口 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return remotePort
     */
    public Integer getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(Integer remotePort) {
        this.remotePort = remotePort;
    }

    public EventForensicInfoNetworkForensic withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**： 协议 **取值范围**： 不涉及
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public EventForensicInfoNetworkForensic withAppProtocol(String appProtocol) {
        this.appProtocol = appProtocol;
        return this;
    }

    /**
     * **参数解释**： 应用层协议 **取值范围**： 不涉及
     * @return appProtocol
     */
    public String getAppProtocol() {
        return appProtocol;
    }

    public void setAppProtocol(String appProtocol) {
        this.appProtocol = appProtocol;
    }

    public EventForensicInfoNetworkForensic withFlowDirection(String flowDirection) {
        this.flowDirection = flowDirection;
        return this;
    }

    /**
     * **参数解释**： 流量方向 **取值范围**： 不涉及
     * @return flowDirection
     */
    public String getFlowDirection() {
        return flowDirection;
    }

    public void setFlowDirection(String flowDirection) {
        this.flowDirection = flowDirection;
    }

    public EventForensicInfoNetworkForensic withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 连接次数 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public EventForensicInfoNetworkForensic withFirstTime(Long firstTime) {
        this.firstTime = firstTime;
        return this;
    }

    /**
     * **参数解释**： 首次连接时间(毫秒) **取值范围**： 不涉及
     * minimum: 0
     * maximum: 9223372036854775807
     * @return firstTime
     */
    public Long getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(Long firstTime) {
        this.firstTime = firstTime;
    }

    public EventForensicInfoNetworkForensic withLastTime(Long lastTime) {
        this.lastTime = lastTime;
        return this;
    }

    /**
     * **参数解释**： 最后一连接时间(毫秒) **取值范围**： 不涉及
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastTime
     */
    public Long getLastTime() {
        return lastTime;
    }

    public void setLastTime(Long lastTime) {
        this.lastTime = lastTime;
    }

    public EventForensicInfoNetworkForensic withRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * **参数解释**： 请求方法 **取值范围**： 不涉及
     * @return requestMethod
     */
    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public EventForensicInfoNetworkForensic withRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
        return this;
    }

    /**
     * **参数解释**： 请求地址 **取值范围**： 不涉及
     * @return requestUrl
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public EventForensicInfoNetworkForensic withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * **参数解释**： 查询字符串 **取值范围**： 不涉及
     * @return queryString
     */
    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public EventForensicInfoNetworkForensic withRequestParams(String requestParams) {
        this.requestParams = requestParams;
        return this;
    }

    /**
     * **参数解释**： 请求参数 **取值范围**： 不涉及
     * @return requestParams
     */
    public String getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams;
    }

    public EventForensicInfoNetworkForensic withRequestHeader(String requestHeader) {
        this.requestHeader = requestHeader;
        return this;
    }

    /**
     * **参数解释**： 请求头信息 **取值范围**： 不涉及
     * @return requestHeader
     */
    public String getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(String requestHeader) {
        this.requestHeader = requestHeader;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventForensicInfoNetworkForensic that = (EventForensicInfoNetworkForensic) obj;
        return Objects.equals(this.localAddress, that.localAddress) && Objects.equals(this.localPort, that.localPort)
            && Objects.equals(this.srcIp, that.srcIp) && Objects.equals(this.remoteAddress, that.remoteAddress)
            && Objects.equals(this.remotePort, that.remotePort) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.appProtocol, that.appProtocol)
            && Objects.equals(this.flowDirection, that.flowDirection) && Objects.equals(this.count, that.count)
            && Objects.equals(this.firstTime, that.firstTime) && Objects.equals(this.lastTime, that.lastTime)
            && Objects.equals(this.requestMethod, that.requestMethod)
            && Objects.equals(this.requestUrl, that.requestUrl) && Objects.equals(this.queryString, that.queryString)
            && Objects.equals(this.requestParams, that.requestParams)
            && Objects.equals(this.requestHeader, that.requestHeader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localAddress,
            localPort,
            srcIp,
            remoteAddress,
            remotePort,
            protocol,
            appProtocol,
            flowDirection,
            count,
            firstTime,
            lastTime,
            requestMethod,
            requestUrl,
            queryString,
            requestParams,
            requestHeader);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventForensicInfoNetworkForensic {\n");
        sb.append("    localAddress: ").append(toIndentedString(localAddress)).append("\n");
        sb.append("    localPort: ").append(toIndentedString(localPort)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
        sb.append("    remotePort: ").append(toIndentedString(remotePort)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    appProtocol: ").append(toIndentedString(appProtocol)).append("\n");
        sb.append("    flowDirection: ").append(toIndentedString(flowDirection)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    firstTime: ").append(toIndentedString(firstTime)).append("\n");
        sb.append("    lastTime: ").append(toIndentedString(lastTime)).append("\n");
        sb.append("    requestMethod: ").append(toIndentedString(requestMethod)).append("\n");
        sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
        sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
        sb.append("    requestParams: ").append(toIndentedString(requestParams)).append("\n");
        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
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
