package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTagQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_quota")

    private Integer totalQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_quota")

    private Integer availableQuota;

    public ShowTagQuotaResponse withTotalQuota(Integer totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }

    /**
     * 总配额大小
     * @return totalQuota
     */
    public Integer getTotalQuota() {
        return totalQuota;
    }

    public void setTotalQuota(Integer totalQuota) {
        this.totalQuota = totalQuota;
    }

    public ShowTagQuotaResponse withAvailableQuota(Integer availableQuota) {
        this.availableQuota = availableQuota;
        return this;
    }

    /**
     * 可使用配额大小
     * @return availableQuota
     */
    public Integer getAvailableQuota() {
        return availableQuota;
    }

    public void setAvailableQuota(Integer availableQuota) {
        this.availableQuota = availableQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTagQuotaResponse that = (ShowTagQuotaResponse) obj;
        return Objects.equals(this.totalQuota, that.totalQuota)
            && Objects.equals(this.availableQuota, that.availableQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalQuota, availableQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTagQuotaResponse {\n");
        sb.append("    totalQuota: ").append(toIndentedString(totalQuota)).append("\n");
        sb.append("    availableQuota: ").append(toIndentedString(availableQuota)).append("\n");
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
