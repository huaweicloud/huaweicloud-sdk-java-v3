package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 逻辑盘的信息
 */
public class Volume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_raid_level")

    private String volumeRaidLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity_bytes")

    private Integer capacityBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optimum_io_size_bytes")

    private Integer optimumIoSizeBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_read_policy")

    private String currentReadPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_read_policy")

    private String defaultReadPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_write_policy")

    private String currentWritePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_write_policy")

    private String defaultWritePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policy")

    private String accessPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_io_policy")

    private String currentIoPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_io_policy")

    private String defaultIoPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drives")

    private List<Drive> drives = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Status status;

    public Volume withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 逻辑盘名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Volume withVolumeRaidLevel(String volumeRaidLevel) {
        this.volumeRaidLevel = volumeRaidLevel;
        return this;
    }

    /**
     * RAID级别
     * @return volumeRaidLevel
     */
    public String getVolumeRaidLevel() {
        return volumeRaidLevel;
    }

    public void setVolumeRaidLevel(String volumeRaidLevel) {
        this.volumeRaidLevel = volumeRaidLevel;
    }

    public Volume withCapacityBytes(Integer capacityBytes) {
        this.capacityBytes = capacityBytes;
        return this;
    }

    /**
     * 容量（单位：byte）
     * @return capacityBytes
     */
    public Integer getCapacityBytes() {
        return capacityBytes;
    }

    public void setCapacityBytes(Integer capacityBytes) {
        this.capacityBytes = capacityBytes;
    }

    public Volume withOptimumIoSizeBytes(Integer optimumIoSizeBytes) {
        this.optimumIoSizeBytes = optimumIoSizeBytes;
        return this;
    }

    /**
     * 逻辑盘的条带大小（单位：byte）
     * @return optimumIoSizeBytes
     */
    public Integer getOptimumIoSizeBytes() {
        return optimumIoSizeBytes;
    }

    public void setOptimumIoSizeBytes(Integer optimumIoSizeBytes) {
        this.optimumIoSizeBytes = optimumIoSizeBytes;
    }

    public Volume withCurrentReadPolicy(String currentReadPolicy) {
        this.currentReadPolicy = currentReadPolicy;
        return this;
    }

    /**
     * 当前的读策略
     * @return currentReadPolicy
     */
    public String getCurrentReadPolicy() {
        return currentReadPolicy;
    }

    public void setCurrentReadPolicy(String currentReadPolicy) {
        this.currentReadPolicy = currentReadPolicy;
    }

    public Volume withDefaultReadPolicy(String defaultReadPolicy) {
        this.defaultReadPolicy = defaultReadPolicy;
        return this;
    }

    /**
     * 默认的读策略
     * @return defaultReadPolicy
     */
    public String getDefaultReadPolicy() {
        return defaultReadPolicy;
    }

    public void setDefaultReadPolicy(String defaultReadPolicy) {
        this.defaultReadPolicy = defaultReadPolicy;
    }

    public Volume withCurrentWritePolicy(String currentWritePolicy) {
        this.currentWritePolicy = currentWritePolicy;
        return this;
    }

    /**
     * 当前的写策略
     * @return currentWritePolicy
     */
    public String getCurrentWritePolicy() {
        return currentWritePolicy;
    }

    public void setCurrentWritePolicy(String currentWritePolicy) {
        this.currentWritePolicy = currentWritePolicy;
    }

    public Volume withDefaultWritePolicy(String defaultWritePolicy) {
        this.defaultWritePolicy = defaultWritePolicy;
        return this;
    }

    /**
     * 默认的写策略
     * @return defaultWritePolicy
     */
    public String getDefaultWritePolicy() {
        return defaultWritePolicy;
    }

    public void setDefaultWritePolicy(String defaultWritePolicy) {
        this.defaultWritePolicy = defaultWritePolicy;
    }

    public Volume withAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * 访问策略
     * @return accessPolicy
     */
    public String getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    public Volume withCurrentIoPolicy(String currentIoPolicy) {
        this.currentIoPolicy = currentIoPolicy;
        return this;
    }

    /**
     * 当前IO策略
     * @return currentIoPolicy
     */
    public String getCurrentIoPolicy() {
        return currentIoPolicy;
    }

    public void setCurrentIoPolicy(String currentIoPolicy) {
        this.currentIoPolicy = currentIoPolicy;
    }

    public Volume withDefaultIoPolicy(String defaultIoPolicy) {
        this.defaultIoPolicy = defaultIoPolicy;
        return this;
    }

    /**
     * 当前IO策略
     * @return defaultIoPolicy
     */
    public String getDefaultIoPolicy() {
        return defaultIoPolicy;
    }

    public void setDefaultIoPolicy(String defaultIoPolicy) {
        this.defaultIoPolicy = defaultIoPolicy;
    }

    public Volume withDrives(List<Drive> drives) {
        this.drives = drives;
        return this;
    }

    public Volume addDrivesItem(Drive drivesItem) {
        if (this.drives == null) {
            this.drives = new ArrayList<>();
        }
        this.drives.add(drivesItem);
        return this;
    }

    public Volume withDrives(Consumer<List<Drive>> drivesSetter) {
        if (this.drives == null) {
            this.drives = new ArrayList<>();
        }
        drivesSetter.accept(this.drives);
        return this;
    }

    /**
     * 存储物理盘详细信息
     * @return drives
     */
    public List<Drive> getDrives() {
        return drives;
    }

    public void setDrives(List<Drive> drives) {
        this.drives = drives;
    }

    public Volume withStatus(Status status) {
        this.status = status;
        return this;
    }

    public Volume withStatus(Consumer<Status> statusSetter) {
        if (this.status == null) {
            this.status = new Status();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Volume that = (Volume) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.volumeRaidLevel, that.volumeRaidLevel)
            && Objects.equals(this.capacityBytes, that.capacityBytes)
            && Objects.equals(this.optimumIoSizeBytes, that.optimumIoSizeBytes)
            && Objects.equals(this.currentReadPolicy, that.currentReadPolicy)
            && Objects.equals(this.defaultReadPolicy, that.defaultReadPolicy)
            && Objects.equals(this.currentWritePolicy, that.currentWritePolicy)
            && Objects.equals(this.defaultWritePolicy, that.defaultWritePolicy)
            && Objects.equals(this.accessPolicy, that.accessPolicy)
            && Objects.equals(this.currentIoPolicy, that.currentIoPolicy)
            && Objects.equals(this.defaultIoPolicy, that.defaultIoPolicy) && Objects.equals(this.drives, that.drives)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            volumeRaidLevel,
            capacityBytes,
            optimumIoSizeBytes,
            currentReadPolicy,
            defaultReadPolicy,
            currentWritePolicy,
            defaultWritePolicy,
            accessPolicy,
            currentIoPolicy,
            defaultIoPolicy,
            drives,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Volume {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    volumeRaidLevel: ").append(toIndentedString(volumeRaidLevel)).append("\n");
        sb.append("    capacityBytes: ").append(toIndentedString(capacityBytes)).append("\n");
        sb.append("    optimumIoSizeBytes: ").append(toIndentedString(optimumIoSizeBytes)).append("\n");
        sb.append("    currentReadPolicy: ").append(toIndentedString(currentReadPolicy)).append("\n");
        sb.append("    defaultReadPolicy: ").append(toIndentedString(defaultReadPolicy)).append("\n");
        sb.append("    currentWritePolicy: ").append(toIndentedString(currentWritePolicy)).append("\n");
        sb.append("    defaultWritePolicy: ").append(toIndentedString(defaultWritePolicy)).append("\n");
        sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
        sb.append("    currentIoPolicy: ").append(toIndentedString(currentIoPolicy)).append("\n");
        sb.append("    defaultIoPolicy: ").append(toIndentedString(defaultIoPolicy)).append("\n");
        sb.append("    drives: ").append(toIndentedString(drives)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
