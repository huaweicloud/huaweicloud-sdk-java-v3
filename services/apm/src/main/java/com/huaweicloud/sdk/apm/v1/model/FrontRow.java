package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据行
 */
public class FrontRow {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cell_list")

    private List<FrontCell> cellList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header")

    private Boolean header;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tx_id")

    private Long txId;

    public FrontRow withCellList(List<FrontCell> cellList) {
        this.cellList = cellList;
        return this;
    }

    public FrontRow addCellListItem(FrontCell cellListItem) {
        if (this.cellList == null) {
            this.cellList = new ArrayList<>();
        }
        this.cellList.add(cellListItem);
        return this;
    }

    public FrontRow withCellList(Consumer<List<FrontCell>> cellListSetter) {
        if (this.cellList == null) {
            this.cellList = new ArrayList<>();
        }
        cellListSetter.accept(this.cellList);
        return this;
    }

    /**
     * 数据单元集合
     * @return cellList
     */
    public List<FrontCell> getCellList() {
        return cellList;
    }

    public void setCellList(List<FrontCell> cellList) {
        this.cellList = cellList;
    }

    public FrontRow withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 将group by的字段拼接成过滤字符串，用于后续点网格点击使用
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public FrontRow withHeader(Boolean header) {
        this.header = header;
        return this;
    }

    /**
     * 是否是header信息
     * @return header
     */
    public Boolean getHeader() {
        return header;
    }

    public void setHeader(Boolean header) {
        this.header = header;
    }

    public FrontRow withTxId(Long txId) {
        this.txId = txId;
        return this;
    }

    /**
     * 是否是事务
     * @return txId
     */
    public Long getTxId() {
        return txId;
    }

    public void setTxId(Long txId) {
        this.txId = txId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FrontRow frontRow = (FrontRow) o;
        return Objects.equals(this.cellList, frontRow.cellList) && Objects.equals(this.filter, frontRow.filter)
            && Objects.equals(this.header, frontRow.header) && Objects.equals(this.txId, frontRow.txId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cellList, filter, header, txId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrontRow {\n");
        sb.append("    cellList: ").append(toIndentedString(cellList)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
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
