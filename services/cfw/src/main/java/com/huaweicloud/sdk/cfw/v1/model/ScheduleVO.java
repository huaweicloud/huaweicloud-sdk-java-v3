package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ScheduleVO
 */
public class ScheduleVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_id")

    private String scheduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_count")

    private Integer refCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodic")

    private List<ScheduleVOPeriodic> periodic = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "absolute")

    private ScheduleVOAbsolute absolute;

    public ScheduleVO withScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }

    /**
     * **参数解释**： 时间表ID **取值范围**： 不涉及
     * @return scheduleId
     */
    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public ScheduleVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 时间表名称 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScheduleVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 时间表描述 **取值范围**： 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ScheduleVO withRefCount(Integer refCount) {
        this.refCount = refCount;
        return this;
    }

    /**
     * **参数解释**： 引用次数 **取值范围**： 不涉及
     * @return refCount
     */
    public Integer getRefCount() {
        return refCount;
    }

    public void setRefCount(Integer refCount) {
        this.refCount = refCount;
    }

    public ScheduleVO withPeriodic(List<ScheduleVOPeriodic> periodic) {
        this.periodic = periodic;
        return this;
    }

    public ScheduleVO addPeriodicItem(ScheduleVOPeriodic periodicItem) {
        if (this.periodic == null) {
            this.periodic = new ArrayList<>();
        }
        this.periodic.add(periodicItem);
        return this;
    }

    public ScheduleVO withPeriodic(Consumer<List<ScheduleVOPeriodic>> periodicSetter) {
        if (this.periodic == null) {
            this.periodic = new ArrayList<>();
        }
        periodicSetter.accept(this.periodic);
        return this;
    }

    /**
     * **参数解释**： 周期计划 **取值范围**： 不涉及
     * @return periodic
     */
    public List<ScheduleVOPeriodic> getPeriodic() {
        return periodic;
    }

    public void setPeriodic(List<ScheduleVOPeriodic> periodic) {
        this.periodic = periodic;
    }

    public ScheduleVO withAbsolute(ScheduleVOAbsolute absolute) {
        this.absolute = absolute;
        return this;
    }

    public ScheduleVO withAbsolute(Consumer<ScheduleVOAbsolute> absoluteSetter) {
        if (this.absolute == null) {
            this.absolute = new ScheduleVOAbsolute();
            absoluteSetter.accept(this.absolute);
        }

        return this;
    }

    /**
     * Get absolute
     * @return absolute
     */
    public ScheduleVOAbsolute getAbsolute() {
        return absolute;
    }

    public void setAbsolute(ScheduleVOAbsolute absolute) {
        this.absolute = absolute;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleVO that = (ScheduleVO) obj;
        return Objects.equals(this.scheduleId, that.scheduleId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.refCount, that.refCount)
            && Objects.equals(this.periodic, that.periodic) && Objects.equals(this.absolute, that.absolute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleId, name, description, refCount, periodic, absolute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleVO {\n");
        sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    refCount: ").append(toIndentedString(refCount)).append("\n");
        sb.append("    periodic: ").append(toIndentedString(periodic)).append("\n");
        sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
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
