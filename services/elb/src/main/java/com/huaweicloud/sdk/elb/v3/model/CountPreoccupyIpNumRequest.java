package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CountPreoccupyIpNumRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7_flavor_id")

    private String l7FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_target_enable")

    private Boolean ipTargetEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private List<String> availabilityZoneId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat64_enable")

    private Boolean nat64Enable;

    public CountPreoccupyIpNumRequest withL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器七层规格的ID。传入该字段表示计算创建该规格的LB的预占IP数量，或变更LB的原七层规格到该规格所需要的新增预占IP数量。  **约束限制**：仅支持创建LB、变更LB规格场景。  **取值范围**：不涉及  **默认取值**：不涉及  [不支持传入l7_flavor_id。](tag:hcso,hk_vdf,srg,fcs)
     * @return l7FlavorId
     */
    public String getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    public CountPreoccupyIpNumRequest withIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
        return this;
    }

    /**
     * **参数解释**：IP类型后端转发开关。  **约束限制**：仅支持创建LB、LB开启IP类型后端转发场景。  **取值范围**： - 取值true表示计算创建开启IP类型后端转发的LB的预占IP数量，或开启IP类型后端转发所需要的新增预占IP数量。 - 取值false表示计算创建不开启IP类型后端转发的LB的预占IP。 - 不传等价false。  **默认取值**：false [荷兰region不支持该字段，请勿使用。](tag:dt)
     * @return ipTargetEnable
     */
    public Boolean getIpTargetEnable() {
        return ipTargetEnable;
    }

    public void setIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
    }

    public CountPreoccupyIpNumRequest withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * **参数解释**：负载均衡器IP地址类型，取值4、6 。  **约束限制**：仅支持创建LB场景。  **取值范围**： - 取值4表示计算创建支持IPv4地址的LB的预占IP。 - 取值6表示计算创建支持IPv6地址的LB的预占IP。  **默认取值**：不涉及  [不支持IPv6，请勿设置为6。](tag:dt)
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public CountPreoccupyIpNumRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器ID。计算LB变更或创建LB中的第一个七层监听器的新增预占IP。  **约束限制**：仅支持变更LB规格、开启IP类型后端转发、开启/不开启地址转换功能、创建LB中的第一个七层监听器场景。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public CountPreoccupyIpNumRequest withAvailabilityZoneId(List<String> availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    public CountPreoccupyIpNumRequest addAvailabilityZoneIdItem(String availabilityZoneIdItem) {
        if (this.availabilityZoneId == null) {
            this.availabilityZoneId = new ArrayList<>();
        }
        this.availabilityZoneId.add(availabilityZoneIdItem);
        return this;
    }

    public CountPreoccupyIpNumRequest withAvailabilityZoneId(Consumer<List<String>> availabilityZoneIdSetter) {
        if (this.availabilityZoneId == null) {
            this.availabilityZoneId = new ArrayList<>();
        }
        availabilityZoneIdSetter.accept(this.availabilityZoneId);
        return this;
    }

    /**
     * **参数解释**：计算创建AZ列表为availability_zone_id的负载均衡器实例的预占IP。  **约束限制**： - 仅支持创建LB场景。 - 传入loadbalancer_id时，该参数无效。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return availabilityZoneId
     */
    public List<String> getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(List<String> availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public CountPreoccupyIpNumRequest withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * **参数解释**：计算共享型升级为独享型ELB负载均衡器实例的所需预占IP。  **约束限制**： - 仅支持共享型升级为独享型ELB场景。 - 必须同时传入loadbalancer_id。  **取值范围**：UPGRADE - 共享型升级为独享型ELB场景。  **默认取值**：不涉及
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public CountPreoccupyIpNumRequest withNat64Enable(Boolean nat64Enable) {
        this.nat64Enable = nat64Enable;
        return this;
    }

    /**
     * **参数解释**：开启地址转换。传入该字段表示计算创建LB及该LB下开启/不开启地址转换特性的监听器所需要的预占IP，或者指定LB创建开启/不开启地址转换特性的监听器所需要的新增预占IP。  **约束限制**： - 仅支持计算ELB实例开启NAT64特性场景。  **取值范围**： - true：开启地址转换特性。 - false：不开启地址转换特性。  **默认取值**：false
     * @return nat64Enable
     */
    public Boolean getNat64Enable() {
        return nat64Enable;
    }

    public void setNat64Enable(Boolean nat64Enable) {
        this.nat64Enable = nat64Enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountPreoccupyIpNumRequest that = (CountPreoccupyIpNumRequest) obj;
        return Objects.equals(this.l7FlavorId, that.l7FlavorId)
            && Objects.equals(this.ipTargetEnable, that.ipTargetEnable)
            && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.loadbalancerId, that.loadbalancerId)
            && Objects.equals(this.availabilityZoneId, that.availabilityZoneId)
            && Objects.equals(this.scene, that.scene) && Objects.equals(this.nat64Enable, that.nat64Enable);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(l7FlavorId, ipTargetEnable, ipVersion, loadbalancerId, availabilityZoneId, scene, nat64Enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountPreoccupyIpNumRequest {\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    ipTargetEnable: ").append(toIndentedString(ipTargetEnable)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    nat64Enable: ").append(toIndentedString(nat64Enable)).append("\n");
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
