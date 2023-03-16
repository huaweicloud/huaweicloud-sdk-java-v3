package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SearchQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_quota")

    private Integer eipQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_v6")

    private String statusV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public SearchQuotaResponse withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 剩余可创建云堡垒机实例个数。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public SearchQuotaResponse withEipQuota(Integer eipQuota) {
        this.eipQuota = eipQuota;
        return this;
    }

    /**
     * 弹性公网IP个数，默认值1。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return eipQuota
     */
    public Integer getEipQuota() {
        return eipQuota;
    }

    public void setEipQuota(Integer eipQuota) {
        this.eipQuota = eipQuota;
    }

    public SearchQuotaResponse withStatusV6(String statusV6) {
        this.statusV6 = statusV6;
        return this;
    }

    /**
     * IPV6状态信息，返回默认值null。
     * @return statusV6
     */
    public String getStatusV6() {
        return statusV6;
    }

    public void setStatusV6(String statusV6) {
        this.statusV6 = statusV6;
    }

    public SearchQuotaResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * IPV6状态信息，返回默认值null。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchQuotaResponse searchQuotaResponse = (SearchQuotaResponse) o;
        return Objects.equals(this.quota, searchQuotaResponse.quota)
            && Objects.equals(this.eipQuota, searchQuotaResponse.eipQuota)
            && Objects.equals(this.statusV6, searchQuotaResponse.statusV6)
            && Objects.equals(this.status, searchQuotaResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quota, eipQuota, statusV6, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchQuotaResponse {\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    eipQuota: ").append(toIndentedString(eipQuota)).append("\n");
        sb.append("    statusV6: ").append(toIndentedString(statusV6)).append("\n");
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
