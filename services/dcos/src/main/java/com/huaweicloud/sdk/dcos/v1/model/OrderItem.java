package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 客户服务单-列表值
 */
public class OrderItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_type")

    private String subType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_code")

    private String modelCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_code")

    private String roomCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_name")

    private String roomName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_name")

    private String dcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private String stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant")

    private String applicant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public OrderItem withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 服务单号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public OrderItem withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OrderItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 服务单类型:IDC运维 设备运维 设备检查 客户陪同
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OrderItem withSubType(String subType) {
        this.subType = subType;
        return this;
    }

    /**
     * 具体操作类型:设备物理上下电
     * @return subType
     */
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public OrderItem withModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }

    /**
     * 服务单类型编码
     * @return modelCode
     */
    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public OrderItem withRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    /**
     * 机房编码
     * @return roomCode
     */
    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public OrderItem withRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * 机房编码
     * @return roomName
     */
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public OrderItem withDcName(String dcName) {
        this.dcName = dcName;
        return this;
    }

    /**
     * 机房编码
     * @return dcName
     */
    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }

    public OrderItem withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 当前阶段.DRAFT草稿、SUMMITED服务申请、IN_PROGRESS服务处理中、ACCEPTANCE服务验收、CLOSED服务关闭
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public OrderItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 当前状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderItem withApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }

    /**
     * 申请人
     * @return applicant
     */
    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public OrderItem withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 申请时间/创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderItem that = (OrderItem) obj;
        return Objects.equals(this.number, that.number) && Objects.equals(this.title, that.title)
            && Objects.equals(this.type, that.type) && Objects.equals(this.subType, that.subType)
            && Objects.equals(this.modelCode, that.modelCode) && Objects.equals(this.roomCode, that.roomCode)
            && Objects.equals(this.roomName, that.roomName) && Objects.equals(this.dcName, that.dcName)
            && Objects.equals(this.stage, that.stage) && Objects.equals(this.status, that.status)
            && Objects.equals(this.applicant, that.applicant) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,
            title,
            type,
            subType,
            modelCode,
            roomCode,
            roomName,
            dcName,
            stage,
            status,
            applicant,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderItem {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
        sb.append("    modelCode: ").append(toIndentedString(modelCode)).append("\n");
        sb.append("    roomCode: ").append(toIndentedString(roomCode)).append("\n");
        sb.append("    roomName: ").append(toIndentedString(roomName)).append("\n");
        sb.append("    dcName: ").append(toIndentedString(dcName)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    applicant: ").append(toIndentedString(applicant)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
