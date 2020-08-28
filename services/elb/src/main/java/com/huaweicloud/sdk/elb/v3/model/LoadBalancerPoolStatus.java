package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.PoolHealthMonitorStatus;
import com.huaweicloud.sdk.elb.v3.model.PoolMemberStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * lb状态树的主机组状态信息
 */
public class LoadBalancerPoolStatus  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="healthmonitor")
    
    private PoolHealthMonitorStatus healthmonitor = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="members")
    
    private List<PoolMemberStatus> members = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private String operatingStatus;

    public LoadBalancerPoolStatus withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * provisioning的状态。 可以为：ACTIVE、PENDING_CREATE 或者ERROR。说明：该字段为预留字段，暂未启用，默认为ACTIVE。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public LoadBalancerPoolStatus withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 后端服务器组名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadBalancerPoolStatus withHealthmonitor(PoolHealthMonitorStatus healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public LoadBalancerPoolStatus withHealthmonitor(Consumer<PoolHealthMonitorStatus> healthmonitorSetter) {
        if(this.healthmonitor == null ){
            this.healthmonitor = new PoolHealthMonitorStatus();
            healthmonitorSetter.accept(this.healthmonitor);
        }
        
        return this;
    }


    /**
     * Get healthmonitor
     * @return healthmonitor
     */
    public PoolHealthMonitorStatus getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(PoolHealthMonitorStatus healthmonitor) {
        this.healthmonitor = healthmonitor;
    }

    public LoadBalancerPoolStatus withMembers(List<PoolMemberStatus> members) {
        this.members = members;
        return this;
    }

    
    public LoadBalancerPoolStatus addMembersItem(PoolMemberStatus membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public LoadBalancerPoolStatus withMembers(Consumer<List<PoolMemberStatus>> membersSetter) {
        if(this.members == null ){
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 后端服务器。
     * @return members
     */
    public List<PoolMemberStatus> getMembers() {
        return members;
    }

    public void setMembers(List<PoolMemberStatus> members) {
        this.members = members;
    }

    public LoadBalancerPoolStatus withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 后端服务器组ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadBalancerPoolStatus withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    


    /**
     * 操作状态。 可以为：ONLINE、OFFLINE、DEGRADED、DISABLED或NO_MONITOR。说明：该字段为预留字段，暂未启用，默认为ONLINE。
     * @return operatingStatus
     */
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
        LoadBalancerPoolStatus loadBalancerPoolStatus = (LoadBalancerPoolStatus) o;
        return Objects.equals(this.provisioningStatus, loadBalancerPoolStatus.provisioningStatus) &&
            Objects.equals(this.name, loadBalancerPoolStatus.name) &&
            Objects.equals(this.healthmonitor, loadBalancerPoolStatus.healthmonitor) &&
            Objects.equals(this.members, loadBalancerPoolStatus.members) &&
            Objects.equals(this.id, loadBalancerPoolStatus.id) &&
            Objects.equals(this.operatingStatus, loadBalancerPoolStatus.operatingStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(provisioningStatus, name, healthmonitor, members, id, operatingStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerPoolStatus {\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
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

