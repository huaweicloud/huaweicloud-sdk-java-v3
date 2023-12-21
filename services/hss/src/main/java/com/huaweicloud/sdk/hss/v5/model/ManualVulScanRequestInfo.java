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
 * 手工检测漏洞接口请求体
 */
public class ManualVulScanRequestInfo {

    /**
     * Gets or Sets manualScanType
     */
    public static final class ManualScanTypeEnum {

        /**
         * Enum LINUX_VUL for value: "linux_vul"
         */
        public static final ManualScanTypeEnum LINUX_VUL = new ManualScanTypeEnum("linux_vul");

        /**
         * Enum WINDOWS_VUL for value: "windows_vul"
         */
        public static final ManualScanTypeEnum WINDOWS_VUL = new ManualScanTypeEnum("windows_vul");

        /**
         * Enum WEB_CMS for value: "web_cms"
         */
        public static final ManualScanTypeEnum WEB_CMS = new ManualScanTypeEnum("web_cms");

        /**
         * Enum APP_VUL for value: "app_vul"
         */
        public static final ManualScanTypeEnum APP_VUL = new ManualScanTypeEnum("app_vul");

        /**
         * Enum URGENT_VUL for value: "urgent_vul"
         */
        public static final ManualScanTypeEnum URGENT_VUL = new ManualScanTypeEnum("urgent_vul");

        private static final Map<String, ManualScanTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ManualScanTypeEnum> createStaticFields() {
            Map<String, ManualScanTypeEnum> map = new HashMap<>();
            map.put("linux_vul", LINUX_VUL);
            map.put("windows_vul", WINDOWS_VUL);
            map.put("web_cms", WEB_CMS);
            map.put("app_vul", APP_VUL);
            map.put("urgent_vul", URGENT_VUL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ManualScanTypeEnum(String value) {
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
        public static ManualScanTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ManualScanTypeEnum(value));
        }

        public static ManualScanTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ManualScanTypeEnum) {
                return this.value.equals(((ManualScanTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manual_scan_type")

    private List<ManualScanTypeEnum> manualScanType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_flag")

    private Boolean batchFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_type")

    private String rangeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id_list")

    private List<String> agentIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urgent_vul_id_list")

    private List<String> urgentVulIdList = null;

    public ManualVulScanRequestInfo withManualScanType(List<ManualScanTypeEnum> manualScanType) {
        this.manualScanType = manualScanType;
        return this;
    }

    public ManualVulScanRequestInfo addManualScanTypeItem(ManualScanTypeEnum manualScanTypeItem) {
        if (this.manualScanType == null) {
            this.manualScanType = new ArrayList<>();
        }
        this.manualScanType.add(manualScanTypeItem);
        return this;
    }

    public ManualVulScanRequestInfo withManualScanType(Consumer<List<ManualScanTypeEnum>> manualScanTypeSetter) {
        if (this.manualScanType == null) {
            this.manualScanType = new ArrayList<>();
        }
        manualScanTypeSetter.accept(this.manualScanType);
        return this;
    }

    /**
     * 操作类型,包含如下：   -linux_vul : linux漏洞   -windows_vul : windows漏洞   -web_cms : Web-CMS漏洞   -app_vul : 应用漏洞   -urgent_vul : 应急漏洞
     * @return manualScanType
     */
    public List<ManualScanTypeEnum> getManualScanType() {
        return manualScanType;
    }

    public void setManualScanType(List<ManualScanTypeEnum> manualScanType) {
        this.manualScanType = manualScanType;
    }

    public ManualVulScanRequestInfo withBatchFlag(Boolean batchFlag) {
        this.batchFlag = batchFlag;
        return this;
    }

    /**
     * 是否是批量操作,为true时扫描所有支持的主机
     * @return batchFlag
     */
    public Boolean getBatchFlag() {
        return batchFlag;
    }

    public void setBatchFlag(Boolean batchFlag) {
        this.batchFlag = batchFlag;
    }

    public ManualVulScanRequestInfo withRangeType(String rangeType) {
        this.rangeType = rangeType;
        return this;
    }

    /**
     * 扫描主机的范围，包含如下：   -all_host : 扫描全部主机,此类型不需要填写agent_id_list   -specific_host : 扫描指定主机
     * @return rangeType
     */
    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }

    public ManualVulScanRequestInfo withAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }

    public ManualVulScanRequestInfo addAgentIdListItem(String agentIdListItem) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        this.agentIdList.add(agentIdListItem);
        return this;
    }

    public ManualVulScanRequestInfo withAgentIdList(Consumer<List<String>> agentIdListSetter) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        agentIdListSetter.accept(this.agentIdList);
        return this;
    }

