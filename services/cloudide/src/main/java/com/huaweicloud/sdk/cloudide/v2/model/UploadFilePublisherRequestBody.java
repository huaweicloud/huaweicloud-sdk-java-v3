package com.huaweicloud.sdk.cloudide.v2.model;

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
 * UploadFilePublisherRequestBody
 */
public class UploadFilePublisherRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_id")

    private String publisherId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chunk_index")

    private Long chunkIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge")

    private Boolean merge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_chunk_num")

    private Long totalChunkNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_file_size")

    private Long parentFileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_file_name")

    private String parentFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override")

    private Boolean override;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chunk_md5")

    private String chunkMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_file_sha256")

    private String parentFileSha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public UploadFilePublisherRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    /**
     * 文件
     * @return file
     */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    public UploadFilePublisherRequestBody withPublisherId(String publisherId) {
        this.publisherId = publisherId;
        return this;
    }

    /**
     * 传用户token时，此字段为必传项
     * @return publisherId
     */
    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public UploadFilePublisherRequestBody withChunkIndex(Long chunkIndex) {
        this.chunkIndex = chunkIndex;
        return this;
    }

    /**
     * 分片索引，第几个分片 取值范围：1-100
     * minimum: 1
     * maximum: 100
     * @return chunkIndex
     */
    public Long getChunkIndex() {
        return chunkIndex;
    }

    public void setChunkIndex(Long chunkIndex) {
        this.chunkIndex = chunkIndex;
    }

    public UploadFilePublisherRequestBody withMerge(Boolean merge) {
        this.merge = merge;
        return this;
    }

    /**
     * 是否合并已上传的分片（包含本次分片内容）,true
     * @return merge
     */
    public Boolean getMerge() {
        return merge;
    }

    public void setMerge(Boolean merge) {
        this.merge = merge;
    }

    public UploadFilePublisherRequestBody withTotalChunkNum(Long totalChunkNum) {
        this.totalChunkNum = totalChunkNum;
        return this;
    }

    /**
     * 总分片数 0-100
     * minimum: 1
     * maximum: 100
     * @return totalChunkNum
     */
    public Long getTotalChunkNum() {
        return totalChunkNum;
    }

    public void setTotalChunkNum(Long totalChunkNum) {
        this.totalChunkNum = totalChunkNum;
    }

    public UploadFilePublisherRequestBody withParentFileSize(Long parentFileSize) {
        this.parentFileSize = parentFileSize;
        return this;
    }

    /**
     * 父文件大小
     * minimum: 0
     * maximum: 9223372036854775807
     * @return parentFileSize
     */
    public Long getParentFileSize() {
        return parentFileSize;
    }

    public void setParentFileSize(Long parentFileSize) {
        this.parentFileSize = parentFileSize;
    }

    public UploadFilePublisherRequestBody withParentFileName(String parentFileName) {
        this.parentFileName = parentFileName;
        return this;
    }

    /**
     * 父文件名称
     * @return parentFileName
     */
    public String getParentFileName() {
        return parentFileName;
    }

    public void setParentFileName(String parentFileName) {
        this.parentFileName = parentFileName;
    }

    public UploadFilePublisherRequestBody withOverride(Boolean override) {
        this.override = override;
        return this;
    }

    /**
     * 是否覆盖原有文件
     * @return override
     */
    public Boolean getOverride() {
        return override;
    }

    public void setOverride(Boolean override) {
        this.override = override;
    }

    public UploadFilePublisherRequestBody withChunkMd5(String chunkMd5) {
        this.chunkMd5 = chunkMd5;
        return this;
    }

    /**
     * 文件分片的md5,用于校验文件分片是否完整
     * @return chunkMd5
     */
    public String getChunkMd5() {
        return chunkMd5;
    }

    public void setChunkMd5(String chunkMd5) {
        this.chunkMd5 = chunkMd5;
    }

    public UploadFilePublisherRequestBody withParentFileSha256(String parentFileSha256) {
        this.parentFileSha256 = parentFileSha256;
        return this;
    }

    /**
     * 父文件hash，用于校验合并后的文件
     * @return parentFileSha256
     */
    public String getParentFileSha256() {
        return parentFileSha256;
    }

    public void setParentFileSha256(String parentFileSha256) {
        this.parentFileSha256 = parentFileSha256;
    }

    public UploadFilePublisherRequestBody withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 上传任务的唯一标识，第一次上传分片时可不传
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public UploadFilePublisherRequestBody withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public UploadFilePublisherRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public UploadFilePublisherRequestBody withFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("file", file);
                if (publisherId != null) {
                    put("publisher_id", new FormDataPart<>(publisherId));
                }
                put("chunk_index", new FormDataPart<>(chunkIndex));
                put("merge", new FormDataPart<>(merge));
                put("total_chunk_num", new FormDataPart<>(totalChunkNum));
                put("parent_file_size", new FormDataPart<>(parentFileSize));
                put("parent_file_name", new FormDataPart<>(parentFileName));
                put("override", new FormDataPart<>(override));
                put("chunk_md5", new FormDataPart<>(chunkMd5));
                if (parentFileSha256 != null) {
                    put("parent_file_sha256", new FormDataPart<>(parentFileSha256));
                }
                if (taskId != null) {
                    put("task_id", new FormDataPart<>(taskId));
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
        UploadFilePublisherRequestBody uploadFilePublisherRequestBody = (UploadFilePublisherRequestBody) o;
        return Objects.equals(this.file, uploadFilePublisherRequestBody.file)
            && Objects.equals(this.publisherId, uploadFilePublisherRequestBody.publisherId)
            && Objects.equals(this.chunkIndex, uploadFilePublisherRequestBody.chunkIndex)
            && Objects.equals(this.merge, uploadFilePublisherRequestBody.merge)
            && Objects.equals(this.totalChunkNum, uploadFilePublisherRequestBody.totalChunkNum)
            && Objects.equals(this.parentFileSize, uploadFilePublisherRequestBody.parentFileSize)
            && Objects.equals(this.parentFileName, uploadFilePublisherRequestBody.parentFileName)
            && Objects.equals(this.override, uploadFilePublisherRequestBody.override)
            && Objects.equals(this.chunkMd5, uploadFilePublisherRequestBody.chunkMd5)
            && Objects.equals(this.parentFileSha256, uploadFilePublisherRequestBody.parentFileSha256)
            && Objects.equals(this.taskId, uploadFilePublisherRequestBody.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file,
            publisherId,
            chunkIndex,
            merge,
            totalChunkNum,
            parentFileSize,
            parentFileName,
            override,
            chunkMd5,
            parentFileSha256,
            taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadFilePublisherRequestBody {\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    publisherId: ").append(toIndentedString(publisherId)).append("\n");
        sb.append("    chunkIndex: ").append(toIndentedString(chunkIndex)).append("\n");
        sb.append("    merge: ").append(toIndentedString(merge)).append("\n");
        sb.append("    totalChunkNum: ").append(toIndentedString(totalChunkNum)).append("\n");
        sb.append("    parentFileSize: ").append(toIndentedString(parentFileSize)).append("\n");
        sb.append("    parentFileName: ").append(toIndentedString(parentFileName)).append("\n");
        sb.append("    override: ").append(toIndentedString(override)).append("\n");
        sb.append("    chunkMd5: ").append(toIndentedString(chunkMd5)).append("\n");
        sb.append("    parentFileSha256: ").append(toIndentedString(parentFileSha256)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
