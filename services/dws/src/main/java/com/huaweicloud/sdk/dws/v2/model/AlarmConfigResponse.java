package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警配置详情
 */
public class AlarmConfigResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_name")

    private String alarmName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_space")

    private String nameSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private String alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_user_visible")

    private String isUserVisible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_converge")

    private String isConverge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "converge_time")

    private Integer convergeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_maintain_visible")

    private String isMaintainVisible;

    public AlarmConfigResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 告警配置ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AlarmConfigResponse withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 告警ID
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public AlarmConfigResponse withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * 告警名称
     * @return alarmName
     */
    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public AlarmConfigResponse withNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }

    /**
     * 所属服务，支持DWS,DLI,DGC,CloudTable,CDM,GES,CSS
     * @return nameSpace
     */
    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public AlarmConfigResponse withAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * 告警级别
     * @return alarmLevel
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public AlarmConfigResponse withIsUserVisible(String isUserVisible) {
        this.isUserVisible = isUserVisible;
        return this;
    }

    /**
     * 用户是否可见
     * @return isUserVisible
     */
    public String getIsUserVisible() {
        return isUserVisible;
    }

    public void setIsUserVisible(String isUserVisible) {
        this.isUserVisible = isUserVisible;
    }

    public AlarmConfigResponse withIsConverge(String isConverge) {
        this.isConverge = isConverge;
        return this;
    }

    /**
     * 是否覆盖
     * @return isConverge
     */
    public String getIsConverge() {
        return isConverge;
    }

    public void setIsConverge(String isConverge) {
        this.isConverge = isConverge;
    }

    public AlarmConfigResponse withConvergeTime(Integer convergeTime) {
        this.convergeTime = convergeTime;
        return this;
    }

    /**
     * 覆盖时间
     * @return convergeTime
     */
    public Integer getConvergeTime() {
        return convergeTime;
    }

    public void setConvergeTime(Integer convergeTime) {
        this.convergeTime = convergeTime;
    }

    public AlarmConfigResponse withIsMaintainVisible(String isMaintainVisible) {
        this.isMaintainVisible = isMaintainVisible;
        return this;
    }

    /**
     * 运维是否可见
     * @return isMaintainVisible
     */
    public String getIsMaintainVisible() {
        return isMaintainVisible;
    }

    public void setIsMaintainVisible(String isMaintainVisible) {
        this.isMaintainVisible = isMaintainVisible;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmConfigResponse that = (AlarmConfigResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.alarmId, that.alarmId)
            && Objects.equals(this.alarmName, that.alarmName) && Objects.equals(this.nameSpace, that.nameSpace)
            && Objects.equals(this.alarmLevel, that.alarmLevel)
            && Objects.equals(this.isUserVisible, that.isUserVisible)
            && Objects.equals(this.isConverge, that.isConverge) && Objects.equals(this.convergeTime, that.convergeTime)
            && Objects.equals(this.isMaintainVisible, that.isMaintainVisible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            alarmId,
            alarmName,
            nameSpace,
            alarmLevel,
            isUserVisible,
            isConverge,
            convergeTime,
            isMaintainVisible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmConfigResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
        sb.append("    nameSpace: ").append(toIndentedString(nameSpace)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    isUserVisible: ").append(toIndentedString(isUserVisible)).append("\n");
        sb.append("    isConverge: ").append(toIndentedString(isConverge)).append("\n");
        sb.append("    convergeTime: ").append(toIndentedString(convergeTime)).append("\n");
        sb.append("    isMaintainVisible: ").append(toIndentedString(isMaintainVisible)).append("\n");
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
