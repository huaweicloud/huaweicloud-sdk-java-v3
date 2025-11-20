package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产转移请求
 */
public class TransferAssetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_type")

    private TransferTypeEnum transferType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_ids")

    private List<String> assetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_project_id")

    private String destProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memo")

    private String memo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_accept")

    private Boolean autoAccept;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_active")

    private Boolean autoActive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_need_billing")

    private Boolean isNeedBilling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_job_id")

    private String transferJobId;

    public TransferAssetReq withTransferType(TransferTypeEnum transferType) {
        this.transferType = transferType;
        return this;
    }

    /**
     * Get transferType
     * @return transferType
     */
    public TransferTypeEnum getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferTypeEnum transferType) {
        this.transferType = transferType;
    }

    public TransferAssetReq withAssetIds(List<String> assetIds) {
        this.assetIds = assetIds;
        return this;
    }

    public TransferAssetReq addAssetIdsItem(String assetIdsItem) {
        if (this.assetIds == null) {
            this.assetIds = new ArrayList<>();
        }
        this.assetIds.add(assetIdsItem);
        return this;
    }

    public TransferAssetReq withAssetIds(Consumer<List<String>> assetIdsSetter) {
        if (this.assetIds == null) {
            this.assetIds = new ArrayList<>();
        }
        assetIdsSetter.accept(this.assetIds);
        return this;
    }

    /**
     * 资产ID列表
     * @return assetIds
     */
    public List<String> getAssetIds() {
        return assetIds;
    }

    public void setAssetIds(List<String> assetIds) {
        this.assetIds = assetIds;
    }

    public TransferAssetReq withDestProjectId(String destProjectId) {
        this.destProjectId = destProjectId;
        return this;
    }

    /**
     * 目标用户ID
     * @return destProjectId
     */
    public String getDestProjectId() {
        return destProjectId;
    }

    public void setDestProjectId(String destProjectId) {
        this.destProjectId = destProjectId;
    }

    public TransferAssetReq withMemo(String memo) {
        this.memo = memo;
        return this;
    }

    /**
     * 备注信息
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public TransferAssetReq withAutoAccept(Boolean autoAccept) {
        this.autoAccept = autoAccept;
        return this;
    }

    /**
     * 是否自动接收,管理员可用
     * @return autoAccept
     */
    public Boolean getAutoAccept() {
        return autoAccept;
    }

    public void setAutoAccept(Boolean autoAccept) {
        this.autoAccept = autoAccept;
    }

    public TransferAssetReq withAutoActive(Boolean autoActive) {
        this.autoActive = autoActive;
        return this;
    }

    /**
     * 是否自动激活,管理员可用
     * @return autoActive
     */
    public Boolean getAutoActive() {
        return autoActive;
    }

    public void setAutoActive(Boolean autoActive) {
        this.autoActive = autoActive;
    }

    public TransferAssetReq withIsNeedBilling(Boolean isNeedBilling) {
        this.isNeedBilling = isNeedBilling;
        return this;
    }

    /**
     * 资产转移时，是否需要从接收方扣减资源（产生计费话单）
     * @return isNeedBilling
     */
    public Boolean getIsNeedBilling() {
        return isNeedBilling;
    }

    public void setIsNeedBilling(Boolean isNeedBilling) {
        this.isNeedBilling = isNeedBilling;
    }

    public TransferAssetReq withTransferJobId(String transferJobId) {
        this.transferJobId = transferJobId;
        return this;
    }

    /**
     * 转移任务ID，仅在transfer_type=TRANSFER_BACK时需要填写。
     * @return transferJobId
     */
    public String getTransferJobId() {
        return transferJobId;
    }

    public void setTransferJobId(String transferJobId) {
        this.transferJobId = transferJobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferAssetReq that = (TransferAssetReq) obj;
        return Objects.equals(this.transferType, that.transferType) && Objects.equals(this.assetIds, that.assetIds)
            && Objects.equals(this.destProjectId, that.destProjectId) && Objects.equals(this.memo, that.memo)
            && Objects.equals(this.autoAccept, that.autoAccept) && Objects.equals(this.autoActive, that.autoActive)
            && Objects.equals(this.isNeedBilling, that.isNeedBilling)
            && Objects.equals(this.transferJobId, that.transferJobId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(transferType, assetIds, destProjectId, memo, autoAccept, autoActive, isNeedBilling, transferJobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferAssetReq {\n");
        sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
        sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
        sb.append("    destProjectId: ").append(toIndentedString(destProjectId)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("    autoAccept: ").append(toIndentedString(autoAccept)).append("\n");
        sb.append("    autoActive: ").append(toIndentedString(autoActive)).append("\n");
        sb.append("    isNeedBilling: ").append(toIndentedString(isNeedBilling)).append("\n");
        sb.append("    transferJobId: ").append(toIndentedString(transferJobId)).append("\n");
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
