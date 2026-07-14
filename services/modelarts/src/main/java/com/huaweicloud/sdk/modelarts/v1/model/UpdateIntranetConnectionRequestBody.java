package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateIntranetConnectionRequestBody
 */
public class UpdateIntranetConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public UpdateIntranetConnectionRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 内网接入申请操作。 **约束限制：** 不涉及。 **取值范围：** - APPROVE：通过申请。只有当内网接入申请处于“审批中”状态时，才可进行此操作。 - REJECT： 拒绝申请。只有当内网接入申请处于“审批中”状态时，才可进行此操作。 - CANCEL： 取消授权，只有当内网接入申请处于“通过”（CONNECTED）状态时，才可进行取消授权操作。 - RETRY：  重试申请，只有当内网接入申请处于“异常”状态并且异常原因为“连接失败，请重试”时，才可进行重试操作。 **默认取值：** 不涉及。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UpdateIntranetConnectionRequestBody withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释：** 拒绝时可以填入拒绝的原因。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIntranetConnectionRequestBody that = (UpdateIntranetConnectionRequestBody) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIntranetConnectionRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
