package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListQuotaStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_v6")

    private String statusV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_quota")

    private Integer eipQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    public ListQuotaStatusResponse withStatusV6(String statusV6) {
        this.statusV6 = statusV6;
        return this;
    }

    /**
     * 支持IPv6弹性云服务器资源状态。 - sellout 售罄 - normal  正常商用 - abandon 下线（即不显示）
     * @return statusV6
     */
    public String getStatusV6() {
        return statusV6;
    }

    public void setStatusV6(String statusV6) {
        this.statusV6 = statusV6;
    }

    public ListQuotaStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 弹性云服务器资源状态。 - sellout 售罄 - normal  正常商用 - abandon 下线（即不显示）
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListQuotaStatusResponse withEipQuota(Integer eipQuota) {
        this.eipQuota = eipQuota;
        return this;
    }

    /**
     * 弹性配额信息，返回默认值null。
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

    public ListQuotaStatusResponse withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 剩余可创建云堡垒机配额信息，返回默认值null。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQuotaStatusResponse that = (ListQuotaStatusResponse) obj;
        return Objects.equals(this.statusV6, that.statusV6) && Objects.equals(this.status, that.status)
            && Objects.equals(this.eipQuota, that.eipQuota) && Objects.equals(this.quota, that.quota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusV6, status, eipQuota, quota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotaStatusResponse {\n");
        sb.append("    statusV6: ").append(toIndentedString(statusV6)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    eipQuota: ").append(toIndentedString(eipQuota)).append("\n");
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
