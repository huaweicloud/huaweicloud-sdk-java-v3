package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class VersionTestCasesChangeStatisticsVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_testcases_number")

    private Integer addTestcasesNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reuse_testcases_number")

    private Integer reuseTestcasesNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifying_testcases_number")

    private Integer modifyingTestcasesNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_date_timestamp")

    private Long updateDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_date")

    private OffsetDateTime updateDate;

    public VersionTestCasesChangeStatisticsVo withAddTestcasesNumber(Integer addTestcasesNumber) {
        this.addTestcasesNumber = addTestcasesNumber;
        return this;
    }

    /**
     * 新增用例数
     * @return addTestcasesNumber
     */
    public Integer getAddTestcasesNumber() {
        return addTestcasesNumber;
    }

    public void setAddTestcasesNumber(Integer addTestcasesNumber) {
        this.addTestcasesNumber = addTestcasesNumber;
    }

    public VersionTestCasesChangeStatisticsVo withReuseTestcasesNumber(Integer reuseTestcasesNumber) {
        this.reuseTestcasesNumber = reuseTestcasesNumber;
        return this;
    }

    /**
     * 复用用例数
     * @return reuseTestcasesNumber
     */
    public Integer getReuseTestcasesNumber() {
        return reuseTestcasesNumber;
    }

    public void setReuseTestcasesNumber(Integer reuseTestcasesNumber) {
        this.reuseTestcasesNumber = reuseTestcasesNumber;
    }

    public VersionTestCasesChangeStatisticsVo withModifyingTestcasesNumber(Integer modifyingTestcasesNumber) {
        this.modifyingTestcasesNumber = modifyingTestcasesNumber;
        return this;
    }

    /**
     * 修改用例数
     * @return modifyingTestcasesNumber
     */
    public Integer getModifyingTestcasesNumber() {
        return modifyingTestcasesNumber;
    }

    public void setModifyingTestcasesNumber(Integer modifyingTestcasesNumber) {
        this.modifyingTestcasesNumber = modifyingTestcasesNumber;
    }

    public VersionTestCasesChangeStatisticsVo withUpdateDateTimestamp(Long updateDateTimestamp) {
        this.updateDateTimestamp = updateDateTimestamp;
        return this;
    }

    /**
     * 修改时间时间戳
     * @return updateDateTimestamp
     */
    public Long getUpdateDateTimestamp() {
        return updateDateTimestamp;
    }

    public void setUpdateDateTimestamp(Long updateDateTimestamp) {
        this.updateDateTimestamp = updateDateTimestamp;
    }

    public VersionTestCasesChangeStatisticsVo withUpdateDate(OffsetDateTime updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * 修改时间
     * @return updateDate
     */
    public OffsetDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(OffsetDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionTestCasesChangeStatisticsVo that = (VersionTestCasesChangeStatisticsVo) obj;
        return Objects.equals(this.addTestcasesNumber, that.addTestcasesNumber)
            && Objects.equals(this.reuseTestcasesNumber, that.reuseTestcasesNumber)
            && Objects.equals(this.modifyingTestcasesNumber, that.modifyingTestcasesNumber)
            && Objects.equals(this.updateDateTimestamp, that.updateDateTimestamp)
            && Objects.equals(this.updateDate, that.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(addTestcasesNumber, reuseTestcasesNumber, modifyingTestcasesNumber, updateDateTimestamp, updateDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionTestCasesChangeStatisticsVo {\n");
        sb.append("    addTestcasesNumber: ").append(toIndentedString(addTestcasesNumber)).append("\n");
        sb.append("    reuseTestcasesNumber: ").append(toIndentedString(reuseTestcasesNumber)).append("\n");
        sb.append("    modifyingTestcasesNumber: ").append(toIndentedString(modifyingTestcasesNumber)).append("\n");
        sb.append("    updateDateTimestamp: ").append(toIndentedString(updateDateTimestamp)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
