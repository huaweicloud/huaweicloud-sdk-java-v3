package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 包含用户工作相关信息的对象
 */
public class EnterpriseDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "costCenter")

    private String costCenter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "department")

    private String department;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "division")

    private String division;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "employeeNumber")

    private String employeeNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager")

    private ManagerDto manager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    public EnterpriseDto withCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * 成本中心
     * @return costCenter
     */
    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public EnterpriseDto withDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * 部门
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public EnterpriseDto withDivision(String division) {
        this.division = division;
        return this;
    }

    /**
     * 分部
     * @return division
     */
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public EnterpriseDto withEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }

    /**
     * 员工编号
     * @return employeeNumber
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public EnterpriseDto withManager(ManagerDto manager) {
        this.manager = manager;
        return this;
    }

    public EnterpriseDto withManager(Consumer<ManagerDto> managerSetter) {
        if (this.manager == null) {
            this.manager = new ManagerDto();
            managerSetter.accept(this.manager);
        }

        return this;
    }

    /**
     * Get manager
     * @return manager
     */
    public ManagerDto getManager() {
        return manager;
    }

    public void setManager(ManagerDto manager) {
        this.manager = manager;
    }

    public EnterpriseDto withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * 组织
     * @return organization
     */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnterpriseDto that = (EnterpriseDto) obj;
        return Objects.equals(this.costCenter, that.costCenter) && Objects.equals(this.department, that.department)
            && Objects.equals(this.division, that.division) && Objects.equals(this.employeeNumber, that.employeeNumber)
            && Objects.equals(this.manager, that.manager) && Objects.equals(this.organization, that.organization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costCenter, department, division, employeeNumber, manager, organization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseDto {\n");
        sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
        sb.append("    department: ").append(toIndentedString(department)).append("\n");
        sb.append("    division: ").append(toIndentedString(division)).append("\n");
        sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
        sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
