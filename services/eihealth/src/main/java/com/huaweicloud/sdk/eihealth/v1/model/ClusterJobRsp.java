package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分子聚类结果
 */
public class ClusterJobRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_dir")

    private String outputDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reasons")

    private List<FailedReasonRecord> failedReasons = null;

    public ClusterJobRsp withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 分子聚类方法
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ClusterJobRsp withOutputDir(String outputDir) {
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

    public ClusterJobRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业结果信息
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClusterJobRsp withFailedReasons(List<FailedReasonRecord> failedReasons) {
        this.failedReasons = failedReasons;
        return this;
    }

    public ClusterJobRsp addFailedReasonsItem(FailedReasonRecord failedReasonsItem) {
        if (this.failedReasons == null) {
            this.failedReasons = new ArrayList<>();
        }
        this.failedReasons.add(failedReasonsItem);
        return this;
    }

    public ClusterJobRsp withFailedReasons(Consumer<List<FailedReasonRecord>> failedReasonsSetter) {
        if (this.failedReasons == null) {
            this.failedReasons = new ArrayList<>();
        }
        failedReasonsSetter.accept(this.failedReasons);
        return this;
    }

    /**
     * 部分失败原因和数量
     * @return failedReasons
     */
    public List<FailedReasonRecord> getFailedReasons() {
        return failedReasons;
    }

    public void setFailedReasons(List<FailedReasonRecord> failedReasons) {
        this.failedReasons = failedReasons;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterJobRsp that = (ClusterJobRsp) obj;
        return Objects.equals(this.method, that.method) && Objects.equals(this.outputDir, that.outputDir)
            && Objects.equals(this.status, that.status) && Objects.equals(this.failedReasons, that.failedReasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, outputDir, status, failedReasons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterJobRsp {\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    outputDir: ").append(toIndentedString(outputDir)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failedReasons: ").append(toIndentedString(failedReasons)).append("\n");
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
