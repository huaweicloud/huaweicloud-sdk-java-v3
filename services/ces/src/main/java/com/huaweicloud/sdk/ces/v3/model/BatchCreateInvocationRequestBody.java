package com.huaweicloud.sdk.ces.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateInvocationRequestBody
 */
public class BatchCreateInvocationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    /**
     * 任务类型，INSTALL 安装，UPDATE升级，ROLLBACK回退，RETRY重试
     */
    public static final class InvocationTypeEnum {

        /**
         * Enum INSTALL for value: "INSTALL"
         */
        public static final InvocationTypeEnum INSTALL = new InvocationTypeEnum("INSTALL");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final InvocationTypeEnum UPDATE = new InvocationTypeEnum("UPDATE");

        /**
         * Enum ROLLBACK for value: "ROLLBACK"
         */
        public static final InvocationTypeEnum ROLLBACK = new InvocationTypeEnum("ROLLBACK");

        /**
         * Enum RETRY for value: "RETRY"
         */
        public static final InvocationTypeEnum RETRY = new InvocationTypeEnum("RETRY");

        private static final Map<String, InvocationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvocationTypeEnum> createStaticFields() {
            Map<String, InvocationTypeEnum> map = new HashMap<>();
            map.put("INSTALL", INSTALL);
            map.put("UPDATE", UPDATE);
            map.put("ROLLBACK", ROLLBACK);
            map.put("RETRY", RETRY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InvocationTypeEnum(String value) {
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
        public static InvocationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InvocationTypeEnum(value));
        }

        public static InvocationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InvocationTypeEnum) {
                return this.value.equals(((InvocationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_type")

    private InvocationTypeEnum invocationType;

    /**
     * 任务对象，目前仅支持telescope
     */
    public static final class InvocationTargetEnum {

        /**
         * Enum TELESCOPE for value: "telescope"
         */
        public static final InvocationTargetEnum TELESCOPE = new InvocationTargetEnum("telescope");

        private static final Map<String, InvocationTargetEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvocationTargetEnum> createStaticFields() {
            Map<String, InvocationTargetEnum> map = new HashMap<>();
            map.put("telescope", TELESCOPE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InvocationTargetEnum(String value) {
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
        public static InvocationTargetEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InvocationTargetEnum(value));
        }

        public static InvocationTargetEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InvocationTargetEnum) {
                return this.value.equals(((InvocationTargetEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_target")

    private InvocationTargetEnum invocationTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_ids")

    private List<String> invocationIds = null;

    /**
     * 插件升级时需要选择升级“基础版本”还是“增强版本”，传值“BASIC_VERSION”表示升级成基础版本，传值“ADVANCE_VERSION”表示升级成增强版本
     */
    public static final class VersionTypeEnum {

        /**
         * Enum BASIC_VERSION for value: "BASIC_VERSION"
         */
        public static final VersionTypeEnum BASIC_VERSION = new VersionTypeEnum("BASIC_VERSION");

        /**
         * Enum ADVANCE_VERSION for value: "ADVANCE_VERSION"
         */
        public static final VersionTypeEnum ADVANCE_VERSION = new VersionTypeEnum("ADVANCE_VERSION");

        private static final Map<String, VersionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VersionTypeEnum> createStaticFields() {
            Map<String, VersionTypeEnum> map = new HashMap<>();
            map.put("BASIC_VERSION", BASIC_VERSION);
            map.put("ADVANCE_VERSION", ADVANCE_VERSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VersionTypeEnum(String value) {
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
        public static VersionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VersionTypeEnum(value));
        }

        public static VersionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VersionTypeEnum) {
                return this.value.equals(((VersionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_type")

    private VersionTypeEnum versionType;

    /**
     * Agent任务接口调用源，CES表示由Console调用，APICOM_BMS表示由裸金属服务器调用，ADMIN_SERVER表示由运维平台调用
     */
    public static final class OriginEnum {

        /**
         * Enum CES for value: "CES"
         */
        public static final OriginEnum CES = new OriginEnum("CES");

        /**
         * Enum APICOM_BMS for value: "APICOM_BMS"
         */
        public static final OriginEnum APICOM_BMS = new OriginEnum("APICOM_BMS");

        /**
         * Enum ADMIN_SERVER for value: "ADMIN_SERVER"
         */
        public static final OriginEnum ADMIN_SERVER = new OriginEnum("ADMIN_SERVER");

        private static final Map<String, OriginEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginEnum> createStaticFields() {
            Map<String, OriginEnum> map = new HashMap<>();
            map.put("CES", CES);
            map.put("APICOM_BMS", APICOM_BMS);
            map.put("ADMIN_SERVER", ADMIN_SERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginEnum(String value) {
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
        public static OriginEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OriginEnum(value));
        }

        public static OriginEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OriginEnum) {
                return this.value.equals(((OriginEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin")

    private OriginEnum origin;

    public BatchCreateInvocationRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public BatchCreateInvocationRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public BatchCreateInvocationRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 主机id列表（INSTALL和UPDATE时必须）
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public BatchCreateInvocationRequestBody withInvocationType(InvocationTypeEnum invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    /**
     * 任务类型，INSTALL 安装，UPDATE升级，ROLLBACK回退，RETRY重试
     * @return invocationType
     */
    public InvocationTypeEnum getInvocationType() {
        return invocationType;
    }

    public void setInvocationType(InvocationTypeEnum invocationType) {
        this.invocationType = invocationType;
    }

    public BatchCreateInvocationRequestBody withInvocationTarget(InvocationTargetEnum invocationTarget) {
        this.invocationTarget = invocationTarget;
        return this;
    }

    /**
     * 任务对象，目前仅支持telescope
     * @return invocationTarget
     */
    public InvocationTargetEnum getInvocationTarget() {
        return invocationTarget;
    }

    public void setInvocationTarget(InvocationTargetEnum invocationTarget) {
        this.invocationTarget = invocationTarget;
    }

    public BatchCreateInvocationRequestBody withInvocationIds(List<String> invocationIds) {
        this.invocationIds = invocationIds;
        return this;
    }

    public BatchCreateInvocationRequestBody addInvocationIdsItem(String invocationIdsItem) {
        if (this.invocationIds == null) {
            this.invocationIds = new ArrayList<>();
        }
        this.invocationIds.add(invocationIdsItem);
        return this;
    }

    public BatchCreateInvocationRequestBody withInvocationIds(Consumer<List<String>> invocationIdsSetter) {
        if (this.invocationIds == null) {
            this.invocationIds = new ArrayList<>();
        }
        invocationIdsSetter.accept(this.invocationIds);
        return this;
    }

    /**
     * 任务ID列表（ROLLBACK和RETRY时必须）
     * @return invocationIds
     */
    public List<String> getInvocationIds() {
        return invocationIds;
    }

    public void setInvocationIds(List<String> invocationIds) {
        this.invocationIds = invocationIds;
    }

    public BatchCreateInvocationRequestBody withVersionType(VersionTypeEnum versionType) {
        this.versionType = versionType;
        return this;
    }

    /**
     * 插件升级时需要选择升级“基础版本”还是“增强版本”，传值“BASIC_VERSION”表示升级成基础版本，传值“ADVANCE_VERSION”表示升级成增强版本
     * @return versionType
     */
    public VersionTypeEnum getVersionType() {
        return versionType;
    }

    public void setVersionType(VersionTypeEnum versionType) {
        this.versionType = versionType;
    }

    public BatchCreateInvocationRequestBody withOrigin(OriginEnum origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Agent任务接口调用源，CES表示由Console调用，APICOM_BMS表示由裸金属服务器调用，ADMIN_SERVER表示由运维平台调用
     * @return origin
     */
    public OriginEnum getOrigin() {
        return origin;
    }

    public void setOrigin(OriginEnum origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateInvocationRequestBody that = (BatchCreateInvocationRequestBody) obj;
        return Objects.equals(this.instanceIds, that.instanceIds)
            && Objects.equals(this.invocationType, that.invocationType)
            && Objects.equals(this.invocationTarget, that.invocationTarget)
            && Objects.equals(this.invocationIds, that.invocationIds)
            && Objects.equals(this.versionType, that.versionType) && Objects.equals(this.origin, that.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, invocationType, invocationTarget, invocationIds, versionType, origin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateInvocationRequestBody {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
        sb.append("    invocationTarget: ").append(toIndentedString(invocationTarget)).append("\n");
        sb.append("    invocationIds: ").append(toIndentedString(invocationIds)).append("\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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
