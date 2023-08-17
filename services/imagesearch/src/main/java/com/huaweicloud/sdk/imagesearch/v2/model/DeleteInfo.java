package com.huaweicloud.sdk.imagesearch.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 删除结果的相关信息。
 */
public class DeleteInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private BigDecimal totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_num")

    private BigDecimal deleteNum;

    public DeleteInfo withTotalNum(BigDecimal totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 符合条件的结果总数。
     * @return totalNum
     */
    public BigDecimal getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(BigDecimal totalNum) {
        this.totalNum = totalNum;
    }

    public DeleteInfo withDeleteNum(BigDecimal deleteNum) {
        this.deleteNum = deleteNum;
        return this;
    }

    /**
     * 本次删除的结果总数，目前一次请求最多删除100条结果。
     * @return deleteNum
     */
    public BigDecimal getDeleteNum() {
        return deleteNum;
    }

    public void setDeleteNum(BigDecimal deleteNum) {
        this.deleteNum = deleteNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteInfo that = (DeleteInfo) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.deleteNum, that.deleteNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, deleteNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInfo {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    deleteNum: ").append(toIndentedString(deleteNum)).append("\n");
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
