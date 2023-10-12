package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 切换AZ详情信息。
 */
public class UpdateAzByInstanceTypeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_az")

    private String sourceAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_az")

    private String targetAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_type")

    private String migrateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indices_backup_check")

    private Boolean indicesBackupCheck;

    public UpdateAzByInstanceTypeReq withSourceAz(String sourceAz) {
        this.sourceAz = sourceAz;
        return this;
    }

    /**
     * 节点当前所在AZ。
     * @return sourceAz
     */
    public String getSourceAz() {
        return sourceAz;
    }

    public void setSourceAz(String sourceAz) {
        this.sourceAz = sourceAz;
    }

    public UpdateAzByInstanceTypeReq withTargetAz(String targetAz) {
        this.targetAz = targetAz;
        return this;
    }

    /**
     * 期望节点最终分布AZ。
     * @return targetAz
     */
    public String getTargetAz() {
        return targetAz;
    }

    public void setTargetAz(String targetAz) {
        this.targetAz = targetAz;
    }

    public UpdateAzByInstanceTypeReq withMigrateType(String migrateType) {
        this.migrateType = migrateType;
        return this;
    }

    /**
     * AZ迁移方式： - multi_az_change：高可用改造。 - az_migrate： AZ平移
     * @return migrateType
     */
    public String getMigrateType() {
        return migrateType;
    }

    public void setMigrateType(String migrateType) {
        this.migrateType = migrateType;
    }

    public UpdateAzByInstanceTypeReq withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 委托名称，委托给CSS，允许CSS调用您的其他云服务。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public UpdateAzByInstanceTypeReq withIndicesBackupCheck(Boolean indicesBackupCheck) {
        this.indicesBackupCheck = indicesBackupCheck;
        return this;
    }

    /**
     * 是否进行全量索引快照备份检测。 true：进行全量索引快照备份检测。 false：不进行全量索引快照备份检测。
     * @return indicesBackupCheck
     */
    public Boolean getIndicesBackupCheck() {
        return indicesBackupCheck;
    }

    public void setIndicesBackupCheck(Boolean indicesBackupCheck) {
        this.indicesBackupCheck = indicesBackupCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAzByInstanceTypeReq that = (UpdateAzByInstanceTypeReq) obj;
        return Objects.equals(this.sourceAz, that.sourceAz) && Objects.equals(this.targetAz, that.targetAz)
            && Objects.equals(this.migrateType, that.migrateType) && Objects.equals(this.agency, that.agency)
            && Objects.equals(this.indicesBackupCheck, that.indicesBackupCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceAz, targetAz, migrateType, agency, indicesBackupCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAzByInstanceTypeReq {\n");
        sb.append("    sourceAz: ").append(toIndentedString(sourceAz)).append("\n");
        sb.append("    targetAz: ").append(toIndentedString(targetAz)).append("\n");
        sb.append("    migrateType: ").append(toIndentedString(migrateType)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    indicesBackupCheck: ").append(toIndentedString(indicesBackupCheck)).append("\n");
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
