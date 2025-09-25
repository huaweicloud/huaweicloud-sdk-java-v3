package com.huaweicloud.sdk.hss.v5.model;

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
 * ExportHandledVulnerabilitiesRequestBody
 */
public class ExportHandledVulnerabilitiesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    /**
     * 漏洞修复优先级,包含如下 - Critical 紧急 - High 高 - Medium 中 - Low 低
     */
    public static final class RepairPriorityEnum {

        /**
         * Enum CRITICAL for value: "Critical"
         */
        public static final RepairPriorityEnum CRITICAL = new RepairPriorityEnum("Critical");

        /**
         * Enum HIGH for value: "High"
         */
        public static final RepairPriorityEnum HIGH = new RepairPriorityEnum("High");

        /**
         * Enum MEDIUM for value: "Medium"
         */
        public static final RepairPriorityEnum MEDIUM = new RepairPriorityEnum("Medium");

        /**
         * Enum LOW for value: "Low"
         */
        public static final RepairPriorityEnum LOW = new RepairPriorityEnum("Low");

        private static final Map<String, RepairPriorityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RepairPriorityEnum> createStaticFields() {
            Map<String, RepairPriorityEnum> map = new HashMap<>();
            map.put("Critical", CRITICAL);
            map.put("High", HIGH);
            map.put("Medium", MEDIUM);
            map.put("Low", LOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RepairPriorityEnum(String value) {
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
        public static RepairPriorityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RepairPriorityEnum(value));
        }

        public static RepairPriorityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RepairPriorityEnum) {
                return this.value.equals(((RepairPriorityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_priority")

    private RepairPriorityEnum repairPriority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_affect_business")

    private Boolean isAffectBusiness;

    /**
     * 漏洞状态   - vul_status_unfix : 未处理   - vul_status_ignored : 已忽略   - vul_status_verified : 验证中   - vul_status_fixing : 修复中   - vul_status_fixed : 修复成功   - vul_status_reboot : 修复成功待重启   - vul_status_failed : 修复失败   - vul_status_fix_after_reboot : 请重启主机再次修复
     */
    public static final class StatusEnum {

        /**
         * Enum VUL_STATUS_UNFIX for value: "vul_status_unfix"
         */
        public static final StatusEnum VUL_STATUS_UNFIX = new StatusEnum("vul_status_unfix");

        /**
         * Enum VUL_STATUS_IGNORED for value: "vul_status_ignored"
         */
        public static final StatusEnum VUL_STATUS_IGNORED = new StatusEnum("vul_status_ignored");

        /**
         * Enum VUL_STATUS_VERIFIED for value: "vul_status_verified"
         */
        public static final StatusEnum VUL_STATUS_VERIFIED = new StatusEnum("vul_status_verified");

        /**
         * Enum VUL_STATUS_FIXING for value: "vul_status_fixing"
         */
        public static final StatusEnum VUL_STATUS_FIXING = new StatusEnum("vul_status_fixing");

        /**
         * Enum VUL_STATUS_FIXED for value: "vul_status_fixed"
         */
        public static final StatusEnum VUL_STATUS_FIXED = new StatusEnum("vul_status_fixed");

        /**
         * Enum VUL_STATUS_REBOOT for value: "vul_status_reboot"
         */
        public static final StatusEnum VUL_STATUS_REBOOT = new StatusEnum("vul_status_reboot");

        /**
         * Enum VUL_STATUS_FAILED for value: "vul_status_failed"
         */
        public static final StatusEnum VUL_STATUS_FAILED = new StatusEnum("vul_status_failed");

        /**
         * Enum VUL_STATUS_FIX_AFTER_REBOOT for value: "vul_status_fix_after_reboot"
         */
        public static final StatusEnum VUL_STATUS_FIX_AFTER_REBOOT = new StatusEnum("vul_status_fix_after_reboot");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("vul_status_unfix", VUL_STATUS_UNFIX);
            map.put("vul_status_ignored", VUL_STATUS_IGNORED);
            map.put("vul_status_verified", VUL_STATUS_VERIFIED);
            map.put("vul_status_fixing", VUL_STATUS_FIXING);
            map.put("vul_status_fixed", VUL_STATUS_FIXED);
            map.put("vul_status_reboot", VUL_STATUS_REBOOT);
            map.put("vul_status_failed", VUL_STATUS_FAILED);
            map.put("vul_status_fix_after_reboot", VUL_STATUS_FIX_AFTER_REBOOT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * 资产重要性 important:重要 common：一般 test：测试
     */
    public static final class AssetValueEnum {

        /**
         * Enum IMPORTANT for value: "important"
         */
        public static final AssetValueEnum IMPORTANT = new AssetValueEnum("important");

        /**
         * Enum COMMON for value: "common"
         */
        public static final AssetValueEnum COMMON = new AssetValueEnum("common");

        /**
         * Enum TEST for value: "test"
         */
        public static final AssetValueEnum TEST = new AssetValueEnum("test");

        private static final Map<String, AssetValueEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetValueEnum> createStaticFields() {
            Map<String, AssetValueEnum> map = new HashMap<>();
            map.put("important", IMPORTANT);
            map.put("common", COMMON);
            map.put("test", TEST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetValueEnum(String value) {
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
        public static AssetValueEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssetValueEnum(value));
        }

        public static AssetValueEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssetValueEnum) {
                return this.value.equals(((AssetValueEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private AssetValueEnum assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    /**
     * 漏洞类型，包含如下：   -linux_vul : linux漏洞   -windows_vul : windows漏洞   -web_cms : Web-CMS漏洞   -app_vul : 应用漏洞   -urgent_vul : 应急漏洞
     */
    public static final class TypeEnum {

        /**
         * Enum LINUX_VUL for value: "linux_vul"
         */
        public static final TypeEnum LINUX_VUL = new TypeEnum("linux_vul");

        /**
         * Enum WINDOWS_VUL for value: "windows_vul"
         */
        public static final TypeEnum WINDOWS_VUL = new TypeEnum("windows_vul");

        /**
         * Enum WEB_CMS for value: "web_cms"
         */
        public static final TypeEnum WEB_CMS = new TypeEnum("web_cms");

        /**
         * Enum APP_VUL for value: "app_vul"
         */
        public static final TypeEnum APP_VUL = new TypeEnum("app_vul");

        /**
         * Enum URGENT_VUL for value: "urgent_vul"
         */
        public static final TypeEnum URGENT_VUL = new TypeEnum("urgent_vul");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("linux_vul", LINUX_VUL);
            map.put("windows_vul", WINDOWS_VUL);
            map.put("web_cms", WEB_CMS);
            map.put("app_vul", APP_VUL);
            map.put("urgent_vul", URGENT_VUL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    /**
     * 需要查询的漏洞处置周期：   - today：查询今日处理的数据   - all：查询所有已处理数据
     */
    public static final class HandleCycleEnum {

        /**
         * Enum TODAY for value: "today"
         */
        public static final HandleCycleEnum TODAY = new HandleCycleEnum("today");

        /**
         * Enum ALL for value: "all"
         */
        public static final HandleCycleEnum ALL = new HandleCycleEnum("all");

        private static final Map<String, HandleCycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HandleCycleEnum> createStaticFields() {
            Map<String, HandleCycleEnum> map = new HashMap<>();
            map.put("today", TODAY);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HandleCycleEnum(String value) {
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
        public static HandleCycleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HandleCycleEnum(value));
        }

        public static HandleCycleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HandleCycleEnum) {
                return this.value.equals(((HandleCycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_cycle")

    private HandleCycleEnum handleCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specific_vuls")

    private List<ExportHandledVulnerabilitiesRequestBodySpecificVuls> specificVuls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_size")

    private Integer exportSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_headers")

    private List<List<String>> exportHeaders = null;

    public ExportHandledVulnerabilitiesRequestBody withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * 漏洞名称
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public ExportHandledVulnerabilitiesRequestBody withRepairPriority(RepairPriorityEnum repairPriority) {
        this.repairPriority = repairPriority;
        return this;
    }

    /**
     * 漏洞修复优先级,包含如下 - Critical 紧急 - High 高 - Medium 中 - Low 低
     * @return repairPriority
     */
    public RepairPriorityEnum getRepairPriority() {
        return repairPriority;
    }

    public void setRepairPriority(RepairPriorityEnum repairPriority) {
        this.repairPriority = repairPriority;
    }

    public ExportHandledVulnerabilitiesRequestBody withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ExportHandledVulnerabilitiesRequestBody withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 主机ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ExportHandledVulnerabilitiesRequestBody withIsAffectBusiness(Boolean isAffectBusiness) {
        this.isAffectBusiness = isAffectBusiness;
        return this;
    }

    /**
     * 是否影响业务
     * @return isAffectBusiness
     */
    public Boolean getIsAffectBusiness() {
        return isAffectBusiness;
    }

    public void setIsAffectBusiness(Boolean isAffectBusiness) {
        this.isAffectBusiness = isAffectBusiness;
    }

    public ExportHandledVulnerabilitiesRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 漏洞状态   - vul_status_unfix : 未处理   - vul_status_ignored : 已忽略   - vul_status_verified : 验证中   - vul_status_fixing : 修复中   - vul_status_fixed : 修复成功   - vul_status_reboot : 修复成功待重启   - vul_status_failed : 修复失败   - vul_status_fix_after_reboot : 请重启主机再次修复
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ExportHandledVulnerabilitiesRequestBody withAssetValue(AssetValueEnum assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * 资产重要性 important:重要 common：一般 test：测试
     * @return assetValue
     */
    public AssetValueEnum getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(AssetValueEnum assetValue) {
        this.assetValue = assetValue;
    }

    public ExportHandledVulnerabilitiesRequestBody withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 漏洞标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ExportHandledVulnerabilitiesRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 漏洞类型，包含如下：   -linux_vul : linux漏洞   -windows_vul : windows漏洞   -web_cms : Web-CMS漏洞   -app_vul : 应用漏洞   -urgent_vul : 应急漏洞
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ExportHandledVulnerabilitiesRequestBody withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 服务器组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ExportHandledVulnerabilitiesRequestBody withHandleCycle(HandleCycleEnum handleCycle) {
        this.handleCycle = handleCycle;
        return this;
    }

    /**
     * 需要查询的漏洞处置周期：   - today：查询今日处理的数据   - all：查询所有已处理数据
     * @return handleCycle
     */
    public HandleCycleEnum getHandleCycle() {
        return handleCycle;
    }

    public void setHandleCycle(HandleCycleEnum handleCycle) {
        this.handleCycle = handleCycle;
    }

    public ExportHandledVulnerabilitiesRequestBody withSpecificVuls(
        List<ExportHandledVulnerabilitiesRequestBodySpecificVuls> specificVuls) {
        this.specificVuls = specificVuls;
        return this;
    }

    public ExportHandledVulnerabilitiesRequestBody addSpecificVulsItem(
        ExportHandledVulnerabilitiesRequestBodySpecificVuls specificVulsItem) {
        if (this.specificVuls == null) {
            this.specificVuls = new ArrayList<>();
        }
        this.specificVuls.add(specificVulsItem);
        return this;
    }

    public ExportHandledVulnerabilitiesRequestBody withSpecificVuls(
        Consumer<List<ExportHandledVulnerabilitiesRequestBodySpecificVuls>> specificVulsSetter) {
        if (this.specificVuls == null) {
            this.specificVuls = new ArrayList<>();
        }
        specificVulsSetter.accept(this.specificVuls);
        return this;
    }

    /**
     * 指定要导出的漏洞数据
     * @return specificVuls
     */
    public List<ExportHandledVulnerabilitiesRequestBodySpecificVuls> getSpecificVuls() {
        return specificVuls;
    }

    public void setSpecificVuls(List<ExportHandledVulnerabilitiesRequestBodySpecificVuls> specificVuls) {
        this.specificVuls = specificVuls;
    }

    public ExportHandledVulnerabilitiesRequestBody withExportSize(Integer exportSize) {
        this.exportSize = exportSize;
        return this;
    }

    /**
     * 导出数据条数
     * minimum: 1
     * maximum: 200000
     * @return exportSize
     */
    public Integer getExportSize() {
        return exportSize;
    }

    public void setExportSize(Integer exportSize) {
        this.exportSize = exportSize;
    }

    public ExportHandledVulnerabilitiesRequestBody withExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
        return this;
    }

    public ExportHandledVulnerabilitiesRequestBody addExportHeadersItem(List<String> exportHeadersItem) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        this.exportHeaders.add(exportHeadersItem);
        return this;
    }

    public ExportHandledVulnerabilitiesRequestBody withExportHeaders(Consumer<List<List<String>>> exportHeadersSetter) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        exportHeadersSetter.accept(this.exportHeaders);
        return this;
    }

    /**
     * 导出漏洞数据的表头信息列表
     * @return exportHeaders
     */
    public List<List<String>> getExportHeaders() {
        return exportHeaders;
    }

    public void setExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportHandledVulnerabilitiesRequestBody that = (ExportHandledVulnerabilitiesRequestBody) obj;
        return Objects.equals(this.vulName, that.vulName) && Objects.equals(this.repairPriority, that.repairPriority)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.isAffectBusiness, that.isAffectBusiness) && Objects.equals(this.status, that.status)
            && Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.label, that.label)
            && Objects.equals(this.type, that.type) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.handleCycle, that.handleCycle)
            && Objects.equals(this.specificVuls, that.specificVuls) && Objects.equals(this.exportSize, that.exportSize)
            && Objects.equals(this.exportHeaders, that.exportHeaders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulName,
            repairPriority,
            hostName,
            hostIp,
            isAffectBusiness,
            status,
            assetValue,
            label,
            type,
            groupName,
            handleCycle,
            specificVuls,
            exportSize,
            exportHeaders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportHandledVulnerabilitiesRequestBody {\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    repairPriority: ").append(toIndentedString(repairPriority)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    isAffectBusiness: ").append(toIndentedString(isAffectBusiness)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    handleCycle: ").append(toIndentedString(handleCycle)).append("\n");
        sb.append("    specificVuls: ").append(toIndentedString(specificVuls)).append("\n");
        sb.append("    exportSize: ").append(toIndentedString(exportSize)).append("\n");
        sb.append("    exportHeaders: ").append(toIndentedString(exportHeaders)).append("\n");
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
