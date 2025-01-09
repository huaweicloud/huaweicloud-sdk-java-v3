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
 * 定时任务应用对象。
 */
public class ApplyObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    /**
     * 对象类型，可选值为： - DESKTOP：桌面。 - DESKTOP_POOL：桌面池。 - ALL_DESKTOPS: 所有桌面，仅供触发式任务使用。 - DESKTOP_TAG：桌面标签
     */
    public static final class ObjectTypeEnum {

        /**
         * Enum DESKTOP for value: "DESKTOP"
         */
        public static final ObjectTypeEnum DESKTOP = new ObjectTypeEnum("DESKTOP");

        /**
         * Enum DESKTOP_POOL for value: "DESKTOP_POOL"
         */
        public static final ObjectTypeEnum DESKTOP_POOL = new ObjectTypeEnum("DESKTOP_POOL");

        /**
         * Enum ALL_DESKTOPS for value: "ALL_DESKTOPS"
         */
        public static final ObjectTypeEnum ALL_DESKTOPS = new ObjectTypeEnum("ALL_DESKTOPS");

        /**
         * Enum DESKTOP_TAG for value: "DESKTOP_TAG"
         */
        public static final ObjectTypeEnum DESKTOP_TAG = new ObjectTypeEnum("DESKTOP_TAG");

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("DESKTOP", DESKTOP);
            map.put("DESKTOP_POOL", DESKTOP_POOL);
            map.put("ALL_DESKTOPS", ALL_DESKTOPS);
            map.put("DESKTOP_TAG", DESKTOP_TAG);
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
    @JsonProperty(value = "object_name")

    private String objectName;

    public ApplyObject withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 对象ID。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public ApplyObject withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型，可选值为： - DESKTOP：桌面。 - DESKTOP_POOL：桌面池。 - ALL_DESKTOPS: 所有桌面，仅供触发式任务使用。 - DESKTOP_TAG：桌面标签
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }

    public ApplyObject withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 对象名称。
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyObject that = (ApplyObject) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.objectType, that.objectType)
            && Objects.equals(this.objectName, that.objectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, objectType, objectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyObject {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
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
