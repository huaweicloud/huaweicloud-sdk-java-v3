package com.huaweicloud.sdk.ces.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAlarmHistoriesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_id")
    
    private String alarmId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_name")
    
    private String alarmName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_status")
    
    private String alarmStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_level")
    
    private String alarmLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="from")
    
    private String from;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="to")
    
    private String to;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start")
    
    private String start;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;

    public ListAlarmHistoriesRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 服务提供的资源分组功能，创建的资源分组ID，如：rg1603107497873DK4O2pXbn。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public ListAlarmHistoriesRequest withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    


    /**
     * 告警规则ID。如：al1603088932912v98rGl1al。
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    

    public ListAlarmHistoriesRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    


    /**
     * 告警规则名称，如alarm-test01。
     * @return alarmName
     */
    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    

    public ListAlarmHistoriesRequest withAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    


    /**
     * 告警历史的状态，取值为ok，alarm，insufficient_data； ok为正常，alarm为告警，insufficient_data为数据不足。
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    

    public ListAlarmHistoriesRequest withAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    


    /**
     * 告警历史的告警级别，值为1,2,3,4；1为紧急，2为重要，3为次要，4为提示。
     * @return alarmLevel
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    

    public ListAlarmHistoriesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 告警资源对应的命名空间，如ECS服务的资源命名空间为：SYS.ECS；各服务命名空间可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public ListAlarmHistoriesRequest withFrom(String from) {
        this.from = from;
        return this;
    }

    


    /**
     * 查询告警历史的起始时间，UNIX时间戳，单位毫秒，如：1602501480905；from，to如果不进行赋值，则默认to是当前时间，from是当前时间减7天的时间戳。
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    

    public ListAlarmHistoriesRequest withTo(String to) {
        this.to = to;
        return this;
    }

    


    /**
     * 查询告警历史的截止时间，UNIX时间戳，单位毫秒。from必须小于等于to，如：1603106280905；from，to如果不进行赋值，则默认to是当前时间，from是当前时间减7天的时间戳。
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    

    public ListAlarmHistoriesRequest withStart(String start) {
        this.start = start;
        return this;
    }

    


    /**
     * 分页起始值，类型为integer，默认值为0。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    

    public ListAlarmHistoriesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 单次查询的条数限制，取值范围(0,100]，默认值为100， 用于限制结果数据条数。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmHistoriesRequest listAlarmHistoriesRequest = (ListAlarmHistoriesRequest) o;
        return Objects.equals(this.groupId, listAlarmHistoriesRequest.groupId) &&
            Objects.equals(this.alarmId, listAlarmHistoriesRequest.alarmId) &&
            Objects.equals(this.alarmName, listAlarmHistoriesRequest.alarmName) &&
            Objects.equals(this.alarmStatus, listAlarmHistoriesRequest.alarmStatus) &&
            Objects.equals(this.alarmLevel, listAlarmHistoriesRequest.alarmLevel) &&
            Objects.equals(this.namespace, listAlarmHistoriesRequest.namespace) &&
            Objects.equals(this.from, listAlarmHistoriesRequest.from) &&
            Objects.equals(this.to, listAlarmHistoriesRequest.to) &&
            Objects.equals(this.start, listAlarmHistoriesRequest.start) &&
            Objects.equals(this.limit, listAlarmHistoriesRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupId, alarmId, alarmName, alarmStatus, alarmLevel, namespace, from, to, start, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmHistoriesRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
        sb.append("    alarmStatus: ").append(toIndentedString(alarmStatus)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

