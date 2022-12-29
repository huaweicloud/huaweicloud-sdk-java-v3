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
public class ListCriteriasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_criterias")

    private List<GetQuerySearchCriteriasBody> searchCriterias = null;

    public ListCriteriasResponse withSearchCriterias(List<GetQuerySearchCriteriasBody> searchCriterias) {
        this.searchCriterias = searchCriterias;
        return this;
    }

    public ListCriteriasResponse addSearchCriteriasItem(GetQuerySearchCriteriasBody searchCriteriasItem) {
        if (this.searchCriterias == null) {
            this.searchCriterias = new ArrayList<>();
        }
        this.searchCriterias.add(searchCriteriasItem);
        return this;
    }

    public ListCriteriasResponse withSearchCriterias(
        Consumer<List<GetQuerySearchCriteriasBody>> searchCriteriasSetter) {
        if (this.searchCriterias == null) {
            this.searchCriterias = new ArrayList<>();
        }
        searchCriteriasSetter.accept(this.searchCriterias);
        return this;
    }

    /**
     * Get searchCriterias
     * @return searchCriterias
     */
    public List<GetQuerySearchCriteriasBody> getSearchCriterias() {
        return searchCriterias;
    }

    public void setSearchCriterias(List<GetQuerySearchCriteriasBody> searchCriterias) {
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
        ListCriteriasResponse listCriteriasResponse = (ListCriteriasResponse) o;
        return Objects.equals(this.searchCriterias, listCriteriasResponse.searchCriterias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchCriterias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCriteriasResponse {\n");
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
