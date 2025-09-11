package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAuditUpgradeStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_upgrade_infos")

    private List<AuditUpgradeStatus> auditUpgradeInfos = null;

    public ShowAuditUpgradeStatusResponse withAuditUpgradeInfos(List<AuditUpgradeStatus> auditUpgradeInfos) {
        this.auditUpgradeInfos = auditUpgradeInfos;
        return this;
    }

    public ShowAuditUpgradeStatusResponse addAuditUpgradeInfosItem(AuditUpgradeStatus auditUpgradeInfosItem) {
        if (this.auditUpgradeInfos == null) {
            this.auditUpgradeInfos = new ArrayList<>();
        }
        this.auditUpgradeInfos.add(auditUpgradeInfosItem);
        return this;
    }

    public ShowAuditUpgradeStatusResponse withAuditUpgradeInfos(
        Consumer<List<AuditUpgradeStatus>> auditUpgradeInfosSetter) {
        if (this.auditUpgradeInfos == null) {
            this.auditUpgradeInfos = new ArrayList<>();
        }
        auditUpgradeInfosSetter.accept(this.auditUpgradeInfos);
        return this;
    }

    /**
     * 实例升级信息
     * @return auditUpgradeInfos
     */
    public List<AuditUpgradeStatus> getAuditUpgradeInfos() {
        return auditUpgradeInfos;
    }

    public void setAuditUpgradeInfos(List<AuditUpgradeStatus> auditUpgradeInfos) {
        this.auditUpgradeInfos = auditUpgradeInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuditUpgradeStatusResponse that = (ShowAuditUpgradeStatusResponse) obj;
        return Objects.equals(this.auditUpgradeInfos, that.auditUpgradeInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditUpgradeInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditUpgradeStatusResponse {\n");
        sb.append("    auditUpgradeInfos: ").append(toIndentedString(auditUpgradeInfos)).append("\n");
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
