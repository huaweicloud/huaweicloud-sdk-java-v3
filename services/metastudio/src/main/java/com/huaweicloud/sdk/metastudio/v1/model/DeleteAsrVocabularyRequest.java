package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAsrVocabularyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")

    private String xAppUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asr_vocabulary_id")

    private String asrVocabularyId;

    public DeleteAsrVocabularyRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public DeleteAsrVocabularyRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public DeleteAsrVocabularyRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带项目ID信息。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public DeleteAsrVocabularyRequest withXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
        return this;
    }

    /**
     * 第三方用户ID。不允许输入中文。
     * @return xAppUserId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")
    public String getXAppUserId() {
        return xAppUserId;
    }

    public void setXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
    }

    public DeleteAsrVocabularyRequest withAsrVocabularyId(String asrVocabularyId) {
        this.asrVocabularyId = asrVocabularyId;
        return this;
    }

    /**
     * 热词表ID。
     * @return asrVocabularyId
     */
    public String getAsrVocabularyId() {
        return asrVocabularyId;
    }

    public void setAsrVocabularyId(String asrVocabularyId) {
        this.asrVocabularyId = asrVocabularyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAsrVocabularyRequest that = (DeleteAsrVocabularyRequest) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.xSdkDate, that.xSdkDate)
            && Objects.equals(this.xProjectId, that.xProjectId) && Objects.equals(this.xAppUserId, that.xAppUserId)
            && Objects.equals(this.asrVocabularyId, that.asrVocabularyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, xProjectId, xAppUserId, asrVocabularyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAsrVocabularyRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    xAppUserId: ").append(toIndentedString(xAppUserId)).append("\n");
        sb.append("    asrVocabularyId: ").append(toIndentedString(asrVocabularyId)).append("\n");
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
