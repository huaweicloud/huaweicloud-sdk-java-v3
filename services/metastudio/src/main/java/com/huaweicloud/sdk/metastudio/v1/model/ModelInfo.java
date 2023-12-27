package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模型信息
 */
public class ModelInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_asset_id")

    private String modelAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_model_asset_ids")

    private List<String> backupModelAssetIds = null;

    public ModelInfo withModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
        return this;
    }

    /**
     * 模型资产ID
     * @return modelAssetId
     */
    public String getModelAssetId() {
        return modelAssetId;
    }

    public void setModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
    }

    public ModelInfo withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 资产名称
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public ModelInfo withBackupModelAssetIds(List<String> backupModelAssetIds) {
        this.backupModelAssetIds = backupModelAssetIds;
        return this;
    }

    public ModelInfo addBackupModelAssetIdsItem(String backupModelAssetIdsItem) {
        if (this.backupModelAssetIds == null) {
            this.backupModelAssetIds = new ArrayList<>();
        }
        this.backupModelAssetIds.add(backupModelAssetIdsItem);
        return this;
    }

    public ModelInfo withBackupModelAssetIds(Consumer<List<String>> backupModelAssetIdsSetter) {
        if (this.backupModelAssetIds == null) {
            this.backupModelAssetIds = new ArrayList<>();
        }
        backupModelAssetIdsSetter.accept(this.backupModelAssetIds);
        return this;
    }

    /**
     * 主播轮换时备选主播数字人资产ID（仅形象资产，不包含音色）。
     * @return backupModelAssetIds
     */
    public List<String> getBackupModelAssetIds() {
        return backupModelAssetIds;
    }

    public void setBackupModelAssetIds(List<String> backupModelAssetIds) {
        this.backupModelAssetIds = backupModelAssetIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelInfo that = (ModelInfo) obj;
        return Objects.equals(this.modelAssetId, that.modelAssetId) && Objects.equals(this.assetName, that.assetName)
            && Objects.equals(this.backupModelAssetIds, that.backupModelAssetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelAssetId, assetName, backupModelAssetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelInfo {\n");
        sb.append("    modelAssetId: ").append(toIndentedString(modelAssetId)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    backupModelAssetIds: ").append(toIndentedString(backupModelAssetIds)).append("\n");
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
