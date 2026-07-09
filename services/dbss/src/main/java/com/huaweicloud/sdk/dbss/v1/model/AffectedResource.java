package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AffectedResource
 */
public class AffectedResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_attached_domain_id")

    private String affectedAttachedDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_attached_project_id")

    private String affectedAttachedProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_head")

    private DataResourceHead affectedHead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_properties")

    private Object affectedProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_protected_id")

    private String affectedProtectedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_subtype")

    private String affectedSubtype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_type")

    private String affectedType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_urn")

    private String affectedUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_urnext")

    private String affectedUrnext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_value")

    private String affectedValue;

    public AffectedResource withAffectedAttachedDomainId(String affectedAttachedDomainId) {
        this.affectedAttachedDomainId = affectedAttachedDomainId;
        return this;
    }

    /**
     * 被防护对象账户ID
     * @return affectedAttachedDomainId
     */
    public String getAffectedAttachedDomainId() {
        return affectedAttachedDomainId;
    }

    public void setAffectedAttachedDomainId(String affectedAttachedDomainId) {
        this.affectedAttachedDomainId = affectedAttachedDomainId;
    }

    public AffectedResource withAffectedAttachedProjectId(String affectedAttachedProjectId) {
        this.affectedAttachedProjectId = affectedAttachedProjectId;
        return this;
    }

    /**
     * 被防护对象项目ID
     * @return affectedAttachedProjectId
     */
    public String getAffectedAttachedProjectId() {
        return affectedAttachedProjectId;
    }

    public void setAffectedAttachedProjectId(String affectedAttachedProjectId) {
        this.affectedAttachedProjectId = affectedAttachedProjectId;
    }

    public AffectedResource withAffectedHead(DataResourceHead affectedHead) {
        this.affectedHead = affectedHead;
        return this;
    }

    public AffectedResource withAffectedHead(Consumer<DataResourceHead> affectedHeadSetter) {
        if (this.affectedHead == null) {
            this.affectedHead = new DataResourceHead();
            affectedHeadSetter.accept(this.affectedHead);
        }

        return this;
    }

    /**
     * Get affectedHead
     * @return affectedHead
     */
    public DataResourceHead getAffectedHead() {
        return affectedHead;
    }

    public void setAffectedHead(DataResourceHead affectedHead) {
        this.affectedHead = affectedHead;
    }

    public AffectedResource withAffectedProperties(Object affectedProperties) {
        this.affectedProperties = affectedProperties;
        return this;
    }

    /**
     * 资源扩展信息
     * @return affectedProperties
     */
    public Object getAffectedProperties() {
        return affectedProperties;
    }

    public void setAffectedProperties(Object affectedProperties) {
        this.affectedProperties = affectedProperties;
    }

    public AffectedResource withAffectedProtectedId(String affectedProtectedId) {
        this.affectedProtectedId = affectedProtectedId;
        return this;
    }

    /**
     * 被防护(受影响）对象在防线系统内唯一ID
     * @return affectedProtectedId
     */
    public String getAffectedProtectedId() {
        return affectedProtectedId;
    }

    public void setAffectedProtectedId(String affectedProtectedId) {
        this.affectedProtectedId = affectedProtectedId;
    }

    public AffectedResource withAffectedSubtype(String affectedSubtype) {
        this.affectedSubtype = affectedSubtype;
        return this;
    }

    /**
     * 被防护(受影响）对象子类型: 固定为：DB
     * @return affectedSubtype
     */
    public String getAffectedSubtype() {
        return affectedSubtype;
    }

    public void setAffectedSubtype(String affectedSubtype) {
        this.affectedSubtype = affectedSubtype;
    }

    public AffectedResource withAffectedType(String affectedType) {
        this.affectedType = affectedType;
        return this;
    }

    /**
     * 被防护(受影响）对象类型，数据库资产，固定为：Data
     * @return affectedType
     */
    public String getAffectedType() {
        return affectedType;
    }

    public void setAffectedType(String affectedType) {
        this.affectedType = affectedType;
    }

    public AffectedResource withAffectedUrn(String affectedUrn) {
        this.affectedUrn = affectedUrn;
        return this;
    }

    /**
     * 被防护对象urn
     * @return affectedUrn
     */
    public String getAffectedUrn() {
        return affectedUrn;
    }

    public void setAffectedUrn(String affectedUrn) {
        this.affectedUrn = affectedUrn;
    }

    public AffectedResource withAffectedUrnext(String affectedUrnext) {
        this.affectedUrnext = affectedUrnext;
        return this;
    }

    /**
     * 被防护对象URN扩展
     * @return affectedUrnext
     */
    public String getAffectedUrnext() {
        return affectedUrnext;
    }

    public void setAffectedUrnext(String affectedUrnext) {
        this.affectedUrnext = affectedUrnext;
    }

    public AffectedResource withAffectedValue(String affectedValue) {
        this.affectedValue = affectedValue;
        return this;
    }

    /**
     * 被防护(受影响）对象值，云下数据库同affectedProtectedId，云上不传
     * @return affectedValue
     */
    public String getAffectedValue() {
        return affectedValue;
    }

    public void setAffectedValue(String affectedValue) {
        this.affectedValue = affectedValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AffectedResource that = (AffectedResource) obj;
        return Objects.equals(this.affectedAttachedDomainId, that.affectedAttachedDomainId)
            && Objects.equals(this.affectedAttachedProjectId, that.affectedAttachedProjectId)
            && Objects.equals(this.affectedHead, that.affectedHead)
            && Objects.equals(this.affectedProperties, that.affectedProperties)
            && Objects.equals(this.affectedProtectedId, that.affectedProtectedId)
            && Objects.equals(this.affectedSubtype, that.affectedSubtype)
            && Objects.equals(this.affectedType, that.affectedType)
            && Objects.equals(this.affectedUrn, that.affectedUrn)
            && Objects.equals(this.affectedUrnext, that.affectedUrnext)
            && Objects.equals(this.affectedValue, that.affectedValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affectedAttachedDomainId,
            affectedAttachedProjectId,
            affectedHead,
            affectedProperties,
            affectedProtectedId,
            affectedSubtype,
            affectedType,
            affectedUrn,
            affectedUrnext,
            affectedValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AffectedResource {\n");
        sb.append("    affectedAttachedDomainId: ").append(toIndentedString(affectedAttachedDomainId)).append("\n");
        sb.append("    affectedAttachedProjectId: ").append(toIndentedString(affectedAttachedProjectId)).append("\n");
        sb.append("    affectedHead: ").append(toIndentedString(affectedHead)).append("\n");
        sb.append("    affectedProperties: ").append(toIndentedString(affectedProperties)).append("\n");
        sb.append("    affectedProtectedId: ").append(toIndentedString(affectedProtectedId)).append("\n");
        sb.append("    affectedSubtype: ").append(toIndentedString(affectedSubtype)).append("\n");
        sb.append("    affectedType: ").append(toIndentedString(affectedType)).append("\n");
        sb.append("    affectedUrn: ").append(toIndentedString(affectedUrn)).append("\n");
        sb.append("    affectedUrnext: ").append(toIndentedString(affectedUrnext)).append("\n");
        sb.append("    affectedValue: ").append(toIndentedString(affectedValue)).append("\n");
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
