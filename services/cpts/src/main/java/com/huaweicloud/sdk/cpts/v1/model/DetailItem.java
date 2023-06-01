package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DetailItem
 */
public class DetailItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseAwId")

    private String caseAwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datumType")

    private Integer datumType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transactionId")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "awList")

    private List<DetailItem> awList = null;

    public DetailItem withCaseAwId(String caseAwId) {
        this.caseAwId = caseAwId;
        return this;
    }

    /**
     * 数据库中dc_case_aw表中的主键ID
     * @return caseAwId
     */
    public String getCaseAwId() {
        return caseAwId;
    }

    public void setCaseAwId(String caseAwId) {
        this.caseAwId = caseAwId;
    }

    public DetailItem withDatumType(Integer datumType) {
        this.datumType = datumType;
        return this;
    }

    /**
     * 数据类型（用例/aw/事务）
     * @return datumType
     */
    public Integer getDatumType() {
        return datumType;
    }

    public void setDatumType(Integer datumType) {
        this.datumType = datumType;
    }

    public DetailItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用例/aw/事务名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DetailItem withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 事务ID
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public DetailItem withAwList(List<DetailItem> awList) {
        this.awList = awList;
        return this;
    }

    public DetailItem addAwListItem(DetailItem awListItem) {
        if (this.awList == null) {
            this.awList = new ArrayList<>();
        }
        this.awList.add(awListItem);
        return this;
    }

    public DetailItem withAwList(Consumer<List<DetailItem>> awListSetter) {
        if (this.awList == null) {
            this.awList = new ArrayList<>();
        }
        awListSetter.accept(this.awList);
        return this;
    }

    /**
     * aw列表
     * @return awList
     */
    public List<DetailItem> getAwList() {
        return awList;
    }

    public void setAwList(List<DetailItem> awList) {
        this.awList = awList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetailItem detailItem = (DetailItem) o;
        return Objects.equals(this.caseAwId, detailItem.caseAwId)
            && Objects.equals(this.datumType, detailItem.datumType) && Objects.equals(this.name, detailItem.name)
            && Objects.equals(this.transactionId, detailItem.transactionId)
            && Objects.equals(this.awList, detailItem.awList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseAwId, datumType, name, transactionId, awList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetailItem {\n");
        sb.append("    caseAwId: ").append(toIndentedString(caseAwId)).append("\n");
        sb.append("    datumType: ").append(toIndentedString(datumType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    awList: ").append(toIndentedString(awList)).append("\n");
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
