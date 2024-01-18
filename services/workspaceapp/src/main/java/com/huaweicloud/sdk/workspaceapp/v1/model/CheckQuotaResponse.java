package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CheckQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enough")

    private Boolean isEnough;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_remainder")

    private List<QuotaRemainderData> quotaRemainder = null;

    public CheckQuotaResponse withIsEnough(Boolean isEnough) {
        this.isEnough = isEnough;
        return this;
    }

    /**
     * 配额是否足够true：足够 false：不足。
     * @return isEnough
     */
    public Boolean getIsEnough() {
        return isEnough;
    }

    public void setIsEnough(Boolean isEnough) {
        this.isEnough = isEnough;
    }

    public CheckQuotaResponse withQuotaRemainder(List<QuotaRemainderData> quotaRemainder) {
        this.quotaRemainder = quotaRemainder;
        return this;
    }

    public CheckQuotaResponse addQuotaRemainderItem(QuotaRemainderData quotaRemainderItem) {
        if (this.quotaRemainder == null) {
            this.quotaRemainder = new ArrayList<>();
        }
        this.quotaRemainder.add(quotaRemainderItem);
        return this;
    }

    public CheckQuotaResponse withQuotaRemainder(Consumer<List<QuotaRemainderData>> quotaRemainderSetter) {
        if (this.quotaRemainder == null) {
            this.quotaRemainder = new ArrayList<>();
        }
        quotaRemainderSetter.accept(this.quotaRemainder);
        return this;
    }

    /**
     * 配额剩余数量信息。
     * @return quotaRemainder
     */
    public List<QuotaRemainderData> getQuotaRemainder() {
        return quotaRemainder;
    }

    public void setQuotaRemainder(List<QuotaRemainderData> quotaRemainder) {
        this.quotaRemainder = quotaRemainder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckQuotaResponse that = (CheckQuotaResponse) obj;
        return Objects.equals(this.isEnough, that.isEnough) && Objects.equals(this.quotaRemainder, that.quotaRemainder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEnough, quotaRemainder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckQuotaResponse {\n");
        sb.append("    isEnough: ").append(toIndentedString(isEnough)).append("\n");
        sb.append("    quotaRemainder: ").append(toIndentedString(quotaRemainder)).append("\n");
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
