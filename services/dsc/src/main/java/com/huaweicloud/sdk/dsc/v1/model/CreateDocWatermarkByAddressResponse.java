package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateDocWatermarkByAddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermarked_file")

    private String watermarkedFile;

    public CreateDocWatermarkByAddressResponse withRegionId(String regionId) {
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

    public CreateDocWatermarkByAddressResponse withWatermarkedFile(String watermarkedFile) {
        this.watermarkedFile = watermarkedFile;
        return this;
    }

    /**
     * 添加水印后的文档地址，当前只支持华为云OBS对象，格式为 **obs://bucket/object** ，其中bucket为和当前项目处于同一区域的OBS桶名称，object为对象全路径名。例如：**obs://hwbucket/hwinfo/hw.doc**，其中obs://表示OBS存储，hwbucket为桶名，hwinfo/hw.doc为对象全路径名。
     * @return watermarkedFile
     */
    public String getWatermarkedFile() {
        return watermarkedFile;
    }

    public void setWatermarkedFile(String watermarkedFile) {
        this.watermarkedFile = watermarkedFile;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDocWatermarkByAddressResponse createDocWatermarkByAddressResponse =
            (CreateDocWatermarkByAddressResponse) o;
        return Objects.equals(this.regionId, createDocWatermarkByAddressResponse.regionId)
            && Objects.equals(this.watermarkedFile, createDocWatermarkByAddressResponse.watermarkedFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, watermarkedFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDocWatermarkByAddressResponse {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    watermarkedFile: ").append(toIndentedString(watermarkedFile)).append("\n");
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
