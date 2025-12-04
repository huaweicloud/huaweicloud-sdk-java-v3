package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * WafProductInfo
 */
public class WafProductInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    /**
     * **参数解释：** 订购周期类型标识，用于指定套餐的订购时间周期单位 **约束限制：** 不涉及 **取值范围：**  - month:月  - year:年 **默认取值：** 不涉及
     */
    public static final class PeriodTypeEnum {

        /**
         * Enum MONTH for value: "month"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("month");

        /**
         * Enum YEAR for value: "year"
         */
        public static final PeriodTypeEnum YEAR = new PeriodTypeEnum("year");

        private static final Map<String, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodTypeEnum> createStaticFields() {
            Map<String, PeriodTypeEnum> map = new HashMap<>();
            map.put("month", MONTH);
            map.put("year", YEAR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeriodTypeEnum(String value) {
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
        public static PeriodTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodTypeEnum(value));
        }

        public static PeriodTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodTypeEnum) {
                return this.value.equals(((PeriodTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private PeriodTypeEnum periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    public WafProductInfo withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * waf规格   -  professional：标准   - enterprise：专业   - ultimate：企业版
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public WafProductInfo withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * **参数解释：** 订购周期类型标识，用于指定套餐的订购时间周期单位 **约束限制：** 不涉及 **取值范围：**  - month:月  - year:年 **默认取值：** 不涉及
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public WafProductInfo withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WafProductInfo that = (WafProductInfo) obj;
        return Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecCode, periodType, periodNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WafProductInfo {\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
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
