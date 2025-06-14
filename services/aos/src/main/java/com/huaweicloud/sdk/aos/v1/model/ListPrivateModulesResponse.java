package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListPrivateModulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules")

    private List<PrivateModuleSummary> modules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListPrivateModulesResponse withModules(List<PrivateModuleSummary> modules) {
        this.modules = modules;
        return this;
    }

    public ListPrivateModulesResponse addModulesItem(PrivateModuleSummary modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    public ListPrivateModulesResponse withModules(Consumer<List<PrivateModuleSummary>> modulesSetter) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        modulesSetter.accept(this.modules);
        return this;
    }

    /**
     * 私有模块的列表。默认以创建时间升序排序。
     * @return modules
     */
    public List<PrivateModuleSummary> getModules() {
        return modules;
    }

    public void setModules(List<PrivateModuleSummary> modules) {
        this.modules = modules;
    }

    public ListPrivateModulesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPrivateModulesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPrivateModulesResponse that = (ListPrivateModulesResponse) obj;
        return Objects.equals(this.modules, that.modules) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modules, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateModulesResponse {\n");
        sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
