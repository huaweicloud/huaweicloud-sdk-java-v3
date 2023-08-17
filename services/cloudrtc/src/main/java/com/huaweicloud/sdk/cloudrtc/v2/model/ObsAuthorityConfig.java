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
 * ObsAuthorityConfig
 */
public class ObsAuthorityConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private Integer operation;

    /**
     * 查询bucket所在的region - cn-north-4 - cn-north-1 - cn-north-5 - cn-north-6 - cn-south-1 - cn-east-2
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ObsAuthorityConfig withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * OBS桶名
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ObsAuthorityConfig withOperation(Integer operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作，1-授权；0-取消授权
     * minimum: 0
     * maximum: 1
     * @return operation
     */
    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public ObsAuthorityConfig withLocation(LocationEnum location) {
        this.location = location;
        return this;
    }

    /**
     * 查询bucket所在的region - cn-north-4 - cn-north-1 - cn-north-5 - cn-north-6 - cn-south-1 - cn-east-2
     * @return location
     */
    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    public ObsAuthorityConfig withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户华为云账号projectid
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsAuthorityConfig that = (ObsAuthorityConfig) obj;
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.operation, that.operation)
            && Objects.equals(this.location, that.location) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, operation, location, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsAuthorityConfig {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
