package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ListAccessSites
 */
public class ListAccessSites {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_region")

    private String proxyRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iec_az_code")

    private String iecAzCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_name")

    private String enName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cn_name")

    private String cnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public ListAccessSites withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 接入点的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListAccessSites withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * - 功能说明：接入点名称 - 取值范围：1-64，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAccessSites withProxyRegion(String proxyRegion) {
        this.proxyRegion = proxyRegion;
        return this;
    }

    /**
     * pop站点托管的region(id)
     * @return proxyRegion
     */
    public String getProxyRegion() {
        return proxyRegion;
    }

    public void setProxyRegion(String proxyRegion) {
        this.proxyRegion = proxyRegion;
    }

    public ListAccessSites withIecAzCode(String iecAzCode) {
        this.iecAzCode = iecAzCode;
        return this;
    }

    /**
     * 边缘站点az
     * @return iecAzCode
     */
    public String getIecAzCode() {
        return iecAzCode;
    }

    public void setIecAzCode(String iecAzCode) {
        this.iecAzCode = iecAzCode;
    }

    public ListAccessSites withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * 英文名称
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public ListAccessSites withCnName(String cnName) {
        this.cnName = cnName;
        return this;
    }

    /**
     * 中文名称
     * @return cnName
     */
    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public ListAccessSites withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ListAccessSites withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccessSites that = (ListAccessSites) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.proxyRegion, that.proxyRegion) && Objects.equals(this.iecAzCode, that.iecAzCode)
            && Objects.equals(this.enName, that.enName) && Objects.equals(this.cnName, that.cnName)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, proxyRegion, iecAzCode, enName, cnName, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessSites {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    proxyRegion: ").append(toIndentedString(proxyRegion)).append("\n");
        sb.append("    iecAzCode: ").append(toIndentedString(iecAzCode)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
        sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
