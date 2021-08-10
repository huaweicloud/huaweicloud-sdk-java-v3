package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowDeviceDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sn")

    private String sn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prjCodeMode")

    private Integer prjCodeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCode")

    private String deptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptNamePath")

    private String deptNamePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ShowDeviceDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 终端名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDeviceDetailResponse withType(String type) {
        this.type = type;
        return this;
    }

    /** 终端类型，区分自研和第三方终端。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowDeviceDetailResponse withModel(String model) {
        this.model = model;
        return this;
    }

    /** 终端型号，枚举类型。当前支持TE系列硬件终端，具体的终端类型可以通过获取所有终端类型接口查询。
     * 
     * @return model */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ShowDeviceDetailResponse withSn(String sn) {
        this.sn = sn;
        return this;
    }

    /** 终端SN号，仅可包含数字、字母和下划线。
     * 
     * @return sn */
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public ShowDeviceDetailResponse withAccount(String account) {
        this.account = account;
        return this;
    }

    /** 硬终端对应的内置账号。
     * 
     * @return account */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ShowDeviceDetailResponse withNumber(String number) {
        this.number = number;
        return this;
    }

    /** 终端绑定的号码
     * 
     * @return number */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ShowDeviceDetailResponse withPrjCodeMode(Integer prjCodeMode) {
        this.prjCodeMode = prjCodeMode;
        return this;
    }

    /** 投影码生成模式 * 0、自动(该模式下根据消息上报的IP地址内部控制复杂度：私网地址配置成简单模式；公网地址配置成复杂模式) * 1、简单 * 2、复杂
     * 
     * @return prjCodeMode */
    public Integer getPrjCodeMode() {
        return prjCodeMode;
    }

    public void setPrjCodeMode(Integer prjCodeMode) {
        this.prjCodeMode = prjCodeMode;
    }

    public ShowDeviceDetailResponse withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /** 部门编号
     * 
     * @return deptCode */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public ShowDeviceDetailResponse withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /** 部门名称
     * 
     * @return deptName */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public ShowDeviceDetailResponse withDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
        return this;
    }

    /** 部门名称路径
     * 
     * @return deptNamePath */
    public String getDeptNamePath() {
        return deptNamePath;
    }

    public void setDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
    }

    public ShowDeviceDetailResponse withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /** 手机号
     * 
     * @return phone */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ShowDeviceDetailResponse withCountry(String country) {
        this.country = country;
        return this;
    }

    /** 手机号所属的国家
     * 
     * @return country */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ShowDeviceDetailResponse withEmail(String email) {
        this.email = email;
        return this;
    }

    /** 邮箱
     * 
     * @return email */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShowDeviceDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 终端描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowDeviceDetailResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 终端状态 * 0、正常 * 1、停用\"
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeviceDetailResponse showDeviceDetailResponse = (ShowDeviceDetailResponse) o;
        return Objects.equals(this.name, showDeviceDetailResponse.name)
            && Objects.equals(this.type, showDeviceDetailResponse.type)
            && Objects.equals(this.model, showDeviceDetailResponse.model)
            && Objects.equals(this.sn, showDeviceDetailResponse.sn)
            && Objects.equals(this.account, showDeviceDetailResponse.account)
            && Objects.equals(this.number, showDeviceDetailResponse.number)
            && Objects.equals(this.prjCodeMode, showDeviceDetailResponse.prjCodeMode)
            && Objects.equals(this.deptCode, showDeviceDetailResponse.deptCode)
            && Objects.equals(this.deptName, showDeviceDetailResponse.deptName)
            && Objects.equals(this.deptNamePath, showDeviceDetailResponse.deptNamePath)
            && Objects.equals(this.phone, showDeviceDetailResponse.phone)
            && Objects.equals(this.country, showDeviceDetailResponse.country)
            && Objects.equals(this.email, showDeviceDetailResponse.email)
            && Objects.equals(this.description, showDeviceDetailResponse.description)
            && Objects.equals(this.status, showDeviceDetailResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            model,
            sn,
            account,
            number,
            prjCodeMode,
            deptCode,
            deptName,
            deptNamePath,
            phone,
            country,
            email,
            description,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeviceDetailResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    prjCodeMode: ").append(toIndentedString(prjCodeMode)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    deptNamePath: ").append(toIndentedString(deptNamePath)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
