package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TableVacuumNumInfo
 */
public class TableVacuumNumInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_num")

    private Integer waitingNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_num")

    private Integer runningNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_num")

    private Integer finishedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canceled_num")

    private Integer canceledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public TableVacuumNumInfo withWaitingNum(Integer waitingNum) {
        this.waitingNum = waitingNum;
        return this;
    }

    /**
     * **参数解释**： 等待的表数量。 **默认取值**： 不涉及。
     * @return waitingNum
     */
    public Integer getWaitingNum() {
        return waitingNum;
    }

    public void setWaitingNum(Integer waitingNum) {
        this.waitingNum = waitingNum;
    }

    public TableVacuumNumInfo withRunningNum(Integer runningNum) {
        this.runningNum = runningNum;
        return this;
    }

    /**
     * **参数解释**： 运行中的表数量。 **默认取值**： 不涉及。
     * @return runningNum
     */
    public Integer getRunningNum() {
        return runningNum;
    }

    public void setRunningNum(Integer runningNum) {
        this.runningNum = runningNum;
    }

    public TableVacuumNumInfo withFinishedNum(Integer finishedNum) {
        this.finishedNum = finishedNum;
        return this;
    }

    /**
     * **参数解释**： 已完成的表数量。 **默认取值**： 不涉及。
     * @return finishedNum
     */
    public Integer getFinishedNum() {
        return finishedNum;
    }

    public void setFinishedNum(Integer finishedNum) {
        this.finishedNum = finishedNum;
    }

    public TableVacuumNumInfo withCanceledNum(Integer canceledNum) {
        this.canceledNum = canceledNum;
        return this;
    }

    /**
     * **参数解释**： 取消的表数量。 **默认取值**： 不涉及。
     * @return canceledNum
     */
    public Integer getCanceledNum() {
        return canceledNum;
    }

    public void setCanceledNum(Integer canceledNum) {
        this.canceledNum = canceledNum;
    }

    public TableVacuumNumInfo withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**： 总数。 **默认取值**： 不涉及。
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableVacuumNumInfo that = (TableVacuumNumInfo) obj;
        return Objects.equals(this.waitingNum, that.waitingNum) && Objects.equals(this.runningNum, that.runningNum)
            && Objects.equals(this.finishedNum, that.finishedNum) && Objects.equals(this.canceledNum, that.canceledNum)
            && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waitingNum, runningNum, finishedNum, canceledNum, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableVacuumNumInfo {\n");
        sb.append("    waitingNum: ").append(toIndentedString(waitingNum)).append("\n");
        sb.append("    runningNum: ").append(toIndentedString(runningNum)).append("\n");
        sb.append("    finishedNum: ").append(toIndentedString(finishedNum)).append("\n");
        sb.append("    canceledNum: ").append(toIndentedString(canceledNum)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
