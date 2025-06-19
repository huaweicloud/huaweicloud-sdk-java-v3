package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 返回结果
 */
public class SetKeepTimeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_time")

    private Integer keepTime;

    public SetKeepTimeResult withKeepTime(Integer keepTime) {
        this.keepTime = keepTime;
        return this;
    }

    /**
     * 回收站中的任务保留时间
     * @return keepTime
     */
    public Integer getKeepTime() {
        return keepTime;
    }

    public void setKeepTime(Integer keepTime) {
        this.keepTime = keepTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetKeepTimeResult that = (SetKeepTimeResult) obj;
        return Objects.equals(this.keepTime, that.keepTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetKeepTimeResult {\n");
        sb.append("    keepTime: ").append(toIndentedString(keepTime)).append("\n");
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