    /**
     * 主机列表
     * @return agentIdList
     */
    public List<String> getAgentIdList() {
        return agentIdList;
    }

    public void setAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
    }

    public ManualVulScanRequestInfo withUrgentVulIdList(List<String> urgentVulIdList) {
        this.urgentVulIdList = urgentVulIdList;
        return this;
    }

    public ManualVulScanRequestInfo addUrgentVulIdListItem(String urgentVulIdListItem) {
        if (this.urgentVulIdList == null) {
            this.urgentVulIdList = new ArrayList<>();
        }
        this.urgentVulIdList.add(urgentVulIdListItem);
        return this;
    }

    public ManualVulScanRequestInfo withUrgentVulIdList(Consumer<List<String>> urgentVulIdListSetter) {
        if (this.urgentVulIdList == null) {
            this.urgentVulIdList = new ArrayList<>();
        }
        urgentVulIdListSetter.accept(this.urgentVulIdList);
        return this;
    }

    /**
     * 扫描的应急漏洞id列表，若为空则扫描所有应急漏洞 包含如下： \"URGENT-CVE-2023-46604   Apache ActiveMQ远程代码执行漏洞\" \"URGENT-HSSVD-2020-1109  Elasticsearch 未授权访问漏洞\" \"URGENT-CVE-2022-26134   Atlassian Confluence OGNL 远程代码执行漏洞（CVE-2022-26134）\" \"URGENT-CVE-2023-22515   Atlassian Confluence Data Center and Server 权限提升漏洞(CVE-2023-22515)\" \"URGENT-CVE-2023-22518   Atlassian Confluence Data Center & Server 授权机制不恰当漏洞(CVE-2023-22518)\" \"URGENT-CVE-2023-28432   MinIO 信息泄露漏洞（CVE-2023-28432）\" \"URGENT-CVE-2023-37582   Apache RocketMQ 远程代码执行漏洞(CVE-2023-37582)\" \"URGENT-CVE-2023-33246   Apache RocketMQ 远程代码执行漏洞(CVE-2023-33246)\" \"URGENT-CNVD-2023-02709  禅道项目管理系统远程命令执行漏洞(CNVD-2023-02709)\" \"URGENT-CVE-2022-36804   Atlassian Bitbucket Server 和 Data Center 命令注入漏洞(CVE-2022-36804)\" \"URGENT-CVE-2022-22965   Spring Framework JDK >= 9 远程代码执行漏洞\" \"URGENT-CVE-2022-25845   fastjson <1.2.83 远程代码执行漏洞\" \"URGENT-CVE-2019-14439   Jackson-databind远程命令执行漏洞（CVE-2019-14439）\" \"URGENT-CVE-2020-13933   Apache Shiro身份验证绕过漏洞（CVE-2020-13933）\" \"URGENT-CVE-2020-26217   XStream < 1.4.14 远程代码执行漏洞（CVE-2020-26217）\" \"URGENT-CVE-2021-4034    Linux Polkit 权限提升漏洞预警（CVE-2021-4034）\" \"URGENT-CVE-2021-44228   Apache Log4j2 远程代码执行漏洞（CVE-2021-44228、CVE-2021-45046）\" \"URGENT-CVE-2022-0847    Dirty Pipe - Linux 内核本地提权漏洞（CVE-2022-0847）\"
     * @return urgentVulIdList
     */
    public List<String> getUrgentVulIdList() {
        return urgentVulIdList;
    }

    public void setUrgentVulIdList(List<String> urgentVulIdList) {
        this.urgentVulIdList = urgentVulIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManualVulScanRequestInfo that = (ManualVulScanRequestInfo) obj;
        return Objects.equals(this.manualScanType, that.manualScanType)
            && Objects.equals(this.batchFlag, that.batchFlag) && Objects.equals(this.rangeType, that.rangeType)
            && Objects.equals(this.agentIdList, that.agentIdList)
            && Objects.equals(this.urgentVulIdList, that.urgentVulIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manualScanType, batchFlag, rangeType, agentIdList, urgentVulIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManualVulScanRequestInfo {\n");
        sb.append("    manualScanType: ").append(toIndentedString(manualScanType)).append("\n");
        sb.append("    batchFlag: ").append(toIndentedString(batchFlag)).append("\n");
        sb.append("    rangeType: ").append(toIndentedString(rangeType)).append("\n");
        sb.append("    agentIdList: ").append(toIndentedString(agentIdList)).append("\n");
        sb.append("    urgentVulIdList: ").append(toIndentedString(urgentVulIdList)).append("\n");
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
