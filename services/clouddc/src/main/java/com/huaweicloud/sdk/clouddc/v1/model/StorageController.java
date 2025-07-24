package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 存储控制器的信息
 */
public class StorageController {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer")

    private String manufacturer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health")

    private String health;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_version")

    private String firmwareVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_raid_levels")

    private List<String> supportedRaidLevels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_version")

    private String configurationVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sas_address")

    private String sasAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacitance_name")

    private String capacitanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacitance_state")

    private String capacitanceState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacitance_health")

    private String capacitanceHealth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_stripe_size_bytes")

    private Long minStripeSizeBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_stripe_size_bytes")

    private Long maxStripeSizeBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<Volume> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drives")

    private List<String> drives = null;

    public StorageController withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StorageController withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public StorageController withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * 制造商
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public StorageController withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public StorageController withHealth(String health) {
        this.health = health;
        return this;
    }

    /**
     * 健康情况
     * @return health
     */
    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public StorageController withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 存储控制器的类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StorageController withFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
        return this;
    }

    /**
     * 固件版本
     * @return firmwareVersion
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public StorageController withSupportedRaidLevels(List<String> supportedRaidLevels) {
        this.supportedRaidLevels = supportedRaidLevels;
        return this;
    }

    public StorageController addSupportedRaidLevelsItem(String supportedRaidLevelsItem) {
        if (this.supportedRaidLevels == null) {
            this.supportedRaidLevels = new ArrayList<>();
        }
        this.supportedRaidLevels.add(supportedRaidLevelsItem);
        return this;
    }

    public StorageController withSupportedRaidLevels(Consumer<List<String>> supportedRaidLevelsSetter) {
        if (this.supportedRaidLevels == null) {
            this.supportedRaidLevels = new ArrayList<>();
        }
        supportedRaidLevelsSetter.accept(this.supportedRaidLevels);
        return this;
    }

    /**
     * 支持的raid级别列表
     * @return supportedRaidLevels
     */
    public List<String> getSupportedRaidLevels() {
        return supportedRaidLevels;
    }

    public void setSupportedRaidLevels(List<String> supportedRaidLevels) {
        this.supportedRaidLevels = supportedRaidLevels;
    }

    public StorageController withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 存储控制器的模式
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public StorageController withConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
        return this;
    }

    /**
     * 储控制器配置版本
     * @return configurationVersion
     */
    public String getConfigurationVersion() {
        return configurationVersion;
    }

    public void setConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
    }

    public StorageController withSasAddress(String sasAddress) {
        this.sasAddress = sasAddress;
        return this;
    }

    /**
     * SAS地址
     * @return sasAddress
     */
    public String getSasAddress() {
        return sasAddress;
    }

    public void setSasAddress(String sasAddress) {
        this.sasAddress = sasAddress;
    }

    public StorageController withCapacitanceName(String capacitanceName) {
        this.capacitanceName = capacitanceName;
        return this;
    }

    /**
     * 存储控制器BBU名称
     * @return capacitanceName
     */
    public String getCapacitanceName() {
        return capacitanceName;
    }

    public void setCapacitanceName(String capacitanceName) {
        this.capacitanceName = capacitanceName;
    }

    public StorageController withCapacitanceState(String capacitanceState) {
        this.capacitanceState = capacitanceState;
        return this;
    }

    /**
     * 存储控制器电容(BBU)使能状态
     * @return capacitanceState
     */
    public String getCapacitanceState() {
        return capacitanceState;
    }

    public void setCapacitanceState(String capacitanceState) {
        this.capacitanceState = capacitanceState;
    }

    public StorageController withCapacitanceHealth(String capacitanceHealth) {
        this.capacitanceHealth = capacitanceHealth;
        return this;
    }

    /**
     * 存储控制器电容(BBU)健康状态
     * @return capacitanceHealth
     */
    public String getCapacitanceHealth() {
        return capacitanceHealth;
    }

    public void setCapacitanceHealth(String capacitanceHealth) {
        this.capacitanceHealth = capacitanceHealth;
    }

    public StorageController withMinStripeSizeBytes(Long minStripeSizeBytes) {
        this.minStripeSizeBytes = minStripeSizeBytes;
        return this;
    }

    /**
     * 控制器支持最小条带值
     * @return minStripeSizeBytes
     */
    public Long getMinStripeSizeBytes() {
        return minStripeSizeBytes;
    }

    public void setMinStripeSizeBytes(Long minStripeSizeBytes) {
        this.minStripeSizeBytes = minStripeSizeBytes;
    }

    public StorageController withMaxStripeSizeBytes(Long maxStripeSizeBytes) {
        this.maxStripeSizeBytes = maxStripeSizeBytes;
        return this;
    }

    /**
     * 控制器支持最大条带值
     * @return maxStripeSizeBytes
     */
    public Long getMaxStripeSizeBytes() {
        return maxStripeSizeBytes;
    }

    public void setMaxStripeSizeBytes(Long maxStripeSizeBytes) {
        this.maxStripeSizeBytes = maxStripeSizeBytes;
    }

    public StorageController withVolumes(List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

    public StorageController addVolumesItem(Volume volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public StorageController withVolumes(Consumer<List<Volume>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 逻辑盘列表
     * @return volumes
     */
    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    public StorageController withDrives(List<String> drives) {
        this.drives = drives;
        return this;
    }

    public StorageController addDrivesItem(String drivesItem) {
        if (this.drives == null) {
            this.drives = new ArrayList<>();
        }
        this.drives.add(drivesItem);
        return this;
    }

    public StorageController withDrives(Consumer<List<String>> drivesSetter) {
        if (this.drives == null) {
            this.drives = new ArrayList<>();
        }
        drivesSetter.accept(this.drives);
        return this;
    }

    /**
     * 管理的驱动器列表信息
     * @return drives
     */
    public List<String> getDrives() {
        return drives;
    }

    public void setDrives(List<String> drives) {
        this.drives = drives;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageController that = (StorageController) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.model, that.model)
            && Objects.equals(this.manufacturer, that.manufacturer) && Objects.equals(this.state, that.state)
            && Objects.equals(this.health, that.health) && Objects.equals(this.type, that.type)
            && Objects.equals(this.firmwareVersion, that.firmwareVersion)
            && Objects.equals(this.supportedRaidLevels, that.supportedRaidLevels)
            && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.configurationVersion, that.configurationVersion)
            && Objects.equals(this.sasAddress, that.sasAddress)
            && Objects.equals(this.capacitanceName, that.capacitanceName)
            && Objects.equals(this.capacitanceState, that.capacitanceState)
            && Objects.equals(this.capacitanceHealth, that.capacitanceHealth)
            && Objects.equals(this.minStripeSizeBytes, that.minStripeSizeBytes)
            && Objects.equals(this.maxStripeSizeBytes, that.maxStripeSizeBytes)
            && Objects.equals(this.volumes, that.volumes) && Objects.equals(this.drives, that.drives);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            model,
            manufacturer,
            state,
            health,
            type,
            firmwareVersion,
            supportedRaidLevels,
            mode,
            configurationVersion,
            sasAddress,
            capacitanceName,
            capacitanceState,
            capacitanceHealth,
            minStripeSizeBytes,
            maxStripeSizeBytes,
            volumes,
            drives);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageController {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    health: ").append(toIndentedString(health)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
        sb.append("    supportedRaidLevels: ").append(toIndentedString(supportedRaidLevels)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
        sb.append("    sasAddress: ").append(toIndentedString(sasAddress)).append("\n");
        sb.append("    capacitanceName: ").append(toIndentedString(capacitanceName)).append("\n");
        sb.append("    capacitanceState: ").append(toIndentedString(capacitanceState)).append("\n");
        sb.append("    capacitanceHealth: ").append(toIndentedString(capacitanceHealth)).append("\n");
        sb.append("    minStripeSizeBytes: ").append(toIndentedString(minStripeSizeBytes)).append("\n");
        sb.append("    maxStripeSizeBytes: ").append(toIndentedString(maxStripeSizeBytes)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    drives: ").append(toIndentedString(drives)).append("\n");
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
