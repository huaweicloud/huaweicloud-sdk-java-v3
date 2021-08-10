package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CountPreoccupyIpNumRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private List<String> availabilityZoneId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_target_enable")

    private Boolean ipTargetEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7_flavor_id")

    private String l7FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

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

    /** 功能描述：LB需要部署的AZ列表 约束：若查询创建一个LB所需预占IP数时，该参数为必选
     * 
     * @return availabilityZoneId */
    public List<String> getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(List<String> availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public CountPreoccupyIpNumRequest withIpTargetEnable(Boolean ipTargetEnable) {
        this.ipTargetEnable = ipTargetEnable;
        return this;
    }

    /** 是否启用跨VPC后端转发
     * 
     * @return ipTargetEnable */
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

    /** 负载均衡器网络类型，枚举值4，6
     * 
     * @return ipVersion */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public CountPreoccupyIpNumRequest withL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
        return this;
    }

    /** 七层Flavor的ID。如果欲创建7层规格的弹性负载均衡实例，则该参数为必选
     * 
     * @return l7FlavorId */
    public String getL7FlavorId() {
        return l7FlavorId;
    }

    public void setL7FlavorId(String l7FlavorId) {
        this.l7FlavorId = l7FlavorId;
    }

    public CountPreoccupyIpNumRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /** 负载均衡器ID。当查询创建第一个七层监听器所需预占的ip数时，该参数为必选。
     * 
     * @return loadbalancerId */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountPreoccupyIpNumRequest countPreoccupyIpNumRequest = (CountPreoccupyIpNumRequest) o;
        return Objects.equals(this.availabilityZoneId, countPreoccupyIpNumRequest.availabilityZoneId)
            && Objects.equals(this.ipTargetEnable, countPreoccupyIpNumRequest.ipTargetEnable)
            && Objects.equals(this.ipVersion, countPreoccupyIpNumRequest.ipVersion)
            && Objects.equals(this.l7FlavorId, countPreoccupyIpNumRequest.l7FlavorId)
            && Objects.equals(this.loadbalancerId, countPreoccupyIpNumRequest.loadbalancerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZoneId, ipTargetEnable, ipVersion, l7FlavorId, loadbalancerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountPreoccupyIpNumRequest {\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    ipTargetEnable: ").append(toIndentedString(ipTargetEnable)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    l7FlavorId: ").append(toIndentedString(l7FlavorId)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
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
