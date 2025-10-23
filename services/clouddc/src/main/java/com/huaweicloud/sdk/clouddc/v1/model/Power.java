package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 电源详细信息
 */
public class Power {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slot_number")

    private Integer slotNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer")

    private String manufacturer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_supply_type")

    private String powerSupplyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_capacity_watts")

    private Integer powerCapacityWatts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_input_voltage")

    private Integer lineInputVoltage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_voltage")

    private Integer outputVoltage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_standby")

    private String activeStandby;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_number")

    private String partNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_version")

    private String firmwareVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Status status;

    public Power withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 电源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power withSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
        return this;
    }

    /**
     * 槽位
     * @return slotNumber
     */
    public Integer getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Power withModel(String model) {
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

    public Power withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * 厂商
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Power withPowerSupplyType(String powerSupplyType) {
        this.powerSupplyType = powerSupplyType;
        return this;
    }

    /**
     * 输入模式
     * @return powerSupplyType
     */
    public String getPowerSupplyType() {
        return powerSupplyType;
    }

    public void setPowerSupplyType(String powerSupplyType) {
        this.powerSupplyType = powerSupplyType;
    }

    public Power withPowerCapacityWatts(Integer powerCapacityWatts) {
        this.powerCapacityWatts = powerCapacityWatts;
        return this;
    }

    /**
     * 额定功率
     * @return powerCapacityWatts
     */
    public Integer getPowerCapacityWatts() {
        return powerCapacityWatts;
    }

    public void setPowerCapacityWatts(Integer powerCapacityWatts) {
        this.powerCapacityWatts = powerCapacityWatts;
    }

    public Power withLineInputVoltage(Integer lineInputVoltage) {
        this.lineInputVoltage = lineInputVoltage;
        return this;
    }

    /**
     * 输入电压
     * @return lineInputVoltage
     */
    public Integer getLineInputVoltage() {
        return lineInputVoltage;
    }

    public void setLineInputVoltage(Integer lineInputVoltage) {
        this.lineInputVoltage = lineInputVoltage;
    }

    public Power withOutputVoltage(Integer outputVoltage) {
        this.outputVoltage = outputVoltage;
        return this;
    }

    /**
     * 输出电压
     * @return outputVoltage
     */
    public Integer getOutputVoltage() {
        return outputVoltage;
    }

    public void setOutputVoltage(Integer outputVoltage) {
        this.outputVoltage = outputVoltage;
    }

    public Power withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Power withActiveStandby(String activeStandby) {
        this.activeStandby = activeStandby;
        return this;
    }

    /**
     * 主备模式
     * @return activeStandby
     */
    public String getActiveStandby() {
        return activeStandby;
    }

    public void setActiveStandby(String activeStandby) {
        this.activeStandby = activeStandby;
    }

    public Power withPartNumber(String partNumber) {
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

    public Power withSerialNumber(String serialNumber) {
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

    public Power withFirmwareVersion(String firmwareVersion) {
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

    public Power withStatus(Status status) {
        this.status = status;
        return this;
    }

    public Power withStatus(Consumer<Status> statusSetter) {
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
        Power that = (Power) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.slotNumber, that.slotNumber)
            && Objects.equals(this.model, that.model) && Objects.equals(this.manufacturer, that.manufacturer)
            && Objects.equals(this.powerSupplyType, that.powerSupplyType)
            && Objects.equals(this.powerCapacityWatts, that.powerCapacityWatts)
            && Objects.equals(this.lineInputVoltage, that.lineInputVoltage)
            && Objects.equals(this.outputVoltage, that.outputVoltage) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.activeStandby, that.activeStandby)
            && Objects.equals(this.partNumber, that.partNumber) && Objects.equals(this.serialNumber, that.serialNumber)
            && Objects.equals(this.firmwareVersion, that.firmwareVersion) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            slotNumber,
            model,
            manufacturer,
            powerSupplyType,
            powerCapacityWatts,
            lineInputVoltage,
            outputVoltage,
            protocol,
            activeStandby,
            partNumber,
            serialNumber,
            firmwareVersion,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Power {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    slotNumber: ").append(toIndentedString(slotNumber)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    powerSupplyType: ").append(toIndentedString(powerSupplyType)).append("\n");
        sb.append("    powerCapacityWatts: ").append(toIndentedString(powerCapacityWatts)).append("\n");
        sb.append("    lineInputVoltage: ").append(toIndentedString(lineInputVoltage)).append("\n");
        sb.append("    outputVoltage: ").append(toIndentedString(outputVoltage)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    activeStandby: ").append(toIndentedString(activeStandby)).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
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
