package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateImageWatermarkByAddressRequestBody
 */
public class CreateImageWatermarkByAddressRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_file")

    private String srcFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blind_watermark")

    private String blindWatermark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_watermark")

    private String imageWatermark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_file")

    private String dstFile;

    public CreateImageWatermarkByAddressRequestBody withRegionId(String regionId) {
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

    public CreateImageWatermarkByAddressRequestBody withSrcFile(String srcFile) {
        this.srcFile = srcFile;
        return this;
    }

    /**
     * 待加暗水印的图片地址，当前只支持华为云OBS文件，格式为 **obs://bucket/object** ，其中bucket为和当前项目处于同一区域的OBS桶名称，object为对象全路径名。例如：**obs://hwbucket/hwinfo/hw.png**，其中obs://表示OBS存储，hwbucket为桶名，hwinfo/hw.png为对象全路径名。
     * @return srcFile
     */
    public String getSrcFile() {
        return srcFile;
    }

    public void setSrcFile(String srcFile) {
        this.srcFile = srcFile;
    }

    public CreateImageWatermarkByAddressRequestBody withBlindWatermark(String blindWatermark) {
        this.blindWatermark = blindWatermark;
        return this;
    }

    /**
     * 待嵌入的文字暗水印内容，长度不超过32个字符。当前仅支持数字及英文大小写。与图片暗水印image_watermark二选一。
     * @return blindWatermark
     */
    public String getBlindWatermark() {
        return blindWatermark;
    }

    public void setBlindWatermark(String blindWatermark) {
        this.blindWatermark = blindWatermark;
    }

    public CreateImageWatermarkByAddressRequestBody withImageWatermark(String imageWatermark) {
        this.imageWatermark = imageWatermark;
        return this;
    }

    /**
     * 待嵌入的图片暗水印地址，格式要求同src_file字段，与文字暗水印 blind_watermark 二选一，都填写时，生效image_watermark。
     * @return imageWatermark
     */
    public String getImageWatermark() {
        return imageWatermark;
    }

    public void setImageWatermark(String imageWatermark) {
        this.imageWatermark = imageWatermark;
    }

    public CreateImageWatermarkByAddressRequestBody withDstFile(String dstFile) {
        this.dstFile = dstFile;
        return this;
    }

    /**
     * 添加水印后的图片存放的地址，格式要求同src_file字段，不设置时，默认取src_file的值，即添加水印后覆盖原文件。
     * @return dstFile
     */
    public String getDstFile() {
        return dstFile;
    }

    public void setDstFile(String dstFile) {
        this.dstFile = dstFile;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateImageWatermarkByAddressRequestBody createImageWatermarkByAddressRequestBody =
            (CreateImageWatermarkByAddressRequestBody) o;
        return Objects.equals(this.regionId, createImageWatermarkByAddressRequestBody.regionId)
            && Objects.equals(this.srcFile, createImageWatermarkByAddressRequestBody.srcFile)
            && Objects.equals(this.blindWatermark, createImageWatermarkByAddressRequestBody.blindWatermark)
            && Objects.equals(this.imageWatermark, createImageWatermarkByAddressRequestBody.imageWatermark)
            && Objects.equals(this.dstFile, createImageWatermarkByAddressRequestBody.dstFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, srcFile, blindWatermark, imageWatermark, dstFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateImageWatermarkByAddressRequestBody {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    srcFile: ").append(toIndentedString(srcFile)).append("\n");
        sb.append("    blindWatermark: ").append(toIndentedString(blindWatermark)).append("\n");
        sb.append("    imageWatermark: ").append(toIndentedString(imageWatermark)).append("\n");
        sb.append("    dstFile: ").append(toIndentedString(dstFile)).append("\n");
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
