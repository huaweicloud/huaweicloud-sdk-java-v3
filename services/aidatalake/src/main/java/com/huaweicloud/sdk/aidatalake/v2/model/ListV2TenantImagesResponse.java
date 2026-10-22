package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ListV2TenantImagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "images")

    private List<V2ImageInfo> images = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListV2TenantImagesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：符合条件的总数。 **取值范围**：最小值为0，最大值为10000。
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListV2TenantImagesResponse withImages(List<V2ImageInfo> images) {
        this.images = images;
        return this;
    }

    public ListV2TenantImagesResponse addImagesItem(V2ImageInfo imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    public ListV2TenantImagesResponse withImages(Consumer<List<V2ImageInfo>> imagesSetter) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        imagesSetter.accept(this.images);
        return this;
    }

    /**
     * **参数解释**：自定义镜像列表，列表中每个元素为V2ImageInfo对象，数组长度不超过10000。 **约束限制**：不涉及。 
     * @return images
     */
    public List<V2ImageInfo> getImages() {
        return images;
    }

    public void setImages(List<V2ImageInfo> images) {
        this.images = images;
    }

    public ListV2TenantImagesResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2TenantImagesResponse that = (ListV2TenantImagesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.images, that.images)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, images, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2TenantImagesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
