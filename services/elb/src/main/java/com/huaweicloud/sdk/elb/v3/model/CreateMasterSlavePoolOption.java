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
    @JsonProperty(value = "ip_version")

    private String ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<CreateMasterSlaveMemberOption> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor")

    private CreateMasterSlaveHealthMonitorOption healthmonitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "any_port_enable")

    private Boolean anyPortEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_drain")

    private ConnectionDrain connectionDrain;

    public CreateMasterSlavePoolOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 后端服务器组的描述信息。
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
     * 后端服务器组的负载均衡算法。  取值： - ROUND_ROBIN：加权轮询算法。 - LEAST_CONNECTIONS：加权最少连接算法。 - SOURCE_IP：源IP算法。 - QUIC_CID：连接ID算法。  [不支持QUIC_CID。](tag:tm,hws_eu,g42,hk_g42,hcso_dt)  [荷兰region不支持QUIC_CID。](tag:dt,dt_test)
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
     * 后端服务器组关联的LB的ID。  使用说明：listener_id，loadbalancer_id，type至少指定一个。
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
     * 后端服务器组关联的监听器的ID。  使用说明：listener_id，loadbalancer_id，type至少指定一个。
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
     * 后端服务器组的名称。
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
     * 后端服务器组所属的项目ID。
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
     * 后端服务器组的后端协议。  取值：TCP、UDP、QUIC、TLS。  使用说明： - listener的protocol为UDP时，pool的protocol必须为UDP或QUIC。 - listener的protocol为TCP时，pool的protocol必须为TCP。 - listener的protocol为TLS时，pool的protocol必须为TLS或TCP（且只能使用ip_version为v4的TCP pool）。 - 其他协议监听器不支持主备后端服务器组。  [不支持QUIC。](tag:tm,hws_eu,g42,hk_g42,hcso_dt)  [荷兰region不支持QUIC。](tag:dt,dt_test)
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
     * 后端服务器组关联的虚拟私有云的ID。  指定了vpc_id的约束： - 只能挂载到该虚拟私有云下。 - 只能添加该虚拟私有云下的后端服务器或跨VPC的后端服务器。 - type必须指定为instance。  没有指定vpc_id的约束： - 后续添加后端服务器时，vpc_id由后端服务器所在的虚拟私有云确定。
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
     * 后端服务器组的类型。  取值： - instance：允许任意类型的后端，type指定为该类型时，vpc_id是必选字段。 - ip：只能添加跨VPC后端，type指定为该类型时，vpc_id不允许指定。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateMasterSlavePoolOption withIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * 后端服务器组支持的IP版本。  [取值： - 共享型：固定为v4； -  独享型：取值dualstack、v4、v6。当协议为TCP/UDP时，ip_version为dualstack，表示双栈。  当协议为HTTP时，ip_version为v4。 ](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,fcs)  [取值：dualstack、v4、v6。当协议为TCP/UDP时，ip_version为dualstack，表示双栈。 当协议为HTTP时，ip_version为v4。](tag:hcso_dt)  [不支持IPv6，只会返回v4。](tag:dt,dt_test)
     * @return ipVersion
     */
    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
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
     * 主备主机组的后端服务器。 只能添加2个后端服务器，必须有一个为主，一个为备。
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

    public CreateMasterSlavePoolOption withAnyPortEnable(Boolean anyPortEnable) {
        this.anyPortEnable = anyPortEnable;
        return this;
    }

    /**
     * 后端是否开启端口透传。开启后，后端服务器端口与前端监听器端口保持一致。关闭后，请求会转发给后端服务器protocol_port字段指定端口。取值：false不开启，true开启。  使用说明： - 仅QUIC,TCP,UDP的pool支持。
     * @return anyPortEnable
     */
    public Boolean getAnyPortEnable() {
        return anyPortEnable;
    }

    public void setAnyPortEnable(Boolean anyPortEnable) {
        this.anyPortEnable = anyPortEnable;
    }

    public CreateMasterSlavePoolOption withConnectionDrain(ConnectionDrain connectionDrain) {
        this.connectionDrain = connectionDrain;
        return this;
    }

    public CreateMasterSlavePoolOption withConnectionDrain(Consumer<ConnectionDrain> connectionDrainSetter) {
        if (this.connectionDrain == null) {
            this.connectionDrain = new ConnectionDrain();
            connectionDrainSetter.accept(this.connectionDrain);
        }

        return this;
    }

    /**
     * Get connectionDrain
     * @return connectionDrain
     */
    public ConnectionDrain getConnectionDrain() {
        return connectionDrain;
    }

    public void setConnectionDrain(ConnectionDrain connectionDrain) {
        this.connectionDrain = connectionDrain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMasterSlavePoolOption that = (CreateMasterSlavePoolOption) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.lbAlgorithm, that.lbAlgorithm)
            && Objects.equals(this.loadbalancerId, that.loadbalancerId)
            && Objects.equals(this.listenerId, that.listenerId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.sessionPersistence, that.sessionPersistence)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.ipVersion, that.ipVersion) && Objects.equals(this.members, that.members)
            && Objects.equals(this.healthmonitor, that.healthmonitor)
            && Objects.equals(this.anyPortEnable, that.anyPortEnable)
            && Objects.equals(this.connectionDrain, that.connectionDrain);
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
            ipVersion,
            members,
            healthmonitor,
            anyPortEnable,
            connectionDrain);
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
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
        sb.append("    anyPortEnable: ").append(toIndentedString(anyPortEnable)).append("\n");
        sb.append("    connectionDrain: ").append(toIndentedString(connectionDrain)).append("\n");
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
