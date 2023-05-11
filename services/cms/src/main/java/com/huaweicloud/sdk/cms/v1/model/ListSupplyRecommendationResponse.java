package com.huaweicloud.sdk.cms.v1.model;

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
public class ListSupplyRecommendationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supply_recommendations")

    private List<SupplyRecommendation> supplyRecommendations = null;

    public ListSupplyRecommendationResponse withSupplyRecommendations(
        List<SupplyRecommendation> supplyRecommendations) {
        this.supplyRecommendations = supplyRecommendations;
        return this;
    }

    public ListSupplyRecommendationResponse addSupplyRecommendationsItem(
        SupplyRecommendation supplyRecommendationsItem) {
        if (this.supplyRecommendations == null) {
            this.supplyRecommendations = new ArrayList<>();
        }
        this.supplyRecommendations.add(supplyRecommendationsItem);
        return this;
    }

    public ListSupplyRecommendationResponse withSupplyRecommendations(
        Consumer<List<SupplyRecommendation>> supplyRecommendationsSetter) {
        if (this.supplyRecommendations == null) {
            this.supplyRecommendations = new ArrayList<>();
        }
        supplyRecommendationsSetter.accept(this.supplyRecommendations);
        return this;
    }

    /**
     * 资源供给推荐结果
     * @return supplyRecommendations
     */
    public List<SupplyRecommendation> getSupplyRecommendations() {
        return supplyRecommendations;
    }

    public void setSupplyRecommendations(List<SupplyRecommendation> supplyRecommendations) {
        this.supplyRecommendations = supplyRecommendations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSupplyRecommendationResponse listSupplyRecommendationResponse = (ListSupplyRecommendationResponse) o;
        return Objects.equals(this.supplyRecommendations, listSupplyRecommendationResponse.supplyRecommendations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplyRecommendations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSupplyRecommendationResponse {\n");
        sb.append("    supplyRecommendations: ").append(toIndentedString(supplyRecommendations)).append("\n");
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
