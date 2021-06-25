package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.PremiumWafServer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DeleteInstaneResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostname")
    
    private String hostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policyid")
    
    private String policyid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_code")
    
    private String accessCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protect_status")
    
    private Integer protectStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_status")
    
    private Integer accessStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificateid")
    
    private String certificateid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificatename")
    
    private String certificatename;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server")
    
    private List<PremiumWafServer> server = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy")
    
    private Boolean proxy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private Long timestamp;

    public DeleteInstaneResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 域名id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public DeleteInstaneResponse withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    


    /**
     * 创建的云模式防护域名
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    

    public DeleteInstaneResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    


    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    

    public DeleteInstaneResponse withAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }

    


    /**
     * cname
     * @return accessCode
     */
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    

    public DeleteInstaneResponse withProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    


    /**
     * 防护状态
     * @return protectStatus
     */
    public Integer getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(Integer protectStatus) {
        this.protectStatus = protectStatus;
    }

    

    public DeleteInstaneResponse withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    


    /**
     * 接入状态
     * @return accessStatus
     */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    

    public DeleteInstaneResponse withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 返回的客户端协议类型
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    public DeleteInstaneResponse withCertificateid(String certificateid) {
        this.certificateid = certificateid;
        return this;
    }

    


    /**
     * 返回的证书id
     * @return certificateid
     */
    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }

    

    public DeleteInstaneResponse withCertificatename(String certificatename) {
        this.certificatename = certificatename;
        return this;
    }

    


    /**
     * 证书名称
     * @return certificatename
     */
    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename;
    }

    

    public DeleteInstaneResponse withServer(List<PremiumWafServer> server) {
        this.server = server;
        return this;
    }

    
    public DeleteInstaneResponse addServerItem(PremiumWafServer serverItem) {
        if(this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public DeleteInstaneResponse withServer(Consumer<List<PremiumWafServer>> serverSetter) {
        if(this.server == null) {
            this.server = new ArrayList<>();
        }
        serverSetter.accept(this.server);
        return this;
    }

    /**
     * 源站信息
     * @return server
     */
    public List<PremiumWafServer> getServer() {
        return server;
    }

    public void setServer(List<PremiumWafServer> server) {
        this.server = server;
    }

    

    public DeleteInstaneResponse withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    


    /**
     * 是否开启了代理
     * @return proxy
     */
    public Boolean getProxy() {
        return proxy;
    }

    public void setProxy(Boolean proxy) {
        this.proxy = proxy;
    }

    

    public DeleteInstaneResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 创建防护域名的时间
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteInstaneResponse deleteInstaneResponse = (DeleteInstaneResponse) o;
        return Objects.equals(this.id, deleteInstaneResponse.id) &&
            Objects.equals(this.hostname, deleteInstaneResponse.hostname) &&
            Objects.equals(this.policyid, deleteInstaneResponse.policyid) &&
            Objects.equals(this.accessCode, deleteInstaneResponse.accessCode) &&
            Objects.equals(this.protectStatus, deleteInstaneResponse.protectStatus) &&
            Objects.equals(this.accessStatus, deleteInstaneResponse.accessStatus) &&
            Objects.equals(this.protocol, deleteInstaneResponse.protocol) &&
            Objects.equals(this.certificateid, deleteInstaneResponse.certificateid) &&
            Objects.equals(this.certificatename, deleteInstaneResponse.certificatename) &&
            Objects.equals(this.server, deleteInstaneResponse.server) &&
            Objects.equals(this.proxy, deleteInstaneResponse.proxy) &&
            Objects.equals(this.timestamp, deleteInstaneResponse.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, hostname, policyid, accessCode, protectStatus, accessStatus, protocol, certificateid, certificatename, server, proxy, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInstaneResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    certificateid: ").append(toIndentedString(certificateid)).append("\n");
        sb.append("    certificatename: ").append(toIndentedString(certificatename)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

