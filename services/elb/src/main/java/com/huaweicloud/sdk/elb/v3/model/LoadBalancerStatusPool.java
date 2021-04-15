package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.LoadBalancerStatusHealthMonitor;
import com.huaweicloud.sdk.elb.v3.model.LoadBalancerStatusMember;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * lb状态树的主机组状态信息
 */
public class LoadBalancerStatusPool  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="healthmonitor")
    
    private LoadBalancerStatusHealthMonitor healthmonitor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="members")
    
    private List<LoadBalancerStatusMember> members = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private String operatingStatus;

    public LoadBalancerStatusPool withProvisioningStatus(String provisioningStatus) {
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

    

    public LoadBalancerStatusPool withName(String name) {
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

    

    public LoadBalancerStatusPool withHealthmonitor(LoadBalancerStatusHealthMonitor healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public LoadBalancerStatusPool withHealthmonitor(Consumer<LoadBalancerStatusHealthMonitor> healthmonitorSetter) {
        if(this.healthmonitor == null ){
            this.healthmonitor = new LoadBalancerStatusHealthMonitor();
            healthmonitorSetter.accept(this.healthmonitor);
        }
        
        return this;
    }


    /**
     * Get healthmonitor
     * @return healthmonitor
     */
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
        if(this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public LoadBalancerStatusPool withMembers(Consumer<List<LoadBalancerStatusMember>> membersSetter) {
        if(this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 后端服务器。
     * @return members
     */
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

    

    public LoadBalancerStatusPool withOperatingStatus(String operatingStatus) {
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
        LoadBalancerStatusPool loadBalancerStatusPool = (LoadBalancerStatusPool) o;
        return Objects.equals(this.provisioningStatus, loadBalancerStatusPool.provisioningStatus) &&
            Objects.equals(this.name, loadBalancerStatusPool.name) &&
            Objects.equals(this.healthmonitor, loadBalancerStatusPool.healthmonitor) &&
            Objects.equals(this.members, loadBalancerStatusPool.members) &&
            Objects.equals(this.id, loadBalancerStatusPool.id) &&
            Objects.equals(this.operatingStatus, loadBalancerStatusPool.operatingStatus);
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

