package com.huaweicloud.sdk.cc.v3.model;

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
 * 更新带宽包实例的请求体
 */
public class UpdateBandwidthPackage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    /**
     * 带宽包实例在大陆站或国际站的计费方式： - 1：大陆站包周期 - 2：国际站包周期 - 5：大陆站按95方式计费 - 6：国际站按95方式计费
     */
    public static final class BillingModeEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final BillingModeEnum NUMBER_1 = new BillingModeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final BillingModeEnum NUMBER_2 = new BillingModeEnum(2);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final BillingModeEnum NUMBER_5 = new BillingModeEnum(5);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final BillingModeEnum NUMBER_6 = new BillingModeEnum(6);

        private static final Map<Integer, BillingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, BillingModeEnum> createStaticFields() {
            Map<Integer, BillingModeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(5, NUMBER_5);
            map.put(6, NUMBER_6);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        BillingModeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BillingModeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BillingModeEnum(value));
        }

        public static BillingModeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BillingModeEnum) {
                return this.value.equals(((BillingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_mode")

    private BillingModeEnum billingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prepaid_options")

    private UpdatePrepaidOptions prepaidOptions;

    public UpdateBandwidthPackage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateBandwidthPackage withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。不支持 <>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateBandwidthPackage withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 带宽包实例中的带宽值。
     * minimum: 2
     * maximum: 999999
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public UpdateBandwidthPackage withBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * 带宽包实例在大陆站或国际站的计费方式： - 1：大陆站包周期 - 2：国际站包周期 - 5：大陆站按95方式计费 - 6：国际站按95方式计费
     * @return billingMode
     */
    public BillingModeEnum getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
    }

    public UpdateBandwidthPackage withPrepaidOptions(UpdatePrepaidOptions prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
        return this;
    }

    public UpdateBandwidthPackage withPrepaidOptions(Consumer<UpdatePrepaidOptions> prepaidOptionsSetter) {
        if (this.prepaidOptions == null) {
            this.prepaidOptions = new UpdatePrepaidOptions();
            prepaidOptionsSetter.accept(this.prepaidOptions);
        }

        return this;
    }

    /**
     * Get prepaidOptions
     * @return prepaidOptions
     */
    public UpdatePrepaidOptions getPrepaidOptions() {
        return prepaidOptions;
    }

    public void setPrepaidOptions(UpdatePrepaidOptions prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBandwidthPackage that = (UpdateBandwidthPackage) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.bandwidth, that.bandwidth) && Objects.equals(this.billingMode, that.billingMode)
            && Objects.equals(this.prepaidOptions, that.prepaidOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, bandwidth, billingMode, prepaidOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBandwidthPackage {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    prepaidOptions: ").append(toIndentedString(prepaidOptions)).append("\n");
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
