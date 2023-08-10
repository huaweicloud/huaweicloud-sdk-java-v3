package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配体差异计算请求体
 */
public class CheckLigandDifferenceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private CheckLigandDifferenceMethod method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private DrugFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_file")

    private DrugFile refFile;

    public CheckLigandDifferenceReq withMethod(CheckLigandDifferenceMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get method
     * @return method
     */
    public CheckLigandDifferenceMethod getMethod() {
        return method;
    }

    public void setMethod(CheckLigandDifferenceMethod method) {
        this.method = method;
    }

    public CheckLigandDifferenceReq withFile(DrugFile file) {
        this.file = file;
        return this;
    }

    public CheckLigandDifferenceReq withFile(Consumer<DrugFile> fileSetter) {
        if (this.file == null) {
            this.file = new DrugFile();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public DrugFile getFile() {
        return file;
    }

    public void setFile(DrugFile file) {
        this.file = file;
    }

    public CheckLigandDifferenceReq withRefFile(DrugFile refFile) {
        this.refFile = refFile;
        return this;
    }

    public CheckLigandDifferenceReq withRefFile(Consumer<DrugFile> refFileSetter) {
        if (this.refFile == null) {
            this.refFile = new DrugFile();
            refFileSetter.accept(this.refFile);
        }

        return this;
    }

    /**
     * Get refFile
     * @return refFile
     */
    public DrugFile getRefFile() {
        return refFile;
    }

    public void setRefFile(DrugFile refFile) {
        this.refFile = refFile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckLigandDifferenceReq that = (CheckLigandDifferenceReq) obj;
        return Objects.equals(this.method, that.method) && Objects.equals(this.file, that.file)
            && Objects.equals(this.refFile, that.refFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, file, refFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckLigandDifferenceReq {\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    refFile: ").append(toIndentedString(refFile)).append("\n");
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
