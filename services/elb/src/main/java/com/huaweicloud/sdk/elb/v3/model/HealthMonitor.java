package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthMonitor
 */
public class HealthMonitor {

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
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "pools")

    private List<PoolRef> pools = null;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public HealthMonitor withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 健康检查的管理状态。  **取值范围**： - true：表示开启健康检查。 - false表示关闭健康检查。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public HealthMonitor withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    /**
     * **参数解释**：健康检查间隔。  **取值范围**：1-50，单位：秒。
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

    public HealthMonitor withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释**：发送健康检查请求的域名。  **取值范围**：以数字或字母开头，只能包含数字、字母、’-’、’.’。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public HealthMonitor withExpectedCodes(String expectedCodes) {
        this.expectedCodes = expectedCodes;
        return this;
    }

    /**
     * **参数解释**：期望响应状态码。  **取值范围**： - 单值：单个返回码，例如200。 - 列表：多个特定返回码，例如200，202。 - 区间：一个返回码区间，例如200-204。
     * @return expectedCodes
     */
    public String getExpectedCodes() {
        return expectedCodes;
    }

    public void setExpectedCodes(String expectedCodes) {
        this.expectedCodes = expectedCodes;
    }

    public HealthMonitor withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * **参数解释**：HTTP请求方法。  **取值范围**：GET、HEAD、POST
     * @return httpMethod
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public HealthMonitor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：健康检查ID。  **取值范围**：不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HealthMonitor withMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * **参数解释**：健康检查连续成功多少次后，将后端服务器的健康检查状态由OFFLINE判定为ONLINE。  **取值范围**：1-10
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

    public HealthMonitor withMaxRetriesDown(Integer maxRetriesDown) {
        this.maxRetriesDown = maxRetriesDown;
        return this;
    }

    /**
     * **参数解释**：健康检查连续失败多少次后，将后端服务器的健康检查状态由ONLINE判定为OFFLINE。  **取值范围**：1-10
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

    public HealthMonitor withMonitorPort(Integer monitorPort) {
        this.monitorPort = monitorPort;
        return this;
    }

    /**
     * **参数解释**：健康检查端口号。  **取值范围**：1-65535和null，传null表示使用后端服务器端口号。
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

    public HealthMonitor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：健康检查名称。  **取值范围**：不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HealthMonitor withPools(List<PoolRef> pools) {
        this.pools = pools;
        return this;
    }

    public HealthMonitor addPoolsItem(PoolRef poolsItem) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public HealthMonitor withPools(Consumer<List<PoolRef>> poolsSetter) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * **参数解释**：健康检查所在的后端服务器组ID列表。实际只会有一个后端服务器组ID。  **取值范围**：不涉及
     * @return pools
     */
    public List<PoolRef> getPools() {
        return pools;
    }

    public void setPools(List<PoolRef> pools) {
        this.pools = pools;
    }

    public HealthMonitor withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：健康检查所在的项目ID。  **取值范围**：不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public HealthMonitor withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * **参数解释**：一次健康检查请求的超时时间。  **取值范围**：不涉及
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

    public HealthMonitor withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 健康检查请求协议。  **取值范围**：TCP、UDP_CONNECT、HTTP、HTTPS、TLS和GRPC。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HealthMonitor withUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }

    /**
     * **参数解释**：健康检查请求的请求路径。以\"/\"开头，默认为\"/\"。  **取值范围**：支持使用字母、数字和短划线（-）、正斜线（/）、半角句号（.）、百分号（%）、半角问号（?）、井号（#）和and（&）以及扩展字符集_;~!()*[]@$^:',+
     * @return urlPath
     */
    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public HealthMonitor withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**：创建时间。  **取值范围**：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC时区。  [注意：独享型实例的历史数据以及共享型实例下的资源，不返回该字段。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,srg,fcs,dt,hk_tm)
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public HealthMonitor withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**： 更新时间。  **取值范围**：格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC时区。  [注意：独享型实例的历史数据以及共享型实例下的资源，不返回该字段。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,srg,fcs,dt,hk_tm)
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthMonitor that = (HealthMonitor) obj;
        return Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.delay, that.delay)
            && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.expectedCodes, that.expectedCodes)
            && Objects.equals(this.httpMethod, that.httpMethod) && Objects.equals(this.id, that.id)
            && Objects.equals(this.maxRetries, that.maxRetries)
            && Objects.equals(this.maxRetriesDown, that.maxRetriesDown)
            && Objects.equals(this.monitorPort, that.monitorPort) && Objects.equals(this.name, that.name)
            && Objects.equals(this.pools, that.pools) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.timeout, that.timeout) && Objects.equals(this.type, that.type)
            && Objects.equals(this.urlPath, that.urlPath) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            delay,
            domainName,
            expectedCodes,
            httpMethod,
            id,
            maxRetries,
            maxRetriesDown,
            monitorPort,
            name,
            pools,
            projectId,
            timeout,
            type,
            urlPath,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthMonitor {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    expectedCodes: ").append(toIndentedString(expectedCodes)).append("\n");
        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
        sb.append("    maxRetriesDown: ").append(toIndentedString(maxRetriesDown)).append("\n");
        sb.append("    monitorPort: ").append(toIndentedString(monitorPort)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    urlPath: ").append(toIndentedString(urlPath)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
