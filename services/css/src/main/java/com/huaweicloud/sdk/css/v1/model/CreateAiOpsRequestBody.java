package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAiOpsRequestBody
 */
public class CreateAiOpsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_items")

    private List<String> checkItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm")

    private CreateAiOpsRequestBodyAlarm alarm;

    public CreateAiOpsRequestBody withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * **参数解释**： 检测类型 **约束限制**： 不涉及 **取值范围**： - full_detection  全量检测项 - unavailability_detection 集群不可用检测项 - partial_detection 全量检测项中选取其中部分检测项进行检测，具体检测项需要设置check_items  **默认取值**： 不涉及
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public CreateAiOpsRequestBody withCheckItems(List<String> checkItems) {
        this.checkItems = checkItems;
        return this;
    }

    public CreateAiOpsRequestBody addCheckItemsItem(String checkItemsItem) {
        if (this.checkItems == null) {
            this.checkItems = new ArrayList<>();
        }
        this.checkItems.add(checkItemsItem);
        return this;
    }

    public CreateAiOpsRequestBody withCheckItems(Consumer<List<String>> checkItemsSetter) {
        if (this.checkItems == null) {
            this.checkItems = new ArrayList<>();
        }
        checkItemsSetter.accept(this.checkItems);
        return this;
    }

    /**
     * **参数解释**： 全量检测项中选取其中部分检测项进行检测，输入检测项列表。 **约束限制**： 当check_type为partial_detection时有效 **取值范围**： 通过智能运维ShowAiOpsDetector获取最新支持的检测项，输入检测项id字符串列表 **默认取值**： 不涉及
     * @return checkItems
     */
    public List<String> getCheckItems() {
        return checkItems;
    }

    public void setCheckItems(List<String> checkItems) {
        this.checkItems = checkItems;
    }

    public CreateAiOpsRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 检测报告名称，支持自定义检测名。 **约束限制**： 不涉及 **取值范围**： 4～64个字符，只能包含数字、字母、中划线和下划线，且必须以字母开头。 **默认取值**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAiOpsRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 检测报告描述，支持自定义检测描述 **约束限制**： 不涉及 **取值范围**： 0~255个字符 **默认取值**： 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAiOpsRequestBody withAlarm(CreateAiOpsRequestBodyAlarm alarm) {
        this.alarm = alarm;
        return this;
    }

    public CreateAiOpsRequestBody withAlarm(Consumer<CreateAiOpsRequestBodyAlarm> alarmSetter) {
        if (this.alarm == null) {
            this.alarm = new CreateAiOpsRequestBodyAlarm();
            alarmSetter.accept(this.alarm);
        }

        return this;
    }

    /**
     * Get alarm
     * @return alarm
     */
    public CreateAiOpsRequestBodyAlarm getAlarm() {
        return alarm;
    }

    public void setAlarm(CreateAiOpsRequestBodyAlarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAiOpsRequestBody that = (CreateAiOpsRequestBody) obj;
        return Objects.equals(this.checkType, that.checkType) && Objects.equals(this.checkItems, that.checkItems)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.alarm, that.alarm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkType, checkItems, name, description, alarm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAiOpsRequestBody {\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    checkItems: ").append(toIndentedString(checkItems)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
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
