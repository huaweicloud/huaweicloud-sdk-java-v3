package com.huaweicloud.sdk.secmaster.v2.model;

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
public class ListDataclassFieldsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_details")

    private List<FieldResponseBody> fieldDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListDataclassFieldsResponse withFieldDetails(List<FieldResponseBody> fieldDetails) {
        this.fieldDetails = fieldDetails;
        return this;
    }

    public ListDataclassFieldsResponse addFieldDetailsItem(FieldResponseBody fieldDetailsItem) {
        if (this.fieldDetails == null) {
            this.fieldDetails = new ArrayList<>();
        }
        this.fieldDetails.add(fieldDetailsItem);
        return this;
    }

    public ListDataclassFieldsResponse withFieldDetails(Consumer<List<FieldResponseBody>> fieldDetailsSetter) {
        if (this.fieldDetails == null) {
            this.fieldDetails = new ArrayList<>();
        }
        fieldDetailsSetter.accept(this.fieldDetails);
        return this;
    }

    /**
     * list of informations of field
     * @return fieldDetails
     */
    public List<FieldResponseBody> getFieldDetails() {
        return fieldDetails;
    }

    public void setFieldDetails(List<FieldResponseBody> fieldDetails) {
        this.fieldDetails = fieldDetails;
    }

    public ListDataclassFieldsResponse withTotal(BigDecimal total) {
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

    public ListDataclassFieldsResponse withXRequestId(String xRequestId) {
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
        ListDataclassFieldsResponse that = (ListDataclassFieldsResponse) obj;
        return Objects.equals(this.fieldDetails, that.fieldDetails) && Objects.equals(this.total, that.total)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldDetails, total, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataclassFieldsResponse {\n");
        sb.append("    fieldDetails: ").append(toIndentedString(fieldDetails)).append("\n");
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
