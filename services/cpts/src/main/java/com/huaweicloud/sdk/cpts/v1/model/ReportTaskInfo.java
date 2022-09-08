package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 报告任务信息
 */
public class ReportTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vum")

    private Double vum;

    public ReportTaskInfo withVum(Double vum) {
        this.vum = vum;
        return this;
    }

    /**
     * 分钟*并发数
     * @return vum
     */
    public Double getVum() {
        return vum;
    }

    public void setVum(Double vum) {
        this.vum = vum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportTaskInfo reportTaskInfo = (ReportTaskInfo) o;
        return Objects.equals(this.vum, reportTaskInfo.vum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportTaskInfo {\n");
        sb.append("    vum: ").append(toIndentedString(vum)).append("\n");
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
