package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskAdditionalInfo
 */
public class TaskAdditionalInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_number")

    private Integer itemNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_info")

    private Map<String, String> additionalInfo = null;

    public TaskAdditionalInfo withItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
        return this;
    }

    /**
     * 附加信息条数
     * @return itemNumber
     */
    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public TaskAdditionalInfo withAdditionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public TaskAdditionalInfo putAdditionalInfoItem(String key, String additionalInfoItem) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new HashMap<>();
        }
        this.additionalInfo.put(key, additionalInfoItem);
        return this;
    }

    public TaskAdditionalInfo withAdditionalInfo(Consumer<Map<String, String>> additionalInfoSetter) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new HashMap<>();
        }
        additionalInfoSetter.accept(this.additionalInfo);
        return this;
    }

    /**
     * 附加信息
     * @return additionalInfo
     */
    public Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskAdditionalInfo that = (TaskAdditionalInfo) obj;
        return Objects.equals(this.itemNumber, that.itemNumber)
            && Objects.equals(this.additionalInfo, that.additionalInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemNumber, additionalInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskAdditionalInfo {\n");
        sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
