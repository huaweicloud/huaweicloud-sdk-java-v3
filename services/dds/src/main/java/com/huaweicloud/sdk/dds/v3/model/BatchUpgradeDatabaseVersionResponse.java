package com.huaweicloud.sdk.dds.v3.model;

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
public class BatchUpgradeDatabaseVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_results")

    private List<UpgradeResult> upgradeResults = null;

    public BatchUpgradeDatabaseVersionResponse withUpgradeResults(List<UpgradeResult> upgradeResults) {
        this.upgradeResults = upgradeResults;
        return this;
    }

    public BatchUpgradeDatabaseVersionResponse addUpgradeResultsItem(UpgradeResult upgradeResultsItem) {
        if (this.upgradeResults == null) {
            this.upgradeResults = new ArrayList<>();
        }
        this.upgradeResults.add(upgradeResultsItem);
        return this;
    }

    public BatchUpgradeDatabaseVersionResponse withUpgradeResults(Consumer<List<UpgradeResult>> upgradeResultsSetter) {
        if (this.upgradeResults == null) {
            this.upgradeResults = new ArrayList<>();
        }
        upgradeResultsSetter.accept(this.upgradeResults);
        return this;
    }

    /**
     * 批量升级结果。
     * @return upgradeResults
     */
    public List<UpgradeResult> getUpgradeResults() {
        return upgradeResults;
    }

    public void setUpgradeResults(List<UpgradeResult> upgradeResults) {
        this.upgradeResults = upgradeResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpgradeDatabaseVersionResponse that = (BatchUpgradeDatabaseVersionResponse) obj;
        return Objects.equals(this.upgradeResults, that.upgradeResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradeResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpgradeDatabaseVersionResponse {\n");
        sb.append("    upgradeResults: ").append(toIndentedString(upgradeResults)).append("\n");
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
