package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 伸缩活动日志列表。
 */
public class ScalingActivityLogV2 {

    /**
     * 伸缩活动状态：SUCCESS：成功。FAIL：失败。DOING：伸缩过程中。
     */
    public static final class StatusEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final StatusEnum FAIL = new StatusEnum("FAIL");

        /**
         * Enum DING for value: "DING"
         */
        public static final StatusEnum DING = new StatusEnum("DING");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAIL", FAIL);
            map.put("DING", DING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_removed_list")

    private List<ScalingInstance> instanceRemovedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_deleted_list")

    private List<ScalingInstance> instanceDeletedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_added_list")

    private List<ScalingInstance> instanceAddedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_failed_list")

    private List<ScalingInstance> instanceFailedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_standby_list")

    private List<ScalingInstance> instanceStandbyList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_value")

    private String scalingValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_value")

    private Integer instanceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desire_value")

    private Integer desireValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_bind_success_list")

    private List<ModifyLb> lbBindSuccessList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_bind_failed_list")

    private List<ModifyLb> lbBindFailedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_unbind_success_list")

    private List<ModifyLb> lbUnbindSuccessList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_unbind_failed_list")

    private List<ModifyLb> lbUnbindFailedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ScalingActivityLogV2 withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 伸缩活动状态：SUCCESS：成功。FAIL：失败。DOING：伸缩过程中。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ScalingActivityLogV2 withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 伸缩活动触发时间，遵循UTC时间。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ScalingActivityLogV2 withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 伸缩活动结束时间，遵循UTC时间。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ScalingActivityLogV2 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 伸缩活动日志ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScalingActivityLogV2 withInstanceRemovedList(List<ScalingInstance> instanceRemovedList) {
        this.instanceRemovedList = instanceRemovedList;
        return this;
    }

    public ScalingActivityLogV2 addInstanceRemovedListItem(ScalingInstance instanceRemovedListItem) {
        if (this.instanceRemovedList == null) {
            this.instanceRemovedList = new ArrayList<>();
        }
        this.instanceRemovedList.add(instanceRemovedListItem);
        return this;
    }

    public ScalingActivityLogV2 withInstanceRemovedList(Consumer<List<ScalingInstance>> instanceRemovedListSetter) {
        if (this.instanceRemovedList == null) {
            this.instanceRemovedList = new ArrayList<>();
        }
        instanceRemovedListSetter.accept(this.instanceRemovedList);
        return this;
    }

    /**
     * 完成伸缩活动且只被移出弹性伸缩组的云服务器名称列表，云服务信息之间以逗号分隔。
     * @return instanceRemovedList
     */
    public List<ScalingInstance> getInstanceRemovedList() {
        return instanceRemovedList;
    }

    public void setInstanceRemovedList(List<ScalingInstance> instanceRemovedList) {
        this.instanceRemovedList = instanceRemovedList;
    }

    public ScalingActivityLogV2 withInstanceDeletedList(List<ScalingInstance> instanceDeletedList) {
        this.instanceDeletedList = instanceDeletedList;
        return this;
    }

    public ScalingActivityLogV2 addInstanceDeletedListItem(ScalingInstance instanceDeletedListItem) {
        if (this.instanceDeletedList == null) {
            this.instanceDeletedList = new ArrayList<>();
        }
        this.instanceDeletedList.add(instanceDeletedListItem);
        return this;
    }

    public ScalingActivityLogV2 withInstanceDeletedList(Consumer<List<ScalingInstance>> instanceDeletedListSetter) {
        if (this.instanceDeletedList == null) {
            this.instanceDeletedList = new ArrayList<>();
        }
        instanceDeletedListSetter.accept(this.instanceDeletedList);
        return this;
    }

    /**
     * 完成伸缩活动且被移出弹性伸缩组并删除的云服务器名称列表，云服务器信息之间以逗号分隔。
     * @return instanceDeletedList
     */
    public List<ScalingInstance> getInstanceDeletedList() {
        return instanceDeletedList;
    }

    public void setInstanceDeletedList(List<ScalingInstance> instanceDeletedList) {
        this.instanceDeletedList = instanceDeletedList;
    }

    public ScalingActivityLogV2 withInstanceAddedList(List<ScalingInstance> instanceAddedList) {
        this.instanceAddedList = instanceAddedList;
        return this;
    }

    public ScalingActivityLogV2 addInstanceAddedListItem(ScalingInstance instanceAddedListItem) {
        if (this.instanceAddedList == null) {
            this.instanceAddedList = new ArrayList<>();
        }
        this.instanceAddedList.add(instanceAddedListItem);
        return this;
    }

    public ScalingActivityLogV2 withInstanceAddedList(Consumer<List<ScalingInstance>> instanceAddedListSetter) {
        if (this.instanceAddedList == null) {
            this.instanceAddedList = new ArrayList<>();
        }
        instanceAddedListSetter.accept(this.instanceAddedList);
        return this;
    }

    /**
     * 完成伸缩活动且被加入弹性伸缩组的云服务器名称列表，云服务器信息之间以逗号分割。
     * @return instanceAddedList
     */
    public List<ScalingInstance> getInstanceAddedList() {
        return instanceAddedList;
    }

    public void setInstanceAddedList(List<ScalingInstance> instanceAddedList) {
        this.instanceAddedList = instanceAddedList;
    }

    public ScalingActivityLogV2 withInstanceFailedList(List<ScalingInstance> instanceFailedList) {
        this.instanceFailedList = instanceFailedList;
        return this;
    }

    public ScalingActivityLogV2 addInstanceFailedListItem(ScalingInstance instanceFailedListItem) {
        if (this.instanceFailedList == null) {
            this.instanceFailedList = new ArrayList<>();
        }
        this.instanceFailedList.add(instanceFailedListItem);
        return this;
    }

    public ScalingActivityLogV2 withInstanceFailedList(Consumer<List<ScalingInstance>> instanceFailedListSetter) {
        if (this.instanceFailedList == null) {
            this.instanceFailedList = new ArrayList<>();
        }
        instanceFailedListSetter.accept(this.instanceFailedList);
        return this;
    }

    /**
     * 弹性伸缩组中伸缩活动失败的云服务器列表。
     * @return instanceFailedList
     */
    public List<ScalingInstance> getInstanceFailedList() {
        return instanceFailedList;
    }

    public void setInstanceFailedList(List<ScalingInstance> instanceFailedList) {
        this.instanceFailedList = instanceFailedList;
    }

    public ScalingActivityLogV2 withInstanceStandbyList(List<ScalingInstance> instanceStandbyList) {
        this.instanceStandbyList = instanceStandbyList;
        return this;
    }

    public ScalingActivityLogV2 addInstanceStandbyListItem(ScalingInstance instanceStandbyListItem) {
        if (this.instanceStandbyList == null) {
            this.instanceStandbyList = new ArrayList<>();
        }
        this.instanceStandbyList.add(instanceStandbyListItem);
        return this;
    }

    public ScalingActivityLogV2 withInstanceStandbyList(Consumer<List<ScalingInstance>> instanceStandbyListSetter) {
        if (this.instanceStandbyList == null) {
            this.instanceStandbyList = new ArrayList<>();
        }
        instanceStandbyListSetter.accept(this.instanceStandbyList);
        return this;
    }

    /**
     * 完成伸缩活动且被转入/移出备用状态的云服务器列表
     * @return instanceStandbyList
     */
    public List<ScalingInstance> getInstanceStandbyList() {
        return instanceStandbyList;
    }

    public void setInstanceStandbyList(List<ScalingInstance> instanceStandbyList) {
        this.instanceStandbyList = instanceStandbyList;
    }

    public ScalingActivityLogV2 withScalingValue(String scalingValue) {
        this.scalingValue = scalingValue;
        return this;
    }

    /**
     * 伸缩活动中变化（增加或减少）的云服务器数量。
     * @return scalingValue
     */
    public String getScalingValue() {
        return scalingValue;
    }

    public void setScalingValue(String scalingValue) {
        this.scalingValue = scalingValue;
    }

    public ScalingActivityLogV2 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 伸缩活动的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ScalingActivityLogV2 withInstanceValue(Integer instanceValue) {
        this.instanceValue = instanceValue;
        return this;
    }

    /**
     * 伸缩组当前instance值。
     * @return instanceValue
     */
    public Integer getInstanceValue() {
        return instanceValue;
    }

    public void setInstanceValue(Integer instanceValue) {
        this.instanceValue = instanceValue;
    }

    public ScalingActivityLogV2 withDesireValue(Integer desireValue) {
        this.desireValue = desireValue;
        return this;
    }

    /**
     * 伸缩活动最终desire值。
     * @return desireValue
     */
    public Integer getDesireValue() {
        return desireValue;
    }

    public void setDesireValue(Integer desireValue) {
        this.desireValue = desireValue;
    }

    public ScalingActivityLogV2 withLbBindSuccessList(List<ModifyLb> lbBindSuccessList) {
        this.lbBindSuccessList = lbBindSuccessList;
        return this;
    }

    public ScalingActivityLogV2 addLbBindSuccessListItem(ModifyLb lbBindSuccessListItem) {
        if (this.lbBindSuccessList == null) {
            this.lbBindSuccessList = new ArrayList<>();
        }
        this.lbBindSuccessList.add(lbBindSuccessListItem);
        return this;
    }

    public ScalingActivityLogV2 withLbBindSuccessList(Consumer<List<ModifyLb>> lbBindSuccessListSetter) {
        if (this.lbBindSuccessList == null) {
            this.lbBindSuccessList = new ArrayList<>();
        }
        lbBindSuccessListSetter.accept(this.lbBindSuccessList);
        return this;
    }

    /**
     * 绑定成功的负载均衡器列表。
     * @return lbBindSuccessList
     */
    public List<ModifyLb> getLbBindSuccessList() {
        return lbBindSuccessList;
    }

    public void setLbBindSuccessList(List<ModifyLb> lbBindSuccessList) {
        this.lbBindSuccessList = lbBindSuccessList;
    }

    public ScalingActivityLogV2 withLbBindFailedList(List<ModifyLb> lbBindFailedList) {
        this.lbBindFailedList = lbBindFailedList;
        return this;
    }

    public ScalingActivityLogV2 addLbBindFailedListItem(ModifyLb lbBindFailedListItem) {
        if (this.lbBindFailedList == null) {
            this.lbBindFailedList = new ArrayList<>();
        }
        this.lbBindFailedList.add(lbBindFailedListItem);
        return this;
    }

    public ScalingActivityLogV2 withLbBindFailedList(Consumer<List<ModifyLb>> lbBindFailedListSetter) {
        if (this.lbBindFailedList == null) {
            this.lbBindFailedList = new ArrayList<>();
        }
        lbBindFailedListSetter.accept(this.lbBindFailedList);
        return this;
    }

    /**
     * 绑定失败的负载均衡器列表。
     * @return lbBindFailedList
     */
    public List<ModifyLb> getLbBindFailedList() {
        return lbBindFailedList;
    }

    public void setLbBindFailedList(List<ModifyLb> lbBindFailedList) {
        this.lbBindFailedList = lbBindFailedList;
    }

    public ScalingActivityLogV2 withLbUnbindSuccessList(List<ModifyLb> lbUnbindSuccessList) {
        this.lbUnbindSuccessList = lbUnbindSuccessList;
        return this;
    }

    public ScalingActivityLogV2 addLbUnbindSuccessListItem(ModifyLb lbUnbindSuccessListItem) {
        if (this.lbUnbindSuccessList == null) {
            this.lbUnbindSuccessList = new ArrayList<>();
        }
        this.lbUnbindSuccessList.add(lbUnbindSuccessListItem);
        return this;
    }

    public ScalingActivityLogV2 withLbUnbindSuccessList(Consumer<List<ModifyLb>> lbUnbindSuccessListSetter) {
        if (this.lbUnbindSuccessList == null) {
            this.lbUnbindSuccessList = new ArrayList<>();
        }
        lbUnbindSuccessListSetter.accept(this.lbUnbindSuccessList);
        return this;
    }

    /**
     * 解绑成功的负载均衡器列表。
     * @return lbUnbindSuccessList
     */
    public List<ModifyLb> getLbUnbindSuccessList() {
        return lbUnbindSuccessList;
    }

    public void setLbUnbindSuccessList(List<ModifyLb> lbUnbindSuccessList) {
        this.lbUnbindSuccessList = lbUnbindSuccessList;
    }

    public ScalingActivityLogV2 withLbUnbindFailedList(List<ModifyLb> lbUnbindFailedList) {
        this.lbUnbindFailedList = lbUnbindFailedList;
        return this;
    }

    public ScalingActivityLogV2 addLbUnbindFailedListItem(ModifyLb lbUnbindFailedListItem) {
        if (this.lbUnbindFailedList == null) {
            this.lbUnbindFailedList = new ArrayList<>();
        }
        this.lbUnbindFailedList.add(lbUnbindFailedListItem);
        return this;
    }

    public ScalingActivityLogV2 withLbUnbindFailedList(Consumer<List<ModifyLb>> lbUnbindFailedListSetter) {
        if (this.lbUnbindFailedList == null) {
            this.lbUnbindFailedList = new ArrayList<>();
        }
        lbUnbindFailedListSetter.accept(this.lbUnbindFailedList);
        return this;
    }

    /**
     * 解绑失败的负载均衡器列表。
     * @return lbUnbindFailedList
     */
    public List<ModifyLb> getLbUnbindFailedList() {
        return lbUnbindFailedList;
    }

    public void setLbUnbindFailedList(List<ModifyLb> lbUnbindFailedList) {
        this.lbUnbindFailedList = lbUnbindFailedList;
    }

    public ScalingActivityLogV2 withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 伸缩组活动类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScalingActivityLogV2 that = (ScalingActivityLogV2) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.id, that.id)
            && Objects.equals(this.instanceRemovedList, that.instanceRemovedList)
            && Objects.equals(this.instanceDeletedList, that.instanceDeletedList)
            && Objects.equals(this.instanceAddedList, that.instanceAddedList)
            && Objects.equals(this.instanceFailedList, that.instanceFailedList)
            && Objects.equals(this.instanceStandbyList, that.instanceStandbyList)
            && Objects.equals(this.scalingValue, that.scalingValue)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.instanceValue, that.instanceValue)
            && Objects.equals(this.desireValue, that.desireValue)
            && Objects.equals(this.lbBindSuccessList, that.lbBindSuccessList)
            && Objects.equals(this.lbBindFailedList, that.lbBindFailedList)
            && Objects.equals(this.lbUnbindSuccessList, that.lbUnbindSuccessList)
            && Objects.equals(this.lbUnbindFailedList, that.lbUnbindFailedList) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            startTime,
            endTime,
            id,
            instanceRemovedList,
            instanceDeletedList,
            instanceAddedList,
            instanceFailedList,
            instanceStandbyList,
            scalingValue,
            description,
            instanceValue,
            desireValue,
            lbBindSuccessList,
            lbBindFailedList,
            lbUnbindSuccessList,
            lbUnbindFailedList,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingActivityLogV2 {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceRemovedList: ").append(toIndentedString(instanceRemovedList)).append("\n");
        sb.append("    instanceDeletedList: ").append(toIndentedString(instanceDeletedList)).append("\n");
        sb.append("    instanceAddedList: ").append(toIndentedString(instanceAddedList)).append("\n");
        sb.append("    instanceFailedList: ").append(toIndentedString(instanceFailedList)).append("\n");
        sb.append("    instanceStandbyList: ").append(toIndentedString(instanceStandbyList)).append("\n");
        sb.append("    scalingValue: ").append(toIndentedString(scalingValue)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instanceValue: ").append(toIndentedString(instanceValue)).append("\n");
        sb.append("    desireValue: ").append(toIndentedString(desireValue)).append("\n");
        sb.append("    lbBindSuccessList: ").append(toIndentedString(lbBindSuccessList)).append("\n");
        sb.append("    lbBindFailedList: ").append(toIndentedString(lbBindFailedList)).append("\n");
        sb.append("    lbUnbindSuccessList: ").append(toIndentedString(lbUnbindSuccessList)).append("\n");
        sb.append("    lbUnbindFailedList: ").append(toIndentedString(lbUnbindFailedList)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
