package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TestCaseStage
 */
public class TestCaseStage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_mode")

    private Integer operateMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Integer time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Integer startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Integer endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_num")

    private Integer issueNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pressure_mode")

    private Integer pressureMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps_value")

    private Integer tpsValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_user_num")

    private Integer currentUserNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_tps")

    private Integer currentTps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voltage_regulating_mode")

    private Integer voltageRegulatingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum")

    private Integer maximum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum")

    private Integer minimum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loop_count")

    private Integer loopCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_duration")

    private Integer maxDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ramp_up")

    private Integer rampUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peak_load_kpis")

    private StageKpiItems peakLoadKpis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_duration")

    private Integer stepDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_size")

    private Integer stepSize;

    public TestCaseStage withOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
        return this;
    }

    /**
     * 压力阶段模式，0：时长模式；1：次数模式
     * @return operateMode
     */
    public Integer getOperateMode() {
        return operateMode;
    }

    public void setOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
    }

    public TestCaseStage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 阶段名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestCaseStage withTime(Integer time) {
        this.time = time;
        return this;
    }

    /**
     * 压测时长（单位：秒）
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public TestCaseStage withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public TestCaseStage withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public TestCaseStage withIssueNum(Integer issueNum) {
        this.issueNum = issueNum;
        return this;
    }

    /**
     * 最大并发数
     * @return issueNum
     */
    public Integer getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(Integer issueNum) {
        this.issueNum = issueNum;
    }

    public TestCaseStage withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 次数模式发送总次数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public TestCaseStage withPressureMode(Integer pressureMode) {
        this.pressureMode = pressureMode;
        return this;
    }

    /**
     * 压力模式，0：并发模式；1：TPS模式；2：摸高模式；3：浪涌并发模式；4：浪涌TPS模式；5：震荡并发模式；6：震荡TPS模式；7：智能摸高模式
     * @return pressureMode
     */
    public Integer getPressureMode() {
        return pressureMode;
    }

    public void setPressureMode(Integer pressureMode) {
        this.pressureMode = pressureMode;
    }

    public TestCaseStage withTpsValue(Integer tpsValue) {
        this.tpsValue = tpsValue;
        return this;
    }

    /**
     * TPS模式下TPS值
     * @return tpsValue
     */
    public Integer getTpsValue() {
        return tpsValue;
    }

    public void setTpsValue(Integer tpsValue) {
        this.tpsValue = tpsValue;
    }

    public TestCaseStage withCurrentUserNum(Integer currentUserNum) {
        this.currentUserNum = currentUserNum;
        return this;
    }

    /**
     * 起始并发数
     * @return currentUserNum
     */
    public Integer getCurrentUserNum() {
        return currentUserNum;
    }

    public void setCurrentUserNum(Integer currentUserNum) {
        this.currentUserNum = currentUserNum;
    }

    public TestCaseStage withCurrentTps(Integer currentTps) {
        this.currentTps = currentTps;
        return this;
    }

    /**
     * 起始tps值
     * @return currentTps
     */
    public Integer getCurrentTps() {
        return currentTps;
    }

    public void setCurrentTps(Integer currentTps) {
        this.currentTps = currentTps;
    }

    public TestCaseStage withVoltageRegulatingMode(Integer voltageRegulatingMode) {
        this.voltageRegulatingMode = voltageRegulatingMode;
        return this;
    }

    /**
     * 调压模式，0：自动调压模式；1：手动调压模式
     * @return voltageRegulatingMode
     */
    public Integer getVoltageRegulatingMode() {
        return voltageRegulatingMode;
    }

    public void setVoltageRegulatingMode(Integer voltageRegulatingMode) {
        this.voltageRegulatingMode = voltageRegulatingMode;
    }

    public TestCaseStage withMaximum(Integer maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * 浪涌/浪涌模式下最大并发数
     * @return maximum
     */
    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    public TestCaseStage withMinimum(Integer minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * 浪涌/浪涌模式下最小并发数
     * @return minimum
     */
    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public TestCaseStage withLoopCount(Integer loopCount) {
        this.loopCount = loopCount;
        return this;
    }

    /**
     * 震荡/浪涌次数
     * @return loopCount
     */
    public Integer getLoopCount() {
        return loopCount;
    }

    public void setLoopCount(Integer loopCount) {
        this.loopCount = loopCount;
    }

    public TestCaseStage withMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * 浪涌模式下峰值持续时间
     * @return maxDuration
     */
    public Integer getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    public TestCaseStage withRampUp(Integer rampUp) {
        this.rampUp = rampUp;
        return this;
    }

    /**
     * 摸高模式下爬坡时长（单位：秒）
     * @return rampUp
     */
    public Integer getRampUp() {
        return rampUp;
    }

    public void setRampUp(Integer rampUp) {
        this.rampUp = rampUp;
    }

    public TestCaseStage withPeakLoadKpis(StageKpiItems peakLoadKpis) {
        this.peakLoadKpis = peakLoadKpis;
        return this;
    }

    public TestCaseStage withPeakLoadKpis(Consumer<StageKpiItems> peakLoadKpisSetter) {
        if (this.peakLoadKpis == null) {
            this.peakLoadKpis = new StageKpiItems();
            peakLoadKpisSetter.accept(this.peakLoadKpis);
        }

        return this;
    }

    /**
     * Get peakLoadKpis
     * @return peakLoadKpis
     */
    public StageKpiItems getPeakLoadKpis() {
        return peakLoadKpis;
    }

    public void setPeakLoadKpis(StageKpiItems peakLoadKpis) {
        this.peakLoadKpis = peakLoadKpis;
    }

    public TestCaseStage withStepDuration(Integer stepDuration) {
        this.stepDuration = stepDuration;
        return this;
    }

    /**
     * 智能摸高模式下单步执行时长
     * @return stepDuration
     */
    public Integer getStepDuration() {
        return stepDuration;
    }

    public void setStepDuration(Integer stepDuration) {
        this.stepDuration = stepDuration;
    }

    public TestCaseStage withStepSize(Integer stepSize) {
        this.stepSize = stepSize;
        return this;
    }

    /**
     * 智能摸高模式下递增并发数
     * @return stepSize
     */
    public Integer getStepSize() {
        return stepSize;
    }

    public void setStepSize(Integer stepSize) {
        this.stepSize = stepSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestCaseStage testCaseStage = (TestCaseStage) o;
        return Objects.equals(this.operateMode, testCaseStage.operateMode)
            && Objects.equals(this.name, testCaseStage.name) && Objects.equals(this.time, testCaseStage.time)
            && Objects.equals(this.startTime, testCaseStage.startTime)
            && Objects.equals(this.endTime, testCaseStage.endTime)
            && Objects.equals(this.issueNum, testCaseStage.issueNum) && Objects.equals(this.count, testCaseStage.count)
            && Objects.equals(this.pressureMode, testCaseStage.pressureMode)
            && Objects.equals(this.tpsValue, testCaseStage.tpsValue)
            && Objects.equals(this.currentUserNum, testCaseStage.currentUserNum)
            && Objects.equals(this.currentTps, testCaseStage.currentTps)
            && Objects.equals(this.voltageRegulatingMode, testCaseStage.voltageRegulatingMode)
            && Objects.equals(this.maximum, testCaseStage.maximum)
            && Objects.equals(this.minimum, testCaseStage.minimum)
            && Objects.equals(this.loopCount, testCaseStage.loopCount)
            && Objects.equals(this.maxDuration, testCaseStage.maxDuration)
            && Objects.equals(this.rampUp, testCaseStage.rampUp)
            && Objects.equals(this.peakLoadKpis, testCaseStage.peakLoadKpis)
            && Objects.equals(this.stepDuration, testCaseStage.stepDuration)
            && Objects.equals(this.stepSize, testCaseStage.stepSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateMode,
            name,
            time,
            startTime,
            endTime,
            issueNum,
            count,
            pressureMode,
            tpsValue,
            currentUserNum,
            currentTps,
            voltageRegulatingMode,
            maximum,
            minimum,
            loopCount,
            maxDuration,
            rampUp,
            peakLoadKpis,
            stepDuration,
            stepSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseStage {\n");
        sb.append("    operateMode: ").append(toIndentedString(operateMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    issueNum: ").append(toIndentedString(issueNum)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pressureMode: ").append(toIndentedString(pressureMode)).append("\n");
        sb.append("    tpsValue: ").append(toIndentedString(tpsValue)).append("\n");
        sb.append("    currentUserNum: ").append(toIndentedString(currentUserNum)).append("\n");
        sb.append("    currentTps: ").append(toIndentedString(currentTps)).append("\n");
        sb.append("    voltageRegulatingMode: ").append(toIndentedString(voltageRegulatingMode)).append("\n");
        sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
        sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
        sb.append("    loopCount: ").append(toIndentedString(loopCount)).append("\n");
        sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
        sb.append("    rampUp: ").append(toIndentedString(rampUp)).append("\n");
        sb.append("    peakLoadKpis: ").append(toIndentedString(peakLoadKpis)).append("\n");
        sb.append("    stepDuration: ").append(toIndentedString(stepDuration)).append("\n");
        sb.append("    stepSize: ").append(toIndentedString(stepSize)).append("\n");
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
