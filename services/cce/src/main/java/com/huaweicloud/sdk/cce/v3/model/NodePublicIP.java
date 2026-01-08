package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NodePublicIP {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private NodeEIPSpec eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iptype")

    private String iptype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private NodeBandwidth bandwidth;

    public NodePublicIP withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public NodePublicIP addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public NodePublicIP withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * **参数解释**： 已有的弹性IP的ID列表。数量不得大于待创建节点数 > 若已配置ids参数，则无需配置count和eip参数 **约束限制**： 该参数仅给节点使用
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public NodePublicIP withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 要动态创建的弹性IP个数。 > count参数与eip参数必须同时配置。 **约束限制**： 该参数仅给节点使用
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public NodePublicIP withEip(NodeEIPSpec eip) {
        this.eip = eip;
        return this;
    }

    public NodePublicIP withEip(Consumer<NodeEIPSpec> eipSetter) {
        if (this.eip == null) {
            this.eip = new NodeEIPSpec();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public NodeEIPSpec getEip() {
        return eip;
    }

    public void setEip(NodeEIPSpec eip) {
        this.eip = eip;
    }

    public NodePublicIP withIptype(String iptype) {
        this.iptype = iptype;
        return this;
    }

    /**
     * **参数解释**： 表示节点所属分区。分区可以选择中心云[或者[边缘小站](https://support.huaweicloud.com/usermanual-cloudpond/ies_02_0401.html)。](tag:hws)[或者[边缘小站](https://support.huaweicloud.com/intl/zh-cn/usermanual-cloudpond/ies_02_0401.html)。](tag:hws_hk) 仅开启了对分布式云支持的Turbo集群支持指定该字段。 弹性IP类型，取值请参见申请EIP接口中publicip.type说明。 [链接请参见[申请EIP](https://support.huaweicloud.com/api-eip/eip_api_0001.html)](tag:hws) [链接请参见[申请EIP](https://support.huaweicloud.com/intl/zh-cn/api-eip/eip_api_0001.html)](tag:hws_hk) **约束限制**： 该参数仅给节点池使用 
     * @return iptype
     */
    public String getIptype() {
        return iptype;
    }

    public void setIptype(String iptype) {
        this.iptype = iptype;
    }

    public NodePublicIP withBandwidth(NodeBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public NodePublicIP withBandwidth(Consumer<NodeBandwidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new NodeBandwidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public NodeBandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(NodeBandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodePublicIP that = (NodePublicIP) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.count, that.count)
            && Objects.equals(this.eip, that.eip) && Objects.equals(this.iptype, that.iptype)
            && Objects.equals(this.bandwidth, that.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, count, eip, iptype, bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePublicIP {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    iptype: ").append(toIndentedString(iptype)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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
