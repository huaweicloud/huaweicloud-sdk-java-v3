package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实景三维精修后处理成果数据详情。
 */
public class Real3DRefineProductDetailVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_size_byte")

    private Double storageSizeByte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<String> files = null;

    public Real3DRefineProductDetailVO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 文件类型。nerf_osgb: 输出三维预览OSGB文件。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Real3DRefineProductDetailVO withStorageSizeByte(Double storageSizeByte) {
        this.storageSizeByte = storageSizeByte;
        return this;
    }

    /**
     * 文件占用存储空间大小（字节）。
     * @return storageSizeByte
     */
    public Double getStorageSizeByte() {
        return storageSizeByte;
    }

    public void setStorageSizeByte(Double storageSizeByte) {
        this.storageSizeByte = storageSizeByte;
    }

    public Real3DRefineProductDetailVO withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    public Real3DRefineProductDetailVO addFilesItem(String filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public Real3DRefineProductDetailVO withFiles(Consumer<List<String>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 文件列表。
     * @return files
     */
    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Real3DRefineProductDetailVO that = (Real3DRefineProductDetailVO) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.storageSizeByte, that.storageSizeByte)
            && Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, storageSizeByte, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Real3DRefineProductDetailVO {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    storageSizeByte: ").append(toIndentedString(storageSizeByte)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
