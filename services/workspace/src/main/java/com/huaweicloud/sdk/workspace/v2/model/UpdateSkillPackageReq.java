package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新技能包信息请求。
 */
public class UpdateSkillPackageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_status")

    private PackageStatusEnum packageStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    public UpdateSkillPackageReq withPackageStatus(PackageStatusEnum packageStatus) {
        this.packageStatus = packageStatus;
        return this;
    }

    /**
     * Get packageStatus
     * @return packageStatus
     */
    public PackageStatusEnum getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(PackageStatusEnum packageStatus) {
        this.packageStatus = packageStatus;
    }

    public UpdateSkillPackageReq withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSkillPackageReq that = (UpdateSkillPackageReq) obj;
        return Objects.equals(this.packageStatus, that.packageStatus) && Objects.equals(this.remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageStatus, remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSkillPackageReq {\n");
        sb.append("    packageStatus: ").append(toIndentedString(packageStatus)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
