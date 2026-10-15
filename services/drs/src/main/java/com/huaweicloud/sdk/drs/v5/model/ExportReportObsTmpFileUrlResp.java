package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导出文件OBS临时URI对象
 */
public class ExportReportObsTmpFileUrlResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_temp_uri")

    private String obsTempUri;

    public ExportReportObsTmpFileUrlResp withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ExportReportObsTmpFileUrlResp withObsTempUri(String obsTempUri) {
        this.obsTempUri = obsTempUri;
        return this;
    }

    /**
     * OBS文件临时URI
     * @return obsTempUri
     */
    public String getObsTempUri() {
        return obsTempUri;
    }

    public void setObsTempUri(String obsTempUri) {
        this.obsTempUri = obsTempUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportReportObsTmpFileUrlResp that = (ExportReportObsTmpFileUrlResp) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.obsTempUri, that.obsTempUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, obsTempUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportReportObsTmpFileUrlResp {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    obsTempUri: ").append(toIndentedString(obsTempUri)).append("\n");
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
