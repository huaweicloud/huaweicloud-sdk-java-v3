package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateResourceGroupAssociationAlarmTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_ids")

    private List<String> templateIds = null;

    public UpdateResourceGroupAssociationAlarmTemplateResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 资源分组ID，以rg开头，后跟22位由字母或数字组成的字符串
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public UpdateResourceGroupAssociationAlarmTemplateResponse withTemplateIds(List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }

    public UpdateResourceGroupAssociationAlarmTemplateResponse addTemplateIdsItem(String templateIdsItem) {
        if (this.templateIds == null) {
            this.templateIds = new ArrayList<>();
        }
        this.templateIds.add(templateIdsItem);
        return this;
    }

    public UpdateResourceGroupAssociationAlarmTemplateResponse withTemplateIds(
        Consumer<List<String>> templateIdsSetter) {
        if (this.templateIds == null) {
            this.templateIds = new ArrayList<>();
        }
        templateIdsSetter.accept(this.templateIds);
        return this;
    }

    /**
     * 关联的告警模板的ID列表
     * @return templateIds
     */
    public List<String> getTemplateIds() {
        return templateIds;
    }

    public void setTemplateIds(List<String> templateIds) {
        this.templateIds = templateIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateResourceGroupAssociationAlarmTemplateResponse that =
            (UpdateResourceGroupAssociationAlarmTemplateResponse) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.templateIds, that.templateIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, templateIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResourceGroupAssociationAlarmTemplateResponse {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
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
