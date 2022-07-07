package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建主备主机组请求
 */
public class CreateMasterSlavePoolOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_algorithm")

    private String lbAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_persistence")

    private CreatePoolSessionPersistenceOption sessionPersistence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<CreateMasterSlaveMemberOption> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor")

    private CreateMasterSlaveHealthMonitorOption healthmonitor;

    public CreateMasterSlavePoolOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 后端云服务器组的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateMasterSlavePoolOption withLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    /**
     * 后端云服务器组的负载均衡算法。  取值： - ROUND_ROBIN：加权轮询算法。 - LEAST_CONNECTIONS：加权最少连接算法。 - SOURCE_IP：源IP算法。 - QUIC_CID：连接ID算法。
     * @return lbAlgorithm
     */
    public String getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    public CreateMasterSlavePoolOption withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * 后端云服务器组关联的LB的ID。  使用说明：listener_id，loadbalancer_id，type至少指定一个。
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public CreateMasterSlavePoolOption withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 后端云服务器组关联的监听器的ID。  使用说明：listener_id，loadbalancer_id，type至少指定一个。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public CreateMasterSlavePoolOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 后端云服务器组的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateMasterSlavePoolOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 后端云服务器组所属的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateMasterSlavePoolOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 后端云服务器组的后端协议。  取值：TCP、UDP、QUIC。  使用说明： - listener的protocol为UDP时，pool的protocol必须为UDP或QUIC。 - listener的protocol为TCP时pool的protocol必须为TCP。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public CreateMasterSlavePoolOption withSessionPersistence(CreatePoolSessionPersistenceOption sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
        return this;
    }

    public CreateMasterSlavePoolOption withSessionPersistence(
        Consumer<CreatePoolSessionPersistenceOption> sessionPersistenceSetter) {
        if (this.sessionPersistence == null) {
            this.sessionPersistence = new CreatePoolSessionPersistenceOption();
            sessionPersistenceSetter.accept(this.sessionPersistence);
        }

        return this;
    }

    /**
     * Get sessionPersistence
     * @return sessionPersistence
     */
    public CreatePoolSessionPersistenceOption getSessionPersistence() {
        return sessionPersistence;
    }

    public void setSessionPersistence(CreatePoolSessionPersistenceOption sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
    }

    public CreateMasterSlavePoolOption withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 后端云服务器组关联的虚拟私有云的ID。   指定了vpc_id的约束： - 只能挂载到该虚拟私有云下。 - 只能添加该虚拟私有云下的后端服务器或跨VPC的后端服务器。 - type必须指定为instance。   没有指定vpc_id的约束： - 后续添加后端服务器时，vpc_id由后端服务器所在的虚拟私有云确定。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateMasterSlavePoolOption withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 后端服务器组的类型。   取值：  - instance：允许任意类型的后端，type指定为该类型时，vpc_id是必选字段。  - ip：只能添加跨VPC后端，type指定为该类型时，vpc_id不允许指定。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateMasterSlavePoolOption withMembers(List<CreateMasterSlaveMemberOption> members) {
        this.members = members;
        return this;
    }

    public CreateMasterSlavePoolOption addMembersItem(CreateMasterSlaveMemberOption membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public CreateMasterSlavePoolOption withMembers(Consumer<List<CreateMasterSlaveMemberOption>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 主备主机组的后端服务器。 只能添加2个后端云服务器，必须有一个为主，一个为备。
     * @return members
     */
    public List<CreateMasterSlaveMemberOption> getMembers() {
        return members;
    }

    public void setMembers(List<CreateMasterSlaveMemberOption> members) {
        this.members = members;
    }

    public CreateMasterSlavePoolOption withHealthmonitor(CreateMasterSlaveHealthMonitorOption healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public CreateMasterSlavePoolOption withHealthmonitor(
        Consumer<CreateMasterSlaveHealthMonitorOption> healthmonitorSetter) {
        if (this.healthmonitor == null) {
            this.healthmonitor = new CreateMasterSlaveHealthMonitorOption();
            healthmonitorSetter.accept(this.healthmonitor);
        }

        return this;
    }

    /**
     * Get healthmonitor
     * @return healthmonitor
     */
    public CreateMasterSlaveHealthMonitorOption getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(CreateMasterSlaveHealthMonitorOption healthmonitor) {
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
        CreateMasterSlavePoolOption createMasterSlavePoolOption = (CreateMasterSlavePoolOption) o;
        return Objects.equals(this.description, createMasterSlavePoolOption.description)
            && Objects.equals(this.lbAlgorithm, createMasterSlavePoolOption.lbAlgorithm)
            && Objects.equals(this.loadbalancerId, createMasterSlavePoolOption.loadbalancerId)
            && Objects.equals(this.listenerId, createMasterSlavePoolOption.listenerId)
            && Objects.equals(this.name, createMasterSlavePoolOption.name)
            && Objects.equals(this.projectId, createMasterSlavePoolOption.projectId)
            && Objects.equals(this.protocol, createMasterSlavePoolOption.protocol)
            && Objects.equals(this.sessionPersistence, createMasterSlavePoolOption.sessionPersistence)
            && Objects.equals(this.vpcId, createMasterSlavePoolOption.vpcId)
            && Objects.equals(this.type, createMasterSlavePoolOption.type)
            && Objects.equals(this.members, createMasterSlavePoolOption.members)
            && Objects.equals(this.healthmonitor, createMasterSlavePoolOption.healthmonitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            lbAlgorithm,
            loadbalancerId,
            listenerId,
            name,
            projectId,
            protocol,
            sessionPersistence,
            vpcId,
            type,
            members,
            healthmonitor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMasterSlavePoolOption {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sessionPersistence: ").append(toIndentedString(sessionPersistence)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
