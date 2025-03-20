package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * cce集群信息
 */
public class CceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_id")

    private String cceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_name")

    private String cceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliant_count")

    private String compliantCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_compliant_count")

    private String nonCompliantCount;

    public CceInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CceInfo withCceId(String cceId) {
        this.cceId = cceId;
        return this;
    }

    /**
     * cce集群id
     * @return cceId
     */
    public String getCceId() {
        return cceId;
    }

    public void setCceId(String cceId) {
        this.cceId = cceId;
    }

    public CceInfo withCceName(String cceName) {
        this.cceName = cceName;
        return this;
    }

    /**
     * cce集群名称
     * @return cceName
     */
    public String getCceName() {
        return cceName;
    }

    public void setCceName(String cceName) {
        this.cceName = cceName;
    }

    public CceInfo withCompliantCount(String compliantCount) {
        this.compliantCount = compliantCount;
        return this;
    }

    /**
     * 合规数量
     * @return compliantCount
     */
    public String getCompliantCount() {
        return compliantCount;
    }

    public void setCompliantCount(String compliantCount) {
        this.compliantCount = compliantCount;
    }

    public CceInfo withNonCompliantCount(String nonCompliantCount) {
        this.nonCompliantCount = nonCompliantCount;
        return this;
    }

    /**
     * 不合规数量
     * @return nonCompliantCount
     */
    public String getNonCompliantCount() {
        return nonCompliantCount;
    }

    public void setNonCompliantCount(String nonCompliantCount) {
        this.nonCompliantCount = nonCompliantCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CceInfo that = (CceInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.cceId, that.cceId)
            && Objects.equals(this.cceName, that.cceName) && Objects.equals(this.compliantCount, that.compliantCount)
            && Objects.equals(this.nonCompliantCount, that.nonCompliantCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cceId, cceName, compliantCount, nonCompliantCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CceInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cceId: ").append(toIndentedString(cceId)).append("\n");
        sb.append("    cceName: ").append(toIndentedString(cceName)).append("\n");
        sb.append("    compliantCount: ").append(toIndentedString(compliantCount)).append("\n");
        sb.append("    nonCompliantCount: ").append(toIndentedString(nonCompliantCount)).append("\n");
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
