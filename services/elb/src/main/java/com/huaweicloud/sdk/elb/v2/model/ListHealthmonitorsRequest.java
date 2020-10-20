package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListHealthmonitorsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delay")
    
    private Integer delay;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_retries")
    
    private Integer maxRetries;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    private Integer timeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="monitor_port")
    
    private Integer monitorPort;


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

    public ListHealthmonitorsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 9223372036854775807
     * @return limit
     */
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

    


    /**
     * Get marker
     * @return marker
     */
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

    


    /**
     * Get pageReverse
     * @return pageReverse
     */
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

    


    /**
     * Get id
     * @return id
     */
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

    


    /**
     * Get name
     * @return name
     */
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

    


    /**
     * Get delay
     * @return delay
     */
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

    


    /**
     * Get maxRetries
     * @return maxRetries
     */
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

    


    /**
     * Get adminStateUp
     * @return adminStateUp
     */
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

    


    /**
     * Get timeout
     * @return timeout
     */
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

    


    /**
     * Get type
     * @return type
     */
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

    


    /**
     * Get monitorPort
     * @return monitorPort
     */
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

    


    /**
     * Get expectedCodes
     * @return expectedCodes
     */
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

    


    /**
     * Get domainName
     * @return domainName
     */
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

    


    /**
     * Get urlPath
     * @return urlPath
     */
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

    


    /**
     * Get httpMethod
     * @return httpMethod
     */
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
        return Objects.equals(this.limit, listHealthmonitorsRequest.limit) &&
            Objects.equals(this.marker, listHealthmonitorsRequest.marker) &&
            Objects.equals(this.pageReverse, listHealthmonitorsRequest.pageReverse) &&
            Objects.equals(this.id, listHealthmonitorsRequest.id) &&
            Objects.equals(this.name, listHealthmonitorsRequest.name) &&
            Objects.equals(this.delay, listHealthmonitorsRequest.delay) &&
            Objects.equals(this.maxRetries, listHealthmonitorsRequest.maxRetries) &&
            Objects.equals(this.adminStateUp, listHealthmonitorsRequest.adminStateUp) &&
            Objects.equals(this.timeout, listHealthmonitorsRequest.timeout) &&
            Objects.equals(this.type, listHealthmonitorsRequest.type) &&
            Objects.equals(this.monitorPort, listHealthmonitorsRequest.monitorPort) &&
            Objects.equals(this.expectedCodes, listHealthmonitorsRequest.expectedCodes) &&
            Objects.equals(this.domainName, listHealthmonitorsRequest.domainName) &&
            Objects.equals(this.urlPath, listHealthmonitorsRequest.urlPath) &&
            Objects.equals(this.httpMethod, listHealthmonitorsRequest.httpMethod);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, pageReverse, id, name, delay, maxRetries, adminStateUp, timeout, type, monitorPort, expectedCodes, domainName, urlPath, httpMethod);
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

