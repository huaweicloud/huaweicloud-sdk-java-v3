package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ScheduleInfoDTO
 */
public class ScheduleInfoDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodic")

    private List<ScheduleInfoDTOPeriodic> periodic = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "absolute")

    private ScheduleInfoDTOAbsolute absolute;

    public ScheduleInfoDTO withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释**： 防护对象ID，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public ScheduleInfoDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 时间表名称 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScheduleInfoDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 时间表描述 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ScheduleInfoDTO withPeriodic(List<ScheduleInfoDTOPeriodic> periodic) {
        this.periodic = periodic;
        return this;
    }

    public ScheduleInfoDTO addPeriodicItem(ScheduleInfoDTOPeriodic periodicItem) {
        if (this.periodic == null) {
            this.periodic = new ArrayList<>();
        }
        this.periodic.add(periodicItem);
        return this;
    }

    public ScheduleInfoDTO withPeriodic(Consumer<List<ScheduleInfoDTOPeriodic>> periodicSetter) {
        if (this.periodic == null) {
            this.periodic = new ArrayList<>();
        }
        periodicSetter.accept(this.periodic);
        return this;
    }

    /**
     * **参数解释**： 周期计划 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return periodic
     */
    public List<ScheduleInfoDTOPeriodic> getPeriodic() {
        return periodic;
    }

    public void setPeriodic(List<ScheduleInfoDTOPeriodic> periodic) {
        this.periodic = periodic;
    }

    public ScheduleInfoDTO withAbsolute(ScheduleInfoDTOAbsolute absolute) {
        this.absolute = absolute;
        return this;
    }

    public ScheduleInfoDTO withAbsolute(Consumer<ScheduleInfoDTOAbsolute> absoluteSetter) {
        if (this.absolute == null) {
            this.absolute = new ScheduleInfoDTOAbsolute();
            absoluteSetter.accept(this.absolute);
        }

        return this;
    }

    /**
     * Get absolute
     * @return absolute
     */
    public ScheduleInfoDTOAbsolute getAbsolute() {
        return absolute;
    }

    public void setAbsolute(ScheduleInfoDTOAbsolute absolute) {
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
        ScheduleInfoDTO that = (ScheduleInfoDTO) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.periodic, that.periodic)
            && Objects.equals(this.absolute, that.absolute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, name, description, periodic, absolute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleInfoDTO {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
