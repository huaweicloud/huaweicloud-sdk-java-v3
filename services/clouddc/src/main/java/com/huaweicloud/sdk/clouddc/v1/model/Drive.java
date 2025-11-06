package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 驱动器详细信息，如型号、厂商等
 */
public class Drive {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer")

    private String manufacturer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revision")

    private String revision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media_type")

    private String mediaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sas_address")

    private String sasAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity_bytes")

    private Long capacityBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capable_speed_gbs")

    private Integer capableSpeedGbs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "negotiated_speed_gbs")

    private Integer negotiatedSpeedGbs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotspare_type")

    private String hotspareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hours_of_powered_up")

    private Integer hoursOfPoweredUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_state")

    private String powerState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patrol_state")

    private String patrolState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_resource")

    private String associatedResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "predicted_media_life_left_percent")

    private Integer predictedMediaLifeLeftPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health")

    private String health;

    public Drive withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 驱动器资源的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Drive withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 驱动器资源的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drive withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * 驱动器的制造商
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Drive withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 驱动器型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Drive withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 驱动器的序列号
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Drive withRevision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * 驱动器的版本信息
     * @return revision
     */
    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public Drive withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * 驱动器的介质类型
     * @return mediaType
     */
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Drive withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 驱动器遵从的协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Drive withSasAddress(String sasAddress) {
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

    public Drive withCapacityBytes(Long capacityBytes) {
        this.capacityBytes = capacityBytes;
        return this;
    }

    /**
     * 容量（单位：byte）
     * @return capacityBytes
     */
    public Long getCapacityBytes() {
        return capacityBytes;
    }

    public void setCapacityBytes(Long capacityBytes) {
        this.capacityBytes = capacityBytes;
    }

    public Drive withCapableSpeedGbs(Integer capableSpeedGbs) {
        this.capableSpeedGbs = capableSpeedGbs;
        return this;
    }

    /**
     * 驱动器接口的最大速率（单位：Gbps）
     * @return capableSpeedGbs
     */
    public Integer getCapableSpeedGbs() {
        return capableSpeedGbs;
    }

    public void setCapableSpeedGbs(Integer capableSpeedGbs) {
        this.capableSpeedGbs = capableSpeedGbs;
    }

    public Drive withNegotiatedSpeedGbs(Integer negotiatedSpeedGbs) {
        this.negotiatedSpeedGbs = negotiatedSpeedGbs;
        return this;
    }

    /**
     * 驱动器接口的协商速率（单位：Gbps）
     * @return negotiatedSpeedGbs
     */
    public Integer getNegotiatedSpeedGbs() {
        return negotiatedSpeedGbs;
    }

    public void setNegotiatedSpeedGbs(Integer negotiatedSpeedGbs) {
        this.negotiatedSpeedGbs = negotiatedSpeedGbs;
    }

    public Drive withHotspareType(String hotspareType) {
        this.hotspareType = hotspareType;
        return this;
    }

    /**
     * 驱动器的热备状态
     * @return hotspareType
     */
    public String getHotspareType() {
        return hotspareType;
    }

    public void setHotspareType(String hotspareType) {
        this.hotspareType = hotspareType;
    }

    public Drive withHoursOfPoweredUp(Integer hoursOfPoweredUp) {
        this.hoursOfPoweredUp = hoursOfPoweredUp;
        return this;
    }

    /**
     * 驱动器上电运行时间（单位：h）
     * @return hoursOfPoweredUp
     */
    public Integer getHoursOfPoweredUp() {
        return hoursOfPoweredUp;
    }

    public void setHoursOfPoweredUp(Integer hoursOfPoweredUp) {
        this.hoursOfPoweredUp = hoursOfPoweredUp;
    }

    public Drive withPowerState(String powerState) {
        this.powerState = powerState;
        return this;
    }

    /**
     * 驱动器电源状态
     * @return powerState
     */
    public String getPowerState() {
        return powerState;
    }

    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }

    public Drive withPatrolState(String patrolState) {
        this.patrolState = patrolState;
        return this;
    }

    /**
     * 驱动器巡检状态
     * @return patrolState
     */
    public String getPatrolState() {
        return patrolState;
    }

    public void setPatrolState(String patrolState) {
        this.patrolState = patrolState;
    }

    public Drive withAssociatedResource(String associatedResource) {
        this.associatedResource = associatedResource;
        return this;
    }

    /**
     * 驱动器的资源归属
     * @return associatedResource
     */
    public String getAssociatedResource() {
        return associatedResource;
    }

    public void setAssociatedResource(String associatedResource) {
        this.associatedResource = associatedResource;
    }

    public Drive withPredictedMediaLifeLeftPercent(Integer predictedMediaLifeLeftPercent) {
        this.predictedMediaLifeLeftPercent = predictedMediaLifeLeftPercent;
        return this;
    }

    /**
     * 驱动器的剩余寿命百分比
     * @return predictedMediaLifeLeftPercent
     */
    public Integer getPredictedMediaLifeLeftPercent() {
        return predictedMediaLifeLeftPercent;
    }

    public void setPredictedMediaLifeLeftPercent(Integer predictedMediaLifeLeftPercent) {
        this.predictedMediaLifeLeftPercent = predictedMediaLifeLeftPercent;
    }

    public Drive withHealth(String health) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Drive that = (Drive) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.manufacturer, that.manufacturer) && Objects.equals(this.model, that.model)
            && Objects.equals(this.serialNumber, that.serialNumber) && Objects.equals(this.revision, that.revision)
            && Objects.equals(this.mediaType, that.mediaType) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.sasAddress, that.sasAddress)
            && Objects.equals(this.capacityBytes, that.capacityBytes)
            && Objects.equals(this.capableSpeedGbs, that.capableSpeedGbs)
            && Objects.equals(this.negotiatedSpeedGbs, that.negotiatedSpeedGbs)
            && Objects.equals(this.hotspareType, that.hotspareType)
            && Objects.equals(this.hoursOfPoweredUp, that.hoursOfPoweredUp)
            && Objects.equals(this.powerState, that.powerState) && Objects.equals(this.patrolState, that.patrolState)
            && Objects.equals(this.associatedResource, that.associatedResource)
            && Objects.equals(this.predictedMediaLifeLeftPercent, that.predictedMediaLifeLeftPercent)
            && Objects.equals(this.health, that.health);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            manufacturer,
            model,
            serialNumber,
            revision,
            mediaType,
            protocol,
            sasAddress,
            capacityBytes,
            capableSpeedGbs,
            negotiatedSpeedGbs,
            hotspareType,
            hoursOfPoweredUp,
            powerState,
            patrolState,
            associatedResource,
            predictedMediaLifeLeftPercent,
            health);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Drive {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sasAddress: ").append(toIndentedString(sasAddress)).append("\n");
        sb.append("    capacityBytes: ").append(toIndentedString(capacityBytes)).append("\n");
        sb.append("    capableSpeedGbs: ").append(toIndentedString(capableSpeedGbs)).append("\n");
        sb.append("    negotiatedSpeedGbs: ").append(toIndentedString(negotiatedSpeedGbs)).append("\n");
        sb.append("    hotspareType: ").append(toIndentedString(hotspareType)).append("\n");
        sb.append("    hoursOfPoweredUp: ").append(toIndentedString(hoursOfPoweredUp)).append("\n");
        sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
        sb.append("    patrolState: ").append(toIndentedString(patrolState)).append("\n");
        sb.append("    associatedResource: ").append(toIndentedString(associatedResource)).append("\n");
        sb.append("    predictedMediaLifeLeftPercent: ")
            .append(toIndentedString(predictedMediaLifeLeftPercent))
            .append("\n");
        sb.append("    health: ").append(toIndentedString(health)).append("\n");
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
