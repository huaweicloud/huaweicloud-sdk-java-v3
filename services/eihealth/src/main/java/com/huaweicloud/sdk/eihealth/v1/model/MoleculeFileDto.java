package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MoleculeFileDto
 */
public class MoleculeFileDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private MoleculeFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public MoleculeFileDto withFile(MoleculeFile file) {
        this.file = file;
        return this;
    }

    public MoleculeFileDto withFile(Consumer<MoleculeFile> fileSetter) {
        if (this.file == null) {
            this.file = new MoleculeFile();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public MoleculeFile getFile() {
        return file;
    }

    public void setFile(MoleculeFile file) {
        this.file = file;
    }

    public MoleculeFileDto withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 分子个数
     * minimum: 1
     * maximum: 1000000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MoleculeFileDto that = (MoleculeFileDto) obj;
        return Objects.equals(this.file, that.file) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoleculeFileDto {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
