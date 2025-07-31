package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUploadFilesRequestBody
 */
public class BatchUploadFilesRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_type")

    private String uploadType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<MultipartFile> files = null;

    public BatchUploadFilesRequestBody withUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }

    /**
     * **参数解释**: 上传文件类型 **约束限制**: 不涉及 **取值范围**: - dockerfile：Dockerfile文件。如果所有文件上传成功，接口返回文件名称和文件ID列表，服务保存上传的文件。如果批量上传的文件中存在上传失败的文件，接口返回上传成功和失败的文件信息，所有文件都不会被服务保存。 - k8s_yaml：k8s yaml文件。如果所有文件上传成功，接口返回文件名称和文件ID列表，服务保存上传的文件。如果批量上传的文件中存在上传失败的文件，接口返回上传成功和失败的文件信息，所有文件都不会被服务保存。  **默认取值**: 不涉及 
     * @return uploadType
     */
    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }

    public BatchUploadFilesRequestBody withFiles(List<MultipartFile> files) {
        this.files = files;
        return this;
    }

    public BatchUploadFilesRequestBody addFilesItem(MultipartFile filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public BatchUploadFilesRequestBody withFiles(Consumer<List<MultipartFile>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * **参数解释**: 上传的文件，支持批量上传 **约束限制**: 上传文件需要与upload_type的类型对应 **取值范围**: 单文件支持最大1M，10个。  **默认取值**: 不涉及 
     * @return files
     */
    public List<MultipartFile> getFiles() {
        return files;
    }

    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("upload_type", new FormDataPart<>(uploadType));
                put("files", new FormDataPart<>(files));
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
        BatchUploadFilesRequestBody that = (BatchUploadFilesRequestBody) obj;
        return Objects.equals(this.uploadType, that.uploadType) && Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadType, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUploadFilesRequestBody {\n");
        sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
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
