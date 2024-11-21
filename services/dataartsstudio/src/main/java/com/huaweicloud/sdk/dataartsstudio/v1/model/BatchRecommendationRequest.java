package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchRecommendationRequest
 */
public class BatchRecommendationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommendations")

    private List<Recommendation> recommendations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guids")

    private List<String> guids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_type")

    private String addType;

    public BatchRecommendationRequest withRecommendations(List<Recommendation> recommendations) {
        this.recommendations = recommendations;
        return this;
    }

    public BatchRecommendationRequest addRecommendationsItem(Recommendation recommendationsItem) {
        if (this.recommendations == null) {
            this.recommendations = new ArrayList<>();
        }
        this.recommendations.add(recommendationsItem);
        return this;
    }

    public BatchRecommendationRequest withRecommendations(Consumer<List<Recommendation>> recommendationsSetter) {
        if (this.recommendations == null) {
            this.recommendations = new ArrayList<>();
        }
        recommendationsSetter.accept(this.recommendations);
        return this;
    }

    /**
     * 标签信息。
     * @return recommendations
     */
    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Recommendation> recommendations) {
        this.recommendations = recommendations;
    }

    public BatchRecommendationRequest withGuids(List<String> guids) {
        this.guids = guids;
        return this;
    }

    public BatchRecommendationRequest addGuidsItem(String guidsItem) {
        if (this.guids == null) {
            this.guids = new ArrayList<>();
        }
        this.guids.add(guidsItem);
        return this;
    }

    public BatchRecommendationRequest withGuids(Consumer<List<String>> guidsSetter) {
        if (this.guids == null) {
            this.guids = new ArrayList<>();
        }
        guidsSetter.accept(this.guids);
        return this;
    }

    /**
     * 资产guid。
     * @return guids
     */
    public List<String> getGuids() {
        return guids;
    }

    public void setGuids(List<String> guids) {
        this.guids = guids;
    }

    public BatchRecommendationRequest withAddType(String addType) {
        this.addType = addType;
        return this;
    }

    /**
     * 添加资产类型。cover：覆盖  追加：append。默认追加。
     * @return addType
     */
    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRecommendationRequest that = (BatchRecommendationRequest) obj;
        return Objects.equals(this.recommendations, that.recommendations) && Objects.equals(this.guids, that.guids)
            && Objects.equals(this.addType, that.addType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendations, guids, addType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRecommendationRequest {\n");
        sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
        sb.append("    guids: ").append(toIndentedString(guids)).append("\n");
        sb.append("    addType: ").append(toIndentedString(addType)).append("\n");
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
