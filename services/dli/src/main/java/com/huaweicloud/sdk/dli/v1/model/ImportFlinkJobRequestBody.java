package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导入作业的请求参数。
 */
public class ImportFlinkJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zip_file")

    private String zipFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cover")

    private Boolean isCover;

    public ImportFlinkJobRequestBody withZipFile(String zipFile) {
        this.zipFile = zipFile;
        return this;
    }

    /**
     * OBS上导入作业zip文件路径，支持填写目录，导入目录下所有zip文件。
     * @return zipFile
     */
    public String getZipFile() {
        return zipFile;
    }

    public void setZipFile(String zipFile) {
        this.zipFile = zipFile;
    }

    public ImportFlinkJobRequestBody withIsCover(Boolean isCover) {
        this.isCover = isCover;
        return this;
    }

    /**
     * 若导入作业中存在与服务已有作业同名情况，是否将服务中已有作业覆盖。
     * @return isCover
     */
    public Boolean getIsCover() {
        return isCover;
    }

    public void setIsCover(Boolean isCover) {
        this.isCover = isCover;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportFlinkJobRequestBody importFlinkJobRequestBody = (ImportFlinkJobRequestBody) o;
        return Objects.equals(this.zipFile, importFlinkJobRequestBody.zipFile)
            && Objects.equals(this.isCover, importFlinkJobRequestBody.isCover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipFile, isCover);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportFlinkJobRequestBody {\n");
        sb.append("    zipFile: ").append(toIndentedString(zipFile)).append("\n");
        sb.append("    isCover: ").append(toIndentedString(isCover)).append("\n");
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
