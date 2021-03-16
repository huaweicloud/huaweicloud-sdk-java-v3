package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.ListenerInsertHeaders;
import com.huaweicloud.sdk.elb.v3.model.ListenerIpGroup;
import com.huaweicloud.sdk.elb.v3.model.LoadBalancerRef;
import com.huaweicloud.sdk.elb.v3.model.Tag;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建监听器的响应体
 */
public class Listener  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_ca_tls_container_ref")
    
    private String clientCaTlsContainerRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection_limit")
    
    private Integer connectionLimit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_pool_id")
    
    private String defaultPoolId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_tls_container_ref")
    
    private String defaultTlsContainerRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http2_enable")
    
    private Boolean http2Enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="insert_headers")
    
    private ListenerInsertHeaders insertHeaders;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancers")
    
    private List<LoadBalancerRef> loadbalancers = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_port")
    
    private Integer protocolPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sni_container_refs")
    
    private List<String> sniContainerRefs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<Tag> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tls_ciphers_policy")
    
    private String tlsCiphersPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_member_retry")
    
    private Boolean enableMemberRetry;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keepalive_timeout")
    
    private Integer keepaliveTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_timeout")
    
    private Integer clientTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_timeout")
    
    private Integer memberTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipgroup")
    
    private ListenerIpGroup ipgroup;

    public Listener withAdminStateUp(Boolean adminStateUp) {
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

    

    public Listener withClientCaTlsContainerRef(String clientCaTlsContainerRef) {
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

    

    public Listener withConnectionLimit(Integer connectionLimit) {
        this.connectionLimit = connectionLimit;
        return this;
    }

    


    /**
     * 监听器的最大连接数。该字段为预留字段，暂未启用。默认为-1。
     * @return connectionLimit
     */
    public Integer getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(Integer connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    

    public Listener withCreatedAt(String createdAt) {
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

    

    public Listener withDefaultPoolId(String defaultPoolId) {
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

    

    public Listener withDefaultTlsContainerRef(String defaultTlsContainerRef) {
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

    

    public Listener withDescription(String description) {
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

    

    public Listener withHttp2Enable(Boolean http2Enable) {
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

    

    public Listener withId(String id) {
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

    

    public Listener withInsertHeaders(ListenerInsertHeaders insertHeaders) {
        this.insertHeaders = insertHeaders;
        return this;
    }

    public Listener withInsertHeaders(Consumer<ListenerInsertHeaders> insertHeadersSetter) {
        if(this.insertHeaders == null ){
            this.insertHeaders = new ListenerInsertHeaders();
            insertHeadersSetter.accept(this.insertHeaders);
        }
        
        return this;
    }


    /**
     * Get insertHeaders
     * @return insertHeaders
     */
    public ListenerInsertHeaders getInsertHeaders() {
        return insertHeaders;
    }

    public void setInsertHeaders(ListenerInsertHeaders insertHeaders) {
        this.insertHeaders = insertHeaders;
    }

    

    public Listener withLoadbalancers(List<LoadBalancerRef> loadbalancers) {
        this.loadbalancers = loadbalancers;
        return this;
    }

    
    public Listener addLoadbalancersItem(LoadBalancerRef loadbalancersItem) {
        this.loadbalancers.add(loadbalancersItem);
        return this;
    }

    public Listener withLoadbalancers(Consumer<List<LoadBalancerRef>> loadbalancersSetter) {
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
    public List<LoadBalancerRef> getLoadbalancers() {
        return loadbalancers;
    }

    public void setLoadbalancers(List<LoadBalancerRef> loadbalancers) {
        this.loadbalancers = loadbalancers;
    }

    

    public Listener withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 监听器名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Listener withProjectId(String projectId) {
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

    

    public Listener withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 监听器的监听协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    public Listener withProtocolPort(Integer protocolPort) {
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

    

    public Listener withSniContainerRefs(List<String> sniContainerRefs) {
        this.sniContainerRefs = sniContainerRefs;
        return this;
    }

    
    public Listener addSniContainerRefsItem(String sniContainerRefsItem) {
        this.sniContainerRefs.add(sniContainerRefsItem);
        return this;
    }

    public Listener withSniContainerRefs(Consumer<List<String>> sniContainerRefsSetter) {
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

    

    public Listener withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    
    public Listener addTagsItem(Tag tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public Listener withTags(Consumer<List<Tag>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    

    public Listener withUpdatedAt(String updatedAt) {
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

    

    public Listener withTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
        return this;
    }

    


    /**
     * 监听器使用的安全策略，仅对TERMINATED_HTTPS协议类型的监听器有效，且默认值为tls-1-0。 取值包括：tls-1-0-inherit,tls-1-0, tls-1-1, tls-1-2, tls-1-2-strict，tls-1-2-fs六种安全策略
     * @return tlsCiphersPolicy
     */
    public String getTlsCiphersPolicy() {
        return tlsCiphersPolicy;
    }

    public void setTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
    }

    

    public Listener withEnableMemberRetry(Boolean enableMemberRetry) {
        this.enableMemberRetry = enableMemberRetry;
        return this;
    }

    


    /**
     * 是否关闭后端服务器的重试。 该字段只在protocol为HTTP、HTTPS时有意义。
     * @return enableMemberRetry
     */
    public Boolean getEnableMemberRetry() {
        return enableMemberRetry;
    }

    public void setEnableMemberRetry(Boolean enableMemberRetry) {
        this.enableMemberRetry = enableMemberRetry;
    }

    

    public Listener withKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
        return this;
    }

    


    /**
     * TCP监听器配置空闲超时时间，取值范围为（10-900s）默认值为300s，TCP监听器配置空闲超时时间，取值范围为（10-900s）默认值为300s，HTTP/TERMINATED_HTTPS监听器为客户端连接空闲超时时间，取值范围为（1-300s）默认值为15s。 UDP此字段无意义
     * @return keepaliveTimeout
     */
    public Integer getKeepaliveTimeout() {
        return keepaliveTimeout;
    }

    public void setKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
    }

    

    public Listener withClientTimeout(Integer clientTimeout) {
        this.clientTimeout = clientTimeout;
        return this;
    }

    


    /**
     * 等待客户端请求超时时间，协议为HTTP， TERMINATED_HTTPS的监听器才有意义。取值范围 1-60
     * @return clientTimeout
     */
    public Integer getClientTimeout() {
        return clientTimeout;
    }

    public void setClientTimeout(Integer clientTimeout) {
        this.clientTimeout = clientTimeout;
    }

    

    public Listener withMemberTimeout(Integer memberTimeout) {
        this.memberTimeout = memberTimeout;
        return this;
    }

    


    /**
     * 等待后端服务器请求超时时间，协议为HTTP， TERMINATED_HTTPS时才有意义。取值范围 1-300
     * @return memberTimeout
     */
    public Integer getMemberTimeout() {
        return memberTimeout;
    }

    public void setMemberTimeout(Integer memberTimeout) {
        this.memberTimeout = memberTimeout;
    }

    

    public Listener withIpgroup(ListenerIpGroup ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public Listener withIpgroup(Consumer<ListenerIpGroup> ipgroupSetter) {
        if(this.ipgroup == null ){
            this.ipgroup = new ListenerIpGroup();
            ipgroupSetter.accept(this.ipgroup);
        }
        
        return this;
    }


    /**
     * Get ipgroup
     * @return ipgroup
     */
    public ListenerIpGroup getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(ListenerIpGroup ipgroup) {
        this.ipgroup = ipgroup;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Listener listener = (Listener) o;
        return Objects.equals(this.adminStateUp, listener.adminStateUp) &&
            Objects.equals(this.clientCaTlsContainerRef, listener.clientCaTlsContainerRef) &&
            Objects.equals(this.connectionLimit, listener.connectionLimit) &&
            Objects.equals(this.createdAt, listener.createdAt) &&
            Objects.equals(this.defaultPoolId, listener.defaultPoolId) &&
            Objects.equals(this.defaultTlsContainerRef, listener.defaultTlsContainerRef) &&
            Objects.equals(this.description, listener.description) &&
            Objects.equals(this.http2Enable, listener.http2Enable) &&
            Objects.equals(this.id, listener.id) &&
            Objects.equals(this.insertHeaders, listener.insertHeaders) &&
            Objects.equals(this.loadbalancers, listener.loadbalancers) &&
            Objects.equals(this.name, listener.name) &&
            Objects.equals(this.projectId, listener.projectId) &&
            Objects.equals(this.protocol, listener.protocol) &&
            Objects.equals(this.protocolPort, listener.protocolPort) &&
            Objects.equals(this.sniContainerRefs, listener.sniContainerRefs) &&
            Objects.equals(this.tags, listener.tags) &&
            Objects.equals(this.updatedAt, listener.updatedAt) &&
            Objects.equals(this.tlsCiphersPolicy, listener.tlsCiphersPolicy) &&
            Objects.equals(this.enableMemberRetry, listener.enableMemberRetry) &&
            Objects.equals(this.keepaliveTimeout, listener.keepaliveTimeout) &&
            Objects.equals(this.clientTimeout, listener.clientTimeout) &&
            Objects.equals(this.memberTimeout, listener.memberTimeout) &&
            Objects.equals(this.ipgroup, listener.ipgroup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, clientCaTlsContainerRef, connectionLimit, createdAt, defaultPoolId, defaultTlsContainerRef, description, http2Enable, id, insertHeaders, loadbalancers, name, projectId, protocol, protocolPort, sniContainerRefs, tags, updatedAt, tlsCiphersPolicy, enableMemberRetry, keepaliveTimeout, clientTimeout, memberTimeout, ipgroup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Listener {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    clientCaTlsContainerRef: ").append(toIndentedString(clientCaTlsContainerRef)).append("\n");
        sb.append("    connectionLimit: ").append(toIndentedString(connectionLimit)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    defaultPoolId: ").append(toIndentedString(defaultPoolId)).append("\n");
        sb.append("    defaultTlsContainerRef: ").append(toIndentedString(defaultTlsContainerRef)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    insertHeaders: ").append(toIndentedString(insertHeaders)).append("\n");
        sb.append("    loadbalancers: ").append(toIndentedString(loadbalancers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    sniContainerRefs: ").append(toIndentedString(sniContainerRefs)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    tlsCiphersPolicy: ").append(toIndentedString(tlsCiphersPolicy)).append("\n");
        sb.append("    enableMemberRetry: ").append(toIndentedString(enableMemberRetry)).append("\n");
        sb.append("    keepaliveTimeout: ").append(toIndentedString(keepaliveTimeout)).append("\n");
        sb.append("    clientTimeout: ").append(toIndentedString(clientTimeout)).append("\n");
        sb.append("    memberTimeout: ").append(toIndentedString(memberTimeout)).append("\n");
        sb.append("    ipgroup: ").append(toIndentedString(ipgroup)).append("\n");
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

