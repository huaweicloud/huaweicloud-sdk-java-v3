package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备份文件信息。
 */
public class BackupFileInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_path")

    private String obsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_version")

    private String rdsVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_source_instance_id")

    private String rdsSourceInstanceId;

    public BackupFileInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 备份文件名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackupFileInfo withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    /**
     * OBS桶中文件路径。  OBS场景：必选  RDS场景：缺省
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    public BackupFileInfo withRdsVersion(String rdsVersion) {
        this.rdsVersion = rdsVersion;
        return this;
    }

    /**
     * bak文件数据库版本。  OBS场景：缺省  RDS场景：必选
     * @return rdsVersion
     */
    public String getRdsVersion() {
        return rdsVersion;
    }

    public void setRdsVersion(String rdsVersion) {
        this.rdsVersion = rdsVersion;
    }

    public BackupFileInfo withRdsSourceInstanceId(String rdsSourceInstanceId) {
        this.rdsSourceInstanceId = rdsSourceInstanceId;
        return this;
    }

    /**
     * bak文件所属实例。  OBS场景：缺省  RDS场景：必选
     * @return rdsSourceInstanceId
     */
    public String getRdsSourceInstanceId() {
        return rdsSourceInstanceId;
    }

    public void setRdsSourceInstanceId(String rdsSourceInstanceId) {
        this.rdsSourceInstanceId = rdsSourceInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupFileInfo that = (BackupFileInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.obsPath, that.obsPath)
            && Objects.equals(this.rdsVersion, that.rdsVersion)
            && Objects.equals(this.rdsSourceInstanceId, that.rdsSourceInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, obsPath, rdsVersion, rdsSourceInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupFileInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
        sb.append("    rdsVersion: ").append(toIndentedString(rdsVersion)).append("\n");
        sb.append("    rdsSourceInstanceId: ").append(toIndentedString(rdsSourceInstanceId)).append("\n");
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
