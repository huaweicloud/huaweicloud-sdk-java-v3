package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RdsDbResponseRetList
 */
public class RdsDbResponseRetList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_status")

    private String retStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_message")

    private String retMessage;

    public RdsDbResponseRetList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * rds数据库id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RdsDbResponseRetList withRetStatus(String retStatus) {
        this.retStatus = retStatus;
        return this;
    }

    /**
     * 状态 - SUCCESS: 成功 - FAILED： 失败
     * @return retStatus
     */
    public String getRetStatus() {
        return retStatus;
    }

    public void setRetStatus(String retStatus) {
        this.retStatus = retStatus;
    }

    public RdsDbResponseRetList withRetMessage(String retMessage) {
        this.retMessage = retMessage;
        return this;
    }

    /**
     * 描述
     * @return retMessage
     */
    public String getRetMessage() {
        return retMessage;
    }

    public void setRetMessage(String retMessage) {
        this.retMessage = retMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdsDbResponseRetList that = (RdsDbResponseRetList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.retStatus, that.retStatus)
            && Objects.equals(this.retMessage, that.retMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, retStatus, retMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RdsDbResponseRetList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    retStatus: ").append(toIndentedString(retStatus)).append("\n");
        sb.append("    retMessage: ").append(toIndentedString(retMessage)).append("\n");
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
