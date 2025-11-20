package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UserQuotaInfo
 */
public class UserQuotaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private ListUserQuotaDetail quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private ListUserQuotaDetail usage;

    public UserQuotaInfo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 子账户（用户）ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserQuotaInfo withQuota(ListUserQuotaDetail quota) {
        this.quota = quota;
        return this;
    }

    public UserQuotaInfo withQuota(Consumer<ListUserQuotaDetail> quotaSetter) {
        if (this.quota == null) {
            this.quota = new ListUserQuotaDetail();
            quotaSetter.accept(this.quota);
        }

        return this;
    }

    /**
     * Get quota
     * @return quota
     */
    public ListUserQuotaDetail getQuota() {
        return quota;
    }

    public void setQuota(ListUserQuotaDetail quota) {
        this.quota = quota;
    }

    public UserQuotaInfo withUsage(ListUserQuotaDetail usage) {
        this.usage = usage;
        return this;
    }

    public UserQuotaInfo withUsage(Consumer<ListUserQuotaDetail> usageSetter) {
        if (this.usage == null) {
            this.usage = new ListUserQuotaDetail();
            usageSetter.accept(this.usage);
        }

        return this;
    }

    /**
     * Get usage
     * @return usage
     */
    public ListUserQuotaDetail getUsage() {
        return usage;
    }

    public void setUsage(ListUserQuotaDetail usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserQuotaInfo that = (UserQuotaInfo) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.usage, that.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, quota, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserQuotaInfo {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
