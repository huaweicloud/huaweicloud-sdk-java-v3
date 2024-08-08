package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配体设置
 */
public class TargetOptLigand {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private ProbeDrugFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_field")

    private String forceField;

    public TargetOptLigand withFile(ProbeDrugFile file) {
        this.file = file;
        return this;
    }

    public TargetOptLigand withFile(Consumer<ProbeDrugFile> fileSetter) {
        if (this.file == null) {
            this.file = new ProbeDrugFile();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public ProbeDrugFile getFile() {
        return file;
    }

    public void setFile(ProbeDrugFile file) {
        this.file = file;
    }

    public TargetOptLigand withForceField(String forceField) {
        this.forceField = forceField;
        return this;
    }

    /**
     * 配体力场, 支持选择gaff, gaff2
     * @return forceField
     */
    public String getForceField() {
        return forceField;
    }

    public void setForceField(String forceField) {
        this.forceField = forceField;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetOptLigand that = (TargetOptLigand) obj;
        return Objects.equals(this.file, that.file) && Objects.equals(this.forceField, that.forceField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, forceField);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetOptLigand {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    forceField: ").append(toIndentedString(forceField)).append("\n");
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
