package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OutputFileInfo
 */
public class OutputFileInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_file_name")

    private String outputFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_description")

    private String execDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private SourceInfo metaData;

    public OutputFileInfo withOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
        return this;
    }

    /**
     * 输出文件名。 
     * @return outputFileName
     */
    public String getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    public OutputFileInfo withExecDescription(String execDescription) {
        this.execDescription = execDescription;
        return this;
    }

    /**
     * 处理信息。 
     * @return execDescription
     */
    public String getExecDescription() {
        return execDescription;
    }

    public void setExecDescription(String execDescription) {
        this.execDescription = execDescription;
    }

    public OutputFileInfo withMetaData(SourceInfo metaData) {
        this.metaData = metaData;
        return this;
    }

    public OutputFileInfo withMetaData(Consumer<SourceInfo> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new SourceInfo();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public SourceInfo getMetaData() {
        return metaData;
    }

    public void setMetaData(SourceInfo metaData) {
        this.metaData = metaData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OutputFileInfo that = (OutputFileInfo) obj;
        return Objects.equals(this.outputFileName, that.outputFileName)
            && Objects.equals(this.execDescription, that.execDescription)
            && Objects.equals(this.metaData, that.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outputFileName, execDescription, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputFileInfo {\n");
        sb.append("    outputFileName: ").append(toIndentedString(outputFileName)).append("\n");
        sb.append("    execDescription: ").append(toIndentedString(execDescription)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
