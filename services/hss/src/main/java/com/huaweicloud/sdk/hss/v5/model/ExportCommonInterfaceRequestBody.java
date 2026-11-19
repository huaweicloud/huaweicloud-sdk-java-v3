package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 公共的字段信息
 */
public class ExportCommonInterfaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_type")

    private String exportType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_list")

    private List<String> idList = null;

    public ExportCommonInterfaceRequestBody withExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }

    /**
     * **参数解释**： 导出类型 **约束限制**: 不涉及 **取值范围**： 导出类型，取值为对应的查询接口的接口名。 - ListAntiVirusResult：病毒扫描结果列表导出。 - ListAntivirusHandleHistory：病毒扫描历史处置记录列表。 - ListAiInstances：AI实例记录列表。 - ListAiSessions：AI会话记录列表。 - ListAiTraceRiskDetail：AI行为轨迹风险详情列表。 - ListDefenderPlugins：智能体卫士插件列表。 - ListEventHandleHistory：告警事件历史处置记录列表。  **默认取值**: 不涉及
     * @return exportType
     */
    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    public ExportCommonInterfaceRequestBody withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * **参数解释**: 查询条件信息，把对应的json转化成字符串，举例如下：当export_type=ListAntiVirusResult，传递查询条件为：{\"severities\":\"Critical\",\"handle_status\":\"unhandled\",\"asset_value\":\"important\"}，查询条件信息可以通过对应的查询接口获取。 **约束限制**: 不涉及 **取值范围**: 字符长度1-5000位 **默认取值**: 不涉及 
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public ExportCommonInterfaceRequestBody withIdList(List<String> idList) {
        this.idList = idList;
        return this;
    }

    public ExportCommonInterfaceRequestBody addIdListItem(String idListItem) {
        if (this.idList == null) {
            this.idList = new ArrayList<>();
        }
        this.idList.add(idListItem);
        return this;
    }

    public ExportCommonInterfaceRequestBody withIdList(Consumer<List<String>> idListSetter) {
        if (this.idList == null) {
            this.idList = new ArrayList<>();
        }
        idListSetter.accept(this.idList);
        return this;
    }

    /**
     * 导出的数据的Id列表, 当id_list有值时，会忽略condition的信息: - export_type = ListAiInstances时对应的是agent_id - export_type = ListAiSessions时对应的是session_id - export_type = ListAiTraceRiskDetail时对应的是规则详情记录id - export_type = ListDefenderPlugins时对应的是instance_id 
     * @return idList
     */
    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportCommonInterfaceRequestBody that = (ExportCommonInterfaceRequestBody) obj;
        return Objects.equals(this.exportType, that.exportType) && Objects.equals(this.condition, that.condition)
            && Objects.equals(this.idList, that.idList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportType, condition, idList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportCommonInterfaceRequestBody {\n");
        sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
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
