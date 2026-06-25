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
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_use_space")

    private Double backupUseSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private InstanceBackupDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spaces")

    private Spaces spaces;

    public InstanceBackupSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  实例ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public InstanceBackupSummary withBackupUseSpace(Double backupUseSpace) {
        this.backupUseSpace = backupUseSpace;
        return this;
    }

    /**
     * **参数解释**：  备份用量，单位MB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return backupUseSpace
     */
    public Double getBackupUseSpace() {
        return backupUseSpace;
    }

    public void setBackupUseSpace(Double backupUseSpace) {
        this.backupUseSpace = backupUseSpace;
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

    public InstanceBackupSummary withSpaces(Spaces spaces) {
        this.spaces = spaces;
        return this;
    }

    public InstanceBackupSummary withSpaces(Consumer<Spaces> spacesSetter) {
        if (this.spaces == null) {
            this.spaces = new Spaces();
            spacesSetter.accept(this.spaces);
        }

        return this;
    }

    /**
     * Get spaces
     * @return spaces
     */
    public Spaces getSpaces() {
        return spaces;
    }

    public void setSpaces(Spaces spaces) {
        this.spaces = spaces;
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
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.backupUseSpace, that.backupUseSpace)
            && Objects.equals(this.datastore, that.datastore) && Objects.equals(this.spaces, that.spaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, backupUseSpace, datastore, spaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceBackupSummary {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    backupUseSpace: ").append(toIndentedString(backupUseSpace)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    spaces: ").append(toIndentedString(spaces)).append("\n");
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
