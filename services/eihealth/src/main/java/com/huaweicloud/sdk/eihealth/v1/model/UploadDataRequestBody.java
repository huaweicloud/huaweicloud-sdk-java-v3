package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UploadDataRequestBody
 */
public class UploadDataRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_folder")

    private String targetFolder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_number")

    private String partNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_part")

    private String totalPart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multipart_id")

    private String multipartId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "md5")

    private String md5;

    public UploadDataRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    /**
     * 文件流对象
     * @return file
     */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    public UploadDataRequestBody withTargetFolder(String targetFolder) {
        this.targetFolder = targetFolder;
        return this;
    }

    /**
     * 目标文件夹
     * @return targetFolder
     */
    public String getTargetFolder() {
        return targetFolder;
    }

    public void setTargetFolder(String targetFolder) {
        this.targetFolder = targetFolder;
    }

    public UploadDataRequestBody withPartNumber(String partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * 分段序号，表示第几个文件片段
     * @return partNumber
     */
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public UploadDataRequestBody withTotalPart(String totalPart) {
        this.totalPart = totalPart;
        return this;
    }

    /**
     * 分段总数，上传的文件总共分成了几个片段
     * @return totalPart
     */
    public String getTotalPart() {
        return totalPart;
    }

    public void setTotalPart(String totalPart) {
        this.totalPart = totalPart;
    }

    public UploadDataRequestBody withMultipartId(String multipartId) {
        this.multipartId = multipartId;
        return this;
    }

    /**
     * 分段上传任务id，除了第一个片段外，后续的片段都需要标识出任务id
     * @return multipartId
     */
    public String getMultipartId() {
        return multipartId;
    }

    public void setMultipartId(String multipartId) {
        this.multipartId = multipartId;
    }

    public UploadDataRequestBody withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public UploadDataRequestBody withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * MD5
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public UploadDataRequestBody withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public UploadDataRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public UploadDataRequestBody withFile(InputStream inputStream, String fileName, Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("file", file);
                if (targetFolder != null) {
                    put("target_folder", new FormDataPart<>(targetFolder));
                }
                if (partNumber != null) {
                    put("part_number", new FormDataPart<>(partNumber));
                }
                if (totalPart != null) {
                    put("total_part", new FormDataPart<>(totalPart));
                }
                if (multipartId != null) {
                    put("multipart_id", new FormDataPart<>(multipartId));
                }
                if (fileName != null) {
                    put("file_name", new FormDataPart<>(fileName));
                }
                if (md5 != null) {
                    put("md5", new FormDataPart<>(md5));
                }
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadDataRequestBody that = (UploadDataRequestBody) obj;
        return Objects.equals(this.file, that.file) && Objects.equals(this.targetFolder, that.targetFolder)
            && Objects.equals(this.partNumber, that.partNumber) && Objects.equals(this.totalPart, that.totalPart)
            && Objects.equals(this.multipartId, that.multipartId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.md5, that.md5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, targetFolder, partNumber, totalPart, multipartId, fileName, md5);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadDataRequestBody {\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    targetFolder: ").append(toIndentedString(targetFolder)).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
        sb.append("    totalPart: ").append(toIndentedString(totalPart)).append("\n");
        sb.append("    multipartId: ").append(toIndentedString(multipartId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
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
