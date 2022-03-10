package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 更新负载均衡器参数。 */
public class UpdateLoadBalancerOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_vip_virsubnet_id")

    private String ipv6VipVirsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_subnet_cidr_id")

    private String vipSubnetCidrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_address")

    private String vipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l4_flavor_id")

    private String l4FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7_flavor_id")

    private String l7FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_bandwidth")

    private BandwidthRef ipv6Bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_target_enable")

    private Boolean ipTargetEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_virsubnet_ids")

    private List<String> elbVirsubnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletion_protection_enable")

    private Boolean deletionProtectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prepaid_options")

    private PrepaidUpdateOption prepaidOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscaling")

    private UpdateLoadbalancerAutoscalingOption autoscaling;

    public UpdateLoadBalancerOption withName(String name) {
        this.name = name;
        return this;
    }

    /** 负载均衡器的名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateLoadBalancerOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** 负载均衡器的管理状态。只能设置为true。 [不支持该字段，请勿使用。](tag:dt,dt_test)
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public UpdateLoadBalancerOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 负载均衡器的描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateLoadBalancerOption withIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
        return this;
    }

    /** 双栈类型负载均衡器所在子网的IPv6网络ID。可以通过GET https://{VPC_Endpoint}/v1/{project_id}/subnets 响应参数中的id得到。
     * 通过更新ipv6_vip_virsubnet_id可以更新负载均衡器所在IPv6子网，且负载均衡器的内网IPv6地址将发生变化。 使用说明： - ipv6_vip_virsubnet_id
     * 对应的子网必须属于当前负载均衡器所在VPC，且子网需开启支持IPv6。 - 只有guaranteed是true的负载均衡器才支持更新ipv6_vip_virsubnet_id。 - *传入为null表示解绑IPv6子网。* -
     * 更新IPv6子网不会导致IPv4子网发生变化。 [不支持IPv6，请勿使用。](tag:dt,dt_test)
     * 
     * @return ipv6VipVirsubnetId */
    public String getIpv6VipVirsubnetId() {
        return ipv6VipVirsubnetId;
    }

    public void setIpv6VipVirsubnetId(String ipv6VipVirsubnetId) {
        this.ipv6VipVirsubnetId = ipv6VipVirsubnetId;
    }

    public UpdateLoadBalancerOption withVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
        return this;
    }

    /** 负载均衡器所在的IPv4子网ID。可以通过GET https://{VPC_Endpoint}/v1/{project_id}/subnets 响应参数中的neutron_subnet_id得到。
     * 通过更新vip_subnet_cidr_id可以更新负载均衡器所在IPv4子网，并且负载均衡器的内网IPv4地址将发生变化。 使用说明： -
     * 若同时设置了vip_address，则必须保证vip_address对应的IP在vip_subnet_cidr_id的子网网段中。 -
     * vip_subnet_cidr_id对应的子网必须属于当前负载均衡器vpc_id对应的VPC。 - 只有guaranteed是true的负载均衡器才支持更新vip_subnet_cidr_id。 -
     * *传入null表示解绑IPv4子网。* - 更新IPv子网不会导致IPv4子网发生变化。
     * 
     * @return vipSubnetCidrId */
    public String getVipSubnetCidrId() {
        return vipSubnetCidrId;
    }

    public void setVipSubnetCidrId(String vipSubnetCidrId) {
        this.vipSubnetCidrId = vipSubnetCidrId;
    }

    public UpdateLoadBalancerOption withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    /** 负载均衡器的IPv4虚拟IP。该地址必须包含在所在子网的IPv4网段内，且未被占用。 注：仅当guaranteed是true的场合，才支持更新。
     * 
     * @return vipAddress */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public UpdateLoadBalancerOption withL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
        return this;
    }

    /** 四层Flavor ID。 注： 1.仅当guaranteed是true的场合，才支持更新。 2.不允许非null变成null，null变成非null，只允许改大，不允许改小。
     * [hcso场景下所有LB实例共享带宽，该字段无效，请勿使用。](tag:hws,hcso)
     * 
     * @return l4FlavorId */
    public String getL4FlavorId() {
        return l4FlavorId;
    }

    public void setL4FlavorId(String l4FlavorId) {
        this.l4FlavorId = l4FlavorId;
    }

    public UpdateLoadBalancerOption withL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    /** 七层Flavor ID。 注： 1.仅当guaranteed是true的场合，才支持更新。 2.不允许非null变成null，null变成非null；只允许改大，不允许改小。
     * [hcso场景下所有LB实例共享带宽，该字段无效，请勿使用。](tag:hws,hcso)
     * 
     * @return l7FlavorId */
    public String getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    public UpdateLoadBalancerOption withIpv6Bandwidth(BandwidthRef ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }

    public UpdateLoadBalancerOption withIpv6Bandwidth(Consumer<BandwidthRef> ipv6BandwidthSetter) {
        if (this.ipv6Bandwidth == null) {
            this.ipv6Bandwidth = new BandwidthRef();
            ipv6BandwidthSetter.accept(this.ipv6Bandwidth);
        }

        return this;
    }

    /** Get ipv6Bandwidth
     * 
     * @return ipv6Bandwidth */
    public BandwidthRef getIpv6Bandwidth() {
        return ipv6Bandwidth;
    }

    public void setIpv6Bandwidth(BandwidthRef ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
    }

    public UpdateLoadBalancerOption withIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
        return this;
    }

    /** 是否启用跨VPC后端转发，开启跨VPC后端转发后，支持添加其他VPC、其他公有云、云下数据中心的服务器。取值： - true：开启。 - false：不开启。
     * [仅独享型负载均衡器支持该特性，且只能更新为true，即开启后不支持关闭。](tag:hws,hws_hk,ocb,tlf,ctc,hcso,sbc,g42,tm,cmcc,hk-g42,dt,dt_test)
     * [不支持该字段，请勿使用。](tag:dt,dt_test)
     * 
     * @return ipTargetEnable */
    public Boolean getIpTargetEnable() {
        return ipTargetEnable;
    }

    public void setIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
    }

    public UpdateLoadBalancerOption withElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
        return this;
    }

    public UpdateLoadBalancerOption addElbVirsubnetIdsItem(String elbVirsubnetIdsItem) {
        if (this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        this.elbVirsubnetIds.add(elbVirsubnetIdsItem);
        return this;
    }

    public UpdateLoadBalancerOption withElbVirsubnetIds(Consumer<List<String>> elbVirsubnetIdsSetter) {
        if (this.elbVirsubnetIds == null) {
            this.elbVirsubnetIds = new ArrayList<>();
        }
        elbVirsubnetIdsSetter.accept(this.elbVirsubnetIds);
        return this;
    }

    /** 下联面子网的网络ID列表。可以通过GET https://{VPC_Endpoint}/v1/{project_id}/subnets 响应参数中的id得到。
     * 已绑定的下联面子网也在传参elb_virsubnet_ids列表中，则绑定关系保留。
     * 已绑定的下联面子网若不在传参elb_virsubnet_ids列表中，则将移除LB与该下联面子网的关联关系。但不允许移除已被ELB使用的子网，否则将报错，不做任何修改。
     * 在传参elb_virsubnet_ids列表中但不在已绑定的下联面子网列表中，则将新增LB与下联面的绑定关系。 使用说明： - 所有ID同属于该LB所在的VPC。 - 不支持边缘云子网。
     * 
     * @return elbVirsubnetIds */
    public List<String> getElbVirsubnetIds() {
        return elbVirsubnetIds;
    }

    public void setElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
    }

    public UpdateLoadBalancerOption withDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
        return this;
    }

    /** 是否开启删除保护。取值：false不开启，true开启。 > 退场时需要先关闭所有资源的删除保护开关。 [不支持该字段，请勿使用](tag:dt,dt_test)
     * 
     * @return deletionProtectionEnable */
    public Boolean getDeletionProtectionEnable() {
        return deletionProtectionEnable;
    }

    public void setDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
    }

    public UpdateLoadBalancerOption withPrepaidOptions(PrepaidUpdateOption prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
        return this;
    }

    public UpdateLoadBalancerOption withPrepaidOptions(Consumer<PrepaidUpdateOption> prepaidOptionsSetter) {
        if (this.prepaidOptions == null) {
            this.prepaidOptions = new PrepaidUpdateOption();
            prepaidOptionsSetter.accept(this.prepaidOptions);
        }

        return this;
    }

    /** Get prepaidOptions
     * 
     * @return prepaidOptions */
    public PrepaidUpdateOption getPrepaidOptions() {
        return prepaidOptions;
    }

    public void setPrepaidOptions(PrepaidUpdateOption prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
    }

    public UpdateLoadBalancerOption withAutoscaling(UpdateLoadbalancerAutoscalingOption autoscaling) {
        this.autoscaling = autoscaling;
        return this;
    }

    public UpdateLoadBalancerOption withAutoscaling(Consumer<UpdateLoadbalancerAutoscalingOption> autoscalingSetter) {
        if (this.autoscaling == null) {
            this.autoscaling = new UpdateLoadbalancerAutoscalingOption();
            autoscalingSetter.accept(this.autoscaling);
        }

        return this;
    }

    /** Get autoscaling
     * 
     * @return autoscaling */
    public UpdateLoadbalancerAutoscalingOption getAutoscaling() {
        return autoscaling;
    }

    public void setAutoscaling(UpdateLoadbalancerAutoscalingOption autoscaling) {
        this.autoscaling = autoscaling;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLoadBalancerOption updateLoadBalancerOption = (UpdateLoadBalancerOption) o;
        return Objects.equals(this.name, updateLoadBalancerOption.name)
            && Objects.equals(this.adminStateUp, updateLoadBalancerOption.adminStateUp)
            && Objects.equals(this.description, updateLoadBalancerOption.description)
            && Objects.equals(this.ipv6VipVirsubnetId, updateLoadBalancerOption.ipv6VipVirsubnetId)
            && Objects.equals(this.vipSubnetCidrId, updateLoadBalancerOption.vipSubnetCidrId)
            && Objects.equals(this.vipAddress, updateLoadBalancerOption.vipAddress)
            && Objects.equals(this.l4FlavorId, updateLoadBalancerOption.l4FlavorId)
            && Objects.equals(this.l7FlavorId, updateLoadBalancerOption.l7FlavorId)
            && Objects.equals(this.ipv6Bandwidth, updateLoadBalancerOption.ipv6Bandwidth)
            && Objects.equals(this.ipTargetEnable, updateLoadBalancerOption.ipTargetEnable)
            && Objects.equals(this.elbVirsubnetIds, updateLoadBalancerOption.elbVirsubnetIds)
            && Objects.equals(this.deletionProtectionEnable, updateLoadBalancerOption.deletionProtectionEnable)
            && Objects.equals(this.prepaidOptions, updateLoadBalancerOption.prepaidOptions)
            && Objects.equals(this.autoscaling, updateLoadBalancerOption.autoscaling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            adminStateUp,
            description,
            ipv6VipVirsubnetId,
            vipSubnetCidrId,
            vipAddress,
            l4FlavorId,
            l7FlavorId,
            ipv6Bandwidth,
            ipTargetEnable,
            elbVirsubnetIds,
            deletionProtectionEnable,
            prepaidOptions,
            autoscaling);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoadBalancerOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipv6VipVirsubnetId: ").append(toIndentedString(ipv6VipVirsubnetId)).append("\n");
        sb.append("    vipSubnetCidrId: ").append(toIndentedString(vipSubnetCidrId)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    l4FlavorId: ").append(toIndentedString(l4FlavorId)).append("\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    ipv6Bandwidth: ").append(toIndentedString(ipv6Bandwidth)).append("\n");
        sb.append("    ipTargetEnable: ").append(toIndentedString(ipTargetEnable)).append("\n");
        sb.append("    elbVirsubnetIds: ").append(toIndentedString(elbVirsubnetIds)).append("\n");
        sb.append("    deletionProtectionEnable: ").append(toIndentedString(deletionProtectionEnable)).append("\n");
        sb.append("    prepaidOptions: ").append(toIndentedString(prepaidOptions)).append("\n");
        sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
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
