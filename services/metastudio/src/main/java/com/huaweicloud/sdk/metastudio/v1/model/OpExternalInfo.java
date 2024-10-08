package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作日志附加信息
 */
public class OpExternalInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_id_list")

    private List<String> reviewIdList = null;

    public OpExternalInfo withReviewIdList(List<String> reviewIdList) {
        this.reviewIdList = reviewIdList;
        return this;
    }

    public OpExternalInfo addReviewIdListItem(String reviewIdListItem) {
        if (this.reviewIdList == null) {
            this.reviewIdList = new ArrayList<>();
        }
        this.reviewIdList.add(reviewIdListItem);
        return this;
    }

    public OpExternalInfo withReviewIdList(Consumer<List<String>> reviewIdListSetter) {
        if (this.reviewIdList == null) {
            this.reviewIdList = new ArrayList<>();
        }
        reviewIdListSetter.accept(this.reviewIdList);
        return this;
    }

    /**
     * 审核详情id列表
     * @return reviewIdList
     */
    public List<String> getReviewIdList() {
        return reviewIdList;
    }

    public void setReviewIdList(List<String> reviewIdList) {
        this.reviewIdList = reviewIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpExternalInfo that = (OpExternalInfo) obj;
        return Objects.equals(this.reviewIdList, that.reviewIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpExternalInfo {\n");
        sb.append("    reviewIdList: ").append(toIndentedString(reviewIdList)).append("\n");
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
