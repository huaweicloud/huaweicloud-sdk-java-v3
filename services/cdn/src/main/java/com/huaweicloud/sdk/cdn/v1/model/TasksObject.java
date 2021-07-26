package com.huaweicloud.sdk.cdn.v1.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TasksObject
 */
public class TasksObject  {



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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


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
    /**
     * 默认是文件file。file：文件,directory：目录。
     */
    public static final class FileTypeEnum {

        
        /**
         * Enum FILE for value: "file"
         */
        public static final FileTypeEnum FILE = new FileTypeEnum("file");
        
        /**
         * Enum DIRECTORY for value: "directory"
         */
        public static final FileTypeEnum DIRECTORY = new FileTypeEnum("directory");
        

        private static final Map<String, FileTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FileTypeEnum> createStaticFields() {
            Map<String, FileTypeEnum> map = new HashMap<>();
            map.put("file", FILE);
            map.put("directory", DIRECTORY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FileTypeEnum(String value) {
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
        public static FileTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FileTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FileTypeEnum(value);
            }
            return result;
        }

        public static FileTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            FileTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof FileTypeEnum) {
                return this.value.equals(((FileTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_type")
    
    private FileTypeEnum fileType;

    public TasksObject withId(String id) {
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

    

    public TasksObject withTaskType(TaskTypeEnum taskType) {
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

    

    public TasksObject withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 刷新结果。task_done表示刷新成功  ，task_inprocess表示刷新中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public TasksObject withProcessing(Integer processing) {
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

    

    public TasksObject withSucceed(Integer succeed) {
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

    

    public TasksObject withFailed(Integer failed) {
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

    

    public TasksObject withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * url总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public TasksObject withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 任务的创建时间，相对于UTC 1970-01-01到当前时间相隔的毫秒数。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    

    public TasksObject withFileType(FileTypeEnum fileType) {
        this.fileType = fileType;
        return this;
    }

    


    /**
     * 默认是文件file。file：文件,directory：目录。
     * @return fileType
     */
    public FileTypeEnum getFileType() {
        return fileType;
    }

    public void setFileType(FileTypeEnum fileType) {
        this.fileType = fileType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TasksObject tasksObject = (TasksObject) o;
        return Objects.equals(this.id, tasksObject.id) &&
            Objects.equals(this.taskType, tasksObject.taskType) &&
            Objects.equals(this.status, tasksObject.status) &&
            Objects.equals(this.processing, tasksObject.processing) &&
            Objects.equals(this.succeed, tasksObject.succeed) &&
            Objects.equals(this.failed, tasksObject.failed) &&
            Objects.equals(this.total, tasksObject.total) &&
            Objects.equals(this.createTime, tasksObject.createTime) &&
            Objects.equals(this.fileType, tasksObject.fileType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, taskType, status, processing, succeed, failed, total, createTime, fileType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TasksObject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
        sb.append("    succeed: ").append(toIndentedString(succeed)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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

