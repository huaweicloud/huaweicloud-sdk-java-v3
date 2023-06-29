package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * V2XEdge模型资源返回对象
 */
public class ModifyV2XEdgeDTO {

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

    private EdgeGeneralConfig edgeGeneralConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_advance_config")

    private Object edgeAdvanceConfig;

    public ModifyV2XEdgeDTO withName(String name) {
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

    public ModifyV2XEdgeDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：Edge描述。  **取值范围**：长度不超过255，只允许中文、字母、数字、以及_.-等字符的组合。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModifyV2XEdgeDTO withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * **参数说明**：设备编码。仅用于一致性检查，不可修改。  **取值范围**：长度不超过64，只允许中文、字母、数字、以及_等字符的组合。
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public ModifyV2XEdgeDTO withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数说明**：网络IP，例如：127.0.0.1。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ModifyV2XEdgeDTO withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数说明**：ITS800,ATLAS 端口号。
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

    public ModifyV2XEdgeDTO withPositionDescription(String positionDescription) {
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

    public ModifyV2XEdgeDTO withLocation(Location location) {
        this.location = location;
        return this;
    }

    public ModifyV2XEdgeDTO withLocation(Consumer<Location> locationSetter) {
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

    public ModifyV2XEdgeDTO withCameraIds(List<String> cameraIds) {
        this.cameraIds = cameraIds;
        return this;
    }

    public ModifyV2XEdgeDTO addCameraIdsItem(String cameraIdsItem) {
        if (this.cameraIds == null) {
            this.cameraIds = new ArrayList<>();
        }
        this.cameraIds.add(cameraIdsItem);
        return this;
    }

    public ModifyV2XEdgeDTO withCameraIds(Consumer<List<String>> cameraIdsSetter) {
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

    public ModifyV2XEdgeDTO withRadarIds(List<String> radarIds) {
        this.radarIds = radarIds;
        return this;
    }

    public ModifyV2XEdgeDTO addRadarIdsItem(String radarIdsItem) {
        if (this.radarIds == null) {
            this.radarIds = new ArrayList<>();
        }
        this.radarIds.add(radarIdsItem);
        return this;
    }

    public ModifyV2XEdgeDTO withRadarIds(Consumer<List<String>> radarIdsSetter) {
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

    public ModifyV2XEdgeDTO withLocalRsus(List<String> localRsus) {
        this.localRsus = localRsus;
        return this;
    }

    public ModifyV2XEdgeDTO addLocalRsusItem(String localRsusItem) {
        if (this.localRsus == null) {
            this.localRsus = new ArrayList<>();
        }
        this.localRsus.add(localRsusItem);
        return this;
    }

    public ModifyV2XEdgeDTO withLocalRsus(Consumer<List<String>> localRsusSetter) {
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

    public ModifyV2XEdgeDTO withEdgeGeneralConfig(EdgeGeneralConfig edgeGeneralConfig) {
        this.edgeGeneralConfig = edgeGeneralConfig;
        return this;
    }

    public ModifyV2XEdgeDTO withEdgeGeneralConfig(Consumer<EdgeGeneralConfig> edgeGeneralConfigSetter) {
        if (this.edgeGeneralConfig == null) {
            this.edgeGeneralConfig = new EdgeGeneralConfig();
            edgeGeneralConfigSetter.accept(this.edgeGeneralConfig);
        }

        return this;
    }

    /**
     * Get edgeGeneralConfig
     * @return edgeGeneralConfig
     */
    public EdgeGeneralConfig getEdgeGeneralConfig() {
        return edgeGeneralConfig;
    }

    public void setEdgeGeneralConfig(EdgeGeneralConfig edgeGeneralConfig) {
        this.edgeGeneralConfig = edgeGeneralConfig;
    }

    public ModifyV2XEdgeDTO withEdgeAdvanceConfig(Object edgeAdvanceConfig) {
        this.edgeAdvanceConfig = edgeAdvanceConfig;
        return this;
    }

    /**
     * **参数说明**：Edge高级配置（请谨慎修改，错误的配置将导致edge不可用），Json格式；如果想要删除整个edge_advance_config可以填写空Object（例如:{}）。如果想移除某个配置项，直接从配置数据中移除相应的属性即可。
     * @return edgeAdvanceConfig
     */
    public Object getEdgeAdvanceConfig() {
        return edgeAdvanceConfig;
    }

    public void setEdgeAdvanceConfig(Object edgeAdvanceConfig) {
        this.edgeAdvanceConfig = edgeAdvanceConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyV2XEdgeDTO that = (ModifyV2XEdgeDTO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.esn, that.esn) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.port, that.port)
            && Objects.equals(this.positionDescription, that.positionDescription)
            && Objects.equals(this.location, that.location) && Objects.equals(this.cameraIds, that.cameraIds)
            && Objects.equals(this.radarIds, that.radarIds) && Objects.equals(this.localRsus, that.localRsus)
            && Objects.equals(this.edgeGeneralConfig, that.edgeGeneralConfig)
            && Objects.equals(this.edgeAdvanceConfig, that.edgeAdvanceConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            esn,
            ip,
            port,
            positionDescription,
            location,
            cameraIds,
            radarIds,
            localRsus,
            edgeGeneralConfig,
            edgeAdvanceConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyV2XEdgeDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    positionDescription: ").append(toIndentedString(positionDescription)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    cameraIds: ").append(toIndentedString(cameraIds)).append("\n");
        sb.append("    radarIds: ").append(toIndentedString(radarIds)).append("\n");
        sb.append("    localRsus: ").append(toIndentedString(localRsus)).append("\n");
        sb.append("    edgeGeneralConfig: ").append(toIndentedString(edgeGeneralConfig)).append("\n");
        sb.append("    edgeAdvanceConfig: ").append(toIndentedString(edgeAdvanceConfig)).append("\n");
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
