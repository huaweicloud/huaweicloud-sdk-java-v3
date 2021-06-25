package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.BlockPage;
import com.huaweicloud.sdk.waf.v1.model.PremiumWafServer;
import com.huaweicloud.sdk.waf.v1.model.TrafficMark;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改独享模式域名的请求
 */
public class UpdatePremiumHostRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policyid")
    
    private String policyid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostname")
    
    private String hostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domainid")
    
    private String domainid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_code")
    
    private String accessCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy")
    
    private Boolean proxy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificateid")
    
    private String certificateid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificatename")
    
    private String certificatename;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="locked")
    
    private Integer locked;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protect_status")
    
    private Integer protectStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_status")
    
    private Integer accessStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private Long timestamp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server")
    
    private List<PremiumWafServer> server = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private String mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tls")
    
    private String tls;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cipher")
    
    private String cipher;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pool_ids")
    
    private List<String> poolIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="block_page")
    
    private BlockPage blockPage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="traffic_mark")
    
    private TrafficMark trafficMark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flag")
    
    private Map<String, String> flag = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extend")
    
    private Map<String, String> extend = null;
    
    public UpdatePremiumHostRequestBody withId(String id) {
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

    

    public UpdatePremiumHostRequestBody withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    


    /**
     * 防护策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    

    public UpdatePremiumHostRequestBody withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    


    /**
     * 防护域名
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    

    public UpdatePremiumHostRequestBody withDomainid(String domainid) {
        this.domainid = domainid;
        return this;
    }

    


    /**
     * 用户的domainid
     * @return domainid
     */
    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid;
    }

    

    public UpdatePremiumHostRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 用户的project_id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public UpdatePremiumHostRequestBody withAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }

    


    /**
     * 用户的access_code
     * @return accessCode
     */
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    

    public UpdatePremiumHostRequestBody withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * http协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    public UpdatePremiumHostRequestBody withProxy(Boolean proxy) {
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

    

    public UpdatePremiumHostRequestBody withCertificateid(String certificateid) {
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

    

    public UpdatePremiumHostRequestBody withCertificatename(String certificatename) {
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

    

    public UpdatePremiumHostRequestBody withLocked(Integer locked) {
        this.locked = locked;
        return this;
    }

    


    /**
     * 是否锁定
     * @return locked
     */
    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    

    public UpdatePremiumHostRequestBody withProtectStatus(Integer protectStatus) {
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

    

    public UpdatePremiumHostRequestBody withAccessStatus(Integer accessStatus) {
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

    

    public UpdatePremiumHostRequestBody withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    

    public UpdatePremiumHostRequestBody withServer(List<PremiumWafServer> server) {
        this.server = server;
        return this;
    }

    
    public UpdatePremiumHostRequestBody addServerItem(PremiumWafServer serverItem) {
        if(this.server == null) {
            this.server = new ArrayList<>();
        }
        this.server.add(serverItem);
        return this;
    }

    public UpdatePremiumHostRequestBody withServer(Consumer<List<PremiumWafServer>> serverSetter) {
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

    

    public UpdatePremiumHostRequestBody withMode(String mode) {
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

    

    public UpdatePremiumHostRequestBody withTls(String tls) {
        this.tls = tls;
        return this;
    }

    


    /**
     * 支持最低的TLS版本
     * @return tls
     */
    public String getTls() {
        return tls;
    }

    public void setTls(String tls) {
        this.tls = tls;
    }

    

    public UpdatePremiumHostRequestBody withCipher(String cipher) {
        this.cipher = cipher;
        return this;
    }

    


    /**
     * 加密套件代码
     * @return cipher
     */
    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    

    public UpdatePremiumHostRequestBody withPoolIds(List<String> poolIds) {
        this.poolIds = poolIds;
        return this;
    }

    
    public UpdatePremiumHostRequestBody addPoolIdsItem(String poolIdsItem) {
        if(this.poolIds == null) {
            this.poolIds = new ArrayList<>();
        }
        this.poolIds.add(poolIdsItem);
        return this;
    }

    public UpdatePremiumHostRequestBody withPoolIds(Consumer<List<String>> poolIdsSetter) {
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

    

    public UpdatePremiumHostRequestBody withBlockPage(BlockPage blockPage) {
        this.blockPage = blockPage;
        return this;
    }

    public UpdatePremiumHostRequestBody withBlockPage(Consumer<BlockPage> blockPageSetter) {
        if(this.blockPage == null ){
            this.blockPage = new BlockPage();
            blockPageSetter.accept(this.blockPage);
        }
        
        return this;
    }


    /**
     * Get blockPage
     * @return blockPage
     */
    public BlockPage getBlockPage() {
        return blockPage;
    }

    public void setBlockPage(BlockPage blockPage) {
        this.blockPage = blockPage;
    }

    

    public UpdatePremiumHostRequestBody withTrafficMark(TrafficMark trafficMark) {
        this.trafficMark = trafficMark;
        return this;
    }

    public UpdatePremiumHostRequestBody withTrafficMark(Consumer<TrafficMark> trafficMarkSetter) {
        if(this.trafficMark == null ){
            this.trafficMark = new TrafficMark();
            trafficMarkSetter.accept(this.trafficMark);
        }
        
        return this;
    }


    /**
     * Get trafficMark
     * @return trafficMark
     */
    public TrafficMark getTrafficMark() {
        return trafficMark;
    }

    public void setTrafficMark(TrafficMark trafficMark) {
        this.trafficMark = trafficMark;
    }

    

    public UpdatePremiumHostRequestBody withFlag(Map<String, String> flag) {
        this.flag = flag;
        return this;
    }

    

    public UpdatePremiumHostRequestBody putFlagItem(String key, String flagItem) {
        if(this.flag == null) {
            this.flag = new HashMap<>();
        }
        this.flag.put(key, flagItem);
        return this;
    }

    public UpdatePremiumHostRequestBody withFlag(Consumer<Map<String, String>> flagSetter) {
        if(this.flag == null) {
            this.flag = new HashMap<>();
        }
        flagSetter.accept(this.flag);
        return this;
    }
    /**
     * 域名特殊标识
     * @return flag
     */
    public Map<String, String> getFlag() {
        return flag;
    }

    public void setFlag(Map<String, String> flag) {
        this.flag = flag;
    }

    

    public UpdatePremiumHostRequestBody withExtend(Map<String, String> extend) {
        this.extend = extend;
        return this;
    }

    

    public UpdatePremiumHostRequestBody putExtendItem(String key, String extendItem) {
        if(this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public UpdatePremiumHostRequestBody withExtend(Consumer<Map<String, String>> extendSetter) {
        if(this.extend == null) {
            this.extend = new HashMap<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }
    /**
     * 可扩展字段
     * @return extend
     */
    public Map<String, String> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, String> extend) {
        this.extend = extend;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePremiumHostRequestBody updatePremiumHostRequestBody = (UpdatePremiumHostRequestBody) o;
        return Objects.equals(this.id, updatePremiumHostRequestBody.id) &&
            Objects.equals(this.policyid, updatePremiumHostRequestBody.policyid) &&
            Objects.equals(this.hostname, updatePremiumHostRequestBody.hostname) &&
            Objects.equals(this.domainid, updatePremiumHostRequestBody.domainid) &&
            Objects.equals(this.projectId, updatePremiumHostRequestBody.projectId) &&
            Objects.equals(this.accessCode, updatePremiumHostRequestBody.accessCode) &&
            Objects.equals(this.protocol, updatePremiumHostRequestBody.protocol) &&
            Objects.equals(this.proxy, updatePremiumHostRequestBody.proxy) &&
            Objects.equals(this.certificateid, updatePremiumHostRequestBody.certificateid) &&
            Objects.equals(this.certificatename, updatePremiumHostRequestBody.certificatename) &&
            Objects.equals(this.locked, updatePremiumHostRequestBody.locked) &&
            Objects.equals(this.protectStatus, updatePremiumHostRequestBody.protectStatus) &&
            Objects.equals(this.accessStatus, updatePremiumHostRequestBody.accessStatus) &&
            Objects.equals(this.timestamp, updatePremiumHostRequestBody.timestamp) &&
            Objects.equals(this.server, updatePremiumHostRequestBody.server) &&
            Objects.equals(this.mode, updatePremiumHostRequestBody.mode) &&
            Objects.equals(this.tls, updatePremiumHostRequestBody.tls) &&
            Objects.equals(this.cipher, updatePremiumHostRequestBody.cipher) &&
            Objects.equals(this.poolIds, updatePremiumHostRequestBody.poolIds) &&
            Objects.equals(this.blockPage, updatePremiumHostRequestBody.blockPage) &&
            Objects.equals(this.trafficMark, updatePremiumHostRequestBody.trafficMark) &&
            Objects.equals(this.flag, updatePremiumHostRequestBody.flag) &&
            Objects.equals(this.extend, updatePremiumHostRequestBody.extend);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, policyid, hostname, domainid, projectId, accessCode, protocol, proxy, certificateid, certificatename, locked, protectStatus, accessStatus, timestamp, server, mode, tls, cipher, poolIds, blockPage, trafficMark, flag, extend);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePremiumHostRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    domainid: ").append(toIndentedString(domainid)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    certificateid: ").append(toIndentedString(certificateid)).append("\n");
        sb.append("    certificatename: ").append(toIndentedString(certificatename)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
        sb.append("    poolIds: ").append(toIndentedString(poolIds)).append("\n");
        sb.append("    blockPage: ").append(toIndentedString(blockPage)).append("\n");
        sb.append("    trafficMark: ").append(toIndentedString(trafficMark)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
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

