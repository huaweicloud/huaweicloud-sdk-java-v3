package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 训练产物自动发布配置
 */
public class ArtifactsPublish {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ckpt")

    private Boolean isCkpt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_id")

    private String artifactId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_asset_type")

    private String publishAssetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_source_type")

    private String assetSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_code")

    private String assetCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_version")

    private String assetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    public ArtifactsPublish withIsCkpt(Boolean isCkpt) {
        this.isCkpt = isCkpt;
        return this;
    }

    /**
     * 是否是中间产物，false-是模型产物，true-是中间产物
     * @return isCkpt
     */
    public Boolean getIsCkpt() {
        return isCkpt;
    }

    public void setIsCkpt(Boolean isCkpt) {
        this.isCkpt = isCkpt;
    }

    public ArtifactsPublish withArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * 断点ID,ckpt发布时使用
     * @return artifactId
     */
    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public ArtifactsPublish withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 模型产物发布后资产名称，默认{源模型名字}-{训练类型}-{训练时间}
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public ArtifactsPublish withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * 全局可见性，用来控制资产是当前空间可见或者全部空间可见，取值current|all。
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public ArtifactsPublish withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 发布资产描述信息，{任务名}的最终产出模型
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArtifactsPublish withPublishAssetType(String publishAssetType) {
        this.publishAssetType = publishAssetType;
        return this;
    }

    /**
     * 模型发布方式
     * @return publishAssetType
     */
    public String getPublishAssetType() {
        return publishAssetType;
    }

    public void setPublishAssetType(String publishAssetType) {
        this.publishAssetType = publishAssetType;
    }

    public ArtifactsPublish withAssetSourceType(String assetSourceType) {
        this.assetSourceType = assetSourceType;
        return this;
    }

    /**
     * 资产来源
     * @return assetSourceType
     */
    public String getAssetSourceType() {
        return assetSourceType;
    }

    public void setAssetSourceType(String assetSourceType) {
        this.assetSourceType = assetSourceType;
    }

    public ArtifactsPublish withAssetCode(String assetCode) {
        this.assetCode = assetCode;
        return this;
    }

    /**
     * 选择模型。
     * @return assetCode
     */
    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public ArtifactsPublish withAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
        return this;
    }

    /**
     * 版本号。
     * @return assetVersion
     */
    public String getAssetVersion() {
        return assetVersion;
    }

    public void setAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
    }

    public ArtifactsPublish withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * 版本描述。
     * @return versionDescription
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArtifactsPublish that = (ArtifactsPublish) obj;
        return Objects.equals(this.isCkpt, that.isCkpt) && Objects.equals(this.artifactId, that.artifactId)
            && Objects.equals(this.assetName, that.assetName) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.publishAssetType, that.publishAssetType)
            && Objects.equals(this.assetSourceType, that.assetSourceType)
            && Objects.equals(this.assetCode, that.assetCode) && Objects.equals(this.assetVersion, that.assetVersion)
            && Objects.equals(this.versionDescription, that.versionDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCkpt,
            artifactId,
            assetName,
            visibility,
            description,
            publishAssetType,
            assetSourceType,
            assetCode,
            assetVersion,
            versionDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactsPublish {\n");
        sb.append("    isCkpt: ").append(toIndentedString(isCkpt)).append("\n");
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    publishAssetType: ").append(toIndentedString(publishAssetType)).append("\n");
        sb.append("    assetSourceType: ").append(toIndentedString(assetSourceType)).append("\n");
        sb.append("    assetCode: ").append(toIndentedString(assetCode)).append("\n");
        sb.append("    assetVersion: ").append(toIndentedString(assetVersion)).append("\n");
        sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
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
