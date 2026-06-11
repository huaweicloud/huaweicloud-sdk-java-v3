package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * cpu规格信息。
 */
public class Cpu {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_num")

    private Integer coreNum;

    public Cpu withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * cpu架构。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public Cpu withCoreNum(Integer coreNum) {
        this.coreNum = coreNum;
        return this;
    }

    /**
     * 核数。
     * @return coreNum
     */
    public Integer getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(Integer coreNum) {
        this.coreNum = coreNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cpu that = (Cpu) obj;
        return Objects.equals(this.arch, that.arch) && Objects.equals(this.coreNum, that.coreNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arch, coreNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cpu {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    coreNum: ").append(toIndentedString(coreNum)).append("\n");
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
