package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 统计任务信息
 */
public class StatisticsParamsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    public StatisticsParamsDto withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * **参数解释：** 分支名
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatisticsParamsDto that = (StatisticsParamsDto) obj;
        return Objects.equals(this.branchName, that.branchName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticsParamsDto {\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
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
