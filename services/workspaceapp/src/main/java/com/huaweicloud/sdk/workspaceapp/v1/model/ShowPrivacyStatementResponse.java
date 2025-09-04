package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPrivacyStatementResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time")

    private OffsetDateTime publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signed_history_record")

    private Boolean signedHistoryRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signed_newest_record")

    private Boolean signedNewestRecord;

    public ShowPrivacyStatementResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 隐私声明版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowPrivacyStatementResponse withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 隐私声明内容。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ShowPrivacyStatementResponse withPublishTime(OffsetDateTime publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * 隐私声明发布时间。
     * @return publishTime
     */
    public OffsetDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(OffsetDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public ShowPrivacyStatementResponse withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 隐私声明对应的语言。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ShowPrivacyStatementResponse withSignedHistoryRecord(Boolean signedHistoryRecord) {
        this.signedHistoryRecord = signedHistoryRecord;
        return this;
    }

    /**
     * 是否签署过历史隐私声明，非第一次签署，提示用户旧版过期需重新签署。
     * @return signedHistoryRecord
     */
    public Boolean getSignedHistoryRecord() {
        return signedHistoryRecord;
    }

    public void setSignedHistoryRecord(Boolean signedHistoryRecord) {
        this.signedHistoryRecord = signedHistoryRecord;
    }

    public ShowPrivacyStatementResponse withSignedNewestRecord(Boolean signedNewestRecord) {
        this.signedNewestRecord = signedNewestRecord;
        return this;
    }

    /**
     * 是否签署过当前最新的隐私申明 没有签署需需要提醒用户重新签署。
     * @return signedNewestRecord
     */
    public Boolean getSignedNewestRecord() {
        return signedNewestRecord;
    }

    public void setSignedNewestRecord(Boolean signedNewestRecord) {
        this.signedNewestRecord = signedNewestRecord;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPrivacyStatementResponse that = (ShowPrivacyStatementResponse) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.content, that.content)
            && Objects.equals(this.publishTime, that.publishTime) && Objects.equals(this.language, that.language)
            && Objects.equals(this.signedHistoryRecord, that.signedHistoryRecord)
            && Objects.equals(this.signedNewestRecord, that.signedNewestRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, content, publishTime, language, signedHistoryRecord, signedNewestRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPrivacyStatementResponse {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    signedHistoryRecord: ").append(toIndentedString(signedHistoryRecord)).append("\n");
        sb.append("    signedNewestRecord: ").append(toIndentedString(signedNewestRecord)).append("\n");
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
