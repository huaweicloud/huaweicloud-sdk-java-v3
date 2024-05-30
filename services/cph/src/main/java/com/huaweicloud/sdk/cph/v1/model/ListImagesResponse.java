package com.huaweicloud.sdk.cph.v1.model;

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
    @JsonProperty(value = "image_infos")

    private List<ListImagesView> imageInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListImagesResponse withImageInfos(List<ListImagesView> imageInfos) {
        this.imageInfos = imageInfos;
        return this;
    }

    public ListImagesResponse addImageInfosItem(ListImagesView imageInfosItem) {
        if (this.imageInfos == null) {
            this.imageInfos = new ArrayList<>();
        }
        this.imageInfos.add(imageInfosItem);
        return this;
    }

    public ListImagesResponse withImageInfos(Consumer<List<ListImagesView>> imageInfosSetter) {
        if (this.imageInfos == null) {
            this.imageInfos = new ArrayList<>();
        }
        imageInfosSetter.accept(this.imageInfos);
        return this;
    }

    /**
     * 镜像详情
     * @return imageInfos
     */
    public List<ListImagesView> getImageInfos() {
        return imageInfos;
    }

    public void setImageInfos(List<ListImagesView> imageInfos) {
        this.imageInfos = imageInfos;
    }

    public ListImagesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条数
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

    public ListImagesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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
        return Objects.equals(this.imageInfos, that.imageInfos) && Objects.equals(this.total, that.total)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageInfos, total, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImagesResponse {\n");
        sb.append("    imageInfos: ").append(toIndentedString(imageInfos)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
