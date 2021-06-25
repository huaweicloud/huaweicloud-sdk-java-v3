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
 * 创建独享模式域名的请求
 */
public class CreatePremiumHostRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostname")
    
    private String hostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy")
    
    private Boolean proxy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policyid")
    
    private String policyid;


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
    @JsonProperty(value="mode")
    
    private String mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pool_ids")
    
    private List<String> poolIds = null;
    
    public CreatePremiumHostRequestBody withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    


    /**
     * 防护域名或IP（可带端口）
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    

    public CreatePremiumHostRequestBody withProxy(Boolean proxy) {
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

    

    public CreatePremiumHostRequestBody withPolicyid(String policyid) {
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

    

    public CreatePremiumHostRequestBody withCertificateid(String certificateid) {
        this.certificateid = certificateid;
        return this;
    }

    


    /**
     * 证书ID
     * @return certificateid
     */
    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }

    

    public CreatePremiumHostRequestBody withCertificatename(String certificatename) {
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

    

    public CreatePremiumHostRequestBody withServer(List<PremiumWafServer> server) {
        this.server = server;
        return this;
    }

    
    public CreatePremiumHostRequestBody addServerItem(PremiumWafServer serverItem) {
        if(this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public CreatePremiumHostRequestBody withServer(Consumer<List<PremiumWafServer>> serverSetter) {
        if(this.server == null) {
            this.server = new ArrayList<>();
        }
        serverSetter.accept(this.server);
        return this;
    }

    /**
     * 独享模式回源服务器配置
     * @return server
     */
    public List<PremiumWafServer> getServer() {
        return server;
    }

    public void setServer(List<PremiumWafServer> server) {
        this.server = server;
    }

    

    public CreatePremiumHostRequestBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 独享模式特殊域名模式（仅特殊模式需要，如elb）
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    

    public CreatePremiumHostRequestBody withPoolIds(List<String> poolIds) {
        this.poolIds = poolIds;
        return this;
    }

    
    public CreatePremiumHostRequestBody addPoolIdsItem(String poolIdsItem) {
        if(this.poolIds == null) {
            this.poolIds = new ArrayList<>();
        }
        this.poolIds.add(poolIdsItem);
        return this;
    }

    public CreatePremiumHostRequestBody withPoolIds(Consumer<List<String>> poolIdsSetter) {
        if(this.poolIds == null) {
            this.poolIds = new ArrayList<>();
        }
        poolIdsSetter.accept(this.poolIds);
        return this;
    }

    /**
     * 域名关联的组ID（仅特殊模式需要，如elb）
     * @return poolIds
     */
    public List<String> getPoolIds() {
        return poolIds;
    }

    public void setPoolIds(List<String> poolIds) {
        this.poolIds = poolIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePremiumHostRequestBody createPremiumHostRequestBody = (CreatePremiumHostRequestBody) o;
        return Objects.equals(this.hostname, createPremiumHostRequestBody.hostname) &&
            Objects.equals(this.proxy, createPremiumHostRequestBody.proxy) &&
            Objects.equals(this.policyid, createPremiumHostRequestBody.policyid) &&
            Objects.equals(this.certificateid, createPremiumHostRequestBody.certificateid) &&
            Objects.equals(this.certificatename, createPremiumHostRequestBody.certificatename) &&
            Objects.equals(this.server, createPremiumHostRequestBody.server) &&
            Objects.equals(this.mode, createPremiumHostRequestBody.mode) &&
            Objects.equals(this.poolIds, createPremiumHostRequestBody.poolIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(hostname, proxy, policyid, certificateid, certificatename, server, mode, poolIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePremiumHostRequestBody {\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    certificateid: ").append(toIndentedString(certificateid)).append("\n");
        sb.append("    certificatename: ").append(toIndentedString(certificatename)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    poolIds: ").append(toIndentedString(poolIds)).append("\n");
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

