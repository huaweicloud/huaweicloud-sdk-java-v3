package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 内存条信息
 */
public class Memory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity_mib")

    private Integer capacityMib;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer")

    private String manufacturer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_device_type")

    private String memoryDeviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_speed_mhz")

    private Integer allowedSpeedMhz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_speed_mhz")

    private Integer operatingSpeedMhz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health")

    private String health;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_count")

    private Integer rankCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_width_bits")

    private Integer dataWidthBits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_number")

    private String partNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_voltage_millivolt")

    private Integer minVoltageMillivolt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bom_number")

    private String bomNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_detail")

    private String typeDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "technology")

    private String technology;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private String position;

    public Memory withName(String name) {
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

    public Memory withCapacityMib(Integer capacityMib) {
        this.capacityMib = capacityMib;
        return this;
    }

    /**
     * 表示系统的总内存容量（单位：MiB）
     * @return capacityMib
     */
    public Integer getCapacityMib() {
        return capacityMib;
    }

    public void setCapacityMib(Integer capacityMib) {
        this.capacityMib = capacityMib;
    }

    public Memory withManufacturer(String manufacturer) {
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

    public Memory withMemoryDeviceType(String memoryDeviceType) {
        this.memoryDeviceType = memoryDeviceType;
        return this;
    }

    /**
     * 内存类型：DDR4/DDR6
     * @return memoryDeviceType
     */
    public String getMemoryDeviceType() {
        return memoryDeviceType;
    }

    public void setMemoryDeviceType(String memoryDeviceType) {
        this.memoryDeviceType = memoryDeviceType;
    }

    public Memory withAllowedSpeedMhz(Integer allowedSpeedMhz) {
        this.allowedSpeedMhz = allowedSpeedMhz;
        return this;
    }

    /**
     * 主频（单位：MHz）
     * @return allowedSpeedMhz
     */
    public Integer getAllowedSpeedMhz() {
        return allowedSpeedMhz;
    }

    public void setAllowedSpeedMhz(Integer allowedSpeedMhz) {
        this.allowedSpeedMhz = allowedSpeedMhz;
    }

    public Memory withOperatingSpeedMhz(Integer operatingSpeedMhz) {
        this.operatingSpeedMhz = operatingSpeedMhz;
        return this;
    }

    /**
     * 当前频率（单位：MHz）
     * @return operatingSpeedMhz
     */
    public Integer getOperatingSpeedMhz() {
        return operatingSpeedMhz;
    }

    public void setOperatingSpeedMhz(Integer operatingSpeedMhz) {
        this.operatingSpeedMhz = operatingSpeedMhz;
    }

    public Memory withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 序列号
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Memory withHealth(String health) {
        this.health = health;
        return this;
    }

    /**
     * 健康状态
     * @return health
     */
    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public Memory withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 启用状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memory withRankCount(Integer rankCount) {
        this.rankCount = rankCount;
        return this;
    }

    /**
     * Rank数量
     * @return rankCount
     */
    public Integer getRankCount() {
        return rankCount;
    }

    public void setRankCount(Integer rankCount) {
        this.rankCount = rankCount;
    }

    public Memory withDataWidthBits(Integer dataWidthBits) {
        this.dataWidthBits = dataWidthBits;
        return this;
    }

    /**
     * 数据带宽
     * @return dataWidthBits
     */
    public Integer getDataWidthBits() {
        return dataWidthBits;
    }

    public void setDataWidthBits(Integer dataWidthBits) {
        this.dataWidthBits = dataWidthBits;
    }

    public Memory withPartNumber(String partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * 部件编号
     * @return partNumber
     */
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public Memory withMinVoltageMillivolt(Integer minVoltageMillivolt) {
        this.minVoltageMillivolt = minVoltageMillivolt;
        return this;
    }

    /**
     * 最小电压
     * @return minVoltageMillivolt
     */
    public Integer getMinVoltageMillivolt() {
        return minVoltageMillivolt;
    }

    public void setMinVoltageMillivolt(Integer minVoltageMillivolt) {
        this.minVoltageMillivolt = minVoltageMillivolt;
    }

    public Memory withBomNumber(String bomNumber) {
        this.bomNumber = bomNumber;
        return this;
    }

    /**
     * Bom编码
     * @return bomNumber
     */
    public String getBomNumber() {
        return bomNumber;
    }

    public void setBomNumber(String bomNumber) {
        this.bomNumber = bomNumber;
    }

    public Memory withTypeDetail(String typeDetail) {
        this.typeDetail = typeDetail;
        return this;
    }

    /**
     * 类型详细信息
     * @return typeDetail
     */
    public String getTypeDetail() {
        return typeDetail;
    }

    public void setTypeDetail(String typeDetail) {
        this.typeDetail = typeDetail;
    }

    public Memory withTechnology(String technology) {
        this.technology = technology;
        return this;
    }

    /**
     * 技术
     * @return technology
     */
    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Memory withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * 位置
     * @return position
     */
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Memory that = (Memory) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.capacityMib, that.capacityMib)
            && Objects.equals(this.manufacturer, that.manufacturer)
            && Objects.equals(this.memoryDeviceType, that.memoryDeviceType)
            && Objects.equals(this.allowedSpeedMhz, that.allowedSpeedMhz)
            && Objects.equals(this.operatingSpeedMhz, that.operatingSpeedMhz)
            && Objects.equals(this.serialNumber, that.serialNumber) && Objects.equals(this.health, that.health)
            && Objects.equals(this.state, that.state) && Objects.equals(this.rankCount, that.rankCount)
            && Objects.equals(this.dataWidthBits, that.dataWidthBits)
            && Objects.equals(this.partNumber, that.partNumber)
            && Objects.equals(this.minVoltageMillivolt, that.minVoltageMillivolt)
            && Objects.equals(this.bomNumber, that.bomNumber) && Objects.equals(this.typeDetail, that.typeDetail)
            && Objects.equals(this.technology, that.technology) && Objects.equals(this.position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            capacityMib,
            manufacturer,
            memoryDeviceType,
            allowedSpeedMhz,
            operatingSpeedMhz,
            serialNumber,
            health,
            state,
            rankCount,
            dataWidthBits,
            partNumber,
            minVoltageMillivolt,
            bomNumber,
            typeDetail,
            technology,
            position);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Memory {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    capacityMib: ").append(toIndentedString(capacityMib)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    memoryDeviceType: ").append(toIndentedString(memoryDeviceType)).append("\n");
        sb.append("    allowedSpeedMhz: ").append(toIndentedString(allowedSpeedMhz)).append("\n");
        sb.append("    operatingSpeedMhz: ").append(toIndentedString(operatingSpeedMhz)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    health: ").append(toIndentedString(health)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    rankCount: ").append(toIndentedString(rankCount)).append("\n");
        sb.append("    dataWidthBits: ").append(toIndentedString(dataWidthBits)).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
        sb.append("    minVoltageMillivolt: ").append(toIndentedString(minVoltageMillivolt)).append("\n");
        sb.append("    bomNumber: ").append(toIndentedString(bomNumber)).append("\n");
        sb.append("    typeDetail: ").append(toIndentedString(typeDetail)).append("\n");
        sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
