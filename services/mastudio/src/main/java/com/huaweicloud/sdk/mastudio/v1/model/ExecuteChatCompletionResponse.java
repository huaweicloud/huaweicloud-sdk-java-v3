package com.huaweicloud.sdk.mastudio.v1.model;

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
public class ExecuteChatCompletionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private Integer created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "choices")

    private List<ChatChoice> choices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private CompletionUsage usage;

    public ExecuteChatCompletionResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 响应ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExecuteChatCompletionResponse withCreated(Integer created) {
        this.created = created;
        return this;
    }

    /**
     * 响应时间
     * @return created
     */
    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public ExecuteChatCompletionResponse withChoices(List<ChatChoice> choices) {
        this.choices = choices;
        return this;
    }

    public ExecuteChatCompletionResponse addChoicesItem(ChatChoice choicesItem) {
        if (this.choices == null) {
            this.choices = new ArrayList<>();
        }
        this.choices.add(choicesItem);
        return this;
    }

    public ExecuteChatCompletionResponse withChoices(Consumer<List<ChatChoice>> choicesSetter) {
        if (this.choices == null) {
            this.choices = new ArrayList<>();
        }
        choicesSetter.accept(this.choices);
        return this;
    }

    /**
     * 模型回复
     * @return choices
     */
    public List<ChatChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<ChatChoice> choices) {
        this.choices = choices;
    }

    public ExecuteChatCompletionResponse withUsage(CompletionUsage usage) {
        this.usage = usage;
        return this;
    }

    public ExecuteChatCompletionResponse withUsage(Consumer<CompletionUsage> usageSetter) {
        if (this.usage == null) {
            this.usage = new CompletionUsage();
            usageSetter.accept(this.usage);
        }

        return this;
    }

    /**
     * Get usage
     * @return usage
     */
    public CompletionUsage getUsage() {
        return usage;
    }

    public void setUsage(CompletionUsage usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteChatCompletionResponse that = (ExecuteChatCompletionResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.created, that.created)
            && Objects.equals(this.choices, that.choices) && Objects.equals(this.usage, that.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, created, choices, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteChatCompletionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
