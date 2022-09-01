package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建主机组请求
 */
public class CreatePoolOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    @JacksonXmlProperty(localName = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_algorithm")

    @JacksonXmlProperty(localName = "lb_algorithm")

    private String lbAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    @JacksonXmlProperty(localName = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    @JacksonXmlProperty(localName = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    @JacksonXmlProperty(localName = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_persistence")

    @JacksonXmlProperty(localName = "session_persistence")

    private CreatePoolSessionPersistenceOption sessionPersistence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_start")

    @JacksonXmlProperty(localName = "slow_start")

    private CreatePoolSlowStartOption slowStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_deletion_protection_enable")

    @JacksonXmlProperty(localName = "member_deletion_protection_enable")

    private Boolean memberDeletionProtectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    @JacksonXmlProperty(localName = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    public CreatePoolOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 后端云服务器组的管理状态，只支持更新为true。  不支持该字段，请勿使用。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreatePoolOption withDescription(String description) {
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

    public CreatePoolOption withLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    /**
     * 后端云服务器组的负载均衡算法。  取值： - ROUND_ROBIN：加权轮询算法。 - LEAST_CONNECTIONS：加权最少连接算法。 - SOURCE_IP：源IP算法。 - QUIC_CID：连接ID算法。   使用说明： - 当该字段的取值为SOURCE_IP时，后端云服务器组绑定的后端云服务器的weight字段无效。 - 只有pool的protocol为QUIC时，才支持QUIC_CID算法。
     * @return lbAlgorithm
     */
    public String getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    public CreatePoolOption withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 后端云服务器组关联的监听器的ID。   使用说明：listener_id，loadbalancer_id，type至少指定一个。共享型实例只能使用指定loadbalancer_id或指定listener_id的后端服务器组。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public CreatePoolOption withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * 后端云服务器组关联的负载均衡器ID。   使用说明：listener_id，loadbalancer_id，type中至少指定一个。共享型实例只能使用指定loadbalancer_id或指定listener_id的后端服务器组。
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public CreatePoolOption withName(String name) {
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

    public CreatePoolOption withProjectId(String projectId) {
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

    public CreatePoolOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 后端云服务器组的后端协议。  取值：TCP、UDP、HTTP、HTTPS和QUIC。   使用说明： - listener的protocol为UDP时，pool的protocol必须为UDP或QUIC； - listener的protocol为TCP时pool的protocol必须为TCP； - listener的protocol为HTTP时，pool的protocol必须为HTTP。 - listener的protocol为HTTPS时，pool的protocol必须为HTTP或HTTPS。 - listener的protocol为TERMINATED_HTTPS时，pool的protocol必须为HTTP。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public CreatePoolOption withSessionPersistence(CreatePoolSessionPersistenceOption sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
        return this;
    }

    public CreatePoolOption withSessionPersistence(
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

    public CreatePoolOption withSlowStart(CreatePoolSlowStartOption slowStart) {
        this.slowStart = slowStart;
        return this;
    }

    public CreatePoolOption withSlowStart(Consumer<CreatePoolSlowStartOption> slowStartSetter) {
        if (this.slowStart == null) {
            this.slowStart = new CreatePoolSlowStartOption();
            slowStartSetter.accept(this.slowStart);
        }

        return this;
    }

    /**
     * Get slowStart
     * @return slowStart
     */
    public CreatePoolSlowStartOption getSlowStart() {
        return slowStart;
    }

    public void setSlowStart(CreatePoolSlowStartOption slowStart) {
        this.slowStart = slowStart;
    }

    public CreatePoolOption withMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
        return this;
    }

    /**
     * 是否开启删除保护。取值：false不开启，true开启，默认false。 > 退场时需要先关闭所有资源的删除保护开关。
     * @return memberDeletionProtectionEnable
     */
    public Boolean getMemberDeletionProtectionEnable() {
        return memberDeletionProtectionEnable;
    }

    public void setMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
    }

    public CreatePoolOption withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 后端云服务器组关联的虚拟私有云的ID。   使用说明： - 只能挂载到该虚拟私有云下。 - 只能添加该虚拟私有云下的后端服务器或跨VPC的后端服务器。 - type必须指定为instance。   没有指定vpc_id的约束： - 后续添加后端服务器时，vpc_id由后端服务器所在的虚拟私有云确定。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreatePoolOption withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 后端服务器组的类型。  取值： - instance：允许任意类型的后端，type指定为该类型时，vpc_id是必选字段。 - ip：只能添加跨VPC后端，type指定为该类型时，vpc_id不允许指定。  使用说明： - 不传表示允许任意类型的后端，并返回type为空字符串。 - listener_id，loadbalancer_id，type至少指定一个。共享型实例只能使用指定loadbalancer_id或指定listener_id的后端服务器组。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePoolOption createPoolOption = (CreatePoolOption) o;
        return Objects.equals(this.adminStateUp, createPoolOption.adminStateUp)
            && Objects.equals(this.description, createPoolOption.description)
            && Objects.equals(this.lbAlgorithm, createPoolOption.lbAlgorithm)
            && Objects.equals(this.listenerId, createPoolOption.listenerId)
            && Objects.equals(this.loadbalancerId, createPoolOption.loadbalancerId)
            && Objects.equals(this.name, createPoolOption.name)
            && Objects.equals(this.projectId, createPoolOption.projectId)
            && Objects.equals(this.protocol, createPoolOption.protocol)
            && Objects.equals(this.sessionPersistence, createPoolOption.sessionPersistence)
            && Objects.equals(this.slowStart, createPoolOption.slowStart)
            && Objects.equals(this.memberDeletionProtectionEnable, createPoolOption.memberDeletionProtectionEnable)
            && Objects.equals(this.vpcId, createPoolOption.vpcId) && Objects.equals(this.type, createPoolOption.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            description,
            lbAlgorithm,
            listenerId,
            loadbalancerId,
            name,
            projectId,
            protocol,
            sessionPersistence,
            slowStart,
            memberDeletionProtectionEnable,
            vpcId,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sessionPersistence: ").append(toIndentedString(sessionPersistence)).append("\n");
        sb.append("    slowStart: ").append(toIndentedString(slowStart)).append("\n");
        sb.append("    memberDeletionProtectionEnable: ")
            .append(toIndentedString(memberDeletionProtectionEnable))
            .append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
