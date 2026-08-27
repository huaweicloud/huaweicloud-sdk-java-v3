package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SaveAlgorithmFileRequestBody
 */
public class SaveAlgorithmFileRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private BigDecimal lastUpdateTime;

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    public SaveAlgorithmFileRequestBody withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件存储路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public SaveAlgorithmFileRequestBody withLastUpdateTime(BigDecimal lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 算法的最后更新时间
     * minimum: 0
     * maximum: 9999999999999
     * @return lastUpdateTime
     */
    public BigDecimal getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(BigDecimal lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public SaveAlgorithmFileRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    /**
     * **参数解释**： 待上传文件。 **约束限制**： 不涉及 **取值范围**： 5MB以内 **默认取值**： 不涉及 
     * @return file
     */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    public SaveAlgorithmFileRequestBody withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public SaveAlgorithmFileRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public SaveAlgorithmFileRequestBody withFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("file_path", new FormDataPart<>(filePath));
                put("last_update_time", new FormDataPart<>(lastUpdateTime));
                put("file", file);
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
        SaveAlgorithmFileRequestBody that = (SaveAlgorithmFileRequestBody) obj;
        return Objects.equals(this.filePath, that.filePath) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.file, that.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath, lastUpdateTime, file);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveAlgorithmFileRequestBody {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
