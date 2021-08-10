package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 健康检查响应体 */
public class HealthmonitorResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_port")

    private Integer monitorPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    /** 健康检查类型 */
    public static final class TypeEnum {

        /** Enum TCP for value: "TCP" */
        public static final TypeEnum TCP = new TypeEnum("TCP");

        /** Enum UDP_CONNECT for value: "UDP_CONNECT" */
        public static final TypeEnum UDP_CONNECT = new TypeEnum("UDP_CONNECT");

        /** Enum HTTP for value: "HTTP" */
        public static final TypeEnum HTTP = new TypeEnum("HTTP");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("TCP", TCP);
            map.put("UDP_CONNECT", UDP_CONNECT);
            map.put("HTTP", HTTP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Integer delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retries")

    private Integer maxRetries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pools")

    private List<ResourceList> pools = null;

    public HealthmonitorResp withId(String id) {
        this.id = id;
        return this;
    }

    /** 健康检查ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HealthmonitorResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 健康检查所在的项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public HealthmonitorResp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /** 健康检查所在的项目ID。
     * 
     * @return tenantId */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public HealthmonitorResp withName(String name) {
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

    public HealthmonitorResp withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** 健康检查的管理状态；该字段虽然支持创建、更新，但实际取值决定于后端云服务器对应的弹性云服务器是否存在。该字段虽然支持创建、更新，但实际取值决定于member对应的弹性云服务器是否存在。若存在，该值为true，否则，该值为false。
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public HealthmonitorResp withMonitorPort(Integer monitorPort) {
        this.monitorPort = monitorPort;
        return this;
    }

    /** 健康检查端口号。默认为空，表示使用后端云服务器组的端口。 minimum: 1 maximum: 65535
     * 
     * @return monitorPort */
    public Integer getMonitorPort() {
        return monitorPort;
    }

    public void setMonitorPort(Integer monitorPort) {
        this.monitorPort = monitorPort;
    }

    public HealthmonitorResp withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /** 健康检查的超时时间。建议该值小于delay的值。 minimum: 1 maximum: 50
     * 
     * @return timeout */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public HealthmonitorResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 健康检查类型
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public HealthmonitorResp withExpectedCodes(String expectedCodes) {
        this.expectedCodes = expectedCodes;
        return this;
    }

    /** 期望HTTP响应状态码，指定下列值：单值，例如200；列表，例如200，202；区间，例如200-204。仅当type为HTTP时生效。该字段为预留字段，暂未启用。
     * 
     * @return expectedCodes */
    public String getExpectedCodes() {
        return expectedCodes;
    }

    public void setExpectedCodes(String expectedCodes) {
        this.expectedCodes = expectedCodes;
    }

    public HealthmonitorResp withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** 功能说明：健康检查测试member健康状态时，发送的http请求的域名。仅当type为HTTP时生效。使用说明：默认为空，表示使用负载均衡器的vip作为http请求的目的地址。以数字或字母开头，只能包含数字、字母、’-’、’.’。
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public HealthmonitorResp withUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }

    /** HTTP方法，可以为GET、HEAD、POST、PUT、DELETE、TRACE、OPTIONS、CONNECT、PATCH。仅当type为HTTP时生效。该字段为预留字段，暂未启用。
     * 
     * @return urlPath */
    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public HealthmonitorResp withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /** HTTP方法，可以为GET、HEAD、POST、PUT、DELETE、TRACE、OPTIONS、CONNECT、PATCH。仅当type为HTTP时生效。该字段为预留字段，暂未启用。
     * 
     * @return httpMethod */
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public HealthmonitorResp withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    /** 健康检查间隔，单位秒 minimum: 1 maximum: 50
     * 
     * @return delay */
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public HealthmonitorResp withMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /** 最大重试次数 minimum: 1 maximum: 10
     * 
     * @return maxRetries */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    public HealthmonitorResp withPools(List<ResourceList> pools) {
        this.pools = pools;
        return this;
    }

    public HealthmonitorResp addPoolsItem(ResourceList poolsItem) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public HealthmonitorResp withPools(Consumer<List<ResourceList>> poolsSetter) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /** 健康检查关联的后端云服务器组列表
     * 
     * @return pools */
    public List<ResourceList> getPools() {
        return pools;
    }

    public void setPools(List<ResourceList> pools) {
        this.pools = pools;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthmonitorResp healthmonitorResp = (HealthmonitorResp) o;
        return Objects.equals(this.id, healthmonitorResp.id)
            && Objects.equals(this.projectId, healthmonitorResp.projectId)
            && Objects.equals(this.tenantId, healthmonitorResp.tenantId)
            && Objects.equals(this.name, healthmonitorResp.name)
            && Objects.equals(this.adminStateUp, healthmonitorResp.adminStateUp)
            && Objects.equals(this.monitorPort, healthmonitorResp.monitorPort)
            && Objects.equals(this.timeout, healthmonitorResp.timeout)
            && Objects.equals(this.type, healthmonitorResp.type)
            && Objects.equals(this.expectedCodes, healthmonitorResp.expectedCodes)
            && Objects.equals(this.domainName, healthmonitorResp.domainName)
            && Objects.equals(this.urlPath, healthmonitorResp.urlPath)
            && Objects.equals(this.httpMethod, healthmonitorResp.httpMethod)
            && Objects.equals(this.delay, healthmonitorResp.delay)
            && Objects.equals(this.maxRetries, healthmonitorResp.maxRetries)
            && Objects.equals(this.pools, healthmonitorResp.pools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            tenantId,
            name,
            adminStateUp,
            monitorPort,
            timeout,
            type,
            expectedCodes,
            domainName,
            urlPath,
            httpMethod,
            delay,
            maxRetries,
            pools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthmonitorResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    monitorPort: ").append(toIndentedString(monitorPort)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    expectedCodes: ").append(toIndentedString(expectedCodes)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    urlPath: ").append(toIndentedString(urlPath)).append("\n");
        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
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
