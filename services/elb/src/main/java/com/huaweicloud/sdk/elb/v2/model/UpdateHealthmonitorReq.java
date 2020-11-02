package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新健康检查请求
 */
public class UpdateHealthmonitorReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="monitor_port")
    
    private Integer monitorPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    private Integer timeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expected_codes")
    
    private String expectedCodes;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url_path")
    
    private String urlPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http_method")
    
    private String httpMethod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delay")
    
    private Integer delay;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_retries")
    
    private Integer maxRetries;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public UpdateHealthmonitorReq withName(String name) {
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

    public UpdateHealthmonitorReq withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 健康检查的管理状态；该字段虽然支持创建、更新，但实际取值决定于后端云服务器对应的弹性云服务器是否存在。该字段虽然支持创建、更新，但实际取值决定于member对应的弹性云服务器是否存在。若存在，该值为true，否则，该值为false。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public UpdateHealthmonitorReq withMonitorPort(Integer monitorPort) {
        this.monitorPort = monitorPort;
        return this;
    }

    


    /**
     * 健康检查端口号。默认为空，表示使用后端云服务器组的端口。
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

    public UpdateHealthmonitorReq withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * 健康检查的超时时间。建议该值小于delay的值。
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

    public UpdateHealthmonitorReq withExpectedCodes(String expectedCodes) {
        this.expectedCodes = expectedCodes;
        return this;
    }

    


    /**
     * 期望HTTP响应状态码，指定下列值：单值，例如200；列表，例如200，202；区间，例如200-204。仅当type为HTTP时生效。该字段为预留字段，暂未启用。
     * @return expectedCodes
     */
    public String getExpectedCodes() {
        return expectedCodes;
    }

    public void setExpectedCodes(String expectedCodes) {
        this.expectedCodes = expectedCodes;
    }

    public UpdateHealthmonitorReq withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 功能说明：健康检查测试member健康状态时，发送的http请求的域名。仅当type为HTTP时生效。使用说明：默认为空，表示使用负载均衡器的vip作为http请求的目的地址。以数字或字母开头，只能包含数字、字母、’-’、’.’。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public UpdateHealthmonitorReq withUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }

    


    /**
     * HTTP方法，可以为GET、HEAD、POST、PUT、DELETE、TRACE、OPTIONS、CONNECT、PATCH。仅当type为HTTP时生效。该字段为预留字段，暂未启用。
     * @return urlPath
     */
    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public UpdateHealthmonitorReq withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    


    /**
     * HTTP方法，可以为GET、HEAD、POST、PUT、DELETE、TRACE、OPTIONS、CONNECT、PATCH。仅当type为HTTP时生效。该字段为预留字段，暂未启用。
     * @return httpMethod
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public UpdateHealthmonitorReq withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    


    /**
     * 健康检查间隔
     * minimum: 1
     * maximum: 50
     * @return delay
     */
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public UpdateHealthmonitorReq withMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    


    /**
     * 最大重试次数
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

    public UpdateHealthmonitorReq withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 健康检查的类型。  取值范围：TCP、UDP_CONNECT、HTTP。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateHealthmonitorReq updateHealthmonitorReq = (UpdateHealthmonitorReq) o;
        return Objects.equals(this.name, updateHealthmonitorReq.name) &&
            Objects.equals(this.adminStateUp, updateHealthmonitorReq.adminStateUp) &&
            Objects.equals(this.monitorPort, updateHealthmonitorReq.monitorPort) &&
            Objects.equals(this.timeout, updateHealthmonitorReq.timeout) &&
            Objects.equals(this.expectedCodes, updateHealthmonitorReq.expectedCodes) &&
            Objects.equals(this.domainName, updateHealthmonitorReq.domainName) &&
            Objects.equals(this.urlPath, updateHealthmonitorReq.urlPath) &&
            Objects.equals(this.httpMethod, updateHealthmonitorReq.httpMethod) &&
            Objects.equals(this.delay, updateHealthmonitorReq.delay) &&
            Objects.equals(this.maxRetries, updateHealthmonitorReq.maxRetries) &&
            Objects.equals(this.type, updateHealthmonitorReq.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, adminStateUp, monitorPort, timeout, expectedCodes, domainName, urlPath, httpMethod, delay, maxRetries, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHealthmonitorReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    monitorPort: ").append(toIndentedString(monitorPort)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    expectedCodes: ").append(toIndentedString(expectedCodes)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    urlPath: ").append(toIndentedString(urlPath)).append("\n");
        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

