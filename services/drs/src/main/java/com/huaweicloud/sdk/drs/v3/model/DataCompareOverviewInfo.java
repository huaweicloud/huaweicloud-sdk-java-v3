package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 行数对比总览详情
 */
public class DataCompareOverviewInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_name")

    private String sourceDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_name")

    private String targetDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_num")

    private Integer compareNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_end_num")

    private Integer compareEndNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_inconsistent_num")

    private Integer dataInconsistentNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uncomparable_num")

    private Integer uncomparableNum;

    public DataCompareOverviewInfo withSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
        return this;
    }

    /**
     * 源库库名
     * @return sourceDbName
     */
    public String getSourceDbName() {
        return sourceDbName;
    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }

    public DataCompareOverviewInfo withTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
        return this;
    }

    /**
     * 目标库库名
     * @return targetDbName
     */
    public String getTargetDbName() {
        return targetDbName;
    }

    public void setTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
    }

    public DataCompareOverviewInfo withStatus(Integer status) {
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

    public DataCompareOverviewInfo withCompareNum(Integer compareNum) {
        this.compareNum = compareNum;
        return this;
    }

    /**
     * 总表数。
     * @return compareNum
     */
    public Integer getCompareNum() {
        return compareNum;
    }

    public void setCompareNum(Integer compareNum) {
        this.compareNum = compareNum;
    }

    public DataCompareOverviewInfo withCompareEndNum(Integer compareEndNum) {
        this.compareEndNum = compareEndNum;
        return this;
    }

    /**
     * 已完成表数。
     * @return compareEndNum
     */
    public Integer getCompareEndNum() {
        return compareEndNum;
    }

    public void setCompareEndNum(Integer compareEndNum) {
        this.compareEndNum = compareEndNum;
    }

    public DataCompareOverviewInfo withDataInconsistentNum(Integer dataInconsistentNum) {
        this.dataInconsistentNum = dataInconsistentNum;
        return this;
    }

    /**
     * 不一致表数。
     * @return dataInconsistentNum
     */
    public Integer getDataInconsistentNum() {
        return dataInconsistentNum;
    }

    public void setDataInconsistentNum(Integer dataInconsistentNum) {
        this.dataInconsistentNum = dataInconsistentNum;
    }

    public DataCompareOverviewInfo withUncomparableNum(Integer uncomparableNum) {
        this.uncomparableNum = uncomparableNum;
        return this;
    }

    /**
     * 无法对比表数。
     * @return uncomparableNum
     */
    public Integer getUncomparableNum() {
        return uncomparableNum;
    }

    public void setUncomparableNum(Integer uncomparableNum) {
        this.uncomparableNum = uncomparableNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataCompareOverviewInfo that = (DataCompareOverviewInfo) obj;
        return Objects.equals(this.sourceDbName, that.sourceDbName)
            && Objects.equals(this.targetDbName, that.targetDbName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.compareNum, that.compareNum)
            && Objects.equals(this.compareEndNum, that.compareEndNum)
            && Objects.equals(this.dataInconsistentNum, that.dataInconsistentNum)
            && Objects.equals(this.uncomparableNum, that.uncomparableNum);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(sourceDbName, targetDbName, status, compareNum, compareEndNum, dataInconsistentNum, uncomparableNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataCompareOverviewInfo {\n");
        sb.append("    sourceDbName: ").append(toIndentedString(sourceDbName)).append("\n");
        sb.append("    targetDbName: ").append(toIndentedString(targetDbName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    compareNum: ").append(toIndentedString(compareNum)).append("\n");
        sb.append("    compareEndNum: ").append(toIndentedString(compareEndNum)).append("\n");
        sb.append("    dataInconsistentNum: ").append(toIndentedString(dataInconsistentNum)).append("\n");
        sb.append("    uncomparableNum: ").append(toIndentedString(uncomparableNum)).append("\n");
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
