package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数字人直播任务运行配置
 */
public class LiveJobRunConfig {

    /**
     * 允许使用资源类型。 * PERIOD：使用包周期资源 * ONDEMAND：使用按需资源 * UNLIMITED：不限制资源类型 * ONE_TIME：一次性资源
     */
    public static final class AllowResourceTypeEnum {

        /**
         * Enum PERIOD for value: "PERIOD"
         */
        public static final AllowResourceTypeEnum PERIOD = new AllowResourceTypeEnum("PERIOD");

        /**
         * Enum ONDEMAND for value: "ONDEMAND"
         */
        public static final AllowResourceTypeEnum ONDEMAND = new AllowResourceTypeEnum("ONDEMAND");

        /**
         * Enum UNLIMITED for value: "UNLIMITED"
         */
        public static final AllowResourceTypeEnum UNLIMITED = new AllowResourceTypeEnum("UNLIMITED");

        /**
         * Enum ONE_TIME for value: "ONE_TIME"
         */
        public static final AllowResourceTypeEnum ONE_TIME = new AllowResourceTypeEnum("ONE_TIME");

        private static final Map<String, AllowResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AllowResourceTypeEnum> createStaticFields() {
            Map<String, AllowResourceTypeEnum> map = new HashMap<>();
            map.put("PERIOD", PERIOD);
            map.put("ONDEMAND", ONDEMAND);
            map.put("UNLIMITED", UNLIMITED);
            map.put("ONE_TIME", ONE_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AllowResourceTypeEnum(String value) {
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
        public static AllowResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AllowResourceTypeEnum(value));
        }

        public static AllowResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AllowResourceTypeEnum) {
                return this.value.equals(((AllowResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_resource_type")

    private AllowResourceTypeEnum allowResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_job_in_room")

    private Boolean singleJobInRoom;

    public LiveJobRunConfig withAllowResourceType(AllowResourceTypeEnum allowResourceType) {
        this.allowResourceType = allowResourceType;
        return this;
    }

    /**
     * 允许使用资源类型。 * PERIOD：使用包周期资源 * ONDEMAND：使用按需资源 * UNLIMITED：不限制资源类型 * ONE_TIME：一次性资源
     * @return allowResourceType
     */
    public AllowResourceTypeEnum getAllowResourceType() {
        return allowResourceType;
    }

    public void setAllowResourceType(AllowResourceTypeEnum allowResourceType) {
        this.allowResourceType = allowResourceType;
    }

    public LiveJobRunConfig withSingleJobInRoom(Boolean singleJobInRoom) {
        this.singleJobInRoom = singleJobInRoom;
        return this;
    }

    /**
     * 一个直播间是否仅允许一个正在直播的任务。 * true: 限制直播间仅允许一个任务运行。 * false: 不限制直播间任务运行数量。
     * @return singleJobInRoom
     */
    public Boolean getSingleJobInRoom() {
        return singleJobInRoom;
    }

    public void setSingleJobInRoom(Boolean singleJobInRoom) {
        this.singleJobInRoom = singleJobInRoom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveJobRunConfig that = (LiveJobRunConfig) obj;
        return Objects.equals(this.allowResourceType, that.allowResourceType)
            && Objects.equals(this.singleJobInRoom, that.singleJobInRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowResourceType, singleJobInRoom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveJobRunConfig {\n");
        sb.append("    allowResourceType: ").append(toIndentedString(allowResourceType)).append("\n");
        sb.append("    singleJobInRoom: ").append(toIndentedString(singleJobInRoom)).append("\n");
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
