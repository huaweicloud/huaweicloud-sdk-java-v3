package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListHealthmonitorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Integer delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retries")

    private Integer maxRetries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_port")

    private Integer monitorPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_codes")

    private String expectedCodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_path")

    private String urlPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_method")

    private String httpMethod;

    public ListHealthmonitorsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 分页查询中每页的健康检查个数 minimum: 0 maximum: 9223372036854775807
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListHealthmonitorsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 分页查询的起始的资源id，表示上一页最后一条查询记录的健康检查的id。不指定时表示查询第一页。
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListHealthmonitorsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /** 分页的顺序，true表示从后往前分页，false表示从前往后分页，默认为false。
     * 
     * @return pageReverse */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListHealthmonitorsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /** 健康检查ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListHealthmonitorsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 健康检查名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListHealthmonitorsRequest withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    /** 健康检查间隔，单位秒，取值范围[1，50]。
     * 
     * @return delay */
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public ListHealthmonitorsRequest withMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /** 健康检查最大重试次数，取值范围[1，10]。
     * 
     * @return maxRetries */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    public ListHealthmonitorsRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** 健康检查的管理状态。取值范围：true/false。默认为true；true表示开启健康检查；false表示关闭健康检查。
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListHealthmonitorsRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /** 健康检查超时时间，单位秒，取值范围[1，50]。 建议该值小于delay的值。
     * 
     * @return timeout */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ListHealthmonitorsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /** 健康检查的类型。取值范围：TCP、UDP_CONNECT、HTTP。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListHealthmonitorsRequest withMonitorPort(Integer monitorPort) {
        this.monitorPort = monitorPort;
        return this;
    }

    /** 健康检查端口号]。默认为空，表示使用后端云服务器的protocol_port作为健康检查的检查端口。
     * 
     * @return monitorPort */
    public Integer getMonitorPort() {
        return monitorPort;
    }

    public void setMonitorPort(Integer monitorPort) {
        this.monitorPort = monitorPort;
    }

    public ListHealthmonitorsRequest withExpectedCodes(String expectedCodes) {
        this.expectedCodes = expectedCodes;
        return this;
    }

    /** 期望HTTP响应状态码；默认值：“200”。取值范围：单值，例如200；列表，例如200，202；区间，例如200-204。仅当type为HTTP时生效。 该字段为预留字段，暂未启用。
     * 
     * @return expectedCodes */
    public String getExpectedCodes() {
        return expectedCodes;
    }

    public void setExpectedCodes(String expectedCodes) {
        this.expectedCodes = expectedCodes;
    }

    public ListHealthmonitorsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** 健康检查时，发送的http请求的域名。仅当type为HTTP时生效。默认为空，表示使用负载均衡器的vip_address作为http请求的目的地址。以数字或字母开头，只能包含数字、字母、’-’、’.’。例如：www.huaweitest.com
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ListHealthmonitorsRequest withUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }

    /** 健康检查时发送的http请求路径。默认为“/”。以“/”开头。仅当type为HTTP时生效。例如：“/test”
     * 
     * @return urlPath */
    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public ListHealthmonitorsRequest withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /** HTTP请求的方法；默认值：GET取值范围：GET、HEAD、POST、PUT、DELETE、TRACE、OPTIONS、CONNECT、PATCH。仅当type为HTTP时生效。
     * 
     * @return httpMethod */
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHealthmonitorsRequest listHealthmonitorsRequest = (ListHealthmonitorsRequest) o;
        return Objects.equals(this.limit, listHealthmonitorsRequest.limit)
            && Objects.equals(this.marker, listHealthmonitorsRequest.marker)
            && Objects.equals(this.pageReverse, listHealthmonitorsRequest.pageReverse)
            && Objects.equals(this.id, listHealthmonitorsRequest.id)
            && Objects.equals(this.name, listHealthmonitorsRequest.name)
            && Objects.equals(this.delay, listHealthmonitorsRequest.delay)
            && Objects.equals(this.maxRetries, listHealthmonitorsRequest.maxRetries)
            && Objects.equals(this.adminStateUp, listHealthmonitorsRequest.adminStateUp)
            && Objects.equals(this.timeout, listHealthmonitorsRequest.timeout)
            && Objects.equals(this.type, listHealthmonitorsRequest.type)
            && Objects.equals(this.monitorPort, listHealthmonitorsRequest.monitorPort)
            && Objects.equals(this.expectedCodes, listHealthmonitorsRequest.expectedCodes)
            && Objects.equals(this.domainName, listHealthmonitorsRequest.domainName)
            && Objects.equals(this.urlPath, listHealthmonitorsRequest.urlPath)
            && Objects.equals(this.httpMethod, listHealthmonitorsRequest.httpMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            pageReverse,
            id,
            name,
            delay,
            maxRetries,
            adminStateUp,
            timeout,
            type,
            monitorPort,
            expectedCodes,
            domainName,
            urlPath,
            httpMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHealthmonitorsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    monitorPort: ").append(toIndentedString(monitorPort)).append("\n");
        sb.append("    expectedCodes: ").append(toIndentedString(expectedCodes)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    urlPath: ").append(toIndentedString(urlPath)).append("\n");
        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
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
