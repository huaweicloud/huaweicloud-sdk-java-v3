package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ShowDataJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_data")

    private List<String> completeData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_data")

    private List<String> runningData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_name")

    private String sourceProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<String> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destinations")

    private List<String> destinations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additions")

    private String additions;

    public ShowDataJobResponse withCompleteData(List<String> completeData) {
        this.completeData = completeData;
        return this;
    }

    public ShowDataJobResponse addCompleteDataItem(String completeDataItem) {
        if (this.completeData == null) {
            this.completeData = new ArrayList<>();
        }
        this.completeData.add(completeDataItem);
        return this;
    }

    public ShowDataJobResponse withCompleteData(Consumer<List<String>> completeDataSetter) {
        if (this.completeData == null) {
            this.completeData = new ArrayList<>();
        }
        completeDataSetter.accept(this.completeData);
        return this;
    }

    /**
     * 已完成的数据列表
     * @return completeData
     */
    public List<String> getCompleteData() {
        return completeData;
    }

    public void setCompleteData(List<String> completeData) {
        this.completeData = completeData;
    }

    public ShowDataJobResponse withRunningData(List<String> runningData) {
        this.runningData = runningData;
        return this;
    }

    public ShowDataJobResponse addRunningDataItem(String runningDataItem) {
        if (this.runningData == null) {
            this.runningData = new ArrayList<>();
        }
        this.runningData.add(runningDataItem);
        return this;
    }

    public ShowDataJobResponse withRunningData(Consumer<List<String>> runningDataSetter) {
        if (this.runningData == null) {
            this.runningData = new ArrayList<>();
        }
        runningDataSetter.accept(this.runningData);
        return this;
    }

    /**
     * 正在执行的数据列表
     * @return runningData
     */
    public List<String> getRunningData() {
        return runningData;
    }

    public void setRunningData(List<String> runningData) {
        this.runningData = runningData;
    }

    public ShowDataJobResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 数据作业创建者
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowDataJobResponse withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 非本项目操作场景下源项目名称
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public ShowDataJobResponse withSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
        return this;
    }

    /**
     * 非本项目操作场景下源项目名称
     * @return sourceProjectName
     */
    public String getSourceProjectName() {
        return sourceProjectName;
    }

    public void setSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
    }

    public ShowDataJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据作业ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDataJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDataJobResponse withSources(List<String> sources) {
        this.sources = sources;
        return this;
    }

    public ShowDataJobResponse addSourcesItem(String sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public ShowDataJobResponse withSources(Consumer<List<String>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 数据列表
     * @return sources
     */
    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public ShowDataJobResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 数据作业创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowDataJobResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 数据作业结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowDataJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 数据作业状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDataJobResponse withDestinations(List<String> destinations) {
        this.destinations = destinations;
        return this;
    }

    public ShowDataJobResponse addDestinationsItem(String destinationsItem) {
        if (this.destinations == null) {
            this.destinations = new ArrayList<>();
        }
        this.destinations.add(destinationsItem);
        return this;
    }

    public ShowDataJobResponse withDestinations(Consumer<List<String>> destinationsSetter) {
        if (this.destinations == null) {
            this.destinations = new ArrayList<>();
        }
        destinationsSetter.accept(this.destinations);
        return this;
    }

    /**
     * 数据列表
     * @return destinations
     */
    public List<String> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<String> destinations) {
        this.destinations = destinations;
    }

    public ShowDataJobResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据作业类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowDataJobResponse withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 数据作业失败原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public ShowDataJobResponse withAdditions(String additions) {
        this.additions = additions;
        return this;
    }

    /**
     * 附加信息
     * @return additions
     */
    public String getAdditions() {
        return additions;
    }

    public void setAdditions(String additions) {
        this.additions = additions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDataJobResponse showDataJobResponse = (ShowDataJobResponse) o;
        return Objects.equals(this.completeData, showDataJobResponse.completeData)
            && Objects.equals(this.runningData, showDataJobResponse.runningData)
            && Objects.equals(this.creator, showDataJobResponse.creator)
            && Objects.equals(this.sourceProjectId, showDataJobResponse.sourceProjectId)
            && Objects.equals(this.sourceProjectName, showDataJobResponse.sourceProjectName)
            && Objects.equals(this.id, showDataJobResponse.id) && Objects.equals(this.name, showDataJobResponse.name)
            && Objects.equals(this.sources, showDataJobResponse.sources)
            && Objects.equals(this.createTime, showDataJobResponse.createTime)
            && Objects.equals(this.endTime, showDataJobResponse.endTime)
            && Objects.equals(this.status, showDataJobResponse.status)
            && Objects.equals(this.destinations, showDataJobResponse.destinations)
            && Objects.equals(this.type, showDataJobResponse.type)
            && Objects.equals(this.failedReason, showDataJobResponse.failedReason)
            && Objects.equals(this.additions, showDataJobResponse.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(completeData,
            runningData,
            creator,
            sourceProjectId,
            sourceProjectName,
            id,
            name,
            sources,
            createTime,
            endTime,
            status,
            destinations,
            type,
            failedReason,
            additions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataJobResponse {\n");
        sb.append("    completeData: ").append(toIndentedString(completeData)).append("\n");
        sb.append("    runningData: ").append(toIndentedString(runningData)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    sourceProjectName: ").append(toIndentedString(sourceProjectName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
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
