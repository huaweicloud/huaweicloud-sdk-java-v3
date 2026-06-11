package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业可视化日志输出，log_type非空时必填。
 */
public class LogDirResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pfs")

    private PFSSummaryResp pfs;

    public LogDirResp withPfs(PFSSummaryResp pfs) {
        this.pfs = pfs;
        return this;
    }

    public LogDirResp withPfs(Consumer<PFSSummaryResp> pfsSetter) {
        if (this.pfs == null) {
            this.pfs = new PFSSummaryResp();
            pfsSetter.accept(this.pfs);
        }

        return this;
    }

    /**
     * Get pfs
     * @return pfs
     */
    public PFSSummaryResp getPfs() {
        return pfs;
    }

    public void setPfs(PFSSummaryResp pfs) {
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
        LogDirResp that = (LogDirResp) obj;
        return Objects.equals(this.pfs, that.pfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pfs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogDirResp {\n");
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
