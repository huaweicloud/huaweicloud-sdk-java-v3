package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模型费用信息。
 */
public class ModelCost {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private Double input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private Double output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_read")

    private Double cacheRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_write")

    private Double cacheWrite;

    public ModelCost withInput(Double input) {
        this.input = input;
        return this;
    }

    /**
     * 每百万输入Token费用。
     * minimum: 0
     * maximum: 1.7976931348623157E+308
     * @return input
     */
    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = input;
    }

    public ModelCost withOutput(Double output) {
        this.output = output;
        return this;
    }

    /**
     * 每百万输出Token费用。
     * minimum: 0
     * maximum: 1.7976931348623157E+308
     * @return output
     */
    public Double getOutput() {
        return output;
    }

    public void setOutput(Double output) {
        this.output = output;
    }

    public ModelCost withCacheRead(Double cacheRead) {
        this.cacheRead = cacheRead;
        return this;
    }

    /**
     * 每百万缓存读取Token费用。
     * minimum: 0
     * maximum: 1.7976931348623157E+308
     * @return cacheRead
     */
    public Double getCacheRead() {
        return cacheRead;
    }

    public void setCacheRead(Double cacheRead) {
        this.cacheRead = cacheRead;
    }

    public ModelCost withCacheWrite(Double cacheWrite) {
        this.cacheWrite = cacheWrite;
        return this;
    }

    /**
     * 每百万缓存写入Token费用。
     * minimum: 0
     * maximum: 1.7976931348623157E+308
     * @return cacheWrite
     */
    public Double getCacheWrite() {
        return cacheWrite;
    }

    public void setCacheWrite(Double cacheWrite) {
        this.cacheWrite = cacheWrite;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelCost that = (ModelCost) obj;
        return Objects.equals(this.input, that.input) && Objects.equals(this.output, that.output)
            && Objects.equals(this.cacheRead, that.cacheRead) && Objects.equals(this.cacheWrite, that.cacheWrite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, cacheRead, cacheWrite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelCost {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    cacheRead: ").append(toIndentedString(cacheRead)).append("\n");
        sb.append("    cacheWrite: ").append(toIndentedString(cacheWrite)).append("\n");
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
