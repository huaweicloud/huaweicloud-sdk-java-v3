package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssetExportParam
 */
public class AssetExportParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "factor_ids")

    private List<String> factorIds = null;

    public AssetExportParam withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AssetExportParam withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public AssetExportParam withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父节点ID
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public AssetExportParam withFactorIds(List<String> factorIds) {
        this.factorIds = factorIds;
        return this;
    }

    public AssetExportParam addFactorIdsItem(String factorIdsItem) {
        if (this.factorIds == null) {
            this.factorIds = new ArrayList<>();
        }
        this.factorIds.add(factorIdsItem);
        return this;
    }

    public AssetExportParam withFactorIds(Consumer<List<String>> factorIdsSetter) {
        if (this.factorIds == null) {
            this.factorIds = new ArrayList<>();
        }
        factorIdsSetter.accept(this.factorIds);
        return this;
    }

    /**
     * 因子列表
     * @return factorIds
     */
    public List<String> getFactorIds() {
        return factorIds;
    }

    public void setFactorIds(List<String> factorIds) {
        this.factorIds = factorIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssetExportParam that = (AssetExportParam) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.factorIds, that.factorIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, assetId, parentId, factorIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetExportParam {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    factorIds: ").append(toIndentedString(factorIds)).append("\n");
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
