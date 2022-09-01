package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListListenersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    @JacksonXmlProperty(localName = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    @JacksonXmlProperty(localName = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    @JacksonXmlProperty(localName = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_limit")

    @JacksonXmlProperty(localName = "connection_limit")

    private Integer connectionLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    @JacksonXmlProperty(localName = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_pool_id")

    @JacksonXmlProperty(localName = "default_pool_id")

    private String defaultPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_tls_container_ref")

    @JacksonXmlProperty(localName = "default_tls_container_ref")

    private String defaultTlsContainerRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_tls_container_ref")

    @JacksonXmlProperty(localName = "client_ca_tls_container_ref")

    private String clientCaTlsContainerRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    @JacksonXmlProperty(localName = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    @JacksonXmlProperty(localName = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_ciphers_policy")

    @JacksonXmlProperty(localName = "tls_ciphers_policy")

    private String tlsCiphersPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_container_id")

    @JacksonXmlProperty(localName = "tls_container_id")

    private String tlsContainerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2_enable")

    @JacksonXmlProperty(localName = "http2_enable")

    private Boolean http2Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListListenersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询中每页的监听器个数
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

    public ListListenersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询的起始的资源id，表示上一页最后一条查询记录的负载均衡器的id。不指定时表示查询第一页。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListListenersRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 分页的顺序，true表示从后往前分页，false表示从前往后分页，默认为false。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListListenersRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 监听器ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListListenersRequest withName(String name) {
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

    public ListListenersRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 监听器的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListListenersRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * 监听器所在的负载均衡器ID。
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public ListListenersRequest withConnectionLimit(Integer connectionLimit) {
        this.connectionLimit = connectionLimit;
        return this;
    }

    /**
     * 监听器的最大连接数。
     * @return connectionLimit
     */
    public Integer getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(Integer connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public ListListenersRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 监听器的管理状态。该字段为预留字段，暂未启用。默认为true。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListListenersRequest withDefaultPoolId(String defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
        return this;
    }

    /**
     * 监听器的默认后端云服务器组ID。
     * @return defaultPoolId
     */
    public String getDefaultPoolId() {
        return defaultPoolId;
    }

    public void setDefaultPoolId(String defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
    }

    public ListListenersRequest withDefaultTlsContainerRef(String defaultTlsContainerRef) {
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

    public ListListenersRequest withClientCaTlsContainerRef(String clientCaTlsContainerRef) {
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

    public ListListenersRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 监听器的监听协议。取值范围：TCP、HTTP、UDP、TERMINATED_HTTPS。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public ListListenersRequest withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * 监听器的监听端口。
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    public ListListenersRequest withTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
        return this;
    }

    /**
     * 监听器使用的安全策略，仅对TERMINATED_HTTPS协议类型的监听器有效，且默认值为tls-1-0。取值包括：tls-1-0, tls-1-1, tls-1-2, tls-1-2-strict四种安全策略。
     * @return tlsCiphersPolicy
     */
    public String getTlsCiphersPolicy() {
        return tlsCiphersPolicy;
    }

    public void setTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
    }

    public ListListenersRequest withTlsContainerId(String tlsContainerId) {
        this.tlsContainerId = tlsContainerId;
        return this;
    }

    /**
     * 查询证书所关联的监听器
     * @return tlsContainerId
     */
    public String getTlsContainerId() {
        return tlsContainerId;
    }

    public void setTlsContainerId(String tlsContainerId) {
        this.tlsContainerId = tlsContainerId;
    }

    public ListListenersRequest withHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
        return this;
    }

    /**
     * HTTP2功能的开启状态。取值范围：true/false。true：开启。false：关闭。
     * @return http2Enable
     */
    public Boolean getHttp2Enable() {
        return http2Enable;
    }

    public void setHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
    }

    public ListListenersRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，仅用于基于企业项目的细粒度鉴权使用。 - 如果参数传递default_pool_id，则以pool对应的企业项目ID鉴权。 - 如果default_pool_id和enterprise_project_id都没有传递 ，则进行细粒度鉴权 ，必须在用户
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
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
        return Objects.equals(this.limit, listListenersRequest.limit)
            && Objects.equals(this.marker, listListenersRequest.marker)
            && Objects.equals(this.pageReverse, listListenersRequest.pageReverse)
            && Objects.equals(this.id, listListenersRequest.id) && Objects.equals(this.name, listListenersRequest.name)
            && Objects.equals(this.description, listListenersRequest.description)
            && Objects.equals(this.loadbalancerId, listListenersRequest.loadbalancerId)
            && Objects.equals(this.connectionLimit, listListenersRequest.connectionLimit)
            && Objects.equals(this.adminStateUp, listListenersRequest.adminStateUp)
            && Objects.equals(this.defaultPoolId, listListenersRequest.defaultPoolId)
            && Objects.equals(this.defaultTlsContainerRef, listListenersRequest.defaultTlsContainerRef)
            && Objects.equals(this.clientCaTlsContainerRef, listListenersRequest.clientCaTlsContainerRef)
            && Objects.equals(this.protocol, listListenersRequest.protocol)
            && Objects.equals(this.protocolPort, listListenersRequest.protocolPort)
            && Objects.equals(this.tlsCiphersPolicy, listListenersRequest.tlsCiphersPolicy)
            && Objects.equals(this.tlsContainerId, listListenersRequest.tlsContainerId)
            && Objects.equals(this.http2Enable, listListenersRequest.http2Enable)
            && Objects.equals(this.enterpriseProjectId, listListenersRequest.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            pageReverse,
            id,
            name,
            description,
            loadbalancerId,
            connectionLimit,
            adminStateUp,
            defaultPoolId,
            defaultTlsContainerRef,
            clientCaTlsContainerRef,
            protocol,
            protocolPort,
            tlsCiphersPolicy,
            tlsContainerId,
            http2Enable,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListListenersRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    connectionLimit: ").append(toIndentedString(connectionLimit)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    defaultPoolId: ").append(toIndentedString(defaultPoolId)).append("\n");
        sb.append("    defaultTlsContainerRef: ").append(toIndentedString(defaultTlsContainerRef)).append("\n");
        sb.append("    clientCaTlsContainerRef: ").append(toIndentedString(clientCaTlsContainerRef)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    tlsCiphersPolicy: ").append(toIndentedString(tlsCiphersPolicy)).append("\n");
        sb.append("    tlsContainerId: ").append(toIndentedString(tlsContainerId)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
