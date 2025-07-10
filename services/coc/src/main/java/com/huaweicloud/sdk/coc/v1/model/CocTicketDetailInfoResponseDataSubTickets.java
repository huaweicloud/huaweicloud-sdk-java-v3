package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CocTicketDetailInfoResponseDataSubTickets
 */
public class CocTicketDetailInfoResponseDataSubTickets {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_ticket_id")

    private String changeTicketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_ticket_id_sub")

    private String changeTicketIdSub;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whether_to_change")

    private Boolean whetherToChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deleted")

    private Boolean isDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_ticket_id")

    private String mainTicketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_ticket_id")

    private String parentTicketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_ticket_id")

    private String realTicketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_path")

    private String ticketPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_value")

    private String targetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    public CocTicketDetailInfoResponseDataSubTickets withChangeTicketId(String changeTicketId) {
        this.changeTicketId = changeTicketId;
        return this;
    }

    /**
     * 变更单单号。
     * @return changeTicketId
     */
    public String getChangeTicketId() {
        return changeTicketId;
    }

    public void setChangeTicketId(String changeTicketId) {
        this.changeTicketId = changeTicketId;
    }

    public CocTicketDetailInfoResponseDataSubTickets withChangeTicketIdSub(String changeTicketIdSub) {
        this.changeTicketIdSub = changeTicketIdSub;
        return this;
    }

    /**
     * 变更子单单号。
     * @return changeTicketIdSub
     */
    public String getChangeTicketIdSub() {
        return changeTicketIdSub;
    }

    public void setChangeTicketIdSub(String changeTicketIdSub) {
        this.changeTicketIdSub = changeTicketIdSub;
    }

    public CocTicketDetailInfoResponseDataSubTickets withWhetherToChange(Boolean whetherToChange) {
        this.whetherToChange = whetherToChange;
        return this;
    }

    /**
     * 是否需要变更。
     * @return whetherToChange
     */
    public Boolean getWhetherToChange() {
        return whetherToChange;
    }

    public void setWhetherToChange(Boolean whetherToChange) {
        this.whetherToChange = whetherToChange;
    }

    public CocTicketDetailInfoResponseDataSubTickets withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 是否已删除。
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public CocTicketDetailInfoResponseDataSubTickets withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 变更工单ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CocTicketDetailInfoResponseDataSubTickets withMainTicketId(String mainTicketId) {
        this.mainTicketId = mainTicketId;
        return this;
    }

    /**
     * 变更工单主键ID。
     * @return mainTicketId
     */
    public String getMainTicketId() {
        return mainTicketId;
    }

    public void setMainTicketId(String mainTicketId) {
        this.mainTicketId = mainTicketId;
    }

    public CocTicketDetailInfoResponseDataSubTickets withParentTicketId(String parentTicketId) {
        this.parentTicketId = parentTicketId;
        return this;
    }

    /**
     * 父级工单ID。
     * @return parentTicketId
     */
    public String getParentTicketId() {
        return parentTicketId;
    }

    public void setParentTicketId(String parentTicketId) {
        this.parentTicketId = parentTicketId;
    }

    public CocTicketDetailInfoResponseDataSubTickets withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 问题单ID。
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public CocTicketDetailInfoResponseDataSubTickets withRealTicketId(String realTicketId) {
        this.realTicketId = realTicketId;
        return this;
    }

    /**
     * 问题单单号。
     * @return realTicketId
     */
    public String getRealTicketId() {
        return realTicketId;
    }

    public void setRealTicketId(String realTicketId) {
        this.realTicketId = realTicketId;
    }

    public CocTicketDetailInfoResponseDataSubTickets withTicketPath(String ticketPath) {
        this.ticketPath = ticketPath;
        return this;
    }

    /**
     * 工单路径。
     * @return ticketPath
     */
    public String getTicketPath() {
        return ticketPath;
    }

    public void setTicketPath(String ticketPath) {
        this.ticketPath = ticketPath;
    }

    public CocTicketDetailInfoResponseDataSubTickets withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * region信息。
     * @return targetValue
     */
    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public CocTicketDetailInfoResponseDataSubTickets withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 子单类型。
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public CocTicketDetailInfoResponseDataSubTickets withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CocTicketDetailInfoResponseDataSubTickets withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CocTicketDetailInfoResponseDataSubTickets withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创单人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public CocTicketDetailInfoResponseDataSubTickets withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作人。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CocTicketDetailInfoResponseDataSubTickets that = (CocTicketDetailInfoResponseDataSubTickets) obj;
        return Objects.equals(this.changeTicketId, that.changeTicketId)
            && Objects.equals(this.changeTicketIdSub, that.changeTicketIdSub)
            && Objects.equals(this.whetherToChange, that.whetherToChange)
            && Objects.equals(this.isDeleted, that.isDeleted) && Objects.equals(this.id, that.id)
            && Objects.equals(this.mainTicketId, that.mainTicketId)
            && Objects.equals(this.parentTicketId, that.parentTicketId) && Objects.equals(this.ticketId, that.ticketId)
            && Objects.equals(this.realTicketId, that.realTicketId) && Objects.equals(this.ticketPath, that.ticketPath)
            && Objects.equals(this.targetValue, that.targetValue) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeTicketId,
            changeTicketIdSub,
            whetherToChange,
            isDeleted,
            id,
            mainTicketId,
            parentTicketId,
            ticketId,
            realTicketId,
            ticketPath,
            targetValue,
            targetType,
            createTime,
            updateTime,
            creator,
            operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocTicketDetailInfoResponseDataSubTickets {\n");
        sb.append("    changeTicketId: ").append(toIndentedString(changeTicketId)).append("\n");
        sb.append("    changeTicketIdSub: ").append(toIndentedString(changeTicketIdSub)).append("\n");
        sb.append("    whetherToChange: ").append(toIndentedString(whetherToChange)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mainTicketId: ").append(toIndentedString(mainTicketId)).append("\n");
        sb.append("    parentTicketId: ").append(toIndentedString(parentTicketId)).append("\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    realTicketId: ").append(toIndentedString(realTicketId)).append("\n");
        sb.append("    ticketPath: ").append(toIndentedString(ticketPath)).append("\n");
        sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
