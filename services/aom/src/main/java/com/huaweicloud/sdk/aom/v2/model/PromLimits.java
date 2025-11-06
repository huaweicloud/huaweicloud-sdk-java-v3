package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PromLimits
 */
public class PromLimits {

    /**
     * 指标存储时长，只支持 15天，30天，60天 ，90天
     */
    public static final class CompactorBlocksRetentionPeriodEnum {

        /**
         * Enum _360H_ for value: "\"360h\""
         */
        public static final CompactorBlocksRetentionPeriodEnum _360H_ =
            new CompactorBlocksRetentionPeriodEnum("\"360h\"");

        /**
         * Enum _720H_ for value: " \"720h\""
         */
        public static final CompactorBlocksRetentionPeriodEnum _720H_ =
            new CompactorBlocksRetentionPeriodEnum(" \"720h\"");

        /**
         * Enum _1440H_ for value: " \"1440h\""
         */
        public static final CompactorBlocksRetentionPeriodEnum _1440H_ =
            new CompactorBlocksRetentionPeriodEnum(" \"1440h\"");

        /**
         * Enum _2160H_ for value: " \"2160h\""
         */
        public static final CompactorBlocksRetentionPeriodEnum _2160H_ =
            new CompactorBlocksRetentionPeriodEnum(" \"2160h\"");

        private static final Map<String, CompactorBlocksRetentionPeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompactorBlocksRetentionPeriodEnum> createStaticFields() {
            Map<String, CompactorBlocksRetentionPeriodEnum> map = new HashMap<>();
            map.put("\"360h\"", _360H_);
            map.put(" \"720h\"", _720H_);
            map.put(" \"1440h\"", _1440H_);
            map.put(" \"2160h\"", _2160H_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompactorBlocksRetentionPeriodEnum(String value) {
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
        public static CompactorBlocksRetentionPeriodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new CompactorBlocksRetentionPeriodEnum(value));
        }

        public static CompactorBlocksRetentionPeriodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompactorBlocksRetentionPeriodEnum) {
                return this.value.equals(((CompactorBlocksRetentionPeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compactor_blocks_retention_period")

    private CompactorBlocksRetentionPeriodEnum compactorBlocksRetentionPeriod;

    public PromLimits withCompactorBlocksRetentionPeriod(
        CompactorBlocksRetentionPeriodEnum compactorBlocksRetentionPeriod) {
        this.compactorBlocksRetentionPeriod = compactorBlocksRetentionPeriod;
        return this;
    }

    /**
     * 指标存储时长，只支持 15天，30天，60天 ，90天
     * @return compactorBlocksRetentionPeriod
     */
    public CompactorBlocksRetentionPeriodEnum getCompactorBlocksRetentionPeriod() {
        return compactorBlocksRetentionPeriod;
    }

    public void setCompactorBlocksRetentionPeriod(CompactorBlocksRetentionPeriodEnum compactorBlocksRetentionPeriod) {
        this.compactorBlocksRetentionPeriod = compactorBlocksRetentionPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PromLimits that = (PromLimits) obj;
        return Objects.equals(this.compactorBlocksRetentionPeriod, that.compactorBlocksRetentionPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compactorBlocksRetentionPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromLimits {\n");
        sb.append("    compactorBlocksRetentionPeriod: ")
            .append(toIndentedString(compactorBlocksRetentionPeriod))
            .append("\n");
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
