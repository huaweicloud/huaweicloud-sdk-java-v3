package com.huaweicloud.sdk.workspace.v2.model;

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
 * 桌面小时包资源。
 */
public class HourPackageResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    /**
     * 时长用尽策略：   - SHUTDOWN_OR_HIBERNATE：自动关机/休眠。 - PAY_PER_USE：自动按需计费。
     */
    public static final class UsedUpPolicyEnum {

        /**
         * Enum SHUTDOWN_OR_HIBERNATE for value: "SHUTDOWN_OR_HIBERNATE"
         */
        public static final UsedUpPolicyEnum SHUTDOWN_OR_HIBERNATE = new UsedUpPolicyEnum("SHUTDOWN_OR_HIBERNATE");

        /**
         * Enum PAY_PER_USE for value: "PAY_PER_USE"
         */
        public static final UsedUpPolicyEnum PAY_PER_USE = new UsedUpPolicyEnum("PAY_PER_USE");

        private static final Map<String, UsedUpPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UsedUpPolicyEnum> createStaticFields() {
            Map<String, UsedUpPolicyEnum> map = new HashMap<>();
            map.put("SHUTDOWN_OR_HIBERNATE", SHUTDOWN_OR_HIBERNATE);
            map.put("PAY_PER_USE", PAY_PER_USE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UsedUpPolicyEnum(String value) {
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
        public static UsedUpPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UsedUpPolicyEnum(value));
        }

        public static UsedUpPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UsedUpPolicyEnum) {
                return this.value.equals(((UsedUpPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_up_policy")

    private UsedUpPolicyEnum usedUpPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_desktops")

    private CreateDesktopReq createDesktops;

    public HourPackageResource withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型：2：月；3：年;必填。
     * minimum: 0
     * maximum: 255
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public HourPackageResource withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数。
     * minimum: 0
     * maximum: 2147483647
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public HourPackageResource withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订。
     * minimum: 0
     * maximum: 255
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public HourPackageResource withUsedUpPolicy(UsedUpPolicyEnum usedUpPolicy) {
        this.usedUpPolicy = usedUpPolicy;
        return this;
    }

    /**
     * 时长用尽策略：   - SHUTDOWN_OR_HIBERNATE：自动关机/休眠。 - PAY_PER_USE：自动按需计费。
     * @return usedUpPolicy
     */
    public UsedUpPolicyEnum getUsedUpPolicy() {
        return usedUpPolicy;
    }

    public void setUsedUpPolicy(UsedUpPolicyEnum usedUpPolicy) {
        this.usedUpPolicy = usedUpPolicy;
    }

    public HourPackageResource withCreateDesktops(CreateDesktopReq createDesktops) {
        this.createDesktops = createDesktops;
        return this;
    }

    public HourPackageResource withCreateDesktops(Consumer<CreateDesktopReq> createDesktopsSetter) {
        if (this.createDesktops == null) {
            this.createDesktops = new CreateDesktopReq();
            createDesktopsSetter.accept(this.createDesktops);
        }

        return this;
    }

    /**
     * Get createDesktops
     * @return createDesktops
     */
    public CreateDesktopReq getCreateDesktops() {
        return createDesktops;
    }

    public void setCreateDesktops(CreateDesktopReq createDesktops) {
        this.createDesktops = createDesktops;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HourPackageResource that = (HourPackageResource) obj;
        return Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.usedUpPolicy, that.usedUpPolicy)
            && Objects.equals(this.createDesktops, that.createDesktops);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodType, periodNum, isAutoRenew, usedUpPolicy, createDesktops);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HourPackageResource {\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    usedUpPolicy: ").append(toIndentedString(usedUpPolicy)).append("\n");
        sb.append("    createDesktops: ").append(toIndentedString(createDesktops)).append("\n");
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
