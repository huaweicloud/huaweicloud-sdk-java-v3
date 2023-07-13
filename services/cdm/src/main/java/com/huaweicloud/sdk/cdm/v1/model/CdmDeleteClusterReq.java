package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CdmDeleteClusterReq
 */
public class CdmDeleteClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_last_manual_backup")

    private Integer keepLastManualBackup;

    public CdmDeleteClusterReq withKeepLastManualBackup(Integer keepLastManualBackup) {
        this.keepLastManualBackup = keepLastManualBackup;
        return this;
    }

    /**
     * 日志备份数，填写为默认填0即可。
     * @return keepLastManualBackup
     */
    public Integer getKeepLastManualBackup() {
        return keepLastManualBackup;
    }

    public void setKeepLastManualBackup(Integer keepLastManualBackup) {
        this.keepLastManualBackup = keepLastManualBackup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CdmDeleteClusterReq that = (CdmDeleteClusterReq) obj;
        return Objects.equals(this.keepLastManualBackup, that.keepLastManualBackup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepLastManualBackup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmDeleteClusterReq {\n");
        sb.append("    keepLastManualBackup: ").append(toIndentedString(keepLastManualBackup)).append("\n");
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
