package com.huaweicloud.sdk.roma.v2.model;

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
public class ShowAppQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_quota_id")

    private String appQuotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_limits")

    private Integer callLimits;

    /** 限定时间单位：SECOND:秒、MINUTE:分、HOURE:时、DAY:天 */
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
    @JsonProperty(value = "time_interval")

    private Integer timeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reset_time")

    private String resetTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bound_app_num")

    private Integer boundAppNum;

    public ShowAppQuotaResponse withAppQuotaId(String appQuotaId) {
        this.appQuotaId = appQuotaId;
        return this;
    }

    /** 客户端配额编号
     * 
     * @return appQuotaId */
    public String getAppQuotaId() {
        return appQuotaId;
    }

    public void setAppQuotaId(String appQuotaId) {
        this.appQuotaId = appQuotaId;
    }

    public ShowAppQuotaResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 配额名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3-255字符
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowAppQuotaResponse withCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
        return this;
    }

    /** 客户端配额的访问次数限制
     * 
     * @return callLimits */
    public Integer getCallLimits() {
        return callLimits;
    }

    public void setCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
    }

    public ShowAppQuotaResponse withTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /** 限定时间单位：SECOND:秒、MINUTE:分、HOURE:时、DAY:天
     * 
     * @return timeUnit */
    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    public ShowAppQuotaResponse withTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /** 配额的限定时间值
     * 
     * @return timeInterval */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    public ShowAppQuotaResponse withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /** 参数说明和描述
     * 
     * @return remark */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ShowAppQuotaResponse withResetTime(String resetTime) {
        this.resetTime = resetTime;
        return this;
    }

    /** 首次配额重置时间点，不配置默认为首次调用时间计算
     * 
     * @return resetTime */
    public String getResetTime() {
        return resetTime;
    }

    public void setResetTime(String resetTime) {
        this.resetTime = resetTime;
    }

    public ShowAppQuotaResponse withCreateTime(OffsetDateTime createTime) {
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

    public ShowAppQuotaResponse withBoundAppNum(Integer boundAppNum) {
        this.boundAppNum = boundAppNum;
        return this;
    }

    /** 配额策略已绑定应用数量
     * 
     * @return boundAppNum */
    public Integer getBoundAppNum() {
        return boundAppNum;
    }

    public void setBoundAppNum(Integer boundAppNum) {
        this.boundAppNum = boundAppNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAppQuotaResponse showAppQuotaResponse = (ShowAppQuotaResponse) o;
        return Objects.equals(this.appQuotaId, showAppQuotaResponse.appQuotaId)
            && Objects.equals(this.name, showAppQuotaResponse.name)
            && Objects.equals(this.callLimits, showAppQuotaResponse.callLimits)
            && Objects.equals(this.timeUnit, showAppQuotaResponse.timeUnit)
            && Objects.equals(this.timeInterval, showAppQuotaResponse.timeInterval)
            && Objects.equals(this.remark, showAppQuotaResponse.remark)
            && Objects.equals(this.resetTime, showAppQuotaResponse.resetTime)
            && Objects.equals(this.createTime, showAppQuotaResponse.createTime)
            && Objects.equals(this.boundAppNum, showAppQuotaResponse.boundAppNum);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(appQuotaId, name, callLimits, timeUnit, timeInterval, remark, resetTime, createTime, boundAppNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppQuotaResponse {\n");
        sb.append("    appQuotaId: ").append(toIndentedString(appQuotaId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    callLimits: ").append(toIndentedString(callLimits)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    resetTime: ").append(toIndentedString(resetTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    boundAppNum: ").append(toIndentedString(boundAppNum)).append("\n");
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
