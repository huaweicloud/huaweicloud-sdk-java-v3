package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListAccessPointResponseBodyAccessPoints
 */
public class ListAccessPointResponseBodyAccessPoints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_point_id")

    private String accessPointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyspace_id")

    private String keyspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_point_name")

    private String accessPointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lsat_modify_time")

    private String lsatModifyTime;

    public ListAccessPointResponseBodyAccessPoints withAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }

    /**
     * **参数解释：** 接入点ID **取值范围：** 不涉及
     * @return accessPointId
     */
    public String getAccessPointId() {
        return accessPointId;
    }

    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    public ListAccessPointResponseBodyAccessPoints withKeyspaceId(String keyspaceId) {
        this.keyspaceId = keyspaceId;
        return this;
    }

    /**
     * **参数解释：** 密钥空间ID **取值范围：** 不涉及
     * @return keyspaceId
     */
    public String getKeyspaceId() {
        return keyspaceId;
    }

    public void setKeyspaceId(String keyspaceId) {
        this.keyspaceId = keyspaceId;
    }

    public ListAccessPointResponseBodyAccessPoints withAccessPointName(String accessPointName) {
        this.accessPointName = accessPointName;
        return this;
    }

    /**
     * **参数解释：** 接入点名称 **取值范围：** 不涉及
     * @return accessPointName
     */
    public String getAccessPointName() {
        return accessPointName;
    }

    public void setAccessPointName(String accessPointName) {
        this.accessPointName = accessPointName;
    }

    public ListAccessPointResponseBodyAccessPoints withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 接入点状态 **取值范围：** 0:禁用，1：启用
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public ListAccessPointResponseBodyAccessPoints withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 接入点类型 **取值范围：** 1:ECS，2：CCE，3：Custom
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ListAccessPointResponseBodyAccessPoints withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * **参数解释：** 接入点创建人 **取值范围：** 不涉及
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ListAccessPointResponseBodyAccessPoints withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 接入点创建时间 **取值范围：** 不涉及
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListAccessPointResponseBodyAccessPoints withLsatModifyTime(String lsatModifyTime) {
        this.lsatModifyTime = lsatModifyTime;
        return this;
    }

    /**
     * **参数解释：** 接入点最近更新时间 **取值范围：** 不涉及
     * @return lsatModifyTime
     */
    public String getLsatModifyTime() {
        return lsatModifyTime;
    }

    public void setLsatModifyTime(String lsatModifyTime) {
        this.lsatModifyTime = lsatModifyTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccessPointResponseBodyAccessPoints that = (ListAccessPointResponseBodyAccessPoints) obj;
        return Objects.equals(this.accessPointId, that.accessPointId)
            && Objects.equals(this.keyspaceId, that.keyspaceId)
            && Objects.equals(this.accessPointName, that.accessPointName) && Objects.equals(this.state, that.state)
            && Objects.equals(this.type, that.type) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lsatModifyTime, that.lsatModifyTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(accessPointId, keyspaceId, accessPointName, state, type, createdBy, createTime, lsatModifyTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessPointResponseBodyAccessPoints {\n");
        sb.append("    accessPointId: ").append(toIndentedString(accessPointId)).append("\n");
        sb.append("    keyspaceId: ").append(toIndentedString(keyspaceId)).append("\n");
        sb.append("    accessPointName: ").append(toIndentedString(accessPointName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lsatModifyTime: ").append(toIndentedString(lsatModifyTime)).append("\n");
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
