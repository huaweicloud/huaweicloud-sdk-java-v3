package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 输出为hosting类型时的配置信息
 */
public class TaskOutputHosting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_category")

    @JacksonXmlProperty(localName = "data_category")

    private List<String> dataCategory = null;

    public TaskOutputHosting withDataCategory(List<String> dataCategory) {
        this.dataCategory = dataCategory;
        return this;
    }

    public TaskOutputHosting addDataCategoryItem(String dataCategoryItem) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        this.dataCategory.add(dataCategoryItem);
        return this;
    }

    public TaskOutputHosting withDataCategory(Consumer<List<String>> dataCategorySetter) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        dataCategorySetter.accept(this.dataCategory);
        return this;
    }

    /**
     * 作业输出数据类别的列表，选填，仅部分服务需要。当输出类型下有这个列表时，表示希望这个输出类型下存放dataCategory列表内的数据。
     * @return dataCategory
     */
    public List<String> getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(List<String> dataCategory) {
        this.dataCategory = dataCategory;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskOutputHosting taskOutputHosting = (TaskOutputHosting) o;
        return Objects.equals(this.dataCategory, taskOutputHosting.dataCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskOutputHosting {\n");
        sb.append("    dataCategory: ").append(toIndentedString(dataCategory)).append("\n");
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
