package com.huaweicloud.sdk.cloudpipeline.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudpipeline.v1.model.PipelineParam;
import com.huaweicloud.sdk.cloudpipeline.v1.model.Source;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 流水线参数详情
 */
public class Workflow  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameter")
    
    private PipelineParam parameter = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source")
    
    private Source source = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_name")
    
    private String projectName;

    public Workflow withParameter(PipelineParam parameter) {
        this.parameter = parameter;
        return this;
    }

    public Workflow withParameter(Consumer<PipelineParam> parameterSetter) {
        if(this.parameter == null ){
            this.parameter = new PipelineParam();
            parameterSetter.accept(this.parameter);
        }
        
        return this;
    }


    /**
     * Get parameter
     * @return parameter
     */
    public PipelineParam getParameter() {
        return parameter;
    }

    public void setParameter(PipelineParam parameter) {
        this.parameter = parameter;
    }

    public Workflow withSource(Source source) {
        this.source = source;
        return this;
    }

    public Workflow withSource(Consumer<Source> sourceSetter) {
        if(this.source == null ){
            this.source = new Source();
            sourceSetter.accept(this.source);
        }
        
        return this;
    }


    /**
     * Get source
     * @return source
     */
    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Workflow workflow = (Workflow) o;
        return Objects.equals(this.parameter, workflow.parameter) &&
            Objects.equals(this.source, workflow.source) &&
            Objects.equals(this.name, workflow.name) &&
            Objects.equals(this.projectId, workflow.projectId) &&
            Objects.equals(this.projectName, workflow.projectName);
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

