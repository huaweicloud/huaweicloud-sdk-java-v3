package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业可视化日志输出，log_type非空时必填。
 */
public class LogDir {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pfs")

    private PFSSummary pfs;

    public LogDir withPfs(PFSSummary pfs) {
        this.pfs = pfs;
        return this;
    }

    public LogDir withPfs(Consumer<PFSSummary> pfsSetter) {
        if (this.pfs == null) {
            this.pfs = new PFSSummary();
            pfsSetter.accept(this.pfs);
        }

        return this;
    }

    /**
     * Get pfs
     * @return pfs
     */
    public PFSSummary getPfs() {
        return pfs;
    }

    public void setPfs(PFSSummary pfs) {
        this.pfs = pfs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogDir that = (LogDir) obj;
        return Objects.equals(this.pfs, that.pfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pfs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogDir {\n");
        sb.append("    pfs: ").append(toIndentedString(pfs)).append("\n");
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
