package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 修改实例信息 */
public class ModifyInstanceBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_begin")

    private String maintainBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_end")

    private String maintainEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_backup_policy")

    private BackupPolicy instanceBackupPolicy;

    public ModifyInstanceBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 实例名称 由英文字符开头，只能由英文字母、数字、中划线和下划线组成。
     * 创建单个实例时，名称长度为4到64位的字符串。批量创建实例时，名称长度为4到56位的字符串，且实例名称格式为“自定义名称-n”，其中n从000开始，依次递增。例如，批量创建两个实例，自定义名称为dcs_demo，则两个实例的名称为dcs_demo-000和dcs_demo-001。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModifyInstanceBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 实例的描述信息 长度不超过1024的字符串。 > \\与\"在json报文中属于特殊字符，如果参数值中需要显示\\或者\"字符，请在字符前增加转义字符\\，比如\\\\或者\\\"。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModifyInstanceBody withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /** '维护时间窗开始时间，为UTC时间，格式为HH:mm:ss。' -
     * 维护时间窗开始和结束时间必须为指定的时间段，可参考[查询维护时间窗时间段](https://support.huaweicloud.com/api-dcs/ListMaintenanceWindows.html)获取。 -
     * 开始时间必须为22:00:00、02:00:00、06:00:00、10:00:00、14:00:00和18:00:00。 - 该参数不能单独为空，若该值为空，则结束时间也为空。
     * 
     * @return maintainBegin */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public ModifyInstanceBody withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /** '维护时间窗开始时间，为UTC时间，格式为HH:mm:ss。' -
     * 维护时间窗开始和结束时间必须为指定的时间段，可参考[查询维护时间窗时间段](https://support.huaweicloud.com/api-dcs/ListMaintenanceWindows.html)获取。 -
     * 结束时间在开始时间基础上加四个小时，即当开始时间为22:00:00时，结束时间为02:00:00。 - 该参数不能单独为空，若该值为空，则开始时间也为空。
     * 
     * @return maintainEnd */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public ModifyInstanceBody withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /** 安全组ID 可从虚拟私有云服务的控制台界面或者API接口查询得到。 约束：只有Redis 3.0支持
     * 
     * @return securityGroupId */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ModifyInstanceBody withInstanceBackupPolicy(BackupPolicy instanceBackupPolicy) {
        this.instanceBackupPolicy = instanceBackupPolicy;
        return this;
    }

    public ModifyInstanceBody withInstanceBackupPolicy(Consumer<BackupPolicy> instanceBackupPolicySetter) {
        if (this.instanceBackupPolicy == null) {
            this.instanceBackupPolicy = new BackupPolicy();
            instanceBackupPolicySetter.accept(this.instanceBackupPolicy);
        }

        return this;
    }

    /** Get instanceBackupPolicy
     * 
     * @return instanceBackupPolicy */
    public BackupPolicy getInstanceBackupPolicy() {
        return instanceBackupPolicy;
    }

    public void setInstanceBackupPolicy(BackupPolicy instanceBackupPolicy) {
        this.instanceBackupPolicy = instanceBackupPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyInstanceBody modifyInstanceBody = (ModifyInstanceBody) o;
        return Objects.equals(this.name, modifyInstanceBody.name)
            && Objects.equals(this.description, modifyInstanceBody.description)
            && Objects.equals(this.maintainBegin, modifyInstanceBody.maintainBegin)
            && Objects.equals(this.maintainEnd, modifyInstanceBody.maintainEnd)
            && Objects.equals(this.securityGroupId, modifyInstanceBody.securityGroupId)
            && Objects.equals(this.instanceBackupPolicy, modifyInstanceBody.instanceBackupPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, maintainBegin, maintainEnd, securityGroupId, instanceBackupPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyInstanceBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    instanceBackupPolicy: ").append(toIndentedString(instanceBackupPolicy)).append("\n");
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
