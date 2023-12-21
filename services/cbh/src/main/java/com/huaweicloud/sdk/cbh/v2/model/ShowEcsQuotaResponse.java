package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowEcsQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_v6")

    private String statusV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowEcsQuotaResponse withStatusV6(String statusV6) {
        this.statusV6 = statusV6;
        return this;
    }

    /**
     * 支持IPv6云堡垒机实例规格资源状态。 - sellout：售罄 - normal：正常商用
     * @return statusV6
     */
    public String getStatusV6() {
        return statusV6;
    }

    public void setStatusV6(String statusV6) {
        this.statusV6 = statusV6;
    }

    public ShowEcsQuotaResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 云堡垒机实例规格资源状态。 - sellout：售罄 - normal：正常商用
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEcsQuotaResponse that = (ShowEcsQuotaResponse) obj;
        return Objects.equals(this.statusV6, that.statusV6) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusV6, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEcsQuotaResponse {\n");
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
