package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导出漏洞列表请求body体
 */
public class ExportVulnerabilitiesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object_filters_form")

    private VulnerabilityDataObjectSearch dataObjectFiltersForm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private List<String> title = null;

    public ExportVulnerabilitiesRequestBody withDataObjectFiltersForm(
        VulnerabilityDataObjectSearch dataObjectFiltersForm) {
        this.dataObjectFiltersForm = dataObjectFiltersForm;
        return this;
    }

    public ExportVulnerabilitiesRequestBody withDataObjectFiltersForm(
        Consumer<VulnerabilityDataObjectSearch> dataObjectFiltersFormSetter) {
        if (this.dataObjectFiltersForm == null) {
            this.dataObjectFiltersForm = new VulnerabilityDataObjectSearch();
            dataObjectFiltersFormSetter.accept(this.dataObjectFiltersForm);
        }

        return this;
    }

    /**
     * Get dataObjectFiltersForm
     * @return dataObjectFiltersForm
     */
    public VulnerabilityDataObjectSearch getDataObjectFiltersForm() {
        return dataObjectFiltersForm;
    }

    public void setDataObjectFiltersForm(VulnerabilityDataObjectSearch dataObjectFiltersForm) {
        this.dataObjectFiltersForm = dataObjectFiltersForm;
    }

    public ExportVulnerabilitiesRequestBody withTitle(List<String> title) {
        this.title = title;
        return this;
    }

    public ExportVulnerabilitiesRequestBody addTitleItem(String titleItem) {
        if (this.title == null) {
            this.title = new ArrayList<>();
        }
        this.title.add(titleItem);
        return this;
    }

    public ExportVulnerabilitiesRequestBody withTitle(Consumer<List<String>> titleSetter) {
        if (this.title == null) {
            this.title = new ArrayList<>();
        }
        titleSetter.accept(this.title);
        return this;
    }

    /**
     * 导出字段
     * @return title
     */
    public List<String> getTitle() {
        return title;
    }

    public void setTitle(List<String> title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportVulnerabilitiesRequestBody that = (ExportVulnerabilitiesRequestBody) obj;
        return Objects.equals(this.dataObjectFiltersForm, that.dataObjectFiltersForm)
            && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataObjectFiltersForm, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportVulnerabilitiesRequestBody {\n");
        sb.append("    dataObjectFiltersForm: ").append(toIndentedString(dataObjectFiltersForm)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
