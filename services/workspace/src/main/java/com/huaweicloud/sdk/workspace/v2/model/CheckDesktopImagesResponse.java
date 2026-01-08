package com.huaweicloud.sdk.workspace.v2.model;

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
public class CheckDesktopImagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_infos")

    private List<DesktopImageInfo> imageInfos = null;

    public CheckDesktopImagesResponse withImageInfos(List<DesktopImageInfo> imageInfos) {
        this.imageInfos = imageInfos;
        return this;
    }

    public CheckDesktopImagesResponse addImageInfosItem(DesktopImageInfo imageInfosItem) {
        if (this.imageInfos == null) {
            this.imageInfos = new ArrayList<>();
        }
        this.imageInfos.add(imageInfosItem);
        return this;
    }

    public CheckDesktopImagesResponse withImageInfos(Consumer<List<DesktopImageInfo>> imageInfosSetter) {
        if (this.imageInfos == null) {
            this.imageInfos = new ArrayList<>();
        }
        imageInfosSetter.accept(this.imageInfos);
        return this;
    }

    /**
     * 桌面镜像信息。
     * @return imageInfos
     */
    public List<DesktopImageInfo> getImageInfos() {
        return imageInfos;
    }

    public void setImageInfos(List<DesktopImageInfo> imageInfos) {
        this.imageInfos = imageInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckDesktopImagesResponse that = (CheckDesktopImagesResponse) obj;
        return Objects.equals(this.imageInfos, that.imageInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckDesktopImagesResponse {\n");
        sb.append("    imageInfos: ").append(toIndentedString(imageInfos)).append("\n");
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
