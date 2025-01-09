package com.huaweicloud.sdk.workspaceapp.v1.model;

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
public class ShowPublishableAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_images")

    private List<String> groupImages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<PublishableApp> items = null;

    public ShowPublishableAppResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowPublishableAppResponse withGroupImages(List<String> groupImages) {
        this.groupImages = groupImages;
        return this;
    }

    public ShowPublishableAppResponse addGroupImagesItem(String groupImagesItem) {
        if (this.groupImages == null) {
            this.groupImages = new ArrayList<>();
        }
        this.groupImages.add(groupImagesItem);
        return this;
    }

    public ShowPublishableAppResponse withGroupImages(Consumer<List<String>> groupImagesSetter) {
        if (this.groupImages == null) {
            this.groupImages = new ArrayList<>();
        }
        groupImagesSetter.accept(this.groupImages);
        return this;
    }

    /**
     * 组下面的镜像ID列表。
     * @return groupImages
     */
    public List<String> getGroupImages() {
        return groupImages;
    }

    public void setGroupImages(List<String> groupImages) {
        this.groupImages = groupImages;
    }

    public ShowPublishableAppResponse withItems(List<PublishableApp> items) {
        this.items = items;
        return this;
    }

    public ShowPublishableAppResponse addItemsItem(PublishableApp itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ShowPublishableAppResponse withItems(Consumer<List<PublishableApp>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 查询到的应用列表。
     * @return items
     */
    public List<PublishableApp> getItems() {
        return items;
    }

    public void setItems(List<PublishableApp> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPublishableAppResponse that = (ShowPublishableAppResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.groupImages, that.groupImages)
            && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, groupImages, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPublishableAppResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    groupImages: ").append(toIndentedString(groupImages)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
