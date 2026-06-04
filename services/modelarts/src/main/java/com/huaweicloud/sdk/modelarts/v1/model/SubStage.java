package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 作业流程阶段信息列表的子阶段元信息。
 */
public class SubStage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_message")

    private String enMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh_message")

    private String zhMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public SubStage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：子阶段名称。  **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubStage withEnMessage(String enMessage) {
        this.enMessage = enMessage;
        return this;
    }

    /**
     * **参数解释**：子阶段英文描述信息。  **取值范围**：不涉及。
     * @return enMessage
     */
    public String getEnMessage() {
        return enMessage;
    }

    public void setEnMessage(String enMessage) {
        this.enMessage = enMessage;
    }

    public SubStage withZhMessage(String zhMessage) {
        this.zhMessage = zhMessage;
        return this;
    }

    /**
     * **参数解释**：子阶段中文描述信息。  **取值范围**：不涉及。
     * @return zhMessage
     */
    public String getZhMessage() {
        return zhMessage;
    }

    public void setZhMessage(String zhMessage) {
        this.zhMessage = zhMessage;
    }

    public SubStage withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：子阶段开始时间。  **取值范围**：不涉及。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubStage that = (SubStage) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.enMessage, that.enMessage)
            && Objects.equals(this.zhMessage, that.zhMessage) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enMessage, zhMessage, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubStage {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enMessage: ").append(toIndentedString(enMessage)).append("\n");
        sb.append("    zhMessage: ").append(toIndentedString(zhMessage)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
