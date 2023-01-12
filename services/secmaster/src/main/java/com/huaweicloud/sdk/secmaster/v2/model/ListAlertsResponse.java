package com.huaweicloud.sdk.secmaster.v2.model;

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
public class ListAlertsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ListAlertDetail> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListAlertsResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Id value
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListAlertsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Error message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListAlertsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * tatal count
     * minimum: 0
     * maximum: 99999
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListAlertsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 当前页大小
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAlertsResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 当前页码
     * minimum: 0
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAlertsResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * success
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ListAlertsResponse withData(List<ListAlertDetail> data) {
        this.data = data;
        return this;
    }

    public ListAlertsResponse addDataItem(ListAlertDetail dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListAlertsResponse withData(Consumer<List<ListAlertDetail>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 告警列表
     * @return data
     */
    public List<ListAlertDetail> getData() {
        return data;
    }

    public void setData(List<ListAlertDetail> data) {
        this.data = data;
    }

    public ListAlertsResponse withXRequestId(String xRequestId) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlertsResponse listAlertsResponse = (ListAlertsResponse) o;
        return Objects.equals(this.code, listAlertsResponse.code)
            && Objects.equals(this.message, listAlertsResponse.message)
            && Objects.equals(this.total, listAlertsResponse.total)
            && Objects.equals(this.limit, listAlertsResponse.limit)
            && Objects.equals(this.offset, listAlertsResponse.offset)
            && Objects.equals(this.success, listAlertsResponse.success)
            && Objects.equals(this.data, listAlertsResponse.data)
            && Objects.equals(this.xRequestId, listAlertsResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, total, limit, offset, success, data, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertsResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
