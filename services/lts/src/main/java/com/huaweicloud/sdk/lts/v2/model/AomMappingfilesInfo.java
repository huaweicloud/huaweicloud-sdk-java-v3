package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AomMappingfilesInfo
 */
public class AomMappingfilesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_info")

    private AomMappingLogStreamInfo logStreamInfo;

    public AomMappingfilesInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 路径名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public AomMappingfilesInfo withLogStreamInfo(AomMappingLogStreamInfo logStreamInfo) {
        this.logStreamInfo = logStreamInfo;
        return this;
    }

    public AomMappingfilesInfo withLogStreamInfo(Consumer<AomMappingLogStreamInfo> logStreamInfoSetter) {
        if (this.logStreamInfo == null) {
            this.logStreamInfo = new AomMappingLogStreamInfo();
            logStreamInfoSetter.accept(this.logStreamInfo);
        }

        return this;
    }

    /**
     * Get logStreamInfo
     * @return logStreamInfo
     */
    public AomMappingLogStreamInfo getLogStreamInfo() {
        return logStreamInfo;
    }

    public void setLogStreamInfo(AomMappingLogStreamInfo logStreamInfo) {
        this.logStreamInfo = logStreamInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AomMappingfilesInfo aomMappingfilesInfo = (AomMappingfilesInfo) o;
        return Objects.equals(this.fileName, aomMappingfilesInfo.fileName)
            && Objects.equals(this.logStreamInfo, aomMappingfilesInfo.logStreamInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, logStreamInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AomMappingfilesInfo {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    logStreamInfo: ").append(toIndentedString(logStreamInfo)).append("\n");
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
