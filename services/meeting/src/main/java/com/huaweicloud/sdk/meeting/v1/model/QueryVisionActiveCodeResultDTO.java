package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 激活码信息。
 */
public class QueryVisionActiveCodeResultDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activeCode")

    private String activeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devName")

    private String devName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devType")

    private String devType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCode")

    private String deptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expireDate")

    private Long expireDate;

    public QueryVisionActiveCodeResultDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 激活码唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryVisionActiveCodeResultDTO withActiveCode(String activeCode) {
        this.activeCode = activeCode;
        return this;
    }

    /**
     * 激活码。
     * @return activeCode
     */
    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public QueryVisionActiveCodeResultDTO withDevName(String devName) {
        this.devName = devName;
        return this;
    }

    /**
     * 终端名称。
     * @return devName
     */
    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public QueryVisionActiveCodeResultDTO withDevType(String devType) {
        this.devType = devType;
        return this;
    }

    /**
     * 终端类型。
     * @return devType
     */
    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType;
    }

    public QueryVisionActiveCodeResultDTO withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * 部门编码。
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public QueryVisionActiveCodeResultDTO withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 部门名称。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public QueryVisionActiveCodeResultDTO withExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    /**
     * 失效时间戳。
     * @return expireDate
     */
    public Long getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryVisionActiveCodeResultDTO that = (QueryVisionActiveCodeResultDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.activeCode, that.activeCode)
            && Objects.equals(this.devName, that.devName) && Objects.equals(this.devType, that.devType)
            && Objects.equals(this.deptCode, that.deptCode) && Objects.equals(this.deptName, that.deptName)
            && Objects.equals(this.expireDate, that.expireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, activeCode, devName, devType, deptCode, deptName, expireDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryVisionActiveCodeResultDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    activeCode: ").append(toIndentedString(activeCode)).append("\n");
        sb.append("    devName: ").append(toIndentedString(devName)).append("\n");
        sb.append("    devType: ").append(toIndentedString(devType)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
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
