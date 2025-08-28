package com.huaweicloud.sdk.metastudio.v1.model;

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
public class CheckVoiceAssetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_state")

    private String assetState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_extra_meta")

    private TtscAssetExtraMeta assetExtraMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<TtscAssetFileInfo> files = null;

    public CheckVoiceAssetResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public CheckVoiceAssetResponse withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 资产名称。
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public CheckVoiceAssetResponse withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资产类型。  公共资产类型： * VOICE_MODEL：音色模型
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public CheckVoiceAssetResponse withAssetState(String assetState) {
        this.assetState = assetState;
        return this;
    }

    /**
     * 资产状态。 * CREATING：资产创建中，主文件尚未上传 * FAILED：主文件上传失败 * UNACTIVED：主文件上传成功，资产未激活，资产不可用于其他业务（用户可更新状态） * ACTIVED：主文件上传成功，资产激活，资产可用于其他业务（用户可更新状态） * DELETING：资产删除中，资产不可用，资产可恢复 * DELETED：资产文件已删除，资产不可用，资产不可恢复 * BLOCK: 资产被冻结，资产不可用，不可查看文件。
     * @return assetState
     */
    public String getAssetState() {
        return assetState;
    }

    public void setAssetState(String assetState) {
        this.assetState = assetState;
    }

    public CheckVoiceAssetResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资产创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CheckVoiceAssetResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 资产更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public CheckVoiceAssetResponse withAssetExtraMeta(TtscAssetExtraMeta assetExtraMeta) {
        this.assetExtraMeta = assetExtraMeta;
        return this;
    }

    public CheckVoiceAssetResponse withAssetExtraMeta(Consumer<TtscAssetExtraMeta> assetExtraMetaSetter) {
        if (this.assetExtraMeta == null) {
            this.assetExtraMeta = new TtscAssetExtraMeta();
            assetExtraMetaSetter.accept(this.assetExtraMeta);
        }

        return this;
    }

    /**
     * Get assetExtraMeta
     * @return assetExtraMeta
     */
    public TtscAssetExtraMeta getAssetExtraMeta() {
        return assetExtraMeta;
    }

    public void setAssetExtraMeta(TtscAssetExtraMeta assetExtraMeta) {
        this.assetExtraMeta = assetExtraMeta;
    }

    public CheckVoiceAssetResponse withFiles(List<TtscAssetFileInfo> files) {
        this.files = files;
        return this;
    }

    public CheckVoiceAssetResponse addFilesItem(TtscAssetFileInfo filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public CheckVoiceAssetResponse withFiles(Consumer<List<TtscAssetFileInfo>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 资产下的文件。
     * @return files
     */
    public List<TtscAssetFileInfo> getFiles() {
        return files;
    }

    public void setFiles(List<TtscAssetFileInfo> files) {
        this.files = files;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckVoiceAssetResponse that = (CheckVoiceAssetResponse) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.assetName, that.assetName)
            && Objects.equals(this.assetType, that.assetType) && Objects.equals(this.assetState, that.assetState)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.assetExtraMeta, that.assetExtraMeta) && Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, assetName, assetType, assetState, createTime, updateTime, assetExtraMeta, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckVoiceAssetResponse {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    assetState: ").append(toIndentedString(assetState)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    assetExtraMeta: ").append(toIndentedString(assetExtraMeta)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
