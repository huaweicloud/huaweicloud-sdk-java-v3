package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowVulBackupStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_info_id")

    private String backupInfoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_num")

    private Integer backupHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unable_backup_host_num")

    private Integer unableBackupHostNum;

    public ShowVulBackupStatisticsResponse withBackupInfoId(String backupInfoId) {
        this.backupInfoId = backupInfoId;
        return this;
    }

    /**
     * **参数解释**: 本次漏洞处理的备份信息id **取值范围**: 字符长度1-128位 
     * @return backupInfoId
     */
    public String getBackupInfoId() {
        return backupInfoId;
    }

    public void setBackupInfoId(String backupInfoId) {
        this.backupInfoId = backupInfoId;
    }

    public ShowVulBackupStatisticsResponse withBackupHostNum(Integer backupHostNum) {
        this.backupHostNum = backupHostNum;
        return this;
    }

    /**
     * **参数解释**: 本次漏洞处理可进行备份的主机数量 **取值范围**: 字符长度0-1000000位 
     * minimum: 0
     * maximum: 1000000
     * @return backupHostNum
     */
    public Integer getBackupHostNum() {
        return backupHostNum;
    }

    public void setBackupHostNum(Integer backupHostNum) {
        this.backupHostNum = backupHostNum;
    }

    public ShowVulBackupStatisticsResponse withUnableBackupHostNum(Integer unableBackupHostNum) {
        this.unableBackupHostNum = unableBackupHostNum;
        return this;
    }

    /**
     * **参数解释**: 本次漏洞处理不可进行备份的主机数量 **取值范围**: 字符长度0-1000000位 
     * minimum: 0
     * maximum: 1000000
     * @return unableBackupHostNum
     */
    public Integer getUnableBackupHostNum() {
        return unableBackupHostNum;
    }

    public void setUnableBackupHostNum(Integer unableBackupHostNum) {
        this.unableBackupHostNum = unableBackupHostNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulBackupStatisticsResponse that = (ShowVulBackupStatisticsResponse) obj;
        return Objects.equals(this.backupInfoId, that.backupInfoId)
            && Objects.equals(this.backupHostNum, that.backupHostNum)
            && Objects.equals(this.unableBackupHostNum, that.unableBackupHostNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupInfoId, backupHostNum, unableBackupHostNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulBackupStatisticsResponse {\n");
        sb.append("    backupInfoId: ").append(toIndentedString(backupInfoId)).append("\n");
        sb.append("    backupHostNum: ").append(toIndentedString(backupHostNum)).append("\n");
        sb.append("    unableBackupHostNum: ").append(toIndentedString(unableBackupHostNum)).append("\n");
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
