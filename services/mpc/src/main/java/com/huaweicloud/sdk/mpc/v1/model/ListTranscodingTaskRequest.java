package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTranscodingTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")

    @JacksonXmlProperty(localName = "x-language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private List<Long> taskId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    @JacksonXmlProperty(localName = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    public ListTranscodingTaskRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 客户端语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListTranscodingTaskRequest withTaskId(List<Long> taskId) {
        this.taskId = taskId;
        return this;
    }

    public ListTranscodingTaskRequest addTaskIdItem(Long taskIdItem) {
        if (this.taskId == null) {
            this.taskId = new ArrayList<>();
        }
        this.taskId.add(taskIdItem);
        return this;
    }

    public ListTranscodingTaskRequest withTaskId(Consumer<List<Long>> taskIdSetter) {
        if (this.taskId == null) {
            this.taskId = new ArrayList<>();
        }
        taskIdSetter.accept(this.taskId);
        return this;
    }

    /**
     * 转码服务接受任务后产生的任务ID。一次最多10个 
     * @return taskId
     */
    public List<Long> getTaskId() {
        return taskId;
    }

    public void setTaskId(List<Long> taskId) {
        this.taskId = taskId;
    }

    public ListTranscodingTaskRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务执行状态。  取值如下： - WAITING：等待启动 - TRANSCODING：转码中 - SUCCEEDED：转码成功 - FAILED：转码失败 - CANCELED：已删除 - NEED_TO_BE_AUDIT：片源待审核 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListTranscodingTaskRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间  格式为yyyymmddhhmmss。必须是与时区无关的UTC时间，指定task_id时该参数无效 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListTranscodingTaskRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间  格式为yyyymmddhhmmss。必须是与时区无关的UTC时间，指定task_id时该参数无效 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListTranscodingTaskRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 分页编号。查询指定“task_id”时，该参数无效。  默认值：0。 
     * minimum: 0
     * maximum: 50000
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListTranscodingTaskRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 每页记录数。查询指定“task_id”时，该参数无效。  取值范围：[1,100]。  默认值：10。 
     * minimum: 1
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTranscodingTaskRequest listTranscodingTaskRequest = (ListTranscodingTaskRequest) o;
        return Objects.equals(this.xLanguage, listTranscodingTaskRequest.xLanguage)
            && Objects.equals(this.taskId, listTranscodingTaskRequest.taskId)
            && Objects.equals(this.status, listTranscodingTaskRequest.status)
            && Objects.equals(this.startTime, listTranscodingTaskRequest.startTime)
            && Objects.equals(this.endTime, listTranscodingTaskRequest.endTime)
            && Objects.equals(this.page, listTranscodingTaskRequest.page)
            && Objects.equals(this.size, listTranscodingTaskRequest.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, taskId, status, startTime, endTime, page, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTranscodingTaskRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
