package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UnsupportedAuditInfoResponse
 */
public class UnsupportedAuditInfoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_infos")

    private List<UnsupportedAuditInfo> auditInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_version")

    private String supportVersion;

    public UnsupportedAuditInfoResponse withAuditInfos(List<UnsupportedAuditInfo> auditInfos) {
        this.auditInfos = auditInfos;
        return this;
    }

    public UnsupportedAuditInfoResponse addAuditInfosItem(UnsupportedAuditInfo auditInfosItem) {
        if (this.auditInfos == null) {
            this.auditInfos = new ArrayList<>();
        }
        this.auditInfos.add(auditInfosItem);
        return this;
    }

    public UnsupportedAuditInfoResponse withAuditInfos(Consumer<List<UnsupportedAuditInfo>> auditInfosSetter) {
        if (this.auditInfos == null) {
            this.auditInfos = new ArrayList<>();
        }
        auditInfosSetter.accept(this.auditInfos);
        return this;
    }

    /**
     * 审计信息
     * @return auditInfos
     */
    public List<UnsupportedAuditInfo> getAuditInfos() {
        return auditInfos;
    }

    public void setAuditInfos(List<UnsupportedAuditInfo> auditInfos) {
        this.auditInfos = auditInfos;
    }

    public UnsupportedAuditInfoResponse withSupportVersion(String supportVersion) {
        this.supportVersion = supportVersion;
        return this;
    }

    /**
     * 支持的版本
     * @return supportVersion
     */
    public String getSupportVersion() {
        return supportVersion;
    }

    public void setSupportVersion(String supportVersion) {
        this.supportVersion = supportVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnsupportedAuditInfoResponse that = (UnsupportedAuditInfoResponse) obj;
        return Objects.equals(this.auditInfos, that.auditInfos)
            && Objects.equals(this.supportVersion, that.supportVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditInfos, supportVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnsupportedAuditInfoResponse {\n");
        sb.append("    auditInfos: ").append(toIndentedString(auditInfos)).append("\n");
        sb.append("    supportVersion: ").append(toIndentedString(supportVersion)).append("\n");
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
