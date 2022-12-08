package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListQuotaStateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private String quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_v6")

    private String statusV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_quota")

    private String eipQuota;

    public ListQuotaStateResponse withQuota(String quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 配额
     * @return quota
     */
    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public ListQuotaStateResponse withStatusV6(String statusV6) {
        this.statusV6 = statusV6;
        return this;
    }

    /**
     * 支持IPv6 ECS资源信息
     * @return statusV6
     */
    public String getStatusV6() {
        return statusV6;
    }

    public void setStatusV6(String statusV6) {
        this.statusV6 = statusV6;
    }

    public ListQuotaStateResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * ECS资源状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListQuotaStateResponse withEipQuota(String eipQuota) {
        this.eipQuota = eipQuota;
        return this;
    }

    /**
     * EIP配额信息
     * @return eipQuota
     */
    public String getEipQuota() {
        return eipQuota;
    }

    public void setEipQuota(String eipQuota) {
        this.eipQuota = eipQuota;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQuotaStateResponse listQuotaStateResponse = (ListQuotaStateResponse) o;
        return Objects.equals(this.quota, listQuotaStateResponse.quota)
            && Objects.equals(this.statusV6, listQuotaStateResponse.statusV6)
            && Objects.equals(this.status, listQuotaStateResponse.status)
            && Objects.equals(this.eipQuota, listQuotaStateResponse.eipQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quota, statusV6, status, eipQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotaStateResponse {\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    statusV6: ").append(toIndentedString(statusV6)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    eipQuota: ").append(toIndentedString(eipQuota)).append("\n");
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
