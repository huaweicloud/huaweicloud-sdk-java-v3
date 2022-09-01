package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VideoJobResponse
 */
public class VideoJobResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    @JacksonXmlProperty(localName = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    @JacksonXmlProperty(localName = "input")

    private Object input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config")

    @JacksonXmlProperty(localName = "service_config")

    private Object serviceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    @JacksonXmlProperty(localName = "output")

    private Object output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosting_result")

    @JacksonXmlProperty(localName = "hosting_result")

    private VideoJobResponseHostingResult hostingResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version")

    @JacksonXmlProperty(localName = "service_version")

    private String serviceVersion;

    public VideoJobResponse withId(String id) {
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

    public VideoJobResponse withName(String name) {
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

    public VideoJobResponse withDescription(String description) {
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

    public VideoJobResponse withState(String state) {
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

    public VideoJobResponse withCreatedAt(String createdAt) {
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

    public VideoJobResponse withUpdatedAt(String updatedAt) {
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

    public VideoJobResponse withInput(Object input) {
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

    public VideoJobResponse withServiceConfig(Object serviceConfig) {
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

    public VideoJobResponse withOutput(Object output) {
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

    public VideoJobResponse withHostingResult(VideoJobResponseHostingResult hostingResult) {
        this.hostingResult = hostingResult;
        return this;
    }

    public VideoJobResponse withHostingResult(Consumer<VideoJobResponseHostingResult> hostingResultSetter) {
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

    public VideoJobResponse withServiceVersion(String serviceVersion) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoJobResponse videoJobResponse = (VideoJobResponse) o;
        return Objects.equals(this.id, videoJobResponse.id) && Objects.equals(this.name, videoJobResponse.name)
            && Objects.equals(this.description, videoJobResponse.description)
            && Objects.equals(this.state, videoJobResponse.state)
            && Objects.equals(this.createdAt, videoJobResponse.createdAt)
            && Objects.equals(this.updatedAt, videoJobResponse.updatedAt)
            && Objects.equals(this.input, videoJobResponse.input)
            && Objects.equals(this.serviceConfig, videoJobResponse.serviceConfig)
            && Objects.equals(this.output, videoJobResponse.output)
            && Objects.equals(this.hostingResult, videoJobResponse.hostingResult)
            && Objects.equals(this.serviceVersion, videoJobResponse.serviceVersion);
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
        sb.append("class VideoJobResponse {\n");
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
