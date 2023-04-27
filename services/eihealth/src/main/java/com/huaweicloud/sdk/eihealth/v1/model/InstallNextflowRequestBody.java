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
 * InstallNextflowRequestBody
 */
public class InstallNextflowRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_number")

    private Integer partNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_part")

    private Integer totalPart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multipart_id")

    private String multipartId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public InstallNextflowRequestBody withFile(FormDataFilePart file) {
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

    public InstallNextflowRequestBody withPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * 分段序号，表示第几个文件片段
     * minimum: 1
     * maximum: 128
     * @return partNumber
     */
    public Integer getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    public InstallNextflowRequestBody withTotalPart(Integer totalPart) {
        this.totalPart = totalPart;
        return this;
    }

    /**
     * 分段总数，上传的文件总共分成了几个片段
     * minimum: 1
     * maximum: 128
     * @return totalPart
     */
    public Integer getTotalPart() {
        return totalPart;
    }

    public void setTotalPart(Integer totalPart) {
        this.totalPart = totalPart;
    }

    public InstallNextflowRequestBody withMultipartId(String multipartId) {
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

    public InstallNextflowRequestBody withFileName(String fileName) {
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

    public InstallNextflowRequestBody withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public InstallNextflowRequestBody withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public InstallNextflowRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public InstallNextflowRequestBody withFile(InputStream inputStream, String fileName, Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                if (file != null) {
                    put("file", file);
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
                if (version != null) {
                    put("version", new FormDataPart<>(version));
                }
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstallNextflowRequestBody installNextflowRequestBody = (InstallNextflowRequestBody) o;
        return Objects.equals(this.file, installNextflowRequestBody.file)
            && Objects.equals(this.partNumber, installNextflowRequestBody.partNumber)
            && Objects.equals(this.totalPart, installNextflowRequestBody.totalPart)
            && Objects.equals(this.multipartId, installNextflowRequestBody.multipartId)
            && Objects.equals(this.fileName, installNextflowRequestBody.fileName)
            && Objects.equals(this.version, installNextflowRequestBody.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, partNumber, totalPart, multipartId, fileName, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstallNextflowRequestBody {\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
        sb.append("    totalPart: ").append(toIndentedString(totalPart)).append("\n");
        sb.append("    multipartId: ").append(toIndentedString(multipartId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
