package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteAlarmTemplatesRequestBody
 */
public class BatchDeleteAlarmTemplatesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_ids")

    private List<String> templateIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_associate_alarm")

    private Boolean deleteAssociateAlarm;

    public BatchDeleteAlarmTemplatesRequestBody withTemplateIds(List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }

    public BatchDeleteAlarmTemplatesRequestBody addTemplateIdsItem(String templateIdsItem) {
        if (this.templateIds == null) {
            this.templateIds = new ArrayList<>();
        }
        this.templateIds.add(templateIdsItem);
        return this;
    }

    public BatchDeleteAlarmTemplatesRequestBody withTemplateIds(Consumer<List<String>> templateIdsSetter) {
        if (this.templateIds == null) {
            this.templateIds = new ArrayList<>();
        }
        templateIdsSetter.accept(this.templateIds);
        return this;
    }

    /**
     * 需要批量删除的告警模板的ID列表。未关联告警规则的模板可以批量删除多个；已关联告警规则的告警模板，单次只允许删除一个，若同时删除多个已关联告警规则的告警模板，将返回异常
     * @return templateIds
     */
    public List<String> getTemplateIds() {
        return templateIds;
    }

    public void setTemplateIds(List<String> templateIds) {
        this.templateIds = templateIds;
    }

    public BatchDeleteAlarmTemplatesRequestBody withDeleteAssociateAlarm(Boolean deleteAssociateAlarm) {
        this.deleteAssociateAlarm = deleteAssociateAlarm;
        return this;
    }

    /**
     * 如果告警模板关联了告警规则，是否级联删除告警规则，true代表级联删除，false代表只删除告警模板
     * @return deleteAssociateAlarm
     */
    public Boolean getDeleteAssociateAlarm() {
        return deleteAssociateAlarm;
    }

    public void setDeleteAssociateAlarm(Boolean deleteAssociateAlarm) {
        this.deleteAssociateAlarm = deleteAssociateAlarm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteAlarmTemplatesRequestBody that = (BatchDeleteAlarmTemplatesRequestBody) obj;
        return Objects.equals(this.templateIds, that.templateIds)
            && Objects.equals(this.deleteAssociateAlarm, that.deleteAssociateAlarm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateIds, deleteAssociateAlarm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAlarmTemplatesRequestBody {\n");
        sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
        sb.append("    deleteAssociateAlarm: ").append(toIndentedString(deleteAssociateAlarm)).append("\n");
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
