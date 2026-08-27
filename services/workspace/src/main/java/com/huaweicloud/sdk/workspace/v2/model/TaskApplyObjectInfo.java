package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 任务应用对象信息
 */
public class TaskApplyObjectInfo {

    /**
     * 应用对象类型，包括DESKTOP（单桌面）、ALL_DESKTOPS（全部桌面）、DESKTOP_POOL（桌面池）、DESKTOP_TAG（桌面标签）、ALL_USERS（全部用户）、USER（单个用户）、USER_GROUP（用户组）、ALL_IMAGES（全部镜像）、APPLICATION_SERVER（应用服务器）、APPLICATION_SERVER_GROUP（应用服务器组）
     */
    public static final class ObjectTypeEnum {

        /**
         * Enum DESKTOP for value: "DESKTOP"
         */
        public static final ObjectTypeEnum DESKTOP = new ObjectTypeEnum("DESKTOP");

        /**
         * Enum ALL_DESKTOPS for value: "ALL_DESKTOPS"
         */
        public static final ObjectTypeEnum ALL_DESKTOPS = new ObjectTypeEnum("ALL_DESKTOPS");

        /**
         * Enum DESKTOP_POOL for value: "DESKTOP_POOL"
         */
        public static final ObjectTypeEnum DESKTOP_POOL = new ObjectTypeEnum("DESKTOP_POOL");

        /**
         * Enum DESKTOP_TAG for value: "DESKTOP_TAG"
         */
        public static final ObjectTypeEnum DESKTOP_TAG = new ObjectTypeEnum("DESKTOP_TAG");

        /**
         * Enum ALL_IMAGES for value: "ALL_IMAGES"
         */
        public static final ObjectTypeEnum ALL_IMAGES = new ObjectTypeEnum("ALL_IMAGES");

        /**
         * Enum APPLICATION_SERVER for value: "APPLICATION_SERVER"
         */
        public static final ObjectTypeEnum APPLICATION_SERVER = new ObjectTypeEnum("APPLICATION_SERVER");

        /**
         * Enum APPLICATION_SERVER_GROUP for value: "APPLICATION_SERVER_GROUP"
         */
        public static final ObjectTypeEnum APPLICATION_SERVER_GROUP = new ObjectTypeEnum("APPLICATION_SERVER_GROUP");

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("DESKTOP", DESKTOP);
            map.put("ALL_DESKTOPS", ALL_DESKTOPS);
            map.put("DESKTOP_POOL", DESKTOP_POOL);
            map.put("DESKTOP_TAG", DESKTOP_TAG);
            map.put("ALL_IMAGES", ALL_IMAGES);
            map.put("APPLICATION_SERVER", APPLICATION_SERVER);
            map.put("APPLICATION_SERVER_GROUP", APPLICATION_SERVER_GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectTypeEnum(String value) {
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
        public static ObjectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ObjectTypeEnum(value));
        }

        public static ObjectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObjectTypeEnum) {
                return this.value.equals(((ObjectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private ObjectTypeEnum objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    public TaskApplyObjectInfo withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 应用对象类型，包括DESKTOP（单桌面）、ALL_DESKTOPS（全部桌面）、DESKTOP_POOL（桌面池）、DESKTOP_TAG（桌面标签）、ALL_USERS（全部用户）、USER（单个用户）、USER_GROUP（用户组）、ALL_IMAGES（全部镜像）、APPLICATION_SERVER（应用服务器）、APPLICATION_SERVER_GROUP（应用服务器组）
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }

    public TaskApplyObjectInfo withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 对象ID（object_type为ALL_DESKTOPS、ALL_USERS或ALL_IMAGES时可为null）
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskApplyObjectInfo that = (TaskApplyObjectInfo) obj;
        return Objects.equals(this.objectType, that.objectType) && Objects.equals(this.objectId, that.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectType, objectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskApplyObjectInfo {\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
