package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProjectModule
 */
public class ProjectModule {

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
    @JsonProperty(value = "children")

    private List<ProjectChildModule> children = null;

    public ProjectModule withModuleId(Integer moduleId) {
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

    public ProjectModule withModuleName(String moduleName) {
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

    public ProjectModule withOwner(ModuleOwner owner) {
        this.owner = owner;
        return this;
    }

    public ProjectModule withOwner(Consumer<ModuleOwner> ownerSetter) {
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

    public ProjectModule withDeepth(Integer deepth) {
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

    public ProjectModule withIsParent(Boolean isParent) {
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

    public ProjectModule withChildren(List<ProjectChildModule> children) {
        this.children = children;
        return this;
    }

    public ProjectModule addChildrenItem(ProjectChildModule childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public ProjectModule withChildren(Consumer<List<ProjectChildModule>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子模块信息
     * @return children
     */
    public List<ProjectChildModule> getChildren() {
        return children;
    }

    public void setChildren(List<ProjectChildModule> children) {
        this.children = children;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectModule that = (ProjectModule) obj;
        return Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.moduleName, that.moduleName)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.deepth, that.deepth)
            && Objects.equals(this.isParent, that.isParent) && Objects.equals(this.children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduleId, moduleName, owner, deepth, isParent, children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectModule {\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    deepth: ").append(toIndentedString(deepth)).append("\n");
        sb.append("    isParent: ").append(toIndentedString(isParent)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
