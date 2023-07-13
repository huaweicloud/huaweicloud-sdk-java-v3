package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProjectChildModule
 */
public class ProjectChildModule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private Integer moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_name")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private ModuleOwner owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deepth")

    private Integer deepth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_parent")

    private Boolean isParent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_module_id")

    private Integer parentModuleId;

    public ProjectChildModule withModuleId(Integer moduleId) {
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

    public ProjectChildModule withModuleName(String moduleName) {
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

    public ProjectChildModule withOwner(ModuleOwner owner) {
        this.owner = owner;
        return this;
    }

    public ProjectChildModule withOwner(Consumer<ModuleOwner> ownerSetter) {
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

    public ProjectChildModule withDeepth(Integer deepth) {
        this.deepth = deepth;
        return this;
    }

    /**
     * 模块层级
     * @return deepth
     */
    public Integer getDeepth() {
        return deepth;
    }

    public void setDeepth(Integer deepth) {
        this.deepth = deepth;
    }

    public ProjectChildModule withIsParent(Boolean isParent) {
        this.isParent = isParent;
        return this;
    }

    /**
     * 是否是父级，true 父模块， false 非父模块
     * @return isParent
     */
    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public ProjectChildModule withParentModuleId(Integer parentModuleId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectChildModule that = (ProjectChildModule) obj;
        return Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.moduleName, that.moduleName)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.deepth, that.deepth)
            && Objects.equals(this.isParent, that.isParent) && Objects.equals(this.parentModuleId, that.parentModuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleId, moduleName, owner, deepth, isParent, parentModuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectChildModule {\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    deepth: ").append(toIndentedString(deepth)).append("\n");
        sb.append("    isParent: ").append(toIndentedString(isParent)).append("\n");
        sb.append("    parentModuleId: ").append(toIndentedString(parentModuleId)).append("\n");
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
