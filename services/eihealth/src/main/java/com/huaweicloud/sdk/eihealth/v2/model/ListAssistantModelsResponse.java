package com.huaweicloud.sdk.eihealth.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAssistantModelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assistant_models")

    private List<AssistantModel> assistantModels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAssistantModelsResponse withAssistantModels(List<AssistantModel> assistantModels) {
        this.assistantModels = assistantModels;
        return this;
    }

    public ListAssistantModelsResponse addAssistantModelsItem(AssistantModel assistantModelsItem) {
        if (this.assistantModels == null) {
            this.assistantModels = new ArrayList<>();
        }
        this.assistantModels.add(assistantModelsItem);
        return this;
    }

    public ListAssistantModelsResponse withAssistantModels(Consumer<List<AssistantModel>> assistantModelsSetter) {
        if (this.assistantModels == null) {
            this.assistantModels = new ArrayList<>();
        }
        assistantModelsSetter.accept(this.assistantModels);
        return this;
    }

    /**
     * **参数解释**： 供应商模型列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assistantModels
     */
    public List<AssistantModel> getAssistantModels() {
        return assistantModels;
    }

    public void setAssistantModels(List<AssistantModel> assistantModels) {
        this.assistantModels = assistantModels;
    }

    public ListAssistantModelsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 供应商模型个数。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAssistantModelsResponse that = (ListAssistantModelsResponse) obj;
        return Objects.equals(this.assistantModels, that.assistantModels) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assistantModels, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssistantModelsResponse {\n");
        sb.append("    assistantModels: ").append(toIndentedString(assistantModels)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
