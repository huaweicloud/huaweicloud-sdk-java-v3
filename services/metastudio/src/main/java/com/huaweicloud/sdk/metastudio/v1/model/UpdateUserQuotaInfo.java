package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateUserQuotaInfo
 */
public class UpdateUserQuotaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private UserQuotaDetail quota;

    public UpdateUserQuotaInfo withQuota(UserQuotaDetail quota) {
        this.quota = quota;
        return this;
    }

    public UpdateUserQuotaInfo withQuota(Consumer<UserQuotaDetail> quotaSetter) {
        if (this.quota == null) {
            this.quota = new UserQuotaDetail();
            quotaSetter.accept(this.quota);
        }

        return this;
    }

    /**
     * Get quota
     * @return quota
     */
    public UserQuotaDetail getQuota() {
        return quota;
    }

    public void setQuota(UserQuotaDetail quota) {
        this.quota = quota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateUserQuotaInfo that = (UpdateUserQuotaInfo) obj;
        return Objects.equals(this.quota, that.quota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserQuotaInfo {\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
