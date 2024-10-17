package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据库对象空间信息，数据来源于information_schema.tables系统表。已用空间包含数据空间、索引空间和碎片空间。
 */
public class DbObjectSpaceInfo {

    /**
     * 对象类型，如果是table，同时需要传database_id
     */
    public static final class ObjectTypeEnum {

        /**
         * Enum DATABASE for value: "database"
         */
        public static final ObjectTypeEnum DATABASE = new ObjectTypeEnum("database");

        /**
         * Enum TABLE for value: "table"
         */
        public static final ObjectTypeEnum TABLE = new ObjectTypeEnum("table");

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("database", DATABASE);
            map.put("table", TABLE);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_size")

    private Long usedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_size")

    private Long dataSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_size")

    private Long indexSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_size")

    private Long freeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_rate")

    private Double freeRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_rows")

    private Long estimatedRows;

    public DbObjectSpaceInfo withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型，如果是table，同时需要传database_id
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }

    public DbObjectSpaceInfo withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 对象名称
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public DbObjectSpaceInfo withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 对象ID
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public DbObjectSpaceInfo withUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }

    /**
     * 已使用空间，以字节为单位
     * @return usedSize
     */
    public Long getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
    }

    public DbObjectSpaceInfo withDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * 数据空间，以字节为单位
     * @return dataSize
     */
    public Long getDataSize() {
        return dataSize;
    }

    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    public DbObjectSpaceInfo withIndexSize(Long indexSize) {
        this.indexSize = indexSize;
        return this;
    }

    /**
     * 索引空间，以字节为单位
     * @return indexSize
     */
    public Long getIndexSize() {
        return indexSize;
    }

    public void setIndexSize(Long indexSize) {
        this.indexSize = indexSize;
    }

    public DbObjectSpaceInfo withFreeSize(Long freeSize) {
        this.freeSize = freeSize;
        return this;
    }

    /**
     * 碎片空间，以字节为单位
     * @return freeSize
     */
    public Long getFreeSize() {
        return freeSize;
    }

    public void setFreeSize(Long freeSize) {
        this.freeSize = freeSize;
    }

    public DbObjectSpaceInfo withFreeRate(Double freeRate) {
        this.freeRate = freeRate;
        return this;
    }

    /**
     * 碎片率
     * @return freeRate
     */
    public Double getFreeRate() {
        return freeRate;
    }

    public void setFreeRate(Double freeRate) {
        this.freeRate = freeRate;
    }

    public DbObjectSpaceInfo withEstimatedRows(Long estimatedRows) {
        this.estimatedRows = estimatedRows;
        return this;
    }

    /**
     * 估算值行数，以字节为单位
     * @return estimatedRows
     */
    public Long getEstimatedRows() {
        return estimatedRows;
    }

    public void setEstimatedRows(Long estimatedRows) {
        this.estimatedRows = estimatedRows;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DbObjectSpaceInfo that = (DbObjectSpaceInfo) obj;
        return Objects.equals(this.objectType, that.objectType) && Objects.equals(this.objectName, that.objectName)
            && Objects.equals(this.objectId, that.objectId) && Objects.equals(this.usedSize, that.usedSize)
            && Objects.equals(this.dataSize, that.dataSize) && Objects.equals(this.indexSize, that.indexSize)
            && Objects.equals(this.freeSize, that.freeSize) && Objects.equals(this.freeRate, that.freeRate)
            && Objects.equals(this.estimatedRows, that.estimatedRows);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(objectType, objectName, objectId, usedSize, dataSize, indexSize, freeSize, freeRate, estimatedRows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbObjectSpaceInfo {\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
        sb.append("    indexSize: ").append(toIndentedString(indexSize)).append("\n");
        sb.append("    freeSize: ").append(toIndentedString(freeSize)).append("\n");
        sb.append("    freeRate: ").append(toIndentedString(freeRate)).append("\n");
        sb.append("    estimatedRows: ").append(toIndentedString(estimatedRows)).append("\n");
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
