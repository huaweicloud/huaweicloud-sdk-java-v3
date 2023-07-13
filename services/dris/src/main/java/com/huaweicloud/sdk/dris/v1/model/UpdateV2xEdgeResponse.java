package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateV2xEdgeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "v2x_edge_id")

    private String v2xEdgeId;

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
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hardware_type")

    private String hardwareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_description")

    private String positionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private Location location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_ids")

    private List<String> cameraIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radar_ids")

    private List<String> radarIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_rsus")

    private List<String> localRsus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_general_config")

    private EdgeGeneralConfigInResponse edgeGeneralConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_advance_config")

    private Object edgeAdvanceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private OffsetDateTime lastModifiedTime;

    public UpdateV2xEdgeResponse withV2xEdgeId(String v2xEdgeId) {
        this.v2xEdgeId = v2xEdgeId;
        return this;
    }

    /**
     * **参数说明**：Edge ID，用于唯一标识一个Edge
     * @return v2xEdgeId
     */
    public String getV2xEdgeId() {
        return v2xEdgeId;
    }

    public void setV2xEdgeId(String v2xEdgeId) {
        this.v2xEdgeId = v2xEdgeId;
    }

    public UpdateV2xEdgeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：名称。  **取值范围**：长度不低于1不超过128，只允许中文、字母、数字、下划线（_）、连接符（-）的组合。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateV2xEdgeResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：Edge描述。  **取值范围**：长度不超过255，只允许中文、字母、数字、下划线（_）、中文分号（；）、中文冒号（：）、中文问号（？）、中文感叹号（！）中文逗号（，）、中文句号（。）、英文引号（;）、英文冒号（:）、英文逗号（,）、英文句号（.）、英文问号（?）、英文感叹号（!）、顿号（、）、连接符（-）的组合。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateV2xEdgeResponse withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * **参数说明**：设备编码。  **取值范围**：长度不超过64，只允许字母、数字、以及_等字符的组合。
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public UpdateV2xEdgeResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数说明**：网络IP，例如127.0.0.1。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public UpdateV2xEdgeResponse withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * ITS800,ATLAS 端口号
     * minimum: 0
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public UpdateV2xEdgeResponse withHardwareType(String hardwareType) {
        this.hardwareType = hardwareType;
        return this;
    }

    /**
     * **参数说明**：硬件类型。  **取值范围**：ITS800 或者 ATLAS
     * @return hardwareType
     */
    public String getHardwareType() {
        return hardwareType;
    }

    public void setHardwareType(String hardwareType) {
        this.hardwareType = hardwareType;
    }

    public UpdateV2xEdgeResponse withPositionDescription(String positionDescription) {
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

    public UpdateV2xEdgeResponse withLocation(Location location) {
        this.location = location;
        return this;
    }

    public UpdateV2xEdgeResponse withLocation(Consumer<Location> locationSetter) {
        if (this.location == null) {
            this.location = new Location();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public UpdateV2xEdgeResponse withCameraIds(List<String> cameraIds) {
        this.cameraIds = cameraIds;
        return this;
    }

    public UpdateV2xEdgeResponse addCameraIdsItem(String cameraIdsItem) {
        if (this.cameraIds == null) {
            this.cameraIds = new ArrayList<>();
        }
        this.cameraIds.add(cameraIdsItem);
        return this;
    }

    public UpdateV2xEdgeResponse withCameraIds(Consumer<List<String>> cameraIdsSetter) {
        if (this.cameraIds == null) {
            this.cameraIds = new ArrayList<>();
        }
        cameraIdsSetter.accept(this.cameraIds);
        return this;
    }

    /**
     * **参数说明**：摄像头ID列表。
     * @return cameraIds
     */
    public List<String> getCameraIds() {
        return cameraIds;
    }

    public void setCameraIds(List<String> cameraIds) {
        this.cameraIds = cameraIds;
    }

    public UpdateV2xEdgeResponse withRadarIds(List<String> radarIds) {
        this.radarIds = radarIds;
        return this;
    }

    public UpdateV2xEdgeResponse addRadarIdsItem(String radarIdsItem) {
        if (this.radarIds == null) {
            this.radarIds = new ArrayList<>();
        }
        this.radarIds.add(radarIdsItem);
        return this;
    }

    public UpdateV2xEdgeResponse withRadarIds(Consumer<List<String>> radarIdsSetter) {
        if (this.radarIds == null) {
            this.radarIds = new ArrayList<>();
        }
        radarIdsSetter.accept(this.radarIds);
        return this;
    }

    /**
     * **参数说明**：雷达ID列表。
     * @return radarIds
     */
    public List<String> getRadarIds() {
        return radarIds;
    }

    public void setRadarIds(List<String> radarIds) {
        this.radarIds = radarIds;
    }

    public UpdateV2xEdgeResponse withLocalRsus(List<String> localRsus) {
        this.localRsus = localRsus;
        return this;
    }

    public UpdateV2xEdgeResponse addLocalRsusItem(String localRsusItem) {
        if (this.localRsus == null) {
            this.localRsus = new ArrayList<>();
        }
        this.localRsus.add(localRsusItem);
        return this;
    }

    public UpdateV2xEdgeResponse withLocalRsus(Consumer<List<String>> localRsusSetter) {
        if (this.localRsus == null) {
            this.localRsus = new ArrayList<>();
        }
        localRsusSetter.accept(this.localRsus);
        return this;
    }

    /**
     * **参数说明**：Edge关联的本地RSU列表。
     * @return localRsus
     */
    public List<String> getLocalRsus() {
        return localRsus;
    }

    public void setLocalRsus(List<String> localRsus) {
        this.localRsus = localRsus;
    }

    public UpdateV2xEdgeResponse withEdgeGeneralConfig(EdgeGeneralConfigInResponse edgeGeneralConfig) {
        this.edgeGeneralConfig = edgeGeneralConfig;
        return this;
    }

    public UpdateV2xEdgeResponse withEdgeGeneralConfig(Consumer<EdgeGeneralConfigInResponse> edgeGeneralConfigSetter) {
        if (this.edgeGeneralConfig == null) {
            this.edgeGeneralConfig = new EdgeGeneralConfigInResponse();
            edgeGeneralConfigSetter.accept(this.edgeGeneralConfig);
        }

        return this;
    }

    /**
     * Get edgeGeneralConfig
     * @return edgeGeneralConfig
     */
    public EdgeGeneralConfigInResponse getEdgeGeneralConfig() {
        return edgeGeneralConfig;
    }

    public void setEdgeGeneralConfig(EdgeGeneralConfigInResponse edgeGeneralConfig) {
        this.edgeGeneralConfig = edgeGeneralConfig;
    }

    public UpdateV2xEdgeResponse withEdgeAdvanceConfig(Object edgeAdvanceConfig) {
        this.edgeAdvanceConfig = edgeAdvanceConfig;
        return this;
    }

    /**
     * Edge高级配置，Json格式
     * @return edgeAdvanceConfig
     */
    public Object getEdgeAdvanceConfig() {
        return edgeAdvanceConfig;
    }

    public void setEdgeAdvanceConfig(Object edgeAdvanceConfig) {
        this.edgeAdvanceConfig = edgeAdvanceConfig;
    }

    public UpdateV2xEdgeResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * \"**参数说明**：状态。  **取值范围**： - UNINSTALLED： 待部署 - INSTALLED：部署中 - OFFLINE：离线 - ONLINE：在线： - UPGRADING：升级中 - DELETING：删除中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateV2xEdgeResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 边缘管理服务返回的node_id，用于关联EdgeManager的资源
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public UpdateV2xEdgeResponse withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数说明**：创建时间。  格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public UpdateV2xEdgeResponse withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * **参数说明**：创建时间。  格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。
     * @return lastModifiedTime
     */
    public OffsetDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateV2xEdgeResponse that = (UpdateV2xEdgeResponse) obj;
        return Objects.equals(this.v2xEdgeId, that.v2xEdgeId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.esn, that.esn)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.port, that.port)
            && Objects.equals(this.hardwareType, that.hardwareType)
            && Objects.equals(this.positionDescription, that.positionDescription)
            && Objects.equals(this.location, that.location) && Objects.equals(this.cameraIds, that.cameraIds)
            && Objects.equals(this.radarIds, that.radarIds) && Objects.equals(this.localRsus, that.localRsus)
            && Objects.equals(this.edgeGeneralConfig, that.edgeGeneralConfig)
            && Objects.equals(this.edgeAdvanceConfig, that.edgeAdvanceConfig)
            && Objects.equals(this.status, that.status) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.lastModifiedTime, that.lastModifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v2xEdgeId,
            name,
            description,
            esn,
            ip,
            port,
            hardwareType,
            positionDescription,
            location,
            cameraIds,
            radarIds,
            localRsus,
            edgeGeneralConfig,
            edgeAdvanceConfig,
            status,
            nodeId,
            createdTime,
            lastModifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateV2xEdgeResponse {\n");
        sb.append("    v2xEdgeId: ").append(toIndentedString(v2xEdgeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    hardwareType: ").append(toIndentedString(hardwareType)).append("\n");
        sb.append("    positionDescription: ").append(toIndentedString(positionDescription)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    cameraIds: ").append(toIndentedString(cameraIds)).append("\n");
        sb.append("    radarIds: ").append(toIndentedString(radarIds)).append("\n");
        sb.append("    localRsus: ").append(toIndentedString(localRsus)).append("\n");
        sb.append("    edgeGeneralConfig: ").append(toIndentedString(edgeGeneralConfig)).append("\n");
        sb.append("    edgeAdvanceConfig: ").append(toIndentedString(edgeAdvanceConfig)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
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
