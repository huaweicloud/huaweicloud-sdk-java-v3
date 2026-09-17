package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 更新发布/迭代状态的请求体。 **约束限制**： 不涉及。
 */
public class CompleteSprintVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate")

    private String operate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "move_to_sprint_id")

    private String moveToSprintId;

    public CompleteSprintVO withOperate(String operate) {
        this.operate = operate;
        return this;
    }

    /**
     * **参数解释**： 操作类型。 **约束限制**： 不涉及。 **取值范围**： - start：开始发布/迭代计划 - complete：完成发布/迭代计划 - reset：将计划状态设置为\"未开始\" - restart：重新开始发布/迭代计划 - move：将工作项移动到其他迭代 **默认取值**： 不涉及。
     * @return operate
     */
    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public CompleteSprintVO withMoveToSprintId(String moveToSprintId) {
        this.moveToSprintId = moveToSprintId;
        return this;
    }

    /**
     * **参数解释**： 将工作项移动到指定迭代ID。operate参数值为complete时，需要将未完成的工作项移动到其他迭代。 **约束限制**： operate参数值为complete时需填写。空字符串表示将工作项移动到\"待规划\"。 **取值范围**： 长度为18~19个字符的数字字符串。 **默认取值**： 不涉及。
     * @return moveToSprintId
     */
    public String getMoveToSprintId() {
        return moveToSprintId;
    }

    public void setMoveToSprintId(String moveToSprintId) {
        this.moveToSprintId = moveToSprintId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompleteSprintVO that = (CompleteSprintVO) obj;
        return Objects.equals(this.operate, that.operate) && Objects.equals(this.moveToSprintId, that.moveToSprintId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operate, moveToSprintId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompleteSprintVO {\n");
        sb.append("    operate: ").append(toIndentedString(operate)).append("\n");
        sb.append("    moveToSprintId: ").append(toIndentedString(moveToSprintId)).append("\n");
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
