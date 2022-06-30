package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateProjectModuleRequestBody
 */
public class UpdateProjectModuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_name")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private UserRequest owner;

    public UpdateProjectModuleRequestBody withDescription(String description) {
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

    public UpdateProjectModuleRequestBody withModuleName(String moduleName) {
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

    public UpdateProjectModuleRequestBody withOwner(UserRequest owner) {
        this.owner = owner;
        return this;
    }

    public UpdateProjectModuleRequestBody withOwner(Consumer<UserRequest> ownerSetter) {
        if (this.owner == null) {
            this.owner = new UserRequest();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public UserRequest getOwner() {
        return owner;
    }

    public void setOwner(UserRequest owner) {
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
        UpdateProjectModuleRequestBody updateProjectModuleRequestBody = (UpdateProjectModuleRequestBody) o;
        return Objects.equals(this.description, updateProjectModuleRequestBody.description)
            && Objects.equals(this.moduleName, updateProjectModuleRequestBody.moduleName)
            && Objects.equals(this.owner, updateProjectModuleRequestBody.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, moduleName, owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProjectModuleRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
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
