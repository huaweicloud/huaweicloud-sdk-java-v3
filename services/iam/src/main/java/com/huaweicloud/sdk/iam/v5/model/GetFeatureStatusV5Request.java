package com.huaweicloud.sdk.iam.v5.model;

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
public class GetFeatureStatusV5Request {

    /**
     * 功能特征的唯一名称。
     */
    public static final class FeatureNameEnum {

        /**
         * Enum V5_CONSOLE for value: "v5_console"
         */
        public static final FeatureNameEnum V5_CONSOLE = new FeatureNameEnum("v5_console");

        /**
         * Enum ACCESS_ANALYZER for value: "access_analyzer"
         */
        public static final FeatureNameEnum ACCESS_ANALYZER = new FeatureNameEnum("access_analyzer");

        private static final Map<String, FeatureNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FeatureNameEnum> createStaticFields() {
            Map<String, FeatureNameEnum> map = new HashMap<>();
            map.put("v5_console", V5_CONSOLE);
            map.put("access_analyzer", ACCESS_ANALYZER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FeatureNameEnum(String value) {
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
        public static FeatureNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FeatureNameEnum(value));
        }

        public static FeatureNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FeatureNameEnum) {
                return this.value.equals(((FeatureNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_name")

    private FeatureNameEnum featureName;

    public GetFeatureStatusV5Request withFeatureName(FeatureNameEnum featureName) {
        this.featureName = featureName;
        return this;
    }

    /**
     * 功能特征的唯一名称。
     * @return featureName
     */
    public FeatureNameEnum getFeatureName() {
        return featureName;
    }

    public void setFeatureName(FeatureNameEnum featureName) {
        this.featureName = featureName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetFeatureStatusV5Request that = (GetFeatureStatusV5Request) obj;
        return Objects.equals(this.featureName, that.featureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(featureName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFeatureStatusV5Request {\n");
        sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
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
