package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SQLStatisticsBean
 */
public class SQLStatisticsBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_num")

    private Long deleteNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_num")

    private Long insertNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_num")

    private Long otherNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_num")

    private Long selectNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_num")

    private Long updateNum;

    public SQLStatisticsBean withDeleteNum(Long deleteNum) {
        this.deleteNum = deleteNum;
        return this;
    }

    /**
     * 删除数量
     * @return deleteNum
     */
    public Long getDeleteNum() {
        return deleteNum;
    }

    public void setDeleteNum(Long deleteNum) {
        this.deleteNum = deleteNum;
    }

    public SQLStatisticsBean withInsertNum(Long insertNum) {
        this.insertNum = insertNum;
        return this;
    }

    /**
     * 插入数量
     * @return insertNum
     */
    public Long getInsertNum() {
        return insertNum;
    }

    public void setInsertNum(Long insertNum) {
        this.insertNum = insertNum;
    }

    public SQLStatisticsBean withOtherNum(Long otherNum) {
        this.otherNum = otherNum;
        return this;
    }

    /**
     * 其他数量
     * @return otherNum
     */
    public Long getOtherNum() {
        return otherNum;
    }

    public void setOtherNum(Long otherNum) {
        this.otherNum = otherNum;
    }

    public SQLStatisticsBean withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 周期
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public SQLStatisticsBean withSelectNum(Long selectNum) {
        this.selectNum = selectNum;
        return this;
    }

    /**
     * 查询数量
     * @return selectNum
     */
    public Long getSelectNum() {
        return selectNum;
    }

    public void setSelectNum(Long selectNum) {
        this.selectNum = selectNum;
    }

    public SQLStatisticsBean withUpdateNum(Long updateNum) {
        this.updateNum = updateNum;
        return this;
    }

    /**
     * 更新数量
     * @return updateNum
     */
    public Long getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(Long updateNum) {
        this.updateNum = updateNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SQLStatisticsBean that = (SQLStatisticsBean) obj;
        return Objects.equals(this.deleteNum, that.deleteNum) && Objects.equals(this.insertNum, that.insertNum)
            && Objects.equals(this.otherNum, that.otherNum) && Objects.equals(this.period, that.period)
            && Objects.equals(this.selectNum, that.selectNum) && Objects.equals(this.updateNum, that.updateNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteNum, insertNum, otherNum, period, selectNum, updateNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SQLStatisticsBean {\n");
        sb.append("    deleteNum: ").append(toIndentedString(deleteNum)).append("\n");
        sb.append("    insertNum: ").append(toIndentedString(insertNum)).append("\n");
        sb.append("    otherNum: ").append(toIndentedString(otherNum)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    selectNum: ").append(toIndentedString(selectNum)).append("\n");
        sb.append("    updateNum: ").append(toIndentedString(updateNum)).append("\n");
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
