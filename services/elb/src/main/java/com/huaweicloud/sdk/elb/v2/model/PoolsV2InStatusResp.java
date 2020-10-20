package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.HealthmonitorsV2InStatusResp;
import com.huaweicloud.sdk.elb.v2.model.MembersV2InStatusResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 后端云服务器对象列表，用于状态树中
 */
public class PoolsV2InStatusResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="members")
    
    private List<MembersV2InStatusResp> members = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private String operatingStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="healthmonitor")
    
    private HealthmonitorsV2InStatusResp healthmonitor = null;

    public PoolsV2InStatusResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 后端云服务器组ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PoolsV2InStatusResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 后端云服务器组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PoolsV2InStatusResp withMembers(List<MembersV2InStatusResp> members) {
        this.members = members;
        return this;
    }

    
    public PoolsV2InStatusResp addMembersItem(MembersV2InStatusResp membersItem) {
        this.members.add(membersItem);
        return this;
    }

    public PoolsV2InStatusResp withMembers(Consumer<List<MembersV2InStatusResp>> membersSetter) {
        if(this.members == null ){
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 后端云服务器组关联的后端云服务器列表
     * @return members
     */
    public List<MembersV2InStatusResp> getMembers() {
        return members;
    }

    public void setMembers(List<MembersV2InStatusResp> members) {
        this.members = members;
    }

    public PoolsV2InStatusResp withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    


    /**
     * 后端云服务器组的操作状态；该字段为预留字段，暂未启用。默认为ONLINE。
     * @return operatingStatus
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public PoolsV2InStatusResp withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * 后端云服务器组的配置状态；该字段为预留字段，暂未启用。默认为ACTIVE。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public PoolsV2InStatusResp withHealthmonitor(HealthmonitorsV2InStatusResp healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public PoolsV2InStatusResp withHealthmonitor(Consumer<HealthmonitorsV2InStatusResp> healthmonitorSetter) {
        if(this.healthmonitor == null ){
            this.healthmonitor = new HealthmonitorsV2InStatusResp();
            healthmonitorSetter.accept(this.healthmonitor);
        }
        
        return this;
    }


    /**
     * Get healthmonitor
     * @return healthmonitor
     */
    public HealthmonitorsV2InStatusResp getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(HealthmonitorsV2InStatusResp healthmonitor) {
        this.healthmonitor = healthmonitor;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PoolsV2InStatusResp poolsV2InStatusResp = (PoolsV2InStatusResp) o;
        return Objects.equals(this.id, poolsV2InStatusResp.id) &&
            Objects.equals(this.name, poolsV2InStatusResp.name) &&
            Objects.equals(this.members, poolsV2InStatusResp.members) &&
            Objects.equals(this.operatingStatus, poolsV2InStatusResp.operatingStatus) &&
            Objects.equals(this.provisioningStatus, poolsV2InStatusResp.provisioningStatus) &&
            Objects.equals(this.healthmonitor, poolsV2InStatusResp.healthmonitor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, members, operatingStatus, provisioningStatus, healthmonitor);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolsV2InStatusResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
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

