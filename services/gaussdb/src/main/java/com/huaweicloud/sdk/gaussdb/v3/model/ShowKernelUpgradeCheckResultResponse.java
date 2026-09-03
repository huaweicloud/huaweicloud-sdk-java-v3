package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowKernelUpgradeCheckResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_precheck_result")

    private String upgradePrecheckResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_precheck_detail")

    private List<UpgradeDatabasePrecheckResult> upgradePrecheckDetail = null;

    public ShowKernelUpgradeCheckResultResponse withUpgradePrecheckResult(String upgradePrecheckResult) {
        this.upgradePrecheckResult = upgradePrecheckResult;
        return this;
    }

    /**
     * **参数解释**：  预检查结果。  **取值范围**：  - true：成功。 - false：失败。
     * @return upgradePrecheckResult
     */
    public String getUpgradePrecheckResult() {
        return upgradePrecheckResult;
    }

    public void setUpgradePrecheckResult(String upgradePrecheckResult) {
        this.upgradePrecheckResult = upgradePrecheckResult;
    }

    public ShowKernelUpgradeCheckResultResponse withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**：  预检查完成时间。  **取值范围**：  格式为UNIX时间戳，单位是毫秒，时区为UTC标准时区。
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowKernelUpgradeCheckResultResponse withUpgradePrecheckDetail(
        List<UpgradeDatabasePrecheckResult> upgradePrecheckDetail) {
        this.upgradePrecheckDetail = upgradePrecheckDetail;
        return this;
    }

    public ShowKernelUpgradeCheckResultResponse addUpgradePrecheckDetailItem(
        UpgradeDatabasePrecheckResult upgradePrecheckDetailItem) {
        if (this.upgradePrecheckDetail == null) {
            this.upgradePrecheckDetail = new ArrayList<>();
        }
        this.upgradePrecheckDetail.add(upgradePrecheckDetailItem);
        return this;
    }

    public ShowKernelUpgradeCheckResultResponse withUpgradePrecheckDetail(
        Consumer<List<UpgradeDatabasePrecheckResult>> upgradePrecheckDetailSetter) {
        if (this.upgradePrecheckDetail == null) {
            this.upgradePrecheckDetail = new ArrayList<>();
        }
        upgradePrecheckDetailSetter.accept(this.upgradePrecheckDetail);
        return this;
    }

    /**
     * **参数解释**：  实例预检查详情。
     * @return upgradePrecheckDetail
     */
    public List<UpgradeDatabasePrecheckResult> getUpgradePrecheckDetail() {
        return upgradePrecheckDetail;
    }

    public void setUpgradePrecheckDetail(List<UpgradeDatabasePrecheckResult> upgradePrecheckDetail) {
        this.upgradePrecheckDetail = upgradePrecheckDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKernelUpgradeCheckResultResponse that = (ShowKernelUpgradeCheckResultResponse) obj;
        return Objects.equals(this.upgradePrecheckResult, that.upgradePrecheckResult)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.upgradePrecheckDetail, that.upgradePrecheckDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradePrecheckResult, updatedAt, upgradePrecheckDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKernelUpgradeCheckResultResponse {\n");
        sb.append("    upgradePrecheckResult: ").append(toIndentedString(upgradePrecheckResult)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    upgradePrecheckDetail: ").append(toIndentedString(upgradePrecheckDetail)).append("\n");
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
