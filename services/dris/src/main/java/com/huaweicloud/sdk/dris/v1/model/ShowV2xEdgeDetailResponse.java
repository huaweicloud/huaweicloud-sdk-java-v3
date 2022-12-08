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
public class ShowV2xEdgeDetailResponse extends SdkResponse {

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
    @JsonProperty(value = "cameras")

    private List<IdAndStatus> cameras = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radars")

    private List<IdAndStatus> radars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_rsus")

    private List<IdAndStatus> localRsus = null;

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
    @JsonProperty(value = "channel_status")

    private String channelStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private OffsetDateTime lastModifiedTime;

    public ShowV2xEdgeDetailResponse withV2xEdgeId(String v2xEdgeId) {
        this.v2xEdgeId = v2xEdgeId;
        return this;
    }

    /**
     * **参数说明**：Edge ID，用于唯一标识一个Edge。
     * @return v2xEdgeId
     */
    public String getV2xEdgeId() {
        return v2xEdgeId;
    }

    public void setV2xEdgeId(String v2xEdgeId) {
        this.v2xEdgeId = v2xEdgeId;
    }

    public ShowV2xEdgeDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：名称。  **取值范围**：长度不超过128，只允许中文、字母、数字、以及_.-等字符的组合。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowV2xEdgeDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：Edge描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowV2xEdgeDetailResponse withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * **参数说明**：序列号。  **取值范围**：长度不超过64，只允许字母、数字、以及_等字符的组合。
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public ShowV2xEdgeDetailResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数说明**：网络I，例如127.0.0.1。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ShowV2xEdgeDetailResponse withPort(Integer port) {
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

    public ShowV2xEdgeDetailResponse withHardwareType(String hardwareType) {
        this.hardwareType = hardwareType;
        return this;
    }

    /**
     * **参数说明**：硬件类型。  **取值范围**：ITS800 或者 ATLAS。
     * @return hardwareType
     */
    public String getHardwareType() {
        return hardwareType;
    }

    public void setHardwareType(String hardwareType) {
        this.hardwareType = hardwareType;
    }

    public ShowV2xEdgeDetailResponse withPositionDescription(String positionDescription) {
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

    public ShowV2xEdgeDetailResponse withLocation(Location location) {
        this.location = location;
        return this;
    }

    public ShowV2xEdgeDetailResponse withLocation(Consumer<Location> locationSetter) {
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

    public ShowV2xEdgeDetailResponse withCameras(List<IdAndStatus> cameras) {
        this.cameras = cameras;
        return this;
    }

    public ShowV2xEdgeDetailResponse addCamerasItem(IdAndStatus camerasItem) {
        if (this.cameras == null) {
            this.cameras = new ArrayList<>();
        }
        this.cameras.add(camerasItem);
        return this;
    }

    public ShowV2xEdgeDetailResponse withCameras(Consumer<List<IdAndStatus>> camerasSetter) {
        if (this.cameras == null) {
            this.cameras = new ArrayList<>();
        }
        camerasSetter.accept(this.cameras);
        return this;
    }

    /**
     * **参数说明**：Edge关联的摄像头列表。
     * @return cameras
     */
    public List<IdAndStatus> getCameras() {
        return cameras;
    }

    public void setCameras(List<IdAndStatus> cameras) {
        this.cameras = cameras;
    }

    public ShowV2xEdgeDetailResponse withRadars(List<IdAndStatus> radars) {
        this.radars = radars;
        return this;
    }

    public ShowV2xEdgeDetailResponse addRadarsItem(IdAndStatus radarsItem) {
        if (this.radars == null) {
            this.radars = new ArrayList<>();
        }
        this.radars.add(radarsItem);
        return this;
    }

    public ShowV2xEdgeDetailResponse withRadars(Consumer<List<IdAndStatus>> radarsSetter) {
        if (this.radars == null) {
            this.radars = new ArrayList<>();
        }
        radarsSetter.accept(this.radars);
        return this;
    }

    /**
     * **参数说明**：Edge关联的雷达列表。
     * @return radars
     */
    public List<IdAndStatus> getRadars() {
        return radars;
    }

    public void setRadars(List<IdAndStatus> radars) {
        this.radars = radars;
    }

    public ShowV2xEdgeDetailResponse withLocalRsus(List<IdAndStatus> localRsus) {
        this.localRsus = localRsus;
        return this;
    }

    public ShowV2xEdgeDetailResponse addLocalRsusItem(IdAndStatus localRsusItem) {
        if (this.localRsus == null) {
            this.localRsus = new ArrayList<>();
        }
        this.localRsus.add(localRsusItem);
        return this;
    }

    public ShowV2xEdgeDetailResponse withLocalRsus(Consumer<List<IdAndStatus>> localRsusSetter) {
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
    public List<IdAndStatus> getLocalRsus() {
        return localRsus;
    }

    public void setLocalRsus(List<IdAndStatus> localRsus) {
        this.localRsus = localRsus;
    }

    public ShowV2xEdgeDetailResponse withEdgeGeneralConfig(EdgeGeneralConfigInResponse edgeGeneralConfig) {
        this.edgeGeneralConfig = edgeGeneralConfig;
        return this;
    }

    public ShowV2xEdgeDetailResponse withEdgeGeneralConfig(
        Consumer<EdgeGeneralConfigInResponse> edgeGeneralConfigSetter) {
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

    public ShowV2xEdgeDetailResponse withEdgeAdvanceConfig(Object edgeAdvanceConfig) {
        this.edgeAdvanceConfig = edgeAdvanceConfig;
        return this;
    }

    /**
     * **参数说明**：Edge高级配置，Json格式
     * @return edgeAdvanceConfig
     */
    public Object getEdgeAdvanceConfig() {
        return edgeAdvanceConfig;
    }

    public void setEdgeAdvanceConfig(Object edgeAdvanceConfig) {
        this.edgeAdvanceConfig = edgeAdvanceConfig;
    }

    public ShowV2xEdgeDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：状态。  **取值范围**： - UNINSTALLED： 待部署 - INSTALLED：部署中 - OFFLINE：离线 - ONLINE：在线： - UPGRADING：升级中 - DELETING：删除中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowV2xEdgeDetailResponse withChannelStatus(String channelStatus) {
        this.channelStatus = channelStatus;
        return this;
    }

    /**
     * **参数说明**：业务通道状态。  **取值范围**： - ONLINE：在线 - OFFLINE：离线 - INITIAL：初始化
     * @return channelStatus
     */
    public String getChannelStatus() {
        return channelStatus;
    }

    public void setChannelStatus(String channelStatus) {
        this.channelStatus = channelStatus;
    }

    public ShowV2xEdgeDetailResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数说明**：边缘管理服务返回的node_id，用于关联EdgeManager的资源。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ShowV2xEdgeDetailResponse withCreatedTime(OffsetDateTime createdTime) {
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

    public ShowV2xEdgeDetailResponse withLastModifiedTime(OffsetDateTime lastModifiedTime) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowV2xEdgeDetailResponse showV2xEdgeDetailResponse = (ShowV2xEdgeDetailResponse) o;
        return Objects.equals(this.v2xEdgeId, showV2xEdgeDetailResponse.v2xEdgeId)
            && Objects.equals(this.name, showV2xEdgeDetailResponse.name)
            && Objects.equals(this.description, showV2xEdgeDetailResponse.description)
            && Objects.equals(this.esn, showV2xEdgeDetailResponse.esn)
            && Objects.equals(this.ip, showV2xEdgeDetailResponse.ip)
            && Objects.equals(this.port, showV2xEdgeDetailResponse.port)
            && Objects.equals(this.hardwareType, showV2xEdgeDetailResponse.hardwareType)
            && Objects.equals(this.positionDescription, showV2xEdgeDetailResponse.positionDescription)
            && Objects.equals(this.location, showV2xEdgeDetailResponse.location)
            && Objects.equals(this.cameras, showV2xEdgeDetailResponse.cameras)
            && Objects.equals(this.radars, showV2xEdgeDetailResponse.radars)
            && Objects.equals(this.localRsus, showV2xEdgeDetailResponse.localRsus)
            && Objects.equals(this.edgeGeneralConfig, showV2xEdgeDetailResponse.edgeGeneralConfig)
            && Objects.equals(this.edgeAdvanceConfig, showV2xEdgeDetailResponse.edgeAdvanceConfig)
            && Objects.equals(this.status, showV2xEdgeDetailResponse.status)
            && Objects.equals(this.channelStatus, showV2xEdgeDetailResponse.channelStatus)
            && Objects.equals(this.nodeId, showV2xEdgeDetailResponse.nodeId)
            && Objects.equals(this.createdTime, showV2xEdgeDetailResponse.createdTime)
            && Objects.equals(this.lastModifiedTime, showV2xEdgeDetailResponse.lastModifiedTime);
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
            cameras,
            radars,
            localRsus,
            edgeGeneralConfig,
            edgeAdvanceConfig,
            status,
            channelStatus,
            nodeId,
            createdTime,
            lastModifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowV2xEdgeDetailResponse {\n");
        sb.append("    v2xEdgeId: ").append(toIndentedString(v2xEdgeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    hardwareType: ").append(toIndentedString(hardwareType)).append("\n");
        sb.append("    positionDescription: ").append(toIndentedString(positionDescription)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    cameras: ").append(toIndentedString(cameras)).append("\n");
        sb.append("    radars: ").append(toIndentedString(radars)).append("\n");
        sb.append("    localRsus: ").append(toIndentedString(localRsus)).append("\n");
        sb.append("    edgeGeneralConfig: ").append(toIndentedString(edgeGeneralConfig)).append("\n");
        sb.append("    edgeAdvanceConfig: ").append(toIndentedString(edgeAdvanceConfig)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    channelStatus: ").append(toIndentedString(channelStatus)).append("\n");
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
