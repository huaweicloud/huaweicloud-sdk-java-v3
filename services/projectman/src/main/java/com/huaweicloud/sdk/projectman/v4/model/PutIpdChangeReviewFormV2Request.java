package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class PutIpdChangeReviewFormV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_id")

    private String reviewId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ReviewUpdateBodyV2 body;

    public PutIpdChangeReviewFormV2Request withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目32位ID，项目唯一标识。通过查询IPD项目列表获取，响应消息体中的id字段的值就是项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PutIpdChangeReviewFormV2Request withReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }

    /**
     * 评审单ID，评审单唯一标识。通过查询评审单列表（BR/GR）接口获取，响应消息体中的id字段的值就是评审单ID。
     * @return reviewId
     */
    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public PutIpdChangeReviewFormV2Request withBody(ReviewUpdateBodyV2 body) {
        this.body = body;
        return this;
    }

    public PutIpdChangeReviewFormV2Request withBody(Consumer<ReviewUpdateBodyV2> bodySetter) {
        if (this.body == null) {
            this.body = new ReviewUpdateBodyV2();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ReviewUpdateBodyV2 getBody() {
        return body;
    }

    public void setBody(ReviewUpdateBodyV2 body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutIpdChangeReviewFormV2Request that = (PutIpdChangeReviewFormV2Request) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.reviewId, that.reviewId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, reviewId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutIpdChangeReviewFormV2Request {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
