package com.huaweicloud.sdk.apig.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ThrottleResp
 */
public class ThrottleResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_num")
    
    private Integer bindNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_include_special_throttle")
    
    private Integer isIncludeSpecialThrottle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_interval")
    
    private Integer timeInterval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_call_limits")
    
    private Integer ipCallLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_call_limits")
    
    private Integer appCallLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 流控的时间单位
     */
    public static final class TimeUnitEnum {

        
        /**
         * Enum SECOND for value: "SECOND"
         */
        public static final TimeUnitEnum SECOND = new TimeUnitEnum("SECOND");
        
        /**
         * Enum MINUTE for value: "MINUTE"
         */
        public static final TimeUnitEnum MINUTE = new TimeUnitEnum("MINUTE");
        
        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final TimeUnitEnum HOUR = new TimeUnitEnum("HOUR");
        
        /**
         * Enum DAY for value: "DAY"
         */
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TimeUnitEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TimeUnitEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TimeUnitEnum(value);
            }
            return result;
        }

        public static TimeUnitEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof TimeUnitEnum) {
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
    @JsonProperty(value="time_unit")
    
    private TimeUnitEnum timeUnit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_call_limits")
    
    private Integer apiCallLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_call_limits")
    
    private Integer userCallLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_adaptive_control")
    
    private String enableAdaptiveControl;

    public ThrottleResp withBindNum(Integer bindNum) {
        this.bindNum = bindNum;
        return this;
    }

    


    /**
     * 流控绑定的API数量
     * @return bindNum
     */
    public Integer getBindNum() {
        return bindNum;
    }

    public void setBindNum(Integer bindNum) {
        this.bindNum = bindNum;
    }

    

    public ThrottleResp withIsIncludeSpecialThrottle(Integer isIncludeSpecialThrottle) {
        this.isIncludeSpecialThrottle = isIncludeSpecialThrottle;
        return this;
    }

    


    /**
     * 是否包含特殊流控配置 - 1：包含 - 2：不包含
     * @return isIncludeSpecialThrottle
     */
    public Integer getIsIncludeSpecialThrottle() {
        return isIncludeSpecialThrottle;
    }

    public void setIsIncludeSpecialThrottle(Integer isIncludeSpecialThrottle) {
        this.isIncludeSpecialThrottle = isIncludeSpecialThrottle;
    }

    

    public ThrottleResp withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    

    public ThrottleResp withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 描述
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public ThrottleResp withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 流控策略的类型 - 1：独享，表示绑定到流控策略的单个API流控时间内能够被调用多少次。 - 2：共享，表示绑定到流控策略的所有API流控时间内能够被调用多少次
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    public ThrottleResp withTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    


    /**
     * 流控的时长
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    

    public ThrottleResp withIpCallLimits(Integer ipCallLimits) {
        this.ipCallLimits = ipCallLimits;
        return this;
    }

    


    /**
     * 单个IP流控时间内能够访问API的次数限制
     * @return ipCallLimits
     */
    public Integer getIpCallLimits() {
        return ipCallLimits;
    }

    public void setIpCallLimits(Integer ipCallLimits) {
        this.ipCallLimits = ipCallLimits;
    }

    

    public ThrottleResp withAppCallLimits(Integer appCallLimits) {
        this.appCallLimits = appCallLimits;
        return this;
    }

    


    /**
     * 单个APP流控时间内能够访问API的次数限制
     * @return appCallLimits
     */
    public Integer getAppCallLimits() {
        return appCallLimits;
    }

    public void setAppCallLimits(Integer appCallLimits) {
        this.appCallLimits = appCallLimits;
    }

    

    public ThrottleResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 流控策略的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ThrottleResp withTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    


    /**
     * 流控的时间单位
     * @return timeUnit
     */
    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    

    public ThrottleResp withApiCallLimits(Integer apiCallLimits) {
        this.apiCallLimits = apiCallLimits;
        return this;
    }

    


    /**
     * 单个API流控时间内能够被访问的次数限制
     * @return apiCallLimits
     */
    public Integer getApiCallLimits() {
        return apiCallLimits;
    }

    public void setApiCallLimits(Integer apiCallLimits) {
        this.apiCallLimits = apiCallLimits;
    }

    

    public ThrottleResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 流控策略的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ThrottleResp withUserCallLimits(Integer userCallLimits) {
        this.userCallLimits = userCallLimits;
        return this;
    }

    


    /**
     * 单个用户流控时间内能够访问API的次数限制
     * @return userCallLimits
     */
    public Integer getUserCallLimits() {
        return userCallLimits;
    }

    public void setUserCallLimits(Integer userCallLimits) {
        this.userCallLimits = userCallLimits;
    }

    

    public ThrottleResp withEnableAdaptiveControl(String enableAdaptiveControl) {
        this.enableAdaptiveControl = enableAdaptiveControl;
        return this;
    }

    


    /**
     * 是否开启动态流控  暂不支持
     * @return enableAdaptiveControl
     */
    public String getEnableAdaptiveControl() {
        return enableAdaptiveControl;
    }

    public void setEnableAdaptiveControl(String enableAdaptiveControl) {
        this.enableAdaptiveControl = enableAdaptiveControl;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThrottleResp throttleResp = (ThrottleResp) o;
        return Objects.equals(this.bindNum, throttleResp.bindNum) &&
            Objects.equals(this.isIncludeSpecialThrottle, throttleResp.isIncludeSpecialThrottle) &&
            Objects.equals(this.createTime, throttleResp.createTime) &&
            Objects.equals(this.remark, throttleResp.remark) &&
            Objects.equals(this.type, throttleResp.type) &&
            Objects.equals(this.timeInterval, throttleResp.timeInterval) &&
            Objects.equals(this.ipCallLimits, throttleResp.ipCallLimits) &&
            Objects.equals(this.appCallLimits, throttleResp.appCallLimits) &&
            Objects.equals(this.name, throttleResp.name) &&
            Objects.equals(this.timeUnit, throttleResp.timeUnit) &&
            Objects.equals(this.apiCallLimits, throttleResp.apiCallLimits) &&
            Objects.equals(this.id, throttleResp.id) &&
            Objects.equals(this.userCallLimits, throttleResp.userCallLimits) &&
            Objects.equals(this.enableAdaptiveControl, throttleResp.enableAdaptiveControl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bindNum, isIncludeSpecialThrottle, createTime, remark, type, timeInterval, ipCallLimits, appCallLimits, name, timeUnit, apiCallLimits, id, userCallLimits, enableAdaptiveControl);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleResp {\n");
        sb.append("    bindNum: ").append(toIndentedString(bindNum)).append("\n");
        sb.append("    isIncludeSpecialThrottle: ").append(toIndentedString(isIncludeSpecialThrottle)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    ipCallLimits: ").append(toIndentedString(ipCallLimits)).append("\n");
        sb.append("    appCallLimits: ").append(toIndentedString(appCallLimits)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    apiCallLimits: ").append(toIndentedString(apiCallLimits)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userCallLimits: ").append(toIndentedString(userCallLimits)).append("\n");
        sb.append("    enableAdaptiveControl: ").append(toIndentedString(enableAdaptiveControl)).append("\n");
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

