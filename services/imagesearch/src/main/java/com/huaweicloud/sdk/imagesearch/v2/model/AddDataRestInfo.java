package com.huaweicloud.sdk.imagesearch.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 添加数据的相关信息。
 */
public class AddDataRestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_info")

    private AddDataRestInfoImageInfo imageInfo;

    public AddDataRestInfo withImageInfo(AddDataRestInfoImageInfo imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    public AddDataRestInfo withImageInfo(Consumer<AddDataRestInfoImageInfo> imageInfoSetter) {
        if (this.imageInfo == null) {
            this.imageInfo = new AddDataRestInfoImageInfo();
            imageInfoSetter.accept(this.imageInfo);
        }

        return this;
    }

    /**
     * Get imageInfo
     * @return imageInfo
     */
    public AddDataRestInfoImageInfo getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(AddDataRestInfoImageInfo imageInfo) {
        this.imageInfo = imageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDataRestInfo that = (AddDataRestInfo) obj;
        return Objects.equals(this.imageInfo, that.imageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDataRestInfo {\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
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
