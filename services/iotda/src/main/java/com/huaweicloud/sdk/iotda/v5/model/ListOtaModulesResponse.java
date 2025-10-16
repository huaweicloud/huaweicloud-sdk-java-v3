package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListOtaModulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules")

    private List<OtaModuleInfo> modules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private PageInfo page;

    public ListOtaModulesResponse withModules(List<OtaModuleInfo> modules) {
        this.modules = modules;
        return this;
    }

    public ListOtaModulesResponse addModulesItem(OtaModuleInfo modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    public ListOtaModulesResponse withModules(Consumer<List<OtaModuleInfo>> modulesSetter) {
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
    public List<OtaModuleInfo> getModules() {
        return modules;
    }

    public void setModules(List<OtaModuleInfo> modules) {
        this.modules = modules;
    }

    public ListOtaModulesResponse withPage(PageInfo page) {
        this.page = page;
        return this;
    }

    public ListOtaModulesResponse withPage(Consumer<PageInfo> pageSetter) {
        if (this.page == null) {
            this.page = new PageInfo();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public PageInfo getPage() {
        return page;
    }

    public void setPage(PageInfo page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOtaModulesResponse that = (ListOtaModulesResponse) obj;
        return Objects.equals(this.modules, that.modules) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modules, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOtaModulesResponse {\n");
        sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
