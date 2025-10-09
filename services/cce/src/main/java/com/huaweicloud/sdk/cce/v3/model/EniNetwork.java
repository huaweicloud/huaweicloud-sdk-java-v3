package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ENI网络配置，创建集群指定使用云原生网络2.0网络模式时必填subnets和eniSubnetId其中一个字段(eniSubnetCIDR可选，若填写了会校验是否合法)，1.19.10及新版本集群使用subnets字段，1.19.8及老版本若使用subnets字段，则取值subnets数组中的第一个子网ID作为容器地址使用的子网ID。 
 */
public class EniNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eniSubnetId")

    private String eniSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eniSubnetCIDR")

    private String eniSubnetCIDR;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    private List<NetworkSubnet> subnets = null;

    public EniNetwork withEniSubnetId(String eniSubnetId) {
        this.eniSubnetId = eniSubnetId;
        return this;
    }

    /**
     * **参数解释：** ENI所在子网的IPv4子网ID。 **约束限制：** 暂不支持IPv6。该字段将会被废弃，推荐使用新字段subnets。 **取值范围：** 不涉及 **默认取值：** 不涉及  获取方法如下：  - 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找IPv4子网ID。 - 方法2：通过虚拟私有云服务的查询子网列表接口查询。   [链接请参见[查询子网列表](https://support.huaweicloud.com/api-vpc/vpc_subnet01_0003.html)。](tag:hws)   [链接请参见[查询子网列表](https://support.huaweicloud.com/intl/zh-cn/api-vpc/vpc_subnet01_0003.html)。](tag:hws_hk) 
     * @return eniSubnetId
     */
    public String getEniSubnetId() {
        return eniSubnetId;
    }

    public void setEniSubnetId(String eniSubnetId) {
        this.eniSubnetId = eniSubnetId;
    }

    public EniNetwork withEniSubnetCIDR(String eniSubnetCIDR) {
        this.eniSubnetCIDR = eniSubnetCIDR;
        return this;
    }

    /**
     * ENI子网CIDR(废弃中)
     * @return eniSubnetCIDR
     */
    public String getEniSubnetCIDR() {
        return eniSubnetCIDR;
    }

    public void setEniSubnetCIDR(String eniSubnetCIDR) {
        this.eniSubnetCIDR = eniSubnetCIDR;
    }

    public EniNetwork withSubnets(List<NetworkSubnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    public EniNetwork addSubnetsItem(NetworkSubnet subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    public EniNetwork withSubnets(Consumer<List<NetworkSubnet>> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        subnetsSetter.accept(this.subnets);
        return this;
    }

    /**
     * IPv4子网ID列表
     * @return subnets
     */
    public List<NetworkSubnet> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<NetworkSubnet> subnets) {
        this.subnets = subnets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EniNetwork that = (EniNetwork) obj;
        return Objects.equals(this.eniSubnetId, that.eniSubnetId)
            && Objects.equals(this.eniSubnetCIDR, that.eniSubnetCIDR) && Objects.equals(this.subnets, that.subnets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eniSubnetId, eniSubnetCIDR, subnets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EniNetwork {\n");
        sb.append("    eniSubnetId: ").append(toIndentedString(eniSubnetId)).append("\n");
        sb.append("    eniSubnetCIDR: ").append(toIndentedString(eniSubnetCIDR)).append("\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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
