package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class ChangeLoadbalancerChargeModeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_ids")

    @JacksonXmlProperty(localName = "loadbalancer_ids")

    private List<String> loadbalancerIds = null;

    /**
    * 计费模式。取值： - prepaid：包周期计费。
    */
    public static final class ChargeModeEnum {

        /**
         * Enum PREPAID for value: "prepaid"
         */
        public static final ChargeModeEnum PREPAID = new ChargeModeEnum("prepaid");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("prepaid", PREPAID);
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
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargeModeEnum(value);
            }
            return result;
        }

        public static ChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "charge_mode")

    private ChargeModeEnum chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prepaid_options")

    @JacksonXmlProperty(localName = "prepaid_options")

    private PrepaidChangeChargeModeOption prepaidOptions;

    public ChangeLoadbalancerChargeModeRequestBody withLoadbalancerIds(List<String> loadbalancerIds) {
        this.loadbalancerIds = loadbalancerIds;
        return this;
    }

    public ChangeLoadbalancerChargeModeRequestBody addLoadbalancerIdsItem(String loadbalancerIdsItem) {
        if (this.loadbalancerIds == null) {
            this.loadbalancerIds = new ArrayList<>();
        }
        this.loadbalancerIds.add(loadbalancerIdsItem);
        return this;
    }

    public ChangeLoadbalancerChargeModeRequestBody withLoadbalancerIds(Consumer<List<String>> loadbalancerIdsSetter) {
        if (this.loadbalancerIds == null) {
            this.loadbalancerIds = new ArrayList<>();
        }
        loadbalancerIdsSetter.accept(this.loadbalancerIds);
        return this;
    }

    /**
     * 需要修改计费类型的负载均衡器ID列表。
     * @return loadbalancerIds
     */
    public List<String> getLoadbalancerIds() {
        return loadbalancerIds;
    }

    public void setLoadbalancerIds(List<String> loadbalancerIds) {
        this.loadbalancerIds = loadbalancerIds;
    }

    public ChangeLoadbalancerChargeModeRequestBody withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式。取值： - prepaid：包周期计费。
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ChangeLoadbalancerChargeModeRequestBody withPrepaidOptions(PrepaidChangeChargeModeOption prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
        return this;
    }

    public ChangeLoadbalancerChargeModeRequestBody withPrepaidOptions(
        Consumer<PrepaidChangeChargeModeOption> prepaidOptionsSetter) {
        if (this.prepaidOptions == null) {
            this.prepaidOptions = new PrepaidChangeChargeModeOption();
            prepaidOptionsSetter.accept(this.prepaidOptions);
        }

        return this;
    }

    /**
     * Get prepaidOptions
     * @return prepaidOptions
     */
    public PrepaidChangeChargeModeOption getPrepaidOptions() {
        return prepaidOptions;
    }

    public void setPrepaidOptions(PrepaidChangeChargeModeOption prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeLoadbalancerChargeModeRequestBody changeLoadbalancerChargeModeRequestBody =
            (ChangeLoadbalancerChargeModeRequestBody) o;
        return Objects.equals(this.loadbalancerIds, changeLoadbalancerChargeModeRequestBody.loadbalancerIds)
            && Objects.equals(this.chargeMode, changeLoadbalancerChargeModeRequestBody.chargeMode)
            && Objects.equals(this.prepaidOptions, changeLoadbalancerChargeModeRequestBody.prepaidOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancerIds, chargeMode, prepaidOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeLoadbalancerChargeModeRequestBody {\n");
        sb.append("    loadbalancerIds: ").append(toIndentedString(loadbalancerIds)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
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
