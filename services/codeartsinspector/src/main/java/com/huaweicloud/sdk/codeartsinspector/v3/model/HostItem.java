package com.huaweicloud.sdk.codeartsinspector.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * HostItem
 */
public class HostItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 操作系统类型: * linux * windows 
     */
    public static final class OsTypeEnum {

        /**
         * Enum LINUX for value: "linux"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("linux");

        /**
         * Enum WINDOWS for value: "windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("windows");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("linux", LINUX);
            map.put("windows", WINDOWS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsTypeEnum(value));
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_credential_id")

    private String sshCredentialId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jumper_server_id")

    private String jumperServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smb_credential_id")

    private String smbCredentialId;

    public HostItem withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 主机IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public HostItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主机名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HostItem withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型: * linux * windows 
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public HostItem withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 主机组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public HostItem withSshCredentialId(String sshCredentialId) {
        this.sshCredentialId = sshCredentialId;
        return this;
    }

    /**
     * linux主机ssh授权登录信息ID
     * @return sshCredentialId
     */
    public String getSshCredentialId() {
        return sshCredentialId;
    }

    public void setSshCredentialId(String sshCredentialId) {
        this.sshCredentialId = sshCredentialId;
    }

    public HostItem withJumperServerId(String jumperServerId) {
        this.jumperServerId = jumperServerId;
        return this;
    }

    /**
     * linux跳板机信息ID
     * @return jumperServerId
     */
    public String getJumperServerId() {
        return jumperServerId;
    }

    public void setJumperServerId(String jumperServerId) {
        this.jumperServerId = jumperServerId;
    }

    public HostItem withSmbCredentialId(String smbCredentialId) {
        this.smbCredentialId = smbCredentialId;
        return this;
    }

    /**
     * windows主机smb授权登录信息ID
     * @return smbCredentialId
     */
    public String getSmbCredentialId() {
        return smbCredentialId;
    }

    public void setSmbCredentialId(String smbCredentialId) {
        this.smbCredentialId = smbCredentialId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostItem that = (HostItem) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.name, that.name)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.sshCredentialId, that.sshCredentialId)
            && Objects.equals(this.jumperServerId, that.jumperServerId)
            && Objects.equals(this.smbCredentialId, that.smbCredentialId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, name, osType, groupId, sshCredentialId, jumperServerId, smbCredentialId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostItem {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    sshCredentialId: ").append(toIndentedString(sshCredentialId)).append("\n");
        sb.append("    jumperServerId: ").append(toIndentedString(jumperServerId)).append("\n");
        sb.append("    smbCredentialId: ").append(toIndentedString(smbCredentialId)).append("\n");
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
