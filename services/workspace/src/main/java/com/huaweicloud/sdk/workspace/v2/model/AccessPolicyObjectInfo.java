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
 * AccessPolicyObjectInfo
 */
public class AccessPolicyObjectInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    /**
     * 对象类型，当前只支持用户类型。 * USER： 用户
     */
    public static final class ObjectTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final ObjectTypeEnum USER = new ObjectTypeEnum("USER");

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
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
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ObjectTypeEnum(value);
            }
            return result;
        }

        public static ObjectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public AccessPolicyObjectInfo withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 黑名单中的对象id，目前仅用户对象。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public AccessPolicyObjectInfo withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 对象名。
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public AccessPolicyObjectInfo withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型，当前只支持用户类型。 * USER： 用户
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessPolicyObjectInfo accessPolicyObjectInfo = (AccessPolicyObjectInfo) o;
        return Objects.equals(this.objectId, accessPolicyObjectInfo.objectId)
            && Objects.equals(this.objectName, accessPolicyObjectInfo.objectName)
            && Objects.equals(this.objectType, accessPolicyObjectInfo.objectType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, objectName, objectType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessPolicyObjectInfo {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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
