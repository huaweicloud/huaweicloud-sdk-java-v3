package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建云服务器组请求返回对象
 */
public class Pool {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor_id")

    private String healthmonitorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_algorithm")

    private String lbAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<ListenerRef> listeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancers")

    private List<LoadBalancerRef> loadbalancers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<MemberRef> members = null;

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

    private SessionPersistence sessionPersistence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private String ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_start")

    private SlowStart slowStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_deletion_protection_enable")

    private Boolean memberDeletionProtectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护，默认值为nonProtection - consoleProtection: 控制台修改保护
     */
    public static final class ProtectionStatusEnum {

        /**
         * Enum NONPROTECTION for value: "nonProtection"
         */
        public static final ProtectionStatusEnum NONPROTECTION = new ProtectionStatusEnum("nonProtection");

        /**
         * Enum CONSOLEPROTECTION for value: "consoleProtection"
         */
        public static final ProtectionStatusEnum CONSOLEPROTECTION = new ProtectionStatusEnum("consoleProtection");

        private static final Map<String, ProtectionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectionStatusEnum> createStaticFields() {
            Map<String, ProtectionStatusEnum> map = new HashMap<>();
            map.put("nonProtection", NONPROTECTION);
            map.put("consoleProtection", CONSOLEPROTECTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectionStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtectionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectionStatusEnum(value));
        }

