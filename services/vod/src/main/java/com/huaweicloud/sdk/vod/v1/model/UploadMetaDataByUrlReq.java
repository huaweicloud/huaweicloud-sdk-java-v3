package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** UploadMetaDataByUrlReq */
public class UploadMetaDataByUrlReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_metadatas")

    private List<UploadMetaDataByUrl> uploadMetadatas = null;

    public UploadMetaDataByUrlReq withUploadMetadatas(List<UploadMetaDataByUrl> uploadMetadatas) {
        this.uploadMetadatas = uploadMetadatas;
        return this;
    }

    public UploadMetaDataByUrlReq addUploadMetadatasItem(UploadMetaDataByUrl uploadMetadatasItem) {
        if (this.uploadMetadatas == null) {
            this.uploadMetadatas = new ArrayList<>();
        }
        this.uploadMetadatas.add(uploadMetadatasItem);
        return this;
    }

    public UploadMetaDataByUrlReq withUploadMetadatas(Consumer<List<UploadMetaDataByUrl>> uploadMetadatasSetter) {
        if (this.uploadMetadatas == null) {
            this.uploadMetadatas = new ArrayList<>();
        }
        uploadMetadatasSetter.accept(this.uploadMetadatas);
        return this;
    }

    /** 待拉取创建的媒资元数据
     * 
     * @return uploadMetadatas */
    public List<UploadMetaDataByUrl> getUploadMetadatas() {
        return uploadMetadatas;
    }

    public void setUploadMetadatas(List<UploadMetaDataByUrl> uploadMetadatas) {
        this.uploadMetadatas = uploadMetadatas;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadMetaDataByUrlReq uploadMetaDataByUrlReq = (UploadMetaDataByUrlReq) o;
        return Objects.equals(this.uploadMetadatas, uploadMetaDataByUrlReq.uploadMetadatas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadMetadatas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadMetaDataByUrlReq {\n");
        sb.append("    uploadMetadatas: ").append(toIndentedString(uploadMetadatas)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
