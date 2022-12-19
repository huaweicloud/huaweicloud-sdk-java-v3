package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response of listing playbook instance informations
 */
public class PlaybookInstanceInfo {

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

    public PlaybookInstanceInfo withId(String id) {
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

    public PlaybookInstanceInfo withName(String name) {
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

    public PlaybookInstanceInfo withProjectId(String projectId) {
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

    public PlaybookInstanceInfo withPlaybook(PlaybookInfoRef playbook) {
        this.playbook = playbook;
        return this;
    }

    public PlaybookInstanceInfo withPlaybook(Consumer<PlaybookInfoRef> playbookSetter) {
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

    public PlaybookInstanceInfo withDataclass(DataclassInfoRef dataclass) {
        this.dataclass = dataclass;
        return this;
    }

    public PlaybookInstanceInfo withDataclass(Consumer<DataclassInfoRef> dataclassSetter) {
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

    public PlaybookInstanceInfo withDataobject(DataclassInfoRef dataobject) {
        this.dataobject = dataobject;
        return this;
    }

    public PlaybookInstanceInfo withDataobject(Consumer<DataclassInfoRef> dataobjectSetter) {
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

    public PlaybookInstanceInfo withStatus(String status) {
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

    public PlaybookInstanceInfo withTriggerType(String triggerType) {
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

    public PlaybookInstanceInfo withStartTime(String startTime) {
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

    public PlaybookInstanceInfo withEndTime(String endTime) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlaybookInstanceInfo playbookInstanceInfo = (PlaybookInstanceInfo) o;
        return Objects.equals(this.id, playbookInstanceInfo.id) && Objects.equals(this.name, playbookInstanceInfo.name)
            && Objects.equals(this.projectId, playbookInstanceInfo.projectId)
            && Objects.equals(this.playbook, playbookInstanceInfo.playbook)
            && Objects.equals(this.dataclass, playbookInstanceInfo.dataclass)
            && Objects.equals(this.dataobject, playbookInstanceInfo.dataobject)
            && Objects.equals(this.status, playbookInstanceInfo.status)
            && Objects.equals(this.triggerType, playbookInstanceInfo.triggerType)
            && Objects.equals(this.startTime, playbookInstanceInfo.startTime)
            && Objects.equals(this.endTime, playbookInstanceInfo.endTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, projectId, playbook, dataclass, dataobject, status, triggerType, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaybookInstanceInfo {\n");
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
