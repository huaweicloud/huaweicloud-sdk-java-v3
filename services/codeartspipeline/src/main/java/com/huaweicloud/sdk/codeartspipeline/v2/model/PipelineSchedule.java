package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PipelineSchedule
 */
public class PipelineSchedule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "days_of_week")

    private List<Integer> daysOfWeek = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    public PipelineSchedule withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * **参数解释**： 定时任务ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public PipelineSchedule withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 任务类型。 **约束限制**： 不涉及。 **取值范围**： 只支持fixed。 **默认取值**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PipelineSchedule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 任务名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineSchedule withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**： 是否启用。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public PipelineSchedule withDaysOfWeek(List<Integer> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    public PipelineSchedule addDaysOfWeekItem(Integer daysOfWeekItem) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        this.daysOfWeek.add(daysOfWeekItem);
        return this;
    }

    public PipelineSchedule withDaysOfWeek(Consumer<List<Integer>> daysOfWeekSetter) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        daysOfWeekSetter.accept(this.daysOfWeek);
        return this;
    }

    /**
     * **参数解释**： 一周内具体执行日。周日至周六对应1-7。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return daysOfWeek
     */
    public List<Integer> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(List<Integer> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public PipelineSchedule withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * **参数解释**： 时区。 **约束限制**： 不涉及。 **取值范围**： - \"China Standard Time\"。 - \"GMT Standard Time\"。 - \"South Africa Standard Time\"。 - \"Russian Standard Time\"。 - \"SE Asia Standard Time\"。  - \"Singapore Standard Time\"。 - \"Pacific SA Standard Time\"。 - \"E. South America Standard Time\"。  - \"Central Standard Time (Mexico)\"。 - \"Egypt Standard Time\"。 - \"Saudi Arabia Standard Time\"。 **默认取值**： 不涉及。 
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineSchedule that = (PipelineSchedule) obj;
        return Objects.equals(this.uuid, that.uuid) && Objects.equals(this.type, that.type)
            && Objects.equals(this.name, that.name) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.daysOfWeek, that.daysOfWeek) && Objects.equals(this.timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, type, name, enable, daysOfWeek, timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineSchedule {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
