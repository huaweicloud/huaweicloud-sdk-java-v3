package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SQL脚本查询结果信息，包含结果格式和存储路径。 
 */
public class SparkSqlScriptingResultResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_format")

    private String resultFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_path")

    private String resultPath;

    public SparkSqlScriptingResultResponse withResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
        return this;
    }

    /**
     * **参数解释**：查询类SQL结果格式，用于指定结果数据的输出格式。 **取值范围**：支持csv格式。 
     * @return resultFormat
     */
    public String getResultFormat() {
        return resultFormat;
    }

    public void setResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
    }

    public SparkSqlScriptingResultResponse withResultPath(String resultPath) {
        this.resultPath = resultPath;
        return this;
    }

    /**
     * **参数解释**：查询类SQL结果OBS路径，用于指定结果数据的存储位置。 **取值范围**：OBS URL格式，长度为1~1024个字符，例如：obs://bucket/results/result.csv. 
     * @return resultPath
     */
    public String getResultPath() {
        return resultPath;
    }

    public void setResultPath(String resultPath) {
        this.resultPath = resultPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkSqlScriptingResultResponse that = (SparkSqlScriptingResultResponse) obj;
        return Objects.equals(this.resultFormat, that.resultFormat) && Objects.equals(this.resultPath, that.resultPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultFormat, resultPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkSqlScriptingResultResponse {\n");
        sb.append("    resultFormat: ").append(toIndentedString(resultFormat)).append("\n");
        sb.append("    resultPath: ").append(toIndentedString(resultPath)).append("\n");
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
