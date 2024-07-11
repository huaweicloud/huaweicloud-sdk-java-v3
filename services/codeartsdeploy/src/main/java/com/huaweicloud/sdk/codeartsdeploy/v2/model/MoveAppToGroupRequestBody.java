package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 移动应用至指定分组请求体
 */
public class MoveAppToGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_ids")

    private List<String> applicationIds = null;

    public MoveAppToGroupRequestBody withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public MoveAppToGroupRequestBody withApplicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }

    public MoveAppToGroupRequestBody addApplicationIdsItem(String applicationIdsItem) {
        if (this.applicationIds == null) {
            this.applicationIds = new ArrayList<>();
        }
        this.applicationIds.add(applicationIdsItem);
        return this;
    }

    public MoveAppToGroupRequestBody withApplicationIds(Consumer<List<String>> applicationIdsSetter) {
        if (this.applicationIds == null) {
            this.applicationIds = new ArrayList<>();
        }
        applicationIdsSetter.accept(this.applicationIds);
        return this;
    }

    /**
     * 应用id列表
     * @return applicationIds
     */
    public List<String> getApplicationIds() {
        return applicationIds;
    }

    public void setApplicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MoveAppToGroupRequestBody that = (MoveAppToGroupRequestBody) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.applicationIds, that.applicationIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, applicationIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveAppToGroupRequestBody {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    applicationIds: ").append(toIndentedString(applicationIds)).append("\n");
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
