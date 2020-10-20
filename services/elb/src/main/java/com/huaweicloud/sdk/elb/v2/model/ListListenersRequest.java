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
public class ListListenersRequest  {



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
    @JsonProperty(value="description")
    
    private String description;


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
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol_port")
    
    private Integer protocolPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tls_ciphers_policy")
    
    private String tlsCiphersPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_timeout")
    
    private Integer memberTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_timeout")
    
    private Integer clientTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keepalive_timeout")
    
    private Integer keepaliveTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tls_container_id")
    
    private String tlsContainerId;

    public ListListenersRequest withLimit(Integer limit) {
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

    public ListListenersRequest withMarker(String marker) {
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

    public ListListenersRequest withPageReverse(Boolean pageReverse) {
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

    public ListListenersRequest withId(String id) {
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

    public ListListenersRequest withName(String name) {
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

    public ListListenersRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * Get description
     * @return description
     */
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

    


    /**
     * Get defaultPoolId
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
     * Get defaultTlsContainerRef
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
     * Get clientCaTlsContainerRef
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
     * Get protocol
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
     * Get protocolPort
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
     * Get tlsCiphersPolicy
     * @return tlsCiphersPolicy
     */
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

    


    /**
     * Get memberTimeout
     * @return memberTimeout
     */
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

    


    /**
     * Get clientTimeout
     * @return clientTimeout
     */
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

    


    /**
     * Get keepaliveTimeout
     * @return keepaliveTimeout
     */
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

    


    /**
     * Get tlsContainerId
     * @return tlsContainerId
     */
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
        return Objects.equals(this.limit, listListenersRequest.limit) &&
            Objects.equals(this.marker, listListenersRequest.marker) &&
            Objects.equals(this.pageReverse, listListenersRequest.pageReverse) &&
            Objects.equals(this.id, listListenersRequest.id) &&
            Objects.equals(this.name, listListenersRequest.name) &&
            Objects.equals(this.description, listListenersRequest.description) &&
            Objects.equals(this.defaultPoolId, listListenersRequest.defaultPoolId) &&
            Objects.equals(this.defaultTlsContainerRef, listListenersRequest.defaultTlsContainerRef) &&
            Objects.equals(this.clientCaTlsContainerRef, listListenersRequest.clientCaTlsContainerRef) &&
            Objects.equals(this.protocol, listListenersRequest.protocol) &&
            Objects.equals(this.protocolPort, listListenersRequest.protocolPort) &&
            Objects.equals(this.tlsCiphersPolicy, listListenersRequest.tlsCiphersPolicy) &&
            Objects.equals(this.memberTimeout, listListenersRequest.memberTimeout) &&
            Objects.equals(this.clientTimeout, listListenersRequest.clientTimeout) &&
            Objects.equals(this.keepaliveTimeout, listListenersRequest.keepaliveTimeout) &&
            Objects.equals(this.tlsContainerId, listListenersRequest.tlsContainerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, pageReverse, id, name, description, defaultPoolId, defaultTlsContainerRef, clientCaTlsContainerRef, protocol, protocolPort, tlsCiphersPolicy, memberTimeout, clientTimeout, keepaliveTimeout, tlsContainerId);
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

