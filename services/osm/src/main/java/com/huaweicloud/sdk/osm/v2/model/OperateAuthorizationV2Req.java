package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OperateAuthorizationV2Req
 */
public class OperateAuthorizationV2Req  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reject_reason")
    
    private String rejectReason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;

    public OperateAuthorizationV2Req withRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }

    


    /**
     * 拒绝理由
     * @return rejectReason
     */
    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    

    public OperateAuthorizationV2Req withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateAuthorizationV2Req operateAuthorizationV2Req = (OperateAuthorizationV2Req) o;
        return Objects.equals(this.rejectReason, operateAuthorizationV2Req.rejectReason) &&
            Objects.equals(this.groupId, operateAuthorizationV2Req.groupId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rejectReason, groupId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateAuthorizationV2Req {\n");
        sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

