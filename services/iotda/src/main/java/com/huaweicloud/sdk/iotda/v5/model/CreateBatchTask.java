package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.TaskPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 添加任务结构体
 */
public class CreateBatchTask  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_name")
    
    private String taskName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_type")
    
    private String taskType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="targets")
    
    private List<String> targets = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="targets_filter")
    
    private Map<String, Object> targetsFilter = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="document")
    
    private Object document = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_policy")
    
    private TaskPolicy taskPolicy = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="document_source")
    
    private String documentSource;

    public CreateBatchTask withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定创建的批量任务归属到哪个资源空间下，否则创建的批量任务将会归属到[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateBatchTask withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    


    /**
     * 批量任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateBatchTask withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    


    /**
     * 批量任务类型，取值范围：firmwareUpgrade，softwareUpgrade。 - softwareUpgrade: 软件升级任务 - firmwareUpgrade: 固件升级任务 
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public CreateBatchTask withTargets(List<String> targets) {
        this.targets = targets;
        return this;
    }

    
    public CreateBatchTask addTargetsItem(String targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public CreateBatchTask withTargets(Consumer<List<String>> targetsSetter) {
        if(this.targets == null ){
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 执行批量任务的目标，当task_type为firmwareUpgrade，softwareUpgrade时，此处填写device_id列表。
     * @return targets
     */
    public List<String> getTargets() {
        return targets;
    }

    public void setTargets(List<String> targets) {
        this.targets = targets;
    }

    public CreateBatchTask withTargetsFilter(Map<String, Object> targetsFilter) {
        this.targetsFilter = targetsFilter;
        return this;
    }

    

    public CreateBatchTask putTargetsFilterItem(String key, Object targetsFilterItem) {
         if (this.targetsFilter == null) {
            this.targetsFilter = new HashMap<>();
         }
        this.targetsFilter.put(key, targetsFilterItem);
        return this;
    }

    public CreateBatchTask withTargetsFilter(Consumer<Map<String, Object>> targetsFilterSetter) {
        if(this.targetsFilter == null ){
            this.targetsFilter = new HashMap<>();
        }
        targetsFilterSetter.accept(this.targetsFilter);
        return this;
    }
    /**
     * 任务目标筛选参数。Json格式，里面是一个个键值对，（K,V）格式标识筛选targets需要的参数，目前支持的K有group_ids（V填写group_id数组，eg:[\"e495cf17-ff79-4294-8f64-4d367919d665\"]，任务则会筛选出来符合该群组条件的设备作为目标）
     * @return targetsFilter
     */
    public Map<String, Object> getTargetsFilter() {
        return targetsFilter;
    }

    public void setTargetsFilter(Map<String, Object> targetsFilter) {
        this.targetsFilter = targetsFilter;
    }

    public CreateBatchTask withDocument(Object document) {
        this.document = document;
        return this;
    }

    


    /**
     * 执行任务数据文档，Json格式，里面是(K,V)键值对。(当task_type 为softwareUpgrade|firmwareUpgrade，也就是软固件升级任务时需要填写key为package_id，value为在平台上传的软固件附件id，id由portal软件库包管理上传并查询获得)。
     * @return document
     */
    public Object getDocument() {
        return document;
    }

    public void setDocument(Object document) {
        this.document = document;
    }

    public CreateBatchTask withTaskPolicy(TaskPolicy taskPolicy) {
        this.taskPolicy = taskPolicy;
        return this;
    }

    public CreateBatchTask withTaskPolicy(Consumer<TaskPolicy> taskPolicySetter) {
        if(this.taskPolicy == null ){
            this.taskPolicy = new TaskPolicy();
            taskPolicySetter.accept(this.taskPolicy);
        }
        
        return this;
    }


    /**
     * Get taskPolicy
     * @return taskPolicy
     */
    public TaskPolicy getTaskPolicy() {
        return taskPolicy;
    }

    public void setTaskPolicy(TaskPolicy taskPolicy) {
        this.taskPolicy = taskPolicy;
    }

    public CreateBatchTask withDocumentSource(String documentSource) {
        this.documentSource = documentSource;
        return this;
    }

    


    /**
     * 上传的批量任务文件ID。
     * @return documentSource
     */
    public String getDocumentSource() {
        return documentSource;
    }

    public void setDocumentSource(String documentSource) {
        this.documentSource = documentSource;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateBatchTask createBatchTask = (CreateBatchTask) o;
        return Objects.equals(this.appId, createBatchTask.appId) &&
            Objects.equals(this.taskName, createBatchTask.taskName) &&
            Objects.equals(this.taskType, createBatchTask.taskType) &&
            Objects.equals(this.targets, createBatchTask.targets) &&
            Objects.equals(this.targetsFilter, createBatchTask.targetsFilter) &&
            Objects.equals(this.document, createBatchTask.document) &&
            Objects.equals(this.taskPolicy, createBatchTask.taskPolicy) &&
            Objects.equals(this.documentSource, createBatchTask.documentSource);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, taskName, taskType, targets, targetsFilter, document, taskPolicy, documentSource);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBatchTask {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("    targetsFilter: ").append(toIndentedString(targetsFilter)).append("\n");
        sb.append("    document: ").append(toIndentedString(document)).append("\n");
        sb.append("    taskPolicy: ").append(toIndentedString(taskPolicy)).append("\n");
        sb.append("    documentSource: ").append(toIndentedString(documentSource)).append("\n");
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

