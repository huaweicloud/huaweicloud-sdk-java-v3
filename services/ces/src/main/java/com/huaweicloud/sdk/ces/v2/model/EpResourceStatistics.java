package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 企业项目关联资源的状态
 */
public class EpResourceStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_relation_id")

    private String extendRelationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unhealthy")

    private Integer unhealthy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_unhealthy")

    private Integer eventUnhealthy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private Integer namespaces;

    public EpResourceStatistics withExtendRelationId(String extendRelationId) {
        this.extendRelationId = extendRelationId;
        return this;
    }

    /**
     * **参数解释** 企业项目ID。 **取值范围** 长度[0,64]个字符. 
     * @return extendRelationId
     */
    public String getExtendRelationId() {
        return extendRelationId;
    }

    public void setExtendRelationId(String extendRelationId) {
        this.extendRelationId = extendRelationId;
    }

    public EpResourceStatistics withUnhealthy(Integer unhealthy) {
        this.unhealthy = unhealthy;
        return this;
    }

    /**
     * **参数解释** 告警中的资源数。 **取值范围** 0-9999999 
     * minimum: 0
     * maximum: 9999999
     * @return unhealthy
     */
    public Integer getUnhealthy() {
        return unhealthy;
    }

    public void setUnhealthy(Integer unhealthy) {
        this.unhealthy = unhealthy;
    }

    public EpResourceStatistics withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释** 资源总数。 **取值范围** 0-9999999 
     * minimum: 0
     * maximum: 9999999
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public EpResourceStatistics withEventUnhealthy(Integer eventUnhealthy) {
        this.eventUnhealthy = eventUnhealthy;
        return this;
    }

    /**
     * **参数解释** 已触发的资源数。 **取值范围** 0-9999999 
     * minimum: 0
     * maximum: 9999999
     * @return eventUnhealthy
     */
    public Integer getEventUnhealthy() {
        return eventUnhealthy;
    }

    public void setEventUnhealthy(Integer eventUnhealthy) {
        this.eventUnhealthy = eventUnhealthy;
    }

    public EpResourceStatistics withNamespaces(Integer namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    /**
     * **参数解释** 资源类型数。 **取值范围** 0-9999999 
     * minimum: 0
     * maximum: 9999999
     * @return namespaces
     */
    public Integer getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(Integer namespaces) {
        this.namespaces = namespaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EpResourceStatistics that = (EpResourceStatistics) obj;
        return Objects.equals(this.extendRelationId, that.extendRelationId)
            && Objects.equals(this.unhealthy, that.unhealthy) && Objects.equals(this.total, that.total)
            && Objects.equals(this.eventUnhealthy, that.eventUnhealthy)
            && Objects.equals(this.namespaces, that.namespaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extendRelationId, unhealthy, total, eventUnhealthy, namespaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EpResourceStatistics {\n");
        sb.append("    extendRelationId: ").append(toIndentedString(extendRelationId)).append("\n");
        sb.append("    unhealthy: ").append(toIndentedString(unhealthy)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    eventUnhealthy: ").append(toIndentedString(eventUnhealthy)).append("\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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
