package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchMember
 */
public class BatchMember {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr_id")

    private String subnetCidrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private String operatingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private MemberHealthCheckFailedReason reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<MemberStatus> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_type")

    private String memberType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_status")

    private String retStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public BatchMember withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：后端服务器ID。  **取值范围**：不涉及  > 此处并非ECS服务器的ID，而是ELB为绑定的后端服务器自动生成的member ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchMember withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：后端服务器名称。  **取值范围**：不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchMember withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：后端服务器所在的项目ID。  **取值范围**：不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BatchMember withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * **参数解释**：后端服务器的管理状态。  **取值范围**：true、false。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public BatchMember withSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
        return this;
    }

    /**
     * **参数解释**：后端服务器所在的子网，可以是IPv4或IPv6子网。若是IPv4子网，使用对应子网的子网ID（neutron_subnet_id）；若是IPv6子网，使用对应子网的网络ID（neutron_network_id）。 ipv4子网的子网ID可以通过GET https://{VPC_Endpoint}/v1/{project_id}/subnets 响应参数中的neutron_subnet_id得到 ipv6子网的网络ID可以通过GET https://{VPC_Endpoint}/v1/{project_id}/subnets 响应参数中的neutron_network_id得到  **取值范围**：不涉及  [不支持IPv6，请勿设置为IPv6子网ID。](tag:dt)
     * @return subnetCidrId
     */
    public String getSubnetCidrId() {
        return subnetCidrId;
    }

    public void setSubnetCidrId(String subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
    }

    public BatchMember withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * **参数解释**：后端服务器业务端口。  **取值范围**：不涉及  >在开启端口透传的pool下创建member传该字段不生效，可不传该字段。
     * minimum: 1
     * maximum: 65535
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    public BatchMember withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释**：后端服务器的权重，请求将根据pool配置的负载均衡算法和后端服务器的权重进行负载分发。权重值越大，分发的请求越多。权重为0的后端不再接受新的请求。  **取值范围**：0-100  **取值范围**：不涉及
     * minimum: 0
     * maximum: 100
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public BatchMember withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * **参数解释**：后端服务器对应的IP地址。  **取值范围**：不涉及  [不支持IPv6，请勿设置为IPv6地址。](tag:dt)
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BatchMember withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    /**
     * **参数解释**：后端服务器的健康状态。  **取值范围**： - NO_MONITOR：后端服务器所在的服务器组没有开启健康检查。 - INITIAL：初始化中，表示负载均衡实例配置了健康检查，但查不到数据。 - ONLINE：后端服务器正常。 - OFFLINE：后端服务器关联的ECS服务器不存在或已关机。 - UNKNOWN：未关联LB实例的pool下的member，或者创建后从未关联ECS的云服务器类型member，状态置为UNKNOWN。
     * @return operatingStatus
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public BatchMember withReason(MemberHealthCheckFailedReason reason) {
        this.reason = reason;
        return this;
    }

    public BatchMember withReason(Consumer<MemberHealthCheckFailedReason> reasonSetter) {
        if (this.reason == null) {
            this.reason = new MemberHealthCheckFailedReason();
            reasonSetter.accept(this.reason);
        }

        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    public MemberHealthCheckFailedReason getReason() {
        return reason;
    }

    public void setReason(MemberHealthCheckFailedReason reason) {
        this.reason = reason;
    }

    public BatchMember withStatus(List<MemberStatus> status) {
        this.status = status;
        return this;
    }

    public BatchMember addStatusItem(MemberStatus statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public BatchMember withStatus(Consumer<List<MemberStatus>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * **参数解释**：后端服务器监听器粒度的的健康状态。 若绑定的监听器在该字段中，则以该字段中监听器对应的operating_status为准。 若绑定的监听器不在该字段中，则以外层的operating_status为准。
     * @return status
     */
    public List<MemberStatus> getStatus() {
        return status;
    }

    public void setStatus(List<MemberStatus> status) {
        this.status = status;
    }

    public BatchMember withMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * **参数解释**：后端服务器的类型。  **取值范围**： - ip：跨VPC的member。 - instance：关联到ECS的member。
     * @return memberType
     */
    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public BatchMember withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：member关联的实例ID，空表示跨VPC场景的member。  **取值范围**：不涉及
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BatchMember withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * **参数解释**：IP地址对应的VPC port ID  **取值范围**：不涉及
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public BatchMember withRetStatus(String retStatus) {
        this.retStatus = retStatus;
        return this;
    }

    /**
     * **参数解释**：当前后端服务器创建结果状态。  **取值范围**： - successful：添加成功。 - existed：member已存在。
     * @return retStatus
     */
    public String getRetStatus() {
        return retStatus;
    }

    public void setRetStatus(String retStatus) {
        this.retStatus = retStatus;
    }

    public BatchMember withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**：创建时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC时区。  **取值范围**：不涉及  [注意：独享型实例的历史数据以及共享型实例下的资源，不返回该字段。](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt,hk_tm)
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public BatchMember withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**：更新时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC时区。  **取值范围**：不涉及  [注意：独享型实例的历史数据以及共享型实例下的资源，不返回该字段。](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt,hk_tm)
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchMember that = (BatchMember) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.subnetCidrId, that.subnetCidrId)
            && Objects.equals(this.protocolPort, that.protocolPort) && Objects.equals(this.weight, that.weight)
            && Objects.equals(this.address, that.address) && Objects.equals(this.operatingStatus, that.operatingStatus)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.status, that.status)
            && Objects.equals(this.memberType, that.memberType) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.portId, that.portId) && Objects.equals(this.retStatus, that.retStatus)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            projectId,
            adminStateUp,
            subnetCidrId,
            protocolPort,
            weight,
            address,
            operatingStatus,
            reason,
            status,
            memberType,
            instanceId,
            portId,
            retStatus,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchMember {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    subnetCidrId: ").append(toIndentedString(subnetCidrId)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    retStatus: ").append(toIndentedString(retStatus)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
