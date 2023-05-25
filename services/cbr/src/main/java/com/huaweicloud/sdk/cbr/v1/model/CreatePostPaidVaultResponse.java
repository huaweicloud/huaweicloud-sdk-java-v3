package com.huaweicloud.sdk.cbr.v1.model;

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
public class CreatePostPaidVaultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orders")

    private List<CbcOrderResult> orders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retCode")

    private Integer retCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errText")

    private String errText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public CreatePostPaidVaultResponse withOrders(List<CbcOrderResult> orders) {
        this.orders = orders;
        return this;
    }

    public CreatePostPaidVaultResponse addOrdersItem(CbcOrderResult ordersItem) {
        if (this.orders == null) {
            this.orders = new ArrayList<>();
        }
        this.orders.add(ordersItem);
        return this;
    }

    public CreatePostPaidVaultResponse withOrders(Consumer<List<CbcOrderResult>> ordersSetter) {
        if (this.orders == null) {
            this.orders = new ArrayList<>();
        }
        ordersSetter.accept(this.orders);
        return this;
    }

    /**
     * 订单详情
     * @return orders
     */
    public List<CbcOrderResult> getOrders() {
        return orders;
    }

    public void setOrders(List<CbcOrderResult> orders) {
        this.orders = orders;
    }

    public CreatePostPaidVaultResponse withRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }

    /**
     * 创建结果代码 0：成功
     * @return retCode
     */
    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public CreatePostPaidVaultResponse withErrText(String errText) {
        this.errText = errText;
        return this;
    }

    /**
     * 创建结果信息
     * @return errText
     */
    public String getErrText() {
        return errText;
    }

    public void setErrText(String errText) {
        this.errText = errText;
    }

    public CreatePostPaidVaultResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 操作错误码 0：无错误
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePostPaidVaultResponse createPostPaidVaultResponse = (CreatePostPaidVaultResponse) o;
        return Objects.equals(this.orders, createPostPaidVaultResponse.orders)
            && Objects.equals(this.retCode, createPostPaidVaultResponse.retCode)
            && Objects.equals(this.errText, createPostPaidVaultResponse.errText)
            && Objects.equals(this.errorCode, createPostPaidVaultResponse.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders, retCode, errText, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePostPaidVaultResponse {\n");
        sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
        sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
        sb.append("    errText: ").append(toIndentedString(errText)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
