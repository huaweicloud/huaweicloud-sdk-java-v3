package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReviewOpinionEntity
 */
public class ReviewOpinionEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "co_id")

    private String coId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private UserEntity createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curr_owner")

    private UserEntity currOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_comments")

    private String reviewComments;

    public ReviewOpinionEntity withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 评审意见对象类型，固定为Opinion。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ReviewOpinionEntity withCoId(String coId) {
        this.coId = coId;
        return this;
    }

    /**
     * 评审意见对象关联的变更对象ID。
     * @return coId
     */
    public String getCoId() {
        return coId;
    }

    public void setCoId(String coId) {
        this.coId = coId;
    }

    public ReviewOpinionEntity withCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ReviewOpinionEntity withCreatedBy(Consumer<UserEntity> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new UserEntity();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public ReviewOpinionEntity withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 评审意见创建时间。
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public ReviewOpinionEntity withCurrOwner(UserEntity currOwner) {
        this.currOwner = currOwner;
        return this;
    }

    public ReviewOpinionEntity withCurrOwner(Consumer<UserEntity> currOwnerSetter) {
        if (this.currOwner == null) {
            this.currOwner = new UserEntity();
            currOwnerSetter.accept(this.currOwner);
        }

        return this;
    }

    /**
     * Get currOwner
     * @return currOwner
     */
    public UserEntity getCurrOwner() {
        return currOwner;
    }

    public void setCurrOwner(UserEntity currOwner) {
        this.currOwner = currOwner;
    }

    public ReviewOpinionEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 评审意见对象ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReviewOpinionEntity withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 评审意见最后修改时间。
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public ReviewOpinionEntity withReviewComments(String reviewComments) {
        this.reviewComments = reviewComments;
        return this;
    }

    /**
     * 评审意见。
     * @return reviewComments
     */
    public String getReviewComments() {
        return reviewComments;
    }

    public void setReviewComments(String reviewComments) {
        this.reviewComments = reviewComments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReviewOpinionEntity that = (ReviewOpinionEntity) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.coId, that.coId)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.currOwner, that.currOwner) && Objects.equals(this.id, that.id)
            && Objects.equals(this.modifiedDate, that.modifiedDate)
            && Objects.equals(this.reviewComments, that.reviewComments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, coId, createdBy, createdDate, currOwner, id, modifiedDate, reviewComments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewOpinionEntity {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    coId: ").append(toIndentedString(coId)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    currOwner: ").append(toIndentedString(currOwner)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    reviewComments: ").append(toIndentedString(reviewComments)).append("\n");
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
