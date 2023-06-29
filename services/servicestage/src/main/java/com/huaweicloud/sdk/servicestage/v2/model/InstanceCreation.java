package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建实例请求体
 */
public class InstanceCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagram")

    private String diagram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private InstanceCreationVariables variables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    public InstanceCreation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称，必填
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceCreation withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 实例描述，非必填
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public InstanceCreation withDiagram(String diagram) {
        this.diagram = diagram;
        return this;
    }

    /**
     * 架构部署图，通过设计器创建时必填
     * @return diagram
     */
    public String getDiagram() {
        return diagram;
    }

    public void setDiagram(String diagram) {
        this.diagram = diagram;
    }

    public InstanceCreation withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 设计器架构图base64编码,通过设计器创建或更新实例时可选
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public InstanceCreation withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 预置模板id，通过模板创建时必填
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public InstanceCreation withVariables(InstanceCreationVariables variables) {
        this.variables = variables;
        return this;
    }

    public InstanceCreation withVariables(Consumer<InstanceCreationVariables> variablesSetter) {
        if (this.variables == null) {
            this.variables = new InstanceCreationVariables();
            variablesSetter.accept(this.variables);
        }

        return this;
    }

    /**
     * Get variables
     * @return variables
     */
    public InstanceCreationVariables getVariables() {
        return variables;
    }

    public void setVariables(InstanceCreationVariables variables) {
        this.variables = variables;
    }

    public InstanceCreation withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id,更新时必填
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceCreation that = (InstanceCreation) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.diagram, that.diagram) && Objects.equals(this.image, that.image)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.variables, that.variables)
            && Objects.equals(this.instanceId, that.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, desc, diagram, image, templateId, variables, instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceCreation {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    diagram: ").append(toIndentedString(diagram)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
