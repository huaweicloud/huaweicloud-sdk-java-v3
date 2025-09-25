package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 证书记录。
 */
public class CertsRecordsDatastore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileLocation")

    private String fileLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileName")

    private Boolean fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateAt")

    private Boolean updateAt;

    public CertsRecordsDatastore withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 证书记录ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CertsRecordsDatastore withStatus(String status) {
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

    public CertsRecordsDatastore withFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }

    /**
     * 证书记录文件位置。
     * @return fileLocation
     */
    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public CertsRecordsDatastore withFileName(Boolean fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 证书记录文件名称。
     * @return fileName
     */
    public Boolean getFileName() {
        return fileName;
    }

    public void setFileName(Boolean fileName) {
        this.fileName = fileName;
    }

    public CertsRecordsDatastore withUpdateAt(Boolean updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 证书记录更新时间。
     * @return updateAt
     */
    public Boolean getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Boolean updateAt) {
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
        CertsRecordsDatastore that = (CertsRecordsDatastore) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.fileLocation, that.fileLocation) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, fileLocation, fileName, updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertsRecordsDatastore {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    fileLocation: ").append(toIndentedString(fileLocation)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
