package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 人员联系信息
 */
public class ContactServiceDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_no_top")

    private String certificateNoTop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_no_last")

    private String certificateNoLast;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_code")

    private String countryCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_unit")

    private String workUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ContactServiceDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 人员姓名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactServiceDetails withCertificateNoTop(String certificateNoTop) {
        this.certificateNoTop = certificateNoTop;
        return this;
    }

    /**
     * 证件号前三位
     * @return certificateNoTop
     */
    public String getCertificateNoTop() {
        return certificateNoTop;
    }

    public void setCertificateNoTop(String certificateNoTop) {
        this.certificateNoTop = certificateNoTop;
    }

    public ContactServiceDetails withCertificateNoLast(String certificateNoLast) {
        this.certificateNoLast = certificateNoLast;
        return this;
    }

    /**
     * 证件号后四位
     * @return certificateNoLast
     */
    public String getCertificateNoLast() {
        return certificateNoLast;
    }

    public void setCertificateNoLast(String certificateNoLast) {
        this.certificateNoLast = certificateNoLast;
    }

    public ContactServiceDetails withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * 手机国际码
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public ContactServiceDetails withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 电话
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ContactServiceDetails withWorkUnit(String workUnit) {
        this.workUnit = workUnit;
        return this;
    }

    /**
     * 单位
     * @return workUnit
     */
    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public ContactServiceDetails withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 备注
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ContactServiceDetails withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 状态
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ContactServiceDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContactServiceDetails that = (ContactServiceDetails) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.certificateNoTop, that.certificateNoTop)
            && Objects.equals(this.certificateNoLast, that.certificateNoLast)
            && Objects.equals(this.countryCode, that.countryCode) && Objects.equals(this.phone, that.phone)
            && Objects.equals(this.workUnit, that.workUnit) && Objects.equals(this.remarks, that.remarks)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            certificateNoTop,
            certificateNoLast,
            countryCode,
            phone,
            workUnit,
            remarks,
            taskStatus,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactServiceDetails {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    certificateNoTop: ").append(toIndentedString(certificateNoTop)).append("\n");
        sb.append("    certificateNoLast: ").append(toIndentedString(certificateNoLast)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    workUnit: ").append(toIndentedString(workUnit)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
