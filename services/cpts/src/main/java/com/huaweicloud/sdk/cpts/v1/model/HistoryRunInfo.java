package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HistoryRunInfo
 */
public class HistoryRunInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_id")

    private Double runId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_type")

    private Double runType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue_time")

    private Double continueTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_names")

    private List<TempName> tempNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel")

    private Boolean parallel;

    public HistoryRunInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HistoryRunInfo withRunId(Double runId) {
        this.runId = runId;
        return this;
    }

    /**
     * 报告id
     * @return runId
     */
    public Double getRunId() {
        return runId;
    }

    public void setRunId(Double runId) {
        this.runId = runId;
    }

    public HistoryRunInfo withRunType(Double runType) {
        this.runType = runType;
        return this;
    }

    /**
     * 任务类型（0：旧版本任务；1：融合版本任务）
     * @return runType
     */
    public Double getRunType() {
        return runType;
    }

    public void setRunType(Double runType) {
        this.runType = runType;
    }

    public HistoryRunInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public HistoryRunInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public HistoryRunInfo withContinueTime(Double continueTime) {
        this.continueTime = continueTime;
        return this;
    }

    /**
     * 继续时间
     * @return continueTime
     */
    public Double getContinueTime() {
        return continueTime;
    }

    public void setContinueTime(Double continueTime) {
        this.continueTime = continueTime;
    }

    public HistoryRunInfo withTempNames(List<TempName> tempNames) {
        this.tempNames = tempNames;
        return this;
    }

    public HistoryRunInfo addTempNamesItem(TempName tempNamesItem) {
        if (this.tempNames == null) {
            this.tempNames = new ArrayList<>();
        }
        this.tempNames.add(tempNamesItem);
        return this;
    }

    public HistoryRunInfo withTempNames(Consumer<List<TempName>> tempNamesSetter) {
        if (this.tempNames == null) {
            this.tempNames = new ArrayList<>();
        }
        tempNamesSetter.accept(this.tempNames);
        return this;
    }

    /**
     * 用例或者事务名称
     * @return tempNames
     */
    public List<TempName> getTempNames() {
        return tempNames;
    }

    public void setTempNames(List<TempName> tempNames) {
        this.tempNames = tempNames;
    }

    public HistoryRunInfo withParallel(Boolean parallel) {
        this.parallel = parallel;
        return this;
    }

    /**
     * 任务间用例是否并行执行
     * @return parallel
     */
    public Boolean getParallel() {
        return parallel;
    }

    public void setParallel(Boolean parallel) {
        this.parallel = parallel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HistoryRunInfo that = (HistoryRunInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.runId, that.runId)
            && Objects.equals(this.runType, that.runType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.continueTime, that.continueTime)
            && Objects.equals(this.tempNames, that.tempNames) && Objects.equals(this.parallel, that.parallel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, runId, runType, startTime, endTime, continueTime, tempNames, parallel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryRunInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    continueTime: ").append(toIndentedString(continueTime)).append("\n");
        sb.append("    tempNames: ").append(toIndentedString(tempNames)).append("\n");
        sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
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
