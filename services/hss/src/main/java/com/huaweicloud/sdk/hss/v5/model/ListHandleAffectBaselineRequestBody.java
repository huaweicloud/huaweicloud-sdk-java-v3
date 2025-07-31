package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释** 基线检查执行操作时影响的范围的请求参数
 */
public class ListHandleAffectBaselineRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_list")

    private List<ListHandleAffectBaselineRequestBodyCheckRuleList> checkRuleList = null;

    public ListHandleAffectBaselineRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释** 基线检查执行的操作 **约束限制** 不涉及 **取值范围**   - add_to_whitelist: 加白名单 - ignore          : 忽略 - unignore        : 取消忽略 - fix             : 修复 - verify          : 验证 **默认取值** 不涉及
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListHandleAffectBaselineRequestBody withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * **参数解释** 当前检查项的状态 **约束限制** 不涉及 **取值范围**   - unhandled : 未处理 - fix-failed: 修复失败 - fixing    : 修复中 - verifying : 验证中 - ignored   : 忽略 - safe      : 安全 **默认取值** 不涉及
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public ListHandleAffectBaselineRequestBody withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释** 主机id，没有该字段则代表该检查项影响的部分主机 **约束限制** 不涉及 **取值范围**   字符长度1-256位 **默认取值** 不涉及
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListHandleAffectBaselineRequestBody withCheckRuleList(
        List<ListHandleAffectBaselineRequestBodyCheckRuleList> checkRuleList) {
        this.checkRuleList = checkRuleList;
        return this;
    }

    public ListHandleAffectBaselineRequestBody addCheckRuleListItem(
        ListHandleAffectBaselineRequestBodyCheckRuleList checkRuleListItem) {
        if (this.checkRuleList == null) {
            this.checkRuleList = new ArrayList<>();
        }
        this.checkRuleList.add(checkRuleListItem);
        return this;
    }

    public ListHandleAffectBaselineRequestBody withCheckRuleList(
        Consumer<List<ListHandleAffectBaselineRequestBodyCheckRuleList>> checkRuleListSetter) {
        if (this.checkRuleList == null) {
            this.checkRuleList = new ArrayList<>();
        }
        checkRuleListSetter.accept(this.checkRuleList);
        return this;
    }

    /**
     * **参数解释** 需要进行操作的检查项列表 **约束限制** 列表范围0-200条
     * @return checkRuleList
     */
    public List<ListHandleAffectBaselineRequestBodyCheckRuleList> getCheckRuleList() {
        return checkRuleList;
    }

    public void setCheckRuleList(List<ListHandleAffectBaselineRequestBodyCheckRuleList> checkRuleList) {
        this.checkRuleList = checkRuleList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHandleAffectBaselineRequestBody that = (ListHandleAffectBaselineRequestBody) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.handleStatus, that.handleStatus)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.checkRuleList, that.checkRuleList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, handleStatus, hostId, checkRuleList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHandleAffectBaselineRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    checkRuleList: ").append(toIndentedString(checkRuleList)).append("\n");
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
