package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ChangePlaybookInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook")

    private PlaybookInfoRef playbook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass")

    private DataclassInfoRef dataclass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataobject")

    private DataclassInfoRef dataobject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ChangePlaybookInstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Id value
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChangePlaybookInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name, display only
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChangePlaybookInstanceResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Project id value
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ChangePlaybookInstanceResponse withPlaybook(PlaybookInfoRef playbook) {
        this.playbook = playbook;
        return this;
    }

    public ChangePlaybookInstanceResponse withPlaybook(Consumer<PlaybookInfoRef> playbookSetter) {
        if (this.playbook == null) {
            this.playbook = new PlaybookInfoRef();
            playbookSetter.accept(this.playbook);
        }

        return this;
    }

    /**
     * Get playbook
     * @return playbook
     */
    public PlaybookInfoRef getPlaybook() {
        return playbook;
    }

    public void setPlaybook(PlaybookInfoRef playbook) {
        this.playbook = playbook;
    }

    public ChangePlaybookInstanceResponse withDataclass(DataclassInfoRef dataclass) {
        this.dataclass = dataclass;
        return this;
    }

    public ChangePlaybookInstanceResponse withDataclass(Consumer<DataclassInfoRef> dataclassSetter) {
        if (this.dataclass == null) {
            this.dataclass = new DataclassInfoRef();
            dataclassSetter.accept(this.dataclass);
        }

        return this;
    }

    /**
     * Get dataclass
     * @return dataclass
     */
    public DataclassInfoRef getDataclass() {
        return dataclass;
    }

    public void setDataclass(DataclassInfoRef dataclass) {
        this.dataclass = dataclass;
    }

    public ChangePlaybookInstanceResponse withDataobject(DataclassInfoRef dataobject) {
        this.dataobject = dataobject;
        return this;
    }

    public ChangePlaybookInstanceResponse withDataobject(Consumer<DataclassInfoRef> dataobjectSetter) {
        if (this.dataobject == null) {
            this.dataobject = new DataclassInfoRef();
            dataobjectSetter.accept(this.dataobject);
        }

        return this;
    }

    /**
     * Get dataobject
     * @return dataobject
     */
    public DataclassInfoRef getDataobject() {
        return dataobject;
    }

    public void setDataobject(DataclassInfoRef dataobject) {
        this.dataobject = dataobject;
    }

    public ChangePlaybookInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Playbook instance status. RUNNING、FINISHED、FAILED、RETRYING、 TERMINATING、TERMINATED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ChangePlaybookInstanceResponse withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * trigger type. DEBUG, TIMER, EVENT, MANUAL
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public ChangePlaybookInstanceResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Create time
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ChangePlaybookInstanceResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Update time
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ChangePlaybookInstanceResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangePlaybookInstanceResponse that = (ChangePlaybookInstanceResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.playbook, that.playbook)
            && Objects.equals(this.dataclass, that.dataclass) && Objects.equals(this.dataobject, that.dataobject)
            && Objects.equals(this.status, that.status) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            projectId,
            playbook,
            dataclass,
            dataobject,
            status,
            triggerType,
            startTime,
            endTime,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangePlaybookInstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    playbook: ").append(toIndentedString(playbook)).append("\n");
        sb.append("    dataclass: ").append(toIndentedString(dataclass)).append("\n");
        sb.append("    dataobject: ").append(toIndentedString(dataobject)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
