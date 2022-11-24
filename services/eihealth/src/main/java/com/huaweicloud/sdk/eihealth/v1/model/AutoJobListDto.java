package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AutoJobListDto
 */
public class AutoJobListDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_info")

    private ToolInfoDto toolInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_id")

    private String databaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    public AutoJobListDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自动作业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AutoJobListDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自动作业的名称，取值范围：[1,63]，允许大小写字母、数字、以及特殊字符中划线(-)
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AutoJobListDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 自动作业的描述, 取值范围：输入字符最大长度为255
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AutoJobListDto withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public AutoJobListDto addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public AutoJobListDto withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 自动作业标签
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public AutoJobListDto withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 自动作业优先级，[0,9]，0表示最低，默认0
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public AutoJobListDto withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 作业执行超时时长，取值范围: [1, 144000]，单位：分钟，默认数值1440
     * minimum: 1
     * maximum: 144000
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public AutoJobListDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 自动作业状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AutoJobListDto withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 自动作业创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public AutoJobListDto withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 自动作业结束时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public AutoJobListDto withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因，当自动作业执行失败时会返回，比如依赖的数据表，流程不存在等等
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public AutoJobListDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 自动作业的创建者
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AutoJobListDto withToolInfo(ToolInfoDto toolInfo) {
        this.toolInfo = toolInfo;
        return this;
    }

    public AutoJobListDto withToolInfo(Consumer<ToolInfoDto> toolInfoSetter) {
        if (this.toolInfo == null) {
            this.toolInfo = new ToolInfoDto();
            toolInfoSetter.accept(this.toolInfo);
        }

        return this;
    }

    /**
     * Get toolInfo
     * @return toolInfo
     */
    public ToolInfoDto getToolInfo() {
        return toolInfo;
    }

    public void setToolInfo(ToolInfoDto toolInfo) {
        this.toolInfo = toolInfo;
    }

    public AutoJobListDto withDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }

    /**
     * 自动作业依赖的数据表ID
     * @return databaseId
     */
    public String getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    public AutoJobListDto withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 自动作业依赖的数据表名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoJobListDto autoJobListDto = (AutoJobListDto) o;
        return Objects.equals(this.id, autoJobListDto.id) && Objects.equals(this.name, autoJobListDto.name)
            && Objects.equals(this.description, autoJobListDto.description)
            && Objects.equals(this.labels, autoJobListDto.labels)
            && Objects.equals(this.priority, autoJobListDto.priority)
            && Objects.equals(this.timeout, autoJobListDto.timeout)
            && Objects.equals(this.status, autoJobListDto.status)
            && Objects.equals(this.createTime, autoJobListDto.createTime)
            && Objects.equals(this.finishTime, autoJobListDto.finishTime)
            && Objects.equals(this.failedReason, autoJobListDto.failedReason)
            && Objects.equals(this.userName, autoJobListDto.userName)
            && Objects.equals(this.toolInfo, autoJobListDto.toolInfo)
            && Objects.equals(this.databaseId, autoJobListDto.databaseId)
            && Objects.equals(this.databaseName, autoJobListDto.databaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            labels,
            priority,
            timeout,
            status,
            createTime,
            finishTime,
            failedReason,
            userName,
            toolInfo,
            databaseId,
            databaseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoJobListDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    toolInfo: ").append(toIndentedString(toolInfo)).append("\n");
        sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
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
