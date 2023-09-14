package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流水线参数详情
 */
public class Workflow {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter")

    private List<PipelineParam> parameter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private List<Source> source = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    public Workflow withParameter(List<PipelineParam> parameter) {
        this.parameter = parameter;
        return this;
    }

    public Workflow addParameterItem(PipelineParam parameterItem) {
        if (this.parameter == null) {
            this.parameter = new ArrayList<>();
        }
        this.parameter.add(parameterItem);
        return this;
    }

    public Workflow withParameter(Consumer<List<PipelineParam>> parameterSetter) {
        if (this.parameter == null) {
            this.parameter = new ArrayList<>();
        }
        parameterSetter.accept(this.parameter);
        return this;
    }

    /**
     * 任务类型,list类型数据
     * @return parameter
     */
    public List<PipelineParam> getParameter() {
        return parameter;
    }

    public void setParameter(List<PipelineParam> parameter) {
        this.parameter = parameter;
    }

    public Workflow withSource(List<Source> source) {
        this.source = source;
        return this;
    }

    public Workflow addSourceItem(Source sourceItem) {
        if (this.source == null) {
            this.source = new ArrayList<>();
        }
        this.source.add(sourceItem);
        return this;
    }

    public Workflow withSource(Consumer<List<Source>> sourceSetter) {
        if (this.source == null) {
            this.source = new ArrayList<>();
        }
        sourceSetter.accept(this.source);
        return this;
    }

    /**
     * 源码仓,list类型数据
     * @return source
     */
    public List<Source> getSource() {
        return source;
    }

    public void setSource(List<Source> source) {
        this.source = source;
    }

    public Workflow withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流水线名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Workflow withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Workflow withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名字
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Workflow that = (Workflow) obj;
        return Objects.equals(this.parameter, that.parameter) && Objects.equals(this.source, that.source)
            && Objects.equals(this.name, that.name) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameter, source, name, projectId, projectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Workflow {\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
