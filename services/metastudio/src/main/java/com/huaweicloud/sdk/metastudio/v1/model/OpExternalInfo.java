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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_failure_reason")

    private String algorithmFailureReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_audit_failure_reason")

    private String adminAuditFailureReason;

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

    public OpExternalInfo withAlgorithmFailureReason(String algorithmFailureReason) {
        this.algorithmFailureReason = algorithmFailureReason;
        return this;
    }

    /**
     * 算法侧失败原因
     * @return algorithmFailureReason
     */
    public String getAlgorithmFailureReason() {
        return algorithmFailureReason;
    }

    public void setAlgorithmFailureReason(String algorithmFailureReason) {
        this.algorithmFailureReason = algorithmFailureReason;
    }

    public OpExternalInfo withAdminAuditFailureReason(String adminAuditFailureReason) {
        this.adminAuditFailureReason = adminAuditFailureReason;
        return this;
    }

    /**
     * 管理员驳回的原因
     * @return adminAuditFailureReason
     */
    public String getAdminAuditFailureReason() {
        return adminAuditFailureReason;
    }

    public void setAdminAuditFailureReason(String adminAuditFailureReason) {
        this.adminAuditFailureReason = adminAuditFailureReason;
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
        return Objects.equals(this.reviewIdList, that.reviewIdList)
            && Objects.equals(this.algorithmFailureReason, that.algorithmFailureReason)
            && Objects.equals(this.adminAuditFailureReason, that.adminAuditFailureReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewIdList, algorithmFailureReason, adminAuditFailureReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpExternalInfo {\n");
        sb.append("    reviewIdList: ").append(toIndentedString(reviewIdList)).append("\n");
        sb.append("    algorithmFailureReason: ").append(toIndentedString(algorithmFailureReason)).append("\n");
        sb.append("    adminAuditFailureReason: ").append(toIndentedString(adminAuditFailureReason)).append("\n");
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
