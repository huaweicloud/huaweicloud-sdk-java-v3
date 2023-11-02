package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 启动任务请求体。
 */
public class StartReal3DTaskBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_AT_only")

    private Boolean runATOnly;

    public StartReal3DTaskBody withRunATOnly(Boolean runATOnly) {
        this.runATOnly = runATOnly;
        return this;
    }

    /**
     * 是否为进行空三建模的阶段，缺省时为“false”，仅支持有控建模类型任务设置“true”。取值为“true”时表示进行空三建模，建模完成后对应的任务状态为空三建模成功（BUNDLE_SUCCESS）。
     * @return runATOnly
     */
    public Boolean getRunATOnly() {
        return runATOnly;
    }

    public void setRunATOnly(Boolean runATOnly) {
        this.runATOnly = runATOnly;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartReal3DTaskBody that = (StartReal3DTaskBody) obj;
        return Objects.equals(this.runATOnly, that.runATOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runATOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartReal3DTaskBody {\n");
        sb.append("    runATOnly: ").append(toIndentedString(runATOnly)).append("\n");
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
