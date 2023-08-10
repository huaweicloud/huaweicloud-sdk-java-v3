package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配体3D结构
 */
public class LigandStructureDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compressed")

    private Boolean compressed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    public LigandStructureDto withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 配体格式，即文件后缀名
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public LigandStructureDto withCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }

    /**
     * 是否压缩
     * @return compressed
     */
    public Boolean getCompressed() {
        return compressed;
    }

    public void setCompressed(Boolean compressed) {
        this.compressed = compressed;
    }

    public LigandStructureDto withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 结构数据，如压缩则需要解码、解压处理（ASCII Encode -> Base64 Decode -> GZip Inflate -> UTF-8 Decode）以得到原始字符串；如未压缩则为原始字符串
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LigandStructureDto that = (LigandStructureDto) obj;
        return Objects.equals(this.format, that.format) && Objects.equals(this.compressed, that.compressed)
            && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, compressed, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LigandStructureDto {\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
