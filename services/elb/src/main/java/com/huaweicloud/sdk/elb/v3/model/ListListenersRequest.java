package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListListenersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_ca_tls_container_ref")
    
    private List<String> clientCaTlsContainerRef = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_timeout")
    
    private List<Integer> clientTimeout = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection_limit")
    
    private List<Integer> connectionLimit = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_pool_id")
    
    private List<String> defaultPoolId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_tls_container_ref")
    
    private List<String> defaultTlsContainerRef = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private List<String> description = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_member_retry")
    
    private Boolean enableMemberRetry;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private List<String> enterpriseProjectId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http2_enable")
    
    private Boolean http2Enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private List<String> id = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keepalive_timeout")
    
    private List<Integer> keepaliveTimeout = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer_id")
    
    private List<String> loadbalancerId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_address")
    
    private List<String> memberAddress = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_device_id")
    
    private List<String> memberDeviceId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_timeout")
    
    private List<Integer> memberTimeout = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private List<String> name = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private List<String> protocol = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_port")
    
    private List<String> protocolPort = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tls_ciphers_policy")
    
    private List<String> tlsCiphersPolicy = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transparent_client_ip_enable")
    
    private Boolean transparentClientIpEnable;

    public ListListenersRequest withAdminStateUp(Boolean adminStateUp) {
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

    

    public ListListenersRequest withClientCaTlsContainerRef(List<String> clientCaTlsContainerRef) {
        this.clientCaTlsContainerRef = clientCaTlsContainerRef;
        return this;
    }

    
    public ListListenersRequest addClientCaTlsContainerRefItem(String clientCaTlsContainerRefItem) {
        if(this.clientCaTlsContainerRef == null) {
            this.clientCaTlsContainerRef = new ArrayList<>();
        }
        this.clientCaTlsContainerRef.add(clientCaTlsContainerRefItem);
        return this;
    }

    public ListListenersRequest withClientCaTlsContainerRef(Consumer<List<String>> clientCaTlsContainerRefSetter) {
        if(this.clientCaTlsContainerRef == null) {
            this.clientCaTlsContainerRef = new ArrayList<>();
        }
        clientCaTlsContainerRefSetter.accept(this.clientCaTlsContainerRef);
        return this;
    }

    /**
     * 监听器使用的CA证书ID。
     * @return clientCaTlsContainerRef
     */
    public List<String> getClientCaTlsContainerRef() {
        return clientCaTlsContainerRef;
    }

    public void setClientCaTlsContainerRef(List<String> clientCaTlsContainerRef) {
        this.clientCaTlsContainerRef = clientCaTlsContainerRef;
    }

    

    public ListListenersRequest withClientTimeout(List<Integer> clientTimeout) {
        this.clientTimeout = clientTimeout;
        return this;
    }

    
    public ListListenersRequest addClientTimeoutItem(Integer clientTimeoutItem) {
        if(this.clientTimeout == null) {
            this.clientTimeout = new ArrayList<>();
        }
        this.clientTimeout.add(clientTimeoutItem);
        return this;
    }

    public ListListenersRequest withClientTimeout(Consumer<List<Integer>> clientTimeoutSetter) {
        if(this.clientTimeout == null) {
            this.clientTimeout = new ArrayList<>();
        }
        clientTimeoutSetter.accept(this.clientTimeout);
        return this;
    }

    /**
     * 等待客户端请求超时时间，协议为HTTP， TERMINATED_HTTPS的监听器才有意义。取值范围 1-60
     * @return clientTimeout
     */
    public List<Integer> getClientTimeout() {
        return clientTimeout;
    }

    public void setClientTimeout(List<Integer> clientTimeout) {
        this.clientTimeout = clientTimeout;
    }

    

    public ListListenersRequest withConnectionLimit(List<Integer> connectionLimit) {
        this.connectionLimit = connectionLimit;
        return this;
    }

    
    public ListListenersRequest addConnectionLimitItem(Integer connectionLimitItem) {
        if(this.connectionLimit == null) {
            this.connectionLimit = new ArrayList<>();
        }
        this.connectionLimit.add(connectionLimitItem);
        return this;
    }

    public ListListenersRequest withConnectionLimit(Consumer<List<Integer>> connectionLimitSetter) {
        if(this.connectionLimit == null) {
            this.connectionLimit = new ArrayList<>();
        }
        connectionLimitSetter.accept(this.connectionLimit);
        return this;
    }

    /**
     * 监听器的最大连接数。该字段为预留字段，暂未启用。默认为-1。
     * @return connectionLimit
     */
    public List<Integer> getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(List<Integer> connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    

    public ListListenersRequest withDefaultPoolId(List<String> defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
        return this;
    }

    
    public ListListenersRequest addDefaultPoolIdItem(String defaultPoolIdItem) {
        if(this.defaultPoolId == null) {
            this.defaultPoolId = new ArrayList<>();
        }
        this.defaultPoolId.add(defaultPoolIdItem);
        return this;
    }

    public ListListenersRequest withDefaultPoolId(Consumer<List<String>> defaultPoolIdSetter) {
        if(this.defaultPoolId == null) {
            this.defaultPoolId = new ArrayList<>();
        }
        defaultPoolIdSetter.accept(this.defaultPoolId);
        return this;
    }

    /**
     * 监听器的默认后端云服务器组ID。当请求没有匹配的转发策略时，转发到默认后端云服务器上处理。
     * @return defaultPoolId
     */
    public List<String> getDefaultPoolId() {
        return defaultPoolId;
    }

    public void setDefaultPoolId(List<String> defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
    }

    

    public ListListenersRequest withDefaultTlsContainerRef(List<String> defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
        return this;
    }

    
    public ListListenersRequest addDefaultTlsContainerRefItem(String defaultTlsContainerRefItem) {
        if(this.defaultTlsContainerRef == null) {
            this.defaultTlsContainerRef = new ArrayList<>();
        }
        this.defaultTlsContainerRef.add(defaultTlsContainerRefItem);
        return this;
    }

    public ListListenersRequest withDefaultTlsContainerRef(Consumer<List<String>> defaultTlsContainerRefSetter) {
        if(this.defaultTlsContainerRef == null) {
            this.defaultTlsContainerRef = new ArrayList<>();
        }
        defaultTlsContainerRefSetter.accept(this.defaultTlsContainerRef);
        return this;
    }

    /**
     * 监听器使用的服务器证书ID。
     * @return defaultTlsContainerRef
     */
    public List<String> getDefaultTlsContainerRef() {
        return defaultTlsContainerRef;
    }

    public void setDefaultTlsContainerRef(List<String> defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
    }

    

    public ListListenersRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    
    public ListListenersRequest addDescriptionItem(String descriptionItem) {
        if(this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListListenersRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if(this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 监听器的描述信息。
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    

    public ListListenersRequest withEnableMemberRetry(Boolean enableMemberRetry) {
        this.enableMemberRetry = enableMemberRetry;
        return this;
    }

    


    /**
     * 后端重试探测的开关
     * @return enableMemberRetry
     */
    public Boolean getEnableMemberRetry() {
        return enableMemberRetry;
    }

    public void setEnableMemberRetry(Boolean enableMemberRetry) {
        this.enableMemberRetry = enableMemberRetry;
    }

    

    public ListListenersRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    
    public ListListenersRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if(this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListListenersRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if(this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ListListenersRequest withHttp2Enable(Boolean http2Enable) {
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

    

    public ListListenersRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    
    public ListListenersRequest addIdItem(String idItem) {
        if(this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListListenersRequest withId(Consumer<List<String>> idSetter) {
        if(this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 监听器ID。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    

    public ListListenersRequest withKeepaliveTimeout(List<Integer> keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
        return this;
    }

    
    public ListListenersRequest addKeepaliveTimeoutItem(Integer keepaliveTimeoutItem) {
        if(this.keepaliveTimeout == null) {
            this.keepaliveTimeout = new ArrayList<>();
        }
        this.keepaliveTimeout.add(keepaliveTimeoutItem);
        return this;
    }

    public ListListenersRequest withKeepaliveTimeout(Consumer<List<Integer>> keepaliveTimeoutSetter) {
        if(this.keepaliveTimeout == null) {
            this.keepaliveTimeout = new ArrayList<>();
        }
        keepaliveTimeoutSetter.accept(this.keepaliveTimeout);
        return this;
    }

    /**
     * TCP监听器配置空闲超时时间，取值范围为（10-900s）默认值为300s，TCP监听器配置空闲超时时间，取值范围为（10-900s）默认值为300s，HTTP/TERMINATED_HTTPS监听器为客户端连接空闲超时时间，取值范围为（1-300s）默认值为15s。 UDP此字段无意义
     * @return keepaliveTimeout
     */
    public List<Integer> getKeepaliveTimeout() {
        return keepaliveTimeout;
    }

    public void setKeepaliveTimeout(List<Integer> keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
    }

    

    public ListListenersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页返回的个数。
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListListenersRequest withLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    
    public ListListenersRequest addLoadbalancerIdItem(String loadbalancerIdItem) {
        if(this.loadbalancerId == null) {
            this.loadbalancerId = new ArrayList<>();
        }
        this.loadbalancerId.add(loadbalancerIdItem);
        return this;
    }

    public ListListenersRequest withLoadbalancerId(Consumer<List<String>> loadbalancerIdSetter) {
        if(this.loadbalancerId == null) {
            this.loadbalancerId = new ArrayList<>();
        }
        loadbalancerIdSetter.accept(this.loadbalancerId);
        return this;
    }

    /**
     * 监听器绑定的负载均衡器ID。
     * @return loadbalancerId
     */
    public List<String> getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    

    public ListListenersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 上一页最后一条记录的ID。  使用说明：  - 必须与limit一起使用。 - 不指定时表示查询第一页。 - 该字段不允许为空或无效的ID。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public ListListenersRequest withMemberAddress(List<String> memberAddress) {
        this.memberAddress = memberAddress;
        return this;
    }

    
    public ListListenersRequest addMemberAddressItem(String memberAddressItem) {
        if(this.memberAddress == null) {
            this.memberAddress = new ArrayList<>();
        }
        this.memberAddress.add(memberAddressItem);
        return this;
    }

    public ListListenersRequest withMemberAddress(Consumer<List<String>> memberAddressSetter) {
        if(this.memberAddress == null) {
            this.memberAddress = new ArrayList<>();
        }
        memberAddressSetter.accept(this.memberAddress);
        return this;
    }

    /**
     * 后端云服务器的IP地址。
     * @return memberAddress
     */
    public List<String> getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(List<String> memberAddress) {
        this.memberAddress = memberAddress;
    }

    

    public ListListenersRequest withMemberDeviceId(List<String> memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
        return this;
    }

    
    public ListListenersRequest addMemberDeviceIdItem(String memberDeviceIdItem) {
        if(this.memberDeviceId == null) {
            this.memberDeviceId = new ArrayList<>();
        }
        this.memberDeviceId.add(memberDeviceIdItem);
        return this;
    }

    public ListListenersRequest withMemberDeviceId(Consumer<List<String>> memberDeviceIdSetter) {
        if(this.memberDeviceId == null) {
            this.memberDeviceId = new ArrayList<>();
        }
        memberDeviceIdSetter.accept(this.memberDeviceId);
        return this;
    }

    /**
     * 后端云服务器对应的弹性云服务器的ID。
     * @return memberDeviceId
     */
    public List<String> getMemberDeviceId() {
        return memberDeviceId;
    }

    public void setMemberDeviceId(List<String> memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
    }

    

    public ListListenersRequest withMemberTimeout(List<Integer> memberTimeout) {
        this.memberTimeout = memberTimeout;
        return this;
    }

    
    public ListListenersRequest addMemberTimeoutItem(Integer memberTimeoutItem) {
        if(this.memberTimeout == null) {
            this.memberTimeout = new ArrayList<>();
        }
        this.memberTimeout.add(memberTimeoutItem);
        return this;
    }

    public ListListenersRequest withMemberTimeout(Consumer<List<Integer>> memberTimeoutSetter) {
        if(this.memberTimeout == null) {
            this.memberTimeout = new ArrayList<>();
        }
        memberTimeoutSetter.accept(this.memberTimeout);
        return this;
    }

    /**
     * 等待后端服务器请求超时时间，协议为HTTP， TERMINATED_HTTPS时才有意义。取值范围 1-300
     * @return memberTimeout
     */
    public List<Integer> getMemberTimeout() {
        return memberTimeout;
    }

    public void setMemberTimeout(List<Integer> memberTimeout) {
        this.memberTimeout = memberTimeout;
    }

    

    public ListListenersRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    
    public ListListenersRequest addNameItem(String nameItem) {
        if(this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListListenersRequest withName(Consumer<List<String>> nameSetter) {
        if(this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 监听器名称。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    

    public ListListenersRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    


    /**
     * 分页的顺序，true表示从后往前分页，false表示从前往后分页，默认为false。 使用说明：必须与limit一起使用。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    

    public ListListenersRequest withProtocol(List<String> protocol) {
        this.protocol = protocol;
        return this;
    }

    
    public ListListenersRequest addProtocolItem(String protocolItem) {
        if(this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        this.protocol.add(protocolItem);
        return this;
    }

    public ListListenersRequest withProtocol(Consumer<List<String>> protocolSetter) {
        if(this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        protocolSetter.accept(this.protocol);
        return this;
    }

    /**
     * 监听器的监听协议。 取值：UDP,TCP,HTTP,TERMINATED_HTTPS。
     * @return protocol
     */
    public List<String> getProtocol() {
        return protocol;
    }

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    

    public ListListenersRequest withProtocolPort(List<String> protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    
    public ListListenersRequest addProtocolPortItem(String protocolPortItem) {
        if(this.protocolPort == null) {
            this.protocolPort = new ArrayList<>();
        }
        this.protocolPort.add(protocolPortItem);
        return this;
    }

    public ListListenersRequest withProtocolPort(Consumer<List<String>> protocolPortSetter) {
        if(this.protocolPort == null) {
            this.protocolPort = new ArrayList<>();
        }
        protocolPortSetter.accept(this.protocolPort);
        return this;
    }

    /**
     * 监听器的监听端口。
     * @return protocolPort
     */
    public List<String> getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(List<String> protocolPort) {
        this.protocolPort = protocolPort;
    }

    

    public ListListenersRequest withTlsCiphersPolicy(List<String> tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
        return this;
    }

    
    public ListListenersRequest addTlsCiphersPolicyItem(String tlsCiphersPolicyItem) {
        if(this.tlsCiphersPolicy == null) {
            this.tlsCiphersPolicy = new ArrayList<>();
        }
        this.tlsCiphersPolicy.add(tlsCiphersPolicyItem);
        return this;
    }

    public ListListenersRequest withTlsCiphersPolicy(Consumer<List<String>> tlsCiphersPolicySetter) {
        if(this.tlsCiphersPolicy == null) {
            this.tlsCiphersPolicy = new ArrayList<>();
        }
        tlsCiphersPolicySetter.accept(this.tlsCiphersPolicy);
        return this;
    }

    /**
     * 监听器使用的安全策略，仅对TERMINATED_HTTPS协议类型的监听器有效，且默认值为tls-1-0。 取值包括：tls-1-0, tls-1-1, tls-1-2, tls-1-2-strict四种安全策略。
     * @return tlsCiphersPolicy
     */
    public List<String> getTlsCiphersPolicy() {
        return tlsCiphersPolicy;
    }

    public void setTlsCiphersPolicy(List<String> tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
    }

    

    public ListListenersRequest withTransparentClientIpEnable(Boolean transparentClientIpEnable) {
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
        ListListenersRequest listListenersRequest = (ListListenersRequest) o;
        return Objects.equals(this.adminStateUp, listListenersRequest.adminStateUp) &&
            Objects.equals(this.clientCaTlsContainerRef, listListenersRequest.clientCaTlsContainerRef) &&
            Objects.equals(this.clientTimeout, listListenersRequest.clientTimeout) &&
            Objects.equals(this.connectionLimit, listListenersRequest.connectionLimit) &&
            Objects.equals(this.defaultPoolId, listListenersRequest.defaultPoolId) &&
            Objects.equals(this.defaultTlsContainerRef, listListenersRequest.defaultTlsContainerRef) &&
            Objects.equals(this.description, listListenersRequest.description) &&
            Objects.equals(this.enableMemberRetry, listListenersRequest.enableMemberRetry) &&
            Objects.equals(this.enterpriseProjectId, listListenersRequest.enterpriseProjectId) &&
            Objects.equals(this.http2Enable, listListenersRequest.http2Enable) &&
            Objects.equals(this.id, listListenersRequest.id) &&
            Objects.equals(this.keepaliveTimeout, listListenersRequest.keepaliveTimeout) &&
            Objects.equals(this.limit, listListenersRequest.limit) &&
            Objects.equals(this.loadbalancerId, listListenersRequest.loadbalancerId) &&
            Objects.equals(this.marker, listListenersRequest.marker) &&
            Objects.equals(this.memberAddress, listListenersRequest.memberAddress) &&
            Objects.equals(this.memberDeviceId, listListenersRequest.memberDeviceId) &&
            Objects.equals(this.memberTimeout, listListenersRequest.memberTimeout) &&
            Objects.equals(this.name, listListenersRequest.name) &&
            Objects.equals(this.pageReverse, listListenersRequest.pageReverse) &&
            Objects.equals(this.protocol, listListenersRequest.protocol) &&
            Objects.equals(this.protocolPort, listListenersRequest.protocolPort) &&
            Objects.equals(this.tlsCiphersPolicy, listListenersRequest.tlsCiphersPolicy) &&
            Objects.equals(this.transparentClientIpEnable, listListenersRequest.transparentClientIpEnable);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, clientCaTlsContainerRef, clientTimeout, connectionLimit, defaultPoolId, defaultTlsContainerRef, description, enableMemberRetry, enterpriseProjectId, http2Enable, id, keepaliveTimeout, limit, loadbalancerId, marker, memberAddress, memberDeviceId, memberTimeout, name, pageReverse, protocol, protocolPort, tlsCiphersPolicy, transparentClientIpEnable);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListListenersRequest {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    clientCaTlsContainerRef: ").append(toIndentedString(clientCaTlsContainerRef)).append("\n");
        sb.append("    clientTimeout: ").append(toIndentedString(clientTimeout)).append("\n");
        sb.append("    connectionLimit: ").append(toIndentedString(connectionLimit)).append("\n");
        sb.append("    defaultPoolId: ").append(toIndentedString(defaultPoolId)).append("\n");
        sb.append("    defaultTlsContainerRef: ").append(toIndentedString(defaultTlsContainerRef)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enableMemberRetry: ").append(toIndentedString(enableMemberRetry)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    keepaliveTimeout: ").append(toIndentedString(keepaliveTimeout)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    memberAddress: ").append(toIndentedString(memberAddress)).append("\n");
        sb.append("    memberDeviceId: ").append(toIndentedString(memberDeviceId)).append("\n");
        sb.append("    memberTimeout: ").append(toIndentedString(memberTimeout)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    tlsCiphersPolicy: ").append(toIndentedString(tlsCiphersPolicy)).append("\n");
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

