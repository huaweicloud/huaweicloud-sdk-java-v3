package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主网卡的描述信息。 
 */
public class NicSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetId")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixedIps")

    private List<String> fixedIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipBlock")

    private String ipBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetList")

    private List<String> subnetList = null;

    public NicSpec withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 网卡所在子网的网络ID。主网卡创建时若未指定subnetId,将使用集群子网。若节点池同时配置了subnetList，则节点池扩容子网以subnetList字段为准。扩展网卡创建时必须指定subnetId。  
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public NicSpec withFixedIps(List<String> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    public NicSpec addFixedIpsItem(String fixedIpsItem) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public NicSpec withFixedIps(Consumer<List<String>> fixedIpsSetter) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        fixedIpsSetter.accept(this.fixedIps);
        return this;
    }

    /**
     * 主网卡的IP将通过fixedIps指定，数量不得大于创建的节点数。fixedIps或ipBlock同时只能指定一个。扩展网卡不支持指定fiexdIps。
     * @return fixedIps
     */
    public List<String> getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(List<String> fixedIps) {
        this.fixedIps = fixedIps;
    }

    public NicSpec withIpBlock(String ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }

    /**
     * 主网卡的IP段的CIDR格式，创建的节点IP将属于该IP段内。fixedIps或ipBlock同时只能指定一个。
     * @return ipBlock
     */
    public String getIpBlock() {
        return ipBlock;
    }

    public void setIpBlock(String ipBlock) {
        this.ipBlock = ipBlock;
    }

    public NicSpec withSubnetList(List<String> subnetList) {
        this.subnetList = subnetList;
        return this;
    }

    public NicSpec addSubnetListItem(String subnetListItem) {
        if (this.subnetList == null) {
            this.subnetList = new ArrayList<>();
        }
        this.subnetList.add(subnetListItem);
        return this;
    }

    public NicSpec withSubnetList(Consumer<List<String>> subnetListSetter) {
        if (this.subnetList == null) {
            this.subnetList = new ArrayList<>();
        }
        subnetListSetter.accept(this.subnetList);
        return this;
    }

    /**
     * 网卡所在子网的网络ID列表，支持节点池配置多个子网，最多支持配置20个子网。
     * @return subnetList
     */
    public List<String> getSubnetList() {
        return subnetList;
    }

    public void setSubnetList(List<String> subnetList) {
        this.subnetList = subnetList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NicSpec that = (NicSpec) obj;
        return Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.fixedIps, that.fixedIps)
            && Objects.equals(this.ipBlock, that.ipBlock) && Objects.equals(this.subnetList, that.subnetList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, fixedIps, ipBlock, subnetList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NicSpec {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
        sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
        sb.append("    subnetList: ").append(toIndentedString(subnetList)).append("\n");
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
