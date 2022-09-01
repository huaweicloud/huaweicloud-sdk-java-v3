package com.huaweicloud.sdk.osm.v2.model;

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
public class ListProductCategoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_product_category_list")

    @JacksonXmlProperty(localName = "incident_product_category_list")

    private List<IncidentProductCategoryV2> incidentProductCategoryList = null;

    public ListProductCategoriesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 65535
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListProductCategoriesResponse withIncidentProductCategoryList(
        List<IncidentProductCategoryV2> incidentProductCategoryList) {
        this.incidentProductCategoryList = incidentProductCategoryList;
        return this;
    }

    public ListProductCategoriesResponse addIncidentProductCategoryListItem(
        IncidentProductCategoryV2 incidentProductCategoryListItem) {
        if (this.incidentProductCategoryList == null) {
            this.incidentProductCategoryList = new ArrayList<>();
        }
        this.incidentProductCategoryList.add(incidentProductCategoryListItem);
        return this;
    }

    public ListProductCategoriesResponse withIncidentProductCategoryList(
        Consumer<List<IncidentProductCategoryV2>> incidentProductCategoryListSetter) {
        if (this.incidentProductCategoryList == null) {
            this.incidentProductCategoryList = new ArrayList<>();
        }
        incidentProductCategoryListSetter.accept(this.incidentProductCategoryList);
        return this;
    }

    /**
     * 产品类型列表
     * @return incidentProductCategoryList
     */
    public List<IncidentProductCategoryV2> getIncidentProductCategoryList() {
        return incidentProductCategoryList;
    }

    public void setIncidentProductCategoryList(List<IncidentProductCategoryV2> incidentProductCategoryList) {
        this.incidentProductCategoryList = incidentProductCategoryList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProductCategoriesResponse listProductCategoriesResponse = (ListProductCategoriesResponse) o;
        return Objects.equals(this.totalCount, listProductCategoriesResponse.totalCount) && Objects
            .equals(this.incidentProductCategoryList, listProductCategoriesResponse.incidentProductCategoryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, incidentProductCategoryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductCategoriesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    incidentProductCategoryList: ")
            .append(toIndentedString(incidentProductCategoryList))
            .append("\n");
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
