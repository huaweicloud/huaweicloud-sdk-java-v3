package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 安全设置参数响应体。
 */
public class SecurityConfigurationParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public SecurityConfigurationParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 参数名。 **取值范围**： audit_dml_state：审计dml操作开关； audit_system_object：审计DDL操作、其它操作； audit_adm：安全管理员用户名； audit_exec_status：审计执行结果； audit_operation_checked：审计DML操作、审计其它操作的具体勾选项； enableSeparationOfDuty：三权分立开关； audit_user_violation：越权访问操作； ssl：ssl开关； require_ssl：是否校验ssl； audit_function_exec：审计存储过程执行操作； audit_copy_exec：对COPY操作进行记录； audit_resource_policy：日志保留策略； audit_file_remain_time：时间策略下的最少保留天数，已废弃； audit_dml_state_select：审计SELECT操作； security_adm：安全管理员； audit_dump_switch：日志转储开关； kernel_audit_dump_switch：内核日志转储开关； audit_system_object_detail：审计DDL操作、其它操作的具体勾选项；
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecurityConfigurationParameter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 参数值。 **取值范围**： 不涉及。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityConfigurationParameter that = (SecurityConfigurationParameter) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityConfigurationParameter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
