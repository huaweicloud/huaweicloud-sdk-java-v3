package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDataclassResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_details")

    private List<DataClassResponseBody> dataclassDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListDataclassResponse withDataclassDetails(List<DataClassResponseBody> dataclassDetails) {
        this.dataclassDetails = dataclassDetails;
        return this;
    }

    public ListDataclassResponse addDataclassDetailsItem(DataClassResponseBody dataclassDetailsItem) {
        if (this.dataclassDetails == null) {
            this.dataclassDetails = new ArrayList<>();
        }
        this.dataclassDetails.add(dataclassDetailsItem);
        return this;
    }

    public ListDataclassResponse withDataclassDetails(Consumer<List<DataClassResponseBody>> dataclassDetailsSetter) {
        if (this.dataclassDetails == null) {
            this.dataclassDetails = new ArrayList<>();
        }
        dataclassDetailsSetter.accept(this.dataclassDetails);
        return this;
    }

    /**
     * 数据类详情
     * @return dataclassDetails
     */
    public List<DataClassResponseBody> getDataclassDetails() {
        return dataclassDetails;
    }

    public void setDataclassDetails(List<DataClassResponseBody> dataclassDetails) {
        this.dataclassDetails = dataclassDetails;
    }

    public ListDataclassResponse withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * 数据总量
     * minimum: 2
     * maximum: 999999999
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ListDataclassResponse withXRequestId(String xRequestId) {
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
        ListDataclassResponse that = (ListDataclassResponse) obj;
        return Objects.equals(this.dataclassDetails, that.dataclassDetails) && Objects.equals(this.total, that.total)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataclassDetails, total, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataclassResponse {\n");
        sb.append("    dataclassDetails: ").append(toIndentedString(dataclassDetails)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
