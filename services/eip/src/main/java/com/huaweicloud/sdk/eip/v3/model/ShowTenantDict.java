package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowTenantDict
 */
public class ShowTenantDict {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 带宽的计费模式
     */
    public static final class ChargeModeEnum {

        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final ChargeModeEnum BANDWIDTH = new ChargeModeEnum("bandwidth");

        /**
         * Enum TRAFFIC for value: "traffic"
         */
        public static final ChargeModeEnum TRAFFIC = new ChargeModeEnum("traffic");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("bandwidth", BANDWIDTH);
            map.put("traffic", TRAFFIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModeEnum(String value) {
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
        public static ChargeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargeModeEnum(value));
        }

        public static ChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChargeModeEnum chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_size")

    private Integer minSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_size")

    private Integer maxSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_limit")

    private ExtLimitPojo extLimit;

    public ShowTenantDict withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP的唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowTenantDict withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 带宽的计费模式
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ShowTenantDict withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * 该类型带宽可购买的最小size
     * @return minSize
     */
    public Integer getMinSize() {
        return minSize;
    }

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    public ShowTenantDict withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * 该类型带宽可购买的最大size
     * @return maxSize
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public ShowTenantDict withExtLimit(ExtLimitPojo extLimit) {
        this.extLimit = extLimit;
        return this;
    }

    public ShowTenantDict withExtLimit(Consumer<ExtLimitPojo> extLimitSetter) {
        if (this.extLimit == null) {
            this.extLimit = new ExtLimitPojo();
            extLimitSetter.accept(this.extLimit);
        }

        return this;
    }

    /**
     * Get extLimit
     * @return extLimit
     */
    public ExtLimitPojo getExtLimit() {
        return extLimit;
    }

    public void setExtLimit(ExtLimitPojo extLimit) {
        this.extLimit = extLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTenantDict that = (ShowTenantDict) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.minSize, that.minSize) && Objects.equals(this.maxSize, that.maxSize)
            && Objects.equals(this.extLimit, that.extLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chargeMode, minSize, maxSize, extLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTenantDict {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
        sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
        sb.append("    extLimit: ").append(toIndentedString(extLimit)).append("\n");
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
