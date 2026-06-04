package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * quotas属性列表
 */
public class WorkspaceQuotasResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_quota")

    private Integer maxQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_quota")

    private Integer minQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_cn")

    private String unitCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_en")

    private String unitEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_quota")

    private Integer usedQuota;

    public WorkspaceQuotasResponse withMaxQuota(Integer maxQuota) {
        this.maxQuota = maxQuota;
        return this;
    }

    /**
     * 配额允许设置的最大值。
     * @return maxQuota
     */
    public Integer getMaxQuota() {
        return maxQuota;
    }

    public void setMaxQuota(Integer maxQuota) {
        this.maxQuota = maxQuota;
    }

    public WorkspaceQuotasResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 最后修改时间，UTC。如用户未修改过该资源配额,则该值默认为该工作空间的创建时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public WorkspaceQuotasResponse withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 资源的唯一标识。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public WorkspaceQuotasResponse withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 当前配额值。配额值为-1代表不限制配额。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public WorkspaceQuotasResponse withMinQuota(Integer minQuota) {
        this.minQuota = minQuota;
        return this;
    }

    /**
     * 配额允许设置的最小值。
     * @return minQuota
     */
    public Integer getMinQuota() {
        return minQuota;
    }

    public void setMinQuota(Integer minQuota) {
        this.minQuota = minQuota;
    }

    public WorkspaceQuotasResponse withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * 配额名称[(中文)](tag:hc,hk)。
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public WorkspaceQuotasResponse withUnitCn(String unitCn) {
        this.unitCn = unitCn;
        return this;
    }

    /**
     * 数量单位[(中文)](tag:hc,hk)。
     * @return unitCn
     */
    public String getUnitCn() {
        return unitCn;
    }

    public void setUnitCn(String unitCn) {
        this.unitCn = unitCn;
    }

    public WorkspaceQuotasResponse withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 工作空间ID，系统生成的32位UUID，不带橫线。默认的工作空间id为'0'。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public WorkspaceQuotasResponse withUnitEn(String unitEn) {
        this.unitEn = unitEn;
        return this;
    }

    /**
     * 数量单位(英文)。
     * @return unitEn
     */
    public String getUnitEn() {
        return unitEn;
    }

    public void setUnitEn(String unitEn) {
        this.unitEn = unitEn;
    }

    public WorkspaceQuotasResponse withUsedQuota(Integer usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }

    /**
     * 已用配额值。当quota为-1（不限制配额）时，used_quota为null。
     * @return usedQuota
     */
    public Integer getUsedQuota() {
        return usedQuota;
    }

    public void setUsedQuota(Integer usedQuota) {
        this.usedQuota = usedQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkspaceQuotasResponse that = (WorkspaceQuotasResponse) obj;
        return Objects.equals(this.maxQuota, that.maxQuota) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.resource, that.resource) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.minQuota, that.minQuota) && Objects.equals(this.nameCn, that.nameCn)
            && Objects.equals(this.unitCn, that.unitCn) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.unitEn, that.unitEn) && Objects.equals(this.usedQuota, that.usedQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxQuota, updateTime, resource, quota, minQuota, nameCn, unitCn, nameEn, unitEn, usedQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkspaceQuotasResponse {\n");
        sb.append("    maxQuota: ").append(toIndentedString(maxQuota)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    minQuota: ").append(toIndentedString(minQuota)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    unitCn: ").append(toIndentedString(unitCn)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    unitEn: ").append(toIndentedString(unitEn)).append("\n");
        sb.append("    usedQuota: ").append(toIndentedString(usedQuota)).append("\n");
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
