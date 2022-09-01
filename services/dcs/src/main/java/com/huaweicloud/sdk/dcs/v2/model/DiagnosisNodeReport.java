package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点诊断报告
 */
public class DiagnosisNodeReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ip")

    @JacksonXmlProperty(localName = "node_ip")

    private String nodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    @JacksonXmlProperty(localName = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_sum")

    @JacksonXmlProperty(localName = "abnormal_sum")

    private Integer abnormalSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_sum")

    @JacksonXmlProperty(localName = "failed_sum")

    private Integer failedSum;

    /**
     * 节点角色
     */
    public static final class RoleEnum {

        /**
         * Enum MASTER for value: "master"
         */
        public static final RoleEnum MASTER = new RoleEnum("master");

        /**
         * Enum SLAVE for value: "slave"
         */
        public static final RoleEnum SLAVE = new RoleEnum("slave");

        private static final Map<String, RoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleEnum> createStaticFields() {
            Map<String, RoleEnum> map = new HashMap<>();
            map.put("master", MASTER);
            map.put("slave", SLAVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RoleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RoleEnum(value);
            }
            return result;
        }

        public static RoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RoleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoleEnum) {
                return this.value.equals(((RoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    @JacksonXmlProperty(localName = "role")

    private RoleEnum role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_dimension_list")

    @JacksonXmlProperty(localName = "diagnosis_dimension_list")

    private List<DiagnosisDimension> diagnosisDimensionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_time_taken_list")

    @JacksonXmlProperty(localName = "command_time_taken_list")

    private CommandTimeTakenList commandTimeTakenList;

    public DiagnosisNodeReport withNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }

    /**
     * 节点IP。例如：192.168.0.234:6379
     * @return nodeIp
     */
    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public DiagnosisNodeReport withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 节点所在可用区Code
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public DiagnosisNodeReport withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 节点所在分片的名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public DiagnosisNodeReport withAbnormalSum(Integer abnormalSum) {
        this.abnormalSum = abnormalSum;
        return this;
    }

    /**
     * 诊断结果为异常的诊断项总数
     * @return abnormalSum
     */
    public Integer getAbnormalSum() {
        return abnormalSum;
    }

    public void setAbnormalSum(Integer abnormalSum) {
        this.abnormalSum = abnormalSum;
    }

    public DiagnosisNodeReport withFailedSum(Integer failedSum) {
        this.failedSum = failedSum;
        return this;
    }

    /**
     * 诊断失败的诊断项总数
     * @return failedSum
     */
    public Integer getFailedSum() {
        return failedSum;
    }

    public void setFailedSum(Integer failedSum) {
        this.failedSum = failedSum;
    }

    public DiagnosisNodeReport withRole(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * 节点角色
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public DiagnosisNodeReport withDiagnosisDimensionList(List<DiagnosisDimension> diagnosisDimensionList) {
        this.diagnosisDimensionList = diagnosisDimensionList;
        return this;
    }

    public DiagnosisNodeReport addDiagnosisDimensionListItem(DiagnosisDimension diagnosisDimensionListItem) {
        if (this.diagnosisDimensionList == null) {
            this.diagnosisDimensionList = new ArrayList<>();
        }
        this.diagnosisDimensionList.add(diagnosisDimensionListItem);
        return this;
    }

    public DiagnosisNodeReport withDiagnosisDimensionList(
        Consumer<List<DiagnosisDimension>> diagnosisDimensionListSetter) {
        if (this.diagnosisDimensionList == null) {
            this.diagnosisDimensionList = new ArrayList<>();
        }
        diagnosisDimensionListSetter.accept(this.diagnosisDimensionList);
        return this;
    }

    /**
     * 诊断维度列表
     * @return diagnosisDimensionList
     */
    public List<DiagnosisDimension> getDiagnosisDimensionList() {
        return diagnosisDimensionList;
    }

    public void setDiagnosisDimensionList(List<DiagnosisDimension> diagnosisDimensionList) {
        this.diagnosisDimensionList = diagnosisDimensionList;
    }

    public DiagnosisNodeReport withCommandTimeTakenList(CommandTimeTakenList commandTimeTakenList) {
        this.commandTimeTakenList = commandTimeTakenList;
        return this;
    }

    public DiagnosisNodeReport withCommandTimeTakenList(Consumer<CommandTimeTakenList> commandTimeTakenListSetter) {
        if (this.commandTimeTakenList == null) {
            this.commandTimeTakenList = new CommandTimeTakenList();
            commandTimeTakenListSetter.accept(this.commandTimeTakenList);
        }

        return this;
    }

    /**
     * Get commandTimeTakenList
     * @return commandTimeTakenList
     */
    public CommandTimeTakenList getCommandTimeTakenList() {
        return commandTimeTakenList;
    }

    public void setCommandTimeTakenList(CommandTimeTakenList commandTimeTakenList) {
        this.commandTimeTakenList = commandTimeTakenList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiagnosisNodeReport diagnosisNodeReport = (DiagnosisNodeReport) o;
        return Objects.equals(this.nodeIp, diagnosisNodeReport.nodeIp)
            && Objects.equals(this.azCode, diagnosisNodeReport.azCode)
            && Objects.equals(this.groupName, diagnosisNodeReport.groupName)
            && Objects.equals(this.abnormalSum, diagnosisNodeReport.abnormalSum)
            && Objects.equals(this.failedSum, diagnosisNodeReport.failedSum)
            && Objects.equals(this.role, diagnosisNodeReport.role)
            && Objects.equals(this.diagnosisDimensionList, diagnosisNodeReport.diagnosisDimensionList)
            && Objects.equals(this.commandTimeTakenList, diagnosisNodeReport.commandTimeTakenList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeIp,
            azCode,
            groupName,
            abnormalSum,
            failedSum,
            role,
            diagnosisDimensionList,
            commandTimeTakenList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisNodeReport {\n");
        sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    abnormalSum: ").append(toIndentedString(abnormalSum)).append("\n");
        sb.append("    failedSum: ").append(toIndentedString(failedSum)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    diagnosisDimensionList: ").append(toIndentedString(diagnosisDimensionList)).append("\n");
        sb.append("    commandTimeTakenList: ").append(toIndentedString(commandTimeTakenList)).append("\n");
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
