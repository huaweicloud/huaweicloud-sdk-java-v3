package com.huaweicloud.sdk.cce.v3.model;

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
 * 
 */
public class NodeStatus {

    /**
     * **参数解释**： 节点状态：节点资源生命周期管理（如安装卸载等）状态和集群内k8s node状态的综合体现 **约束限制**： 不涉及 **取值范围**： - Build：创建中，表示节点正处于创建过程中。 - Installing：安装中，表示节点正处于纳管过程中。 - Upgrading：升级中，表示节点正处于升级过程中。 - Active：运行中，表示节点处于正常状态。 - Abnormal：不可用，表示节点处于异常状态。 - Deleting： 删除中，表示节点正处于删除过程中。 - Error：错误，表示节点处于故障状态。  **默认取值**： 不涉及
     */
    public static final class PhaseEnum {

        /**
         * Enum BUILD for value: "Build"
         */
        public static final PhaseEnum BUILD = new PhaseEnum("Build");

        /**
         * Enum INSTALLING for value: "Installing"
         */
        public static final PhaseEnum INSTALLING = new PhaseEnum("Installing");

        /**
         * Enum UPGRADING for value: "Upgrading"
         */
        public static final PhaseEnum UPGRADING = new PhaseEnum("Upgrading");

        /**
         * Enum ACTIVE for value: "Active"
         */
        public static final PhaseEnum ACTIVE = new PhaseEnum("Active");

        /**
         * Enum ABNORMAL for value: "Abnormal"
         */
        public static final PhaseEnum ABNORMAL = new PhaseEnum("Abnormal");

        /**
         * Enum DELETING for value: "Deleting"
         */
        public static final PhaseEnum DELETING = new PhaseEnum("Deleting");

        /**
         * Enum ERROR for value: "Error"
         */
        public static final PhaseEnum ERROR = new PhaseEnum("Error");

        private static final Map<String, PhaseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PhaseEnum> createStaticFields() {
            Map<String, PhaseEnum> map = new HashMap<>();
            map.put("Build", BUILD);
            map.put("Installing", INSTALLING);
            map.put("Upgrading", UPGRADING);
            map.put("Active", ACTIVE);
            map.put("Abnormal", ABNORMAL);
            map.put("Deleting", DELETING);
            map.put("Error", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PhaseEnum(String value) {
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
        public static PhaseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PhaseEnum(value));
        }

        public static PhaseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PhaseEnum) {
                return this.value.equals(((PhaseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private PhaseEnum phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastProbeTime")

    private String lastProbeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobID")

    private String jobID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverId")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateIP")

    private String privateIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateIPv6IP")

    private String privateIPv6IP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicIP")

    private String publicIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleteStatus")

    private DeleteStatus deleteStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurationUpToDate")

    private Boolean configurationUpToDate;

    public NodeStatus withPhase(PhaseEnum phase) {
        this.phase = phase;
        return this;
    }

    /**
     * **参数解释**： 节点状态：节点资源生命周期管理（如安装卸载等）状态和集群内k8s node状态的综合体现 **约束限制**： 不涉及 **取值范围**： - Build：创建中，表示节点正处于创建过程中。 - Installing：安装中，表示节点正处于纳管过程中。 - Upgrading：升级中，表示节点正处于升级过程中。 - Active：运行中，表示节点处于正常状态。 - Abnormal：不可用，表示节点处于异常状态。 - Deleting： 删除中，表示节点正处于删除过程中。 - Error：错误，表示节点处于故障状态。  **默认取值**： 不涉及
     * @return phase
     */
    public PhaseEnum getPhase() {
        return phase;
    }

    public void setPhase(PhaseEnum phase) {
        this.phase = phase;
    }

    public NodeStatus withLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
        return this;
    }

    /**
     * **参数解释**： 节点最近一次状态检查时间。集群处于异常、冻结或者中间态（例如创建中）时，节点的状态检查动作可能受影响。检查时间超过5分的节点状态不具有参考意义。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return lastProbeTime
     */
    public String getLastProbeTime() {
        return lastProbeTime;
    }

    public void setLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
    }

    public NodeStatus withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    /**
     * **参数解释**： 创建或删除时的任务ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return jobID
     */
    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public NodeStatus withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * **参数解释**： 底层云服务器或裸金属节点ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public NodeStatus withPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }

    /**
     * **参数解释**： 节点主网卡私有网段IP地址。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return privateIP
     */
    public String getPrivateIP() {
        return privateIP;
    }

    public void setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
    }

    public NodeStatus withPrivateIPv6IP(String privateIPv6IP) {
        this.privateIPv6IP = privateIPv6IP;
        return this;
    }

    /**
     * **参数解释**： 节点主网卡私有网段IPv6地址。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return privateIPv6IP
     */
    public String getPrivateIPv6IP() {
        return privateIPv6IP;
    }

    public void setPrivateIPv6IP(String privateIPv6IP) {
        this.privateIPv6IP = privateIPv6IP;
    }

    public NodeStatus withPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }

    /**
     * **参数解释**： 节点主网卡私有网段IPv6地址。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return publicIP
     */
    public String getPublicIP() {
        return publicIP;
    }

    public void setPublicIP(String publicIP) {
        this.publicIP = publicIP;
    }

    public NodeStatus withDeleteStatus(DeleteStatus deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    public NodeStatus withDeleteStatus(Consumer<DeleteStatus> deleteStatusSetter) {
        if (this.deleteStatus == null) {
            this.deleteStatus = new DeleteStatus();
            deleteStatusSetter.accept(this.deleteStatus);
        }

        return this;
    }

    /**
     * Get deleteStatus
     * @return deleteStatus
     */
    public DeleteStatus getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(DeleteStatus deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public NodeStatus withConfigurationUpToDate(Boolean configurationUpToDate) {
        this.configurationUpToDate = configurationUpToDate;
        return this;
    }

    /**
     * **参数解释**： 节点配置是否与所属节点池的节点模板最新配置一致。 当更新节点池os或runtime后，该节点池中存量节点的os或runtime便与节点池存在差异，configurationUpToDate参数值即为false。 重置节点后，存量节点的os和runtime与节点池配置保持一致，configurationUpToDate参数值即为true。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return configurationUpToDate
     */
    public Boolean getConfigurationUpToDate() {
        return configurationUpToDate;
    }

    public void setConfigurationUpToDate(Boolean configurationUpToDate) {
        this.configurationUpToDate = configurationUpToDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeStatus that = (NodeStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.lastProbeTime, that.lastProbeTime)
            && Objects.equals(this.jobID, that.jobID) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.privateIP, that.privateIP) && Objects.equals(this.privateIPv6IP, that.privateIPv6IP)
            && Objects.equals(this.publicIP, that.publicIP) && Objects.equals(this.deleteStatus, that.deleteStatus)
            && Objects.equals(this.configurationUpToDate, that.configurationUpToDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase,
            lastProbeTime,
            jobID,
            serverId,
            privateIP,
            privateIPv6IP,
            publicIP,
            deleteStatus,
            configurationUpToDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
        sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    privateIP: ").append(toIndentedString(privateIP)).append("\n");
        sb.append("    privateIPv6IP: ").append(toIndentedString(privateIPv6IP)).append("\n");
        sb.append("    publicIP: ").append(toIndentedString(publicIP)).append("\n");
        sb.append("    deleteStatus: ").append(toIndentedString(deleteStatus)).append("\n");
        sb.append("    configurationUpToDate: ").append(toIndentedString(configurationUpToDate)).append("\n");
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
