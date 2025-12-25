package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导出数据对象列表请求body体
 */
public class CommonDataObjectExportRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object_filters_form")

    private DataobjectSearch dataObjectFiltersForm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private List<String> title = null;

    public CommonDataObjectExportRequest withDataObjectFiltersForm(DataobjectSearch dataObjectFiltersForm) {
        this.dataObjectFiltersForm = dataObjectFiltersForm;
        return this;
    }

    public CommonDataObjectExportRequest withDataObjectFiltersForm(
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

    public CommonDataObjectExportRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 导出动作，exportDataObject导出数据/exportTemplate导出模板
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CommonDataObjectExportRequest withTitle(List<String> title) {
        this.title = title;
        return this;
    }

    public CommonDataObjectExportRequest addTitleItem(String titleItem) {
        if (this.title == null) {
            this.title = new ArrayList<>();
        }
        this.title.add(titleItem);
        return this;
    }

    public CommonDataObjectExportRequest withTitle(Consumer<List<String>> titleSetter) {
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
        CommonDataObjectExportRequest that = (CommonDataObjectExportRequest) obj;
        return Objects.equals(this.dataObjectFiltersForm, that.dataObjectFiltersForm)
            && Objects.equals(this.action, that.action) && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataObjectFiltersForm, action, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonDataObjectExportRequest {\n");
        sb.append("    dataObjectFiltersForm: ").append(toIndentedString(dataObjectFiltersForm)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
