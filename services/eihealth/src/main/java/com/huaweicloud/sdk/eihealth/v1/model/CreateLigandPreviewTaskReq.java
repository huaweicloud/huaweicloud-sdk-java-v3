package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建配体预览任务请求体
 */
public class CreateLigandPreviewTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand_file")

    private DrugFile ligandFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preview_count")

    private Integer previewCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_limit")

    private Integer countLimit;

    public CreateLigandPreviewTaskReq withLigandFile(DrugFile ligandFile) {
        this.ligandFile = ligandFile;
        return this;
    }

    public CreateLigandPreviewTaskReq withLigandFile(Consumer<DrugFile> ligandFileSetter) {
        if (this.ligandFile == null) {
            this.ligandFile = new DrugFile();
            ligandFileSetter.accept(this.ligandFile);
        }

        return this;
    }

    /**
     * Get ligandFile
     * @return ligandFile
     */
    public DrugFile getLigandFile() {
        return ligandFile;
    }

    public void setLigandFile(DrugFile ligandFile) {
        this.ligandFile = ligandFile;
    }

    public CreateLigandPreviewTaskReq withPreviewCount(Integer previewCount) {
        this.previewCount = previewCount;
        return this;
    }

    /**
     * 预览数量，若分子数量大于预览数量，则超出预览数量部分只做计数
     * minimum: 0
     * maximum: 1000
     * @return previewCount
     */
    public Integer getPreviewCount() {
        return previewCount;
    }

    public void setPreviewCount(Integer previewCount) {
        this.previewCount = previewCount;
    }

    public CreateLigandPreviewTaskReq withCountLimit(Integer countLimit) {
        this.countLimit = countLimit;
        return this;
    }

    /**
     * 计数上限，若分子数量大于计数上限，则终止计数并在结果中标明计数不完整（has_more=true），计数数量应不小于preview_count
     * minimum: 0
     * maximum: 1000000
     * @return countLimit
     */
    public Integer getCountLimit() {
        return countLimit;
    }

    public void setCountLimit(Integer countLimit) {
        this.countLimit = countLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLigandPreviewTaskReq that = (CreateLigandPreviewTaskReq) obj;
        return Objects.equals(this.ligandFile, that.ligandFile) && Objects.equals(this.previewCount, that.previewCount)
            && Objects.equals(this.countLimit, that.countLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ligandFile, previewCount, countLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLigandPreviewTaskReq {\n");
        sb.append("    ligandFile: ").append(toIndentedString(ligandFile)).append("\n");
        sb.append("    previewCount: ").append(toIndentedString(previewCount)).append("\n");
        sb.append("    countLimit: ").append(toIndentedString(countLimit)).append("\n");
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
