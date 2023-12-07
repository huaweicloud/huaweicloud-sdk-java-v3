package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 需求覆盖率
 */
public class CoverRateVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testing")

    private Integer testing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished")

    private Integer finished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tested")

    private Integer notTested;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_number")

    private Integer totalNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_rate")

    private String coverRate;

    public CoverRateVo withTesting(Integer testing) {
        this.testing = testing;
        return this;
    }

    /**
     * 统计测试中的需求
     * @return testing
     */
    public Integer getTesting() {
        return testing;
    }

    public void setTesting(Integer testing) {
        this.testing = testing;
    }

    public CoverRateVo withFinished(Integer finished) {
        this.finished = finished;
        return this;
    }

    /**
     * 统计已完成的需求
     * @return finished
     */
    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public CoverRateVo withNotTested(Integer notTested) {
        this.notTested = notTested;
        return this;
    }

    /**
     * 统计未测试的需求
     * @return notTested
     */
    public Integer getNotTested() {
        return notTested;
    }

    public void setNotTested(Integer notTested) {
        this.notTested = notTested;
    }

    public CoverRateVo withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    /**
     * 计算需求总数
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public CoverRateVo withCoverRate(String coverRate) {
        this.coverRate = coverRate;
        return this;
    }

    /**
     * 需求覆盖率
     * @return coverRate
     */
    public String getCoverRate() {
        return coverRate;
    }

    public void setCoverRate(String coverRate) {
        this.coverRate = coverRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoverRateVo that = (CoverRateVo) obj;
        return Objects.equals(this.testing, that.testing) && Objects.equals(this.finished, that.finished)
            && Objects.equals(this.notTested, that.notTested) && Objects.equals(this.totalNumber, that.totalNumber)
            && Objects.equals(this.coverRate, that.coverRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testing, finished, notTested, totalNumber, coverRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoverRateVo {\n");
        sb.append("    testing: ").append(toIndentedString(testing)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    notTested: ").append(toIndentedString(notTested)).append("\n");
        sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
        sb.append("    coverRate: ").append(toIndentedString(coverRate)).append("\n");
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
