package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.CreateListenerIpGroupOption;
import com.huaweicloud.sdk.elb.v3.model.ListenerInsertHeaders;
import com.huaweicloud.sdk.elb.v3.model.Tag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建监听器的请求体
 */
public class CreateListenerOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_ca_tls_container_ref")
    
    private String clientCaTlsContainerRef;


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
    @JsonProperty(value="insert_headers")
    
    private ListenerInsertHeaders insertHeaders = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer_id")
    
    private String loadbalancerId;


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
        /**
     * 监听器使用的安全策略，仅对TERMINATED_HTTPS协议类型的监听器有效，且默认值为tls-1-0。 取值包括：tls-1-0-inherit,tls-1-0, tls-1-1, tls-1-2, tls-1-2-strict，tls-1-2-fs六种安全策略
     */
    public static class TlsCiphersPolicyEnum {

        
        /**
         * Enum TLS_1_0_INHERIT for value: "tls-1-0-inherit"
         */
        public static final TlsCiphersPolicyEnum TLS_1_0_INHERIT = new TlsCiphersPolicyEnum("tls-1-0-inherit");
        
        /**
         * Enum TLS_1_0 for value: "tls-1-0"
         */
        public static final TlsCiphersPolicyEnum TLS_1_0 = new TlsCiphersPolicyEnum("tls-1-0");
        
        /**
         * Enum TLS_1_1 for value: "tls-1-1"
         */
        public static final TlsCiphersPolicyEnum TLS_1_1 = new TlsCiphersPolicyEnum("tls-1-1");
        
        /**
         * Enum TLS_1_2 for value: "tls-1-2"
         */
        public static final TlsCiphersPolicyEnum TLS_1_2 = new TlsCiphersPolicyEnum("tls-1-2");
        
        /**
         * Enum TLS_1_2_STRICT for value: "tls-1-2-strict"
         */
        public static final TlsCiphersPolicyEnum TLS_1_2_STRICT = new TlsCiphersPolicyEnum("tls-1-2-strict");
        
        /**
         * Enum TLS_1_2_FS for value: "tls-1-2-fs"
         */
        public static final TlsCiphersPolicyEnum TLS_1_2_FS = new TlsCiphersPolicyEnum("tls-1-2-fs");
        

        public static final Map<String, TlsCiphersPolicyEnum> staticFields = new HashMap<String, TlsCiphersPolicyEnum>() {
            { 
                put("tls-1-0-inherit", TLS_1_0_INHERIT);
                put("tls-1-0", TLS_1_0);
                put("tls-1-1", TLS_1_1);
                put("tls-1-2", TLS_1_2);
                put("tls-1-2-strict", TLS_1_2_STRICT);
                put("tls-1-2-fs", TLS_1_2_FS);
            }
        };

        private String value;

        TlsCiphersPolicyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TlsCiphersPolicyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TlsCiphersPolicyEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TlsCiphersPolicyEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TlsCiphersPolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TlsCiphersPolicyEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TlsCiphersPolicyEnum) {
                return this.value.equals(((TlsCiphersPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tls_ciphers_policy")
    
    private TlsCiphersPolicyEnum tlsCiphersPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_member_retry")
    
    private Boolean enableMemberRetry = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keepalive_timeout")
    
    private Integer keepaliveTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_timeout")
    
    private Integer clientTimeout = 60;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_timeout")
    
    private Integer memberTimeout = 60;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipgroup")
    
    private CreateListenerIpGroupOption ipgroup = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transparent_client_ip_enable")
    
    private Boolean transparentClientIpEnable = false;

    public CreateListenerOption withAdminStateUp(Boolean adminStateUp) {
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

    public CreateListenerOption withClientCaTlsContainerRef(String clientCaTlsContainerRef) {
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

    public CreateListenerOption withDefaultPoolId(String defaultPoolId) {
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

    public CreateListenerOption withDefaultTlsContainerRef(String defaultTlsContainerRef) {
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

    public CreateListenerOption withDescription(String description) {
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

    public CreateListenerOption withHttp2Enable(Boolean http2Enable) {
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

    public CreateListenerOption withInsertHeaders(ListenerInsertHeaders insertHeaders) {
        this.insertHeaders = insertHeaders;
        return this;
    }

    public CreateListenerOption withInsertHeaders(Consumer<ListenerInsertHeaders> insertHeadersSetter) {
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

    public CreateListenerOption withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    


    /**
     * 监听器关联的负载均衡器 ID
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public CreateListenerOption withName(String name) {
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

    public CreateListenerOption withProjectId(String projectId) {
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

    public CreateListenerOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 监听器的监听协议。 支持TCP、HTTP、UDP、TERMINATED_HTTPS。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public CreateListenerOption withProtocolPort(Integer protocolPort) {
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

    public CreateListenerOption withSniContainerRefs(List<String> sniContainerRefs) {
        this.sniContainerRefs = sniContainerRefs;
        return this;
    }

    
    public CreateListenerOption addSniContainerRefsItem(String sniContainerRefsItem) {
        if (this.sniContainerRefs == null) {
            this.sniContainerRefs = new ArrayList<>();
        }
        this.sniContainerRefs.add(sniContainerRefsItem);
        return this;
    }

    public CreateListenerOption withSniContainerRefs(Consumer<List<String>> sniContainerRefsSetter) {
        if(this.sniContainerRefs == null ){
            this.sniContainerRefs = new ArrayList<>();
        }
        sniContainerRefsSetter.accept(this.sniContainerRefs);
        return this;
    }

    /**
     * 监听器使用的SNI证书（带域名的服务器证书）ID的列表。 各SNI证书的域名不允许重复。 各SNI证书域名总数不超过30。
     * @return sniContainerRefs
     */
    public List<String> getSniContainerRefs() {
        return sniContainerRefs;
    }

    public void setSniContainerRefs(List<String> sniContainerRefs) {
        this.sniContainerRefs = sniContainerRefs;
    }

    public CreateListenerOption withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreateListenerOption addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateListenerOption withTags(Consumer<List<Tag>> tagsSetter) {
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

    public CreateListenerOption withTlsCiphersPolicy(TlsCiphersPolicyEnum tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
        return this;
    }

    


    /**
     * 监听器使用的安全策略，仅对TERMINATED_HTTPS协议类型的监听器有效，且默认值为tls-1-0。 取值包括：tls-1-0-inherit,tls-1-0, tls-1-1, tls-1-2, tls-1-2-strict，tls-1-2-fs六种安全策略
     * @return tlsCiphersPolicy
     */
    public TlsCiphersPolicyEnum getTlsCiphersPolicy() {
        return tlsCiphersPolicy;
    }

    public void setTlsCiphersPolicy(TlsCiphersPolicyEnum tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
    }

    public CreateListenerOption withEnableMemberRetry(Boolean enableMemberRetry) {
        this.enableMemberRetry = enableMemberRetry;
        return this;
    }

    


    /**
     * 是否关闭后端服务器的重试。 仅protocol为HTTP、HTTPS时支持指定该字段。
     * @return enableMemberRetry
     */
    public Boolean getEnableMemberRetry() {
        return enableMemberRetry;
    }

    public void setEnableMemberRetry(Boolean enableMemberRetry) {
        this.enableMemberRetry = enableMemberRetry;
    }

    public CreateListenerOption withKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
        return this;
    }

    


    /**
     * TCP监听器配置空闲超时时间，取值范围为（10-900s）默认值为300s，HTTP/TERMINATED_HTTPS监听器为客户端连接空闲超时时间，取值范围为（1-300s）默认值为15s。 UDP监听器不支持此字段
     * @return keepaliveTimeout
     */
    public Integer getKeepaliveTimeout() {
        return keepaliveTimeout;
    }

    public void setKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
    }

    public CreateListenerOption withClientTimeout(Integer clientTimeout) {
        this.clientTimeout = clientTimeout;
        return this;
    }

    


    /**
     * 等待客户端请求超时时间，仅限协议为HTTP， TERMINATED_HTTPS的监听器配置。取值范围为1-60s, 默认值为60s TCP，UDP协议的监听器不支持此字段
     * minimum: 1
     * maximum: 60
     * @return clientTimeout
     */
    public Integer getClientTimeout() {
        return clientTimeout;
    }

    public void setClientTimeout(Integer clientTimeout) {
        this.clientTimeout = clientTimeout;
    }

    public CreateListenerOption withMemberTimeout(Integer memberTimeout) {
        this.memberTimeout = memberTimeout;
        return this;
    }

    


    /**
     * 等待后端服务器请求超时时间，仅限协议为HTTP， TERMINATED_HTTPS的监听器配置。取值范围为1-300s，默认为60s TCP，UDP协议的监听器不支持此字段
     * minimum: 1
     * maximum: 300
     * @return memberTimeout
     */
    public Integer getMemberTimeout() {
        return memberTimeout;
    }

    public void setMemberTimeout(Integer memberTimeout) {
        this.memberTimeout = memberTimeout;
    }

    public CreateListenerOption withIpgroup(CreateListenerIpGroupOption ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public CreateListenerOption withIpgroup(Consumer<CreateListenerIpGroupOption> ipgroupSetter) {
        if(this.ipgroup == null ){
            this.ipgroup = new CreateListenerIpGroupOption();
            ipgroupSetter.accept(this.ipgroup);
        }
        
        return this;
    }


    /**
     * Get ipgroup
     * @return ipgroup
     */
    public CreateListenerIpGroupOption getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(CreateListenerIpGroupOption ipgroup) {
        this.ipgroup = ipgroup;
    }

    public CreateListenerOption withTransparentClientIpEnable(Boolean transparentClientIpEnable) {
        this.transparentClientIpEnable = transparentClientIpEnable;
        return this;
    }

    


    /**
     * 获取客户端真实IP
     * @return transparentClientIpEnable
     */
    public Boolean getTransparentClientIpEnable() {
        return transparentClientIpEnable;
    }

    public void setTransparentClientIpEnable(Boolean transparentClientIpEnable) {
        this.transparentClientIpEnable = transparentClientIpEnable;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateListenerOption createListenerOption = (CreateListenerOption) o;
        return Objects.equals(this.adminStateUp, createListenerOption.adminStateUp) &&
            Objects.equals(this.clientCaTlsContainerRef, createListenerOption.clientCaTlsContainerRef) &&
            Objects.equals(this.defaultPoolId, createListenerOption.defaultPoolId) &&
            Objects.equals(this.defaultTlsContainerRef, createListenerOption.defaultTlsContainerRef) &&
            Objects.equals(this.description, createListenerOption.description) &&
            Objects.equals(this.http2Enable, createListenerOption.http2Enable) &&
            Objects.equals(this.insertHeaders, createListenerOption.insertHeaders) &&
            Objects.equals(this.loadbalancerId, createListenerOption.loadbalancerId) &&
            Objects.equals(this.name, createListenerOption.name) &&
            Objects.equals(this.projectId, createListenerOption.projectId) &&
            Objects.equals(this.protocol, createListenerOption.protocol) &&
            Objects.equals(this.protocolPort, createListenerOption.protocolPort) &&
            Objects.equals(this.sniContainerRefs, createListenerOption.sniContainerRefs) &&
            Objects.equals(this.tags, createListenerOption.tags) &&
            Objects.equals(this.tlsCiphersPolicy, createListenerOption.tlsCiphersPolicy) &&
            Objects.equals(this.enableMemberRetry, createListenerOption.enableMemberRetry) &&
            Objects.equals(this.keepaliveTimeout, createListenerOption.keepaliveTimeout) &&
            Objects.equals(this.clientTimeout, createListenerOption.clientTimeout) &&
            Objects.equals(this.memberTimeout, createListenerOption.memberTimeout) &&
            Objects.equals(this.ipgroup, createListenerOption.ipgroup) &&
            Objects.equals(this.transparentClientIpEnable, createListenerOption.transparentClientIpEnable);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, clientCaTlsContainerRef, defaultPoolId, defaultTlsContainerRef, description, http2Enable, insertHeaders, loadbalancerId, name, projectId, protocol, protocolPort, sniContainerRefs, tags, tlsCiphersPolicy, enableMemberRetry, keepaliveTimeout, clientTimeout, memberTimeout, ipgroup, transparentClientIpEnable);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateListenerOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    clientCaTlsContainerRef: ").append(toIndentedString(clientCaTlsContainerRef)).append("\n");
        sb.append("    defaultPoolId: ").append(toIndentedString(defaultPoolId)).append("\n");
        sb.append("    defaultTlsContainerRef: ").append(toIndentedString(defaultTlsContainerRef)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    insertHeaders: ").append(toIndentedString(insertHeaders)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    sniContainerRefs: ").append(toIndentedString(sniContainerRefs)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tlsCiphersPolicy: ").append(toIndentedString(tlsCiphersPolicy)).append("\n");
        sb.append("    enableMemberRetry: ").append(toIndentedString(enableMemberRetry)).append("\n");
        sb.append("    keepaliveTimeout: ").append(toIndentedString(keepaliveTimeout)).append("\n");
        sb.append("    clientTimeout: ").append(toIndentedString(clientTimeout)).append("\n");
        sb.append("    memberTimeout: ").append(toIndentedString(memberTimeout)).append("\n");
        sb.append("    ipgroup: ").append(toIndentedString(ipgroup)).append("\n");
        sb.append("    transparentClientIpEnable: ").append(toIndentedString(transparentClientIpEnable)).append("\n");
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

