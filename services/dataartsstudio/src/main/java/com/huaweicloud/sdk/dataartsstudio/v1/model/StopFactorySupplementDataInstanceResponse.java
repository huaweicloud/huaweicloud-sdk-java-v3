package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class StopFactorySupplementDataInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private List<SupplementDataRespRows> rows = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public StopFactorySupplementDataInstanceResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * success
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public StopFactorySupplementDataInstanceResponse withRows(List<SupplementDataRespRows> rows) {
        this.rows = rows;
        return this;
    }

    public StopFactorySupplementDataInstanceResponse addRowsItem(SupplementDataRespRows rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    public StopFactorySupplementDataInstanceResponse withRows(Consumer<List<SupplementDataRespRows>> rowsSetter) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        rowsSetter.accept(this.rows);
        return this;
    }

    /**
     * 包含若干补数据实例信息
     * @return rows
     */
    public List<SupplementDataRespRows> getRows() {
        return rows;
    }

    public void setRows(List<SupplementDataRespRows> rows) {
        this.rows = rows;
    }

    public StopFactorySupplementDataInstanceResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 查询是否成功，取值为true或者false
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public StopFactorySupplementDataInstanceResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 补数据实例数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public StopFactorySupplementDataInstanceResponse withXRequestId(String xRequestId) {
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
        StopFactorySupplementDataInstanceResponse that = (StopFactorySupplementDataInstanceResponse) obj;
        return Objects.equals(this.msg, that.msg) && Objects.equals(this.rows, that.rows)
            && Objects.equals(this.success, that.success) && Objects.equals(this.total, that.total)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg, rows, success, total, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopFactorySupplementDataInstanceResponse {\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
