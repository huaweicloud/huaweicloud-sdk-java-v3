package com.huaweicloud.sdk.ec.v1.model;

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
public class UpdateEquipmentInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ieg_id")

    private String iegId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "esn")

    private String esn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 设备类型
     */
    public static final class TypeEnum {

        /**
         * Enum STANDARD for value: "standard"
         */
        public static final TypeEnum STANDARD = new TypeEnum("standard");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("standard", STANDARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /**
     * 高可用类型
     */
    public static final class HaTypeEnum {

        /**
         * Enum ACTIVE for value: "Active"
         */
        public static final HaTypeEnum ACTIVE = new HaTypeEnum("Active");

        /**
         * Enum STANDBY for value: "Standby"
         */
        public static final HaTypeEnum STANDBY = new HaTypeEnum("Standby");

        private static final Map<String, HaTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HaTypeEnum> createStaticFields() {
            Map<String, HaTypeEnum> map = new HashMap<>();
            map.put("Active", ACTIVE);
            map.put("Standby", STANDBY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HaTypeEnum(String value) {
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
        public static HaTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HaTypeEnum(value));
        }

        public static HaTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HaTypeEnum) {
                return this.value.equals(((HaTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_type")

    private HaTypeEnum haType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_at")

    private OffsetDateTime activeAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "go_live_at")

    private OffsetDateTime goLiveAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_up_at")

    private OffsetDateTime startUpAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_access_status")

    private String cloudAccessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public UpdateEquipmentInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 智能企业网关设备ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateEquipmentInfoResponse withIegId(String iegId) {
        this.iegId = iegId;
        return this;
    }

    /**
     * 智能企业网关ID
     * @return iegId
     */
    public String getIegId() {
        return iegId;
    }

    public void setIegId(String iegId) {
        this.iegId = iegId;
    }

    public UpdateEquipmentInfoResponse withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * esn
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public UpdateEquipmentInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设备名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateEquipmentInfoResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 设备类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateEquipmentInfoResponse withHaType(HaTypeEnum haType) {
        this.haType = haType;
        return this;
    }

    /**
     * 高可用类型
     * @return haType
     */
    public HaTypeEnum getHaType() {
        return haType;
    }

    public void setHaType(HaTypeEnum haType) {
        this.haType = haType;
    }

    public UpdateEquipmentInfoResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 设备软件版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpdateEquipmentInfoResponse withActiveAt(OffsetDateTime activeAt) {
        this.activeAt = activeAt;
        return this;
    }

    /**
     * 激活时间
     * @return activeAt
     */
    public OffsetDateTime getActiveAt() {
        return activeAt;
    }

    public void setActiveAt(OffsetDateTime activeAt) {
        this.activeAt = activeAt;
    }

    public UpdateEquipmentInfoResponse withGoLiveAt(OffsetDateTime goLiveAt) {
        this.goLiveAt = goLiveAt;
        return this;
    }

    /**
     * 上线时间
     * @return goLiveAt
     */
    public OffsetDateTime getGoLiveAt() {
        return goLiveAt;
    }

    public void setGoLiveAt(OffsetDateTime goLiveAt) {
        this.goLiveAt = goLiveAt;
    }

    public UpdateEquipmentInfoResponse withStartUpAt(OffsetDateTime startUpAt) {
        this.startUpAt = startUpAt;
        return this;
    }

    /**
     * 设备启动时间
     * @return startUpAt
     */
    public OffsetDateTime getStartUpAt() {
        return startUpAt;
    }

    public void setStartUpAt(OffsetDateTime startUpAt) {
        this.startUpAt = startUpAt;
    }

    public UpdateEquipmentInfoResponse withCloudAccessStatus(String cloudAccessStatus) {
        this.cloudAccessStatus = cloudAccessStatus;
        return this;
    }

    /**
     * VPN状态
     * @return cloudAccessStatus
     */
    public String getCloudAccessStatus() {
        return cloudAccessStatus;
    }

    public void setCloudAccessStatus(String cloudAccessStatus) {
        this.cloudAccessStatus = cloudAccessStatus;
    }

    public UpdateEquipmentInfoResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEquipmentInfoResponse that = (UpdateEquipmentInfoResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.iegId, that.iegId)
            && Objects.equals(this.esn, that.esn) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.haType, that.haType)
            && Objects.equals(this.version, that.version) && Objects.equals(this.activeAt, that.activeAt)
            && Objects.equals(this.goLiveAt, that.goLiveAt) && Objects.equals(this.startUpAt, that.startUpAt)
            && Objects.equals(this.cloudAccessStatus, that.cloudAccessStatus)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            iegId,
            esn,
            name,
            type,
            haType,
            version,
            activeAt,
            goLiveAt,
            startUpAt,
            cloudAccessStatus,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEquipmentInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iegId: ").append(toIndentedString(iegId)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    haType: ").append(toIndentedString(haType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    activeAt: ").append(toIndentedString(activeAt)).append("\n");
        sb.append("    goLiveAt: ").append(toIndentedString(goLiveAt)).append("\n");
        sb.append("    startUpAt: ").append(toIndentedString(startUpAt)).append("\n");
        sb.append("    cloudAccessStatus: ").append(toIndentedString(cloudAccessStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
