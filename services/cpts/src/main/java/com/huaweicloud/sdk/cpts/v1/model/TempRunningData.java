package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TempRunningData
 */
public class TempRunningData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_method_url")

    private List<String> contentMethodUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crawler_status")

    private Integer crawlerStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_temp_running_id")

    private Integer relatedTempRunningId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_run_info_id")

    private Integer taskRunInfoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_id")

    private Integer tempId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_name")

    private String tempName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_running_status")

    private Integer tempRunningStatus;

    public TempRunningData withContentMethodUrl(List<String> contentMethodUrl) {
        this.contentMethodUrl = contentMethodUrl;
        return this;
    }

    public TempRunningData addContentMethodUrlItem(String contentMethodUrlItem) {
        if (this.contentMethodUrl == null) {
            this.contentMethodUrl = new ArrayList<>();
        }
        this.contentMethodUrl.add(contentMethodUrlItem);
        return this;
    }

    public TempRunningData withContentMethodUrl(Consumer<List<String>> contentMethodUrlSetter) {
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

    public TempRunningData withCrawlerStatus(Integer crawlerStatus) {
        this.crawlerStatus = crawlerStatus;
        return this;
    }

    /**
     * 请求运行状态（0：正常返回；1：解析失败； 2：比对失败； 3：响应超时；）
     * @return crawlerStatus
     */
    public Integer getCrawlerStatus() {
        return crawlerStatus;
    }

    public void setCrawlerStatus(Integer crawlerStatus) {
        this.crawlerStatus = crawlerStatus;
    }

    public TempRunningData withRelatedTempRunningId(Integer relatedTempRunningId) {
        this.relatedTempRunningId = relatedTempRunningId;
        return this;
    }

    /**
     * 运行用例id。对应其他（如报告）接口的运行用例id（case_run_id）。
     * @return relatedTempRunningId
     */
    public Integer getRelatedTempRunningId() {
        return relatedTempRunningId;
    }

    public void setRelatedTempRunningId(Integer relatedTempRunningId) {
        this.relatedTempRunningId = relatedTempRunningId;
    }

    public TempRunningData withTaskRunInfoId(Integer taskRunInfoId) {
        this.taskRunInfoId = taskRunInfoId;
        return this;
    }

    /**
     * 运行任务id，即报告id。启动任务（更新任务状态或批量启停任务）接口，会返回运行任务id。
     * @return taskRunInfoId
     */
    public Integer getTaskRunInfoId() {
        return taskRunInfoId;
    }

    public void setTaskRunInfoId(Integer taskRunInfoId) {
        this.taskRunInfoId = taskRunInfoId;
    }

    public TempRunningData withTempId(Integer tempId) {
        this.tempId = tempId;
        return this;
    }

    /**
     * 用例或者事务id
     * @return tempId
     */
    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public TempRunningData withTempName(String tempName) {
        this.tempName = tempName;
        return this;
    }

    /**
     * 用例或者事务名称
     * @return tempName
     */
    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public TempRunningData withTempRunningStatus(Integer tempRunningStatus) {
        this.tempRunningStatus = tempRunningStatus;
        return this;
    }

    /**
     * 运行状态（9：表示等待运行；0：表示运行中；2：表示结束；3：异常中止；4：用户主动终止（完成状态）；5：用户主动终止（终止中状态））
     * @return tempRunningStatus
     */
    public Integer getTempRunningStatus() {
        return tempRunningStatus;
    }

    public void setTempRunningStatus(Integer tempRunningStatus) {
        this.tempRunningStatus = tempRunningStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TempRunningData that = (TempRunningData) obj;
        return Objects.equals(this.contentMethodUrl, that.contentMethodUrl)
            && Objects.equals(this.crawlerStatus, that.crawlerStatus)
            && Objects.equals(this.relatedTempRunningId, that.relatedTempRunningId)
            && Objects.equals(this.taskRunInfoId, that.taskRunInfoId) && Objects.equals(this.tempId, that.tempId)
            && Objects.equals(this.tempName, that.tempName)
            && Objects.equals(this.tempRunningStatus, that.tempRunningStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentMethodUrl,
            crawlerStatus,
            relatedTempRunningId,
            taskRunInfoId,
            tempId,
            tempName,
            tempRunningStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TempRunningData {\n");
        sb.append("    contentMethodUrl: ").append(toIndentedString(contentMethodUrl)).append("\n");
        sb.append("    crawlerStatus: ").append(toIndentedString(crawlerStatus)).append("\n");
        sb.append("    relatedTempRunningId: ").append(toIndentedString(relatedTempRunningId)).append("\n");
        sb.append("    taskRunInfoId: ").append(toIndentedString(taskRunInfoId)).append("\n");
        sb.append("    tempId: ").append(toIndentedString(tempId)).append("\n");
        sb.append("    tempName: ").append(toIndentedString(tempName)).append("\n");
        sb.append("    tempRunningStatus: ").append(toIndentedString(tempRunningStatus)).append("\n");
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
