package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * TrafficControllerDTO
 */
public class TrafficControllerDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_controller_id")

    private String trafficControllerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "esn")

    private String esn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lat")

    private BigDecimal lat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lon")

    private BigDecimal lon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ele")

    private BigDecimal ele;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pos_description")

    private String posDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installation_mode")

    private String installationMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "road_name")

    private String roadName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link_id")

    private String linkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private OffsetDateTime lastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_online_time")

    private OffsetDateTime lastOnlineTime;

    public TrafficControllerDTO withTrafficControllerId(String trafficControllerId) {
        this.trafficControllerId = trafficControllerId;
        return this;
    }

    /**
     * **参数说明**：信号机设备ID，全局唯一。
     * @return trafficControllerId
     */
    public String getTrafficControllerId() {
        return trafficControllerId;
    }

    public void setTrafficControllerId(String trafficControllerId) {
        this.trafficControllerId = trafficControllerId;
    }

    public TrafficControllerDTO withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * \"**参数说明**：序列号。  **取值范围**：长度不超过64，只允许字母、数字、以及_等字符的组合。 
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public TrafficControllerDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrafficControllerDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：描述。  **取值范围**：长度不超过2048，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TrafficControllerDTO withLat(BigDecimal lat) {
        this.lat = lat;
        return this;
    }

    /**
     * **参数说明**：定义纬度数值，北纬为正，南纬为负，单位°，精度小数点后7位。
     * minimum: -9E+1
     * maximum: 9E+1
     * @return lat
     */
    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public TrafficControllerDTO withLon(BigDecimal lon) {
        this.lon = lon;
        return this;
    }

    /**
     * **参数说明**：定义经度数值。东经为正，西经为负，单位°，精度小数点后7位。
     * minimum: -1.8E+2
     * maximum: 1.8E+2
     * @return lon
     */
    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    public TrafficControllerDTO withEle(BigDecimal ele) {
        this.ele = ele;
        return this;
    }

    /**
     * **参数说明**：定义海拔高程，可选，单位为分米。
     * minimum: -4095
     * maximum: 61439
     * @return ele
     */
    public BigDecimal getEle() {
        return ele;
    }

    public void setEle(BigDecimal ele) {
        this.ele = ele;
    }

    public TrafficControllerDTO withPosDescription(String posDescription) {
        this.posDescription = posDescription;
        return this;
    }

    /**
     * **参数说明**：位置说明。  **取值范围**：长度不超过128，只允许字母、数字、以及_等字符的组合。 
     * @return posDescription
     */
    public String getPosDescription() {
        return posDescription;
    }

    public void setPosDescription(String posDescription) {
        this.posDescription = posDescription;
    }

    public TrafficControllerDTO withInstallationMode(String installationMode) {
        this.installationMode = installationMode;
        return this;
    }

    /**
     * **参数说明**：架设方式。  **取值范围**： - columnar：柱式 - road-side-attach：路侧附着式 - cantilever：悬臂式 - gantry：门架式 - lane-above-attach：车行道上方附着式 
     * @return installationMode
     */
    public String getInstallationMode() {
        return installationMode;
    }

    public void setInstallationMode(String installationMode) {
        this.installationMode = installationMode;
    }

    public TrafficControllerDTO withRoadName(String roadName) {
        this.roadName = roadName;
        return this;
    }

    /**
     * **参数说明**：所属道路名称，比如高速名称。  **取值范围**：长度不超过64，只允许汉字、字母、数字、以及_-等字符的组合。 
     * @return roadName
     */
    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public TrafficControllerDTO withLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }

    /**
     * **参数说明**：信号机设备所属路段ID。  **取值范围**：长度等于30，只允许大写字母、数字。 
     * @return linkId
     */
    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public TrafficControllerDTO withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：设备状态。  **取值范围**： - ONLINE：在线 - OFFLINE：离线 - INITIAL：初始化 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TrafficControllerDTO withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * **参数说明**：最后修改的时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z' 例如 2020-09-01T01:37:01Z
     * @return lastModifiedTime
     */
    public OffsetDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public TrafficControllerDTO withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数说明**：创建的时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z' 例如 2020-09-01T01:37:01Z
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public TrafficControllerDTO withLastOnlineTime(OffsetDateTime lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
        return this;
    }

    /**
     * **参数说明**：最后的在线时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z' 例如 2020-09-01T01:37:01Z
     * @return lastOnlineTime
     */
    public OffsetDateTime getLastOnlineTime() {
        return lastOnlineTime;
    }

    public void setLastOnlineTime(OffsetDateTime lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrafficControllerDTO trafficControllerDTO = (TrafficControllerDTO) o;
        return Objects.equals(this.trafficControllerId, trafficControllerDTO.trafficControllerId)
            && Objects.equals(this.esn, trafficControllerDTO.esn)
            && Objects.equals(this.name, trafficControllerDTO.name)
            && Objects.equals(this.description, trafficControllerDTO.description)
            && Objects.equals(this.lat, trafficControllerDTO.lat) && Objects.equals(this.lon, trafficControllerDTO.lon)
            && Objects.equals(this.ele, trafficControllerDTO.ele)
            && Objects.equals(this.posDescription, trafficControllerDTO.posDescription)
            && Objects.equals(this.installationMode, trafficControllerDTO.installationMode)
            && Objects.equals(this.roadName, trafficControllerDTO.roadName)
            && Objects.equals(this.linkId, trafficControllerDTO.linkId)
            && Objects.equals(this.status, trafficControllerDTO.status)
            && Objects.equals(this.lastModifiedTime, trafficControllerDTO.lastModifiedTime)
            && Objects.equals(this.createdTime, trafficControllerDTO.createdTime)
            && Objects.equals(this.lastOnlineTime, trafficControllerDTO.lastOnlineTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficControllerId,
            esn,
            name,
            description,
            lat,
            lon,
            ele,
            posDescription,
            installationMode,
            roadName,
            linkId,
            status,
            lastModifiedTime,
            createdTime,
            lastOnlineTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrafficControllerDTO {\n");
        sb.append("    trafficControllerId: ").append(toIndentedString(trafficControllerId)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
        sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
        sb.append("    ele: ").append(toIndentedString(ele)).append("\n");
        sb.append("    posDescription: ").append(toIndentedString(posDescription)).append("\n");
        sb.append("    installationMode: ").append(toIndentedString(installationMode)).append("\n");
        sb.append("    roadName: ").append(toIndentedString(roadName)).append("\n");
        sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    lastOnlineTime: ").append(toIndentedString(lastOnlineTime)).append("\n");
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
