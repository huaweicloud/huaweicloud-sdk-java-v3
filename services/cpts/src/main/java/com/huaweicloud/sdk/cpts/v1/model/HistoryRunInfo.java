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
    @JsonProperty(value = "continue_time")

    private Double continueTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_names")

    private List<TempName> tempNames = null;

    public HistoryRunInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
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
     * run_id
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
     * run_type
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
     * start_time
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public HistoryRunInfo withContinueTime(Double continueTime) {
        this.continueTime = continueTime;
        return this;
    }

    /**
     * continue_time
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
     * temp_names
     * @return tempNames
     */
    public List<TempName> getTempNames() {
        return tempNames;
    }

    public void setTempNames(List<TempName> tempNames) {
        this.tempNames = tempNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoryRunInfo historyRunInfo = (HistoryRunInfo) o;
        return Objects.equals(this.name, historyRunInfo.name) && Objects.equals(this.runId, historyRunInfo.runId)
            && Objects.equals(this.runType, historyRunInfo.runType)
            && Objects.equals(this.startTime, historyRunInfo.startTime)
            && Objects.equals(this.continueTime, historyRunInfo.continueTime)
            && Objects.equals(this.tempNames, historyRunInfo.tempNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, runId, runType, startTime, continueTime, tempNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryRunInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    continueTime: ").append(toIndentedString(continueTime)).append("\n");
        sb.append("    tempNames: ").append(toIndentedString(tempNames)).append("\n");
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
