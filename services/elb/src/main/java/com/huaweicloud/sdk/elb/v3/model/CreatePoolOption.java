package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreatePoolOption
 */
public class CreatePoolOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_affinity")

    private AzAffinity azAffinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_algorithm")

    private String lbAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

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
    @JsonProperty(value = "slow_start")

    private CreatePoolSlowStartOption slowStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_deletion_protection_enable")

    private Boolean memberDeletionProtectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private String ipVersion;

    /**
     * **参数解释**：修改保护状态。  **约束限制**：不涉及  **取值范围**： - nonProtection: 不保护，默认值为nonProtection - consoleProtection: 控制台修改保护   **默认取值**：不涉及
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_health")

    private PoolHealth poolHealth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quic_cid_hash_strategy")

    private QuicCidHashStrategy quicCidHashStrategy;

    public CreatePoolOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * **参数解释**：后端服务器组的管理状态。  **约束限制**：只支持设置为true。  **取值范围**：true  **默认取值**：true  [不支持该字段，请勿使用。](tag:dt,hcso_dt)
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreatePoolOption withAzAffinity(AzAffinity azAffinity) {
        this.azAffinity = azAffinity;
        return this;
    }

    public CreatePoolOption withAzAffinity(Consumer<AzAffinity> azAffinitySetter) {
        if (this.azAffinity == null) {
            this.azAffinity = new AzAffinity();
            azAffinitySetter.accept(this.azAffinity);
        }

        return this;
    }

    /**
     * Get azAffinity
     * @return azAffinity
     */
    public AzAffinity getAzAffinity() {
        return azAffinity;
    }

    public void setAzAffinity(AzAffinity azAffinity) {
        this.azAffinity = azAffinity;
    }

    public CreatePoolOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：后端服务器组的描述信息。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
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
     * **参数解释**：后端服务器组的负载均衡算法。  **约束限制**： - 当该字段的取值为SOURCE_IP或QUIC_CID时，后端服务器组绑定的后端服务器的weight字段无效。 - 只有pool的protocol为QUIC时，才支持QUIC_CID算法。 [- 不支持QUIC_CID。](tag:tm,hws_eu,g42,hk_g42,hcso_dt)  **取值范围**： - ROUND_ROBIN：加权轮询算法。 - LEAST_CONNECTIONS：加权最少连接算法。 - SOURCE_IP：源IP算法。 - QUIC_CID：连接ID算法。 [- 2_TUPLE_HASH：二元组hash算法，仅IP类型的pool支持。 - 3_TUPLE_HASH：三元组hash算法，仅IP类型的pool支持。 - 5_TUPLE_HASH：五元组hash算法，仅IP类型的pool支持。 - IP型pool不指定该字段时，默认设置为5_TUPLE_HASH。](tag:hws_eu)  **默认取值**：不涉及  [荷兰region不支持QUIC_CID。](tag:dt)
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
     * **参数解释**：后端服务器组关联的监听器的ID。  **约束限制**： - listener_id，loadbalancer_id，type至少指定一个。 [- 独享型实例的后端服务器组loadbalancer_id和listener_id可以都不指定，但共享型实例至少指定一个。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt,hk_tm)  **取值范围**：不涉及  **默认取值**：不涉及
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
     * **参数解释**：后端服务器组关联的负载均衡器ID。  **约束限制**： - listener_id，loadbalancer_id，type至少指定一个。 [- 独享型实例的后端服务器组loadbalancer_id和listener_id可以都不指定，但共享型实例至少指定一个。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt,hk_tm)  **取值范围**：不涉及  **默认取值**：不涉及
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
     * **参数解释**：后端服务器组的名称。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
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
     * **参数解释**：后端服务器组所属的项目ID。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
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
     * **参数解释**：后端服务器组的后端协议。  **约束限制**： - listener的protocol为UDP时，pool的protocol必须为UDP或QUIC。 - listener的protocol为TCP时pool的protocol必须为TCP。 [- listener的protocol为IP时，pool的protocol必须为IP。](tag:hws_eu) - listener的protocol为HTTP时，pool的protocol必须为HTTP。 - listener的protocol为HTTPS时，pool的protocol必须为HTTP、HTTPS或GRPC。 - listener的protocol为TERMINATED_HTTPS时，pool的protocol必须为HTTP。 - listener的protocol为QUIC时，pool的protocol必须为HTTP、HTTPS或GRPC。 - listener的protocol为TLS时，pool的protocol必须为TLS或TCP（且只能使用ip_version为v4的TCP pool）。 - 若pool的protocol为QUIC，则必须开启session_persistence且type为SOURCE_IP。 - 若pool的protocol为GRPC，关联监听器的http2_enable必须为true。 [- 不支持QUIC。](tag:tm,hws_eu,g42,hk_g42,hcso_dt)  **取值范围**：TCP、UDP、[IP、](tag:hws_eu)TLS、GRPC、HTTP、HTTPS和QUIC。  **默认取值**：不涉及  [荷兰region不支持QUIC。](tag:dt)
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
     * **参数解释**：是否开启后端服务器移除保护。开关开启后，不允许从该ELB后端服务器组下移除后端服务器。  **约束限制**： - 开关开启后，移除member会报错拦截，涉及如下API:   + 级联删除负载均衡器（DELETE /v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/force-elb）   + 级联删除负载均衡器及关联EIP（POST /v3/{project_id}/elb/loadbalancers/{loadbalancer_id}/delete-cascade）   + 级联删除监听器（DELETE /v3/{project_id}/elb/listeners/{listener_id}/force）   + 级联删除后端服务器组（DELETE /v3/{project_id}/elb/pools/{pool_id}/delete-cascade）   + 删除后端服务器（DELETE /v3/{project_id}/elb/pools/{pool_id}/members/{member_id}）   + 批量删除后端服务器（POST /v3/{project_id}/elb/pools/{pool_id}/members/batch-delete）  **取值范围**：false 不开启，true 开启。  **默认取值**：false  > 退场时需要先关闭所有资源的删除保护开关。  [不支持该字段，请勿使用。](tag:hws_eu,g42,hk_g42)  [荷兰region不支持该字段，请勿使用。](tag:dt)
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
     * **参数解释**：后端服务器组关联的虚拟私有云的ID。  **约束限制**： - 只能挂载到该虚拟私有云下。 - 只能添加该虚拟私有云下的后端服务器或跨VPC的后端服务器。 - type必须指定为instance。 [- pool的protocol为IP时，必须指定vpc_id，且与LB的vpc_id相同。](tag:hws_eu) - 若未指定vpc_id，则后续添加后端服务器时，vpc_id由后端服务器所在的虚拟私有云确定。  **取值范围**：不涉及  **默认取值**：不涉及
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
     * **参数解释**：后端服务器组的类型。  **约束限制**： - 不传表示允许任意类型的后端，并返回type为空字符串。 - listener_id，loadbalancer_id，type至少指定一个。 [- 独享型实例的后端服务器组loadbalancer_id和listener_id可以都不指定，但共享型实例至少指定一个。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt,hk_tm)  **取值范围**： - instance：允许任意类型的后端，type指定为该类型时，vpc_id是必选字段。 - ip：只能添加IP类型后端，type指定为该类型时，vpc_id不允许指定。[pool的protocol为IP时，type不允许设置为ip。](tag:hws_eu)]  **默认取值**：不涉及
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreatePoolOption withIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * **参数解释**：后端服务器组支持的IP版本。  **约束限制**：不涉及  [**取值范围**： - 共享型：固定为v4； - 独享型：取值dualstack、v4。当协议为TCP/UDP时，ip_version为dualstack，表示双栈。当协议为HTTP时，ip_version为v4。 ](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs)  [**取值范围**：dualstack、v4。当协议为TCP/UDP时，ip_version为dualstack，表示双栈。当协议为HTTP时，ip_version为v4。](tag:hcso_dt)  **默认取值**：不涉及  [不支持IPv6，只会返回v4。](tag:dt)
     * @return ipVersion
     */
    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    public CreatePoolOption withProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * **参数解释**：修改保护状态。  **约束限制**：不涉及  **取值范围**： - nonProtection: 不保护，默认值为nonProtection - consoleProtection: 控制台修改保护   **默认取值**：不涉及
     * @return protectionStatus
     */
    public ProtectionStatusEnum getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public CreatePoolOption withProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    /**
     * **参数解释**：设置保护的原因。作为protection_status的转态设置的原因。  **约束限制**：仅当protection_status为consoleProtection时有效。  **取值范围**：除'<'和'>'外通用Unicode字符集字符，最大255个字符。  **默认取值**：不涉及
     * @return protectionReason
     */
    public String getProtectionReason() {
        return protectionReason;
    }

    public void setProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
    }

    public CreatePoolOption withAnyPortEnable(Boolean anyPortEnable) {
        this.anyPortEnable = anyPortEnable;
        return this;
    }

    /**
     * **参数解释**：后端是否开启全端口转发。开启后，后端服务器端口与前端监听器端口保持一致。关闭后，请求会转发给后端服务器protocol_port字段指定端口。  **约束限制**： - 仅QUIC,TCP,UDP的pool支持。  **取值范围**：false 不开启，true 开启。  **默认取值**：不涉及
     * @return anyPortEnable
     */
    public Boolean getAnyPortEnable() {
        return anyPortEnable;
    }

    public void setAnyPortEnable(Boolean anyPortEnable) {
        this.anyPortEnable = anyPortEnable;
    }

    public CreatePoolOption withConnectionDrain(ConnectionDrain connectionDrain) {
        this.connectionDrain = connectionDrain;
        return this;
    }

    public CreatePoolOption withConnectionDrain(Consumer<ConnectionDrain> connectionDrainSetter) {
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

    public CreatePoolOption withPoolHealth(PoolHealth poolHealth) {
        this.poolHealth = poolHealth;
        return this;
    }

    public CreatePoolOption withPoolHealth(Consumer<PoolHealth> poolHealthSetter) {
        if (this.poolHealth == null) {
            this.poolHealth = new PoolHealth();
            poolHealthSetter.accept(this.poolHealth);
        }

        return this;
    }

    /**
     * Get poolHealth
     * @return poolHealth
     */
    public PoolHealth getPoolHealth() {
        return poolHealth;
    }

    public void setPoolHealth(PoolHealth poolHealth) {
        this.poolHealth = poolHealth;
    }

    public CreatePoolOption withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * **参数解释**：公网边界组。  **约束限制**：不涉及  **取值范围**： - center：表示中心站点的公网边界组 - 边缘站点名称：表示边缘站点的公网边界组  **默认取值**：不涉及
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public CreatePoolOption withQuicCidHashStrategy(QuicCidHashStrategy quicCidHashStrategy) {
        this.quicCidHashStrategy = quicCidHashStrategy;
        return this;
    }

    public CreatePoolOption withQuicCidHashStrategy(Consumer<QuicCidHashStrategy> quicCidHashStrategySetter) {
        if (this.quicCidHashStrategy == null) {
            this.quicCidHashStrategy = new QuicCidHashStrategy();
            quicCidHashStrategySetter.accept(this.quicCidHashStrategy);
        }

        return this;
    }

    /**
     * Get quicCidHashStrategy
     * @return quicCidHashStrategy
     */
    public QuicCidHashStrategy getQuicCidHashStrategy() {
        return quicCidHashStrategy;
    }

    public void setQuicCidHashStrategy(QuicCidHashStrategy quicCidHashStrategy) {
        this.quicCidHashStrategy = quicCidHashStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePoolOption that = (CreatePoolOption) obj;
        return Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.azAffinity, that.azAffinity)
            && Objects.equals(this.description, that.description) && Objects.equals(this.lbAlgorithm, that.lbAlgorithm)
            && Objects.equals(this.listenerId, that.listenerId)
            && Objects.equals(this.loadbalancerId, that.loadbalancerId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.sessionPersistence, that.sessionPersistence)
            && Objects.equals(this.slowStart, that.slowStart)
            && Objects.equals(this.memberDeletionProtectionEnable, that.memberDeletionProtectionEnable)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason)
            && Objects.equals(this.anyPortEnable, that.anyPortEnable)
            && Objects.equals(this.connectionDrain, that.connectionDrain)
            && Objects.equals(this.poolHealth, that.poolHealth)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.quicCidHashStrategy, that.quicCidHashStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            azAffinity,
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
            type,
            ipVersion,
            protectionStatus,
            protectionReason,
            anyPortEnable,
            connectionDrain,
            poolHealth,
            publicBorderGroup,
            quicCidHashStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    azAffinity: ").append(toIndentedString(azAffinity)).append("\n");
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
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    protectionReason: ").append(toIndentedString(protectionReason)).append("\n");
        sb.append("    anyPortEnable: ").append(toIndentedString(anyPortEnable)).append("\n");
        sb.append("    connectionDrain: ").append(toIndentedString(connectionDrain)).append("\n");
        sb.append("    poolHealth: ").append(toIndentedString(poolHealth)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    quicCidHashStrategy: ").append(toIndentedString(quicCidHashStrategy)).append("\n");
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