        public static ProtectionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectionStatusEnum) {
                return this.value.equals(((ProtectionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private ProtectionStatusEnum protectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_reason")

    private String protectionReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "any_port_enable")

    private Boolean anyPortEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_drain")

    private ConnectionDrain connectionDrain;

    public Pool withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 后端云服务器组的管理状态，只支持设置为true。  不支持该字段，请勿使用。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public Pool withDescription(String description) {
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

    public Pool withHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
        return this;
    }

    /**
     * 后端云服务器组关联的健康检查的ID。
     * @return healthmonitorId
     */
    public String getHealthmonitorId() {
        return healthmonitorId;
    }

    public void setHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
    }

    public Pool withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 后端云服务器组的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pool withLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    /**
     * 后端云服务器组的负载均衡算法。  取值： - ROUND_ROBIN：加权轮询算法。 - LEAST_CONNECTIONS：加权最少连接算法。 - SOURCE_IP：源IP算法。 - QUIC_CID：连接ID算法。  使用说明： - 当该字段的取值为SOURCE_IP时，后端云服务器组绑定的后端云服务器的weight字段无效。 - 只有pool的protocol为QUIC时，才支持QUIC_CID算法。  [不支持QUIC_CID算法。](tag:hws_eu,g42,hk_g42,hcso_dt)  [荷兰region不支持QUIC_CID。](tag:dt,dt_test)
     * @return lbAlgorithm
     */
    public String getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    public Pool withListeners(List<ListenerRef> listeners) {
        this.listeners = listeners;
        return this;
    }

    public Pool addListenersItem(ListenerRef listenersItem) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public Pool withListeners(Consumer<List<ListenerRef>> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * 后端云服务器组关联的监听器ID列表。
     * @return listeners
     */
    public List<ListenerRef> getListeners() {
        return listeners;
    }

    public void setListeners(List<ListenerRef> listeners) {
        this.listeners = listeners;
    }

    public Pool withLoadbalancers(List<LoadBalancerRef> loadbalancers) {
        this.loadbalancers = loadbalancers;
        return this;
    }

    public Pool addLoadbalancersItem(LoadBalancerRef loadbalancersItem) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        this.loadbalancers.add(loadbalancersItem);
        return this;
    }

    public Pool withLoadbalancers(Consumer<List<LoadBalancerRef>> loadbalancersSetter) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        loadbalancersSetter.accept(this.loadbalancers);
        return this;
    }

    /**
     * 后端云服务器组关联的负载均衡器ID列表。
     * @return loadbalancers
     */
    public List<LoadBalancerRef> getLoadbalancers() {
        return loadbalancers;
    }

    public void setLoadbalancers(List<LoadBalancerRef> loadbalancers) {
        this.loadbalancers = loadbalancers;
    }

    public Pool withMembers(List<MemberRef> members) {
        this.members = members;
        return this;
    }

    public Pool addMembersItem(MemberRef membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public Pool withMembers(Consumer<List<MemberRef>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 后端云服务器组中的后端云服务器ID列表。
     * @return members
     */
    public List<MemberRef> getMembers() {
        return members;
    }

    public void setMembers(List<MemberRef> members) {
        this.members = members;
    }

    public Pool withName(String name) {
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

    public Pool withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 后端云服务器组所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Pool withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 后端云服务器组的后端协议。  取值：TCP、UDP、HTTP、HTTPS、QUIC和TCPSSL。  使用说明： - listener的protocol为UDP时，pool的protocol必须为UDP或QUIC； - listener的protocol为TCP时pool的protocol必须为TCP； - listener的protocol为HTTP时，pool的protocol必须为HTTP。 - listener的protocol为HTTPS时，pool的protocol必须为HTTP或HTTPS。 - listener的protocol为TERMINATED_HTTPS时，pool的protocol必须为HTTP。 - 若pool的protocol为QUIC，则必须开启session_persistence且type为SOURCE_IP。  [不支持QUIC。](tag:tm,hws_eu,g42,hk_g42,hcso_dt)  [荷兰region不支持QUIC。](tag:dt,dt_test)
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Pool withSessionPersistence(SessionPersistence sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
        return this;
    }

    public Pool withSessionPersistence(Consumer<SessionPersistence> sessionPersistenceSetter) {
        if (this.sessionPersistence == null) {
            this.sessionPersistence = new SessionPersistence();
            sessionPersistenceSetter.accept(this.sessionPersistence);
        }

        return this;
    }

    /**
     * Get sessionPersistence
     * @return sessionPersistence
     */
    public SessionPersistence getSessionPersistence() {
        return sessionPersistence;
    }

    public void setSessionPersistence(SessionPersistence sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
    }

    public Pool withIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * 后端云服务器组支持的IP版本。  [取值： - 共享型：固定为v4； -  独享型：取值dualstack、v4、v6。当协议为TCP/UDP时，ip_version为dualstack，表示双栈。  当协议为HTTP时，ip_version为v4。 ](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,fcs)  [取值：dualstack、v4、v6。当协议为TCP/UDP时，ip_version为dualstack，表示双栈。 当协议为HTTP时，ip_version为v4。](tag:hcso_dt)  [不支持IPv6，只会返回v4。](tag:dt,dt_test)
     * @return ipVersion
     */
    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    public Pool withSlowStart(SlowStart slowStart) {
        this.slowStart = slowStart;
        return this;
    }

    public Pool withSlowStart(Consumer<SlowStart> slowStartSetter) {
        if (this.slowStart == null) {
            this.slowStart = new SlowStart();
            slowStartSetter.accept(this.slowStart);
        }

        return this;
    }

    /**
     * Get slowStart
     * @return slowStart
     */
    public SlowStart getSlowStart() {
        return slowStart;
    }

    public void setSlowStart(SlowStart slowStart) {
        this.slowStart = slowStart;
    }

    public Pool withMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
        return this;
    }

    /**
     * 是否开启误删保护。  取值：false不开启，true开启。  > 退场时需要先关闭所有资源的删除保护开关。  [不支持该字段，请勿使用。](tag:hws_eu,g42,hk_g42)  [荷兰region不支持该字段，请勿使用。](tag:dt)
     * @return memberDeletionProtectionEnable
     */
    public Boolean getMemberDeletionProtectionEnable() {
        return memberDeletionProtectionEnable;
    }

    public void setMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
    }

    public Pool withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC时区。  [注意：独享型实例的历史数据以及共享型实例下的资源，不返回该字段。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,fcs,dt,hk_tm)
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Pool withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC时区。  [注意：独享型实例的历史数据以及共享型实例下的资源，不返回该字段。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,fcs,dt,hk_tm)
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Pool withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 后端云服务器组关联的虚拟私有云的ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Pool withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 后端服务器组的类型。  取值： - instance：允许任意类型的后端，type指定为该类型时，vpc_id是必选字段。 - ip：只能添加跨VPC后端，type指定为该类型时，vpc_id不允许指定。 - 空字符串（\"\"）：允许任意类型的后端
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pool withProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护，默认值为nonProtection - consoleProtection: 控制台修改保护
     * @return protectionStatus
     */
    public ProtectionStatusEnum getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public Pool withProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    /**
     * 设置保护的原因 >仅当protection_status为consoleProtection时有效。
     * @return protectionReason
     */
    public String getProtectionReason() {
        return protectionReason;
    }

    public void setProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
    }

    public Pool withAnyPortEnable(Boolean anyPortEnable) {
        this.anyPortEnable = anyPortEnable;
        return this;
    }

    /**
     * 后端是否开启端口透传，开启后，后端服务器端口与前端监听器端口保持一致。取值：false不开启，true开启，默认false。 > 关闭端口透传后，请求会转发给后端服务器protocol_port字段指定端口。
     * @return anyPortEnable
     */
    public Boolean getAnyPortEnable() {
        return anyPortEnable;
    }

    public void setAnyPortEnable(Boolean anyPortEnable) {
        this.anyPortEnable = anyPortEnable;
    }

    public Pool withConnectionDrain(ConnectionDrain connectionDrain) {
        this.connectionDrain = connectionDrain;
        return this;
    }

    public Pool withConnectionDrain(Consumer<ConnectionDrain> connectionDrainSetter) {
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
        Pool that = (Pool) obj;
        return Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.healthmonitorId, that.healthmonitorId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.lbAlgorithm, that.lbAlgorithm) && Objects.equals(this.listeners, that.listeners)
            && Objects.equals(this.loadbalancers, that.loadbalancers) && Objects.equals(this.members, that.members)
            && Objects.equals(this.name, that.name) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.sessionPersistence, that.sessionPersistence)
            && Objects.equals(this.ipVersion, that.ipVersion) && Objects.equals(this.slowStart, that.slowStart)
            && Objects.equals(this.memberDeletionProtectionEnable, that.memberDeletionProtectionEnable)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason)
            && Objects.equals(this.anyPortEnable, that.anyPortEnable)
            && Objects.equals(this.connectionDrain, that.connectionDrain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            description,
            healthmonitorId,
            id,
            lbAlgorithm,
            listeners,
            loadbalancers,
            members,
            name,
            projectId,
            protocol,
            sessionPersistence,
            ipVersion,
            slowStart,
            memberDeletionProtectionEnable,
            createdAt,
            updatedAt,
            vpcId,
            type,
            protectionStatus,
            protectionReason,
            anyPortEnable,
            connectionDrain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pool {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    healthmonitorId: ").append(toIndentedString(healthmonitorId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    loadbalancers: ").append(toIndentedString(loadbalancers)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sessionPersistence: ").append(toIndentedString(sessionPersistence)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    slowStart: ").append(toIndentedString(slowStart)).append("\n");
        sb.append("    memberDeletionProtectionEnable: ")
            .append(toIndentedString(memberDeletionProtectionEnable))
            .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    protectionReason: ").append(toIndentedString(protectionReason)).append("\n");
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
