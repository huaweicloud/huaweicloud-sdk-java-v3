package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 内核取证信息
 */
public class KernelForensicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_addr")

    private Integer readAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syscall_num")

    private Integer syscallNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    private String function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private String module;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_info")

    private String extInfo;

    public KernelForensicInfo withReadAddr(Integer readAddr) {
        this.readAddr = readAddr;
        return this;
    }

    /**
     * **参数解释**： 地址 **取值范围**： 不涉及
     * @return readAddr
     */
    public Integer getReadAddr() {
        return readAddr;
    }

    public void setReadAddr(Integer readAddr) {
        this.readAddr = readAddr;
    }

    public KernelForensicInfo withSyscallNum(Integer syscallNum) {
        this.syscallNum = syscallNum;
        return this;
    }

    /**
     * **参数解释**： 系统调用编号 **取值范围**： 不涉及
     * @return syscallNum
     */
    public Integer getSyscallNum() {
        return syscallNum;
    }

    public void setSyscallNum(Integer syscallNum) {
        this.syscallNum = syscallNum;
    }

    public KernelForensicInfo withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * **参数解释**： 系统函数 **取值范围**： 不涉及
     * @return function
     */
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public KernelForensicInfo withModule(String module) {
        this.module = module;
        return this;
    }

    /**
     * **参数解释**： 内核模块 **取值范围**： 不涉及
     * @return module
     */
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public KernelForensicInfo withExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }

    /**
     * **参数解释**： 扩展信息 **取值范围**： 不涉及
     * @return extInfo
     */
    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KernelForensicInfo that = (KernelForensicInfo) obj;
        return Objects.equals(this.readAddr, that.readAddr) && Objects.equals(this.syscallNum, that.syscallNum)
            && Objects.equals(this.function, that.function) && Objects.equals(this.module, that.module)
            && Objects.equals(this.extInfo, that.extInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readAddr, syscallNum, function, module, extInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KernelForensicInfo {\n");
        sb.append("    readAddr: ").append(toIndentedString(readAddr)).append("\n");
        sb.append("    syscallNum: ").append(toIndentedString(syscallNum)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
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
