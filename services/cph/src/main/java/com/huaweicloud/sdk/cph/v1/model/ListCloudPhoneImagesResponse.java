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
public class ListCloudPhoneImagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_images")

    private List<Object> phoneImages = null;

    public ListCloudPhoneImagesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListCloudPhoneImagesResponse withPhoneImages(List<Object> phoneImages) {
        this.phoneImages = phoneImages;
        return this;
    }

    public ListCloudPhoneImagesResponse addPhoneImagesItem(Object phoneImagesItem) {
        if (this.phoneImages == null) {
            this.phoneImages = new ArrayList<>();
        }
        this.phoneImages.add(phoneImagesItem);
        return this;
    }

    public ListCloudPhoneImagesResponse withPhoneImages(Consumer<List<Object>> phoneImagesSetter) {
        if (this.phoneImages == null) {
            this.phoneImages = new ArrayList<>();
        }
        phoneImagesSetter.accept(this.phoneImages);
        return this;
    }

    /**
     * 手机镜像信息
     * @return phoneImages
     */
    public List<Object> getPhoneImages() {
        return phoneImages;
    }

    public void setPhoneImages(List<Object> phoneImages) {
        this.phoneImages = phoneImages;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCloudPhoneImagesResponse listCloudPhoneImagesResponse = (ListCloudPhoneImagesResponse) o;
        return Objects.equals(this.requestId, listCloudPhoneImagesResponse.requestId)
            && Objects.equals(this.phoneImages, listCloudPhoneImagesResponse.phoneImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, phoneImages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudPhoneImagesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    phoneImages: ").append(toIndentedString(phoneImages)).append("\n");
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
