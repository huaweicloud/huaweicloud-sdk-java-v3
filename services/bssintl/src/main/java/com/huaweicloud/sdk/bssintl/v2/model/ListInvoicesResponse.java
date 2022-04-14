package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListInvoicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoices")

    private List<InvoiceRequestInfoIntl> invoices = null;

    public ListInvoicesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 记录数，只有成功的时候才返回这个字段
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListInvoicesResponse withInvoices(List<InvoiceRequestInfoIntl> invoices) {
        this.invoices = invoices;
        return this;
    }

    public ListInvoicesResponse addInvoicesItem(InvoiceRequestInfoIntl invoicesItem) {
        if (this.invoices == null) {
            this.invoices = new ArrayList<>();
        }
        this.invoices.add(invoicesItem);
        return this;
    }

    public ListInvoicesResponse withInvoices(Consumer<List<InvoiceRequestInfoIntl>> invoicesSetter) {
        if (this.invoices == null) {
            this.invoices = new ArrayList<>();
        }
        invoicesSetter.accept(this.invoices);
        return this;
    }

    /** 发票信息列表，参见表2。
     * 
     * @return invoices */
    public List<InvoiceRequestInfoIntl> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<InvoiceRequestInfoIntl> invoices) {
        this.invoices = invoices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInvoicesResponse listInvoicesResponse = (ListInvoicesResponse) o;
        return Objects.equals(this.count, listInvoicesResponse.count)
            && Objects.equals(this.invoices, listInvoicesResponse.invoices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, invoices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInvoicesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
