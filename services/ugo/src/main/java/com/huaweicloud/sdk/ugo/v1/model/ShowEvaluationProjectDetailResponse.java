package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEvaluationProjectDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_size")

    @JacksonXmlProperty(localName = "source_db_size")

    private String sourceDbSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_schema")

    @JacksonXmlProperty(localName = "source_db_schema")

    private Long sourceDbSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_cpu")

    @JacksonXmlProperty(localName = "source_db_cpu")

    private String sourceDbCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_character_set")

    @JacksonXmlProperty(localName = "source_db_character_set")

    private String sourceDbCharacterSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_os")

    @JacksonXmlProperty(localName = "source_db_os")

    private String sourceDbOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_instance_num")

    @JacksonXmlProperty(localName = "source_db_instance_num")

    private Integer sourceDbInstanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_ram")

    @JacksonXmlProperty(localName = "source_db_ram")

    private String sourceDbRam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_info")

    @JacksonXmlProperty(localName = "source_db_info")

    private SourceDB sourceDbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_phy_ram")

    @JacksonXmlProperty(localName = "source_db_phy_ram")

    private String sourceDbPhyRam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_version")

    @JacksonXmlProperty(localName = "source_db_version")

    private String sourceDbVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_conf")

    @JacksonXmlProperty(localName = "source_db_conf")

    private String sourceDbConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_clock")

    @JacksonXmlProperty(localName = "source_db_clock")

    private String sourceDbClock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_id")

    @JacksonXmlProperty(localName = "evaluation_project_id")

    private Integer evaluationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_name")

    @JacksonXmlProperty(localName = "evaluation_project_name")

    private String evaluationProjectName;

    public ShowEvaluationProjectDetailResponse withSourceDbSize(String sourceDbSize) {
        this.sourceDbSize = sourceDbSize;
        return this;
    }

    /**
     * 数据库大小。
     * @return sourceDbSize
     */
    public String getSourceDbSize() {
        return sourceDbSize;
    }

    public void setSourceDbSize(String sourceDbSize) {
        this.sourceDbSize = sourceDbSize;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbSchema(Long sourceDbSchema) {
        this.sourceDbSchema = sourceDbSchema;
        return this;
    }

    /**
     * 数据库schema个数。
     * @return sourceDbSchema
     */
    public Long getSourceDbSchema() {
        return sourceDbSchema;
    }

    public void setSourceDbSchema(Long sourceDbSchema) {
        this.sourceDbSchema = sourceDbSchema;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbCpu(String sourceDbCpu) {
        this.sourceDbCpu = sourceDbCpu;
        return this;
    }

    /**
     * 数据库CPU个数。
     * @return sourceDbCpu
     */
    public String getSourceDbCpu() {
        return sourceDbCpu;
    }

    public void setSourceDbCpu(String sourceDbCpu) {
        this.sourceDbCpu = sourceDbCpu;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbCharacterSet(String sourceDbCharacterSet) {
        this.sourceDbCharacterSet = sourceDbCharacterSet;
        return this;
    }

    /**
     * 数据库字符集。
     * @return sourceDbCharacterSet
     */
    public String getSourceDbCharacterSet() {
        return sourceDbCharacterSet;
    }

    public void setSourceDbCharacterSet(String sourceDbCharacterSet) {
        this.sourceDbCharacterSet = sourceDbCharacterSet;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbOs(String sourceDbOs) {
        this.sourceDbOs = sourceDbOs;
        return this;
    }

    /**
     * 数据库操作系统。
     * @return sourceDbOs
     */
    public String getSourceDbOs() {
        return sourceDbOs;
    }

    public void setSourceDbOs(String sourceDbOs) {
        this.sourceDbOs = sourceDbOs;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbInstanceNum(Integer sourceDbInstanceNum) {
        this.sourceDbInstanceNum = sourceDbInstanceNum;
        return this;
    }

    /**
     * 实例数量。
     * @return sourceDbInstanceNum
     */
    public Integer getSourceDbInstanceNum() {
        return sourceDbInstanceNum;
    }

    public void setSourceDbInstanceNum(Integer sourceDbInstanceNum) {
        this.sourceDbInstanceNum = sourceDbInstanceNum;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbRam(String sourceDbRam) {
        this.sourceDbRam = sourceDbRam;
        return this;
    }

    /**
     * 数据库内存。
     * @return sourceDbRam
     */
    public String getSourceDbRam() {
        return sourceDbRam;
    }

    public void setSourceDbRam(String sourceDbRam) {
        this.sourceDbRam = sourceDbRam;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbInfo(SourceDB sourceDbInfo) {
        this.sourceDbInfo = sourceDbInfo;
        return this;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbInfo(Consumer<SourceDB> sourceDbInfoSetter) {
        if (this.sourceDbInfo == null) {
            this.sourceDbInfo = new SourceDB();
            sourceDbInfoSetter.accept(this.sourceDbInfo);
        }

        return this;
    }

    /**
     * Get sourceDbInfo
     * @return sourceDbInfo
     */
    public SourceDB getSourceDbInfo() {
        return sourceDbInfo;
    }

    public void setSourceDbInfo(SourceDB sourceDbInfo) {
        this.sourceDbInfo = sourceDbInfo;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbPhyRam(String sourceDbPhyRam) {
        this.sourceDbPhyRam = sourceDbPhyRam;
        return this;
    }

    /**
     * 数据库物理RAM。
     * @return sourceDbPhyRam
     */
    public String getSourceDbPhyRam() {
        return sourceDbPhyRam;
    }

    public void setSourceDbPhyRam(String sourceDbPhyRam) {
        this.sourceDbPhyRam = sourceDbPhyRam;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbVersion(String sourceDbVersion) {
        this.sourceDbVersion = sourceDbVersion;
        return this;
    }

    /**
     * 数据库版本。
     * @return sourceDbVersion
     */
    public String getSourceDbVersion() {
        return sourceDbVersion;
    }

    public void setSourceDbVersion(String sourceDbVersion) {
        this.sourceDbVersion = sourceDbVersion;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbConf(String sourceDbConf) {
        this.sourceDbConf = sourceDbConf;
        return this;
    }

    /**
     * 数据库配置。
     * @return sourceDbConf
     */
    public String getSourceDbConf() {
        return sourceDbConf;
    }

    public void setSourceDbConf(String sourceDbConf) {
        this.sourceDbConf = sourceDbConf;
    }

    public ShowEvaluationProjectDetailResponse withSourceDbClock(String sourceDbClock) {
        this.sourceDbClock = sourceDbClock;
        return this;
    }

    /**
     * 数据库时区。
     * @return sourceDbClock
     */
    public String getSourceDbClock() {
        return sourceDbClock;
    }

    public void setSourceDbClock(String sourceDbClock) {
        this.sourceDbClock = sourceDbClock;
    }

    public ShowEvaluationProjectDetailResponse withEvaluationProjectId(Integer evaluationProjectId) {
        this.evaluationProjectId = evaluationProjectId;
        return this;
    }

    /**
     * 评估项目ID。
     * @return evaluationProjectId
     */
    public Integer getEvaluationProjectId() {
        return evaluationProjectId;
    }

    public void setEvaluationProjectId(Integer evaluationProjectId) {
        this.evaluationProjectId = evaluationProjectId;
    }

    public ShowEvaluationProjectDetailResponse withEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
        return this;
    }

    /**
     * 评估项目名称。
     * @return evaluationProjectName
     */
    public String getEvaluationProjectName() {
        return evaluationProjectName;
    }

    public void setEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEvaluationProjectDetailResponse showEvaluationProjectDetailResponse =
            (ShowEvaluationProjectDetailResponse) o;
        return Objects.equals(this.sourceDbSize, showEvaluationProjectDetailResponse.sourceDbSize)
            && Objects.equals(this.sourceDbSchema, showEvaluationProjectDetailResponse.sourceDbSchema)
            && Objects.equals(this.sourceDbCpu, showEvaluationProjectDetailResponse.sourceDbCpu)
            && Objects.equals(this.sourceDbCharacterSet, showEvaluationProjectDetailResponse.sourceDbCharacterSet)
            && Objects.equals(this.sourceDbOs, showEvaluationProjectDetailResponse.sourceDbOs)
            && Objects.equals(this.sourceDbInstanceNum, showEvaluationProjectDetailResponse.sourceDbInstanceNum)
            && Objects.equals(this.sourceDbRam, showEvaluationProjectDetailResponse.sourceDbRam)
            && Objects.equals(this.sourceDbInfo, showEvaluationProjectDetailResponse.sourceDbInfo)
            && Objects.equals(this.sourceDbPhyRam, showEvaluationProjectDetailResponse.sourceDbPhyRam)
            && Objects.equals(this.sourceDbVersion, showEvaluationProjectDetailResponse.sourceDbVersion)
            && Objects.equals(this.sourceDbConf, showEvaluationProjectDetailResponse.sourceDbConf)
            && Objects.equals(this.sourceDbClock, showEvaluationProjectDetailResponse.sourceDbClock)
            && Objects.equals(this.evaluationProjectId, showEvaluationProjectDetailResponse.evaluationProjectId)
            && Objects.equals(this.evaluationProjectName, showEvaluationProjectDetailResponse.evaluationProjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDbSize,
            sourceDbSchema,
            sourceDbCpu,
            sourceDbCharacterSet,
            sourceDbOs,
            sourceDbInstanceNum,
            sourceDbRam,
            sourceDbInfo,
            sourceDbPhyRam,
            sourceDbVersion,
            sourceDbConf,
            sourceDbClock,
            evaluationProjectId,
            evaluationProjectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEvaluationProjectDetailResponse {\n");
        sb.append("    sourceDbSize: ").append(toIndentedString(sourceDbSize)).append("\n");
        sb.append("    sourceDbSchema: ").append(toIndentedString(sourceDbSchema)).append("\n");
        sb.append("    sourceDbCpu: ").append(toIndentedString(sourceDbCpu)).append("\n");
        sb.append("    sourceDbCharacterSet: ").append(toIndentedString(sourceDbCharacterSet)).append("\n");
        sb.append("    sourceDbOs: ").append(toIndentedString(sourceDbOs)).append("\n");
        sb.append("    sourceDbInstanceNum: ").append(toIndentedString(sourceDbInstanceNum)).append("\n");
        sb.append("    sourceDbRam: ").append(toIndentedString(sourceDbRam)).append("\n");
        sb.append("    sourceDbInfo: ").append(toIndentedString(sourceDbInfo)).append("\n");
        sb.append("    sourceDbPhyRam: ").append(toIndentedString(sourceDbPhyRam)).append("\n");
        sb.append("    sourceDbVersion: ").append(toIndentedString(sourceDbVersion)).append("\n");
        sb.append("    sourceDbConf: ").append(toIndentedString(sourceDbConf)).append("\n");
        sb.append("    sourceDbClock: ").append(toIndentedString(sourceDbClock)).append("\n");
        sb.append("    evaluationProjectId: ").append(toIndentedString(evaluationProjectId)).append("\n");
        sb.append("    evaluationProjectName: ").append(toIndentedString(evaluationProjectName)).append("\n");
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
