package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源数量统计信息
 */
public class OneResourceGroupRespResourceStatistics {

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

    public OneResourceGroupRespResourceStatistics withUnhealthy(Integer unhealthy) {
        this.unhealthy = unhealthy;
        return this;
    }

    /**
     * 告警中的资源数
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

    public OneResourceGroupRespResourceStatistics withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 资源总数
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

    public OneResourceGroupRespResourceStatistics withEventUnhealthy(Integer eventUnhealthy) {
        this.eventUnhealthy = eventUnhealthy;
        return this;
    }

    /**
     * 已触发的资源数
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

    public OneResourceGroupRespResourceStatistics withNamespaces(Integer namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    /**
     * 资源类型数
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
        OneResourceGroupRespResourceStatistics that = (OneResourceGroupRespResourceStatistics) obj;
        return Objects.equals(this.unhealthy, that.unhealthy) && Objects.equals(this.total, that.total)
            && Objects.equals(this.eventUnhealthy, that.eventUnhealthy)
            && Objects.equals(this.namespaces, that.namespaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unhealthy, total, eventUnhealthy, namespaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OneResourceGroupRespResourceStatistics {\n");
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
