package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListUpgradeHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_reports")

    private List<UpgradeReports> upgradeReports = null;

    public ListUpgradeHistoriesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListUpgradeHistoriesResponse withUpgradeReports(List<UpgradeReports> upgradeReports) {
        this.upgradeReports = upgradeReports;
        return this;
    }

    public ListUpgradeHistoriesResponse addUpgradeReportsItem(UpgradeReports upgradeReportsItem) {
        if (this.upgradeReports == null) {
            this.upgradeReports = new ArrayList<>();
        }
        this.upgradeReports.add(upgradeReportsItem);
        return this;
    }

    public ListUpgradeHistoriesResponse withUpgradeReports(Consumer<List<UpgradeReports>> upgradeReportsSetter) {
        if (this.upgradeReports == null) {
            this.upgradeReports = new ArrayList<>();
        }
        upgradeReportsSetter.accept(this.upgradeReports);
        return this;
    }

    /**
     * 升级报告信息。
     * @return upgradeReports
     */
    public List<UpgradeReports> getUpgradeReports() {
        return upgradeReports;
    }

    public void setUpgradeReports(List<UpgradeReports> upgradeReports) {
        this.upgradeReports = upgradeReports;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUpgradeHistoriesResponse that = (ListUpgradeHistoriesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.upgradeReports, that.upgradeReports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, upgradeReports);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUpgradeHistoriesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    upgradeReports: ").append(toIndentedString(upgradeReports)).append("\n");
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
