package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ShowImageWatermarkWithImageByAddressRequestBody
 */
public class ShowImageWatermarkWithImageByAddressRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    @JacksonXmlProperty(localName = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_file")

    @JacksonXmlProperty(localName = "src_file")

    private String srcFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_watermark")

    @JacksonXmlProperty(localName = "image_watermark")

    private String imageWatermark;

    public ShowImageWatermarkWithImageByAddressRequestBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 项目所在region的id，如北京一为：cn-north-1。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowImageWatermarkWithImageByAddressRequestBody withSrcFile(String srcFile) {
        this.srcFile = srcFile;
        return this;
    }

    /**
     * 待提取图片暗水印的图片地址，当前只支持华为云OBS对象，格式为 **obs://bucket/object** ，其中bucket为和当前项目处于同一区域的OBS桶名称，object为对象全路径名。例如：**obs://hwbucket/hwinfo/hw.png**，其中obs://表示OBS存储，hwbucket为桶名，hwinfo/hw.png为对象全路径名。
     * @return srcFile
     */
    public String getSrcFile() {
        return srcFile;
    }

    public void setSrcFile(String srcFile) {
        this.srcFile = srcFile;
    }

    public ShowImageWatermarkWithImageByAddressRequestBody withImageWatermark(String imageWatermark) {
        this.imageWatermark = imageWatermark;
        return this;
    }

    /**
     * 提取出来的水印图片存放地址，格式要求同src_file。
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
        ShowImageWatermarkWithImageByAddressRequestBody showImageWatermarkWithImageByAddressRequestBody =
            (ShowImageWatermarkWithImageByAddressRequestBody) o;
        return Objects.equals(this.regionId, showImageWatermarkWithImageByAddressRequestBody.regionId)
            && Objects.equals(this.srcFile, showImageWatermarkWithImageByAddressRequestBody.srcFile)
            && Objects.equals(this.imageWatermark, showImageWatermarkWithImageByAddressRequestBody.imageWatermark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, srcFile, imageWatermark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageWatermarkWithImageByAddressRequestBody {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    srcFile: ").append(toIndentedString(srcFile)).append("\n");
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
