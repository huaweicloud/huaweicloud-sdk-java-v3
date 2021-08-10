package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 用户修改vmr信息 */
public class ModVmrDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrName")

    private String vmrName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gustPwd")

    private String gustPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chairPwd")

    private String chairPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowGustFirst")

    private Boolean allowGustFirst;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gustFirstNotice")

    private Boolean gustFirstNotice;

    public ModVmrDTO withVmrName(String vmrName) {
        this.vmrName = vmrName;
        return this;
    }

    /** 云会议室名称 maxLength：128 minLength：1
     * 
     * @return vmrName */
    public String getVmrName() {
        return vmrName;
    }

    public void setVmrName(String vmrName) {
        this.vmrName = vmrName;
    }

    public ModVmrDTO withGustPwd(String gustPwd) {
        this.gustPwd = gustPwd;
        return this;
    }

    /** 来宾密码，“”代表不设置来宾密码 4~16位的数字
     * 
     * @return gustPwd */
    public String getGustPwd() {
        return gustPwd;
    }

    public void setGustPwd(String gustPwd) {
        this.gustPwd = gustPwd;
    }

    public ModVmrDTO withChairPwd(String chairPwd) {
        this.chairPwd = chairPwd;
        return this;
    }

    /** 主席密码 4~16位的数字
     * 
     * @return chairPwd */
    public String getChairPwd() {
        return chairPwd;
    }

    public void setChairPwd(String chairPwd) {
        this.chairPwd = chairPwd;
    }

    public ModVmrDTO withAllowGustFirst(Boolean allowGustFirst) {
        this.allowGustFirst = allowGustFirst;
        return this;
    }

    /** 是否允许来宾先入会。
     * 
     * @return allowGustFirst */
    public Boolean getAllowGustFirst() {
        return allowGustFirst;
    }

    public void setAllowGustFirst(Boolean allowGustFirst) {
        this.allowGustFirst = allowGustFirst;
    }

    public ModVmrDTO withGustFirstNotice(Boolean gustFirstNotice) {
        this.gustFirstNotice = gustFirstNotice;
        return this;
    }

    /** 云会议室被使用后是否通知会议室所有者。
     * 
     * @return gustFirstNotice */
    public Boolean getGustFirstNotice() {
        return gustFirstNotice;
    }

    public void setGustFirstNotice(Boolean gustFirstNotice) {
        this.gustFirstNotice = gustFirstNotice;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModVmrDTO modVmrDTO = (ModVmrDTO) o;
        return Objects.equals(this.vmrName, modVmrDTO.vmrName) && Objects.equals(this.gustPwd, modVmrDTO.gustPwd)
            && Objects.equals(this.chairPwd, modVmrDTO.chairPwd)
            && Objects.equals(this.allowGustFirst, modVmrDTO.allowGustFirst)
            && Objects.equals(this.gustFirstNotice, modVmrDTO.gustFirstNotice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmrName, gustPwd, chairPwd, allowGustFirst, gustFirstNotice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModVmrDTO {\n");
        sb.append("    vmrName: ").append(toIndentedString(vmrName)).append("\n");
        sb.append("    gustPwd: ").append(toIndentedString(gustPwd)).append("\n");
        sb.append("    chairPwd: ").append(toIndentedString(chairPwd)).append("\n");
        sb.append("    allowGustFirst: ").append(toIndentedString(allowGustFirst)).append("\n");
        sb.append("    gustFirstNotice: ").append(toIndentedString(gustFirstNotice)).append("\n");
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
