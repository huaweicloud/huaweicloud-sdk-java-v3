package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBestPracticeAccountInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_type")

    private String accountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_start_time")

    private OffsetDateTime effectiveStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_expiration_time")

    private OffsetDateTime effectiveExpirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_time")

    private OffsetDateTime currentTime;

    public ShowBestPracticeAccountInfoResponse withAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * 账号类型
     * @return accountType
     */
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public ShowBestPracticeAccountInfoResponse withEffectiveStartTime(OffsetDateTime effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }

    /**
     * 有效开始时间
     * @return effectiveStartTime
     */
    public OffsetDateTime getEffectiveStartTime() {
        return effectiveStartTime;
    }

    public void setEffectiveStartTime(OffsetDateTime effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
    }

    public ShowBestPracticeAccountInfoResponse withEffectiveExpirationTime(OffsetDateTime effectiveExpirationTime) {
        this.effectiveExpirationTime = effectiveExpirationTime;
        return this;
    }

    /**
     * 有效过期时间
     * @return effectiveExpirationTime
     */
    public OffsetDateTime getEffectiveExpirationTime() {
        return effectiveExpirationTime;
    }

    public void setEffectiveExpirationTime(OffsetDateTime effectiveExpirationTime) {
        this.effectiveExpirationTime = effectiveExpirationTime;
    }

    public ShowBestPracticeAccountInfoResponse withCurrentTime(OffsetDateTime currentTime) {
        this.currentTime = currentTime;
        return this;
    }

    /**
     * 当前时间
     * @return currentTime
     */
    public OffsetDateTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(OffsetDateTime currentTime) {
        this.currentTime = currentTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBestPracticeAccountInfoResponse that = (ShowBestPracticeAccountInfoResponse) obj;
        return Objects.equals(this.accountType, that.accountType)
            && Objects.equals(this.effectiveStartTime, that.effectiveStartTime)
            && Objects.equals(this.effectiveExpirationTime, that.effectiveExpirationTime)
            && Objects.equals(this.currentTime, that.currentTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountType, effectiveStartTime, effectiveExpirationTime, currentTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBestPracticeAccountInfoResponse {\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    effectiveStartTime: ").append(toIndentedString(effectiveStartTime)).append("\n");
        sb.append("    effectiveExpirationTime: ").append(toIndentedString(effectiveExpirationTime)).append("\n");
        sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
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
