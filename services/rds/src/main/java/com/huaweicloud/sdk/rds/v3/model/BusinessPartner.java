package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务商信息。
 */
public class BusinessPartner {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bp_domain_id")

    private String bpDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bp_name")

    private String bpName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private Integer order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "international")

    private Boolean international;

    public BusinessPartner withBpDomainId(String bpDomainId) {
        this.bpDomainId = bpDomainId;
        return this;
    }

    /**
     * 服务商ID。
     * @return bpDomainId
     */
    public String getBpDomainId() {
        return bpDomainId;
    }

    public void setBpDomainId(String bpDomainId) {
        this.bpDomainId = bpDomainId;
    }

    public BusinessPartner withBpName(String bpName) {
        this.bpName = bpName;
        return this;
    }

    /**
     * 服务商名称。
     * @return bpName
     */
    public String getBpName() {
        return bpName;
    }

    public void setBpName(String bpName) {
        this.bpName = bpName;
    }

    public BusinessPartner withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * 优先级，整数取值范围1-100，数值越小优先级越高。
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public BusinessPartner withInternational(Boolean international) {
        this.international = international;
        return this;
    }

    /**
     * 是否是国际站服务商。
     * @return international
     */
    public Boolean getInternational() {
        return international;
    }

    public void setInternational(Boolean international) {
        this.international = international;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusinessPartner that = (BusinessPartner) obj;
        return Objects.equals(this.bpDomainId, that.bpDomainId) && Objects.equals(this.bpName, that.bpName)
            && Objects.equals(this.order, that.order) && Objects.equals(this.international, that.international);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bpDomainId, bpName, order, international);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessPartner {\n");
        sb.append("    bpDomainId: ").append(toIndentedString(bpDomainId)).append("\n");
        sb.append("    bpName: ").append(toIndentedString(bpName)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    international: ").append(toIndentedString(international)).append("\n");
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
