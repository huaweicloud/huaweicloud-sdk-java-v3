package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowCertsDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileName")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileLocation")

    private String fileLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateAt")

    private String updateAt;

    public ShowCertsDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 证书id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowCertsDetailResponse withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 证书名称。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ShowCertsDetailResponse withFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }

    /**
     * 证书路径。
     * @return fileLocation
     */
    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public ShowCertsDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 证书状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowCertsDetailResponse withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 证书上传时间。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCertsDetailResponse that = (ShowCertsDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.fileLocation, that.fileLocation) && Objects.equals(this.status, that.status)
            && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fileName, fileLocation, status, updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertsDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileLocation: ").append(toIndentedString(fileLocation)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
