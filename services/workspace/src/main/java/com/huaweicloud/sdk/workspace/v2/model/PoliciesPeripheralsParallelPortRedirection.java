package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 并口重定向。
 */
public class PoliciesPeripheralsParallelPortRedirection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_port_enable")

    private Boolean parallelPortEnable;

    public PoliciesPeripheralsParallelPortRedirection withParallelPortEnable(Boolean parallelPortEnable) {
        this.parallelPortEnable = parallelPortEnable;
        return this;
    }

    /**
     * 是否开启并口重定向。取值为： false：表示关闭。 true：表示开启。
     * @return parallelPortEnable
     */
    public Boolean getParallelPortEnable() {
        return parallelPortEnable;
    }

    public void setParallelPortEnable(Boolean parallelPortEnable) {
        this.parallelPortEnable = parallelPortEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsParallelPortRedirection that = (PoliciesPeripheralsParallelPortRedirection) obj;
        return Objects.equals(this.parallelPortEnable, that.parallelPortEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parallelPortEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsParallelPortRedirection {\n");
        sb.append("    parallelPortEnable: ").append(toIndentedString(parallelPortEnable)).append("\n");
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
