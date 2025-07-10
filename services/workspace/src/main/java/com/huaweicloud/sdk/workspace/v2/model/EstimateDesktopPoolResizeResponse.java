package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class EstimateDesktopPoolResizeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_upgrade")

    private Boolean isUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_inquiry_rsp_when_upgrade")

    private PeriodBatchUpChangeResourceRsp batchInquiryRspWhenUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_inquiry_rsp_when_downgrade")

    private BatchInquiryChangeRsp batchInquiryRspWhenDowngrade;

    public EstimateDesktopPoolResizeResponse withIsUpgrade(Boolean isUpgrade) {
        this.isUpgrade = isUpgrade;
        return this;
    }

    /**
     * 是否为升配。
     * @return isUpgrade
     */
    public Boolean getIsUpgrade() {
        return isUpgrade;
    }

    public void setIsUpgrade(Boolean isUpgrade) {
        this.isUpgrade = isUpgrade;
    }

    public EstimateDesktopPoolResizeResponse withBatchInquiryRspWhenUpgrade(
        PeriodBatchUpChangeResourceRsp batchInquiryRspWhenUpgrade) {
        this.batchInquiryRspWhenUpgrade = batchInquiryRspWhenUpgrade;
        return this;
    }

    public EstimateDesktopPoolResizeResponse withBatchInquiryRspWhenUpgrade(
        Consumer<PeriodBatchUpChangeResourceRsp> batchInquiryRspWhenUpgradeSetter) {
        if (this.batchInquiryRspWhenUpgrade == null) {
            this.batchInquiryRspWhenUpgrade = new PeriodBatchUpChangeResourceRsp();
            batchInquiryRspWhenUpgradeSetter.accept(this.batchInquiryRspWhenUpgrade);
        }

        return this;
    }

    /**
     * Get batchInquiryRspWhenUpgrade
     * @return batchInquiryRspWhenUpgrade
     */
    public PeriodBatchUpChangeResourceRsp getBatchInquiryRspWhenUpgrade() {
        return batchInquiryRspWhenUpgrade;
    }

    public void setBatchInquiryRspWhenUpgrade(PeriodBatchUpChangeResourceRsp batchInquiryRspWhenUpgrade) {
        this.batchInquiryRspWhenUpgrade = batchInquiryRspWhenUpgrade;
    }

    public EstimateDesktopPoolResizeResponse withBatchInquiryRspWhenDowngrade(
        BatchInquiryChangeRsp batchInquiryRspWhenDowngrade) {
        this.batchInquiryRspWhenDowngrade = batchInquiryRspWhenDowngrade;
        return this;
    }

    public EstimateDesktopPoolResizeResponse withBatchInquiryRspWhenDowngrade(
        Consumer<BatchInquiryChangeRsp> batchInquiryRspWhenDowngradeSetter) {
        if (this.batchInquiryRspWhenDowngrade == null) {
            this.batchInquiryRspWhenDowngrade = new BatchInquiryChangeRsp();
            batchInquiryRspWhenDowngradeSetter.accept(this.batchInquiryRspWhenDowngrade);
        }

        return this;
    }

    /**
     * Get batchInquiryRspWhenDowngrade
     * @return batchInquiryRspWhenDowngrade
     */
    public BatchInquiryChangeRsp getBatchInquiryRspWhenDowngrade() {
        return batchInquiryRspWhenDowngrade;
    }

    public void setBatchInquiryRspWhenDowngrade(BatchInquiryChangeRsp batchInquiryRspWhenDowngrade) {
        this.batchInquiryRspWhenDowngrade = batchInquiryRspWhenDowngrade;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EstimateDesktopPoolResizeResponse that = (EstimateDesktopPoolResizeResponse) obj;
        return Objects.equals(this.isUpgrade, that.isUpgrade)
            && Objects.equals(this.batchInquiryRspWhenUpgrade, that.batchInquiryRspWhenUpgrade)
            && Objects.equals(this.batchInquiryRspWhenDowngrade, that.batchInquiryRspWhenDowngrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isUpgrade, batchInquiryRspWhenUpgrade, batchInquiryRspWhenDowngrade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EstimateDesktopPoolResizeResponse {\n");
        sb.append("    isUpgrade: ").append(toIndentedString(isUpgrade)).append("\n");
        sb.append("    batchInquiryRspWhenUpgrade: ").append(toIndentedString(batchInquiryRspWhenUpgrade)).append("\n");
        sb.append("    batchInquiryRspWhenDowngrade: ")
            .append(toIndentedString(batchInquiryRspWhenDowngrade))
            .append("\n");
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
