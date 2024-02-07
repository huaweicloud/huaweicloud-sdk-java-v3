package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建分子聚类作业请求体
 */
public class CreateClusterJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private String file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_dir")

    private String outputDir;

    public CreateClusterJobReq withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 聚类方法,当前仅支持hiq_mc
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public CreateClusterJobReq withFile(String file) {
        this.file = file;
        return this;
    }

    /**
     * 分子聚类源数据
     * @return file
     */
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public CreateClusterJobReq withOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * 分子聚类输出结果
     * @return outputDir
     */
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterJobReq that = (CreateClusterJobReq) obj;
        return Objects.equals(this.method, that.method) && Objects.equals(this.file, that.file)
            && Objects.equals(this.outputDir, that.outputDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, file, outputDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterJobReq {\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    outputDir: ").append(toIndentedString(outputDir)).append("\n");
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
