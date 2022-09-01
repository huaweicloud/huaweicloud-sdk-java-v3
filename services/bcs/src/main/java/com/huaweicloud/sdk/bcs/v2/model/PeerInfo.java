package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PeerInfo
 */
public class PeerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_cnt")

    @JacksonXmlProperty(localName = "node_cnt")

    private Long nodeCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_detail")

    @JacksonXmlProperty(localName = "status_detail")

    private String statusDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pvc_name")

    @JacksonXmlProperty(localName = "pvc_name")

    private String pvcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    @JacksonXmlProperty(localName = "address")

    private List<PeerAddress> address = null;

    public PeerInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组织名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PeerInfo withNodeCnt(Long nodeCnt) {
        this.nodeCnt = nodeCnt;
        return this;
    }

    /**
     * 节点数量
     * @return nodeCnt
     */
    public Long getNodeCnt() {
        return nodeCnt;
    }

    public void setNodeCnt(Long nodeCnt) {
        this.nodeCnt = nodeCnt;
    }

    public PeerInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 节点状态，分为创建中（IsCreating），升级中（IsUpgrading），扩缩容中（Adding/IsScaling），删除中（Isdeleting），正常（Normal），异常（AbNormal），未知（其余值）
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PeerInfo withStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    /**
     * 节点状态，形式如：1/1，分母是该组织下节点总数，分子是正常节点个数
     * @return statusDetail
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public PeerInfo withPvcName(String pvcName) {
        this.pvcName = pvcName;
        return this;
    }

    /**
     * 节点对应pvc名称
     * @return pvcName
     */
    public String getPvcName() {
        return pvcName;
    }

    public void setPvcName(String pvcName) {
        this.pvcName = pvcName;
    }

    public PeerInfo withAddress(List<PeerAddress> address) {
        this.address = address;
        return this;
    }

    public PeerInfo addAddressItem(PeerAddress addressItem) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        this.address.add(addressItem);
        return this;
    }

    public PeerInfo withAddress(Consumer<List<PeerAddress>> addressSetter) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        addressSetter.accept(this.address);
        return this;
    }

    /**
     * Peer节点域名/IP地址
     * @return address
     */
    public List<PeerAddress> getAddress() {
        return address;
    }

    public void setAddress(List<PeerAddress> address) {
        this.address = address;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PeerInfo peerInfo = (PeerInfo) o;
        return Objects.equals(this.name, peerInfo.name) && Objects.equals(this.nodeCnt, peerInfo.nodeCnt)
            && Objects.equals(this.status, peerInfo.status) && Objects.equals(this.statusDetail, peerInfo.statusDetail)
            && Objects.equals(this.pvcName, peerInfo.pvcName) && Objects.equals(this.address, peerInfo.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nodeCnt, status, statusDetail, pvcName, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeerInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeCnt: ").append(toIndentedString(nodeCnt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
        sb.append("    pvcName: ").append(toIndentedString(pvcName)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
