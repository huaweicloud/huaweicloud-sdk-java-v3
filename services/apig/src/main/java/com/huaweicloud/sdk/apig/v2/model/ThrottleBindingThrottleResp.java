package com.huaweicloud.sdk.apig.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ThrottleBindingThrottleResp
 */
public class ThrottleBindingThrottleResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_call_limits")
    
    private Integer apiCallLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_call_limits")
    
    private Integer userCallLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_call_limits")
    
    private Integer appCallLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_call_limits")
    
    private Integer ipCallLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_interval")
    
    private Integer timeInterval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_unit")
    
    private String timeUnit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_include_special_throttle")
    
    private Integer isIncludeSpecialThrottle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_name")
    
    private String envName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_id")
    
    private String bindId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_time")
    
    private OffsetDateTime bindTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bind_num")
    
    private Integer bindNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_adaptive_control")
    
    private String enableAdaptiveControl;

    public ThrottleBindingThrottleResp withId(String id) {
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

    public ThrottleBindingThrottleResp withName(String name) {
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

    public ThrottleBindingThrottleResp withApiCallLimits(Integer apiCallLimits) {
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

    public ThrottleBindingThrottleResp withUserCallLimits(Integer userCallLimits) {
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

    public ThrottleBindingThrottleResp withAppCallLimits(Integer appCallLimits) {
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

    public ThrottleBindingThrottleResp withIpCallLimits(Integer ipCallLimits) {
        this.ipCallLimits = ipCallLimits;
        return this;
    }

    


    /**
     * 单个源IP流控时间内能够访问API的次数限制
     * @return ipCallLimits
     */
    public Integer getIpCallLimits() {
        return ipCallLimits;
    }

    public void setIpCallLimits(Integer ipCallLimits) {
        this.ipCallLimits = ipCallLimits;
    }

    public ThrottleBindingThrottleResp withTimeInterval(Integer timeInterval) {
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

    public ThrottleBindingThrottleResp withTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    


    /**
     * 流控的时间单位
     * @return timeUnit
     */
    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public ThrottleBindingThrottleResp withRemark(String remark) {
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

    public ThrottleBindingThrottleResp withCreateTime(OffsetDateTime createTime) {
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

    public ThrottleBindingThrottleResp withIsIncludeSpecialThrottle(Integer isIncludeSpecialThrottle) {
        this.isIncludeSpecialThrottle = isIncludeSpecialThrottle;
        return this;
    }

    


    /**
     * 是否包含特殊流控 - 1：包含 - 2：不包含
     * @return isIncludeSpecialThrottle
     */
    public Integer getIsIncludeSpecialThrottle() {
        return isIncludeSpecialThrottle;
    }

    public void setIsIncludeSpecialThrottle(Integer isIncludeSpecialThrottle) {
        this.isIncludeSpecialThrottle = isIncludeSpecialThrottle;
    }

    public ThrottleBindingThrottleResp withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    


    /**
     * 流控策略生效的环境（即在哪个环境上有效）
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public ThrottleBindingThrottleResp withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 流控策略的类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ThrottleBindingThrottleResp withBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }

    


    /**
     * 流控策略与API绑定关系编号
     * @return bindId
     */
    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public ThrottleBindingThrottleResp withBindTime(OffsetDateTime bindTime) {
        this.bindTime = bindTime;
        return this;
    }

    


    /**
     * 流控策略与API绑定时间
     * @return bindTime
     */
    public OffsetDateTime getBindTime() {
        return bindTime;
    }

    public void setBindTime(OffsetDateTime bindTime) {
        this.bindTime = bindTime;
    }

    public ThrottleBindingThrottleResp withBindNum(Integer bindNum) {
        this.bindNum = bindNum;
        return this;
    }

    


    /**
     * 流控策略绑定的API数量
     * @return bindNum
     */
    public Integer getBindNum() {
        return bindNum;
    }

    public void setBindNum(Integer bindNum) {
        this.bindNum = bindNum;
    }

    public ThrottleBindingThrottleResp withEnableAdaptiveControl(String enableAdaptiveControl) {
        this.enableAdaptiveControl = enableAdaptiveControl;
        return this;
    }

    


    /**
     * 是否开启动态流控，暂不支持
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
        ThrottleBindingThrottleResp throttleBindingThrottleResp = (ThrottleBindingThrottleResp) o;
        return Objects.equals(this.id, throttleBindingThrottleResp.id) &&
            Objects.equals(this.name, throttleBindingThrottleResp.name) &&
            Objects.equals(this.apiCallLimits, throttleBindingThrottleResp.apiCallLimits) &&
            Objects.equals(this.userCallLimits, throttleBindingThrottleResp.userCallLimits) &&
            Objects.equals(this.appCallLimits, throttleBindingThrottleResp.appCallLimits) &&
            Objects.equals(this.ipCallLimits, throttleBindingThrottleResp.ipCallLimits) &&
            Objects.equals(this.timeInterval, throttleBindingThrottleResp.timeInterval) &&
            Objects.equals(this.timeUnit, throttleBindingThrottleResp.timeUnit) &&
            Objects.equals(this.remark, throttleBindingThrottleResp.remark) &&
            Objects.equals(this.createTime, throttleBindingThrottleResp.createTime) &&
            Objects.equals(this.isIncludeSpecialThrottle, throttleBindingThrottleResp.isIncludeSpecialThrottle) &&
            Objects.equals(this.envName, throttleBindingThrottleResp.envName) &&
            Objects.equals(this.type, throttleBindingThrottleResp.type) &&
            Objects.equals(this.bindId, throttleBindingThrottleResp.bindId) &&
            Objects.equals(this.bindTime, throttleBindingThrottleResp.bindTime) &&
            Objects.equals(this.bindNum, throttleBindingThrottleResp.bindNum) &&
            Objects.equals(this.enableAdaptiveControl, throttleBindingThrottleResp.enableAdaptiveControl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, apiCallLimits, userCallLimits, appCallLimits, ipCallLimits, timeInterval, timeUnit, remark, createTime, isIncludeSpecialThrottle, envName, type, bindId, bindTime, bindNum, enableAdaptiveControl);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleBindingThrottleResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    apiCallLimits: ").append(toIndentedString(apiCallLimits)).append("\n");
        sb.append("    userCallLimits: ").append(toIndentedString(userCallLimits)).append("\n");
        sb.append("    appCallLimits: ").append(toIndentedString(appCallLimits)).append("\n");
        sb.append("    ipCallLimits: ").append(toIndentedString(ipCallLimits)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    isIncludeSpecialThrottle: ").append(toIndentedString(isIncludeSpecialThrottle)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    bindId: ").append(toIndentedString(bindId)).append("\n");
        sb.append("    bindTime: ").append(toIndentedString(bindTime)).append("\n");
        sb.append("    bindNum: ").append(toIndentedString(bindNum)).append("\n");
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

