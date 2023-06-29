package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImUnreadV2
 */
public class ImUnreadV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_id")

    private String incidentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unread_num")

    private Integer unreadNum;

    public ImUnreadV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * minimum: 0
     * maximum: 20
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ImUnreadV2 withIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    /**
     * 工单id
     * @return incidentId
     */
    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public ImUnreadV2 withUnreadNum(Integer unreadNum) {
        this.unreadNum = unreadNum;
        return this;
    }

    /**
     * 未读数量
     * minimum: 0
     * maximum: 65535
     * @return unreadNum
     */
    public Integer getUnreadNum() {
        return unreadNum;
    }

    public void setUnreadNum(Integer unreadNum) {
        this.unreadNum = unreadNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImUnreadV2 that = (ImUnreadV2) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.incidentId, that.incidentId)
            && Objects.equals(this.unreadNum, that.unreadNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, incidentId, unreadNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImUnreadV2 {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    unreadNum: ").append(toIndentedString(unreadNum)).append("\n");
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
