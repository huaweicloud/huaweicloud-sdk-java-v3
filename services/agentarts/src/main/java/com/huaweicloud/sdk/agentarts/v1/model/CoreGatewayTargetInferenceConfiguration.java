package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 推理目标的配置。
 */
public class CoreGatewayTargetInferenceConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operations")

    private List<CoreGatewayTargetInferenceConfigurationOperations> operations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_mapping")

    private CoreGatewayTargetInferenceConfigurationModelMapping modelMapping;

    public CoreGatewayTargetInferenceConfiguration withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 推理提供者的HTTPS端点。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public CoreGatewayTargetInferenceConfiguration withOperations(
        List<CoreGatewayTargetInferenceConfigurationOperations> operations) {
        this.operations = operations;
        return this;
    }

    public CoreGatewayTargetInferenceConfiguration addOperationsItem(
        CoreGatewayTargetInferenceConfigurationOperations operationsItem) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operationsItem);
        return this;
    }

    public CoreGatewayTargetInferenceConfiguration withOperations(
        Consumer<List<CoreGatewayTargetInferenceConfigurationOperations>> operationsSetter) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        operationsSetter.accept(this.operations);
        return this;
    }

    /**
     * 推理操作配置列表。
     * @return operations
     */
    public List<CoreGatewayTargetInferenceConfigurationOperations> getOperations() {
        return operations;
    }

    public void setOperations(List<CoreGatewayTargetInferenceConfigurationOperations> operations) {
        this.operations = operations;
    }

    public CoreGatewayTargetInferenceConfiguration withModelMapping(
        CoreGatewayTargetInferenceConfigurationModelMapping modelMapping) {
        this.modelMapping = modelMapping;
        return this;
    }

    public CoreGatewayTargetInferenceConfiguration withModelMapping(
        Consumer<CoreGatewayTargetInferenceConfigurationModelMapping> modelMappingSetter) {
        if (this.modelMapping == null) {
            this.modelMapping = new CoreGatewayTargetInferenceConfigurationModelMapping();
            modelMappingSetter.accept(this.modelMapping);
        }

        return this;
    }

    /**
     * Get modelMapping
     * @return modelMapping
     */
    public CoreGatewayTargetInferenceConfigurationModelMapping getModelMapping() {
        return modelMapping;
    }

    public void setModelMapping(CoreGatewayTargetInferenceConfigurationModelMapping modelMapping) {
        this.modelMapping = modelMapping;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayTargetInferenceConfiguration that = (CoreGatewayTargetInferenceConfiguration) obj;
        return Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.operations, that.operations)
            && Objects.equals(this.modelMapping, that.modelMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, operations, modelMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayTargetInferenceConfiguration {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
        sb.append("    modelMapping: ").append(toIndentedString(modelMapping)).append("\n");
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
