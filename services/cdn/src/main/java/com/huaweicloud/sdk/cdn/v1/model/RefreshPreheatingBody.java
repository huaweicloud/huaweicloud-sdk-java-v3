package com.huaweicloud.sdk.cdn.v1.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RefreshPreheatingBody
 */
public class RefreshPreheatingBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;
    /**
     * 任务的类型， 其值可以为refresh或preheating。
     */
    public static final class TaskTypeEnum {

        
        /**
         * Enum REFRESH for value: "refresh"
         */
        public static final TaskTypeEnum REFRESH = new TaskTypeEnum("refresh");
        
        /**
         * Enum PREHEATING for value: "preheating"
         */
        public static final TaskTypeEnum PREHEATING = new TaskTypeEnum("preheating");
        

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("refresh", REFRESH);
            map.put("preheating", PREHEATING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TaskTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskTypeEnum(value);
            }
            return result;
        }

        public static TaskTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TaskTypeEnum) {
                return this.value.equals(((TaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_type")
    
    private TaskTypeEnum taskType;
    /**
     * 刷新结果。task_done表示刷新成功  ，task_inprocess表示刷新中。
     */
    public static final class StatusEnum {

        
        /**
         * Enum TASK_DONE for value: "task_done"
         */
        public static final StatusEnum TASK_DONE = new StatusEnum("task_done");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("task_done", TASK_DONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="processing")
    
    private Integer processing;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="succeed")
    
    private Integer succeed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failed")
    
    private Integer failed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="urls")
    
    private List<String> urls = null;
    
    public RefreshPreheatingBody withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 任务id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public RefreshPreheatingBody withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    


    /**
     * 任务的类型， 其值可以为refresh或preheating。
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    

    public RefreshPreheatingBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 刷新结果。task_done表示刷新成功  ，task_inprocess表示刷新中。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public RefreshPreheatingBody withProcessing(Integer processing) {
        this.processing = processing;
        return this;
    }

    


    /**
     * 处理中的url个数。
     * @return processing
     */
    public Integer getProcessing() {
        return processing;
    }

    public void setProcessing(Integer processing) {
        this.processing = processing;
    }

    

    public RefreshPreheatingBody withSucceed(Integer succeed) {
        this.succeed = succeed;
        return this;
    }

    


    /**
     * 成功处理的url个数。
     * @return succeed
     */
    public Integer getSucceed() {
        return succeed;
    }

    public void setSucceed(Integer succeed) {
        this.succeed = succeed;
    }

    

    public RefreshPreheatingBody withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    


    /**
     * 处理失败的url个数。
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    

    public RefreshPreheatingBody withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总共的任务个数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public RefreshPreheatingBody withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 任务创建时间，相对于UTC 1970-01-01到当前时间相隔的毫秒数。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    

    public RefreshPreheatingBody withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    
    public RefreshPreheatingBody addUrlsItem(String urlsItem) {
        if(this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public RefreshPreheatingBody withUrls(Consumer<List<String>> urlsSetter) {
        if(this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 刷新缓存的url列表。
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RefreshPreheatingBody refreshPreheatingBody = (RefreshPreheatingBody) o;
        return Objects.equals(this.id, refreshPreheatingBody.id) &&
            Objects.equals(this.taskType, refreshPreheatingBody.taskType) &&
            Objects.equals(this.status, refreshPreheatingBody.status) &&
            Objects.equals(this.processing, refreshPreheatingBody.processing) &&
            Objects.equals(this.succeed, refreshPreheatingBody.succeed) &&
            Objects.equals(this.failed, refreshPreheatingBody.failed) &&
            Objects.equals(this.total, refreshPreheatingBody.total) &&
            Objects.equals(this.createTime, refreshPreheatingBody.createTime) &&
            Objects.equals(this.urls, refreshPreheatingBody.urls);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, taskType, status, processing, succeed, failed, total, createTime, urls);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefreshPreheatingBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
        sb.append("    succeed: ").append(toIndentedString(succeed)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

