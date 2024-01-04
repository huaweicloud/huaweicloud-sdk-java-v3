package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建模板实例的请求体
 */
public class CreateReleaseReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chart_id")

    private String chartId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private ReleaseReqBodyParams parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private CreateReleaseReqBodyValues values;

    public CreateReleaseReqBody withChartId(String chartId) {
        this.chartId = chartId;
        return this;
    }

    /**
     * 模板ID
     * @return chartId
     */
    public String getChartId() {
        return chartId;
    }

    public void setChartId(String chartId) {
        this.chartId = chartId;
    }

    public CreateReleaseReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板实例描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateReleaseReqBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateReleaseReqBody withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 模板实例所在的命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public CreateReleaseReqBody withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 模板实例版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateReleaseReqBody withParameters(ReleaseReqBodyParams parameters) {
        this.parameters = parameters;
        return this;
    }

    public CreateReleaseReqBody withParameters(Consumer<ReleaseReqBodyParams> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ReleaseReqBodyParams();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public ReleaseReqBodyParams getParameters() {
        return parameters;
    }

    public void setParameters(ReleaseReqBodyParams parameters) {
        this.parameters = parameters;
    }

    public CreateReleaseReqBody withValues(CreateReleaseReqBodyValues values) {
        this.values = values;
        return this;
    }

    public CreateReleaseReqBody withValues(Consumer<CreateReleaseReqBodyValues> valuesSetter) {
        if (this.values == null) {
            this.values = new CreateReleaseReqBodyValues();
            valuesSetter.accept(this.values);
        }

        return this;
    }

    /**
     * Get values
     * @return values
     */
    public CreateReleaseReqBodyValues getValues() {
        return values;
    }

    public void setValues(CreateReleaseReqBodyValues values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateReleaseReqBody that = (CreateReleaseReqBody) obj;
        return Objects.equals(this.chartId, that.chartId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.name, that.name) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.version, that.version) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chartId, description, name, namespace, version, parameters, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReleaseReqBody {\n");
        sb.append("    chartId: ").append(toIndentedString(chartId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
