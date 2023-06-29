package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class CheckWorkflowAuthenticationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modify_time")

    private String lastModifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_id")

    private String agencyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    /**
     * 委托的期限。取值为\"FOREVER\"或“null”表示委托的期限为永久，取值为\"ONEDAY\"表示委托的期限为一天。
     */
    public static final class AgencyDurationEnum {

        /**
         * Enum FOREVER for value: "FOREVER"
         */
        public static final AgencyDurationEnum FOREVER = new AgencyDurationEnum("FOREVER");

        /**
         * Enum ONEDAY for value: "ONEDAY"
         */
        public static final AgencyDurationEnum ONEDAY = new AgencyDurationEnum("ONEDAY");

        private static final Map<String, AgencyDurationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgencyDurationEnum> createStaticFields() {
            Map<String, AgencyDurationEnum> map = new HashMap<>();
            map.put("FOREVER", FOREVER);
            map.put("ONEDAY", ONEDAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgencyDurationEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AgencyDurationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgencyDurationEnum(value));
        }

        public static AgencyDurationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgencyDurationEnum) {
                return this.value.equals(((AgencyDurationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_duration")

    private AgencyDurationEnum agencyDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain_name")

    private String trustDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_dependent_by_function")

    private String roleDependentByFunction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_remark_name")

    private String roleRemarkName;

    /**
     * 权限的备注模式： AX表示在domain层显示。 XA表示在project层显示。 AA表示在domain和project层均显示。 XX表示在domain和project层均不显示。 自定义策略的显示模式只能为AX或者XA，不能在domain层和project层都显示（AA），或者在domain层和project层都不显示（XX）
     */
    public static final class RoleRemarkTypeEnum {

        /**
         * Enum AX for value: "AX"
         */
        public static final RoleRemarkTypeEnum AX = new RoleRemarkTypeEnum("AX");

        /**
         * Enum XA for value: "XA"
         */
        public static final RoleRemarkTypeEnum XA = new RoleRemarkTypeEnum("XA");

        /**
         * Enum AA for value: "AA"
         */
        public static final RoleRemarkTypeEnum AA = new RoleRemarkTypeEnum("AA");

        /**
         * Enum XX for value: "XX"
         */
        public static final RoleRemarkTypeEnum XX = new RoleRemarkTypeEnum("XX");

        private static final Map<String, RoleRemarkTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleRemarkTypeEnum> createStaticFields() {
            Map<String, RoleRemarkTypeEnum> map = new HashMap<>();
            map.put("AX", AX);
            map.put("XA", XA);
            map.put("AA", AA);
            map.put("XX", XX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoleRemarkTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RoleRemarkTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoleRemarkTypeEnum(value));
        }

        public static RoleRemarkTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoleRemarkTypeEnum) {
                return this.value.equals(((RoleRemarkTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_remark_type")

    private RoleRemarkTypeEnum roleRemarkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    private String date;

    public CheckWorkflowAuthenticationResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CheckWorkflowAuthenticationResponse withLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }

    /**
     * 最近修改时间。
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public CheckWorkflowAuthenticationResponse withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * 委托方帐号ID。
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public CheckWorkflowAuthenticationResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public CheckWorkflowAuthenticationResponse withAgencyDuration(AgencyDurationEnum agencyDuration) {
        this.agencyDuration = agencyDuration;
        return this;
    }

    /**
     * 委托的期限。取值为\"FOREVER\"或“null”表示委托的期限为永久，取值为\"ONEDAY\"表示委托的期限为一天。
     * @return agencyDuration
     */
    public AgencyDurationEnum getAgencyDuration() {
        return agencyDuration;
    }

    public void setAgencyDuration(AgencyDurationEnum agencyDuration) {
        this.agencyDuration = agencyDuration;
    }

    public CheckWorkflowAuthenticationResponse withTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
        return this;
    }

    /**
     * 被委托方帐号名。
     * @return trustDomainName
     */
    public String getTrustDomainName() {
        return trustDomainName;
    }

    public void setTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
    }

    public CheckWorkflowAuthenticationResponse withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 权限ID。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public CheckWorkflowAuthenticationResponse withRoleDependentByFunction(String roleDependentByFunction) {
        this.roleDependentByFunction = roleDependentByFunction;
        return this;
    }

    /**
     * 权限使用的依赖函数。
     * @return roleDependentByFunction
     */
    public String getRoleDependentByFunction() {
        return roleDependentByFunction;
    }

    public void setRoleDependentByFunction(String roleDependentByFunction) {
        this.roleDependentByFunction = roleDependentByFunction;
    }

    public CheckWorkflowAuthenticationResponse withRoleRemarkName(String roleRemarkName) {
        this.roleRemarkName = roleRemarkName;
        return this;
    }

    /**
     * 权限备注名。
     * @return roleRemarkName
     */
    public String getRoleRemarkName() {
        return roleRemarkName;
    }

    public void setRoleRemarkName(String roleRemarkName) {
        this.roleRemarkName = roleRemarkName;
    }

    public CheckWorkflowAuthenticationResponse withRoleRemarkType(RoleRemarkTypeEnum roleRemarkType) {
        this.roleRemarkType = roleRemarkType;
        return this;
    }

    /**
     * 权限的备注模式： AX表示在domain层显示。 XA表示在project层显示。 AA表示在domain和project层均显示。 XX表示在domain和project层均不显示。 自定义策略的显示模式只能为AX或者XA，不能在domain层和project层都显示（AA），或者在domain层和project层都不显示（XX）
     * @return roleRemarkType
     */
    public RoleRemarkTypeEnum getRoleRemarkType() {
        return roleRemarkType;
    }

    public void setRoleRemarkType(RoleRemarkTypeEnum roleRemarkType) {
        this.roleRemarkType = roleRemarkType;
    }

    public CheckWorkflowAuthenticationResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public CheckWorkflowAuthenticationResponse withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public CheckWorkflowAuthenticationResponse withContentLength(String contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get contentLength
     * @return contentLength
     */
    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public CheckWorkflowAuthenticationResponse withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckWorkflowAuthenticationResponse that = (CheckWorkflowAuthenticationResponse) obj;
        return Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastModifyTime, that.lastModifyTime) && Objects.equals(this.agencyId, that.agencyId)
            && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.agencyDuration, that.agencyDuration)
            && Objects.equals(this.trustDomainName, that.trustDomainName) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.roleDependentByFunction, that.roleDependentByFunction)
            && Objects.equals(this.roleRemarkName, that.roleRemarkName)
            && Objects.equals(this.roleRemarkType, that.roleRemarkType)
            && Objects.equals(this.xRequestId, that.xRequestId) && Objects.equals(this.connection, that.connection)
            && Objects.equals(this.contentLength, that.contentLength) && Objects.equals(this.date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            lastModifyTime,
            agencyId,
            agencyName,
            agencyDuration,
            trustDomainName,
            roleId,
            roleDependentByFunction,
            roleRemarkName,
            roleRemarkType,
            xRequestId,
            connection,
            contentLength,
            date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckWorkflowAuthenticationResponse {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastModifyTime: ").append(toIndentedString(lastModifyTime)).append("\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    agencyDuration: ").append(toIndentedString(agencyDuration)).append("\n");
        sb.append("    trustDomainName: ").append(toIndentedString(trustDomainName)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleDependentByFunction: ").append(toIndentedString(roleDependentByFunction)).append("\n");
        sb.append("    roleRemarkName: ").append(toIndentedString(roleRemarkName)).append("\n");
        sb.append("    roleRemarkType: ").append(toIndentedString(roleRemarkType)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
