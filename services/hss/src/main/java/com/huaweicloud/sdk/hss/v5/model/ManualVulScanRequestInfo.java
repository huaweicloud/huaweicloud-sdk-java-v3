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
     * **参数解释**: 扫描的漏洞类型 **约束限制**: 不涉及 **取值范围**:   - linux_vul：linux漏洞   - windows_vul：windows漏洞   - web_cms：Web-CMS漏洞   - app_vul：应用漏洞   - urgent_vul：应急漏洞  **默认取值**: 不涉及 
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
     * **参数解释**: 扫描的漏洞类型列表 **约束限制**: 不涉及 **取值范围**: 最小值1，最大值200 **默认取值**: 不涉及 
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
     * **参数解释**: 是否为批量扫描操作 **约束限制**: 不涉及 **取值范围**:   - true：是批量扫描操作   - false：不是批量扫描操作  **默认取值**: 不涉及 
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
     * **参数解释**: 扫描主机的范围 **约束限制**: 不涉及 **取值范围**:   - all_host：扫描全部主机，此类型不需要填写agent_id_list   - specific_host：扫描指定主机  **默认取值**: 不涉及 
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
     * **参数解释**: 需要扫描主机的agent id列表 **约束限制**: range_type值为specific_host时有效 **取值范围**: 最小值1，最大值200 **默认取值**: 不涉及 
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
     * **参数解释**: 扫描的应急漏洞id列表，该字段不传值则扫描所有应急漏洞 **约束限制**: manual_scan_type字段的值中包含“urgent_vul”时有效 **取值范围**: 最小值1，最大值200 **默认取值**: 不涉及 
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
