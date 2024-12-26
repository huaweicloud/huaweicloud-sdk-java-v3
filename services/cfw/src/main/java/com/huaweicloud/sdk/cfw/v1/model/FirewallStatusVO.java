package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FirewallStatusVO
 */
public class FirewallStatusVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_eip_count")

    private Integer availableEipCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beyond_max_count")

    private Boolean beyondMaxCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_protected_self")

    private Integer eipProtectedSelf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_total")

    private Integer eipTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_un_protected")

    private Integer eipUnProtected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public FirewallStatusVO withAvailableEipCount(Integer availableEipCount) {
        this.availableEipCount = availableEipCount;
        return this;
    }

    /**
     * 可防护eip数量
     * @return availableEipCount
     */
    public Integer getAvailableEipCount() {
        return availableEipCount;
    }

    public void setAvailableEipCount(Integer availableEipCount) {
        this.availableEipCount = availableEipCount;
    }

    public FirewallStatusVO withBeyondMaxCount(Boolean beyondMaxCount) {
        this.beyondMaxCount = beyondMaxCount;
        return this;
    }

    /**
     * 是否超出eip数量限制
     * @return beyondMaxCount
     */
    public Boolean getBeyondMaxCount() {
        return beyondMaxCount;
    }

    public void setBeyondMaxCount(Boolean beyondMaxCount) {
        this.beyondMaxCount = beyondMaxCount;
    }

    public FirewallStatusVO withEipProtectedSelf(Integer eipProtectedSelf) {
        this.eipProtectedSelf = eipProtectedSelf;
        return this;
    }

    /**
     * 已防护eip数量
     * @return eipProtectedSelf
     */
    public Integer getEipProtectedSelf() {
        return eipProtectedSelf;
    }

    public void setEipProtectedSelf(Integer eipProtectedSelf) {
        this.eipProtectedSelf = eipProtectedSelf;
    }

    public FirewallStatusVO withEipTotal(Integer eipTotal) {
        this.eipTotal = eipTotal;
        return this;
    }

    /**
     * eip总数
     * @return eipTotal
     */
    public Integer getEipTotal() {
        return eipTotal;
    }

    public void setEipTotal(Integer eipTotal) {
        this.eipTotal = eipTotal;
    }

    public FirewallStatusVO withEipUnProtected(Integer eipUnProtected) {
        this.eipUnProtected = eipUnProtected;
        return this;
    }

    /**
     * 未防护eip数量
     * @return eipUnProtected
     */
    public Integer getEipUnProtected() {
        return eipUnProtected;
    }

    public void setEipUnProtected(Integer eipUnProtected) {
        this.eipUnProtected = eipUnProtected;
    }

    public FirewallStatusVO withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public FirewallStatusVO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 是否开启新增eip自动防护，1；是，0：否
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirewallStatusVO that = (FirewallStatusVO) obj;
        return Objects.equals(this.availableEipCount, that.availableEipCount)
            && Objects.equals(this.beyondMaxCount, that.beyondMaxCount)
            && Objects.equals(this.eipProtectedSelf, that.eipProtectedSelf)
            && Objects.equals(this.eipTotal, that.eipTotal) && Objects.equals(this.eipUnProtected, that.eipUnProtected)
            && Objects.equals(this.objectId, that.objectId) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(availableEipCount, beyondMaxCount, eipProtectedSelf, eipTotal, eipUnProtected, objectId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirewallStatusVO {\n");
        sb.append("    availableEipCount: ").append(toIndentedString(availableEipCount)).append("\n");
        sb.append("    beyondMaxCount: ").append(toIndentedString(beyondMaxCount)).append("\n");
        sb.append("    eipProtectedSelf: ").append(toIndentedString(eipProtectedSelf)).append("\n");
        sb.append("    eipTotal: ").append(toIndentedString(eipTotal)).append("\n");
        sb.append("    eipUnProtected: ").append(toIndentedString(eipUnProtected)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
