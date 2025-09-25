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
public class CreateVaultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault")

    private VaultCreateResource vault;

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

    public CreateVaultResponse withVault(VaultCreateResource vault) {
        this.vault = vault;
        return this;
    }

    public CreateVaultResponse withVault(Consumer<VaultCreateResource> vaultSetter) {
        if (this.vault == null) {
            this.vault = new VaultCreateResource();
            vaultSetter.accept(this.vault);
        }

        return this;
    }

    /**
     * Get vault
     * @return vault
     */
    public VaultCreateResource getVault() {
        return vault;
    }

    public void setVault(VaultCreateResource vault) {
        this.vault = vault;
    }

    public CreateVaultResponse withOrders(List<CbcOrderResult> orders) {
        this.orders = orders;
        return this;
    }

    public CreateVaultResponse addOrdersItem(CbcOrderResult ordersItem) {
        if (this.orders == null) {
            this.orders = new ArrayList<>();
        }
        this.orders.add(ordersItem);
        return this;
    }

    public CreateVaultResponse withOrders(Consumer<List<CbcOrderResult>> ordersSetter) {
        if (this.orders == null) {
            this.orders = new ArrayList<>();
        }
        ordersSetter.accept(this.orders);
        return this;
    }

    /**
     * 包周期创建订单信息（仅包周期创建时显示）
     * @return orders
     */
    public List<CbcOrderResult> getOrders() {
        return orders;
    }

    public void setOrders(List<CbcOrderResult> orders) {
        this.orders = orders;
    }

    public CreateVaultResponse withRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }

    /**
     * 包周期订购结果（仅包周期创建时显示）
     * @return retCode
     */
    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public CreateVaultResponse withErrText(String errText) {
        this.errText = errText;
        return this;
    }

    /**
     * 包周期创建错误信息（仅包周期创建时显示）
     * @return errText
     */
    public String getErrText() {
        return errText;
    }

    public void setErrText(String errText) {
        this.errText = errText;
    }

    public CreateVaultResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 包周期创建错误码（仅包周期创建时显示）
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVaultResponse that = (CreateVaultResponse) obj;
        return Objects.equals(this.vault, that.vault) && Objects.equals(this.orders, that.orders)
            && Objects.equals(this.retCode, that.retCode) && Objects.equals(this.errText, that.errText)
            && Objects.equals(this.errorCode, that.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vault, orders, retCode, errText, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVaultResponse {\n");
        sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
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
