package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ModifyTrafficControllerRequestDTO
 */
public class ModifyTrafficControllerRequestDTO {

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

    public ModifyTrafficControllerRequestDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：名称。  **取值范围**：长度不超过128，只允许汉字、字母、数字、以及_-等字符的组合。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModifyTrafficControllerRequestDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModifyTrafficControllerRequestDTO withLat(BigDecimal lat) {
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

    public ModifyTrafficControllerRequestDTO withLon(BigDecimal lon) {
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

    public ModifyTrafficControllerRequestDTO withEle(BigDecimal ele) {
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

    public ModifyTrafficControllerRequestDTO withPosDescription(String posDescription) {
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

    public ModifyTrafficControllerRequestDTO withInstallationMode(String installationMode) {
        this.installationMode = installationMode;
        return this;
    }

    /**
     * **参数说明**：架设方式。  **取值范围**： - columnar：柱式 - road-side-attach：路侧附着式 - cantilever：悬臂式 - gantry：门架式 - lane-above-attach：车行道上方附着式\" 
     * @return installationMode
     */
    public String getInstallationMode() {
        return installationMode;
    }

    public void setInstallationMode(String installationMode) {
        this.installationMode = installationMode;
    }

    public ModifyTrafficControllerRequestDTO withRoadName(String roadName) {
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

    public ModifyTrafficControllerRequestDTO withLinkId(String linkId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyTrafficControllerRequestDTO modifyTrafficControllerRequestDTO = (ModifyTrafficControllerRequestDTO) o;
        return Objects.equals(this.name, modifyTrafficControllerRequestDTO.name)
            && Objects.equals(this.description, modifyTrafficControllerRequestDTO.description)
            && Objects.equals(this.lat, modifyTrafficControllerRequestDTO.lat)
            && Objects.equals(this.lon, modifyTrafficControllerRequestDTO.lon)
            && Objects.equals(this.ele, modifyTrafficControllerRequestDTO.ele)
            && Objects.equals(this.posDescription, modifyTrafficControllerRequestDTO.posDescription)
            && Objects.equals(this.installationMode, modifyTrafficControllerRequestDTO.installationMode)
            && Objects.equals(this.roadName, modifyTrafficControllerRequestDTO.roadName)
            && Objects.equals(this.linkId, modifyTrafficControllerRequestDTO.linkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, lat, lon, ele, posDescription, installationMode, roadName, linkId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyTrafficControllerRequestDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
        sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
        sb.append("    ele: ").append(toIndentedString(ele)).append("\n");
        sb.append("    posDescription: ").append(toIndentedString(posDescription)).append("\n");
        sb.append("    installationMode: ").append(toIndentedString(installationMode)).append("\n");
        sb.append("    roadName: ").append(toIndentedString(roadName)).append("\n");
        sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
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
