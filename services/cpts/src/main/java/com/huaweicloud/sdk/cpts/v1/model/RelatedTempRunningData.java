package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RelatedTempRunningData
 */
public class RelatedTempRunningData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_run_info_id")

    private Integer taskRunInfoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_temp_running_id")

    private Integer relatedTempRunningId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_id")

    private Integer tempId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_name")

    private String tempName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_temp_running_data")

    private List<TempRunningData> relatedTempRunningData = null;

    public RelatedTempRunningData withTaskRunInfoId(Integer taskRunInfoId) {
        this.taskRunInfoId = taskRunInfoId;
        return this;
    }

    /**
     * task_run_info_id
     * minimum: 0
     * maximum: 2147483647
     * @return taskRunInfoId
     */
    public Integer getTaskRunInfoId() {
        return taskRunInfoId;
    }

    public void setTaskRunInfoId(Integer taskRunInfoId) {
        this.taskRunInfoId = taskRunInfoId;
    }

    public RelatedTempRunningData withRelatedTempRunningId(Integer relatedTempRunningId) {
        this.relatedTempRunningId = relatedTempRunningId;
        return this;
    }

    /**
     * related_temp_running_id
     * minimum: 0
     * maximum: 2147483647
     * @return relatedTempRunningId
     */
    public Integer getRelatedTempRunningId() {
        return relatedTempRunningId;
    }

    public void setRelatedTempRunningId(Integer relatedTempRunningId) {
        this.relatedTempRunningId = relatedTempRunningId;
    }

    public RelatedTempRunningData withTempId(Integer tempId) {
        this.tempId = tempId;
        return this;
    }

    /**
     * temp_id
     * minimum: 0
     * maximum: 2147483647
     * @return tempId
     */
    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public RelatedTempRunningData withTempName(String tempName) {
        this.tempName = tempName;
        return this;
    }

    /**
     * temp_name
     * @return tempName
     */
    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public RelatedTempRunningData withRelatedTempRunningData(List<TempRunningData> relatedTempRunningData) {
        this.relatedTempRunningData = relatedTempRunningData;
        return this;
    }

    public RelatedTempRunningData addRelatedTempRunningDataItem(TempRunningData relatedTempRunningDataItem) {
        if (this.relatedTempRunningData == null) {
            this.relatedTempRunningData = new ArrayList<>();
        }
        this.relatedTempRunningData.add(relatedTempRunningDataItem);
        return this;
    }

    public RelatedTempRunningData withRelatedTempRunningData(
        Consumer<List<TempRunningData>> relatedTempRunningDataSetter) {
        if (this.relatedTempRunningData == null) {
            this.relatedTempRunningData = new ArrayList<>();
        }
        relatedTempRunningDataSetter.accept(this.relatedTempRunningData);
        return this;
    }

    /**
     * related_temp_running_data
     * @return relatedTempRunningData
     */
    public List<TempRunningData> getRelatedTempRunningData() {
        return relatedTempRunningData;
    }

    public void setRelatedTempRunningData(List<TempRunningData> relatedTempRunningData) {
        this.relatedTempRunningData = relatedTempRunningData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelatedTempRunningData relatedTempRunningData = (RelatedTempRunningData) o;
        return Objects.equals(this.taskRunInfoId, relatedTempRunningData.taskRunInfoId)
            && Objects.equals(this.relatedTempRunningId, relatedTempRunningData.relatedTempRunningId)
            && Objects.equals(this.tempId, relatedTempRunningData.tempId)
            && Objects.equals(this.tempName, relatedTempRunningData.tempName)
            && Objects.equals(this.relatedTempRunningData, relatedTempRunningData.relatedTempRunningData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskRunInfoId, relatedTempRunningId, tempId, tempName, relatedTempRunningData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedTempRunningData {\n");
        sb.append("    taskRunInfoId: ").append(toIndentedString(taskRunInfoId)).append("\n");
        sb.append("    relatedTempRunningId: ").append(toIndentedString(relatedTempRunningId)).append("\n");
        sb.append("    tempId: ").append(toIndentedString(tempId)).append("\n");
        sb.append("    tempName: ").append(toIndentedString(tempName)).append("\n");
        sb.append("    relatedTempRunningData: ").append(toIndentedString(relatedTempRunningData)).append("\n");
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
