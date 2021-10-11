package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** CfgRequestBody */
public class CfgRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chaincode_name")

    private String chaincodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_path")

    private String certPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_name")

    private String channelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_orgs")

    private Map<String, List<String>> peerOrgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "union_info")

    private Map<String, List<String>> unionInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_chan")

    private Boolean isMultiChan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_chaincode")

    private Map<String, List<String>> channelChaincode = null;

    public CfgRequestBody withChaincodeName(String chaincodeName) {
        this.chaincodeName = chaincodeName;
        return this;
    }

    /** 链代码名称，以小写字母开头，支持小写字母和数字，长度6-25位
     * 
     * @return chaincodeName */
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

    /** SDK配置文件存放路径
     * 
     * @return certPath */
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

    /** 通道名称
     * 
     * @return channelName */
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
        if (this.peerOrgs == null) {
            this.peerOrgs = new HashMap<>();
        }
        this.peerOrgs.put(key, peerOrgsItem);
        return this;
    }

    public CfgRequestBody withPeerOrgs(Consumer<Map<String, List<String>>> peerOrgsSetter) {
        if (this.peerOrgs == null) {
            this.peerOrgs = new HashMap<>();
        }
        peerOrgsSetter.accept(this.peerOrgs);
        return this;
    }

    /** key：组织名，value：该组织下需要下载的peer节点信息，peer节点请按照0,1,2的顺序升序填写
     * 
     * @return peerOrgs */
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
        if (this.unionInfo == null) {
            this.unionInfo = new HashMap<>();
        }
        unionInfoSetter.accept(this.unionInfo);
        return this;
    }

    /** key：联盟成员名称，value：该联盟成员peer组织名称hash值数组
     * 
     * @return unionInfo */
    public Map<String, List<String>> getUnionInfo() {
        return unionInfo;
    }

    public void setUnionInfo(Map<String, List<String>> unionInfo) {
        this.unionInfo = unionInfo;
    }

    public CfgRequestBody withIsMultiChan(Boolean isMultiChan) {
        this.isMultiChan = isMultiChan;
        return this;
    }

    /** 是否是多通道请求，如此处设成true则必须传入channel_chaincode，chaincode_name和channel_name设为空即可
     * 
     * @return isMultiChan */
    public Boolean getIsMultiChan() {
        return isMultiChan;
    }

    public void setIsMultiChan(Boolean isMultiChan) {
        this.isMultiChan = isMultiChan;
    }

    public CfgRequestBody withChannelChaincode(Map<String, List<String>> channelChaincode) {
        this.channelChaincode = channelChaincode;
        return this;
    }

    public CfgRequestBody putChannelChaincodeItem(String key, List<String> channelChaincodeItem) {
        if (this.channelChaincode == null) {
            this.channelChaincode = new HashMap<>();
        }
        this.channelChaincode.put(key, channelChaincodeItem);
        return this;
    }

    public CfgRequestBody withChannelChaincode(Consumer<Map<String, List<String>>> channelChaincodeSetter) {
        if (this.channelChaincode == null) {
            this.channelChaincode = new HashMap<>();
        }
        channelChaincodeSetter.accept(this.channelChaincode);
        return this;
    }

    /** key：通道名称，value：该通道对应的链代码数组
     * 
     * @return channelChaincode */
    public Map<String, List<String>> getChannelChaincode() {
        return channelChaincode;
    }

    public void setChannelChaincode(Map<String, List<String>> channelChaincode) {
        this.channelChaincode = channelChaincode;
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
        return Objects.equals(this.chaincodeName, cfgRequestBody.chaincodeName)
            && Objects.equals(this.certPath, cfgRequestBody.certPath)
            && Objects.equals(this.channelName, cfgRequestBody.channelName)
            && Objects.equals(this.peerOrgs, cfgRequestBody.peerOrgs)
            && Objects.equals(this.unionInfo, cfgRequestBody.unionInfo)
            && Objects.equals(this.isMultiChan, cfgRequestBody.isMultiChan)
            && Objects.equals(this.channelChaincode, cfgRequestBody.channelChaincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chaincodeName, certPath, channelName, peerOrgs, unionInfo, isMultiChan, channelChaincode);
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
        sb.append("    isMultiChan: ").append(toIndentedString(isMultiChan)).append("\n");
        sb.append("    channelChaincode: ").append(toIndentedString(channelChaincode)).append("\n");
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
