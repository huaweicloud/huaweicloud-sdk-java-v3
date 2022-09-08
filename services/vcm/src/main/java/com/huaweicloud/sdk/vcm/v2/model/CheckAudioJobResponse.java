package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CheckAudioJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config")

    private AudioServiceConfig serviceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private CheckAudioJobResponseBodyInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private AudioResponseOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version")

    private String serviceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public CheckAudioJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CheckAudioJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheckAudioJobResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 作业状态：   - PENDING_CREATE：等待中   - SCHEDULING：调度中   - CREATE_FAIL：创建失败   - STARTING：启动中   - RUNNING：运行中   - SUCCEEDED：运行成功   - FAILED：运行失败   - PENDING_DELETE：删除中   - DELETE_FAIL：删除失败   - ABNORMAL：运行异常
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CheckAudioJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckAudioJobResponse withServiceConfig(AudioServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    public CheckAudioJobResponse withServiceConfig(Consumer<AudioServiceConfig> serviceConfigSetter) {
        if (this.serviceConfig == null) {
            this.serviceConfig = new AudioServiceConfig();
            serviceConfigSetter.accept(this.serviceConfig);
        }

        return this;
    }

    /**
     * Get serviceConfig
     * @return serviceConfig
     */
    public AudioServiceConfig getServiceConfig() {
        return serviceConfig;
    }

    public void setServiceConfig(AudioServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    public CheckAudioJobResponse withInput(CheckAudioJobResponseBodyInput input) {
        this.input = input;
        return this;
    }

    public CheckAudioJobResponse withInput(Consumer<CheckAudioJobResponseBodyInput> inputSetter) {
        if (this.input == null) {
            this.input = new CheckAudioJobResponseBodyInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public CheckAudioJobResponseBodyInput getInput() {
        return input;
    }

    public void setInput(CheckAudioJobResponseBodyInput input) {
        this.input = input;
    }

    public CheckAudioJobResponse withOutput(AudioResponseOutput output) {
        this.output = output;
        return this;
    }

    public CheckAudioJobResponse withOutput(Consumer<AudioResponseOutput> outputSetter) {
        if (this.output == null) {
            this.output = new AudioResponseOutput();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public AudioResponseOutput getOutput() {
        return output;
    }

    public void setOutput(AudioResponseOutput output) {
        this.output = output;
    }

    public CheckAudioJobResponse withServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /**
     * 服务版本
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public CheckAudioJobResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CheckAudioJobResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 修改时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckAudioJobResponse checkAudioJobResponse = (CheckAudioJobResponse) o;
        return Objects.equals(this.id, checkAudioJobResponse.id)
            && Objects.equals(this.description, checkAudioJobResponse.description)
            && Objects.equals(this.state, checkAudioJobResponse.state)
            && Objects.equals(this.name, checkAudioJobResponse.name)
            && Objects.equals(this.serviceConfig, checkAudioJobResponse.serviceConfig)
            && Objects.equals(this.input, checkAudioJobResponse.input)
            && Objects.equals(this.output, checkAudioJobResponse.output)
            && Objects.equals(this.serviceVersion, checkAudioJobResponse.serviceVersion)
            && Objects.equals(this.createdAt, checkAudioJobResponse.createdAt)
            && Objects.equals(this.updatedAt, checkAudioJobResponse.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, description, state, name, serviceConfig, input, output, serviceVersion, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckAudioJobResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceConfig: ").append(toIndentedString(serviceConfig)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
