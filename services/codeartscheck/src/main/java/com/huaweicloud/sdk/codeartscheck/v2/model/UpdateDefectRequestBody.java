package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateDefectRequestBody
 */
public class UpdateDefectRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_id")

    private String defectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_status")

    private String defectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private String approver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignoreType")

    private String ignoreType;

    public UpdateDefectRequestBody withDefectId(String defectId) {
        this.defectId = defectId;
        return this;
    }

    /**
     * **参数解释：** MergeKey，问题ID。[[查询缺陷详情](ShowTaskDefectsV2.xml)](tag:hws,hws_hk)[查询缺陷详情](tag:fcs,hcs,hcs_sm,hcs_site,hcs_sitesm)响应中的defect_id字段 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return defectId
     */
    public String getDefectId() {
        return defectId;
    }

    public void setDefectId(String defectId) {
        this.defectId = defectId;
    }

    public UpdateDefectRequestBody withDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
        return this;
    }

    /**
     * **参数解释：** 问题状态。 **约束限制：** [不涉及。](tag:hws,hws_hk)[状态为0、1的问题无法直接修改到状态3。](tag:fcs,hcs,hcs_sm,hcs_site,hcs_sitesm) **取值范围：** - 0：待处理。 - 1：已解决。 - 2：已忽略。 [- 3：重新打开（需打开忽略审核开关）。](tag:fcs,hcs,hcs_sm,hcs_site,hcs_sitesm) [- 4：待审核（需打开忽略审核开关）。](tag:fcs,hcs,hcs_sm,hcs_site,hcs_sitesm) **默认取值：** 不涉及。
     * @return defectStatus
     */
    public String getDefectStatus() {
        return defectStatus;
    }

    public void setDefectStatus(String defectStatus) {
        this.defectStatus = defectStatus;
    }

    public UpdateDefectRequestBody withApprover(String approver) {
        this.approver = approver;
        return this;
    }

    /**
     * **参数解释：** 问题忽略的审核人用户名。 **约束限制：** defect_status取值为4（需打开忽略审核开关）时，必填。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return approver
     */
    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public UpdateDefectRequestBody withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * **参数解释：** 本次修改问题状态操作的备注。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UpdateDefectRequestBody withIgnoreType(String ignoreType) {
        this.ignoreType = ignoreType;
        return this;
    }

    /**
     * **参数解释：** [忽略类型，将问题修改为待审核状态时选填。](tag:fcs,hcs,hcs_sm,hcs_site,hcs_sitesm)[废弃字段。](tag:hws,hws_hk) **约束限制：** 不涉及。 **取值范围：** - NO_RISK：评估无风险暂不解决。 - FALSE_POSITIVES：纯属工具误报。 - THIRD_PARTY：开源及第三方。 - EFFUCUENCY_RETAIN：性能敏感保留危险函数。 - NO_SUPPORT_INKERNEL：不支持的内核危险函数。 - EXCLUDE_SCENES：规范例外场景。 - COMPATIBLE_THIRD_PARTY：兼容第三方。 **默认取值：** NO_RISK
     * @return ignoreType
     */
    public String getIgnoreType() {
        return ignoreType;
    }

    public void setIgnoreType(String ignoreType) {
        this.ignoreType = ignoreType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDefectRequestBody that = (UpdateDefectRequestBody) obj;
        return Objects.equals(this.defectId, that.defectId) && Objects.equals(this.defectStatus, that.defectStatus)
            && Objects.equals(this.approver, that.approver) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.ignoreType, that.ignoreType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defectId, defectStatus, approver, comment, ignoreType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDefectRequestBody {\n");
        sb.append("    defectId: ").append(toIndentedString(defectId)).append("\n");
        sb.append("    defectStatus: ").append(toIndentedString(defectStatus)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    ignoreType: ").append(toIndentedString(ignoreType)).append("\n");
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
