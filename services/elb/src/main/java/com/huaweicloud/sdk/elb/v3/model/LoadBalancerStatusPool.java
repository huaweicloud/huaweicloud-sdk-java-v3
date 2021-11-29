package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** LB状态树的后端服务器组状态信息。 */
public class LoadBalancerStatusPool {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor")

    private LoadBalancerStatusHealthMonitor healthmonitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<LoadBalancerStatusMember> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private String operatingStatus;

    public LoadBalancerStatusPool withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /** 后端服务器组的配置状态。取值： - ACTIVE：使用中。
     * 
     * @return provisioningStatus */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public LoadBalancerStatusPool withName(String name) {
        this.name = name;
        return this;
    }

    /** 后端服务器组名。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadBalancerStatusPool withHealthmonitor(LoadBalancerStatusHealthMonitor healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public LoadBalancerStatusPool withHealthmonitor(Consumer<LoadBalancerStatusHealthMonitor> healthmonitorSetter) {
        if (this.healthmonitor == null) {
            this.healthmonitor = new LoadBalancerStatusHealthMonitor();
            healthmonitorSetter.accept(this.healthmonitor);
        }

        return this;
    }

    /** Get healthmonitor
     * 
     * @return healthmonitor */
    public LoadBalancerStatusHealthMonitor getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(LoadBalancerStatusHealthMonitor healthmonitor) {
        this.healthmonitor = healthmonitor;
    }

    public LoadBalancerStatusPool withMembers(List<LoadBalancerStatusMember> members) {
        this.members = members;
        return this;
    }

    public LoadBalancerStatusPool addMembersItem(LoadBalancerStatusMember membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public LoadBalancerStatusPool withMembers(Consumer<List<LoadBalancerStatusMember>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /** 后端服务器状态信息。
     * 
     * @return members */
    public List<LoadBalancerStatusMember> getMembers() {
        return members;
    }

    public void setMembers(List<LoadBalancerStatusMember> members) {
        this.members = members;
    }

    public LoadBalancerStatusPool withId(String id) {
        this.id = id;
        return this;
    }

    /** 后端服务器组ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadBalancerStatusPool withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    /** 后端服务器组的操作状态。取值： - ONLINE：创建时默认状态，表后端服务器组正常。 - DEGRADED：该后端服务器组下存在member为的operating_status=OFFLINE。 -
     * DISABLED：负载均衡器或后端服务器组的admin_state_up=false。 使用说明： -
     * DEGRADED和DISABLED仅在当前接口返回，查询后端服务器组详情等其他接口返回的operating_status字段不存在这两个状态值。
     * 
     * @return operatingStatus */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadBalancerStatusPool loadBalancerStatusPool = (LoadBalancerStatusPool) o;
        return Objects.equals(this.provisioningStatus, loadBalancerStatusPool.provisioningStatus)
            && Objects.equals(this.name, loadBalancerStatusPool.name)
            && Objects.equals(this.healthmonitor, loadBalancerStatusPool.healthmonitor)
            && Objects.equals(this.members, loadBalancerStatusPool.members)
            && Objects.equals(this.id, loadBalancerStatusPool.id)
            && Objects.equals(this.operatingStatus, loadBalancerStatusPool.operatingStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provisioningStatus, name, healthmonitor, members, id, operatingStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerStatusPool {\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
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
