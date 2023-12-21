package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_used")

    private Integer quotaUsed;

    public ShowQuotaResponse withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 云堡垒机实例最大创建数量。
     * minimum: 0
     * maximum: 64
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public ShowQuotaResponse withQuotaUsed(Integer quotaUsed) {
        this.quotaUsed = quotaUsed;
        return this;
    }

    /**
     * 当前云堡垒机实例创建个数。
     * minimum: 0
     * maximum: 64
     * @return quotaUsed
     */
    public Integer getQuotaUsed() {
        return quotaUsed;
    }

    public void setQuotaUsed(Integer quotaUsed) {
        this.quotaUsed = quotaUsed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQuotaResponse that = (ShowQuotaResponse) obj;
        return Objects.equals(this.quota, that.quota) && Objects.equals(this.quotaUsed, that.quotaUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quota, quotaUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotaResponse {\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    quotaUsed: ").append(toIndentedString(quotaUsed)).append("\n");
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
