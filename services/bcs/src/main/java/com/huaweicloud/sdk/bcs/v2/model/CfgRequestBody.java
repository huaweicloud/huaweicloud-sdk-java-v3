package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CfgRequestBody
 */
public class CfgRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chaincode_name")
    
    private String chaincodeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cert_path")
    
    private String certPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channel_name")
    
    private String channelName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="peer_orgs")
    
    private Map<String, List<String>> peerOrgs = new HashMap<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="union_info")
    
    private Map<String, List<String>> unionInfo = null;
    
    public CfgRequestBody withChaincodeName(String chaincodeName) {
        this.chaincodeName = chaincodeName;
        return this;
    }

    


    /**
     * 链代码名称
     * @return chaincodeName
     */
    public String getChaincodeName() {
        return chaincodeName;
    }

    public void setChaincodeName(String chaincodeName) {
        this.chaincodeName = chaincodeName;
    }

    public CfgRequestBody withCertPath(String certPath) {
        this.certPath = certPath;
        return this;
    }

    


    /**
     * SDK配置文件存放路径
     * @return certPath
     */
    public String getCertPath() {
        return certPath;
    }

    public void setCertPath(String certPath) {
        this.certPath = certPath;
    }

    public CfgRequestBody withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    


    /**
     * 通道名称
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public CfgRequestBody withPeerOrgs(Map<String, List<String>> peerOrgs) {
        this.peerOrgs = peerOrgs;
        return this;
    }

    

    public CfgRequestBody putPeerOrgsItem(String key, List<String> peerOrgsItem) {
        this.peerOrgs.put(key, peerOrgsItem);
        return this;
    }

    public CfgRequestBody withPeerOrgs(Consumer<Map<String, List<String>>> peerOrgsSetter) {
        if(this.peerOrgs == null ){
            this.peerOrgs = new HashMap<>();
        }
        peerOrgsSetter.accept(this.peerOrgs);
        return this;
    }
    /**
     * key：组织名，value：该组织下需要下载的peer节点信息
     * @return peerOrgs
     */
    public Map<String, List<String>> getPeerOrgs() {
        return peerOrgs;
    }

    public void setPeerOrgs(Map<String, List<String>> peerOrgs) {
        this.peerOrgs = peerOrgs;
    }

    public CfgRequestBody withUnionInfo(Map<String, List<String>> unionInfo) {
        this.unionInfo = unionInfo;
        return this;
    }

    

    public CfgRequestBody putUnionInfoItem(String key, List<String> unionInfoItem) {
         if (this.unionInfo == null) {
            this.unionInfo = new HashMap<>();
         }
        this.unionInfo.put(key, unionInfoItem);
        return this;
    }

    public CfgRequestBody withUnionInfo(Consumer<Map<String, List<String>>> unionInfoSetter) {
        if(this.unionInfo == null ){
            this.unionInfo = new HashMap<>();
        }
        unionInfoSetter.accept(this.unionInfo);
        return this;
    }
    /**
     * key：联盟成员名称，value：该联盟成员peer组织名称hash值数组
     * @return unionInfo
     */
    public Map<String, List<String>> getUnionInfo() {
        return unionInfo;
    }

    public void setUnionInfo(Map<String, List<String>> unionInfo) {
        this.unionInfo = unionInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CfgRequestBody cfgRequestBody = (CfgRequestBody) o;
        return Objects.equals(this.chaincodeName, cfgRequestBody.chaincodeName) &&
            Objects.equals(this.certPath, cfgRequestBody.certPath) &&
            Objects.equals(this.channelName, cfgRequestBody.channelName) &&
            Objects.equals(this.peerOrgs, cfgRequestBody.peerOrgs) &&
            Objects.equals(this.unionInfo, cfgRequestBody.unionInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chaincodeName, certPath, channelName, peerOrgs, unionInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CfgRequestBody {\n");
        sb.append("    chaincodeName: ").append(toIndentedString(chaincodeName)).append("\n");
        sb.append("    certPath: ").append(toIndentedString(certPath)).append("\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    peerOrgs: ").append(toIndentedString(peerOrgs)).append("\n");
        sb.append("    unionInfo: ").append(toIndentedString(unionInfo)).append("\n");
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

