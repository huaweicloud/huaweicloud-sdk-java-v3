package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResumePauseAiPolicyGroupsRequestInfo
 */
public class ResumePauseAiPolicyGroupsRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id_list")

    private List<String> groupIdList = null;

    public ResumePauseAiPolicyGroupsRequestInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: 是否启用 **约束限制**: 必填 **取值范围**: - false：否 - true：是  **默认取值**: 不涉及 
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ResumePauseAiPolicyGroupsRequestInfo withGroupIdList(List<String> groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }

    public ResumePauseAiPolicyGroupsRequestInfo addGroupIdListItem(String groupIdListItem) {
        if (this.groupIdList == null) {
            this.groupIdList = new ArrayList<>();
        }
        this.groupIdList.add(groupIdListItem);
        return this;
    }

    public ResumePauseAiPolicyGroupsRequestInfo withGroupIdList(Consumer<List<String>> groupIdListSetter) {
        if (this.groupIdList == null) {
            this.groupIdList = new ArrayList<>();
        }
        groupIdListSetter.accept(this.groupIdList);
        return this;
    }

    /**
     * **参数解释**： 策略组ID列表 **约束限制**： 必填 **取值范围**： 1-50个策略组ID **默认取值**： 不涉及 
     * @return groupIdList
     */
    public List<String> getGroupIdList() {
        return groupIdList;
    }

    public void setGroupIdList(List<String> groupIdList) {
        this.groupIdList = groupIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResumePauseAiPolicyGroupsRequestInfo that = (ResumePauseAiPolicyGroupsRequestInfo) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.groupIdList, that.groupIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, groupIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResumePauseAiPolicyGroupsRequestInfo {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    groupIdList: ").append(toIndentedString(groupIdList)).append("\n");
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
