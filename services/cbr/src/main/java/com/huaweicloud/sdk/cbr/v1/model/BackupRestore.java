package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BackupRestore
 */
public class BackupRestore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mappings")

    private List<BackupRestoreServerMapping> mappings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_on")

    private Boolean powerOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private RestoreDetails details;

    public BackupRestore withMappings(List<BackupRestoreServerMapping> mappings) {
        this.mappings = mappings;
        return this;
    }

    public BackupRestore addMappingsItem(BackupRestoreServerMapping mappingsItem) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        this.mappings.add(mappingsItem);
        return this;
    }

    public BackupRestore withMappings(Consumer<List<BackupRestoreServerMapping>> mappingsSetter) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        mappingsSetter.accept(this.mappings);
        return this;
    }

    /**
     * 恢复的映射关系(整机恢复时必填，卷恢复时可选但是不会用到填写的值）
     * @return mappings
     */
    public List<BackupRestoreServerMapping> getMappings() {
        return mappings;
    }

    public void setMappings(List<BackupRestoreServerMapping> mappings) {
        this.mappings = mappings;
    }

    public BackupRestore withPowerOn(Boolean powerOn) {
        this.powerOn = powerOn;
        return this;
    }

    /**
     * 恢复后是否开始，默认开机。
     * @return powerOn
     */
    public Boolean getPowerOn() {
        return powerOn;
    }

    public void setPowerOn(Boolean powerOn) {
        this.powerOn = powerOn;
    }

    public BackupRestore withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 恢复的目标虚拟机ID（整机恢复时必填）
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public BackupRestore withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * 恢复的目标卷ID（卷恢复时必填）
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public BackupRestore withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 待恢复的目标资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BackupRestore withDetails(RestoreDetails details) {
        this.details = details;
        return this;
    }

    public BackupRestore withDetails(Consumer<RestoreDetails> detailsSetter) {
        if (this.details == null) {
            this.details = new RestoreDetails();
            detailsSetter.accept(this.details);
        }

        return this;
    }

    /**
     * Get details
     * @return details
     */
    public RestoreDetails getDetails() {
        return details;
    }

    public void setDetails(RestoreDetails details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupRestore that = (BackupRestore) obj;
        return Objects.equals(this.mappings, that.mappings) && Objects.equals(this.powerOn, that.powerOn)
            && Objects.equals(this.serverId, that.serverId) && Objects.equals(this.volumeId, that.volumeId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mappings, powerOn, serverId, volumeId, resourceId, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupRestore {\n");
        sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
        sb.append("    powerOn: ").append(toIndentedString(powerOn)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
