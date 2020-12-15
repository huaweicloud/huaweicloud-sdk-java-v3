package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.BandwidthRef;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新负载均衡器的消息请求体
 */
public class UpdateLoadBalancerOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_vip_virsubnet_id")
    
    private String ipv6VipVirsubnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_subnet_cidr_id")
    
    private String vipSubnetCidrId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_address")
    
    private String vipAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l4_flavor_id")
    
    private String l4FlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7_flavor_id")
    
    private String l7FlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6_bandwidth")
    
    private BandwidthRef ipv6Bandwidth = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_target_enable")
    
    private Boolean ipTargetEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deletion_protection_enable")
    
    private Boolean deletionProtectionEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elb_virsubnet_ids")
    
    private List<String> elbVirsubnetIds = null;
    
    public UpdateLoadBalancerOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 负载均衡器名称。 
     * @return name
     */
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

    


    /**
     * 负载均衡器的管理状态。 说明：负载均衡器的管理状态。只支持设定为true。
     * @return adminStateUp
     */
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

    


    /**
     * 负载均衡器功能说明。
     * @return description
     */
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

    


    /**
     * 双栈实例对应v6的网络id 。 注： 1.默认为空，只有开启IPv6时才会传入。 2.仅当guaranteed是true的场合，才支持更新。 3.解绑ipv6的情况下，输入null
     * @return ipv6VipVirsubnetId
     */
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

    


    /**
     * 负载均衡器所在的子网ID。 注： 1.仅当guaranteed是true的场合，才支持更新。 2.解绑ipv4私网的情况下，输入null
     * @return vipSubnetCidrId
     */
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

    


    /**
     * 负载均衡器的虚拟IP。 说明： 1.传入vip_address时必须传入vip_subnet_cidr_id 2.不传入vip_address，自动分配虚拟IP。 3.传入vip_address，需要保证该ip地址在子网中未被占用 注：仅当guaranteed是true的场合，才支持更新。
     * @return vipAddress
     */
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

    


    /**
     * 四层Flavor。 注：1.仅当guaranteed是true的场合，才支持更新。 2.不允许非null变成null，null变成非null，只允许改大，不允许改小。
     * @return l4FlavorId
     */
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

    


    /**
     * 七层Flavor。 注：1.仅当guaranteed是true的场合，才支持更新。 2.不允许非null变成null，null变成非null；只允许改大，不允许改小。
     * @return l7FlavorId
     */
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
        if(this.ipv6Bandwidth == null ){
            this.ipv6Bandwidth = new BandwidthRef();
            ipv6BandwidthSetter.accept(this.ipv6Bandwidth);
        }
        
        return this;
    }


    /**
     * Get ipv6Bandwidth
     * @return ipv6Bandwidth
     */
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

    


    /**
     * 是否启用跨VPC后端转发，值只允许为true
     * @return ipTargetEnable
     */
    public Boolean getIpTargetEnable() {
        return ipTargetEnable;
    }

    public void setIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
    }

    public UpdateLoadBalancerOption withDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
        return this;
    }

    


    /**
     * 是否开启删除保护
     * @return deletionProtectionEnable
     */
    public Boolean getDeletionProtectionEnable() {
        return deletionProtectionEnable;
    }

    public void setDeletionProtectionEnable(Boolean deletionProtectionEnable) {
        this.deletionProtectionEnable = deletionProtectionEnable;
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
        if(this.elbVirsubnetIds == null ){
            this.elbVirsubnetIds = new ArrayList<>();
        }
        elbVirsubnetIdsSetter.accept(this.elbVirsubnetIds);
        return this;
    }

    /**
     * 【描述】下联面网络ID列表，若该字段不指定，在loadbalancer所属的VPC中任意选一个网络id，优选双栈网络。 【约束】 1、所有ID同属一个VPC 2、不允许移除已被ELB使用的子网 3、不支持边缘云子网 4、负载均衡实例不处于ACTIVE状态时，不支持该字段更新 
     * @return elbVirsubnetIds
     */
    public List<String> getElbVirsubnetIds() {
        return elbVirsubnetIds;
    }

    public void setElbVirsubnetIds(List<String> elbVirsubnetIds) {
        this.elbVirsubnetIds = elbVirsubnetIds;
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
        return Objects.equals(this.name, updateLoadBalancerOption.name) &&
            Objects.equals(this.adminStateUp, updateLoadBalancerOption.adminStateUp) &&
            Objects.equals(this.description, updateLoadBalancerOption.description) &&
            Objects.equals(this.ipv6VipVirsubnetId, updateLoadBalancerOption.ipv6VipVirsubnetId) &&
            Objects.equals(this.vipSubnetCidrId, updateLoadBalancerOption.vipSubnetCidrId) &&
            Objects.equals(this.vipAddress, updateLoadBalancerOption.vipAddress) &&
            Objects.equals(this.l4FlavorId, updateLoadBalancerOption.l4FlavorId) &&
            Objects.equals(this.l7FlavorId, updateLoadBalancerOption.l7FlavorId) &&
            Objects.equals(this.ipv6Bandwidth, updateLoadBalancerOption.ipv6Bandwidth) &&
            Objects.equals(this.ipTargetEnable, updateLoadBalancerOption.ipTargetEnable) &&
            Objects.equals(this.deletionProtectionEnable, updateLoadBalancerOption.deletionProtectionEnable) &&
            Objects.equals(this.elbVirsubnetIds, updateLoadBalancerOption.elbVirsubnetIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, adminStateUp, description, ipv6VipVirsubnetId, vipSubnetCidrId, vipAddress, l4FlavorId, l7FlavorId, ipv6Bandwidth, ipTargetEnable, deletionProtectionEnable, elbVirsubnetIds);
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
        sb.append("    deletionProtectionEnable: ").append(toIndentedString(deletionProtectionEnable)).append("\n");
        sb.append("    elbVirsubnetIds: ").append(toIndentedString(elbVirsubnetIds)).append("\n");
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

