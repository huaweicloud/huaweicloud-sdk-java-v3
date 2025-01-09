package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListMarketImagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_ids")

    private List<String> imageIds = null;

    public ListMarketImagesRequest withImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
        return this;
    }

    public ListMarketImagesRequest addImageIdsItem(String imageIdsItem) {
        if (this.imageIds == null) {
            this.imageIds = new ArrayList<>();
        }
        this.imageIds.add(imageIdsItem);
        return this;
    }

    public ListMarketImagesRequest withImageIds(Consumer<List<String>> imageIdsSetter) {
        if (this.imageIds == null) {
            this.imageIds = new ArrayList<>();
        }
        imageIdsSetter.accept(this.imageIds);
        return this;
    }

    /**
     * 镜像id，支持传1到100个。
     * @return imageIds
     */
    public List<String> getImageIds() {
        return imageIds;
    }

    public void setImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMarketImagesRequest that = (ListMarketImagesRequest) obj;
        return Objects.equals(this.imageIds, that.imageIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMarketImagesRequest {\n");
        sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
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
