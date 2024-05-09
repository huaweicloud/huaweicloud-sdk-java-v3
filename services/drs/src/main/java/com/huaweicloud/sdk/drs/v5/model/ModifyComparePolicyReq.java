package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改对比策略请求体。
 */
public class ModifyComparePolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private List<String> compareType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_policy")

    private String comparePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_hour")

    private Integer intervalHour;

    public ModifyComparePolicyReq withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 对比策略开关-open|close。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ModifyComparePolicyReq withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 对比策略周期。 - 每周对比：格式示例：“* * 1,3,5” ，其中“1,3,5”对应星期一、星期三、星期五，根据实际填写。 - 每天对比：固定填写“* * 1,2,3,4,5,6,7”。 - 按小时对比：固定填写“* * 1,2,3,4,5,6,7”。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ModifyComparePolicyReq withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 对比策略生效开始时间，UTC时间，24小时制，时间格式HH:mm:ss，例如：00:00:00，表示UTC时间的00:00:00，北京时间（UTC+08:00）的08:00:00。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ModifyComparePolicyReq withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 对比策略生效结束时间，UTC时间，24小时制，时间格式HH:mm:ss，例如：04:00:00，表示UTC时间的04:00:00，北京时间（UTC+08:00）的12:00:00。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ModifyComparePolicyReq withCompareType(List<String> compareType) {
        this.compareType = compareType;
        return this;
    }

    public ModifyComparePolicyReq addCompareTypeItem(String compareTypeItem) {
        if (this.compareType == null) {
            this.compareType = new ArrayList<>();
        }
        this.compareType.add(compareTypeItem);
        return this;
    }

    public ModifyComparePolicyReq withCompareType(Consumer<List<String>> compareTypeSetter) {
        if (this.compareType == null) {
            this.compareType = new ArrayList<>();
        }
        compareTypeSetter.accept(this.compareType);
        return this;
    }

    /**
     * 对比类型列表： - object_comparison：对象对比。 - lines：行对比。 - account：用户对比。
     * @return compareType
     */
    public List<String> getCompareType() {
        return compareType;
    }

    public void setCompareType(List<String> compareType) {
        this.compareType = compareType;
    }

    public ModifyComparePolicyReq withComparePolicy(String comparePolicy) {
        this.comparePolicy = comparePolicy;
        return this;
    }

    /**
     * 对比策略： - normal：普通对比。 - manyToOne：多对一对比。
     * @return comparePolicy
     */
    public String getComparePolicy() {
        return comparePolicy;
    }

    public void setComparePolicy(String comparePolicy) {
        this.comparePolicy = comparePolicy;
    }

    public ModifyComparePolicyReq withIntervalHour(Integer intervalHour) {
        this.intervalHour = intervalHour;
        return this;
    }

    /**
     * 间隔时间，按小时对比时填写，表示每隔多久执行一次对比，单位是小时。
     * @return intervalHour
     */
    public Integer getIntervalHour() {
        return intervalHour;
    }

    public void setIntervalHour(Integer intervalHour) {
        this.intervalHour = intervalHour;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyComparePolicyReq that = (ModifyComparePolicyReq) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.period, that.period)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.compareType, that.compareType)
            && Objects.equals(this.comparePolicy, that.comparePolicy)
            && Objects.equals(this.intervalHour, that.intervalHour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, period, beginTime, endTime, compareType, comparePolicy, intervalHour);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyComparePolicyReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    comparePolicy: ").append(toIndentedString(comparePolicy)).append("\n");
        sb.append("    intervalHour: ").append(toIndentedString(intervalHour)).append("\n");
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
