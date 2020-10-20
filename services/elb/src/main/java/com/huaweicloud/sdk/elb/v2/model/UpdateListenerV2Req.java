package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.InsertHeader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新监听器的结构体
 */
public class UpdateListenerV2Req  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection_limit")
    
    private Integer connectionLimit = -1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http2_enable")
    
    private Boolean http2Enable = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_pool_id")
    
    private String defaultPoolId = "null";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_tls_container_ref")
    
    private String defaultTlsContainerRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_ca_tls_container_ref")
    
    private String clientCaTlsContainerRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sni_container_refs")
    
    private List<String> sniContainerRefs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="insert_headers")
    
    private InsertHeader insertHeaders = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tls_ciphers_policy")
    
    private String tlsCiphersPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;

    public UpdateListenerV2Req withName(String name) {
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

    public UpdateListenerV2Req withDescription(String description) {
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

    public UpdateListenerV2Req withConnectionLimit(Integer connectionLimit) {
        this.connectionLimit = connectionLimit;
        return this;
    }

    


    /**
     * 监听器的最大连接数。该字段为预留字段，暂未启用。默认为-1。
     * maximum: 2147483647
     * @return connectionLimit
     */
    public Integer getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(Integer connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public UpdateListenerV2Req withHttp2Enable(Boolean http2Enable) {
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

    public UpdateListenerV2Req withDefaultPoolId(String defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
        return this;
    }

    


    /**
     * 监听器的默认后端云服务器组ID。当请求没有匹配的转发策略时，转发到默认后端云服务器上处理。当该字段为null时，表示监听器无默认的后端云服务器组。
     * @return defaultPoolId
     */
    public String getDefaultPoolId() {
        return defaultPoolId;
    }

    public void setDefaultPoolId(String defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
    }

    public UpdateListenerV2Req withDefaultTlsContainerRef(String defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
        return this;
    }

    


    /**
     * 监听器使用的服务器证书ID。当protocol参数为TERMINATED_HTTPS时，为必选字段
     * @return defaultTlsContainerRef
     */
    public String getDefaultTlsContainerRef() {
        return defaultTlsContainerRef;
    }

    public void setDefaultTlsContainerRef(String defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
    }

    public UpdateListenerV2Req withClientCaTlsContainerRef(String clientCaTlsContainerRef) {
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

    public UpdateListenerV2Req withSniContainerRefs(List<String> sniContainerRefs) {
        this.sniContainerRefs = sniContainerRefs;
        return this;
    }

    
    public UpdateListenerV2Req addSniContainerRefsItem(String sniContainerRefsItem) {
        if (this.sniContainerRefs == null) {
            this.sniContainerRefs = new ArrayList<>();
        }
        this.sniContainerRefs.add(sniContainerRefsItem);
        return this;
    }

    public UpdateListenerV2Req withSniContainerRefs(Consumer<List<String>> sniContainerRefsSetter) {
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

    public UpdateListenerV2Req withInsertHeaders(InsertHeader insertHeaders) {
        this.insertHeaders = insertHeaders;
        return this;
    }

    public UpdateListenerV2Req withInsertHeaders(Consumer<InsertHeader> insertHeadersSetter) {
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

    public UpdateListenerV2Req withTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
        return this;
    }

    


    /**
     * 监听器使用的安全策略，仅对TERMINATED_HTTPS协议类型的监听器有效。  取值包括：tls-1-0, tls-1-1, tls-1-2, tls-1-2-strict多种安全策略。
     * @return tlsCiphersPolicy
     */
    public String getTlsCiphersPolicy() {
        return tlsCiphersPolicy;
    }

    public void setTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
    }

    public UpdateListenerV2Req withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 监听器的管理状态。  该字段为预留字段，暂未启动。只支持设定为true
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateListenerV2Req updateListenerV2Req = (UpdateListenerV2Req) o;
        return Objects.equals(this.name, updateListenerV2Req.name) &&
            Objects.equals(this.description, updateListenerV2Req.description) &&
            Objects.equals(this.connectionLimit, updateListenerV2Req.connectionLimit) &&
            Objects.equals(this.http2Enable, updateListenerV2Req.http2Enable) &&
            Objects.equals(this.defaultPoolId, updateListenerV2Req.defaultPoolId) &&
            Objects.equals(this.defaultTlsContainerRef, updateListenerV2Req.defaultTlsContainerRef) &&
            Objects.equals(this.clientCaTlsContainerRef, updateListenerV2Req.clientCaTlsContainerRef) &&
            Objects.equals(this.sniContainerRefs, updateListenerV2Req.sniContainerRefs) &&
            Objects.equals(this.insertHeaders, updateListenerV2Req.insertHeaders) &&
            Objects.equals(this.tlsCiphersPolicy, updateListenerV2Req.tlsCiphersPolicy) &&
            Objects.equals(this.adminStateUp, updateListenerV2Req.adminStateUp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, connectionLimit, http2Enable, defaultPoolId, defaultTlsContainerRef, clientCaTlsContainerRef, sniContainerRefs, insertHeaders, tlsCiphersPolicy, adminStateUp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateListenerV2Req {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    connectionLimit: ").append(toIndentedString(connectionLimit)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    defaultPoolId: ").append(toIndentedString(defaultPoolId)).append("\n");
        sb.append("    defaultTlsContainerRef: ").append(toIndentedString(defaultTlsContainerRef)).append("\n");
        sb.append("    clientCaTlsContainerRef: ").append(toIndentedString(clientCaTlsContainerRef)).append("\n");
        sb.append("    sniContainerRefs: ").append(toIndentedString(sniContainerRefs)).append("\n");
        sb.append("    insertHeaders: ").append(toIndentedString(insertHeaders)).append("\n");
        sb.append("    tlsCiphersPolicy: ").append(toIndentedString(tlsCiphersPolicy)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
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

