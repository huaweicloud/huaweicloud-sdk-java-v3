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
    @JsonProperty(value = "content_method_url")

    private List<String> contentMethodUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_temp_running_data")

    private List<TempRunningData> relatedTempRunningData = null;

    public RelatedTempRunningData withTaskRunInfoId(Integer taskRunInfoId) {
        this.taskRunInfoId = taskRunInfoId;
        return this;
    }

    /**
     * 运行任务id，即报告id。启动任务（更新任务状态或批量启停任务）接口，会返回运行任务id。
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
     * 运行用例id。对应其他（如报告）接口的运行用例id（case_run_id）。
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
     * 用例id
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
     * 用例名称
     * @return tempName
     */
    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public RelatedTempRunningData withContentMethodUrl(List<String> contentMethodUrl) {
        this.contentMethodUrl = contentMethodUrl;
        return this;
    }

    public RelatedTempRunningData addContentMethodUrlItem(String contentMethodUrlItem) {
        if (this.contentMethodUrl == null) {
            this.contentMethodUrl = new ArrayList<>();
        }
        this.contentMethodUrl.add(contentMethodUrlItem);
        return this;
    }

    public RelatedTempRunningData withContentMethodUrl(Consumer<List<String>> contentMethodUrlSetter) {
        if (this.contentMethodUrl == null) {
            this.contentMethodUrl = new ArrayList<>();
        }
        contentMethodUrlSetter.accept(this.contentMethodUrl);
        return this;
    }

    /**
     * 请求信息，包括请求名称，方法，url信息
     * @return contentMethodUrl
     */
    public List<String> getContentMethodUrl() {
        return contentMethodUrl;
    }

    public void setContentMethodUrl(List<String> contentMethodUrl) {
        this.contentMethodUrl = contentMethodUrl;
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
     * 最近一次运行的报告简略信息
     * @return relatedTempRunningData
     */
    public List<TempRunningData> getRelatedTempRunningData() {
        return relatedTempRunningData;
    }

    public void setRelatedTempRunningData(List<TempRunningData> relatedTempRunningData) {
        this.relatedTempRunningData = relatedTempRunningData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelatedTempRunningData that = (RelatedTempRunningData) obj;
        return Objects.equals(this.taskRunInfoId, that.taskRunInfoId)
            && Objects.equals(this.relatedTempRunningId, that.relatedTempRunningId)
            && Objects.equals(this.tempId, that.tempId) && Objects.equals(this.tempName, that.tempName)
            && Objects.equals(this.contentMethodUrl, that.contentMethodUrl)
            && Objects.equals(this.relatedTempRunningData, that.relatedTempRunningData);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(taskRunInfoId, relatedTempRunningId, tempId, tempName, contentMethodUrl, relatedTempRunningData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedTempRunningData {\n");
        sb.append("    taskRunInfoId: ").append(toIndentedString(taskRunInfoId)).append("\n");
        sb.append("    relatedTempRunningId: ").append(toIndentedString(relatedTempRunningId)).append("\n");
        sb.append("    tempId: ").append(toIndentedString(tempId)).append("\n");
        sb.append("    tempName: ").append(toIndentedString(tempName)).append("\n");
        sb.append("    contentMethodUrl: ").append(toIndentedString(contentMethodUrl)).append("\n");
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
