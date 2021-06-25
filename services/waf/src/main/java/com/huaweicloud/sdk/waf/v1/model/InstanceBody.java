package com.huaweicloud.sdk.waf.v1.model;





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
 * InstanceBody
 */
public class InstanceBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostname")
    
    private String hostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policyid")
    
    private String policyid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server")
    
    private List<PremiumWafServer> server = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificateid")
    
    private String certificateid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificatename")
    
    private String certificatename;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy")
    
    private Boolean proxy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paid_type")
    
    private Object paidType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private Object description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exclusive_ip")
    
    private Object exclusiveIp;

    public InstanceBody withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    


    /**
     * 域名信息
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    

    public InstanceBody withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    


    /**
     * 防护域名初始绑定的策略ID
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    

    public InstanceBody withServer(List<PremiumWafServer> server) {
        this.server = server;
        return this;
    }

    
    public InstanceBody addServerItem(PremiumWafServer serverItem) {
        if(this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public InstanceBody withServer(Consumer<List<PremiumWafServer>> serverSetter) {
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

    

    public InstanceBody withCertificateid(String certificateid) {
        this.certificateid = certificateid;
        return this;
    }

    


    /**
     * 证书id
     * @return certificateid
     */
    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }

    

    public InstanceBody withCertificatename(String certificatename) {
        this.certificatename = certificatename;
        return this;
    }

    


    /**
     * 证书名
     * @return certificatename
     */
    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename;
    }

    

    public InstanceBody withProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    


    /**
     * 是否使用代理
     * @return proxy
     */
    public Boolean getProxy() {
        return proxy;
    }

    public void setProxy(Boolean proxy) {
        this.proxy = proxy;
    }

    

    public InstanceBody withPaidType(Object paidType) {
        this.paidType = paidType;
        return this;
    }

    


    /**
     * 模式
     * @return paidType
     */
    public Object getPaidType() {
        return paidType;
    }

    public void setPaidType(Object paidType) {
        this.paidType = paidType;
    }

    

    public InstanceBody withDescription(Object description) {
        this.description = description;
        return this;
    }

    


    /**
     * 域名描述
     * @return description
     */
    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    

    public InstanceBody withExclusiveIp(Object exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
        return this;
    }

    


    /**
     * 使用独享IP
     * @return exclusiveIp
     */
    public Object getExclusiveIp() {
        return exclusiveIp;
    }

    public void setExclusiveIp(Object exclusiveIp) {
        this.exclusiveIp = exclusiveIp;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceBody instanceBody = (InstanceBody) o;
        return Objects.equals(this.hostname, instanceBody.hostname) &&
            Objects.equals(this.policyid, instanceBody.policyid) &&
            Objects.equals(this.server, instanceBody.server) &&
            Objects.equals(this.certificateid, instanceBody.certificateid) &&
            Objects.equals(this.certificatename, instanceBody.certificatename) &&
            Objects.equals(this.proxy, instanceBody.proxy) &&
            Objects.equals(this.paidType, instanceBody.paidType) &&
            Objects.equals(this.description, instanceBody.description) &&
            Objects.equals(this.exclusiveIp, instanceBody.exclusiveIp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(hostname, policyid, server, certificateid, certificatename, proxy, paidType, description, exclusiveIp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceBody {\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    certificateid: ").append(toIndentedString(certificateid)).append("\n");
        sb.append("    certificatename: ").append(toIndentedString(certificatename)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    paidType: ").append(toIndentedString(paidType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    exclusiveIp: ").append(toIndentedString(exclusiveIp)).append("\n");
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

