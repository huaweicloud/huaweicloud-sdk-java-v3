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
public class ListIncidentTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<DataClassTypeDetailInfo> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListIncidentTypesResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Error code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListIncidentTypesResponse withMessage(String message) {
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

    public ListIncidentTypesResponse withData(List<DataClassTypeDetailInfo> data) {
        this.data = data;
        return this;
    }

    public ListIncidentTypesResponse addDataItem(DataClassTypeDetailInfo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListIncidentTypesResponse withData(Consumer<List<DataClassTypeDetailInfo>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * Response of dataclass detail
     * @return data
     */
    public List<DataClassTypeDetailInfo> getData() {
        return data;
    }

    public void setData(List<DataClassTypeDetailInfo> data) {
        this.data = data;
    }

    public ListIncidentTypesResponse withTotal(Integer total) {
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

    public ListIncidentTypesResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * current page size
     * minimum: 0
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListIncidentTypesResponse withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * current page count
     * minimum: 0
     * maximum: 9999
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListIncidentTypesResponse withXRequestId(String xRequestId) {
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
        ListIncidentTypesResponse listIncidentTypesResponse = (ListIncidentTypesResponse) o;
        return Objects.equals(this.code, listIncidentTypesResponse.code)
            && Objects.equals(this.message, listIncidentTypesResponse.message)
            && Objects.equals(this.data, listIncidentTypesResponse.data)
            && Objects.equals(this.total, listIncidentTypesResponse.total)
            && Objects.equals(this.size, listIncidentTypesResponse.size)
            && Objects.equals(this.page, listIncidentTypesResponse.page)
            && Objects.equals(this.xRequestId, listIncidentTypesResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, data, total, size, page, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIncidentTypesResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
