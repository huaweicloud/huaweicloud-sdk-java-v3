package com.huaweicloud.sdk.lts.v2.model;

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
public class ListQueryAllSearchCriteriasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_criterias")

    private List<SearchCriteriasBody> searchCriterias = null;

    public ListQueryAllSearchCriteriasResponse withSearchCriterias(List<SearchCriteriasBody> searchCriterias) {
        this.searchCriterias = searchCriterias;
        return this;
    }

    public ListQueryAllSearchCriteriasResponse addSearchCriteriasItem(SearchCriteriasBody searchCriteriasItem) {
        if (this.searchCriterias == null) {
            this.searchCriterias = new ArrayList<>();
        }
        this.searchCriterias.add(searchCriteriasItem);
        return this;
    }

    public ListQueryAllSearchCriteriasResponse withSearchCriterias(
        Consumer<List<SearchCriteriasBody>> searchCriteriasSetter) {
        if (this.searchCriterias == null) {
            this.searchCriterias = new ArrayList<>();
        }
        searchCriteriasSetter.accept(this.searchCriterias);
        return this;
    }

    /**
     * 快速查询
     * @return searchCriterias
     */
    public List<SearchCriteriasBody> getSearchCriterias() {
        return searchCriterias;
    }

    public void setSearchCriterias(List<SearchCriteriasBody> searchCriterias) {
        this.searchCriterias = searchCriterias;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQueryAllSearchCriteriasResponse listQueryAllSearchCriteriasResponse =
            (ListQueryAllSearchCriteriasResponse) o;
        return Objects.equals(this.searchCriterias, listQueryAllSearchCriteriasResponse.searchCriterias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchCriterias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueryAllSearchCriteriasResponse {\n");
        sb.append("    searchCriterias: ").append(toIndentedString(searchCriterias)).append("\n");
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
