package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BankReceiptResult
 */
public class BankReceiptResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bank_receipt_count")

    private Integer bankReceiptCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bank_receipt_list")

    private List<BankReceiptDict> bankReceiptList = null;

    public BankReceiptResult withBankReceiptCount(Integer bankReceiptCount) {
        this.bankReceiptCount = bankReceiptCount;
        return this;
    }

    /**
     * 银行回单数量 
     * @return bankReceiptCount
     */
    public Integer getBankReceiptCount() {
        return bankReceiptCount;
    }

    public void setBankReceiptCount(Integer bankReceiptCount) {
        this.bankReceiptCount = bankReceiptCount;
    }

    public BankReceiptResult withBankReceiptList(List<BankReceiptDict> bankReceiptList) {
        this.bankReceiptList = bankReceiptList;
        return this;
    }

    public BankReceiptResult addBankReceiptListItem(BankReceiptDict bankReceiptListItem) {
        if (this.bankReceiptList == null) {
            this.bankReceiptList = new ArrayList<>();
        }
        this.bankReceiptList.add(bankReceiptListItem);
        return this;
    }

    public BankReceiptResult withBankReceiptList(Consumer<List<BankReceiptDict>> bankReceiptListSetter) {
        if (this.bankReceiptList == null) {
            this.bankReceiptList = new ArrayList<>();
        }
        bankReceiptListSetter.accept(this.bankReceiptList);
        return this;
    }

    /**
     * 银行回单键值对提取结果。 
     * @return bankReceiptList
     */
    public List<BankReceiptDict> getBankReceiptList() {
        return bankReceiptList;
    }

    public void setBankReceiptList(List<BankReceiptDict> bankReceiptList) {
        this.bankReceiptList = bankReceiptList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BankReceiptResult that = (BankReceiptResult) obj;
        return Objects.equals(this.bankReceiptCount, that.bankReceiptCount)
            && Objects.equals(this.bankReceiptList, that.bankReceiptList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankReceiptCount, bankReceiptList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BankReceiptResult {\n");
        sb.append("    bankReceiptCount: ").append(toIndentedString(bankReceiptCount)).append("\n");
        sb.append("    bankReceiptList: ").append(toIndentedString(bankReceiptList)).append("\n");
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
