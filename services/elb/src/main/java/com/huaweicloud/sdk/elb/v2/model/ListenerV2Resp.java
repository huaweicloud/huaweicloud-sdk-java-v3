package com.huaweicloud.sdk.elb.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.InsertHeader;
import com.huaweicloud.sdk.elb.v2.model.ResourceList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 监听器响应体
 */
public class ListenerV2Resp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancers")
    
    private List<ResourceList> loadbalancers = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection_limit")
    
    private Integer connectionLimit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http2_enable")
    
    private Boolean http2Enable;
    /**
     * 监听器的监听协议
     */
    public static final class ProtocolEnum {

        
        /**
         * Enum UDP for value: "UDP"
         */
        public static final ProtocolEnum UDP = new ProtocolEnum("UDP");
        
        /**
         * Enum TCP for value: "TCP"
         */
        public static final ProtocolEnum TCP = new ProtocolEnum("TCP");
        
        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("HTTP");
        
        /**
         * Enum TERMINATED_HTTPS for value: "TERMINATED_HTTPS"
         */
        public static final ProtocolEnum TERMINATED_HTTPS = new ProtocolEnum("TERMINATED_HTTPS");
        

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("UDP", UDP);
            map.put("TCP", TCP);
            map.put("HTTP", HTTP);
            map.put("TERMINATED_HTTPS", TERMINATED_HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtocolEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private ProtocolEnum protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_port")
    
    private Integer protocolPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_pool_id")
    
    private String defaultPoolId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_tls_container_ref")
    
    private String defaultTlsContainerRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_ca_tls_container_ref")
    
    private String clientCaTlsContainerRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sni_container_refs")
    
    private List<String> sniContainerRefs = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="insert_headers")
    
    private InsertHeader insertHeaders = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tls_ciphers_policy")
    
    private String tlsCiphersPolicy;

    public ListenerV2Resp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 监听器ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListenerV2Resp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 监听器所在的项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ListenerV2Resp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 监听器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListenerV2Resp withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 监听器的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListenerV2Resp withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 监听器的管理状态。只支持设定为true，该字段的值无实际意义。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListenerV2Resp withLoadbalancers(List<ResourceList> loadbalancers) {
        this.loadbalancers = loadbalancers;
        return this;
    }

    
    public ListenerV2Resp addLoadbalancersItem(ResourceList loadbalancersItem) {
        this.loadbalancers.add(loadbalancersItem);
        return this;
    }

    public ListenerV2Resp withLoadbalancers(Consumer<List<ResourceList>> loadbalancersSetter) {
        if(this.loadbalancers == null ){
            this.loadbalancers = new ArrayList<>();
        }
        loadbalancersSetter.accept(this.loadbalancers);
        return this;
    }

    /**
     * 监听器绑定的负载均衡器ID的列表。
     * @return loadbalancers
     */
    public List<ResourceList> getLoadbalancers() {
        return loadbalancers;
    }

    public void setLoadbalancers(List<ResourceList> loadbalancers) {
        this.loadbalancers = loadbalancers;
    }

    public ListenerV2Resp withConnectionLimit(Integer connectionLimit) {
        this.connectionLimit = connectionLimit;
        return this;
    }

    


    /**
     * 监听器的最大连接数。该字段为预留字段，暂未启用。默认为-1。
     * minimum: -1
     * maximum: 2147483647
     * @return connectionLimit
     */
    public Integer getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(Integer connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public ListenerV2Resp withHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
        return this;
    }

    


    /**
     * HTTP2功能的开启状态。该字段只有当监听器的协议是TERMINATED_HTTPS时生效。
     * @return http2Enable
     */
    public Boolean getHttp2Enable() {
        return http2Enable;
    }

    public void setHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
    }

    public ListenerV2Resp withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 监听器的监听协议
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public ListenerV2Resp withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    


    /**
     * 监听器的监听端口。
     * minimum: 1
     * maximum: 65535
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    public ListenerV2Resp withDefaultPoolId(String defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
        return this;
    }

    


    /**
     * 监听器的默认后端云服务器组ID。当请求没有匹配的转发策略时，转发到默认后端云服务器上处理。
     * @return defaultPoolId
     */
    public String getDefaultPoolId() {
        return defaultPoolId;
    }

    public void setDefaultPoolId(String defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
    }

    public ListenerV2Resp withDefaultTlsContainerRef(String defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
        return this;
    }

    


    /**
     * 监听器使用的服务器证书ID。
     * @return defaultTlsContainerRef
     */
    public String getDefaultTlsContainerRef() {
        return defaultTlsContainerRef;
    }

    public void setDefaultTlsContainerRef(String defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
    }

    public ListenerV2Resp withClientCaTlsContainerRef(String clientCaTlsContainerRef) {
        this.clientCaTlsContainerRef = clientCaTlsContainerRef;
        return this;
    }

    


    /**
     * 监听器使用的CA证书ID。
     * @return clientCaTlsContainerRef
     */
    public String getClientCaTlsContainerRef() {
        return clientCaTlsContainerRef;
    }

    public void setClientCaTlsContainerRef(String clientCaTlsContainerRef) {
        this.clientCaTlsContainerRef = clientCaTlsContainerRef;
    }

    public ListenerV2Resp withSniContainerRefs(List<String> sniContainerRefs) {
        this.sniContainerRefs = sniContainerRefs;
        return this;
    }

    
    public ListenerV2Resp addSniContainerRefsItem(String sniContainerRefsItem) {
        this.sniContainerRefs.add(sniContainerRefsItem);
        return this;
    }

    public ListenerV2Resp withSniContainerRefs(Consumer<List<String>> sniContainerRefsSetter) {
        if(this.sniContainerRefs == null ){
            this.sniContainerRefs = new ArrayList<>();
        }
        sniContainerRefsSetter.accept(this.sniContainerRefs);
        return this;
    }

    /**
     * 监听器使用的SNI证书（带域名的服务器证书）ID的列表。
     * @return sniContainerRefs
     */
    public List<String> getSniContainerRefs() {
        return sniContainerRefs;
    }

    public void setSniContainerRefs(List<String> sniContainerRefs) {
        this.sniContainerRefs = sniContainerRefs;
    }

    public ListenerV2Resp withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListenerV2Resp addTagsItem(String tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public ListenerV2Resp withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 监听器的标签。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ListenerV2Resp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 监听器的创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListenerV2Resp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 监听器的更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ListenerV2Resp withInsertHeaders(InsertHeader insertHeaders) {
        this.insertHeaders = insertHeaders;
        return this;
    }

    public ListenerV2Resp withInsertHeaders(Consumer<InsertHeader> insertHeadersSetter) {
        if(this.insertHeaders == null ){
            this.insertHeaders = new InsertHeader();
            insertHeadersSetter.accept(this.insertHeaders);
        }
        
        return this;
    }


    /**
     * Get insertHeaders
     * @return insertHeaders
     */
    public InsertHeader getInsertHeaders() {
        return insertHeaders;
    }

    public void setInsertHeaders(InsertHeader insertHeaders) {
        this.insertHeaders = insertHeaders;
    }

    public ListenerV2Resp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 监听器所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListenerV2Resp withTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
        return this;
    }

    


    /**
     * 监听器使用的安全策略，仅对TERMINATED_HTTPS协议类型的监听器有效，且默认值为tls-1-0。  取值包括：tls-1-0, tls-1-1, tls-1-2, tls-1-2-strict多种安全策略
     * @return tlsCiphersPolicy
     */
    public String getTlsCiphersPolicy() {
        return tlsCiphersPolicy;
    }

    public void setTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListenerV2Resp listenerV2Resp = (ListenerV2Resp) o;
        return Objects.equals(this.id, listenerV2Resp.id) &&
            Objects.equals(this.tenantId, listenerV2Resp.tenantId) &&
            Objects.equals(this.name, listenerV2Resp.name) &&
            Objects.equals(this.description, listenerV2Resp.description) &&
            Objects.equals(this.adminStateUp, listenerV2Resp.adminStateUp) &&
            Objects.equals(this.loadbalancers, listenerV2Resp.loadbalancers) &&
            Objects.equals(this.connectionLimit, listenerV2Resp.connectionLimit) &&
            Objects.equals(this.http2Enable, listenerV2Resp.http2Enable) &&
            Objects.equals(this.protocol, listenerV2Resp.protocol) &&
            Objects.equals(this.protocolPort, listenerV2Resp.protocolPort) &&
            Objects.equals(this.defaultPoolId, listenerV2Resp.defaultPoolId) &&
            Objects.equals(this.defaultTlsContainerRef, listenerV2Resp.defaultTlsContainerRef) &&
            Objects.equals(this.clientCaTlsContainerRef, listenerV2Resp.clientCaTlsContainerRef) &&
            Objects.equals(this.sniContainerRefs, listenerV2Resp.sniContainerRefs) &&
            Objects.equals(this.tags, listenerV2Resp.tags) &&
            Objects.equals(this.createdAt, listenerV2Resp.createdAt) &&
            Objects.equals(this.updatedAt, listenerV2Resp.updatedAt) &&
            Objects.equals(this.insertHeaders, listenerV2Resp.insertHeaders) &&
            Objects.equals(this.projectId, listenerV2Resp.projectId) &&
            Objects.equals(this.tlsCiphersPolicy, listenerV2Resp.tlsCiphersPolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, tenantId, name, description, adminStateUp, loadbalancers, connectionLimit, http2Enable, protocol, protocolPort, defaultPoolId, defaultTlsContainerRef, clientCaTlsContainerRef, sniContainerRefs, tags, createdAt, updatedAt, insertHeaders, projectId, tlsCiphersPolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListenerV2Resp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    loadbalancers: ").append(toIndentedString(loadbalancers)).append("\n");
        sb.append("    connectionLimit: ").append(toIndentedString(connectionLimit)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    defaultPoolId: ").append(toIndentedString(defaultPoolId)).append("\n");
        sb.append("    defaultTlsContainerRef: ").append(toIndentedString(defaultTlsContainerRef)).append("\n");
        sb.append("    clientCaTlsContainerRef: ").append(toIndentedString(clientCaTlsContainerRef)).append("\n");
        sb.append("    sniContainerRefs: ").append(toIndentedString(sniContainerRefs)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    insertHeaders: ").append(toIndentedString(insertHeaders)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tlsCiphersPolicy: ").append(toIndentedString(tlsCiphersPolicy)).append("\n");
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

