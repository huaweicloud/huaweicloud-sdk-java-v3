package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** MbTaskParameter */
public class MbTaskParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_description")

    private String statusDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_filename")

    private String outputFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private MetaData metadata;

    public MbTaskParameter withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }

    /** 具体状态描述，FAILED时可用于分析问题。
     * 
     * @return statusDescription */
    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public MbTaskParameter withOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
        return this;
    }

    /** 输出文件名称。
     * 
     * @return outputFilename */
    public String getOutputFilename() {
        return outputFilename;
    }

    public void setOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
    }

    public MbTaskParameter withMetadata(MetaData metadata) {
        this.metadata = metadata;
        return this;
    }

    public MbTaskParameter withMetadata(Consumer<MetaData> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new MetaData();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /** Get metadata
     * 
     * @return metadata */
    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MbTaskParameter mbTaskParameter = (MbTaskParameter) o;
        return Objects.equals(this.statusDescription, mbTaskParameter.statusDescription)
            && Objects.equals(this.outputFilename, mbTaskParameter.outputFilename)
            && Objects.equals(this.metadata, mbTaskParameter.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusDescription, outputFilename, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MbTaskParameter {\n");
        sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
        sb.append("    outputFilename: ").append(toIndentedString(outputFilename)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
