package com.huaweicloud.sdk.css.v1.model;

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
public class ListImagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "needUploadUpgradePlugin")

    private Boolean needUploadUpgradePlugin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageInfoList")

    private List<GetTargetImageIdDetail> imageInfoList = null;

    public ListImagesResponse withNeedUploadUpgradePlugin(Boolean needUploadUpgradePlugin) {
        this.needUploadUpgradePlugin = needUploadUpgradePlugin;
        return this;
    }

    /**
     * 是否需要上传升级后版本的插件。
     * @return needUploadUpgradePlugin
     */
    public Boolean getNeedUploadUpgradePlugin() {
        return needUploadUpgradePlugin;
    }

    public void setNeedUploadUpgradePlugin(Boolean needUploadUpgradePlugin) {
        this.needUploadUpgradePlugin = needUploadUpgradePlugin;
    }

    public ListImagesResponse withImageInfoList(List<GetTargetImageIdDetail> imageInfoList) {
        this.imageInfoList = imageInfoList;
        return this;
    }

    public ListImagesResponse addImageInfoListItem(GetTargetImageIdDetail imageInfoListItem) {
        if (this.imageInfoList == null) {
            this.imageInfoList = new ArrayList<>();
        }
        this.imageInfoList.add(imageInfoListItem);
        return this;
    }

    public ListImagesResponse withImageInfoList(Consumer<List<GetTargetImageIdDetail>> imageInfoListSetter) {
        if (this.imageInfoList == null) {
            this.imageInfoList = new ArrayList<>();
        }
        imageInfoListSetter.accept(this.imageInfoList);
        return this;
    }

    /**
     * Get imageInfoList
     * @return imageInfoList
     */
    public List<GetTargetImageIdDetail> getImageInfoList() {
        return imageInfoList;
    }

    public void setImageInfoList(List<GetTargetImageIdDetail> imageInfoList) {
        this.imageInfoList = imageInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImagesResponse that = (ListImagesResponse) obj;
        return Objects.equals(this.needUploadUpgradePlugin, that.needUploadUpgradePlugin)
            && Objects.equals(this.imageInfoList, that.imageInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(needUploadUpgradePlugin, imageInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImagesResponse {\n");
        sb.append("    needUploadUpgradePlugin: ").append(toIndentedString(needUploadUpgradePlugin)).append("\n");
        sb.append("    imageInfoList: ").append(toIndentedString(imageInfoList)).append("\n");
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
