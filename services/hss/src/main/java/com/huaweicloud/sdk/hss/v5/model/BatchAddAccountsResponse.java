package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class BatchAddAccountsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_legal_count")

    private Boolean isAllLegalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public BatchAddAccountsResponse withIsAllLegalCount(Boolean isAllLegalCount) {
        this.isAllLegalCount = isAllLegalCount;
        return this;
    }

    /**
     * 批量添加账号结果   - true ：成功   - false ：失败
     * @return isAllLegalCount
     */
    public Boolean getIsAllLegalCount() {
        return isAllLegalCount;
    }

    public void setIsAllLegalCount(Boolean isAllLegalCount) {
        this.isAllLegalCount = isAllLegalCount;
    }

    public BatchAddAccountsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAddAccountsResponse that = (BatchAddAccountsResponse) obj;
        return Objects.equals(this.isAllLegalCount, that.isAllLegalCount)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAllLegalCount, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddAccountsResponse {\n");
        sb.append("    isAllLegalCount: ").append(toIndentedString(isAllLegalCount)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
