package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BankReceiptDict
 */
public class BankReceiptDict {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_pair_count")

    private Integer kvPairCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bank_receipt_location")

    private List<List<Integer>> bankReceiptLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_pair_list")

    private List<BankReceiptKvPair> kvPairList = null;

    public BankReceiptDict withKvPairCount(Integer kvPairCount) {
        this.kvPairCount = kvPairCount;
        return this;
    }

    /**
     * 键值对数量 
     * @return kvPairCount
     */
    public Integer getKvPairCount() {
        return kvPairCount;
    }

    public void setKvPairCount(Integer kvPairCount) {
        this.kvPairCount = kvPairCount;
    }

    public BankReceiptDict withBankReceiptLocation(List<List<Integer>> bankReceiptLocation) {
        this.bankReceiptLocation = bankReceiptLocation;
        return this;
    }

    public BankReceiptDict addBankReceiptLocationItem(List<Integer> bankReceiptLocationItem) {
        if (this.bankReceiptLocation == null) {
            this.bankReceiptLocation = new ArrayList<>();
        }
        this.bankReceiptLocation.add(bankReceiptLocationItem);
        return this;
    }

    public BankReceiptDict withBankReceiptLocation(Consumer<List<List<Integer>>> bankReceiptLocationSetter) {
        if (this.bankReceiptLocation == null) {
            this.bankReceiptLocation = new ArrayList<>();
        }
        bankReceiptLocationSetter.accept(this.bankReceiptLocation);
        return this;
    }

    /**
     * 银行回单的区域位置信息，列表形式，包含文字区域四个顶点的二维坐标（x,y）;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return bankReceiptLocation
     */
    public List<List<Integer>> getBankReceiptLocation() {
        return bankReceiptLocation;
    }

    public void setBankReceiptLocation(List<List<Integer>> bankReceiptLocation) {
        this.bankReceiptLocation = bankReceiptLocation;
    }

    public BankReceiptDict withKvPairList(List<BankReceiptKvPair> kvPairList) {
        this.kvPairList = kvPairList;
        return this;
    }

    public BankReceiptDict addKvPairListItem(BankReceiptKvPair kvPairListItem) {
        if (this.kvPairList == null) {
            this.kvPairList = new ArrayList<>();
        }
        this.kvPairList.add(kvPairListItem);
        return this;
    }

    public BankReceiptDict withKvPairList(Consumer<List<BankReceiptKvPair>> kvPairListSetter) {
        if (this.kvPairList == null) {
            this.kvPairList = new ArrayList<>();
        }
        kvPairListSetter.accept(this.kvPairList);
        return this;
    }

    /**
     * 键值对识别结果列表。 
     * @return kvPairList
     */
    public List<BankReceiptKvPair> getKvPairList() {
        return kvPairList;
    }

    public void setKvPairList(List<BankReceiptKvPair> kvPairList) {
        this.kvPairList = kvPairList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BankReceiptDict that = (BankReceiptDict) obj;
        return Objects.equals(this.kvPairCount, that.kvPairCount)
            && Objects.equals(this.bankReceiptLocation, that.bankReceiptLocation)
            && Objects.equals(this.kvPairList, that.kvPairList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kvPairCount, bankReceiptLocation, kvPairList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BankReceiptDict {\n");
        sb.append("    kvPairCount: ").append(toIndentedString(kvPairCount)).append("\n");
        sb.append("    bankReceiptLocation: ").append(toIndentedString(bankReceiptLocation)).append("\n");
        sb.append("    kvPairList: ").append(toIndentedString(kvPairList)).append("\n");
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
