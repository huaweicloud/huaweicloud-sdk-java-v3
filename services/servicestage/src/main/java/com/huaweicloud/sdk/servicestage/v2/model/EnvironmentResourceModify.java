package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** EnvironmentResourceModify */
public class EnvironmentResourceModify {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_base_resources")

    private List<Resource> addBaseResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_optional_resources")

    private List<Resource> addOptionalResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_resources")

    private List<Resource> removeResources = null;

    public EnvironmentResourceModify withAddBaseResources(List<Resource> addBaseResources) {
        this.addBaseResources = addBaseResources;
        return this;
    }

    public EnvironmentResourceModify addAddBaseResourcesItem(Resource addBaseResourcesItem) {
        if (this.addBaseResources == null) {
            this.addBaseResources = new ArrayList<>();
        }
        this.addBaseResources.add(addBaseResourcesItem);
        return this;
    }

    public EnvironmentResourceModify withAddBaseResources(Consumer<List<Resource>> addBaseResourcesSetter) {
        if (this.addBaseResources == null) {
            this.addBaseResources = new ArrayList<>();
        }
        addBaseResourcesSetter.accept(this.addBaseResources);
        return this;
    }

    /** 添加基础资源。
     * 
     * @return addBaseResources */
    public List<Resource> getAddBaseResources() {
        return addBaseResources;
    }

    public void setAddBaseResources(List<Resource> addBaseResources) {
        this.addBaseResources = addBaseResources;
    }

    public EnvironmentResourceModify withAddOptionalResources(List<Resource> addOptionalResources) {
        this.addOptionalResources = addOptionalResources;
        return this;
    }

    public EnvironmentResourceModify addAddOptionalResourcesItem(Resource addOptionalResourcesItem) {
        if (this.addOptionalResources == null) {
            this.addOptionalResources = new ArrayList<>();
        }
        this.addOptionalResources.add(addOptionalResourcesItem);
        return this;
    }

    public EnvironmentResourceModify withAddOptionalResources(Consumer<List<Resource>> addOptionalResourcesSetter) {
        if (this.addOptionalResources == null) {
            this.addOptionalResources = new ArrayList<>();
        }
        addOptionalResourcesSetter.accept(this.addOptionalResources);
        return this;
    }

    /** 添加其他资源。
     * 
     * @return addOptionalResources */
    public List<Resource> getAddOptionalResources() {
        return addOptionalResources;
    }

    public void setAddOptionalResources(List<Resource> addOptionalResources) {
        this.addOptionalResources = addOptionalResources;
    }

    public EnvironmentResourceModify withRemoveResources(List<Resource> removeResources) {
        this.removeResources = removeResources;
        return this;
    }

    public EnvironmentResourceModify addRemoveResourcesItem(Resource removeResourcesItem) {
        if (this.removeResources == null) {
            this.removeResources = new ArrayList<>();
        }
        this.removeResources.add(removeResourcesItem);
        return this;
    }

    public EnvironmentResourceModify withRemoveResources(Consumer<List<Resource>> removeResourcesSetter) {
        if (this.removeResources == null) {
            this.removeResources = new ArrayList<>();
        }
        removeResourcesSetter.accept(this.removeResources);
        return this;
    }

    /** 移除资源。
     * 
     * @return removeResources */
    public List<Resource> getRemoveResources() {
        return removeResources;
    }

    public void setRemoveResources(List<Resource> removeResources) {
        this.removeResources = removeResources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvironmentResourceModify environmentResourceModify = (EnvironmentResourceModify) o;
        return Objects.equals(this.addBaseResources, environmentResourceModify.addBaseResources)
            && Objects.equals(this.addOptionalResources, environmentResourceModify.addOptionalResources)
            && Objects.equals(this.removeResources, environmentResourceModify.removeResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addBaseResources, addOptionalResources, removeResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentResourceModify {\n");
        sb.append("    addBaseResources: ").append(toIndentedString(addBaseResources)).append("\n");
        sb.append("    addOptionalResources: ").append(toIndentedString(addOptionalResources)).append("\n");
        sb.append("    removeResources: ").append(toIndentedString(removeResources)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
