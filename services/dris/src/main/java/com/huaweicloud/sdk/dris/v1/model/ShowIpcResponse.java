package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowIpcResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_id")

    private String cameraId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "v2x_edge_id")

    private String v2xEdgeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_id")

    private String crossId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "focal_type")

    private String focalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_connect_code")

    private String parentConnectCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_code")

    private String connectCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "esn")

    private String esn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    /**
     * **参数说明**：摄像机的状态。  **取值范围**：  - ONLINE：在线   - OFFLINE：离线  - INITIAL：初始化  - UNKNOWN：未知   - SLEEP：休眠
     */
    public static final class StatusEnum {

        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final StatusEnum ONLINE = new StatusEnum("ONLINE");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final StatusEnum OFFLINE = new StatusEnum("OFFLINE");

        /**
         * Enum INITIAL for value: "INITIAL"
         */
        public static final StatusEnum INITIAL = new StatusEnum("INITIAL");

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final StatusEnum UNKNOWN = new StatusEnum("UNKNOWN");

        /**
         * Enum SLEEP for value: "SLEEP"
         */
        public static final StatusEnum SLEEP = new StatusEnum("SLEEP");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ONLINE", ONLINE);
            map.put("OFFLINE", OFFLINE);
            map.put("INITIAL", INITIAL);
            map.put("UNKNOWN", UNKNOWN);
            map.put("SLEEP", SLEEP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private OffsetDateTime lastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_online_time")

    private OffsetDateTime lastOnlineTime;

    public ShowIpcResponse withCameraId(String cameraId) {
        this.cameraId = cameraId;
        return this;
    }

    /**
     * **参数说明**：摄像头ID，console界面查询摄像头IPC列表中的设备Id。
     * @return cameraId
     */
    public String getCameraId() {
        return cameraId;
    }

    public void setCameraId(String cameraId) {
        this.cameraId = cameraId;
    }

    public ShowIpcResponse withV2xEdgeId(String v2xEdgeId) {
        this.v2xEdgeId = v2xEdgeId;
        return this;
    }

    /**
     * **参数说明**：Edge ID，用于唯一标识一个Edge，创建Edge后获得。方法参见 [创建Edge](https://support.huaweicloud.com/api-v2x/v2x_04_0078.html)。
     * @return v2xEdgeId
     */
    public String getV2xEdgeId() {
        return v2xEdgeId;
    }

    public void setV2xEdgeId(String v2xEdgeId) {
        this.v2xEdgeId = v2xEdgeId;
    }

    public ShowIpcResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：摄像头名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowIpcResponse withCrossId(String crossId) {
        this.crossId = crossId;
        return this;
    }

    /**
     * **参数说明**：摄像头所感知的路口或者路段的Id。
     * @return crossId
     */
    public String getCrossId() {
        return crossId;
    }

    public void setCrossId(String crossId) {
        this.crossId = crossId;
    }

    public ShowIpcResponse withFocalType(String focalType) {
        this.focalType = focalType;
        return this;
    }

    /**
     * **参数说明**：摄像头聚焦类型。  - long：长焦  - short：短焦
     * @return focalType
     */
    public String getFocalType() {
        return focalType;
    }

    public void setFocalType(String focalType) {
        this.focalType = focalType;
    }

    public ShowIpcResponse withParentConnectCode(String parentConnectCode) {
        this.parentConnectCode = parentConnectCode;
        return this;
    }

    /**
     * **参数说明**：摄像头连接的ITS800的互联编码。
     * @return parentConnectCode
     */
    public String getParentConnectCode() {
        return parentConnectCode;
    }

    public void setParentConnectCode(String parentConnectCode) {
        this.parentConnectCode = parentConnectCode;
    }

    public ShowIpcResponse withConnectCode(String connectCode) {
        this.connectCode = connectCode;
        return this;
    }

    /**
     * **参数说明**：摄像头的互联编码。
     * @return connectCode
     */
    public String getConnectCode() {
        return connectCode;
    }

    public void setConnectCode(String connectCode) {
        this.connectCode = connectCode;
    }

    public ShowIpcResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowIpcResponse withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * **参数说明**：IPC的设备编码。
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public ShowIpcResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数说明**：该摄像头的ip地址。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ShowIpcResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：摄像机的状态。  **取值范围**：  - ONLINE：在线   - OFFLINE：离线  - INITIAL：初始化  - UNKNOWN：未知   - SLEEP：休眠
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowIpcResponse withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数说明**：创建时间。            格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public ShowIpcResponse withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * **参数说明**：最后修改时间。            格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。
     * @return lastModifiedTime
     */
    public OffsetDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public ShowIpcResponse withLastOnlineTime(OffsetDateTime lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
        return this;
    }

    /**
     * **参数说明**：最后在线时间。          格式：yyyy-MM-dd''T''HH:mm:ss''Z''。  例如 2020-09-01T01:37:01Z。
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
        ShowIpcResponse showIpcResponse = (ShowIpcResponse) o;
        return Objects.equals(this.cameraId, showIpcResponse.cameraId)
            && Objects.equals(this.v2xEdgeId, showIpcResponse.v2xEdgeId)
            && Objects.equals(this.name, showIpcResponse.name) && Objects.equals(this.crossId, showIpcResponse.crossId)
            && Objects.equals(this.focalType, showIpcResponse.focalType)
            && Objects.equals(this.parentConnectCode, showIpcResponse.parentConnectCode)
            && Objects.equals(this.connectCode, showIpcResponse.connectCode)
            && Objects.equals(this.description, showIpcResponse.description)
            && Objects.equals(this.esn, showIpcResponse.esn) && Objects.equals(this.ip, showIpcResponse.ip)
            && Objects.equals(this.status, showIpcResponse.status)
            && Objects.equals(this.createdTime, showIpcResponse.createdTime)
            && Objects.equals(this.lastModifiedTime, showIpcResponse.lastModifiedTime)
            && Objects.equals(this.lastOnlineTime, showIpcResponse.lastOnlineTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cameraId,
            v2xEdgeId,
            name,
            crossId,
            focalType,
            parentConnectCode,
            connectCode,
            description,
            esn,
            ip,
            status,
            createdTime,
            lastModifiedTime,
            lastOnlineTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpcResponse {\n");
        sb.append("    cameraId: ").append(toIndentedString(cameraId)).append("\n");
        sb.append("    v2xEdgeId: ").append(toIndentedString(v2xEdgeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    crossId: ").append(toIndentedString(crossId)).append("\n");
        sb.append("    focalType: ").append(toIndentedString(focalType)).append("\n");
        sb.append("    parentConnectCode: ").append(toIndentedString(parentConnectCode)).append("\n");
        sb.append("    connectCode: ").append(toIndentedString(connectCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
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
