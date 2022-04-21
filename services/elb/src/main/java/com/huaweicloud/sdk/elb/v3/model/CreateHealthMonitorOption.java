package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建健康检查请求参数。
 */
public class CreateHealthMonitorOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Integer delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_codes")

    private String expectedCodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_method")

    private String httpMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retries")

    private Integer maxRetries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retries_down")

    private Integer maxRetriesDown;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_port")

    private Integer monitorPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_path")

    private String urlPath;

    public CreateHealthMonitorOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 健康检查的管理状态。取值： - true：表示开启健康检查，默认为true。 - false表示关闭健康检查。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreateHealthMonitorOption withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 健康检查间隔。取值：1-50s。
     * @return delay
     */
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public CreateHealthMonitorOption withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 发送健康检查请求的域名。  取值：以数字或字母开头，只能包含数字、字母、'-'、'.'。  默认为空，表示使用负载均衡器的vip作为http请求的目的地址。  使用说明： - 仅当type为HTTP时生效。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public CreateHealthMonitorOption withExpectedCodes(String expectedCodes) {
        this.expectedCodes = expectedCodes;
        return this;
    }

    /**
     * 期望响应状态码。支持多种取值格式： - 单值：单个返回码，例如200。 - 列表：多个特定返回码，例如200，202。 - 区间：一个返回码区间，例如200-204。   默认值：200。  仅支持HTTP/HTTPS设置该字段，其他协议设置不会生效。
     * @return expectedCodes
     */
    public String getExpectedCodes() {
        return expectedCodes;
    }

    public void setExpectedCodes(String expectedCodes) {
        this.expectedCodes = expectedCodes;
    }

    public CreateHealthMonitorOption withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * HTTP请求方法，取值：GET、HEAD、POST、PUT、DELETE、TRACE、OPTIONS、CONNECT、PATCH，默认GET。 使用说明：  - 仅当type为HTTP时生效。 不支持该字段，请勿使用。
     * @return httpMethod
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public CreateHealthMonitorOption withMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * 健康检查连续成功多少次后，将后端服务器的健康检查状态由OFFLINE判定为ONLINE。取值范围：1-10。
     * minimum: 1
     * maximum: 10
     * @return maxRetries
     */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    public CreateHealthMonitorOption withMaxRetriesDown(Integer maxRetriesDown) {
        this.maxRetriesDown = maxRetriesDown;
        return this;
    }

    /**
     * 健康检查连续失败多少次后，将后端服务器的健康检查状态由ONLINE判定为OFFLINE。取值范围：1-10，默认3。
     * minimum: 1
     * maximum: 10
     * @return maxRetriesDown
     */
    public Integer getMaxRetriesDown() {
        return maxRetriesDown;
    }

    public void setMaxRetriesDown(Integer maxRetriesDown) {
        this.maxRetriesDown = maxRetriesDown;
    }

    public CreateHealthMonitorOption withMonitorPort(Integer monitorPort) {
        this.monitorPort = monitorPort;
        return this;
    }

    /**
     * 健康检查端口号。取值：1-65535，默认为空，表示使用后端云服务器端口号。
     * minimum: 1
     * maximum: 65535
     * @return monitorPort
     */
    public Integer getMonitorPort() {
        return monitorPort;
    }

    public void setMonitorPort(Integer monitorPort) {
        this.monitorPort = monitorPort;
    }

    public CreateHealthMonitorOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 健康检查名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateHealthMonitorOption withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 健康检查所在的后端云服务器组ID
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public CreateHealthMonitorOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 健康检查所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateHealthMonitorOption withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 一次健康检查请求的超时时间。  建议该值小于delay的值。
     * minimum: 1
     * maximum: 50
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public CreateHealthMonitorOption withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 健康检查请求协议。 取值：TCP、UDP_CONNECT、HTTP、HTTPS。 使用说明： - 若pool的protocol为QUIC，则type只能是UDP_CONNECT。 - 若pool的protocol为UDP，则type只能UDP_CONNECT。 - 若pool的protocol为TCP，则type可以是TCP、HTTP、HTTPS。 - 若pool的protocol为HTTP，则type可以是TCP、HTTP、HTTPS。 - 若pool的protocol为HTTPS，则type可以是TCP、HTTP、HTTPS。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateHealthMonitorOption withUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }

    /**
     * 健康检查请求的请求路径。以\"/\"开头，默认为\"/\"。  使用说明： - 仅当type为HTTP时生效。
     * @return urlPath
     */
    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateHealthMonitorOption createHealthMonitorOption = (CreateHealthMonitorOption) o;
        return Objects.equals(this.adminStateUp, createHealthMonitorOption.adminStateUp)
            && Objects.equals(this.delay, createHealthMonitorOption.delay)
            && Objects.equals(this.domainName, createHealthMonitorOption.domainName)
            && Objects.equals(this.expectedCodes, createHealthMonitorOption.expectedCodes)
            && Objects.equals(this.httpMethod, createHealthMonitorOption.httpMethod)
            && Objects.equals(this.maxRetries, createHealthMonitorOption.maxRetries)
            && Objects.equals(this.maxRetriesDown, createHealthMonitorOption.maxRetriesDown)
            && Objects.equals(this.monitorPort, createHealthMonitorOption.monitorPort)
            && Objects.equals(this.name, createHealthMonitorOption.name)
            && Objects.equals(this.poolId, createHealthMonitorOption.poolId)
            && Objects.equals(this.projectId, createHealthMonitorOption.projectId)
            && Objects.equals(this.timeout, createHealthMonitorOption.timeout)
            && Objects.equals(this.type, createHealthMonitorOption.type)
            && Objects.equals(this.urlPath, createHealthMonitorOption.urlPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            delay,
            domainName,
            expectedCodes,
            httpMethod,
            maxRetries,
            maxRetriesDown,
            monitorPort,
            name,
            poolId,
            projectId,
            timeout,
            type,
            urlPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHealthMonitorOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    expectedCodes: ").append(toIndentedString(expectedCodes)).append("\n");
        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
        sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
        sb.append("    maxRetriesDown: ").append(toIndentedString(maxRetriesDown)).append("\n");
        sb.append("    monitorPort: ").append(toIndentedString(monitorPort)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    urlPath: ").append(toIndentedString(urlPath)).append("\n");
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
