package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAssetReviewTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    @JacksonXmlProperty(localName = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review")

    @JacksonXmlProperty(localName = "review")

    private Review review;

    public CreateAssetReviewTaskResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 媒资ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public CreateAssetReviewTaskResponse withReview(Review review) {
        this.review = review;
        return this;
    }

    public CreateAssetReviewTaskResponse withReview(Consumer<Review> reviewSetter) {
        if (this.review == null) {
            this.review = new Review();
            reviewSetter.accept(this.review);
        }

        return this;
    }

    /**
     * Get review
     * @return review
     */
    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAssetReviewTaskResponse createAssetReviewTaskResponse = (CreateAssetReviewTaskResponse) o;
        return Objects.equals(this.assetId, createAssetReviewTaskResponse.assetId)
            && Objects.equals(this.review, createAssetReviewTaskResponse.review);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, review);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetReviewTaskResponse {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    review: ").append(toIndentedString(review)).append("\n");
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
