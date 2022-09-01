package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StartDeployTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    @JacksonXmlProperty(localName = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_component_list")

    @JacksonXmlProperty(localName = "app_component_list")

    private List<AppComponentDao> appComponentList = null;

    public StartDeployTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 执行记录id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StartDeployTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 部署任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public StartDeployTaskResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 执行任务名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public StartDeployTaskResponse withAppComponentList(List<AppComponentDao> appComponentList) {
        this.appComponentList = appComponentList;
        return this;
    }

    public StartDeployTaskResponse addAppComponentListItem(AppComponentDao appComponentListItem) {
        if (this.appComponentList == null) {
            this.appComponentList = new ArrayList<>();
        }
        this.appComponentList.add(appComponentListItem);
        return this;
    }

    public StartDeployTaskResponse withAppComponentList(Consumer<List<AppComponentDao>> appComponentListSetter) {
        if (this.appComponentList == null) {
            this.appComponentList = new ArrayList<>();
        }
        appComponentListSetter.accept(this.appComponentList);
        return this;
    }

    /**
     * 部署任务和应用组件对应关系
     * @return appComponentList
     */
    public List<AppComponentDao> getAppComponentList() {
        return appComponentList;
    }

    public void setAppComponentList(List<AppComponentDao> appComponentList) {
        this.appComponentList = appComponentList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartDeployTaskResponse startDeployTaskResponse = (StartDeployTaskResponse) o;
        return Objects.equals(this.id, startDeployTaskResponse.id)
            && Objects.equals(this.taskId, startDeployTaskResponse.taskId)
            && Objects.equals(this.jobName, startDeployTaskResponse.jobName)
            && Objects.equals(this.appComponentList, startDeployTaskResponse.appComponentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskId, jobName, appComponentList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartDeployTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    appComponentList: ").append(toIndentedString(appComponentList)).append("\n");
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
