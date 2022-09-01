package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 构建工程。
 */
public class BuildInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    @JacksonXmlProperty(localName = "parameters")

    private BuildInfoParameters parameters;

    public BuildInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 构建ID，查看构建列表获取。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BuildInfo withParameters(BuildInfoParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    public BuildInfo withParameters(Consumer<BuildInfoParameters> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new BuildInfoParameters();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public BuildInfoParameters getParameters() {
        return parameters;
    }

    public void setParameters(BuildInfoParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BuildInfo buildInfo = (BuildInfo) o;
        return Objects.equals(this.id, buildInfo.id) && Objects.equals(this.parameters, buildInfo.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
