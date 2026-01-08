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
 * 弹性伸缩策略。
 */
public class AutoscalePolicy {

    /**
     * 弹性伸缩类型，ACCESS_CREATED：接入时创建，AUTO_CREATED：弹性伸缩。
     */
    public static final class AutoscaleTypeEnum {

        /**
         * Enum ACCESS_CREATED for value: "ACCESS_CREATED"
         */
        public static final AutoscaleTypeEnum ACCESS_CREATED = new AutoscaleTypeEnum("ACCESS_CREATED");

        /**
         * Enum AUTO_CREATED for value: "AUTO_CREATED"
         */
        public static final AutoscaleTypeEnum AUTO_CREATED = new AutoscaleTypeEnum("AUTO_CREATED");

        private static final Map<String, AutoscaleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AutoscaleTypeEnum> createStaticFields() {
            Map<String, AutoscaleTypeEnum> map = new HashMap<>();
            map.put("ACCESS_CREATED", ACCESS_CREATED);
            map.put("AUTO_CREATED", AUTO_CREATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AutoscaleTypeEnum(String value) {
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
        public static AutoscaleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AutoscaleTypeEnum(value));
        }

        public static AutoscaleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AutoscaleTypeEnum) {
                return this.value.equals(((AutoscaleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoscale_type")

    private AutoscaleTypeEnum autoscaleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_auto_created")

    private Integer maxAutoCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_idle")

    private Integer minIdle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "once_auto_created")

    private Integer onceAutoCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_retention")

    private Integer minRetention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_retention_duration")

    private Integer idleRetentionDuration;

    public AutoscalePolicy withAutoscaleType(AutoscaleTypeEnum autoscaleType) {
        this.autoscaleType = autoscaleType;
        return this;
    }

    /**
     * 弹性伸缩类型，ACCESS_CREATED：接入时创建，AUTO_CREATED：弹性伸缩。
     * @return autoscaleType
     */
    public AutoscaleTypeEnum getAutoscaleType() {
        return autoscaleType;
    }

    public void setAutoscaleType(AutoscaleTypeEnum autoscaleType) {
        this.autoscaleType = autoscaleType;
    }

    public AutoscalePolicy withMaxAutoCreated(Integer maxAutoCreated) {
        this.maxAutoCreated = maxAutoCreated;
        return this;
    }

    /**
     * 最大自动创建桌面数。
     * minimum: 1
     * maximum: 5000
     * @return maxAutoCreated
     */
    public Integer getMaxAutoCreated() {
        return maxAutoCreated;
    }

    public void setMaxAutoCreated(Integer maxAutoCreated) {
        this.maxAutoCreated = maxAutoCreated;
    }

    public AutoscalePolicy withMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
        return this;
    }

    /**
     * 预留空闲桌面数。
     * minimum: 0
     * maximum: 5000
     * @return minIdle
     */
    public Integer getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
    }

    public AutoscalePolicy withOnceAutoCreated(Integer onceAutoCreated) {
        this.onceAutoCreated = onceAutoCreated;
        return this;
    }

    /**
     * 一次自动创建桌面的数量(已弃用)。
     * minimum: 1
     * maximum: 100
     * @return onceAutoCreated
     */
    public Integer getOnceAutoCreated() {
        return onceAutoCreated;
    }

    public void setOnceAutoCreated(Integer onceAutoCreated) {
        this.onceAutoCreated = onceAutoCreated;
    }

    public AutoscalePolicy withMinRetention(Integer minRetention) {
        this.minRetention = minRetention;
        return this;
    }

    /**
     * 最小桌面数。
     * minimum: 0
     * maximum: 5000
     * @return minRetention
     */
    public Integer getMinRetention() {
        return minRetention;
    }

    public void setMinRetention(Integer minRetention) {
        this.minRetention = minRetention;
    }

    public AutoscalePolicy withIdleRetentionDuration(Integer idleRetentionDuration) {
        this.idleRetentionDuration = idleRetentionDuration;
        return this;
    }

    /**
     * 空闲桌面保留时长（分钟）。
     * minimum: 0
     * maximum: 43200
     * @return idleRetentionDuration
     */
    public Integer getIdleRetentionDuration() {
        return idleRetentionDuration;
    }

    public void setIdleRetentionDuration(Integer idleRetentionDuration) {
        this.idleRetentionDuration = idleRetentionDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoscalePolicy that = (AutoscalePolicy) obj;
        return Objects.equals(this.autoscaleType, that.autoscaleType)
            && Objects.equals(this.maxAutoCreated, that.maxAutoCreated) && Objects.equals(this.minIdle, that.minIdle)
            && Objects.equals(this.onceAutoCreated, that.onceAutoCreated)
            && Objects.equals(this.minRetention, that.minRetention)
            && Objects.equals(this.idleRetentionDuration, that.idleRetentionDuration);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(autoscaleType, maxAutoCreated, minIdle, onceAutoCreated, minRetention, idleRetentionDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoscalePolicy {\n");
        sb.append("    autoscaleType: ").append(toIndentedString(autoscaleType)).append("\n");
        sb.append("    maxAutoCreated: ").append(toIndentedString(maxAutoCreated)).append("\n");
        sb.append("    minIdle: ").append(toIndentedString(minIdle)).append("\n");
        sb.append("    onceAutoCreated: ").append(toIndentedString(onceAutoCreated)).append("\n");
        sb.append("    minRetention: ").append(toIndentedString(minRetention)).append("\n");
        sb.append("    idleRetentionDuration: ").append(toIndentedString(idleRetentionDuration)).append("\n");
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
