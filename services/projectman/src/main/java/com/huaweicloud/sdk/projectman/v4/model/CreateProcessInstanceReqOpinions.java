package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateProcessInstanceReqOpinions
 */
public class CreateProcessInstanceReqOpinions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "curr_owner")

    private String currOwner;

    public CreateProcessInstanceReqOpinions withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CreateProcessInstanceReqOpinions withCurrOwner(String currOwner) {
        this.currOwner = currOwner;
        return this;
    }

    /**
     * 当前责任人
     * @return currOwner
     */
    public String getCurrOwner() {
        return currOwner;
    }

    public void setCurrOwner(String currOwner) {
        this.currOwner = currOwner;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProcessInstanceReqOpinions that = (CreateProcessInstanceReqOpinions) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.currOwner, that.currOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, currOwner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProcessInstanceReqOpinions {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    currOwner: ").append(toIndentedString(currOwner)).append("\n");
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
