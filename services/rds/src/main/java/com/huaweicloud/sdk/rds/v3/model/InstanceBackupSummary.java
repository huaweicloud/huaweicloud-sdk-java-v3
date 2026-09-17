package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例备份概览
 */
public class InstanceBackupSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_used_space")

    private Double backupUsedSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private InstanceBackupDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space")

    private Space space;

    public InstanceBackupSummary withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceBackupSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  实例名称。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceBackupSummary withBackupUsedSpace(Double backupUsedSpace) {
        this.backupUsedSpace = backupUsedSpace;
        return this;
    }

    /**
     * **参数解释**：  备份用量，单位MB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return backupUsedSpace
     */
    public Double getBackupUsedSpace() {
        return backupUsedSpace;
    }

    public void setBackupUsedSpace(Double backupUsedSpace) {
        this.backupUsedSpace = backupUsedSpace;
    }

    public InstanceBackupSummary withDatastore(InstanceBackupDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public InstanceBackupSummary withDatastore(Consumer<InstanceBackupDatastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new InstanceBackupDatastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public InstanceBackupDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(InstanceBackupDatastore datastore) {
        this.datastore = datastore;
    }

    public InstanceBackupSummary withSpace(Space space) {
        this.space = space;
        return this;
    }

    public InstanceBackupSummary withSpace(Consumer<Space> spaceSetter) {
        if (this.space == null) {
            this.space = new Space();
            spaceSetter.accept(this.space);
        }

        return this;
    }

    /**
     * Get space
     * @return space
     */
    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceBackupSummary that = (InstanceBackupSummary) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.backupUsedSpace, that.backupUsedSpace)
            && Objects.equals(this.datastore, that.datastore) && Objects.equals(this.space, that.space);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, name, backupUsedSpace, datastore, space);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceBackupSummary {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    backupUsedSpace: ").append(toIndentedString(backupUsedSpace)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    space: ").append(toIndentedString(space)).append("\n");
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
