package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AuditResult
 */
public class AuditResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auditInfoList")

    private List<AuditDO> auditInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public AuditResult withAuditInfoList(List<AuditDO> auditInfoList) {
        this.auditInfoList = auditInfoList;
        return this;
    }

    public AuditResult addAuditInfoListItem(AuditDO auditInfoListItem) {
        if (this.auditInfoList == null) {
            this.auditInfoList = new ArrayList<>();
        }
        this.auditInfoList.add(auditInfoListItem);
        return this;
    }

    public AuditResult withAuditInfoList(Consumer<List<AuditDO>> auditInfoListSetter) {
        if (this.auditInfoList == null) {
            this.auditInfoList = new ArrayList<>();
        }
        auditInfoListSetter.accept(this.auditInfoList);
        return this;
    }

    /**
     * **参数解释**： 审计日志列表。  **取值范围**： 不涉及。
     * @return auditInfoList
     */
    public List<AuditDO> getAuditInfoList() {
        return auditInfoList;
    }

    public void setAuditInfoList(List<AuditDO> auditInfoList) {
        this.auditInfoList = auditInfoList;
    }

    public AuditResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 审计日志条数。  **取值范围**： 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditResult that = (AuditResult) obj;
        return Objects.equals(this.auditInfoList, that.auditInfoList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditInfoList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditResult {\n");
        sb.append("    auditInfoList: ").append(toIndentedString(auditInfoList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
