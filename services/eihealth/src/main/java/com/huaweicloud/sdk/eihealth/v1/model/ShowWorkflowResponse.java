package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWorkflowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private String summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_dir")

    private String outputDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<TaskDefinitionDto> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_snapshot_sign")

    private Map<String, String> appSnapshotSign = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_name")

    private String sourceProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_resource_id")

    private String sourceResourceId;

    public ShowWorkflowResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 流程id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowWorkflowResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流程名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowWorkflowResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**： 创建用户名称。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowWorkflowResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 流程版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowWorkflowResponse withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 流程简述
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ShowWorkflowResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 流程描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowWorkflowResponse withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ShowWorkflowResponse addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowWorkflowResponse withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 流程标签
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ShowWorkflowResponse withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 超时时间
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ShowWorkflowResponse withOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * 流程的输出路径
     * @return outputDir
     */
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public ShowWorkflowResponse withTasks(List<TaskDefinitionDto> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ShowWorkflowResponse addTasksItem(TaskDefinitionDto tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowWorkflowResponse withTasks(Consumer<List<TaskDefinitionDto>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 流程的子任务
     * @return tasks
     */
    public List<TaskDefinitionDto> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDefinitionDto> tasks) {
        this.tasks = tasks;
    }

    public ShowWorkflowResponse withAppSnapshotSign(Map<String, String> appSnapshotSign) {
        this.appSnapshotSign = appSnapshotSign;
        return this;
    }

    public ShowWorkflowResponse putAppSnapshotSignItem(String key, String appSnapshotSignItem) {
        if (this.appSnapshotSign == null) {
            this.appSnapshotSign = new HashMap<>();
        }
        this.appSnapshotSign.put(key, appSnapshotSignItem);
        return this;
    }

    public ShowWorkflowResponse withAppSnapshotSign(Consumer<Map<String, String>> appSnapshotSignSetter) {
        if (this.appSnapshotSign == null) {
            this.appSnapshotSign = new HashMap<>();
        }
        appSnapshotSignSetter.accept(this.appSnapshotSign);
        return this;
    }

    /**
     * 流程创建时刻的应用快照，当query填workflow_snapshot_sign有值;K为appId,V为sign
     * @return appSnapshotSign
     */
    public Map<String, String> getAppSnapshotSign() {
        return appSnapshotSign;
    }

    public void setAppSnapshotSign(Map<String, String> appSnapshotSign) {
        this.appSnapshotSign = appSnapshotSign;
    }

    public ShowWorkflowResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 流程的创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowWorkflowResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 流程的更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowWorkflowResponse withSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
        return this;
    }

    /**
     * 源项目名称
     * @return sourceProjectName
     */
    public String getSourceProjectName() {
        return sourceProjectName;
    }

    public void setSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
    }

    public ShowWorkflowResponse withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * 源资源id
     * @return sourceResourceId
     */
    public String getSourceResourceId() {
        return sourceResourceId;
    }

    public void setSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkflowResponse that = (ShowWorkflowResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.summary, that.summary) && Objects.equals(this.description, that.description)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.outputDir, that.outputDir) && Objects.equals(this.tasks, that.tasks)
            && Objects.equals(this.appSnapshotSign, that.appSnapshotSign)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.sourceProjectName, that.sourceProjectName)
            && Objects.equals(this.sourceResourceId, that.sourceResourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            userName,
            version,
            summary,
            description,
            labels,
            timeout,
            outputDir,
            tasks,
            appSnapshotSign,
            createTime,
            updateTime,
            sourceProjectName,
            sourceResourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkflowResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    outputDir: ").append(toIndentedString(outputDir)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    appSnapshotSign: ").append(toIndentedString(appSnapshotSign)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    sourceProjectName: ").append(toIndentedString(sourceProjectName)).append("\n");
        sb.append("    sourceResourceId: ").append(toIndentedString(sourceResourceId)).append("\n");
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
