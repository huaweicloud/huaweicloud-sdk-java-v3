package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSignatureDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_id")

    private String signatureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_name")

    private String signatureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_type")

    private String signatureType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site")

    private String site;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ListSignatureDetailsRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ListSignatureDetailsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListSignatureDetailsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListSignatureDetailsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 数量
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSignatureDetailsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSignatureDetailsRequest withSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }

    /**
     * 签名ID
     * @return signatureId
     */
    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }

    public ListSignatureDetailsRequest withSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }

    /**
     * 签名名称
     * @return signatureName
     */
    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    public ListSignatureDetailsRequest withSignatureType(String signatureType) {
        this.signatureType = signatureType;
        return this;
    }

    /**
     * 签名类型。支持枚举值： 1. VERIFY_CODE_TYPE: 验证码类 2. PROMOTION_TYPE: 推广类 3. NOTIFY_TYPE: 通知类
     * @return signatureType
     */
    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

    public ListSignatureDetailsRequest withSite(String site) {
        this.site = site;
        return this;
    }

    /**
     * 地域
     * @return site
     */
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public ListSignatureDetailsRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序方式 1. desc：降序 2. asc：升序
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListSignatureDetailsRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListSignatureDetailsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态 1. PENDING_REVIEW：待签名审核 2. PROCESSING：内容审核通过，签名处理中 3. REVIEW_PASSED：处理完毕(待补充资质)，该状态仅针对存量签名补充资质有效。在该状态下，用户可发送短信，但发送短信可能会由于运营商资质管控而失败 4. REVIEW_NOT_PASS：审核不通过 5. TO_BE_ACTIVATED：待激活 6. PENDING_ACTIVATE：激活审核中 7. PENDING_QUALIFICATION_REVIEW：待资质审核，该状态下，用户不可发送短信 8. REAL_NAME_REGISTRATING：实名报备中，该状态下，用户不可发送短信 9. REVIEW_PASSED_QUALIFICATION_PROCESSING：处理完毕(资质审核中)，该状态仅针对存量签名补充资质有效。在该状态下，用户可发送短信，但发送短信可能会由于运营商资质管控而失败 10. REVIEW_PASSED_REAL_NAME_REGISTRATING：处理完毕(实名报备中)，该状态仅针对存量签名补充资质有效。在该状态下，用户可发送短信，但发送短信可能会由于运营商资质管控而失败 11. REVIEW_PASSED_REAL_NAME_REGISTRATE_FAIL：处理完毕(实名报备失败)，该状态仅针对存量签名补充资质有效。在该状态下，用户可发送短信，但发送短信可能会由于运营商资质管控而失败 12. REVIEW_PROCESSING_COMPLETED：处理完毕
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSignatureDetailsRequest that = (ListSignatureDetailsRequest) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.signatureId, that.signatureId)
            && Objects.equals(this.signatureName, that.signatureName)
            && Objects.equals(this.signatureType, that.signatureType) && Objects.equals(this.site, that.site)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName,
            startTime,
            endTime,
            limit,
            offset,
            signatureId,
            signatureName,
            signatureType,
            site,
            sortDir,
            sortKey,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSignatureDetailsRequest {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
        sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
        sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
