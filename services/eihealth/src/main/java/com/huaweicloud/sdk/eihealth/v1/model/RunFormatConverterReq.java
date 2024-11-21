package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RunFormatConverterReq
 */
public class RunFormatConverterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private ConvertFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_format")

    private String inFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out_format")

    private String outFormat;

    public RunFormatConverterReq withFile(ConvertFile file) {
        this.file = file;
        return this;
    }

    public RunFormatConverterReq withFile(Consumer<ConvertFile> fileSetter) {
        if (this.file == null) {
            this.file = new ConvertFile();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public ConvertFile getFile() {
        return file;
    }

    public void setFile(ConvertFile file) {
        this.file = file;
    }

    public RunFormatConverterReq withInFormat(String inFormat) {
        this.inFormat = inFormat;
        return this;
    }

    /**
     * 待转换文件格式，支持PDB、SDF、MOL2、SMI。
     * @return inFormat
     */
    public String getInFormat() {
        return inFormat;
    }

    public void setInFormat(String inFormat) {
        this.inFormat = inFormat;
    }

    public RunFormatConverterReq withOutFormat(String outFormat) {
        this.outFormat = outFormat;
        return this;
    }

    /**
     * 转换后文件格式，支持PDB、SDF、MOL2、SMI。
     * @return outFormat
     */
    public String getOutFormat() {
        return outFormat;
    }

    public void setOutFormat(String outFormat) {
        this.outFormat = outFormat;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunFormatConverterReq that = (RunFormatConverterReq) obj;
        return Objects.equals(this.file, that.file) && Objects.equals(this.inFormat, that.inFormat)
            && Objects.equals(this.outFormat, that.outFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, inFormat, outFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunFormatConverterReq {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    inFormat: ").append(toIndentedString(inFormat)).append("\n");
        sb.append("    outFormat: ").append(toIndentedString(outFormat)).append("\n");
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
