package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 错误样例
 */
public class ErrorSample {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    public ErrorSample withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 检测源描述。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ErrorSample withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 此错误共计次数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ErrorSample withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 错误数据和错误提示消息。
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorSample errorSample = (ErrorSample) o;
        return Objects.equals(this.source, errorSample.source) && Objects.equals(this.count, errorSample.count)
            && Objects.equals(this.msg, errorSample.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, count, msg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorSample {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
