package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommentExtendAttribute
 */
public class CommentExtendAttribute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private UserVO operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator_id")

    private String operatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_us")

    private String actionUs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_status_code")

    private String preStatusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_status_code")

    private String newStatusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_status")

    private Object preStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_status")

    private Object newStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type")

    private String fieldType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type_id")

    private String fieldTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    public CommentExtendAttribute withOperator(UserVO operator) {
        this.operator = operator;
        return this;
    }

    public CommentExtendAttribute withOperator(Consumer<UserVO> operatorSetter) {
        if (this.operator == null) {
            this.operator = new UserVO();
            operatorSetter.accept(this.operator);
        }

        return this;
    }

    /**
     * Get operator
     * @return operator
     */
    public UserVO getOperator() {
        return operator;
    }

    public void setOperator(UserVO operator) {
        this.operator = operator;
    }

    public CommentExtendAttribute withOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    /**
     * 操作人Id
     * @return operatorId
     */
    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public CommentExtendAttribute withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 系统生成评论时执行的动作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CommentExtendAttribute withActionUs(String actionUs) {
        this.actionUs = actionUs;
        return this;
    }

    /**
     * 系统生成评论时执行的动作(英文)
     * @return actionUs
     */
    public String getActionUs() {
        return actionUs;
    }

    public void setActionUs(String actionUs) {
        this.actionUs = actionUs;
    }

    public CommentExtendAttribute withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 系统生成评论对应的对象类型
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public CommentExtendAttribute withPreStatusCode(String preStatusCode) {
        this.preStatusCode = preStatusCode;
        return this;
    }

    /**
     * 工作项流转前的状态Code
     * @return preStatusCode
     */
    public String getPreStatusCode() {
        return preStatusCode;
    }

    public void setPreStatusCode(String preStatusCode) {
        this.preStatusCode = preStatusCode;
    }

    public CommentExtendAttribute withNewStatusCode(String newStatusCode) {
        this.newStatusCode = newStatusCode;
        return this;
    }

    /**
     * 工作项流转后的状态Code
     * @return newStatusCode
     */
    public String getNewStatusCode() {
        return newStatusCode;
    }

    public void setNewStatusCode(String newStatusCode) {
        this.newStatusCode = newStatusCode;
    }

    public CommentExtendAttribute withPreStatus(Object preStatus) {
        this.preStatus = preStatus;
        return this;
    }

    /**
     * 对象类型根据field_type_id值变化而变化。 field_type_id=10001时，为StatusVO field_type_id=10007、10008时，为字符串 field_type_id=10003、10004时，为日期时间 field_type_id=10005、10006时，为数字
     * @return preStatus
     */
    public Object getPreStatus() {
        return preStatus;
    }

    public void setPreStatus(Object preStatus) {
        this.preStatus = preStatus;
    }

    public CommentExtendAttribute withNewStatus(Object newStatus) {
        this.newStatus = newStatus;
        return this;
    }

    /**
     * 对象类型根据field_type_id值变化而变化。 field_type_id=10001、10002时，为StatusVO field_type_id=10007、10008时，为字符串 field_type_id=10003、10004时，为日期时间 field_type_id=10005、10006时，为数字 field_type_id=10009、10010时，为UserVO
     * @return newStatus
     */
    public Object getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Object newStatus) {
        this.newStatus = newStatus;
    }

    public CommentExtendAttribute withFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * 字段类型
     * @return fieldType
     */
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public CommentExtendAttribute withFieldTypeId(String fieldTypeId) {
        this.fieldTypeId = fieldTypeId;
        return this;
    }

    /**
     * 字段类型对应的Id
     * @return fieldTypeId
     */
    public String getFieldTypeId() {
        return fieldTypeId;
    }

    public void setFieldTypeId(String fieldTypeId) {
        this.fieldTypeId = fieldTypeId;
    }

    public CommentExtendAttribute withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 字段显示名
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentExtendAttribute that = (CommentExtendAttribute) obj;
        return Objects.equals(this.operator, that.operator) && Objects.equals(this.operatorId, that.operatorId)
            && Objects.equals(this.action, that.action) && Objects.equals(this.actionUs, that.actionUs)
            && Objects.equals(this.objectType, that.objectType)
            && Objects.equals(this.preStatusCode, that.preStatusCode)
            && Objects.equals(this.newStatusCode, that.newStatusCode) && Objects.equals(this.preStatus, that.preStatus)
            && Objects.equals(this.newStatus, that.newStatus) && Objects.equals(this.fieldType, that.fieldType)
            && Objects.equals(this.fieldTypeId, that.fieldTypeId) && Objects.equals(this.displayName, that.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operator,
            operatorId,
            action,
            actionUs,
            objectType,
            preStatusCode,
            newStatusCode,
            preStatus,
            newStatus,
            fieldType,
            fieldTypeId,
            displayName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentExtendAttribute {\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    actionUs: ").append(toIndentedString(actionUs)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    preStatusCode: ").append(toIndentedString(preStatusCode)).append("\n");
        sb.append("    newStatusCode: ").append(toIndentedString(newStatusCode)).append("\n");
        sb.append("    preStatus: ").append(toIndentedString(preStatus)).append("\n");
        sb.append("    newStatus: ").append(toIndentedString(newStatus)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    fieldTypeId: ").append(toIndentedString(fieldTypeId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
