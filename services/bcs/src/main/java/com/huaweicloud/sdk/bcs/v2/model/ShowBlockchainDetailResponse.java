package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBlockchainDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    private BasicInfo basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channels")

    private List<ChannelInfo> channels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_info")

    private List<PeerInfo> peerInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "light_peer_info")

    private List<PeerInfo> lightPeerInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderer_info")

    private PeerInfo ordererInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "couch_db_info")

    private CouchDBInfo couchDbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dms_kafka_info")

    private DmsKafkaInfo dmsKafkaInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief_info")

    private IefInfo iefInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sfs_info")

    private SfsInfo sfsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_info")

    private PeerInfo agentInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restapi_info")

    private PeerInfo restapiInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evs_pvc_info")

    private Map<String, Map<String, String>> evsPvcInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tc3_taskserver_info")

    private PeerInfo tc3TaskserverInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_info")

    private OBSInfo obsBucketInfo;

    public ShowBlockchainDetailResponse withBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowBlockchainDetailResponse withBasicInfo(Consumer<BasicInfo> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new BasicInfo();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ShowBlockchainDetailResponse withChannels(List<ChannelInfo> channels) {
        this.channels = channels;
        return this;
    }

    public ShowBlockchainDetailResponse addChannelsItem(ChannelInfo channelsItem) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        this.channels.add(channelsItem);
        return this;
    }

    public ShowBlockchainDetailResponse withChannels(Consumer<List<ChannelInfo>> channelsSetter) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        channelsSetter.accept(this.channels);
        return this;
    }

    /**
     * 通道信息
     * @return channels
     */
    public List<ChannelInfo> getChannels() {
        return channels;
    }

    public void setChannels(List<ChannelInfo> channels) {
        this.channels = channels;
    }

    public ShowBlockchainDetailResponse withPeerInfo(List<PeerInfo> peerInfo) {
        this.peerInfo = peerInfo;
        return this;
    }

    public ShowBlockchainDetailResponse addPeerInfoItem(PeerInfo peerInfoItem) {
        if (this.peerInfo == null) {
            this.peerInfo = new ArrayList<>();
        }
        this.peerInfo.add(peerInfoItem);
        return this;
    }

    public ShowBlockchainDetailResponse withPeerInfo(Consumer<List<PeerInfo>> peerInfoSetter) {
        if (this.peerInfo == null) {
            this.peerInfo = new ArrayList<>();
        }
        peerInfoSetter.accept(this.peerInfo);
        return this;
    }

    /**
     * peer组织信息
     * @return peerInfo
     */
    public List<PeerInfo> getPeerInfo() {
        return peerInfo;
    }

    public void setPeerInfo(List<PeerInfo> peerInfo) {
        this.peerInfo = peerInfo;
    }

    public ShowBlockchainDetailResponse withLightPeerInfo(List<PeerInfo> lightPeerInfo) {
        this.lightPeerInfo = lightPeerInfo;
        return this;
    }

    public ShowBlockchainDetailResponse addLightPeerInfoItem(PeerInfo lightPeerInfoItem) {
        if (this.lightPeerInfo == null) {
            this.lightPeerInfo = new ArrayList<>();
        }
        this.lightPeerInfo.add(lightPeerInfoItem);
        return this;
    }

    public ShowBlockchainDetailResponse withLightPeerInfo(Consumer<List<PeerInfo>> lightPeerInfoSetter) {
        if (this.lightPeerInfo == null) {
            this.lightPeerInfo = new ArrayList<>();
        }
        lightPeerInfoSetter.accept(this.lightPeerInfo);
        return this;
    }

    /**
     * light_peer组织信息
     * @return lightPeerInfo
     */
    public List<PeerInfo> getLightPeerInfo() {
        return lightPeerInfo;
    }

    public void setLightPeerInfo(List<PeerInfo> lightPeerInfo) {
        this.lightPeerInfo = lightPeerInfo;
    }

    public ShowBlockchainDetailResponse withOrdererInfo(PeerInfo ordererInfo) {
        this.ordererInfo = ordererInfo;
        return this;
    }

    public ShowBlockchainDetailResponse withOrdererInfo(Consumer<PeerInfo> ordererInfoSetter) {
        if (this.ordererInfo == null) {
            this.ordererInfo = new PeerInfo();
            ordererInfoSetter.accept(this.ordererInfo);
        }

        return this;
    }

    /**
     * Get ordererInfo
     * @return ordererInfo
     */
    public PeerInfo getOrdererInfo() {
        return ordererInfo;
    }

    public void setOrdererInfo(PeerInfo ordererInfo) {
        this.ordererInfo = ordererInfo;
    }

    public ShowBlockchainDetailResponse withCouchDbInfo(CouchDBInfo couchDbInfo) {
        this.couchDbInfo = couchDbInfo;
        return this;
    }

    public ShowBlockchainDetailResponse withCouchDbInfo(Consumer<CouchDBInfo> couchDbInfoSetter) {
        if (this.couchDbInfo == null) {
            this.couchDbInfo = new CouchDBInfo();
            couchDbInfoSetter.accept(this.couchDbInfo);
        }

        return this;
    }

    /**
     * Get couchDbInfo
     * @return couchDbInfo
     */
    public CouchDBInfo getCouchDbInfo() {
        return couchDbInfo;
    }

    public void setCouchDbInfo(CouchDBInfo couchDbInfo) {
        this.couchDbInfo = couchDbInfo;
    }

    public ShowBlockchainDetailResponse withDmsKafkaInfo(DmsKafkaInfo dmsKafkaInfo) {
        this.dmsKafkaInfo = dmsKafkaInfo;
        return this;
    }

    public ShowBlockchainDetailResponse withDmsKafkaInfo(Consumer<DmsKafkaInfo> dmsKafkaInfoSetter) {
        if (this.dmsKafkaInfo == null) {
            this.dmsKafkaInfo = new DmsKafkaInfo();
            dmsKafkaInfoSetter.accept(this.dmsKafkaInfo);
        }

        return this;
    }

    /**
     * Get dmsKafkaInfo
     * @return dmsKafkaInfo
     */
    public DmsKafkaInfo getDmsKafkaInfo() {
        return dmsKafkaInfo;
    }

    public void setDmsKafkaInfo(DmsKafkaInfo dmsKafkaInfo) {
        this.dmsKafkaInfo = dmsKafkaInfo;
    }

    public ShowBlockchainDetailResponse withIefInfo(IefInfo iefInfo) {
        this.iefInfo = iefInfo;
        return this;
    }

    public ShowBlockchainDetailResponse withIefInfo(Consumer<IefInfo> iefInfoSetter) {
        if (this.iefInfo == null) {
            this.iefInfo = new IefInfo();
            iefInfoSetter.accept(this.iefInfo);
        }

        return this;
    }

    /**
     * Get iefInfo
     * @return iefInfo
     */
    public IefInfo getIefInfo() {
        return iefInfo;
    }

    public void setIefInfo(IefInfo iefInfo) {
        this.iefInfo = iefInfo;
    }

    public ShowBlockchainDetailResponse withSfsInfo(SfsInfo sfsInfo) {
        this.sfsInfo = sfsInfo;
        return this;
    }

    public ShowBlockchainDetailResponse withSfsInfo(Consumer<SfsInfo> sfsInfoSetter) {
        if (this.sfsInfo == null) {
            this.sfsInfo = new SfsInfo();
            sfsInfoSetter.accept(this.sfsInfo);
        }

        return this;
    }

    /**
     * Get sfsInfo
     * @return sfsInfo
     */
    public SfsInfo getSfsInfo() {
        return sfsInfo;
    }

    public void setSfsInfo(SfsInfo sfsInfo) {
        this.sfsInfo = sfsInfo;
    }

    public ShowBlockchainDetailResponse withAgentInfo(PeerInfo agentInfo) {
        this.agentInfo = agentInfo;
        return this;
    }

    public ShowBlockchainDetailResponse withAgentInfo(Consumer<PeerInfo> agentInfoSetter) {
        if (this.agentInfo == null) {
            this.agentInfo = new PeerInfo();
            agentInfoSetter.accept(this.agentInfo);
        }

        return this;
    }

    /**
     * Get agentInfo
     * @return agentInfo
     */
    public PeerInfo getAgentInfo() {
        return agentInfo;
    }

    public void setAgentInfo(PeerInfo agentInfo) {
        this.agentInfo = agentInfo;
    }

    public ShowBlockchainDetailResponse withRestapiInfo(PeerInfo restapiInfo) {
        this.restapiInfo = restapiInfo;
        return this;
    }

    public ShowBlockchainDetailResponse withRestapiInfo(Consumer<PeerInfo> restapiInfoSetter) {
        if (this.restapiInfo == null) {
            this.restapiInfo = new PeerInfo();
            restapiInfoSetter.accept(this.restapiInfo);
        }

        return this;
    }

    /**
     * Get restapiInfo
     * @return restapiInfo
     */
    public PeerInfo getRestapiInfo() {
        return restapiInfo;
    }

    public void setRestapiInfo(PeerInfo restapiInfo) {
        this.restapiInfo = restapiInfo;
    }

    public ShowBlockchainDetailResponse withEvsPvcInfo(Map<String, Map<String, String>> evsPvcInfo) {
        this.evsPvcInfo = evsPvcInfo;
        return this;
    }

    public ShowBlockchainDetailResponse putEvsPvcInfoItem(String key, Map<String, String> evsPvcInfoItem) {
        if (this.evsPvcInfo == null) {
            this.evsPvcInfo = new HashMap<>();
        }
        this.evsPvcInfo.put(key, evsPvcInfoItem);
        return this;
    }

    public ShowBlockchainDetailResponse withEvsPvcInfo(Consumer<Map<String, Map<String, String>>> evsPvcInfoSetter) {
        if (this.evsPvcInfo == null) {
            this.evsPvcInfo = new HashMap<>();
        }
        evsPvcInfoSetter.accept(this.evsPvcInfo);
        return this;
    }

    /**
     * 云硬盘存储卷信息
     * @return evsPvcInfo
     */
    public Map<String, Map<String, String>> getEvsPvcInfo() {
        return evsPvcInfo;
    }

    public void setEvsPvcInfo(Map<String, Map<String, String>> evsPvcInfo) {
        this.evsPvcInfo = evsPvcInfo;
    }

    public ShowBlockchainDetailResponse withTc3TaskserverInfo(PeerInfo tc3TaskserverInfo) {
        this.tc3TaskserverInfo = tc3TaskserverInfo;
        return this;
    }

    public ShowBlockchainDetailResponse withTc3TaskserverInfo(Consumer<PeerInfo> tc3TaskserverInfoSetter) {
        if (this.tc3TaskserverInfo == null) {
            this.tc3TaskserverInfo = new PeerInfo();
            tc3TaskserverInfoSetter.accept(this.tc3TaskserverInfo);
        }

        return this;
    }

    /**
     * Get tc3TaskserverInfo
     * @return tc3TaskserverInfo
     */
    public PeerInfo getTc3TaskserverInfo() {
        return tc3TaskserverInfo;
    }

    public void setTc3TaskserverInfo(PeerInfo tc3TaskserverInfo) {
        this.tc3TaskserverInfo = tc3TaskserverInfo;
    }

    public ShowBlockchainDetailResponse withObsBucketInfo(OBSInfo obsBucketInfo) {
        this.obsBucketInfo = obsBucketInfo;
        return this;
    }

    public ShowBlockchainDetailResponse withObsBucketInfo(Consumer<OBSInfo> obsBucketInfoSetter) {
        if (this.obsBucketInfo == null) {
            this.obsBucketInfo = new OBSInfo();
            obsBucketInfoSetter.accept(this.obsBucketInfo);
        }

        return this;
    }

    /**
     * Get obsBucketInfo
     * @return obsBucketInfo
     */
    public OBSInfo getObsBucketInfo() {
        return obsBucketInfo;
    }

    public void setObsBucketInfo(OBSInfo obsBucketInfo) {
        this.obsBucketInfo = obsBucketInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBlockchainDetailResponse showBlockchainDetailResponse = (ShowBlockchainDetailResponse) o;
        return Objects.equals(this.basicInfo, showBlockchainDetailResponse.basicInfo)
            && Objects.equals(this.channels, showBlockchainDetailResponse.channels)
            && Objects.equals(this.peerInfo, showBlockchainDetailResponse.peerInfo)
            && Objects.equals(this.lightPeerInfo, showBlockchainDetailResponse.lightPeerInfo)
            && Objects.equals(this.ordererInfo, showBlockchainDetailResponse.ordererInfo)
            && Objects.equals(this.couchDbInfo, showBlockchainDetailResponse.couchDbInfo)
            && Objects.equals(this.dmsKafkaInfo, showBlockchainDetailResponse.dmsKafkaInfo)
            && Objects.equals(this.iefInfo, showBlockchainDetailResponse.iefInfo)
            && Objects.equals(this.sfsInfo, showBlockchainDetailResponse.sfsInfo)
            && Objects.equals(this.agentInfo, showBlockchainDetailResponse.agentInfo)
            && Objects.equals(this.restapiInfo, showBlockchainDetailResponse.restapiInfo)
            && Objects.equals(this.evsPvcInfo, showBlockchainDetailResponse.evsPvcInfo)
            && Objects.equals(this.tc3TaskserverInfo, showBlockchainDetailResponse.tc3TaskserverInfo)
            && Objects.equals(this.obsBucketInfo, showBlockchainDetailResponse.obsBucketInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo,
            channels,
            peerInfo,
            lightPeerInfo,
            ordererInfo,
            couchDbInfo,
            dmsKafkaInfo,
            iefInfo,
            sfsInfo,
            agentInfo,
            restapiInfo,
            evsPvcInfo,
            tc3TaskserverInfo,
            obsBucketInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBlockchainDetailResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
        sb.append("    peerInfo: ").append(toIndentedString(peerInfo)).append("\n");
        sb.append("    lightPeerInfo: ").append(toIndentedString(lightPeerInfo)).append("\n");
        sb.append("    ordererInfo: ").append(toIndentedString(ordererInfo)).append("\n");
        sb.append("    couchDbInfo: ").append(toIndentedString(couchDbInfo)).append("\n");
        sb.append("    dmsKafkaInfo: ").append(toIndentedString(dmsKafkaInfo)).append("\n");
        sb.append("    iefInfo: ").append(toIndentedString(iefInfo)).append("\n");
        sb.append("    sfsInfo: ").append(toIndentedString(sfsInfo)).append("\n");
        sb.append("    agentInfo: ").append(toIndentedString(agentInfo)).append("\n");
        sb.append("    restapiInfo: ").append(toIndentedString(restapiInfo)).append("\n");
        sb.append("    evsPvcInfo: ").append(toIndentedString(evsPvcInfo)).append("\n");
        sb.append("    tc3TaskserverInfo: ").append(toIndentedString(tc3TaskserverInfo)).append("\n");
        sb.append("    obsBucketInfo: ").append(toIndentedString(obsBucketInfo)).append("\n");
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
