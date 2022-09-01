package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowImageWatermarkWithImageByAddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    @JacksonXmlProperty(localName = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_watermark")

    @JacksonXmlProperty(localName = "image_watermark")

    private String imageWatermark;

    public ShowImageWatermarkWithImageByAddressResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 当前项目所在region的id，如北京一为：cn-north-1。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowImageWatermarkWithImageByAddressResponse withImageWatermark(String imageWatermark) {
        this.imageWatermark = imageWatermark;
        return this;
    }

    /**
     * 提取出的水印图片存放地址，当前只支持华为云OBS对象，格式为 **obs://bucket/object** ，其中bucket为和当前项目处于同一区域的OBS桶名称，object为对象全路径名。例如：**obs://hwbucket/hwinfo/hw.png**，其中obs://表示OBS存储，hwbucket为桶名，hwinfo/hw.png为对象全路径名。
     * @return imageWatermark
     */
    public String getImageWatermark() {
        return imageWatermark;
    }

    public void setImageWatermark(String imageWatermark) {
        this.imageWatermark = imageWatermark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowImageWatermarkWithImageByAddressResponse showImageWatermarkWithImageByAddressResponse =
            (ShowImageWatermarkWithImageByAddressResponse) o;
        return Objects.equals(this.regionId, showImageWatermarkWithImageByAddressResponse.regionId)
            && Objects.equals(this.imageWatermark, showImageWatermarkWithImageByAddressResponse.imageWatermark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, imageWatermark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageWatermarkWithImageByAddressResponse {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    imageWatermark: ").append(toIndentedString(imageWatermark)).append("\n");
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
