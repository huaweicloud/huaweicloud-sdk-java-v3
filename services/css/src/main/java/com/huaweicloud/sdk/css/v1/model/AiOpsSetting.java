package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AiOpsSetting
 */
public class AiOpsSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_items")

    private List<String> checkItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    public AiOpsSetting withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * **参数解释**： 检测类型。 **约束限制**： 不涉及 **取值范围**： - full_detection：  全量检测项。 - unavailability_detection： 集群不可用检测项。 - partial_detection： 全量检测项中选取其中部分检测项进行检测，具体检测项需要设置check_items。 **默认取值**： 不涉及
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public AiOpsSetting withCheckItems(List<String> checkItems) {
        this.checkItems = checkItems;
        return this;
    }

    public AiOpsSetting addCheckItemsItem(String checkItemsItem) {
        if (this.checkItems == null) {
            this.checkItems = new ArrayList<>();
        }
        this.checkItems.add(checkItemsItem);
        return this;
    }

    public AiOpsSetting withCheckItems(Consumer<List<String>> checkItemsSetter) {
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

    public AiOpsSetting withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * **参数解释**： 智能运维自动检测时间，格式为时间加时区，例如：\"00:00 GMT+08:00\"。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiOpsSetting that = (AiOpsSetting) obj;
        return Objects.equals(this.checkType, that.checkType) && Objects.equals(this.checkItems, that.checkItems)
            && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkType, checkItems, period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiOpsSetting {\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    checkItems: ").append(toIndentedString(checkItems)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
