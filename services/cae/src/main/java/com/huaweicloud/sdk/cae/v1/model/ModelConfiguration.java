package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModelConfiguration
 */
public class ModelConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private ListComponentConfigurationsResponseData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operated_at")

    private OffsetDateTime operatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    /**
     * 组件配置类型。
     */
    public static final class TypeEnum {

        /**
         * Enum RDS for value: "rds"
         */
        public static final TypeEnum RDS = new TypeEnum("rds");

        /**
         * Enum CSE for value: "cse"
         */
        public static final TypeEnum CSE = new TypeEnum("cse");

        /**
         * Enum ENV for value: "env"
         */
        public static final TypeEnum ENV = new TypeEnum("env");

        /**
         * Enum ACCESS for value: "access"
         */
        public static final TypeEnum ACCESS = new TypeEnum("access");

        /**
         * Enum SCALING for value: "scaling"
         */
        public static final TypeEnum SCALING = new TypeEnum("scaling");

        /**
         * Enum VOLUME for value: "volume"
         */
        public static final TypeEnum VOLUME = new TypeEnum("volume");

        /**
         * Enum HEALTHCHECK for value: "healthCheck"
         */
        public static final TypeEnum HEALTHCHECK = new TypeEnum("healthCheck");

        /**
         * Enum LIFECYCLE for value: "lifecycle"
         */
        public static final TypeEnum LIFECYCLE = new TypeEnum("lifecycle");

        /**
         * Enum APM2 for value: "apm2"
         */
        public static final TypeEnum APM2 = new TypeEnum("apm2");

        /**
         * Enum LOG for value: "log"
         */
        public static final TypeEnum LOG = new TypeEnum("log");

        /**
         * Enum CUSTOMMETRIC for value: "customMetric"
         */
        public static final TypeEnum CUSTOMMETRIC = new TypeEnum("customMetric");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("rds", RDS);
            map.put("cse", CSE);
            map.put("env", ENV);
            map.put("access", ACCESS);
            map.put("scaling", SCALING);
            map.put("volume", VOLUME);
            map.put("healthCheck", HEALTHCHECK);
            map.put("lifecycle", LIFECYCLE);
            map.put("apm2", APM2);
            map.put("log", LOG);
            map.put("customMetric", CUSTOMMETRIC);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_activated")

    private Boolean isActivated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_using")

    private Boolean isUsing;

    public ModelConfiguration withData(ListComponentConfigurationsResponseData data) {
        this.data = data;
        return this;
    }

    public ModelConfiguration withData(Consumer<ListComponentConfigurationsResponseData> dataSetter) {
        if (this.data == null) {
            this.data = new ListComponentConfigurationsResponseData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ListComponentConfigurationsResponseData getData() {
        return data;
    }

    public void setData(ListComponentConfigurationsResponseData data) {
        this.data = data;
    }

    public ModelConfiguration withOperatedAt(OffsetDateTime operatedAt) {
        this.operatedAt = operatedAt;
        return this;
    }

    /**
     * 操作时间。
     * @return operatedAt
     */
    public OffsetDateTime getOperatedAt() {
        return operatedAt;
    }

    public void setOperatedAt(OffsetDateTime operatedAt) {
        this.operatedAt = operatedAt;
    }

    public ModelConfiguration withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * 操作ID。
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public ModelConfiguration withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 组件配置类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ModelConfiguration withIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
        return this;
    }

    /**
     * 配置是否生效过。
     * @return isActivated
     */
    public Boolean getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
    }

    public ModelConfiguration withIsUsing(Boolean isUsing) {
        this.isUsing = isUsing;
        return this;
    }

    /**
     * 配置是否正在使用。
     * @return isUsing
     */
    public Boolean getIsUsing() {
        return isUsing;
    }

    public void setIsUsing(Boolean isUsing) {
        this.isUsing = isUsing;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelConfiguration that = (ModelConfiguration) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.operatedAt, that.operatedAt)
            && Objects.equals(this.operationId, that.operationId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.isActivated, that.isActivated) && Objects.equals(this.isUsing, that.isUsing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, operatedAt, operationId, type, isActivated, isUsing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelConfiguration {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    operatedAt: ").append(toIndentedString(operatedAt)).append("\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isActivated: ").append(toIndentedString(isActivated)).append("\n");
        sb.append("    isUsing: ").append(toIndentedString(isUsing)).append("\n");
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
