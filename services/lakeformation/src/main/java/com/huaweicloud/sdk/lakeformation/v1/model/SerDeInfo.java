package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 序列化/反序列化的信息
 */
public class SerDeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serialization_library")

    private String serializationLibrary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, String> parameters = null;

    public SerDeInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名字信息
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SerDeInfo withSerializationLibrary(String serializationLibrary) {
        this.serializationLibrary = serializationLibrary;
        return this;
    }

    /**
     * 实现序列化/反序列化的类
     * @return serializationLibrary
     */
    public String getSerializationLibrary() {
        return serializationLibrary;
    }

    public void setSerializationLibrary(String serializationLibrary) {
        this.serializationLibrary = serializationLibrary;
    }

    public SerDeInfo withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public SerDeInfo putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public SerDeInfo withParameters(Consumer<Map<String, String>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 参数数组。 key最小值1，最大值255 value最大值4000
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SerDeInfo that = (SerDeInfo) obj;
        return Objects.equals(this.name, that.name)
            && Objects.equals(this.serializationLibrary, that.serializationLibrary)
            && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serializationLibrary, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SerDeInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serializationLibrary: ").append(toIndentedString(serializationLibrary)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
