package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ShowImageWatermarkByAddressRequestBody */
public class ShowImageWatermarkByAddressRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_file")

    private String srcFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mark_len")

    private Integer markLen;

    public ShowImageWatermarkByAddressRequestBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /** 项目所在region的id，如北京一为：cn-north-1。
     * 
     * @return regionId */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowImageWatermarkByAddressRequestBody withSrcFile(String srcFile) {
        this.srcFile = srcFile;
        return this;
    }

    /** 待提取文字暗水印的图片地址，当前只支持华为云OBS，格式为 **obs://bucket/object**
     * ，其中bucket为和当前项目处于同一区域的OBS桶名称，object为对象全路径名。例如：**obs://hwbucket/hwinfo/hw.png**，其中obs://表示OBS存储，hwbucket为桶名，hwinfo/hw.png为对象全路径名。
     * 
     * @return srcFile */
    public String getSrcFile() {
        return srcFile;
    }

    public void setSrcFile(String srcFile) {
        this.srcFile = srcFile;
    }

    public ShowImageWatermarkByAddressRequestBody withMarkLen(Integer markLen) {
        this.markLen = markLen;
        return this;
    }

    /** 指定待提取水印的长度，最小0，最大32.。设置后可以提升水印提取性能。 minimum: 0 maximum: 32
     * 
     * @return markLen */
    public Integer getMarkLen() {
        return markLen;
    }

    public void setMarkLen(Integer markLen) {
        this.markLen = markLen;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowImageWatermarkByAddressRequestBody showImageWatermarkByAddressRequestBody =
            (ShowImageWatermarkByAddressRequestBody) o;
        return Objects.equals(this.regionId, showImageWatermarkByAddressRequestBody.regionId)
            && Objects.equals(this.srcFile, showImageWatermarkByAddressRequestBody.srcFile)
            && Objects.equals(this.markLen, showImageWatermarkByAddressRequestBody.markLen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, srcFile, markLen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageWatermarkByAddressRequestBody {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    srcFile: ").append(toIndentedString(srcFile)).append("\n");
        sb.append("    markLen: ").append(toIndentedString(markLen)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
