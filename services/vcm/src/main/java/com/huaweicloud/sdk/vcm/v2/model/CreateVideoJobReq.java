package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建作业请求体
 */
public class CreateVideoJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private CreateVideoJobReqInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private Output output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config")

    private ServiceConfig serviceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version")

    private String serviceVersion;

    public CreateVideoJobReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称，只能由中文、字母（a～zA～Z）、数字（0～9）、中划线（-）、下划线（_）组成，长度范围为[1，100]。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVideoJobReq withDescription(String description) {
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

    public CreateVideoJobReq withInput(CreateVideoJobReqInput input) {
        this.input = input;
        return this;
    }

    public CreateVideoJobReq withInput(Consumer<CreateVideoJobReqInput> inputSetter) {
        if (this.input == null) {
            this.input = new CreateVideoJobReqInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public CreateVideoJobReqInput getInput() {
        return input;
    }

    public void setInput(CreateVideoJobReqInput input) {
        this.input = input;
    }

    public CreateVideoJobReq withOutput(Output output) {
        this.output = output;
        return this;
    }

    public CreateVideoJobReq withOutput(Consumer<Output> outputSetter) {
        if (this.output == null) {
            this.output = new Output();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public CreateVideoJobReq withServiceConfig(ServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    public CreateVideoJobReq withServiceConfig(Consumer<ServiceConfig> serviceConfigSetter) {
        if (this.serviceConfig == null) {
            this.serviceConfig = new ServiceConfig();
            serviceConfigSetter.accept(this.serviceConfig);
        }

        return this;
    }

    /**
     * Get serviceConfig
     * @return serviceConfig
     */
    public ServiceConfig getServiceConfig() {
        return serviceConfig;
    }

    public void setServiceConfig(ServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    public CreateVideoJobReq withServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /**
     * 功能版本为“1.2”。
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
        CreateVideoJobReq that = (CreateVideoJobReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.input, that.input) && Objects.equals(this.output, that.output)
            && Objects.equals(this.serviceConfig, that.serviceConfig)
            && Objects.equals(this.serviceVersion, that.serviceVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, input, output, serviceConfig, serviceVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoJobReq {\n");
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
