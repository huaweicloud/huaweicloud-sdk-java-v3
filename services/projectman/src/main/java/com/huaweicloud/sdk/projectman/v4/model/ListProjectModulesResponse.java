package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListProjectModulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules")

    @JacksonXmlProperty(localName = "modules")

    private List<ProjectModule> modules = null;

    public ListProjectModulesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 模块总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListProjectModulesResponse withModules(List<ProjectModule> modules) {
        this.modules = modules;
        return this;
    }

    public ListProjectModulesResponse addModulesItem(ProjectModule modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    public ListProjectModulesResponse withModules(Consumer<List<ProjectModule>> modulesSetter) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        modulesSetter.accept(this.modules);
        return this;
    }

    /**
     * 模块列表
     * @return modules
     */
    public List<ProjectModule> getModules() {
        return modules;
    }

    public void setModules(List<ProjectModule> modules) {
        this.modules = modules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectModulesResponse listProjectModulesResponse = (ListProjectModulesResponse) o;
        return Objects.equals(this.total, listProjectModulesResponse.total)
            && Objects.equals(this.modules, listProjectModulesResponse.modules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, modules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectModulesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
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
