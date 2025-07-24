package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网络适配器的详细信息，如型号、厂商等
 */
public class NetworkAdapter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_model")

    private String cardModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer")

    private String manufacturer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_manufacturer")

    private String cardManufacturer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private String position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slot_number")

    private Integer slotNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcb_version")

    private String pcbVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_name")

    private String driverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_version")

    private String driverVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_resource")

    private String associatedResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_version")

    private String firmwareVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health")

    private String health;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_ports")

    private List<NetworkPort> networkPorts = null;

    public NetworkAdapter withName(String name) {
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

    public NetworkAdapter withCardModel(String cardModel) {
        this.cardModel = cardModel;
        return this;
    }

    /**
     * 网络适配器的芯片型号
     * @return cardModel
     */
    public String getCardModel() {
        return cardModel;
    }

    public void setCardModel(String cardModel) {
        this.cardModel = cardModel;
    }

    public NetworkAdapter withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 网络适配器的型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public NetworkAdapter withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * 网络适配器的制造商
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public NetworkAdapter withCardManufacturer(String cardManufacturer) {
        this.cardManufacturer = cardManufacturer;
        return this;
    }

    /**
     * 网络适配器的芯片制造商
     * @return cardManufacturer
     */
    public String getCardManufacturer() {
        return cardManufacturer;
    }

    public void setCardManufacturer(String cardManufacturer) {
        this.cardManufacturer = cardManufacturer;
    }

    public NetworkAdapter withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * 网络适配器的位置
     * @return position
     */
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public NetworkAdapter withSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
        return this;
    }

    /**
     * 网络适配器的卡槽号
     * @return slotNumber
     */
    public Integer getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    public NetworkAdapter withPcbVersion(String pcbVersion) {
        this.pcbVersion = pcbVersion;
        return this;
    }

    /**
     * 网络适配器的PCB版本
     * @return pcbVersion
     */
    public String getPcbVersion() {
        return pcbVersion;
    }

    public void setPcbVersion(String pcbVersion) {
        this.pcbVersion = pcbVersion;
    }

    public NetworkAdapter withDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }

    /**
     * 网络适配器的驱动名称
     * @return driverName
     */
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public NetworkAdapter withDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }

    /**
     * 网络适配器的驱动版本
     * @return driverVersion
     */
    public String getDriverVersion() {
        return driverVersion;
    }

    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }

    public NetworkAdapter withAssociatedResource(String associatedResource) {
        this.associatedResource = associatedResource;
        return this;
    }

    /**
     * 网络适配器的资源归属
     * @return associatedResource
     */
    public String getAssociatedResource() {
        return associatedResource;
    }

    public void setAssociatedResource(String associatedResource) {
        this.associatedResource = associatedResource;
    }

    public NetworkAdapter withFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
        return this;
    }

    /**
     * 网络适配器的固件版本
     * @return firmwareVersion
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public NetworkAdapter withHealth(String health) {
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

    public NetworkAdapter withNetworkPorts(List<NetworkPort> networkPorts) {
        this.networkPorts = networkPorts;
        return this;
    }

    public NetworkAdapter addNetworkPortsItem(NetworkPort networkPortsItem) {
        if (this.networkPorts == null) {
            this.networkPorts = new ArrayList<>();
        }
        this.networkPorts.add(networkPortsItem);
        return this;
    }

    public NetworkAdapter withNetworkPorts(Consumer<List<NetworkPort>> networkPortsSetter) {
        if (this.networkPorts == null) {
            this.networkPorts = new ArrayList<>();
        }
        networkPortsSetter.accept(this.networkPorts);
        return this;
    }

    /**
     * 网络端口列表
     * @return networkPorts
     */
    public List<NetworkPort> getNetworkPorts() {
        return networkPorts;
    }

    public void setNetworkPorts(List<NetworkPort> networkPorts) {
        this.networkPorts = networkPorts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkAdapter that = (NetworkAdapter) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.cardModel, that.cardModel)
            && Objects.equals(this.model, that.model) && Objects.equals(this.manufacturer, that.manufacturer)
            && Objects.equals(this.cardManufacturer, that.cardManufacturer)
            && Objects.equals(this.position, that.position) && Objects.equals(this.slotNumber, that.slotNumber)
            && Objects.equals(this.pcbVersion, that.pcbVersion) && Objects.equals(this.driverName, that.driverName)
            && Objects.equals(this.driverVersion, that.driverVersion)
            && Objects.equals(this.associatedResource, that.associatedResource)
            && Objects.equals(this.firmwareVersion, that.firmwareVersion) && Objects.equals(this.health, that.health)
            && Objects.equals(this.networkPorts, that.networkPorts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            cardModel,
            model,
            manufacturer,
            cardManufacturer,
            position,
            slotNumber,
            pcbVersion,
            driverName,
            driverVersion,
            associatedResource,
            firmwareVersion,
            health,
            networkPorts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkAdapter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cardModel: ").append(toIndentedString(cardModel)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    cardManufacturer: ").append(toIndentedString(cardManufacturer)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    slotNumber: ").append(toIndentedString(slotNumber)).append("\n");
        sb.append("    pcbVersion: ").append(toIndentedString(pcbVersion)).append("\n");
        sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
        sb.append("    driverVersion: ").append(toIndentedString(driverVersion)).append("\n");
        sb.append("    associatedResource: ").append(toIndentedString(associatedResource)).append("\n");
        sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
        sb.append("    health: ").append(toIndentedString(health)).append("\n");
        sb.append("    networkPorts: ").append(toIndentedString(networkPorts)).append("\n");
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
