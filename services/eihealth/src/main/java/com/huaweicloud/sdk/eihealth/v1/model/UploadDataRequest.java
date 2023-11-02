package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UploadDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_folder")

    private String targetFolder;

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
    @JsonProperty(value = "md5")

    private String md5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UploadDataRequestBody body;

    public UploadDataRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 平台项目ID，您可以在平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public UploadDataRequest withTargetFolder(String targetFolder) {
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

    public UploadDataRequest withPartNumber(Integer partNumber) {
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

    public UploadDataRequest withTotalPart(Integer totalPart) {
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

    public UploadDataRequest withMultipartId(String multipartId) {
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

    public UploadDataRequest withFileName(String fileName) {
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

    public UploadDataRequest withMd5(String md5) {
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

    public UploadDataRequest withBody(UploadDataRequestBody body) {
        this.body = body;
        return this;
    }

    public UploadDataRequest withBody(Consumer<UploadDataRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UploadDataRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UploadDataRequestBody getBody() {
        return body;
    }

    public void setBody(UploadDataRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadDataRequest that = (UploadDataRequest) obj;
        return Objects.equals(this.eihealthProjectId, that.eihealthProjectId)
            && Objects.equals(this.targetFolder, that.targetFolder) && Objects.equals(this.partNumber, that.partNumber)
            && Objects.equals(this.totalPart, that.totalPart) && Objects.equals(this.multipartId, that.multipartId)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.md5, that.md5)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, targetFolder, partNumber, totalPart, multipartId, fileName, md5, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadDataRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    targetFolder: ").append(toIndentedString(targetFolder)).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
        sb.append("    totalPart: ").append(toIndentedString(totalPart)).append("\n");
        sb.append("    multipartId: ").append(toIndentedString(multipartId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
