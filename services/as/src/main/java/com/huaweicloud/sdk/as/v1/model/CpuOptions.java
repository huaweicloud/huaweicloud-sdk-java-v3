package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CpuOptions
 */
public class CpuOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw_cpu_threads")

    private Integer hwCpuThreads;

    public CpuOptions withHwCpuThreads(Integer hwCpuThreads) {
        this.hwCpuThreads = hwCpuThreads;
        return this;
    }

    /**
     * 是否关闭实例超线程，1是关闭，2是开启
     * @return hwCpuThreads
     */
    public Integer getHwCpuThreads() {
        return hwCpuThreads;
    }

    public void setHwCpuThreads(Integer hwCpuThreads) {
        this.hwCpuThreads = hwCpuThreads;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CpuOptions that = (CpuOptions) obj;
        return Objects.equals(this.hwCpuThreads, that.hwCpuThreads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hwCpuThreads);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CpuOptions {\n");
        sb.append("    hwCpuThreads: ").append(toIndentedString(hwCpuThreads)).append("\n");
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
