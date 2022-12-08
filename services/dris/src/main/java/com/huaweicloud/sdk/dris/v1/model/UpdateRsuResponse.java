package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateRsuResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsu_id")

    private String rsuId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "esn")

    private String esn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private OffsetDateTime lastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_online_time")

    private OffsetDateTime lastOnlineTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_description")

    private String positionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private RsuLocation location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsu_model_id")

    private String rsuModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intersection_id")

    private String intersectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_edge_num")

    private Integer relatedEdgeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "software_version")

    private String softwareVersion;

    public UpdateRsuResponse withRsuId(String rsuId) {
        this.rsuId = rsuId;
        return this;
    }

    /**
     * **参数说明**：RSU的唯一标识符，在平台创建RSU时由平台生成。
     * @return rsuId
     */
    public String getRsuId() {
        return rsuId;
    }

    public void setRsuId(String rsuId) {
        this.rsuId = rsuId;
    }

    public UpdateRsuResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：RSU的名字。  **取值范围**：长度不低于1不超过128，只允许中文、字母、数字、下划线（_）、连接符（-）的组合。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRsuResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：RSU的描述。  **取值范围**：只允许中文、字母、数字、下划线（_）、中文分号（；）、中文冒号（：）、中文问号（？）、中文感叹号（！）中文逗号（，）、中文句号（。）、英文分号（;）、英文冒号（:）、英文逗号（,）、英文句号（.）、英文问号（?）、英文感叹号（!）、顿号（、）、连接符（-）的组合。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRsuResponse withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * **参数说明**：RSU的设备序列号。  **取值范围**：只允许字母、数字、下划线（_）的组合。
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public UpdateRsuResponse withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * **参数说明**：最后修改的时间。  格式：yyyy-MM-dd'T'HH:mm:ss'Z'  例如 2020-09-01T01:37:01Z
     * @return lastModifiedTime
     */
    public OffsetDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public UpdateRsuResponse withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数说明**：创建的时间。  格式：yyyy-MM-dd'T'HH:mm:ss'Z'  例如 2020-09-01T01:37:01Z
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public UpdateRsuResponse withLastOnlineTime(OffsetDateTime lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
        return this;
    }

    /**
     * **参数说明**：最后的在线时间。  格式：yyyy-MM-dd'T'HH:mm:ss'Z'  例如 2020-09-01T01:37:01Z
     * @return lastOnlineTime
     */
    public OffsetDateTime getLastOnlineTime() {
        return lastOnlineTime;
    }

    public void setLastOnlineTime(OffsetDateTime lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
    }

    public UpdateRsuResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数说明**：RSU的IP。满足IP的格式，例如127.0.0.1。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public UpdateRsuResponse withPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
        return this;
    }

    /**
     * **参数说明**：安装位置编码，由用户自定义。  **取值范围**：长度不低于1不超过128，只允许字母、数字、下划线（_）的组合。
     * @return positionDescription
     */
    public String getPositionDescription() {
        return positionDescription;
    }

    public void setPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
    }

    public UpdateRsuResponse withLocation(RsuLocation location) {
        this.location = location;
        return this;
    }

    public UpdateRsuResponse withLocation(Consumer<RsuLocation> locationSetter) {
        if (this.location == null) {
            this.location = new RsuLocation();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public RsuLocation getLocation() {
        return location;
    }

    public void setLocation(RsuLocation location) {
        this.location = location;
    }

    public UpdateRsuResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：RSU设备状态。  **取值范围**：  - ONLINE：在线  - OFFLINE：离线  - INITIAL：初始化  - UNKNOWN：未知
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateRsuResponse withRsuModelId(String rsuModelId) {
        this.rsuModelId = rsuModelId;
        return this;
    }

    /**
     * **参数说明**：RSU型号ID，用于唯一标识一个RSU型号，在平台创建RSU型号后由平台分配获得，获取方法可参见 [创建RSU型号](https://support.huaweicloud.com/api-v2x/v2x_04_0020.html)。  **取值范围**：长度不低于1不超过36，只允许字母、数字、连接符（-）的组合。  **该字段仅供使用MQTT协议RSU设备的用户输入。使用websocket协议RSU设备的用户需忽略此字段。**
     * @return rsuModelId
     */
    public String getRsuModelId() {
        return rsuModelId;
    }

    public void setRsuModelId(String rsuModelId) {
        this.rsuModelId = rsuModelId;
    }

    public UpdateRsuResponse withIntersectionId(String intersectionId) {
        this.intersectionId = intersectionId;
        return this;
    }

    /**
     * **参数说明**：在地图中，rsu所在区域对应的路口ID，也即区域ID拼接路口ID，格式为：region-node_id。其中路网最基本的构成即节点和节点之间连接的路段。节点可以是路口，也可以是一条 路的端点。一个节点的ID在同一个区域内是唯一的。
     * @return intersectionId
     */
    public String getIntersectionId() {
        return intersectionId;
    }

    public void setIntersectionId(String intersectionId) {
        this.intersectionId = intersectionId;
    }

    public UpdateRsuResponse withRelatedEdgeNum(Integer relatedEdgeNum) {
        this.relatedEdgeNum = relatedEdgeNum;
        return this;
    }

    /**
     * **参数说明**：RSU可关联的Edge的数量。
     * minimum: 0
     * maximum: 64
     * @return relatedEdgeNum
     */
    public Integer getRelatedEdgeNum() {
        return relatedEdgeNum;
    }

    public void setRelatedEdgeNum(Integer relatedEdgeNum) {
        this.relatedEdgeNum = relatedEdgeNum;
    }

    public UpdateRsuResponse withSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }

    /**
     * **参数说明**：RSU的软件版本，由RSU上报其软件版本。
     * @return softwareVersion
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRsuResponse updateRsuResponse = (UpdateRsuResponse) o;
        return Objects.equals(this.rsuId, updateRsuResponse.rsuId) && Objects.equals(this.name, updateRsuResponse.name)
            && Objects.equals(this.description, updateRsuResponse.description)
            && Objects.equals(this.esn, updateRsuResponse.esn)
            && Objects.equals(this.lastModifiedTime, updateRsuResponse.lastModifiedTime)
            && Objects.equals(this.createdTime, updateRsuResponse.createdTime)
            && Objects.equals(this.lastOnlineTime, updateRsuResponse.lastOnlineTime)
            && Objects.equals(this.ip, updateRsuResponse.ip)
            && Objects.equals(this.positionDescription, updateRsuResponse.positionDescription)
            && Objects.equals(this.location, updateRsuResponse.location)
            && Objects.equals(this.status, updateRsuResponse.status)
            && Objects.equals(this.rsuModelId, updateRsuResponse.rsuModelId)
            && Objects.equals(this.intersectionId, updateRsuResponse.intersectionId)
            && Objects.equals(this.relatedEdgeNum, updateRsuResponse.relatedEdgeNum)
            && Objects.equals(this.softwareVersion, updateRsuResponse.softwareVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rsuId,
            name,
            description,
            esn,
            lastModifiedTime,
            createdTime,
            lastOnlineTime,
            ip,
            positionDescription,
            location,
            status,
            rsuModelId,
            intersectionId,
            relatedEdgeNum,
            softwareVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRsuResponse {\n");
        sb.append("    rsuId: ").append(toIndentedString(rsuId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    lastOnlineTime: ").append(toIndentedString(lastOnlineTime)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    positionDescription: ").append(toIndentedString(positionDescription)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    rsuModelId: ").append(toIndentedString(rsuModelId)).append("\n");
        sb.append("    intersectionId: ").append(toIndentedString(intersectionId)).append("\n");
        sb.append("    relatedEdgeNum: ").append(toIndentedString(relatedEdgeNum)).append("\n");
        sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
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
