package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 供给推荐的选项
 */
public class SupplyOption {

    /**
     * 推荐结果的粒度 BY_REGION：对每个区域打分，可使用多种规格满足需求 BY_AZ：对每个可用区打分 BY_FLAVOR：对每个规格打分，可使用多地域满足需求 BY_FLAVOR_AND_REGION：对每个区域下的每个规格打分 BY_FLAVOR_AND_AZ：对每个可用区下的每个规格打分
     */
    public static final class ResultGranularityEnum {

        /**
         * Enum BY_REGION for value: "BY_REGION"
         */
        public static final ResultGranularityEnum BY_REGION = new ResultGranularityEnum("BY_REGION");

        /**
         * Enum BY_AZ for value: "BY_AZ"
         */
        public static final ResultGranularityEnum BY_AZ = new ResultGranularityEnum("BY_AZ");

        /**
         * Enum BY_FLAVOR for value: "BY_FLAVOR"
         */
        public static final ResultGranularityEnum BY_FLAVOR = new ResultGranularityEnum("BY_FLAVOR");

        /**
         * Enum BY_FLAVOR_AND_REGION for value: "BY_FLAVOR_AND_REGION"
         */
        public static final ResultGranularityEnum BY_FLAVOR_AND_REGION =
            new ResultGranularityEnum("BY_FLAVOR_AND_REGION");

        /**
         * Enum BY_FLAVOR_AND_AZ for value: "BY_FLAVOR_AND_AZ"
         */
        public static final ResultGranularityEnum BY_FLAVOR_AND_AZ = new ResultGranularityEnum("BY_FLAVOR_AND_AZ");

        private static final Map<String, ResultGranularityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultGranularityEnum> createStaticFields() {
            Map<String, ResultGranularityEnum> map = new HashMap<>();
            map.put("BY_REGION", BY_REGION);
            map.put("BY_AZ", BY_AZ);
            map.put("BY_FLAVOR", BY_FLAVOR);
            map.put("BY_FLAVOR_AND_REGION", BY_FLAVOR_AND_REGION);
            map.put("BY_FLAVOR_AND_AZ", BY_FLAVOR_AND_AZ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultGranularityEnum(String value) {
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
        public static ResultGranularityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResultGranularityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResultGranularityEnum(value);
            }
            return result;
        }

        public static ResultGranularityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResultGranularityEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultGranularityEnum) {
                return this.value.equals(((ResultGranularityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_granularity")

    private ResultGranularityEnum resultGranularity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_spot")

    private Boolean enableSpot;

    public SupplyOption withResultGranularity(ResultGranularityEnum resultGranularity) {
        this.resultGranularity = resultGranularity;
        return this;
    }

    /**
     * 推荐结果的粒度 BY_REGION：对每个区域打分，可使用多种规格满足需求 BY_AZ：对每个可用区打分 BY_FLAVOR：对每个规格打分，可使用多地域满足需求 BY_FLAVOR_AND_REGION：对每个区域下的每个规格打分 BY_FLAVOR_AND_AZ：对每个可用区下的每个规格打分
     * @return resultGranularity
     */
    public ResultGranularityEnum getResultGranularity() {
        return resultGranularity;
    }

    public void setResultGranularity(ResultGranularityEnum resultGranularity) {
        this.resultGranularity = resultGranularity;
    }

    public SupplyOption withEnableSpot(Boolean enableSpot) {
        this.enableSpot = enableSpot;
        return this;
    }

    /**
     * 是否推荐竞价实例
     * @return enableSpot
     */
    public Boolean getEnableSpot() {
        return enableSpot;
    }

    public void setEnableSpot(Boolean enableSpot) {
        this.enableSpot = enableSpot;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SupplyOption supplyOption = (SupplyOption) o;
        return Objects.equals(this.resultGranularity, supplyOption.resultGranularity)
            && Objects.equals(this.enableSpot, supplyOption.enableSpot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultGranularity, enableSpot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupplyOption {\n");
        sb.append("    resultGranularity: ").append(toIndentedString(resultGranularity)).append("\n");
        sb.append("    enableSpot: ").append(toIndentedString(enableSpot)).append("\n");
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
