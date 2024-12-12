package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询上下文日志请求体。
 */
public class ListLogContextRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__time__")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backwardsSize")

    private Integer backwardsSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwardsSize")

    private Integer forwardsSize;

    public ListLogContextRequestBody withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 日志单行序列号，字段值需要从日志结果中获取，纳秒级时间戳。
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public ListLogContextRequestBody withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 自定义时间特性时间字段，字段值需要从日志结果中获取，毫秒级时间戳。若已开启云端结构化自定义时间功能，需要使用该字段和line_num字段共同进行上下文查询。
     * @return time
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__time__")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ListLogContextRequestBody withBackwardsSize(Integer backwardsSize) {
        this.backwardsSize = backwardsSize;
        return this;
    }

    /**
     * 指定起始日志往前（上文）的日志条数，取值范围 [0, 500] ，默认值100
     * minimum: 0
     * maximum: 500
     * @return backwardsSize
     */
    public Integer getBackwardsSize() {
        return backwardsSize;
    }

    public void setBackwardsSize(Integer backwardsSize) {
        this.backwardsSize = backwardsSize;
    }

    public ListLogContextRequestBody withForwardsSize(Integer forwardsSize) {
        this.forwardsSize = forwardsSize;
        return this;
    }

    /**
     * 指定起始日志往后（下文）的日志条数，取值范围 [0, 500] ，默认值100
     * minimum: 0
     * maximum: 500
     * @return forwardsSize
     */
    public Integer getForwardsSize() {
        return forwardsSize;
    }

    public void setForwardsSize(Integer forwardsSize) {
        this.forwardsSize = forwardsSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLogContextRequestBody that = (ListLogContextRequestBody) obj;
        return Objects.equals(this.lineNum, that.lineNum) && Objects.equals(this.time, that.time)
            && Objects.equals(this.backwardsSize, that.backwardsSize)
            && Objects.equals(this.forwardsSize, that.forwardsSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineNum, time, backwardsSize, forwardsSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogContextRequestBody {\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    backwardsSize: ").append(toIndentedString(backwardsSize)).append("\n");
        sb.append("    forwardsSize: ").append(toIndentedString(forwardsSize)).append("\n");
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
