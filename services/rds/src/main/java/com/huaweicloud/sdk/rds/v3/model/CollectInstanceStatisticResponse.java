package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CollectInstanceStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_num")

    private Integer abnormalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_full_num")

    private Integer diskFullNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_num")

    private Integer frozenNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_num")

    private Integer normalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_reboot_num")

    private Integer waitRebootNum;

    public CollectInstanceStatisticResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 实例总数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public CollectInstanceStatisticResponse withAbnormalNum(Integer abnormalNum) {
        this.abnormalNum = abnormalNum;
        return this;
    }

    /**
     * 异常实例数
     * @return abnormalNum
     */
    public Integer getAbnormalNum() {
        return abnormalNum;
    }

    public void setAbnormalNum(Integer abnormalNum) {
        this.abnormalNum = abnormalNum;
    }

    public CollectInstanceStatisticResponse withDiskFullNum(Integer diskFullNum) {
        this.diskFullNum = diskFullNum;
        return this;
    }

    /**
     * 磁盘不足实例数
     * @return diskFullNum
     */
    public Integer getDiskFullNum() {
        return diskFullNum;
    }

    public void setDiskFullNum(Integer diskFullNum) {
        this.diskFullNum = diskFullNum;
    }

    public CollectInstanceStatisticResponse withFrozenNum(Integer frozenNum) {
        this.frozenNum = frozenNum;
        return this;
    }

    /**
     * 冻结实例数
     * @return frozenNum
     */
    public Integer getFrozenNum() {
        return frozenNum;
    }

    public void setFrozenNum(Integer frozenNum) {
        this.frozenNum = frozenNum;
    }

    public CollectInstanceStatisticResponse withNormalNum(Integer normalNum) {
        this.normalNum = normalNum;
        return this;
    }

    /**
     * 运行中实例数
     * @return normalNum
     */
    public Integer getNormalNum() {
        return normalNum;
    }

    public void setNormalNum(Integer normalNum) {
        this.normalNum = normalNum;
    }

    public CollectInstanceStatisticResponse withWaitRebootNum(Integer waitRebootNum) {
        this.waitRebootNum = waitRebootNum;
        return this;
    }

    /**
     * 等待重启实例数
     * @return waitRebootNum
     */
    public Integer getWaitRebootNum() {
        return waitRebootNum;
    }

    public void setWaitRebootNum(Integer waitRebootNum) {
        this.waitRebootNum = waitRebootNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectInstanceStatisticResponse that = (CollectInstanceStatisticResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.abnormalNum, that.abnormalNum)
            && Objects.equals(this.diskFullNum, that.diskFullNum) && Objects.equals(this.frozenNum, that.frozenNum)
            && Objects.equals(this.normalNum, that.normalNum) && Objects.equals(this.waitRebootNum, that.waitRebootNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, abnormalNum, diskFullNum, frozenNum, normalNum, waitRebootNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectInstanceStatisticResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    abnormalNum: ").append(toIndentedString(abnormalNum)).append("\n");
        sb.append("    diskFullNum: ").append(toIndentedString(diskFullNum)).append("\n");
        sb.append("    frozenNum: ").append(toIndentedString(frozenNum)).append("\n");
        sb.append("    normalNum: ").append(toIndentedString(normalNum)).append("\n");
        sb.append("    waitRebootNum: ").append(toIndentedString(waitRebootNum)).append("\n");
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
