package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Response Object */
public class UpdateRequestThrottlingPolicyV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_call_limits")

    private Integer appCallLimits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** 流控的时间单位 */
    public static final class TimeUnitEnum {

        /** Enum SECOND for value: "SECOND" */
        public static final TimeUnitEnum SECOND = new TimeUnitEnum("SECOND");

        /** Enum MINUTE for value: "MINUTE" */
        public static final TimeUnitEnum MINUTE = new TimeUnitEnum("MINUTE");

        /** Enum HOUR for value: "HOUR" */
        public static final TimeUnitEnum HOUR = new TimeUnitEnum("HOUR");

        /** Enum DAY for value: "DAY" */
        public static final TimeUnitEnum DAY = new TimeUnitEnum("DAY");

        private static final Map<String, TimeUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimeUnitEnum> createStaticFields() {
            Map<String, TimeUnitEnum> map = new HashMap<>();
            map.put("SECOND", SECOND);
            map.put("MINUTE", MINUTE);
            map.put("HOUR", HOUR);
            map.put("DAY", DAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TimeUnitEnum(String value) {
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
        public static TimeUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TimeUnitEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TimeUnitEnum(value);
            }
            return result;
        }

        public static TimeUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TimeUnitEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimeUnitEnum) {
                return this.value.equals(((TimeUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_unit")

    private TimeUnitEnum timeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_call_limits")

    private Integer apiCallLimits;

    /** 流控策略的类型 - 1：基础，表示绑定到流控策略的单个API流控时间内能够被调用多少次。 - 2：共享，表示绑定到流控策略的所有API流控时间内能够被调用多少次。 */
    public static final class TypeEnum {

        /** Enum NUMBER_1 for value: 1 */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);

        /** Enum NUMBER_2 for value: 2 */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2);

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TypeEnum(Integer value) {
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
        public static TypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "enable_adaptive_control")

    private String enableAdaptiveControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_call_limits")

    private Integer userCallLimits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_interval")

    private Integer timeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_call_limits")

    private Integer ipCallLimits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_num")

    private Integer bindNum;

    /** 是否包含特殊流控配置 - 1：包含 - 2：不包含 */
    public static final class IsIncluSpecialThrottleEnum {

        /** Enum NUMBER_1 for value: 1 */
        public static final IsIncluSpecialThrottleEnum NUMBER_1 = new IsIncluSpecialThrottleEnum(1);

        /** Enum NUMBER_2 for value: 2 */
        public static final IsIncluSpecialThrottleEnum NUMBER_2 = new IsIncluSpecialThrottleEnum(2);

        private static final Map<Integer, IsIncluSpecialThrottleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IsIncluSpecialThrottleEnum> createStaticFields() {
            Map<Integer, IsIncluSpecialThrottleEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IsIncluSpecialThrottleEnum(Integer value) {
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
        public static IsIncluSpecialThrottleEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            IsIncluSpecialThrottleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsIncluSpecialThrottleEnum(value);
            }
            return result;
        }

        public static IsIncluSpecialThrottleEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            IsIncluSpecialThrottleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsIncluSpecialThrottleEnum) {
                return this.value.equals(((IsIncluSpecialThrottleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_inclu_special_throttle")

    private IsIncluSpecialThrottleEnum isIncluSpecialThrottle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    public UpdateRequestThrottlingPolicyV2Response withAppCallLimits(Integer appCallLimits) {
        this.appCallLimits = appCallLimits;
        return this;
    }

    /** APP流量限制是指一个API在时长之内被每个APP访问的次数上限，该数值不超过用户流量限制值。输入的值不超过2147483647。正整数。
     * 
     * @return appCallLimits */
    public Integer getAppCallLimits() {
        return appCallLimits;
    }

    public void setAppCallLimits(Integer appCallLimits) {
        this.appCallLimits = appCallLimits;
    }

    public UpdateRequestThrottlingPolicyV2Response withName(String name) {
        this.name = name;
        return this;
    }

    /** 流控策略名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3 ~ 64字符。 > 中文字符必须为UTF-8或者unicode编码。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRequestThrottlingPolicyV2Response withTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /** 流控的时间单位
     * 
     * @return timeUnit */
    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    public UpdateRequestThrottlingPolicyV2Response withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /** 流控策略描述字符长度不超过255。 > 中文字符必须为UTF-8或者unicode编码。
     * 
     * @return remark */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public UpdateRequestThrottlingPolicyV2Response withApiCallLimits(Integer apiCallLimits) {
        this.apiCallLimits = apiCallLimits;
        return this;
    }

    /** API流量限制是指时长内一个API能够被访问的次数上限。该值不超过系统默认配额限制，系统默认配额为200tps，用户可根据实际情况修改该系统默认配额。输入的值不超过2147483647。正整数。
     * 
     * @return apiCallLimits */
    public Integer getApiCallLimits() {
        return apiCallLimits;
    }

    public void setApiCallLimits(Integer apiCallLimits) {
        this.apiCallLimits = apiCallLimits;
    }

    public UpdateRequestThrottlingPolicyV2Response withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 流控策略的类型 - 1：基础，表示绑定到流控策略的单个API流控时间内能够被调用多少次。 - 2：共享，表示绑定到流控策略的所有API流控时间内能够被调用多少次。
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateRequestThrottlingPolicyV2Response withEnableAdaptiveControl(String enableAdaptiveControl) {
        this.enableAdaptiveControl = enableAdaptiveControl;
        return this;
    }

    /** 是否开启动态流控： - TRUE - FALSE 暂不支持
     * 
     * @return enableAdaptiveControl */
    public String getEnableAdaptiveControl() {
        return enableAdaptiveControl;
    }

    public void setEnableAdaptiveControl(String enableAdaptiveControl) {
        this.enableAdaptiveControl = enableAdaptiveControl;
    }

    public UpdateRequestThrottlingPolicyV2Response withUserCallLimits(Integer userCallLimits) {
        this.userCallLimits = userCallLimits;
        return this;
    }

    /** [用户流量限制是指一个API在时长之内每一个用户能访问的次数上限，该数值不超过API流量限制值。输入的值不超过2147483647。正整数。](tag:hws;hws_hk;hcs;fcs;g42;)[site不支持用户流量限制,输入值为0](tag:Site)
     * 
     * @return userCallLimits */
    public Integer getUserCallLimits() {
        return userCallLimits;
    }

    public void setUserCallLimits(Integer userCallLimits) {
        this.userCallLimits = userCallLimits;
    }

    public UpdateRequestThrottlingPolicyV2Response withTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /** 流量控制的时长单位。与“流量限制次数”配合使用，表示单位时间内的API请求次数上限。输入的值不超过2147483647。正整数。
     * 
     * @return timeInterval */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    public UpdateRequestThrottlingPolicyV2Response withIpCallLimits(Integer ipCallLimits) {
        this.ipCallLimits = ipCallLimits;
        return this;
    }

    /** 源IP流量限制是指一个API在时长之内被每个IP访问的次数上限，该数值不超过API流量限制值。输入的值不超过2147483647。正整数。
     * 
     * @return ipCallLimits */
    public Integer getIpCallLimits() {
        return ipCallLimits;
    }

    public void setIpCallLimits(Integer ipCallLimits) {
        this.ipCallLimits = ipCallLimits;
    }

    public UpdateRequestThrottlingPolicyV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /** 流控策略的ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateRequestThrottlingPolicyV2Response withBindNum(Integer bindNum) {
        this.bindNum = bindNum;
        return this;
    }

    /** 流控绑定的API数量
     * 
     * @return bindNum */
    public Integer getBindNum() {
        return bindNum;
    }

    public void setBindNum(Integer bindNum) {
        this.bindNum = bindNum;
    }

    public UpdateRequestThrottlingPolicyV2Response withIsIncluSpecialThrottle(
        IsIncluSpecialThrottleEnum isIncluSpecialThrottle) {
        this.isIncluSpecialThrottle = isIncluSpecialThrottle;
        return this;
    }

    /** 是否包含特殊流控配置 - 1：包含 - 2：不包含
     * 
     * @return isIncluSpecialThrottle */
    public IsIncluSpecialThrottleEnum getIsIncluSpecialThrottle() {
        return isIncluSpecialThrottle;
    }

    public void setIsIncluSpecialThrottle(IsIncluSpecialThrottleEnum isIncluSpecialThrottle) {
        this.isIncluSpecialThrottle = isIncluSpecialThrottle;
    }

    public UpdateRequestThrottlingPolicyV2Response withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间
     * 
     * @return createTime */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRequestThrottlingPolicyV2Response updateRequestThrottlingPolicyV2Response =
            (UpdateRequestThrottlingPolicyV2Response) o;
        return Objects.equals(this.appCallLimits, updateRequestThrottlingPolicyV2Response.appCallLimits)
            && Objects.equals(this.name, updateRequestThrottlingPolicyV2Response.name)
            && Objects.equals(this.timeUnit, updateRequestThrottlingPolicyV2Response.timeUnit)
            && Objects.equals(this.remark, updateRequestThrottlingPolicyV2Response.remark)
            && Objects.equals(this.apiCallLimits, updateRequestThrottlingPolicyV2Response.apiCallLimits)
            && Objects.equals(this.type, updateRequestThrottlingPolicyV2Response.type)
            && Objects.equals(this.enableAdaptiveControl, updateRequestThrottlingPolicyV2Response.enableAdaptiveControl)
            && Objects.equals(this.userCallLimits, updateRequestThrottlingPolicyV2Response.userCallLimits)
            && Objects.equals(this.timeInterval, updateRequestThrottlingPolicyV2Response.timeInterval)
            && Objects.equals(this.ipCallLimits, updateRequestThrottlingPolicyV2Response.ipCallLimits)
            && Objects.equals(this.id, updateRequestThrottlingPolicyV2Response.id)
            && Objects.equals(this.bindNum, updateRequestThrottlingPolicyV2Response.bindNum)
            && Objects.equals(this.isIncluSpecialThrottle,
                updateRequestThrottlingPolicyV2Response.isIncluSpecialThrottle)
            && Objects.equals(this.createTime, updateRequestThrottlingPolicyV2Response.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appCallLimits,
            name,
            timeUnit,
            remark,
            apiCallLimits,
            type,
            enableAdaptiveControl,
            userCallLimits,
            timeInterval,
            ipCallLimits,
            id,
            bindNum,
            isIncluSpecialThrottle,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRequestThrottlingPolicyV2Response {\n");
        sb.append("    appCallLimits: ").append(toIndentedString(appCallLimits)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    apiCallLimits: ").append(toIndentedString(apiCallLimits)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enableAdaptiveControl: ").append(toIndentedString(enableAdaptiveControl)).append("\n");
        sb.append("    userCallLimits: ").append(toIndentedString(userCallLimits)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    ipCallLimits: ").append(toIndentedString(ipCallLimits)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    bindNum: ").append(toIndentedString(bindNum)).append("\n");
        sb.append("    isIncluSpecialThrottle: ").append(toIndentedString(isIncluSpecialThrottle)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
