package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 构建信息。
 */
public class ActionOnComponentBuild {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive")

    private Archive archive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, String> parameters = null;

    public ActionOnComponentBuild withArchive(Archive archive) {
        this.archive = archive;
        return this;
    }

    public ActionOnComponentBuild withArchive(Consumer<Archive> archiveSetter) {
        if (this.archive == null) {
            this.archive = new Archive();
            archiveSetter.accept(this.archive);
        }

        return this;
    }

    /**
     * Get archive
     * @return archive
     */
    public Archive getArchive() {
        return archive;
    }

    public void setArchive(Archive archive) {
        this.archive = archive;
    }

    public ActionOnComponentBuild withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ActionOnComponentBuild putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public ActionOnComponentBuild withParameters(Consumer<Map<String, String>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 构建附加参数。 - base_image：基础镜像地址。 - build_cmd：自定义构建命令。 - dockerfile_path：自定义dockerfile文件路径 - dockerfile_content：自定义dockerfile内容 - artifact_name: 针对java多模块构建，指定构建后运行的产物，以\".jar\"结尾。
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
        ActionOnComponentBuild that = (ActionOnComponentBuild) obj;
        return Objects.equals(this.archive, that.archive) && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archive, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionOnComponentBuild {\n");
        sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
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
