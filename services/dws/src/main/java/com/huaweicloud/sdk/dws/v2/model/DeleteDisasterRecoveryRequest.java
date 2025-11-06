package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDisasterRecoveryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_id")

    private String disasterRecoveryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_send_request")

    private Integer needSendRequest;

    public DeleteDisasterRecoveryRequest withDisasterRecoveryId(String disasterRecoveryId) {
        this.disasterRecoveryId = disasterRecoveryId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。获取方法请参见[获取集群ID](dws_02_00068.xml)。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return disasterRecoveryId
     */
    public String getDisasterRecoveryId() {
        return disasterRecoveryId;
    }

    public void setDisasterRecoveryId(String disasterRecoveryId) {
        this.disasterRecoveryId = disasterRecoveryId;
    }

    public DeleteDisasterRecoveryRequest withNeedSendRequest(Integer needSendRequest) {
        this.needSendRequest = needSendRequest;
        return this;
    }

    /**
     * **参数解释**： 跨region时是否需要向另一个集群发请求。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return needSendRequest
     */
    public Integer getNeedSendRequest() {
        return needSendRequest;
    }

    public void setNeedSendRequest(Integer needSendRequest) {
        this.needSendRequest = needSendRequest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDisasterRecoveryRequest that = (DeleteDisasterRecoveryRequest) obj;
        return Objects.equals(this.disasterRecoveryId, that.disasterRecoveryId)
            && Objects.equals(this.needSendRequest, that.needSendRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryId, needSendRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDisasterRecoveryRequest {\n");
        sb.append("    disasterRecoveryId: ").append(toIndentedString(disasterRecoveryId)).append("\n");
        sb.append("    needSendRequest: ").append(toIndentedString(needSendRequest)).append("\n");
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
