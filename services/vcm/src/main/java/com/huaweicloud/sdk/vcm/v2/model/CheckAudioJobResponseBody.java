package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 返回数据
 */
public class CheckAudioJobResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    @JacksonXmlProperty(localName = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config")

    @JacksonXmlProperty(localName = "service_config")

    private AudioServiceConfig serviceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    @JacksonXmlProperty(localName = "input")

    private CheckAudioJobResponseBodyInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    @JacksonXmlProperty(localName = "output")

    private AudioResponseOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version")

    @JacksonXmlProperty(localName = "service_version")

    private String serviceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private String updatedAt;

    public CheckAudioJobResponseBody withId(String id) {
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

    public CheckAudioJobResponseBody withDescription(String description) {
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

    public CheckAudioJobResponseBody withState(String state) {
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

    public CheckAudioJobResponseBody withName(String name) {
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

    public CheckAudioJobResponseBody withServiceConfig(AudioServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    public CheckAudioJobResponseBody withServiceConfig(Consumer<AudioServiceConfig> serviceConfigSetter) {
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

    public CheckAudioJobResponseBody withInput(CheckAudioJobResponseBodyInput input) {
        this.input = input;
        return this;
    }

    public CheckAudioJobResponseBody withInput(Consumer<CheckAudioJobResponseBodyInput> inputSetter) {
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

    public CheckAudioJobResponseBody withOutput(AudioResponseOutput output) {
        this.output = output;
        return this;
    }

    public CheckAudioJobResponseBody withOutput(Consumer<AudioResponseOutput> outputSetter) {
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

    public CheckAudioJobResponseBody withServiceVersion(String serviceVersion) {
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

    public CheckAudioJobResponseBody withCreatedAt(String createdAt) {
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

    public CheckAudioJobResponseBody withUpdatedAt(String updatedAt) {
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
        CheckAudioJobResponseBody checkAudioJobResponseBody = (CheckAudioJobResponseBody) o;
        return Objects.equals(this.id, checkAudioJobResponseBody.id)
            && Objects.equals(this.description, checkAudioJobResponseBody.description)
            && Objects.equals(this.state, checkAudioJobResponseBody.state)
            && Objects.equals(this.name, checkAudioJobResponseBody.name)
            && Objects.equals(this.serviceConfig, checkAudioJobResponseBody.serviceConfig)
            && Objects.equals(this.input, checkAudioJobResponseBody.input)
            && Objects.equals(this.output, checkAudioJobResponseBody.output)
            && Objects.equals(this.serviceVersion, checkAudioJobResponseBody.serviceVersion)
            && Objects.equals(this.createdAt, checkAudioJobResponseBody.createdAt)
            && Objects.equals(this.updatedAt, checkAudioJobResponseBody.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, description, state, name, serviceConfig, input, output, serviceVersion, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckAudioJobResponseBody {\n");
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
