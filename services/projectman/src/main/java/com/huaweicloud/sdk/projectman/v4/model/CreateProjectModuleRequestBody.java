package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateProjectModuleRequestBody
 */
public class CreateProjectModuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_name")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_module_id")

    private Integer parentModuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private UserRequest owner;

    public CreateProjectModuleRequestBody withDescription(String description) {
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

    public CreateProjectModuleRequestBody withModuleName(String moduleName) {
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

    public CreateProjectModuleRequestBody withParentModuleId(Integer parentModuleId) {
        this.parentModuleId = parentModuleId;
        return this;
    }

    /**
     * 父模块id
     * @return parentModuleId
     */
    public Integer getParentModuleId() {
        return parentModuleId;
    }

    public void setParentModuleId(Integer parentModuleId) {
        this.parentModuleId = parentModuleId;
    }

    public CreateProjectModuleRequestBody withOwner(UserRequest owner) {
        this.owner = owner;
        return this;
    }

    public CreateProjectModuleRequestBody withOwner(Consumer<UserRequest> ownerSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProjectModuleRequestBody that = (CreateProjectModuleRequestBody) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.moduleName, that.moduleName)
            && Objects.equals(this.parentModuleId, that.parentModuleId) && Objects.equals(this.owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, moduleName, parentModuleId, owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProjectModuleRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    parentModuleId: ").append(toIndentedString(parentModuleId)).append("\n");
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
