package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求体
 */
public class CreateAudioJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    @JacksonXmlProperty(localName = "input")

    private CreateAudioJobRequestBodyInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    @JacksonXmlProperty(localName = "output")

    private AudioOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config")

    @JacksonXmlProperty(localName = "service_config")

    private AudioServiceConfig serviceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version")

    @JacksonXmlProperty(localName = "service_version")

    private String serviceVersion;

    public CreateAudioJobRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称，只能由字母（a～zA～Z）、数字（0～9）、中划线（-）、下划线（_）组成，长度范围为[1，100]。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAudioJobRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业描述信息，最大长度为500字符长度。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAudioJobRequestBody withInput(CreateAudioJobRequestBodyInput input) {
        this.input = input;
        return this;
    }

    public CreateAudioJobRequestBody withInput(Consumer<CreateAudioJobRequestBodyInput> inputSetter) {
        if (this.input == null) {
            this.input = new CreateAudioJobRequestBodyInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public CreateAudioJobRequestBodyInput getInput() {
        return input;
    }

    public void setInput(CreateAudioJobRequestBodyInput input) {
        this.input = input;
    }

    public CreateAudioJobRequestBody withOutput(AudioOutput output) {
        this.output = output;
        return this;
    }

    public CreateAudioJobRequestBody withOutput(Consumer<AudioOutput> outputSetter) {
        if (this.output == null) {
            this.output = new AudioOutput();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public AudioOutput getOutput() {
        return output;
    }

    public void setOutput(AudioOutput output) {
        this.output = output;
    }

    public CreateAudioJobRequestBody withServiceConfig(AudioServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    public CreateAudioJobRequestBody withServiceConfig(Consumer<AudioServiceConfig> serviceConfigSetter) {
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

    public CreateAudioJobRequestBody withServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /**
     * 功能版本为“1.0”。
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
        CreateAudioJobRequestBody createAudioJobRequestBody = (CreateAudioJobRequestBody) o;
        return Objects.equals(this.name, createAudioJobRequestBody.name)
            && Objects.equals(this.description, createAudioJobRequestBody.description)
            && Objects.equals(this.input, createAudioJobRequestBody.input)
            && Objects.equals(this.output, createAudioJobRequestBody.output)
            && Objects.equals(this.serviceConfig, createAudioJobRequestBody.serviceConfig)
            && Objects.equals(this.serviceVersion, createAudioJobRequestBody.serviceVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, input, output, serviceConfig, serviceVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAudioJobRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    serviceConfig: ").append(toIndentedString(serviceConfig)).append("\n");
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
