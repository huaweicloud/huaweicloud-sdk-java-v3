package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListProtectionServersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    /**
     * 应用类型，包含如下1种。   - java ：java类型应用防护。
     */
    public static final class AppTypeEnum {

        /**
         * Enum JAVA for value: "java"
         */
        public static final AppTypeEnum JAVA = new AppTypeEnum("java");

        private static final Map<String, AppTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AppTypeEnum> createStaticFields() {
            Map<String, AppTypeEnum> map = new HashMap<>();
            map.put("java", JAVA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AppTypeEnum(String value) {
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
        public static AppTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppTypeEnum(value));
        }

        public static AppTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AppTypeEnum) {
                return this.value.equals(((AppTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private AppTypeEnum appType;

    /**
     * 应用防护状态，包含如下2种。   - closed ：未开启。   - opened ：防护中。
     */
    public static final class AppStatusEnum {

        /**
         * Enum CLOSED for value: "closed"
         */
        public static final AppStatusEnum CLOSED = new AppStatusEnum("closed");

        /**
         * Enum OPENED for value: "opened"
         */
        public static final AppStatusEnum OPENED = new AppStatusEnum("opened");

        private static final Map<String, AppStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AppStatusEnum> createStaticFields() {
            Map<String, AppStatusEnum> map = new HashMap<>();
            map.put("closed", CLOSED);
            map.put("opened", OPENED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AppStatusEnum(String value) {
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
        public static AppStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppStatusEnum(value));
        }

        public static AppStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AppStatusEnum) {
                return this.value.equals(((AppStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_status")

    private AppStatusEnum appStatus;

    public ListProtectionServersRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListProtectionServersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询起始点
     * minimum: 0
     * maximum: 2147483547
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProtectionServersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * minimum: 10
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProtectionServersRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 云主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListProtectionServersRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，包含如下2种。  - linux ：linux类型应用防护。  - windows ：windows类型应用防护。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListProtectionServersRequest withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 云主机私有IP
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ListProtectionServersRequest withAppType(AppTypeEnum appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 应用类型，包含如下1种。   - java ：java类型应用防护。
     * @return appType
     */
    public AppTypeEnum getAppType() {
        return appType;
    }

    public void setAppType(AppTypeEnum appType) {
        this.appType = appType;
    }

    public ListProtectionServersRequest withAppStatus(AppStatusEnum appStatus) {
        this.appStatus = appStatus;
        return this;
    }

    /**
     * 应用防护状态，包含如下2种。   - closed ：未开启。   - opened ：防护中。
     * @return appStatus
     */
    public AppStatusEnum getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(AppStatusEnum appStatus) {
        this.appStatus = appStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProtectionServersRequest that = (ListProtectionServersRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.hostIp, that.hostIp) && Objects.equals(this.appType, that.appType)
            && Objects.equals(this.appStatus, that.appStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, offset, limit, hostName, osType, hostIp, appType, appStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProtectionServersRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    appStatus: ").append(toIndentedString(appStatus)).append("\n");
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
