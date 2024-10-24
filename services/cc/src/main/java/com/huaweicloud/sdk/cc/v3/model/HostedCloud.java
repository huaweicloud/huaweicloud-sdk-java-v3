package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 归属云。
 */
public class HostedCloud {

    /**
     * - HWCloud (华为云) - Ireland (爱尔兰)
     */
    public static final class HostedCloudEnum {

        /**
         * Enum HWCLOUD for value: "HWCloud"
         */
        public static final HostedCloudEnum HWCLOUD = new HostedCloudEnum("HWCloud");

        /**
         * Enum IRELAND for value: "Ireland"
         */
        public static final HostedCloudEnum IRELAND = new HostedCloudEnum("Ireland");

        private static final Map<String, HostedCloudEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostedCloudEnum> createStaticFields() {
            Map<String, HostedCloudEnum> map = new HashMap<>();
            map.put("HWCloud", HWCLOUD);
            map.put("Ireland", IRELAND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HostedCloudEnum(String value) {
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
        public static HostedCloudEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HostedCloudEnum(value));
        }

        public static HostedCloudEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HostedCloudEnum) {
                return this.value.equals(((HostedCloudEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_cloud")

    private HostedCloudEnum hostedCloud;

    public HostedCloud withHostedCloud(HostedCloudEnum hostedCloud) {
        this.hostedCloud = hostedCloud;
        return this;
    }

    /**
     * - HWCloud (华为云) - Ireland (爱尔兰)
     * @return hostedCloud
     */
    public HostedCloudEnum getHostedCloud() {
        return hostedCloud;
    }

    public void setHostedCloud(HostedCloudEnum hostedCloud) {
        this.hostedCloud = hostedCloud;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostedCloud that = (HostedCloud) obj;
        return Objects.equals(this.hostedCloud, that.hostedCloud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostedCloud);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedCloud {\n");
        sb.append("    hostedCloud: ").append(toIndentedString(hostedCloud)).append("\n");
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
