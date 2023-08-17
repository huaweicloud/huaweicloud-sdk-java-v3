package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListObsBucketObjectsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    /**
     * 查询类似，取值“folders”“objects”前者为查询目录，后者为查询对象
     */
    public static final class TypeEnum {

        /**
         * Enum FOLDERS for value: "folders"
         */
        public static final TypeEnum FOLDERS = new TypeEnum("folders");

        /**
         * Enum OBJECTS for value: "objects"
         */
        public static final TypeEnum OBJECTS = new TypeEnum("objects");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("folders", FOLDERS);
            map.put("objects", OBJECTS);
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
     * 查询bucket所在的region
     */
    public static final class LocationEnum {

        /**
         * Enum CN_NORTH_4 for value: "cn-north-4"
         */
        public static final LocationEnum CN_NORTH_4 = new LocationEnum("cn-north-4");

        /**
         * Enum CN_NORTH_1 for value: "cn-north-1"
         */
        public static final LocationEnum CN_NORTH_1 = new LocationEnum("cn-north-1");

        /**
         * Enum CN_NORTH_5 for value: "cn-north-5"
         */
        public static final LocationEnum CN_NORTH_5 = new LocationEnum("cn-north-5");

        /**
         * Enum CN_NORTH_6 for value: "cn-north-6"
         */
        public static final LocationEnum CN_NORTH_6 = new LocationEnum("cn-north-6");

        /**
         * Enum CN_SOUTH_1 for value: "cn-south-1"
         */
        public static final LocationEnum CN_SOUTH_1 = new LocationEnum("cn-south-1");

        /**
         * Enum CN_EAST_2 for value: "cn-east-2"
         */
        public static final LocationEnum CN_EAST_2 = new LocationEnum("cn-east-2");

        private static final Map<String, LocationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocationEnum> createStaticFields() {
            Map<String, LocationEnum> map = new HashMap<>();
            map.put("cn-north-4", CN_NORTH_4);
            map.put("cn-north-1", CN_NORTH_1);
            map.put("cn-north-5", CN_NORTH_5);
            map.put("cn-north-6", CN_NORTH_6);
            map.put("cn-south-1", CN_SOUTH_1);
            map.put("cn-east-2", CN_EAST_2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocationEnum(String value) {
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
        public static LocationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LocationEnum(value));
        }

        public static LocationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LocationEnum) {
                return this.value.equals(((LocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private LocationEnum location;

    public ListObsBucketObjectsRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 要查询的桶名
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ListObsBucketObjectsRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 对象名前缀，可以理解为文件夹路径
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ListObsBucketObjectsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 查询类似，取值“folders”“objects”前者为查询目录，后者为查询对象
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListObsBucketObjectsRequest withLocation(LocationEnum location) {
        this.location = location;
        return this;
    }

    /**
     * 查询bucket所在的region
     * @return location
     */
    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListObsBucketObjectsRequest that = (ListObsBucketObjectsRequest) obj;
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.prefix, that.prefix)
            && Objects.equals(this.type, that.type) && Objects.equals(this.location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, prefix, type, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObsBucketObjectsRequest {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
