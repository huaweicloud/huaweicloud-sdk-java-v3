package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ShowCrossCloudDisasterRelationsRequest {

    /**
     * **参数解释**: 语言。 **约束限制**: 不涉及。 **取值范围**:   - zh-cn   - en-us  **默认取值**: en-us
     */
    public static final class XLanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XLanguageEnum(value));
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 容灾角色 - master 主 - disaster 备
     */
    public static final class DrRoleEnum {

        /**
         * Enum MASTER for value: "master"
         */
        public static final DrRoleEnum MASTER = new DrRoleEnum("master");

        /**
         * Enum DISASTER for value: "disaster"
         */
        public static final DrRoleEnum DISASTER = new DrRoleEnum("disaster");

        private static final Map<String, DrRoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DrRoleEnum> createStaticFields() {
            Map<String, DrRoleEnum> map = new HashMap<>();
            map.put("master", MASTER);
            map.put("disaster", DISASTER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DrRoleEnum(String value) {
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
        public static DrRoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DrRoleEnum(value));
        }

        public static DrRoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DrRoleEnum) {
                return this.value.equals(((DrRoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_role")

    private DrRoleEnum drRole;

    /**
     * 容灾类型 - stream - dorado
     */
    public static final class DrTypeEnum {

        /**
         * Enum STREAM for value: "stream"
         */
        public static final DrTypeEnum STREAM = new DrTypeEnum("stream");

        /**
         * Enum DORADO for value: "dorado"
         */
        public static final DrTypeEnum DORADO = new DrTypeEnum("dorado");

        private static final Map<String, DrTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DrTypeEnum> createStaticFields() {
            Map<String, DrTypeEnum> map = new HashMap<>();
            map.put("stream", STREAM);
            map.put("dorado", DORADO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DrTypeEnum(String value) {
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
        public static DrTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DrTypeEnum(value));
        }

        public static DrTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DrTypeEnum) {
                return this.value.equals(((DrTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_type")

    private DrTypeEnum drType;

    /**
     * 状态 - normal - failover - pending - pre_check_failed - pre_checking
     */
    public static final class DrStatusEnum {

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final DrStatusEnum NORMAL = new DrStatusEnum("normal");

        /**
         * Enum FAILOVER for value: "failover"
         */
        public static final DrStatusEnum FAILOVER = new DrStatusEnum("failover");

        /**
         * Enum PENDING for value: "pending"
         */
        public static final DrStatusEnum PENDING = new DrStatusEnum("pending");

        /**
         * Enum PRE_CHECK_FAILED for value: "pre_check_failed"
         */
        public static final DrStatusEnum PRE_CHECK_FAILED = new DrStatusEnum("pre_check_failed");

        /**
         * Enum PRE_CHECKING for value: "pre_checking"
         */
        public static final DrStatusEnum PRE_CHECKING = new DrStatusEnum("pre_checking");

        private static final Map<String, DrStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DrStatusEnum> createStaticFields() {
            Map<String, DrStatusEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("failover", FAILOVER);
            map.put("pending", PENDING);
            map.put("pre_check_failed", PRE_CHECK_FAILED);
            map.put("pre_checking", PRE_CHECKING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DrStatusEnum(String value) {
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
        public static DrStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DrStatusEnum(value));
        }

        public static DrStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DrStatusEnum) {
                return this.value.equals(((DrStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_status")

    private DrStatusEnum drStatus;

    public ShowCrossCloudDisasterRelationsRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * **参数解释**: 语言。 **约束限制**: 不涉及。 **取值范围**:   - zh-cn   - en-us  **默认取值**: en-us
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ShowCrossCloudDisasterRelationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数。默认为100，不能为负数，最小值为1，最大值为100。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowCrossCloudDisasterRelationsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowCrossCloudDisasterRelationsRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称，可查询过滤本端实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ShowCrossCloudDisasterRelationsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id，可查询过滤本端实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowCrossCloudDisasterRelationsRequest withDrRole(DrRoleEnum drRole) {
        this.drRole = drRole;
        return this;
    }

    /**
     * 容灾角色 - master 主 - disaster 备
     * @return drRole
     */
    public DrRoleEnum getDrRole() {
        return drRole;
    }

    public void setDrRole(DrRoleEnum drRole) {
        this.drRole = drRole;
    }

    public ShowCrossCloudDisasterRelationsRequest withDrType(DrTypeEnum drType) {
        this.drType = drType;
        return this;
    }

    /**
     * 容灾类型 - stream - dorado
     * @return drType
     */
    public DrTypeEnum getDrType() {
        return drType;
    }

    public void setDrType(DrTypeEnum drType) {
        this.drType = drType;
    }

    public ShowCrossCloudDisasterRelationsRequest withDrStatus(DrStatusEnum drStatus) {
        this.drStatus = drStatus;
        return this;
    }

    /**
     * 状态 - normal - failover - pending - pre_check_failed - pre_checking
     * @return drStatus
     */
    public DrStatusEnum getDrStatus() {
        return drStatus;
    }

    public void setDrStatus(DrStatusEnum drStatus) {
        this.drStatus = drStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCrossCloudDisasterRelationsRequest that = (ShowCrossCloudDisasterRelationsRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.drRole, that.drRole)
            && Objects.equals(this.drType, that.drType) && Objects.equals(this.drStatus, that.drStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, limit, offset, instanceName, instanceId, drRole, drType, drStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCrossCloudDisasterRelationsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    drRole: ").append(toIndentedString(drRole)).append("\n");
        sb.append("    drType: ").append(toIndentedString(drType)).append("\n");
        sb.append("    drStatus: ").append(toIndentedString(drStatus)).append("\n");
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
