package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TempInfo
 */
public class TempInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    @JacksonXmlProperty(localName = "variables")

    private String variables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    @JacksonXmlProperty(localName = "contents")

    private List<Object> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_type")

    @JacksonXmlProperty(localName = "temp_type")

    private Integer tempType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "for_loop_params")

    @JacksonXmlProperty(localName = "for_loop_params")

    private List<Object> forLoopParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_controller")

    @JacksonXmlProperty(localName = "logic_controller")

    private LogicController logicController;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_pre")

    @JacksonXmlProperty(localName = "enable_pre")

    private Boolean enablePre;

    public TempInfo withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TempInfo withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * project_id
     * minimum: 0
     * maximum: 2147483647
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public TempInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TempInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TempInfo withVariables(String variables) {
        this.variables = variables;
        return this;
    }

    /**
     * variables
     * @return variables
     */
    public String getVariables() {
        return variables;
    }

    public void setVariables(String variables) {
        this.variables = variables;
    }

    public TempInfo withContents(List<Object> contents) {
        this.contents = contents;
        return this;
    }

    public TempInfo addContentsItem(Object contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public TempInfo withContents(Consumer<List<Object>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * contents
     * @return contents
     */
    public List<Object> getContents() {
        return contents;
    }

    public void setContents(List<Object> contents) {
        this.contents = contents;
    }

    public TempInfo withTempType(Integer tempType) {
        this.tempType = tempType;
        return this;
    }

    /**
     * temp_type
     * minimum: 0
     * maximum: 2147483647
     * @return tempType
     */
    public Integer getTempType() {
        return tempType;
    }

    public void setTempType(Integer tempType) {
        this.tempType = tempType;
    }

    public TempInfo withForLoopParams(List<Object> forLoopParams) {
        this.forLoopParams = forLoopParams;
        return this;
    }

    public TempInfo addForLoopParamsItem(Object forLoopParamsItem) {
        if (this.forLoopParams == null) {
            this.forLoopParams = new ArrayList<>();
        }
        this.forLoopParams.add(forLoopParamsItem);
        return this;
    }

    public TempInfo withForLoopParams(Consumer<List<Object>> forLoopParamsSetter) {
        if (this.forLoopParams == null) {
            this.forLoopParams = new ArrayList<>();
        }
        forLoopParamsSetter.accept(this.forLoopParams);
        return this;
    }

    /**
     * for_loop_params
     * @return forLoopParams
     */
    public List<Object> getForLoopParams() {
        return forLoopParams;
    }

    public void setForLoopParams(List<Object> forLoopParams) {
        this.forLoopParams = forLoopParams;
    }

    public TempInfo withLogicController(LogicController logicController) {
        this.logicController = logicController;
        return this;
    }

    public TempInfo withLogicController(Consumer<LogicController> logicControllerSetter) {
        if (this.logicController == null) {
            this.logicController = new LogicController();
            logicControllerSetter.accept(this.logicController);
        }

        return this;
    }

    /**
     * Get logicController
     * @return logicController
     */
    public LogicController getLogicController() {
        return logicController;
    }

    public void setLogicController(LogicController logicController) {
        this.logicController = logicController;
    }

    public TempInfo withEnablePre(Boolean enablePre) {
        this.enablePre = enablePre;
        return this;
    }

    /**
     * enable_pre
     * @return enablePre
     */
    public Boolean getEnablePre() {
        return enablePre;
    }

    public void setEnablePre(Boolean enablePre) {
        this.enablePre = enablePre;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TempInfo tempInfo = (TempInfo) o;
        return Objects.equals(this.id, tempInfo.id) && Objects.equals(this.projectId, tempInfo.projectId)
            && Objects.equals(this.name, tempInfo.name) && Objects.equals(this.description, tempInfo.description)
            && Objects.equals(this.variables, tempInfo.variables) && Objects.equals(this.contents, tempInfo.contents)
            && Objects.equals(this.tempType, tempInfo.tempType)
            && Objects.equals(this.forLoopParams, tempInfo.forLoopParams)
            && Objects.equals(this.logicController, tempInfo.logicController)
            && Objects.equals(this.enablePre, tempInfo.enablePre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            name,
            description,
            variables,
            contents,
            tempType,
            forLoopParams,
            logicController,
            enablePre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TempInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    tempType: ").append(toIndentedString(tempType)).append("\n");
        sb.append("    forLoopParams: ").append(toIndentedString(forLoopParams)).append("\n");
        sb.append("    logicController: ").append(toIndentedString(logicController)).append("\n");
        sb.append("    enablePre: ").append(toIndentedString(enablePre)).append("\n");
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
