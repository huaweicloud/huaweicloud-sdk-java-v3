package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UrlObject
 */
public class UrlObject  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="process_reason")
    
    private String processReason;

    public UrlObject withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public UrlObject withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * url的地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public UrlObject withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * url的状态 processing， succeed， failed，分别表示处理中，完成，失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public UrlObject withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * url创建时间，相对于UTC 1970-01-01到当前时间相隔的毫秒数。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    

    public UrlObject withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * url所属task的id。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    

    public UrlObject withProcessReason(String processReason) {
        this.processReason = processReason;
        return this;
    }

    


    /**
     * 标记处理原因。
     * @return processReason
     */
    public String getProcessReason() {
        return processReason;
    }

    public void setProcessReason(String processReason) {
        this.processReason = processReason;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UrlObject urlObject = (UrlObject) o;
        return Objects.equals(this.id, urlObject.id) &&
            Objects.equals(this.url, urlObject.url) &&
            Objects.equals(this.status, urlObject.status) &&
            Objects.equals(this.createTime, urlObject.createTime) &&
            Objects.equals(this.taskId, urlObject.taskId) &&
            Objects.equals(this.processReason, urlObject.processReason);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, url, status, createTime, taskId, processReason);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlObject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    processReason: ").append(toIndentedString(processReason)).append("\n");
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

