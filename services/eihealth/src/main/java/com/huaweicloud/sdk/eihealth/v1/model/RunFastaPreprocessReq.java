package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Fasta受体预览请求体
 */
public class RunFastaPreprocessReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private FastaReceptor file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preview_count")

    private Integer previewCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_limit")

    private Integer countLimit;

    public RunFastaPreprocessReq withFile(FastaReceptor file) {
        this.file = file;
        return this;
    }

    public RunFastaPreprocessReq withFile(Consumer<FastaReceptor> fileSetter) {
        if (this.file == null) {
            this.file = new FastaReceptor();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public FastaReceptor getFile() {
        return file;
    }

    public void setFile(FastaReceptor file) {
        this.file = file;
    }

    public RunFastaPreprocessReq withPreviewCount(Integer previewCount) {
        this.previewCount = previewCount;
        return this;
    }

    /**
     * 预览数量
     * minimum: 0
     * maximum: 100
     * @return previewCount
     */
    public Integer getPreviewCount() {
        return previewCount;
    }

    public void setPreviewCount(Integer previewCount) {
        this.previewCount = previewCount;
    }

    public RunFastaPreprocessReq withCountLimit(Integer countLimit) {
        this.countLimit = countLimit;
        return this;
    }

    /**
     * 计数上限
     * minimum: 0
     * maximum: 100
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
        RunFastaPreprocessReq that = (RunFastaPreprocessReq) obj;
        return Objects.equals(this.file, that.file) && Objects.equals(this.previewCount, that.previewCount)
            && Objects.equals(this.countLimit, that.countLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, previewCount, countLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunFastaPreprocessReq {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
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
