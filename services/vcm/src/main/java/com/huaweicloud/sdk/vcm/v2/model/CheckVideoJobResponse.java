package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CheckVideoJobResponse extends SdkResponse {

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
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private Object input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config")

    private Object serviceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private Object output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosting_result")

    private VideoJobResponseHostingResult hostingResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version")

    private String serviceVersion;

    public CheckVideoJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CheckVideoJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckVideoJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业描述信息，默认值为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheckVideoJobResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 作业状态： - PENDING：等待中 - RECOVERING ：恢复中 - STARTING：启动中 - UPGRADING ：更新中 - CREATE_FAILED：创建失败 - START_FAILED：启动失败 - RUNNING：运行中 - STOPPING：停止中 - STOPPED：已停止 - ABNORMAL：运行异常 - SUCCEEDED：运行成功 - FAILED：运行失败 - DELETING：删除中 - FREEZING ：冻结中 - FROZEN ：已冻结
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CheckVideoJobResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 作业创建时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CheckVideoJobResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 作业更新时间，格式为ISO8601：YYYY-MM-DDThh:mm:ssZ。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CheckVideoJobResponse withInput(Object input) {
        this.input = input;
        return this;
    }

    /**
     * 数据输入列表，默认值为[]。
     * @return input
     */
    public Object getInput() {
        return input;
    }

    public void setInput(Object input) {
        this.input = input;
    }

    public CheckVideoJobResponse withServiceConfig(Object serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    /**
     * 服务算法配置，字段结构跟服务相关。
     * @return serviceConfig
     */
    public Object getServiceConfig() {
        return serviceConfig;
    }

    public void setServiceConfig(Object serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    public CheckVideoJobResponse withOutput(Object output) {
        this.output = output;
        return this;
    }

    /**
     * 数据输出列表，默认值为[]
     * @return output
     */
    public Object getOutput() {
        return output;
    }

    public void setOutput(Object output) {
        this.output = output;
    }

    public CheckVideoJobResponse withHostingResult(VideoJobResponseHostingResult hostingResult) {
        this.hostingResult = hostingResult;
        return this;
    }

    public CheckVideoJobResponse withHostingResult(Consumer<VideoJobResponseHostingResult> hostingResultSetter) {
        if (this.hostingResult == null) {
            this.hostingResult = new VideoJobResponseHostingResult();
            hostingResultSetter.accept(this.hostingResult);
        }

        return this;
    }

    /**
     * Get hostingResult
     * @return hostingResult
     */
    public VideoJobResponseHostingResult getHostingResult() {
        return hostingResult;
    }

    public void setHostingResult(VideoJobResponseHostingResult hostingResult) {
        this.hostingResult = hostingResult;
    }

    public CheckVideoJobResponse withServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /**
     * 作业对应的服务版本。
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckVideoJobResponse that = (CheckVideoJobResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.state, that.state)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.input, that.input) && Objects.equals(this.serviceConfig, that.serviceConfig)
            && Objects.equals(this.output, that.output) && Objects.equals(this.hostingResult, that.hostingResult)
            && Objects.equals(this.serviceVersion, that.serviceVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            state,
            createdAt,
            updatedAt,
            input,
            serviceConfig,
            output,
            hostingResult,
            serviceVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckVideoJobResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    serviceConfig: ").append(toIndentedString(serviceConfig)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    hostingResult: ").append(toIndentedString(hostingResult)).append("\n");
        sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
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
