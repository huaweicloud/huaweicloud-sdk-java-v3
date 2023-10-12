package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DefaultCertsResource
 */
public class DefaultCertsResource {

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
    @JsonProperty(value = "column")

    private String column;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    public DefaultCertsResource withFileName(String fileName) {
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

    public DefaultCertsResource withFileLocation(String fileLocation) {
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

    public DefaultCertsResource withStatus(String status) {
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

    public DefaultCertsResource withColumn(String column) {
        this.column = column;
        return this;
    }

    /**
     * 描述列。
     * @return column
     */
    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public DefaultCertsResource withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 证书描述。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultCertsResource that = (DefaultCertsResource) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileLocation, that.fileLocation)
            && Objects.equals(this.status, that.status) && Objects.equals(this.column, that.column)
            && Objects.equals(this.desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileLocation, status, column, desc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefaultCertsResource {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileLocation: ").append(toIndentedString(fileLocation)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
