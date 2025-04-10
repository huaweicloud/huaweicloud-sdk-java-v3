package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
 * 对端容灾关系信息。
 */
public class DisasterRelations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_type")

    private String disasterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 容灾角色。
     */
    public static final class DisasterRoleEnum {

        /**
         * Enum DISASTER for value: "disaster"
         */
        public static final DisasterRoleEnum DISASTER = new DisasterRoleEnum("disaster");

        /**
         * Enum MASTER for value: "master"
         */
        public static final DisasterRoleEnum MASTER = new DisasterRoleEnum("master");

        private static final Map<String, DisasterRoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DisasterRoleEnum> createStaticFields() {
            Map<String, DisasterRoleEnum> map = new HashMap<>();
            map.put("disaster", DISASTER);
            map.put("master", MASTER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DisasterRoleEnum(String value) {
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
        public static DisasterRoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DisasterRoleEnum(value));
        }

        public static DisasterRoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DisasterRoleEnum) {
                return this.value.equals(((DisasterRoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_role")

    private DisasterRoleEnum disasterRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_region_instance_info")

    private RegionInstanceInfo slaveRegionInstanceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_region_instance_info")

    private RegionInstanceInfo masterRegionInstanceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synchronization_id")

    private String synchronizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precheck_failed_reason")

    private String precheckFailedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    public DisasterRelations withDisasterType(String disasterType) {
        this.disasterType = disasterType;
        return this;
    }

    /**
     * 容灾类型。
     * @return disasterType
     */
    public String getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(String disasterType) {
        this.disasterType = disasterType;
    }

    public DisasterRelations withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 容灾任务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DisasterRelations withDisasterRole(DisasterRoleEnum disasterRole) {
        this.disasterRole = disasterRole;
        return this;
    }

    /**
     * 容灾角色。
     * @return disasterRole
     */
    public DisasterRoleEnum getDisasterRole() {
        return disasterRole;
    }

    public void setDisasterRole(DisasterRoleEnum disasterRole) {
        this.disasterRole = disasterRole;
    }

    public DisasterRelations withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间，格式为“yyyy-mm-dd hh:mm:ss”。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public DisasterRelations withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 更新时间，格式为“yyyy-mm-dd hh:mm:ss”。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public DisasterRelations withSlaveRegionInstanceInfo(RegionInstanceInfo slaveRegionInstanceInfo) {
        this.slaveRegionInstanceInfo = slaveRegionInstanceInfo;
        return this;
    }

    public DisasterRelations withSlaveRegionInstanceInfo(Consumer<RegionInstanceInfo> slaveRegionInstanceInfoSetter) {
        if (this.slaveRegionInstanceInfo == null) {
            this.slaveRegionInstanceInfo = new RegionInstanceInfo();
            slaveRegionInstanceInfoSetter.accept(this.slaveRegionInstanceInfo);
        }

        return this;
    }

    /**
     * Get slaveRegionInstanceInfo
     * @return slaveRegionInstanceInfo
     */
    public RegionInstanceInfo getSlaveRegionInstanceInfo() {
        return slaveRegionInstanceInfo;
    }

    public void setSlaveRegionInstanceInfo(RegionInstanceInfo slaveRegionInstanceInfo) {
        this.slaveRegionInstanceInfo = slaveRegionInstanceInfo;
    }

    public DisasterRelations withMasterRegionInstanceInfo(RegionInstanceInfo masterRegionInstanceInfo) {
        this.masterRegionInstanceInfo = masterRegionInstanceInfo;
        return this;
    }

    public DisasterRelations withMasterRegionInstanceInfo(Consumer<RegionInstanceInfo> masterRegionInstanceInfoSetter) {
        if (this.masterRegionInstanceInfo == null) {
            this.masterRegionInstanceInfo = new RegionInstanceInfo();
            masterRegionInstanceInfoSetter.accept(this.masterRegionInstanceInfo);
        }

        return this;
    }

    /**
     * Get masterRegionInstanceInfo
     * @return masterRegionInstanceInfo
     */
    public RegionInstanceInfo getMasterRegionInstanceInfo() {
        return masterRegionInstanceInfo;
    }

    public void setMasterRegionInstanceInfo(RegionInstanceInfo masterRegionInstanceInfo) {
        this.masterRegionInstanceInfo = masterRegionInstanceInfo;
    }

    public DisasterRelations withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 容灾记录id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DisasterRelations withSynchronizationId(String synchronizationId) {
        this.synchronizationId = synchronizationId;
        return this;
    }

    /**
     * 容灾关系唯一id。
     * @return synchronizationId
     */
    public String getSynchronizationId() {
        return synchronizationId;
    }

    public void setSynchronizationId(String synchronizationId) {
        this.synchronizationId = synchronizationId;
    }

    public DisasterRelations withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 当前region实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DisasterRelations withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 当前region实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public DisasterRelations withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * 当前region实例状态。
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public DisasterRelations withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 容灾记录状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DisasterRelations withPrecheckFailedReason(String precheckFailedReason) {
        this.precheckFailedReason = precheckFailedReason;
        return this;
    }

    /**
     * 预校验失败原因。
     * @return precheckFailedReason
     */
    public String getPrecheckFailedReason() {
        return precheckFailedReason;
    }

    public void setPrecheckFailedReason(String precheckFailedReason) {
        this.precheckFailedReason = precheckFailedReason;
    }

    public DisasterRelations withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public DisasterRelations addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public DisasterRelations withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 实例当前操作action。
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisasterRelations that = (DisasterRelations) obj;
        return Objects.equals(this.disasterType, that.disasterType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.disasterRole, that.disasterRole) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.slaveRegionInstanceInfo, that.slaveRegionInstanceInfo)
            && Objects.equals(this.masterRegionInstanceInfo, that.masterRegionInstanceInfo)
            && Objects.equals(this.id, that.id) && Objects.equals(this.synchronizationId, that.synchronizationId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.instanceStatus, that.instanceStatus) && Objects.equals(this.status, that.status)
            && Objects.equals(this.precheckFailedReason, that.precheckFailedReason)
            && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterType,
            name,
            disasterRole,
            created,
            updated,
            slaveRegionInstanceInfo,
            masterRegionInstanceInfo,
            id,
            synchronizationId,
            instanceId,
            instanceName,
            instanceStatus,
            status,
            precheckFailedReason,
            actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisasterRelations {\n");
        sb.append("    disasterType: ").append(toIndentedString(disasterType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    disasterRole: ").append(toIndentedString(disasterRole)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    slaveRegionInstanceInfo: ").append(toIndentedString(slaveRegionInstanceInfo)).append("\n");
        sb.append("    masterRegionInstanceInfo: ").append(toIndentedString(masterRegionInstanceInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    synchronizationId: ").append(toIndentedString(synchronizationId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    precheckFailedReason: ").append(toIndentedString(precheckFailedReason)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
