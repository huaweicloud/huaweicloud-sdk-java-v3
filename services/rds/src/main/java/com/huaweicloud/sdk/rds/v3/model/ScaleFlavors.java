package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ScaleFlavors */
public class ScaleFlavors {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    public ScaleFlavors withCode(String code) {
        this.code = code;
        return this;
    }

    /** 规格码。
     * 
     * @return code */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ScaleFlavors withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /** CPU个数。
     * 
     * @return cpu */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ScaleFlavors withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /** 内存大小（单位：GB）。
     * 
     * @return mem */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScaleFlavors scaleFlavors = (ScaleFlavors) o;
        return Objects.equals(this.code, scaleFlavors.code) && Objects.equals(this.cpu, scaleFlavors.cpu)
            && Objects.equals(this.mem, scaleFlavors.mem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, cpu, mem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleFlavors {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
