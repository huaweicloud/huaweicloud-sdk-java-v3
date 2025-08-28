package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：负载均衡器复制新实例参数对象。  **约束限制**：不涉及
 */
public class TargetLoadbalancerParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_list")

    private List<String> availabilityZoneList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_subnet_cidr_id")

    private String vipSubnetCidrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_address")

    private String vipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_virsubnet_id")

    private String ipv6VipVirsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_address")

    private String ipv6VipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_virsubnet_ids")

    private List<String> elbVirsubnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l4_flavor_id")

    private String l4FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7_flavor_id")

    private String l7FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reuse_pool")

    private Boolean reusePool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guaranteed")

    private Boolean guaranteed;

    public TargetLoadbalancerParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：新实例名称。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不传时使用源ELB名称加\"-copy-{x}\"的后缀作为新实例名称。{x}代表数字序号。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TargetLoadbalancerParam withAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
        return this;
    }

    public TargetLoadbalancerParam addAvailabilityZoneListItem(String availabilityZoneListItem) {
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        this.availabilityZoneList.add(availabilityZoneListItem);
        return this;
    }

    public TargetLoadbalancerParam withAvailabilityZoneList(Consumer<List<String>> availabilityZoneListSetter) {
        if (this.availabilityZoneList == null) {
            this.availabilityZoneList = new ArrayList<>();
        }
        availabilityZoneListSetter.accept(this.availabilityZoneList);
        return this;
    }

    /**
     * **参数解释**：新实例所属可用区。  **约束限制**：仅支持源ELB独享型复制场景设置该字段。  **取值范围**：不涉及  **默认取值**：不传时使用源ELB的availability_zone_list。
     * @return availabilityZoneList
     */
    public List<String> getAvailabilityZoneList() {
        return availabilityZoneList;
    }

    public void setAvailabilityZoneList(List<String> availabilityZoneList) {
        this.availabilityZoneList = availabilityZoneList;
    }

    public TargetLoadbalancerParam withVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
        return this;
    }

    /**
     * **参数解释**：新实例所属子网的ipv4子网ID。  **约束限制**：所选子网必须与源ELB在同一个vpc内。  **取值范围**：不涉及  **默认取值**：不传时使用源ELB的vip_subnet_cidr_id。
     * @return vipSubnetCidrId
     */
    public String getVipSubnetCidrId() {
        return vipSubnetCidrId;
    }

    public void setVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
    }

    public TargetLoadbalancerParam withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    /**
     * **参数解释**：新实例的ipv4私网地址。  **约束限制**：仅支持源ELB独享型复制场景、源ELB共享型复制为独享型场景支持设置该字段。  **取值范围**：不涉及  **默认取值**：不传时随机分配vip_subnet_cidr_id对应子网的可用IP地址。
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public TargetLoadbalancerParam withIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
        return this;
    }

    /**
     * **参数解释**：新实例ipv6网络所属的子网网络ID。  **约束限制**： - 仅支持源ELB独享型复制场景设置该字段。 - 所选子网必须与源负载均衡器在同一个vpc内。  **取值范围**：不涉及  **默认取值**：不传时使用源ELB的ipv6_vip_virsubnet_id。
     * @return ipv6VipVirsubnetId
     */
    public String getIpv6VipVirsubnetId() {
        return ipv6VipVirsubnetId;
    }

    public void setIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
    }

    public TargetLoadbalancerParam withIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
        return this;
    }

    /**
     * **参数解释**：新实例的ipv6地址。  **约束限制**：仅支持源ELB为独享型复制场景设置该字段。  **取值范围**：不涉及  **默认取值**：不传时随机分配ipv6_vip_virsubnet_id对应子网的可用IP地址。
     * @return ipv6VipAddress
     */
    public String getIpv6VipAddress() {
        return ipv6VipAddress;
    }

    public void setIpv6VipAddress(String ipv6VipAddress) {
        this.ipv6VipAddress = ipv6VipAddress;
    }

    public TargetLoadbalancerParam withElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
        return this;
    }

    public TargetLoadbalancerParam addElbVirsubnetIdsItem(String elbVirsubnetIdsItem) {
        if (this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        this.elbVirsubnetIds.add(elbVirsubnetIdsItem);
        return this;
    }

    public TargetLoadbalancerParam withElbVirsubnetIds(Consumer<List<String>> elbVirsubnetIdsSetter) {
        if (this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        elbVirsubnetIdsSetter.accept(this.elbVirsubnetIds);
        return this;
    }

    /**
     * **参数解释**：新实例后端子网的网络ID。  **约束限制**： - 仅支持源ELB独享型复制场景、源ELB共享型复制为独享型场景支持设置该字段。 - 所选子网必须与源负载均衡器在同一个vpc内。  **取值范围**：不涉及  **默认取值**：不传时使用源负载均衡器的后端子网。
     * @return elbVirsubnetIds
     */
    public List<String> getElbVirsubnetIds() {
        return elbVirsubnetIds;
    }

    public void setElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
    }

    public TargetLoadbalancerParam withL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
        return this;
    }

    /**
     * **参数解释**：新实例4层规格。  **约束限制**：仅支持源ELB独享型复制场景、源ELB共享型复制为独享型场景支持设置该字段。  **取值范围**：不涉及  **默认取值**：不传时保持与源负载均衡器的4层规格一致。
     * @return l4FlavorId
     */
    public String getL4FlavorId() {
        return l4FlavorId;
    }

    public void setL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
    }

    public TargetLoadbalancerParam withL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    /**
     * **参数解释**：新实例7层规格。  **约束限制**：仅支持源ELB独享型复制场景、源ELB共享型复制为独享型场景支持设置该字段。  **取值范围**：不涉及  **默认取值**：不传时保持与源负载均衡器的7层规格一致。
     * @return l7FlavorId
     */
    public String getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    public TargetLoadbalancerParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**：资源所属的企业项目ID。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不传时保持与源负载均衡器的企业项目一致。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public TargetLoadbalancerParam withReusePool(Boolean reusePool) {
        this.reusePool = reusePool;
        return this;
    }

    /**
     * **参数解释**：新实例是否复用源ELB的后端服务器组。  **约束限制**： - 设置为true时，需要开启后端服务器组的多实例挂载功能。 - 请求参数enterprise_project_id使用与源ELB不同的其他企业项目时，该参数失效。 - 仅源ELB独享型复制场景、源ELB共享型复制为独享型场景支持设置为true。  **取值范围**： - false：新创建后端服务器组。 - true：复用源ELB的后端服务器组。  **默认取值**：false
     * @return reusePool
     */
    public Boolean getReusePool() {
        return reusePool;
    }

    public void setReusePool(Boolean reusePool) {
        this.reusePool = reusePool;
    }

    public TargetLoadbalancerParam withGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }

    /**
     * **参数解释**：新实例类型。  **约束限制**：不涉及  **取值范围**： - false：复制为共享型实例，此时源ELB必须是共享型。 - true：复制为独享型实例，源ELB可以是共享型或独享型。  **默认取值**： - 源ELB是独享型复制场景默认为true。 - 源ELB是共享型复制场景默认为false。
     * @return guaranteed
     */
    public Boolean getGuaranteed() {
        return guaranteed;
    }

    public void setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetLoadbalancerParam that = (TargetLoadbalancerParam) obj;
        return Objects.equals(this.name, that.name)
            && Objects.equals(this.availabilityZoneList, that.availabilityZoneList)
            && Objects.equals(this.vipSubnetCidrId, that.vipSubnetCidrId)
            && Objects.equals(this.vipAddress, that.vipAddress)
            && Objects.equals(this.ipv6VipVirsubnetId, that.ipv6VipVirsubnetId)
            && Objects.equals(this.ipv6VipAddress, that.ipv6VipAddress)
            && Objects.equals(this.elbVirsubnetIds, that.elbVirsubnetIds)
            && Objects.equals(this.l4FlavorId, that.l4FlavorId) && Objects.equals(this.l7FlavorId, that.l7FlavorId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.reusePool, that.reusePool) && Objects.equals(this.guaranteed, that.guaranteed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            availabilityZoneList,
            vipSubnetCidrId,
            vipAddress,
            ipv6VipVirsubnetId,
            ipv6VipAddress,
            elbVirsubnetIds,
            l4FlavorId,
            l7FlavorId,
            enterpriseProjectId,
            reusePool,
            guaranteed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetLoadbalancerParam {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    availabilityZoneList: ").append(toIndentedString(availabilityZoneList)).append("\n");
        sb.append("    vipSubnetCidrId: ").append(toIndentedString(vipSubnetCidrId)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    ipv6VipVirsubnetId: ").append(toIndentedString(ipv6VipVirsubnetId)).append("\n");
        sb.append("    ipv6VipAddress: ").append(toIndentedString(ipv6VipAddress)).append("\n");
        sb.append("    elbVirsubnetIds: ").append(toIndentedString(elbVirsubnetIds)).append("\n");
        sb.append("    l4FlavorId: ").append(toIndentedString(l4FlavorId)).append("\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    reusePool: ").append(toIndentedString(reusePool)).append("\n");
        sb.append("    guaranteed: ").append(toIndentedString(guaranteed)).append("\n");
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
