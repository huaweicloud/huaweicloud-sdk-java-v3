package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 表级别对比结果信息体
 */
public class TableLineCompareResultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table_name")

    private String sourceTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_row_num")

    private Long sourceRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_table_name")

    private String targetTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_row_num")

    private Long targetRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "difference_row_num")

    private Long differenceRowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_line_config_filter")

    private String compareLineConfigFilter;

    public TableLineCompareResultInfo withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * 源库表名称
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    public TableLineCompareResultInfo withSourceRowNum(Long sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
        return this;
    }

    /**
     * 源库表行数
     * @return sourceRowNum
     */
    public Long getSourceRowNum() {
        return sourceRowNum;
    }

    public void setSourceRowNum(Long sourceRowNum) {
        this.sourceRowNum = sourceRowNum;
    }

    public TableLineCompareResultInfo withTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }

    /**
     * 目标库表名称
     * @return targetTableName
     */
    public String getTargetTableName() {
        return targetTableName;
    }

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    public TableLineCompareResultInfo withTargetRowNum(Long targetRowNum) {
        this.targetRowNum = targetRowNum;
        return this;
    }

    /**
     * 目标库表行数
     * @return targetRowNum
     */
    public Long getTargetRowNum() {
        return targetRowNum;
    }

    public void setTargetRowNum(Long targetRowNum) {
        this.targetRowNum = targetRowNum;
    }

    public TableLineCompareResultInfo withDifferenceRowNum(Long differenceRowNum) {
        this.differenceRowNum = differenceRowNum;
        return this;
    }

    /**
     * 行数差异值
     * @return differenceRowNum
     */
    public Long getDifferenceRowNum() {
        return differenceRowNum;
    }

    public void setDifferenceRowNum(Long differenceRowNum) {
        this.differenceRowNum = differenceRowNum;
    }

    public TableLineCompareResultInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 对比状态。 - 0：对比不一致 - 2：对比一致 - 3：目标库表不存在 - 4：对比失败 - 5：正在对比中 - 6：等待对比中 - 7：任务已取消 - 8：源库为空 - 9：目标库为空 - 10：源库和目标库都为空 - 11：源表不存在 - 12：目标表不存在 - 13：原表和目标表都不存在 - 14：源数据库连接失败 - 15：目标库数据库连接失败 - 16：源数据库执行SQL超时 - 17：目标数据库执行SQL超时 - 18：源数据库执行SQL错误 - 19：目标数据库执行SQL错误 - 20：源库和目标库都不存在 - 21：源库不存在 - 22：目标库不存在 - 23：行数为亿行，未进行对比 - 27：超时
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TableLineCompareResultInfo withCompareLineConfigFilter(String compareLineConfigFilter) {
        this.compareLineConfigFilter = compareLineConfigFilter;
        return this;
    }

    /**
     * 行过滤配置条件
     * @return compareLineConfigFilter
     */
    public String getCompareLineConfigFilter() {
        return compareLineConfigFilter;
    }

    public void setCompareLineConfigFilter(String compareLineConfigFilter) {
        this.compareLineConfigFilter = compareLineConfigFilter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableLineCompareResultInfo that = (TableLineCompareResultInfo) obj;
        return Objects.equals(this.sourceTableName, that.sourceTableName)
            && Objects.equals(this.sourceRowNum, that.sourceRowNum)
            && Objects.equals(this.targetTableName, that.targetTableName)
            && Objects.equals(this.targetRowNum, that.targetRowNum)
            && Objects.equals(this.differenceRowNum, that.differenceRowNum) && Objects.equals(this.status, that.status)
            && Objects.equals(this.compareLineConfigFilter, that.compareLineConfigFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceTableName,
            sourceRowNum,
            targetTableName,
            targetRowNum,
            differenceRowNum,
            status,
            compareLineConfigFilter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableLineCompareResultInfo {\n");
        sb.append("    sourceTableName: ").append(toIndentedString(sourceTableName)).append("\n");
        sb.append("    sourceRowNum: ").append(toIndentedString(sourceRowNum)).append("\n");
        sb.append("    targetTableName: ").append(toIndentedString(targetTableName)).append("\n");
        sb.append("    targetRowNum: ").append(toIndentedString(targetRowNum)).append("\n");
        sb.append("    differenceRowNum: ").append(toIndentedString(differenceRowNum)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    compareLineConfigFilter: ").append(toIndentedString(compareLineConfigFilter)).append("\n");
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
