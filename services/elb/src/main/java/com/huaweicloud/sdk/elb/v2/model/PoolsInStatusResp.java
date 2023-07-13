package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 后端云服务器对象列表，用于状态树中
 */
public class PoolsInStatusResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<MembersInStatusResp> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private String operatingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor")

    private HealthmonitorsInStatusResp healthmonitor;

    public PoolsInStatusResp withId(String id) {
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

    public PoolsInStatusResp withName(String name) {
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

    public PoolsInStatusResp withMembers(List<MembersInStatusResp> members) {
        this.members = members;
        return this;
    }

    public PoolsInStatusResp addMembersItem(MembersInStatusResp membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public PoolsInStatusResp withMembers(Consumer<List<MembersInStatusResp>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 后端云服务器组关联的后端云服务器列表
     * @return members
     */
    public List<MembersInStatusResp> getMembers() {
        return members;
    }

    public void setMembers(List<MembersInStatusResp> members) {
        this.members = members;
    }

    public PoolsInStatusResp withOperatingStatus(String operatingStatus) {
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

    public PoolsInStatusResp withProvisioningStatus(String provisioningStatus) {
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

    public PoolsInStatusResp withHealthmonitor(HealthmonitorsInStatusResp healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public PoolsInStatusResp withHealthmonitor(Consumer<HealthmonitorsInStatusResp> healthmonitorSetter) {
        if (this.healthmonitor == null) {
            this.healthmonitor = new HealthmonitorsInStatusResp();
            healthmonitorSetter.accept(this.healthmonitor);
        }

        return this;
    }

    /**
     * Get healthmonitor
     * @return healthmonitor
     */
    public HealthmonitorsInStatusResp getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(HealthmonitorsInStatusResp healthmonitor) {
        this.healthmonitor = healthmonitor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolsInStatusResp that = (PoolsInStatusResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.members, that.members) && Objects.equals(this.operatingStatus, that.operatingStatus)
            && Objects.equals(this.provisioningStatus, that.provisioningStatus)
            && Objects.equals(this.healthmonitor, that.healthmonitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, members, operatingStatus, provisioningStatus, healthmonitor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolsInStatusResp {\n");
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
