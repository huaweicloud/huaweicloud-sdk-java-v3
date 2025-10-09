package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTaskDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_list")

    private List<SubTaskInfo> subTaskList = null;

    public ShowTaskDetailsResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例ID。  **取值范围**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowTaskDetailsResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**：  实例名称。  **取值范围**：  不涉及。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ShowTaskDetailsResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：  任务ID。  **取值范围**：  不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowTaskDetailsResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * **参数解释**：  任务名称。  **取值范围**：  不涉及。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ShowTaskDetailsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：  任务状态。  **取值范围**：    - Pending：表示待执行。   - Running：表示运行中。   - Completed：表示已完成。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowTaskDetailsResponse withSubTaskList(List<SubTaskInfo> subTaskList) {
        this.subTaskList = subTaskList;
        return this;
    }

    public ShowTaskDetailsResponse addSubTaskListItem(SubTaskInfo subTaskListItem) {
        if (this.subTaskList == null) {
            this.subTaskList = new ArrayList<>();
        }
        this.subTaskList.add(subTaskListItem);
        return this;
    }

    public ShowTaskDetailsResponse withSubTaskList(Consumer<List<SubTaskInfo>> subTaskListSetter) {
        if (this.subTaskList == null) {
            this.subTaskList = new ArrayList<>();
        }
        subTaskListSetter.accept(this.subTaskList);
        return this;
    }

    /**
     * **参数解释**：  任务详情列表。  **取值范围**：  不涉及。
     * @return subTaskList
     */
    public List<SubTaskInfo> getSubTaskList() {
        return subTaskList;
    }

    public void setSubTaskList(List<SubTaskInfo> subTaskList) {
        this.subTaskList = subTaskList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskDetailsResponse that = (ShowTaskDetailsResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.subTaskList, that.subTaskList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, jobId, jobName, status, subTaskList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskDetailsResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subTaskList: ").append(toIndentedString(subTaskList)).append("\n");
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
