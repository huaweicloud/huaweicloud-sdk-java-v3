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
 * 更新后端服务器组请求参数。
 */
public class UpdatePoolOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_algorithm")

    private String lbAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_persistence")

    private UpdatePoolSessionPersistenceOption sessionPersistence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_start")

    private UpdatePoolSlowStartOption slowStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_deletion_protection_enable")

    private Boolean memberDeletionProtectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护 - consoleProtection: 控制台修改保护
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
    @JsonProperty(value = "quic_cid_hash_strategy")

    private QuicCidHashStrategy quicCidHashStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_affinity")

    private UpdateAzAffinity azAffinity;

    public UpdatePoolOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 后端服务器组的管理状态，只支持更新为true。  [不支持该字段，请勿使用。](tag:dt,hcso_dt)
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public UpdatePoolOption withDescription(String description) {
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

    public UpdatePoolOption withLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    /**
     * 后端服务器组的负载均衡算法。  取值： - ROUND_ROBIN：加权轮询算法。 - LEAST_CONNECTIONS：加权最少连接算法。 - SOURCE_IP：源IP算法。 - QUIC_CID：连接ID算法。 [- 2_TUPLE_HASH：二元组hash算法，仅IP类型的pool支持。 - 3_TUPLE_HASH：三元组hash算法，仅IP类型的pool支持。 - 5_TUPLE_HASH：五元组hash算法，仅IP类型的pool支持。 - IP型pool不指定该字段时，默认设置为5_TUPLE_HASH。](tag:hws_eu)  使用说明： - 当该字段的取值为SOURCE_IP或QUIC_CID时，后端服务器组绑定的后端服务器的weight字段无效。 - 只有pool的protocol为QUIC时，才支持QUIC_CID算法。  [不支持QUIC_CID。](tag:tm,hws_eu,g42,hk_g42,hcso_dt)  [荷兰region不支持QUIC_CID。](tag:dt)
     * @return lbAlgorithm
     */
    public String getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(String lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    public UpdatePoolOption withName(String name) {
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

    public UpdatePoolOption withSessionPersistence(UpdatePoolSessionPersistenceOption sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
        return this;
    }

    public UpdatePoolOption withSessionPersistence(
        Consumer<UpdatePoolSessionPersistenceOption> sessionPersistenceSetter) {
        if (this.sessionPersistence == null) {
            this.sessionPersistence = new UpdatePoolSessionPersistenceOption();
            sessionPersistenceSetter.accept(this.sessionPersistence);
        }

        return this;
    }

    /**
     * Get sessionPersistence
     * @return sessionPersistence
     */
    public UpdatePoolSessionPersistenceOption getSessionPersistence() {
        return sessionPersistence;
    }

    public void setSessionPersistence(UpdatePoolSessionPersistenceOption sessionPersistence) {
        this.sessionPersistence = sessionPersistence;
    }

    public UpdatePoolOption withSlowStart(UpdatePoolSlowStartOption slowStart) {
        this.slowStart = slowStart;
        return this;
    }

    public UpdatePoolOption withSlowStart(Consumer<UpdatePoolSlowStartOption> slowStartSetter) {
        if (this.slowStart == null) {
            this.slowStart = new UpdatePoolSlowStartOption();
            slowStartSetter.accept(this.slowStart);
        }

        return this;
    }

    /**
     * Get slowStart
     * @return slowStart
     */
    public UpdatePoolSlowStartOption getSlowStart() {
        return slowStart;
    }

    public void setSlowStart(UpdatePoolSlowStartOption slowStart) {
        this.slowStart = slowStart;
    }

    public UpdatePoolOption withMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
        return this;
    }

    /**
     * 是否开启删除保护。  取值：false不开启，true开启。  > 退场时需要先关闭所有资源的删除保护开关。  [不支持该字段，请勿使用。](tag:hws_eu,g42,hk_g42)  [荷兰region不支持该字段，请勿使用。](tag:dt)
     * @return memberDeletionProtectionEnable
     */
    public Boolean getMemberDeletionProtectionEnable() {
        return memberDeletionProtectionEnable;
    }

    public void setMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
    }

    public UpdatePoolOption withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 后端服务器组关联的虚拟私有云的ID。 [- pool的protocol为IP时，必须指定vpc_id，且与LB的vpc_id相同。](tag:hws_eu)  只有vpc_id为空时允许更新。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public UpdatePoolOption withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 后端服务器组的类型。  取值： - instance：允许任意类型的后端，type指定为该类型时，vpc_id是必选字段。 - ip：只能添加跨VPC后端，type指定为该类型时，vpc_id不允许指定。[pool的protocol为IP时，type不允许设置为ip。](tag:hws_eu)] - 空字符串（\"\"）：允许任意类型的后端  使用说明： - 只有type为空时允许更新，不允许从非空更新为空。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdatePoolOption withProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护 - consoleProtection: 控制台修改保护
     * @return protectionStatus
     */
    public ProtectionStatusEnum getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public UpdatePoolOption withProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    /**
     * 参数解释：设置保护的原因。作为protection_status的转态设置的原因。  约束限制：仅当protection_status为consoleProtection时有效。  取值范围：除'<'和'>'外通用Unicode字符集字符，最大255个字符。
     * @return protectionReason
     */
    public String getProtectionReason() {
        return protectionReason;
    }

    public void setProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
    }

    public UpdatePoolOption withAnyPortEnable(Boolean anyPortEnable) {
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

    public UpdatePoolOption withConnectionDrain(ConnectionDrain connectionDrain) {
        this.connectionDrain = connectionDrain;
        return this;
    }

    public UpdatePoolOption withConnectionDrain(Consumer<ConnectionDrain> connectionDrainSetter) {
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

    public UpdatePoolOption withPoolHealth(PoolHealth poolHealth) {
        this.poolHealth = poolHealth;
        return this;
    }

    public UpdatePoolOption withPoolHealth(Consumer<PoolHealth> poolHealthSetter) {
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

    public UpdatePoolOption withQuicCidHashStrategy(QuicCidHashStrategy quicCidHashStrategy) {
        this.quicCidHashStrategy = quicCidHashStrategy;
        return this;
    }

    public UpdatePoolOption withQuicCidHashStrategy(Consumer<QuicCidHashStrategy> quicCidHashStrategySetter) {
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

    public UpdatePoolOption withAzAffinity(UpdateAzAffinity azAffinity) {
        this.azAffinity = azAffinity;
        return this;
    }

    public UpdatePoolOption withAzAffinity(Consumer<UpdateAzAffinity> azAffinitySetter) {
        if (this.azAffinity == null) {
            this.azAffinity = new UpdateAzAffinity();
            azAffinitySetter.accept(this.azAffinity);
        }

        return this;
    }

    /**
     * Get azAffinity
     * @return azAffinity
     */
    public UpdateAzAffinity getAzAffinity() {
        return azAffinity;
    }

    public void setAzAffinity(UpdateAzAffinity azAffinity) {
        this.azAffinity = azAffinity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePoolOption that = (UpdatePoolOption) obj;
        return Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.description, that.description) && Objects.equals(this.lbAlgorithm, that.lbAlgorithm)
            && Objects.equals(this.name, that.name) && Objects.equals(this.sessionPersistence, that.sessionPersistence)
            && Objects.equals(this.slowStart, that.slowStart)
            && Objects.equals(this.memberDeletionProtectionEnable, that.memberDeletionProtectionEnable)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason)
            && Objects.equals(this.anyPortEnable, that.anyPortEnable)
            && Objects.equals(this.connectionDrain, that.connectionDrain)
            && Objects.equals(this.poolHealth, that.poolHealth)
            && Objects.equals(this.quicCidHashStrategy, that.quicCidHashStrategy)
            && Objects.equals(this.azAffinity, that.azAffinity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            description,
            lbAlgorithm,
            name,
            sessionPersistence,
            slowStart,
            memberDeletionProtectionEnable,
            vpcId,
            type,
            protectionStatus,
            protectionReason,
            anyPortEnable,
            connectionDrain,
            poolHealth,
            quicCidHashStrategy,
            azAffinity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePoolOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sessionPersistence: ").append(toIndentedString(sessionPersistence)).append("\n");
        sb.append("    slowStart: ").append(toIndentedString(slowStart)).append("\n");
        sb.append("    memberDeletionProtectionEnable: ")
            .append(toIndentedString(memberDeletionProtectionEnable))
            .append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    protectionReason: ").append(toIndentedString(protectionReason)).append("\n");
        sb.append("    anyPortEnable: ").append(toIndentedString(anyPortEnable)).append("\n");
        sb.append("    connectionDrain: ").append(toIndentedString(connectionDrain)).append("\n");
        sb.append("    poolHealth: ").append(toIndentedString(poolHealth)).append("\n");
        sb.append("    quicCidHashStrategy: ").append(toIndentedString(quicCidHashStrategy)).append("\n");
        sb.append("    azAffinity: ").append(toIndentedString(azAffinity)).append("\n");
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
