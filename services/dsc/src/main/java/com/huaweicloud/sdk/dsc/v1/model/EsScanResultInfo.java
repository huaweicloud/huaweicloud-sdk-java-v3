package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ES扫描结果信息
 */
public class EsScanResultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_name")

    @JacksonXmlProperty(localName = "index_name")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_id")

    @JacksonXmlProperty(localName = "type_id")

    private String typeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    @JacksonXmlProperty(localName = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    @JacksonXmlProperty(localName = "risk_level")

    private Integer riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive_data_type")

    @JacksonXmlProperty(localName = "sensitive_data_type")

    private List<String> sensitiveDataType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_info")

    @JacksonXmlProperty(localName = "match_info")

    private List<EsMatchInfo> matchInfo = null;

    public EsScanResultInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public EsScanResultInfo withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * 索引名
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public EsScanResultInfo withTypeId(String typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * 类型ID
     * @return typeId
     */
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public EsScanResultInfo withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 类型名
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public EsScanResultInfo withRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public EsScanResultInfo withSensitiveDataType(List<String> sensitiveDataType) {
        this.sensitiveDataType = sensitiveDataType;
        return this;
    }

    public EsScanResultInfo addSensitiveDataTypeItem(String sensitiveDataTypeItem) {
        if (this.sensitiveDataType == null) {
            this.sensitiveDataType = new ArrayList<>();
        }
        this.sensitiveDataType.add(sensitiveDataTypeItem);
        return this;
    }

    public EsScanResultInfo withSensitiveDataType(Consumer<List<String>> sensitiveDataTypeSetter) {
        if (this.sensitiveDataType == null) {
            this.sensitiveDataType = new ArrayList<>();
        }
        sensitiveDataTypeSetter.accept(this.sensitiveDataType);
        return this;
    }

    /**
     * 敏感数据类型
     * @return sensitiveDataType
     */
    public List<String> getSensitiveDataType() {
        return sensitiveDataType;
    }

    public void setSensitiveDataType(List<String> sensitiveDataType) {
        this.sensitiveDataType = sensitiveDataType;
    }

    public EsScanResultInfo withMatchInfo(List<EsMatchInfo> matchInfo) {
        this.matchInfo = matchInfo;
        return this;
    }

    public EsScanResultInfo addMatchInfoItem(EsMatchInfo matchInfoItem) {
        if (this.matchInfo == null) {
            this.matchInfo = new ArrayList<>();
        }
        this.matchInfo.add(matchInfoItem);
        return this;
    }

    public EsScanResultInfo withMatchInfo(Consumer<List<EsMatchInfo>> matchInfoSetter) {
        if (this.matchInfo == null) {
            this.matchInfo = new ArrayList<>();
        }
        matchInfoSetter.accept(this.matchInfo);
        return this;
    }

    /**
     * 规则匹配具体信息
     * @return matchInfo
     */
    public List<EsMatchInfo> getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(List<EsMatchInfo> matchInfo) {
        this.matchInfo = matchInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EsScanResultInfo esScanResultInfo = (EsScanResultInfo) o;
        return Objects.equals(this.taskId, esScanResultInfo.taskId)
            && Objects.equals(this.indexName, esScanResultInfo.indexName)
            && Objects.equals(this.typeId, esScanResultInfo.typeId)
            && Objects.equals(this.typeName, esScanResultInfo.typeName)
            && Objects.equals(this.riskLevel, esScanResultInfo.riskLevel)
            && Objects.equals(this.sensitiveDataType, esScanResultInfo.sensitiveDataType)
            && Objects.equals(this.matchInfo, esScanResultInfo.matchInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, indexName, typeId, typeName, riskLevel, sensitiveDataType, matchInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsScanResultInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    sensitiveDataType: ").append(toIndentedString(sensitiveDataType)).append("\n");
        sb.append("    matchInfo: ").append(toIndentedString(matchInfo)).append("\n");
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
