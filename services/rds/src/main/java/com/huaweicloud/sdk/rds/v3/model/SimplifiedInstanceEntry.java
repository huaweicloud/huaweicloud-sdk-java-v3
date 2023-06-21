package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SimplifiedInstanceEntry
 */
public class SimplifiedInstanceEntry {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen")

    private Boolean frozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_model")

    private String payModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_ids")

    private List<String> availabilityZoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_instances")

    private List<String> readOnlyInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_actions")

    private List<String> currentActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    private Long volumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public SimplifiedInstanceEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SimplifiedInstanceEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建的实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimplifiedInstanceEntry withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 引擎名字
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public SimplifiedInstanceEntry withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 引擎版本
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public SimplifiedInstanceEntry withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * 实例状态。 normal,表示正常 abnormal,表示异常 creating,表示创建中 createfail,表示创建失败 data_disk_full,表示磁盘满 deleted,表示删除 shutdown,表示关机
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public SimplifiedInstanceEntry withFrozen(Boolean frozen) {
        this.frozen = frozen;
        return this;
    }

    /**
     * 是否冻结
     * @return frozen
     */
    public Boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    public SimplifiedInstanceEntry withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 按照实例类型查询。取值Single、Ha、Replica、Enterprise，分别对应于单实例、主备实例和只读实例、分布式实例（企业版）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SimplifiedInstanceEntry withPayModel(String payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 按需还是包周期
     * @return payModel
     */
    public String getPayModel() {
        return payModel;
    }

    public void setPayModel(String payModel) {
        this.payModel = payModel;
    }

    public SimplifiedInstanceEntry withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public SimplifiedInstanceEntry withAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
        return this;
    }

    public SimplifiedInstanceEntry addAvailabilityZoneIdsItem(String availabilityZoneIdsItem) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        this.availabilityZoneIds.add(availabilityZoneIdsItem);
        return this;
    }

    public SimplifiedInstanceEntry withAvailabilityZoneIds(Consumer<List<String>> availabilityZoneIdsSetter) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        availabilityZoneIdsSetter.accept(this.availabilityZoneIds);
        return this;
    }

    /**
     * 可用区集合
     * @return availabilityZoneIds
     */
    public List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    public void setAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
    }

    public SimplifiedInstanceEntry withReadOnlyInstances(List<String> readOnlyInstances) {
        this.readOnlyInstances = readOnlyInstances;
        return this;
    }

    public SimplifiedInstanceEntry addReadOnlyInstancesItem(String readOnlyInstancesItem) {
        if (this.readOnlyInstances == null) {
            this.readOnlyInstances = new ArrayList<>();
        }
        this.readOnlyInstances.add(readOnlyInstancesItem);
        return this;
    }

    public SimplifiedInstanceEntry withReadOnlyInstances(Consumer<List<String>> readOnlyInstancesSetter) {
        if (this.readOnlyInstances == null) {
            this.readOnlyInstances = new ArrayList<>();
        }
        readOnlyInstancesSetter.accept(this.readOnlyInstances);
        return this;
    }

    /**
     * 只读实例id集合
     * @return readOnlyInstances
     */
    public List<String> getReadOnlyInstances() {
        return readOnlyInstances;
    }

    public void setReadOnlyInstances(List<String> readOnlyInstances) {
        this.readOnlyInstances = readOnlyInstances;
    }

    public SimplifiedInstanceEntry withCurrentActions(List<String> currentActions) {
        this.currentActions = currentActions;
        return this;
    }

    public SimplifiedInstanceEntry addCurrentActionsItem(String currentActionsItem) {
        if (this.currentActions == null) {
            this.currentActions = new ArrayList<>();
        }
        this.currentActions.add(currentActionsItem);
        return this;
    }

    public SimplifiedInstanceEntry withCurrentActions(Consumer<List<String>> currentActionsSetter) {
        if (this.currentActions == null) {
            this.currentActions = new ArrayList<>();
        }
        currentActionsSetter.accept(this.currentActions);
        return this;
    }

    /**
     * 当前实例操作动作集合
     * @return currentActions
     */
    public List<String> getCurrentActions() {
        return currentActions;
    }

    public void setCurrentActions(List<String> currentActions) {
        this.currentActions = currentActions;
    }

    public SimplifiedInstanceEntry withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 磁盘类型。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public SimplifiedInstanceEntry withVolumeSize(Long volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * 磁盘大小(单位:G)。
     * @return volumeSize
     */
    public Long getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Long volumeSize) {
        this.volumeSize = volumeSize;
    }

    public SimplifiedInstanceEntry withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目标签ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimplifiedInstanceEntry simplifiedInstanceEntry = (SimplifiedInstanceEntry) o;
        return Objects.equals(this.id, simplifiedInstanceEntry.id)
            && Objects.equals(this.name, simplifiedInstanceEntry.name)
            && Objects.equals(this.engineName, simplifiedInstanceEntry.engineName)
            && Objects.equals(this.engineVersion, simplifiedInstanceEntry.engineVersion)
            && Objects.equals(this.instanceStatus, simplifiedInstanceEntry.instanceStatus)
            && Objects.equals(this.frozen, simplifiedInstanceEntry.frozen)
            && Objects.equals(this.type, simplifiedInstanceEntry.type)
            && Objects.equals(this.payModel, simplifiedInstanceEntry.payModel)
            && Objects.equals(this.specCode, simplifiedInstanceEntry.specCode)
            && Objects.equals(this.availabilityZoneIds, simplifiedInstanceEntry.availabilityZoneIds)
            && Objects.equals(this.readOnlyInstances, simplifiedInstanceEntry.readOnlyInstances)
            && Objects.equals(this.currentActions, simplifiedInstanceEntry.currentActions)
            && Objects.equals(this.volumeType, simplifiedInstanceEntry.volumeType)
            && Objects.equals(this.volumeSize, simplifiedInstanceEntry.volumeSize)
            && Objects.equals(this.enterpriseProjectId, simplifiedInstanceEntry.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            engineName,
            engineVersion,
            instanceStatus,
            frozen,
            type,
            payModel,
            specCode,
            availabilityZoneIds,
            readOnlyInstances,
            currentActions,
            volumeType,
            volumeSize,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimplifiedInstanceEntry {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    availabilityZoneIds: ").append(toIndentedString(availabilityZoneIds)).append("\n");
        sb.append("    readOnlyInstances: ").append(toIndentedString(readOnlyInstances)).append("\n");
        sb.append("    currentActions: ").append(toIndentedString(currentActions)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
