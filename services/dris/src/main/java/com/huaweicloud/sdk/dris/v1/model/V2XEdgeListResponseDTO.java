package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * V2XEdge模型资源列表返回对象
 */
public class V2XEdgeListResponseDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "v2x_edge_id")

    private String v2xEdgeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "esn")

    private String esn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_description")

    private String positionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private Location location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    /**
     * **参数说明**：业务通道状态。
     */
    public static final class ChannelStatusEnum {

        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final ChannelStatusEnum ONLINE = new ChannelStatusEnum("ONLINE");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final ChannelStatusEnum OFFLINE = new ChannelStatusEnum("OFFLINE");

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final ChannelStatusEnum UNKNOWN = new ChannelStatusEnum("UNKNOWN");

        private static final Map<String, ChannelStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChannelStatusEnum> createStaticFields() {
            Map<String, ChannelStatusEnum> map = new HashMap<>();
            map.put("ONLINE", ONLINE);
            map.put("OFFLINE", OFFLINE);
            map.put("UNKNOWN", UNKNOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChannelStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChannelStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ChannelStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChannelStatusEnum(value);
            }
            return result;
        }

        public static ChannelStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChannelStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChannelStatusEnum) {
                return this.value.equals(((ChannelStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_status")

    private ChannelStatusEnum channelStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    public V2XEdgeListResponseDTO withV2xEdgeId(String v2xEdgeId) {
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

    public V2XEdgeListResponseDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：V2XEdge的名称  **取值范围**：长度不超过128，只允许中文、字母、数字、以及_.-等字符的组合。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public V2XEdgeListResponseDTO withEsn(String esn) {
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

    public V2XEdgeListResponseDTO withPositionDescription(String positionDescription) {
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

    public V2XEdgeListResponseDTO withLocation(Location location) {
        this.location = location;
        return this;
    }

    public V2XEdgeListResponseDTO withLocation(Consumer<Location> locationSetter) {
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

    public V2XEdgeListResponseDTO withStatus(String status) {
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

    public V2XEdgeListResponseDTO withChannelStatus(ChannelStatusEnum channelStatus) {
        this.channelStatus = channelStatus;
        return this;
    }

    /**
     * **参数说明**：业务通道状态。
     * @return channelStatus
     */
    public ChannelStatusEnum getChannelStatus() {
        return channelStatus;
    }

    public void setChannelStatus(ChannelStatusEnum channelStatus) {
        this.channelStatus = channelStatus;
    }

    public V2XEdgeListResponseDTO withCreatedTime(OffsetDateTime createdTime) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V2XEdgeListResponseDTO v2XEdgeListResponseDTO = (V2XEdgeListResponseDTO) o;
        return Objects.equals(this.v2xEdgeId, v2XEdgeListResponseDTO.v2xEdgeId)
            && Objects.equals(this.name, v2XEdgeListResponseDTO.name)
            && Objects.equals(this.esn, v2XEdgeListResponseDTO.esn)
            && Objects.equals(this.positionDescription, v2XEdgeListResponseDTO.positionDescription)
            && Objects.equals(this.location, v2XEdgeListResponseDTO.location)
            && Objects.equals(this.status, v2XEdgeListResponseDTO.status)
            && Objects.equals(this.channelStatus, v2XEdgeListResponseDTO.channelStatus)
            && Objects.equals(this.createdTime, v2XEdgeListResponseDTO.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v2xEdgeId, name, esn, positionDescription, location, status, channelStatus, createdTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2XEdgeListResponseDTO {\n");
        sb.append("    v2xEdgeId: ").append(toIndentedString(v2xEdgeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    positionDescription: ").append(toIndentedString(positionDescription)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    channelStatus: ").append(toIndentedString(channelStatus)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
