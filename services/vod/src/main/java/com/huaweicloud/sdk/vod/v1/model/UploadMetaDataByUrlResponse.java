package com.huaweicloud.sdk.vod.v1.model;

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
public class UploadMetaDataByUrlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_assets")

    private List<UploadAsset> uploadAssets = null;

    public UploadMetaDataByUrlResponse withUploadAssets(List<UploadAsset> uploadAssets) {
        this.uploadAssets = uploadAssets;
        return this;
    }

    public UploadMetaDataByUrlResponse addUploadAssetsItem(UploadAsset uploadAssetsItem) {
        if (this.uploadAssets == null) {
            this.uploadAssets = new ArrayList<>();
        }
        this.uploadAssets.add(uploadAssetsItem);
        return this;
    }

    public UploadMetaDataByUrlResponse withUploadAssets(Consumer<List<UploadAsset>> uploadAssetsSetter) {
        if (this.uploadAssets == null) {
            this.uploadAssets = new ArrayList<>();
        }
        uploadAssetsSetter.accept(this.uploadAssets);
        return this;
    }

    /**
     * 待拉取创建的媒资元数据
     * @return uploadAssets
     */
    public List<UploadAsset> getUploadAssets() {
        return uploadAssets;
    }

    public void setUploadAssets(List<UploadAsset> uploadAssets) {
        this.uploadAssets = uploadAssets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadMetaDataByUrlResponse that = (UploadMetaDataByUrlResponse) obj;
        return Objects.equals(this.uploadAssets, that.uploadAssets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadAssets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadMetaDataByUrlResponse {\n");
        sb.append("    uploadAssets: ").append(toIndentedString(uploadAssets)).append("\n");
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
