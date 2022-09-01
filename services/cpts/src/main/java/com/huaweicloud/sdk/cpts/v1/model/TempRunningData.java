package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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

    @JacksonXmlProperty(localName = "content_method_url")

    private List<String> contentMethodUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crawler_status")

    @JacksonXmlProperty(localName = "crawler_status")

    private Integer crawlerStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_temp_running_id")

    @JacksonXmlProperty(localName = "related_temp_running_id")

    private Integer relatedTempRunningId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_run_info_id")

    @JacksonXmlProperty(localName = "task_run_info_id")

    private Integer taskRunInfoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_id")

    @JacksonXmlProperty(localName = "temp_id")

    private Integer tempId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_name")

    @JacksonXmlProperty(localName = "temp_name")

    private String tempName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_running_status")

    @JacksonXmlProperty(localName = "temp_running_status")

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
     * content_method_url
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
     * crawler_status
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
     * related_temp_running_id
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
     * task_run_info_id
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
     * temp_id
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
     * temp_name
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
     * temp_running_status
     * @return tempRunningStatus
     */
    public Integer getTempRunningStatus() {
        return tempRunningStatus;
    }

    public void setTempRunningStatus(Integer tempRunningStatus) {
        this.tempRunningStatus = tempRunningStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TempRunningData tempRunningData = (TempRunningData) o;
        return Objects.equals(this.contentMethodUrl, tempRunningData.contentMethodUrl)
            && Objects.equals(this.crawlerStatus, tempRunningData.crawlerStatus)
            && Objects.equals(this.relatedTempRunningId, tempRunningData.relatedTempRunningId)
            && Objects.equals(this.taskRunInfoId, tempRunningData.taskRunInfoId)
            && Objects.equals(this.tempId, tempRunningData.tempId)
            && Objects.equals(this.tempName, tempRunningData.tempName)
            && Objects.equals(this.tempRunningStatus, tempRunningData.tempRunningStatus);
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
