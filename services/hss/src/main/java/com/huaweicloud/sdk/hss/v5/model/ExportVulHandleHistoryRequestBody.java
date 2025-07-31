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
 * ExportVulHandleHistoryRequestBody
 */
public class ExportVulHandleHistoryRequestBody {

    /**
     * 漏洞状态 vul_status_unfix : 未处理 vul_status_ignored : 已忽略 vul_status_verified : 验证中 vul_status_fixing : 修复中 vul_status_fixed : 修复成功 vul_status_reboot : 修复成功待重启 vul_status_failed : 修复失败 vul_status_fix_after_reboot : 请重启主机再次修复
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    /**
     * 漏洞类型，包含如下：   -linux_vul : linux漏洞   -windows_vul : windows漏洞   -web_cms : Web-CMS漏洞   -app_vul : 应用漏洞   -urgent_vul : 应急漏洞
     */
    public static final class VulTypeEnum {

        /**
         * Enum LINUX_VUL for value: "linux_vul"
         */
        public static final VulTypeEnum LINUX_VUL = new VulTypeEnum("linux_vul");

        /**
         * Enum WINDOWS_VUL for value: "windows_vul"
         */
        public static final VulTypeEnum WINDOWS_VUL = new VulTypeEnum("windows_vul");

        /**
         * Enum WEB_CMS for value: "web_cms"
         */
        public static final VulTypeEnum WEB_CMS = new VulTypeEnum("web_cms");

        /**
         * Enum APP_VUL for value: "app_vul"
         */
        public static final VulTypeEnum APP_VUL = new VulTypeEnum("app_vul");

        /**
         * Enum URGENT_VUL for value: "urgent_vul"
         */
        public static final VulTypeEnum URGENT_VUL = new VulTypeEnum("urgent_vul");

        private static final Map<String, VulTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VulTypeEnum> createStaticFields() {
            Map<String, VulTypeEnum> map = new HashMap<>();
            map.put("linux_vul", LINUX_VUL);
            map.put("windows_vul", WINDOWS_VUL);
            map.put("web_cms", WEB_CMS);
            map.put("app_vul", APP_VUL);
            map.put("urgent_vul", URGENT_VUL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VulTypeEnum(String value) {
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
        public static VulTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VulTypeEnum(value));
        }

        public static VulTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VulTypeEnum) {
                return this.value.equals(((VulTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_type")

    private VulTypeEnum vulType;

    /**
     * 资产重要性，包含如下3种 important ：重要资产 common ：一般资产 test ：测试资产
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
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_size")

    private Integer exportSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_header_list")

    private List<List<String>> exportHeaderList = null;

    public ExportVulHandleHistoryRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 漏洞状态 vul_status_unfix : 未处理 vul_status_ignored : 已忽略 vul_status_verified : 验证中 vul_status_fixing : 修复中 vul_status_fixed : 修复成功 vul_status_reboot : 修复成功待重启 vul_status_failed : 修复失败 vul_status_fix_after_reboot : 请重启主机再次修复
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ExportVulHandleHistoryRequestBody withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * 漏洞ID
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public ExportVulHandleHistoryRequestBody withVulType(VulTypeEnum vulType) {
        this.vulType = vulType;
        return this;
    }

    /**
     * 漏洞类型，包含如下：   -linux_vul : linux漏洞   -windows_vul : windows漏洞   -web_cms : Web-CMS漏洞   -app_vul : 应用漏洞   -urgent_vul : 应急漏洞
     * @return vulType
     */
    public VulTypeEnum getVulType() {
        return vulType;
    }

    public void setVulType(VulTypeEnum vulType) {
        this.vulType = vulType;
    }

    public ExportVulHandleHistoryRequestBody withAssetValue(AssetValueEnum assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * 资产重要性，包含如下3种 important ：重要资产 common ：一般资产 test ：测试资产
     * @return assetValue
     */
    public AssetValueEnum getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(AssetValueEnum assetValue) {
        this.assetValue = assetValue;
    }

    public ExportVulHandleHistoryRequestBody withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 服务器组
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ExportVulHandleHistoryRequestBody withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ExportVulHandleHistoryRequestBody withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 服务器ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ExportVulHandleHistoryRequestBody withExportSize(Integer exportSize) {
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

    public ExportVulHandleHistoryRequestBody withExportHeaderList(List<List<String>> exportHeaderList) {
        this.exportHeaderList = exportHeaderList;
        return this;
    }

    public ExportVulHandleHistoryRequestBody addExportHeaderListItem(List<String> exportHeaderListItem) {
        if (this.exportHeaderList == null) {
            this.exportHeaderList = new ArrayList<>();
        }
        this.exportHeaderList.add(exportHeaderListItem);
        return this;
    }

    public ExportVulHandleHistoryRequestBody withExportHeaderList(Consumer<List<List<String>>> exportHeaderListSetter) {
        if (this.exportHeaderList == null) {
            this.exportHeaderList = new ArrayList<>();
        }
        exportHeaderListSetter.accept(this.exportHeaderList);
        return this;
    }

    /**
     * 导出漏洞数据的表头信息列表
     * @return exportHeaderList
     */
    public List<List<String>> getExportHeaderList() {
        return exportHeaderList;
    }

    public void setExportHeaderList(List<List<String>> exportHeaderList) {
        this.exportHeaderList = exportHeaderList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportVulHandleHistoryRequestBody that = (ExportVulHandleHistoryRequestBody) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.vulId, that.vulId)
            && Objects.equals(this.vulType, that.vulType) && Objects.equals(this.assetValue, that.assetValue)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostIp, that.hostIp) && Objects.equals(this.exportSize, that.exportSize)
            && Objects.equals(this.exportHeaderList, that.exportHeaderList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(status, vulId, vulType, assetValue, groupName, hostName, hostIp, exportSize, exportHeaderList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportVulHandleHistoryRequestBody {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    vulType: ").append(toIndentedString(vulType)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    exportSize: ").append(toIndentedString(exportSize)).append("\n");
        sb.append("    exportHeaderList: ").append(toIndentedString(exportHeaderList)).append("\n");
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
