package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListListenersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_pool_id")

    private String defaultPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_tls_container_ref")

    private String defaultTlsContainerRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_tls_container_ref")

    private String clientCaTlsContainerRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_ciphers_policy")

    private String tlsCiphersPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_timeout")

    private Integer memberTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_timeout")

    private Integer clientTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepalive_timeout")

    private Integer keepaliveTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_container_id")

    private String tlsContainerId;

    public ListListenersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 分页查询中每页的监听器个数 minimum: 0 maximum: 9223372036854775807
     * 
     * @return limit */
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

    /** 分页查询的起始的资源id，表示上一页最后一条查询记录的负载均衡器的id。不指定时表示查询第一页。
     * 
     * @return marker */
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

    /** 分页的顺序，true表示从后往前分页，false表示从前往后分页，默认为false。
     * 
     * @return pageReverse */
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

    /** 监听器ID。
     * 
     * @return id */
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

    /** 监听器名称。
     * 
     * @return name */
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

    /** 监听器的描述信息。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListListenersRequest withDefaultPoolId(String defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
        return this;
    }

    /** 监听器的默认后端云服务器组ID。
     * 
     * @return defaultPoolId */
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

    /** 监听器使用的服务器证书ID。
     * 
     * @return defaultTlsContainerRef */
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

    /** 监听器使用的CA证书ID。
     * 
     * @return clientCaTlsContainerRef */
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

    /** 监听器的监听协议。取值范围：TCP、HTTP、UDP、TERMINATED_HTTPS。
     * 
     * @return protocol */
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

    /** 监听器的监听端口。
     * 
     * @return protocolPort */
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

    /** 监听器使用的安全策略，仅对TERMINATED_HTTPS协议类型的监听器有效，且默认值为tls-1-0。取值包括：tls-1-0, tls-1-1, tls-1-2, tls-1-2-strict四种安全策略。
     * 
     * @return tlsCiphersPolicy */
    public String getTlsCiphersPolicy() {
        return tlsCiphersPolicy;
    }

    public void setTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
    }

    public ListListenersRequest withMemberTimeout(Integer memberTimeout) {
        this.memberTimeout = memberTimeout;
        return this;
    }

    /** 等待后端服务器请求超时时间，协议为HTTP， TERMINATED_HTTPS时才有意义。取值范围 1-300
     * 
     * @return memberTimeout */
    public Integer getMemberTimeout() {
        return memberTimeout;
    }

    public void setMemberTimeout(Integer memberTimeout) {
        this.memberTimeout = memberTimeout;
    }

    public ListListenersRequest withClientTimeout(Integer clientTimeout) {
        this.clientTimeout = clientTimeout;
        return this;
    }

    /** 等待客户端请求超时时间，协议为HTTP， TERMINATED_HTTPS的监听器才有意义。取值范围 1-60
     * 
     * @return clientTimeout */
    public Integer getClientTimeout() {
        return clientTimeout;
    }

    public void setClientTimeout(Integer clientTimeout) {
        this.clientTimeout = clientTimeout;
    }

    public ListListenersRequest withKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
        return this;
    }

    /** TCP监听器配置空闲超时时间，取值范围为（10-900s）默认值为300s，TCP监听器配置空闲超时时间，取值范围为（10-900s）默认值为300s，HTTP/TERMINATED_HTTPS监听器为客户端连接空闲超时时间，取值范围为（1-300s）默认值为15s。
     * UDP此字段无意义
     * 
     * @return keepaliveTimeout */
    public Integer getKeepaliveTimeout() {
        return keepaliveTimeout;
    }

    public void setKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
    }

    public ListListenersRequest withTlsContainerId(String tlsContainerId) {
        this.tlsContainerId = tlsContainerId;
        return this;
    }

    /** 查询证书所关联的监听器
     * 
     * @return tlsContainerId */
    public String getTlsContainerId() {
        return tlsContainerId;
    }

    public void setTlsContainerId(String tlsContainerId) {
        this.tlsContainerId = tlsContainerId;
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
            && Objects.equals(this.defaultPoolId, listListenersRequest.defaultPoolId)
            && Objects.equals(this.defaultTlsContainerRef, listListenersRequest.defaultTlsContainerRef)
            && Objects.equals(this.clientCaTlsContainerRef, listListenersRequest.clientCaTlsContainerRef)
            && Objects.equals(this.protocol, listListenersRequest.protocol)
            && Objects.equals(this.protocolPort, listListenersRequest.protocolPort)
            && Objects.equals(this.tlsCiphersPolicy, listListenersRequest.tlsCiphersPolicy)
            && Objects.equals(this.memberTimeout, listListenersRequest.memberTimeout)
            && Objects.equals(this.clientTimeout, listListenersRequest.clientTimeout)
            && Objects.equals(this.keepaliveTimeout, listListenersRequest.keepaliveTimeout)
            && Objects.equals(this.tlsContainerId, listListenersRequest.tlsContainerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            pageReverse,
            id,
            name,
            description,
            defaultPoolId,
            defaultTlsContainerRef,
            clientCaTlsContainerRef,
            protocol,
            protocolPort,
            tlsCiphersPolicy,
            memberTimeout,
            clientTimeout,
            keepaliveTimeout,
            tlsContainerId);
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
        sb.append("    defaultPoolId: ").append(toIndentedString(defaultPoolId)).append("\n");
        sb.append("    defaultTlsContainerRef: ").append(toIndentedString(defaultTlsContainerRef)).append("\n");
        sb.append("    clientCaTlsContainerRef: ").append(toIndentedString(clientCaTlsContainerRef)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    tlsCiphersPolicy: ").append(toIndentedString(tlsCiphersPolicy)).append("\n");
        sb.append("    memberTimeout: ").append(toIndentedString(memberTimeout)).append("\n");
        sb.append("    clientTimeout: ").append(toIndentedString(clientTimeout)).append("\n");
        sb.append("    keepaliveTimeout: ").append(toIndentedString(keepaliveTimeout)).append("\n");
        sb.append("    tlsContainerId: ").append(toIndentedString(tlsContainerId)).append("\n");
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
