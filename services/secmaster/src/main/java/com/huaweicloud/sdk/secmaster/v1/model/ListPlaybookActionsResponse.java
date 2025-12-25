package com.huaweicloud.sdk.secmaster.v1.model;

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
public class ListPlaybookActionsResponse extends SdkResponse {

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
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ActionInfo> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-API-Deprecation-Info")

    private String xAPIDeprecationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-API-Deprecation-Date")

    private String xAPIDeprecationDate;

    public ListPlaybookActionsResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 错误码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListPlaybookActionsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 错误信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListPlaybookActionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
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

    public ListPlaybookActionsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 分页大小
     * minimum: 0
     * maximum: 9999
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListPlaybookActionsResponse withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 当前页数
     * minimum: 0
     * maximum: 100
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListPlaybookActionsResponse withData(List<ActionInfo> data) {
        this.data = data;
        return this;
    }

    public ListPlaybookActionsResponse addDataItem(ActionInfo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListPlaybookActionsResponse withData(Consumer<List<ActionInfo>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 剧本动作列表信息
     * @return data
     */
    public List<ActionInfo> getData() {
        return data;
    }

    public void setData(List<ActionInfo> data) {
        this.data = data;
    }

    public ListPlaybookActionsResponse withXRequestId(String xRequestId) {
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

    public ListPlaybookActionsResponse withXAPIDeprecationInfo(String xAPIDeprecationInfo) {
        this.xAPIDeprecationInfo = xAPIDeprecationInfo;
        return this;
    }

    /**
     * Get xAPIDeprecationInfo
     * @return xAPIDeprecationInfo
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-API-Deprecation-Info")
    public String getXAPIDeprecationInfo() {
        return xAPIDeprecationInfo;
    }

    public void setXAPIDeprecationInfo(String xAPIDeprecationInfo) {
        this.xAPIDeprecationInfo = xAPIDeprecationInfo;
    }

    public ListPlaybookActionsResponse withXAPIDeprecationDate(String xAPIDeprecationDate) {
        this.xAPIDeprecationDate = xAPIDeprecationDate;
        return this;
    }

    /**
     * Get xAPIDeprecationDate
     * @return xAPIDeprecationDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-API-Deprecation-Date")
    public String getXAPIDeprecationDate() {
        return xAPIDeprecationDate;
    }

    public void setXAPIDeprecationDate(String xAPIDeprecationDate) {
        this.xAPIDeprecationDate = xAPIDeprecationDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPlaybookActionsResponse that = (ListPlaybookActionsResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.message, that.message)
            && Objects.equals(this.total, that.total) && Objects.equals(this.size, that.size)
            && Objects.equals(this.page, that.page) && Objects.equals(this.data, that.data)
            && Objects.equals(this.xRequestId, that.xRequestId)
            && Objects.equals(this.xAPIDeprecationInfo, that.xAPIDeprecationInfo)
            && Objects.equals(this.xAPIDeprecationDate, that.xAPIDeprecationDate);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(code, message, total, size, page, data, xRequestId, xAPIDeprecationInfo, xAPIDeprecationDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPlaybookActionsResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    xAPIDeprecationInfo: ").append(toIndentedString(xAPIDeprecationInfo)).append("\n");
        sb.append("    xAPIDeprecationDate: ").append(toIndentedString(xAPIDeprecationDate)).append("\n");
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
