package com.huaweicloud.sdk.codeartsinspector.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HGHost
 */
public class HGHost {

    /**
     * 主机授权状态: * -1 未知 * 0 连接成功 * 1 不可达 * 2 登录失败 
     */
    public static final class AuthStatusEnum {

        /**
         * Enum NUMBER_MINUS_1 for value: -1
         */
        public static final AuthStatusEnum NUMBER_MINUS_1 = new AuthStatusEnum(-1);

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final AuthStatusEnum NUMBER_0 = new AuthStatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AuthStatusEnum NUMBER_1 = new AuthStatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final AuthStatusEnum NUMBER_2 = new AuthStatusEnum(2);

        private static final Map<Integer, AuthStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AuthStatusEnum> createStaticFields() {
            Map<Integer, AuthStatusEnum> map = new HashMap<>();
            map.put(-1, NUMBER_MINUS_1);
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AuthStatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthStatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthStatusEnum(value));
        }

        public static AuthStatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthStatusEnum) {
                return this.value.equals(((AuthStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_status")

    private AuthStatusEnum authStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jumper_server_id")

    private String jumperServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_scan_id")

    private String lastScanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_scan_info")

    private ScanInfoDetail lastScanInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smb_credential_id")

    private String smbCredentialId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_credential_id")

    private String sshCredentialId;

    public HGHost withAuthStatus(AuthStatusEnum authStatus) {
        this.authStatus = authStatus;
        return this;
    }

    /**
     * 主机授权状态: * -1 未知 * 0 连接成功 * 1 不可达 * 2 登录失败 
     * @return authStatus
     */
    public AuthStatusEnum getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(AuthStatusEnum authStatus) {
        this.authStatus = authStatus;
    }

    public HGHost withGroupId(String groupId) {
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

    public HGHost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主机id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HGHost withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 主机ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public HGHost withJumperServerId(String jumperServerId) {
        this.jumperServerId = jumperServerId;
        return this;
    }

    /**
     * 跳板机id
     * @return jumperServerId
     */
    public String getJumperServerId() {
        return jumperServerId;
    }

    public void setJumperServerId(String jumperServerId) {
        this.jumperServerId = jumperServerId;
    }

    public HGHost withLastScanId(String lastScanId) {
        this.lastScanId = lastScanId;
        return this;
    }

    /**
     * 最后一次扫描的id
     * @return lastScanId
     */
    public String getLastScanId() {
        return lastScanId;
    }

    public void setLastScanId(String lastScanId) {
        this.lastScanId = lastScanId;
    }

    public HGHost withLastScanInfo(ScanInfoDetail lastScanInfo) {
        this.lastScanInfo = lastScanInfo;
        return this;
    }

    public HGHost withLastScanInfo(Consumer<ScanInfoDetail> lastScanInfoSetter) {
        if (this.lastScanInfo == null) {
            this.lastScanInfo = new ScanInfoDetail();
            lastScanInfoSetter.accept(this.lastScanInfo);
        }

        return this;
    }

    /**
     * Get lastScanInfo
     * @return lastScanInfo
     */
    public ScanInfoDetail getLastScanInfo() {
        return lastScanInfo;
    }

    public void setLastScanInfo(ScanInfoDetail lastScanInfo) {
        this.lastScanInfo = lastScanInfo;
    }

    public HGHost withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主机名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HGHost withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 主机操作系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public HGHost withSmbCredentialId(String smbCredentialId) {
        this.smbCredentialId = smbCredentialId;
        return this;
    }

    /**
     * smb_credential_id
     * @return smbCredentialId
     */
    public String getSmbCredentialId() {
        return smbCredentialId;
    }

    public void setSmbCredentialId(String smbCredentialId) {
        this.smbCredentialId = smbCredentialId;
    }

    public HGHost withSshCredentialId(String sshCredentialId) {
        this.sshCredentialId = sshCredentialId;
        return this;
    }

    /**
     * ssh授权id
     * @return sshCredentialId
     */
    public String getSshCredentialId() {
        return sshCredentialId;
    }

    public void setSshCredentialId(String sshCredentialId) {
        this.sshCredentialId = sshCredentialId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HGHost that = (HGHost) obj;
        return Objects.equals(this.authStatus, that.authStatus) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.id, that.id) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.jumperServerId, that.jumperServerId)
            && Objects.equals(this.lastScanId, that.lastScanId) && Objects.equals(this.lastScanInfo, that.lastScanInfo)
            && Objects.equals(this.name, that.name) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.smbCredentialId, that.smbCredentialId)
            && Objects.equals(this.sshCredentialId, that.sshCredentialId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authStatus,
            groupId,
            id,
            ip,
            jumperServerId,
            lastScanId,
            lastScanInfo,
            name,
            osType,
            smbCredentialId,
            sshCredentialId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HGHost {\n");
        sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    jumperServerId: ").append(toIndentedString(jumperServerId)).append("\n");
        sb.append("    lastScanId: ").append(toIndentedString(lastScanId)).append("\n");
        sb.append("    lastScanInfo: ").append(toIndentedString(lastScanInfo)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    smbCredentialId: ").append(toIndentedString(smbCredentialId)).append("\n");
        sb.append("    sshCredentialId: ").append(toIndentedString(sshCredentialId)).append("\n");
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
