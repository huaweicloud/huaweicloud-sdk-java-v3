package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExportIndicatorsRequestBody
 */
public class ExportIndicatorsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object_filters_form")

    private DataobjectSearch dataObjectFiltersForm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private List<String> title = null;

    public ExportIndicatorsRequestBody withDataObjectFiltersForm(DataobjectSearch dataObjectFiltersForm) {
        this.dataObjectFiltersForm = dataObjectFiltersForm;
        return this;
    }

    public ExportIndicatorsRequestBody withDataObjectFiltersForm(
        Consumer<DataobjectSearch> dataObjectFiltersFormSetter) {
        if (this.dataObjectFiltersForm == null) {
            this.dataObjectFiltersForm = new DataobjectSearch();
            dataObjectFiltersFormSetter.accept(this.dataObjectFiltersForm);
        }

        return this;
    }

    /**
     * Get dataObjectFiltersForm
     * @return dataObjectFiltersForm
     */
    public DataobjectSearch getDataObjectFiltersForm() {
        return dataObjectFiltersForm;
    }

    public void setDataObjectFiltersForm(DataobjectSearch dataObjectFiltersForm) {
        this.dataObjectFiltersForm = dataObjectFiltersForm;
    }

    public ExportIndicatorsRequestBody withTitle(List<String> title) {
        this.title = title;
        return this;
    }

    public ExportIndicatorsRequestBody addTitleItem(String titleItem) {
        if (this.title == null) {
            this.title = new ArrayList<>();
        }
        this.title.add(titleItem);
        return this;
    }

    public ExportIndicatorsRequestBody withTitle(Consumer<List<String>> titleSetter) {
        if (this.title == null) {
            this.title = new ArrayList<>();
        }
        titleSetter.accept(this.title);
        return this;
    }

    /**
     * 导出字段列表
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
        ExportIndicatorsRequestBody that = (ExportIndicatorsRequestBody) obj;
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
        sb.append("class ExportIndicatorsRequestBody {\n");
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
