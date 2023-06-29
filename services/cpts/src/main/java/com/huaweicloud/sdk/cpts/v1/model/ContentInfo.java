package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ContentInfo
 */
public class ContentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body_type")

    private Integer bodyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bodys")

    private List<Object> bodys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_end_length")

    private Object checkEndLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_end_str")

    private Object checkEndStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_end_type")

    private Object checkEndType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_timeout")

    private Integer connectTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_type")

    private Integer connectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private List<ContentHeader> headers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_version")

    private String httpVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private Integer protocolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_timeout")

    private Integer returnTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_timeout_param")

    private String returnTimeoutParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtmp_url")

    private String rtmpUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flv_url")

    private String flvUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate_type")

    private Integer bitrateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_delay")

    private Integer retryDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_time")

    private Integer retryTime;

    public ContentInfo withBodyType(Integer bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    /**
     * body_type
     * minimum: 0
     * maximum: 2147483647
     * @return bodyType
     */
    public Integer getBodyType() {
        return bodyType;
    }

    public void setBodyType(Integer bodyType) {
        this.bodyType = bodyType;
    }

    public ContentInfo withBodys(List<Object> bodys) {
        this.bodys = bodys;
        return this;
    }

    public ContentInfo addBodysItem(Object bodysItem) {
        if (this.bodys == null) {
            this.bodys = new ArrayList<>();
        }
        this.bodys.add(bodysItem);
        return this;
    }

    public ContentInfo withBodys(Consumer<List<Object>> bodysSetter) {
        if (this.bodys == null) {
            this.bodys = new ArrayList<>();
        }
        bodysSetter.accept(this.bodys);
        return this;
    }

    /**
     * bodys
     * @return bodys
     */
    public List<Object> getBodys() {
        return bodys;
    }

    public void setBodys(List<Object> bodys) {
        this.bodys = bodys;
    }

    public ContentInfo withCheckEndLength(Object checkEndLength) {
        this.checkEndLength = checkEndLength;
        return this;
    }

    /**
     * TCP/UDP协议返回数据长度
     * @return checkEndLength
     */
    public Object getCheckEndLength() {
        return checkEndLength;
    }

    public void setCheckEndLength(Object checkEndLength) {
        this.checkEndLength = checkEndLength;
    }

    public ContentInfo withCheckEndStr(Object checkEndStr) {
        this.checkEndStr = checkEndStr;
        return this;
    }

    /**
     * TCP/UDP协议返回结束符
     * @return checkEndStr
     */
    public Object getCheckEndStr() {
        return checkEndStr;
    }

    public void setCheckEndStr(Object checkEndStr) {
        this.checkEndStr = checkEndStr;
    }

    public ContentInfo withCheckEndType(Object checkEndType) {
        this.checkEndType = checkEndType;
        return this;
    }

    /**
     * TCP/UDP协议返回结束类型，1：返回数据长度；2：结束符
     * @return checkEndType
     */
    public Object getCheckEndType() {
        return checkEndType;
    }

    public void setCheckEndType(Object checkEndType) {
        this.checkEndType = checkEndType;
    }

    public ContentInfo withConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * connect_timeout
     * minimum: 0
     * maximum: 2147483647
     * @return connectTimeout
     */
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public ContentInfo withConnectType(Integer connectType) {
        this.connectType = connectType;
        return this;
    }

    /**
     * connect_type
     * minimum: 0
     * maximum: 2147483647
     * @return connectType
     */
    public Integer getConnectType() {
        return connectType;
    }

    public void setConnectType(Integer connectType) {
        this.connectType = connectType;
    }

    public ContentInfo withHeaders(List<ContentHeader> headers) {
        this.headers = headers;
        return this;
    }

    public ContentInfo addHeadersItem(ContentHeader headersItem) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        this.headers.add(headersItem);
        return this;
    }

    public ContentInfo withHeaders(Consumer<List<ContentHeader>> headersSetter) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        headersSetter.accept(this.headers);
        return this;
    }

    /**
     * headers
     * @return headers
     */
    public List<ContentHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(List<ContentHeader> headers) {
        this.headers = headers;
    }

    public ContentInfo withHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }

    /**
     * http_version
     * @return httpVersion
     */
    public String getHttpVersion() {
        return httpVersion;
    }

    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }

    public ContentInfo withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * method
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ContentInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContentInfo withProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * protocol_type
     * minimum: 0
     * maximum: 2147483647
     * @return protocolType
     */
    public Integer getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
    }

    public ContentInfo withReturnTimeout(Integer returnTimeout) {
        this.returnTimeout = returnTimeout;
        return this;
    }

    /**
     * return_timeout
     * minimum: 0
     * maximum: 2147483647
     * @return returnTimeout
     */
    public Integer getReturnTimeout() {
        return returnTimeout;
    }

    public void setReturnTimeout(Integer returnTimeout) {
        this.returnTimeout = returnTimeout;
    }

    public ContentInfo withReturnTimeoutParam(String returnTimeoutParam) {
        this.returnTimeoutParam = returnTimeoutParam;
        return this;
    }

    /**
     * return_timeout_param
     * @return returnTimeoutParam
     */
    public String getReturnTimeoutParam() {
        return returnTimeoutParam;
    }

    public void setReturnTimeoutParam(String returnTimeoutParam) {
        this.returnTimeoutParam = returnTimeoutParam;
    }

    public ContentInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ContentInfo withRtmpUrl(String rtmpUrl) {
        this.rtmpUrl = rtmpUrl;
        return this;
    }

    /**
     * rtmp地址
     * @return rtmpUrl
     */
    public String getRtmpUrl() {
        return rtmpUrl;
    }

    public void setRtmpUrl(String rtmpUrl) {
        this.rtmpUrl = rtmpUrl;
    }

    public ContentInfo withFlvUrl(String flvUrl) {
        this.flvUrl = flvUrl;
        return this;
    }

    /**
     * flv地址
     * @return flvUrl
     */
    public String getFlvUrl() {
        return flvUrl;
    }

    public void setFlvUrl(String flvUrl) {
        this.flvUrl = flvUrl;
    }

    public ContentInfo withBitrateType(Integer bitrateType) {
        this.bitrateType = bitrateType;
        return this;
    }

    /**
     * 分辨率策略
     * minimum: 0
     * maximum: 128
     * @return bitrateType
     */
    public Integer getBitrateType() {
        return bitrateType;
    }

    public void setBitrateType(Integer bitrateType) {
        this.bitrateType = bitrateType;
    }

    public ContentInfo withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * duration
     * minimum: 0
     * maximum: 2147483647
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ContentInfo withRetryDelay(Integer retryDelay) {
        this.retryDelay = retryDelay;
        return this;
    }

    /**
     * HLS重试延迟时间
     * minimum: 0
     * maximum: 2147483647
     * @return retryDelay
     */
    public Integer getRetryDelay() {
        return retryDelay;
    }

    public void setRetryDelay(Integer retryDelay) {
        this.retryDelay = retryDelay;
    }

    public ContentInfo withRetryTime(Integer retryTime) {
        this.retryTime = retryTime;
        return this;
    }

    /**
     * HLS重试次数
     * minimum: 0
     * maximum: 2147483647
     * @return retryTime
     */
    public Integer getRetryTime() {
        return retryTime;
    }

    public void setRetryTime(Integer retryTime) {
        this.retryTime = retryTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContentInfo that = (ContentInfo) obj;
        return Objects.equals(this.bodyType, that.bodyType) && Objects.equals(this.bodys, that.bodys)
            && Objects.equals(this.checkEndLength, that.checkEndLength)
            && Objects.equals(this.checkEndStr, that.checkEndStr)
            && Objects.equals(this.checkEndType, that.checkEndType)
            && Objects.equals(this.connectTimeout, that.connectTimeout)
            && Objects.equals(this.connectType, that.connectType) && Objects.equals(this.headers, that.headers)
            && Objects.equals(this.httpVersion, that.httpVersion) && Objects.equals(this.method, that.method)
            && Objects.equals(this.name, that.name) && Objects.equals(this.protocolType, that.protocolType)
            && Objects.equals(this.returnTimeout, that.returnTimeout)
            && Objects.equals(this.returnTimeoutParam, that.returnTimeoutParam) && Objects.equals(this.url, that.url)
            && Objects.equals(this.rtmpUrl, that.rtmpUrl) && Objects.equals(this.flvUrl, that.flvUrl)
            && Objects.equals(this.bitrateType, that.bitrateType) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.retryDelay, that.retryDelay) && Objects.equals(this.retryTime, that.retryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyType,
            bodys,
            checkEndLength,
            checkEndStr,
            checkEndType,
            connectTimeout,
            connectType,
            headers,
            httpVersion,
            method,
            name,
            protocolType,
            returnTimeout,
            returnTimeoutParam,
            url,
            rtmpUrl,
            flvUrl,
            bitrateType,
            duration,
            retryDelay,
            retryTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentInfo {\n");
        sb.append("    bodyType: ").append(toIndentedString(bodyType)).append("\n");
        sb.append("    bodys: ").append(toIndentedString(bodys)).append("\n");
        sb.append("    checkEndLength: ").append(toIndentedString(checkEndLength)).append("\n");
        sb.append("    checkEndStr: ").append(toIndentedString(checkEndStr)).append("\n");
        sb.append("    checkEndType: ").append(toIndentedString(checkEndType)).append("\n");
        sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
        sb.append("    connectType: ").append(toIndentedString(connectType)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    returnTimeout: ").append(toIndentedString(returnTimeout)).append("\n");
        sb.append("    returnTimeoutParam: ").append(toIndentedString(returnTimeoutParam)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    rtmpUrl: ").append(toIndentedString(rtmpUrl)).append("\n");
        sb.append("    flvUrl: ").append(toIndentedString(flvUrl)).append("\n");
        sb.append("    bitrateType: ").append(toIndentedString(bitrateType)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    retryDelay: ").append(toIndentedString(retryDelay)).append("\n");
        sb.append("    retryTime: ").append(toIndentedString(retryTime)).append("\n");
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
