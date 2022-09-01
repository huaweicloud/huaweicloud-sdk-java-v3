package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateProjectModuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_name")

    @JacksonXmlProperty(localName = "module_name")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    @JacksonXmlProperty(localName = "module_id")

    private Integer moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    @JacksonXmlProperty(localName = "owner")

    private ModuleOwner owner;

    public CreateProjectModuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模块描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateProjectModuleResponse withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * 模块名称
     * @return moduleName
     */
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public CreateProjectModuleResponse withModuleId(Integer moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块id
     * @return moduleId
     */
    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public CreateProjectModuleResponse withOwner(ModuleOwner owner) {
        this.owner = owner;
        return this;
    }

    public CreateProjectModuleResponse withOwner(Consumer<ModuleOwner> ownerSetter) {
        if (this.owner == null) {
            this.owner = new ModuleOwner();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public ModuleOwner getOwner() {
        return owner;
    }

    public void setOwner(ModuleOwner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateProjectModuleResponse createProjectModuleResponse = (CreateProjectModuleResponse) o;
        return Objects.equals(this.description, createProjectModuleResponse.description)
            && Objects.equals(this.moduleName, createProjectModuleResponse.moduleName)
            && Objects.equals(this.moduleId, createProjectModuleResponse.moduleId)
            && Objects.equals(this.owner, createProjectModuleResponse.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, moduleName, moduleId, owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProjectModuleResponse {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
