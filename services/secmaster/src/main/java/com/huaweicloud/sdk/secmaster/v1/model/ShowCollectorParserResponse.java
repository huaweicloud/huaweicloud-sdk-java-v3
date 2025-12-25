package com.huaweicloud.sdk.secmaster.v1.model;

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
public class ShowCollectorParserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_refer_count")

    private Long channelReferCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules")

    private List<ShowModuleVo> modules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parser_id")

    private String parserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    public ShowCollectorParserResponse withChannelReferCount(Long channelReferCount) {
        this.channelReferCount = channelReferCount;
        return this;
    }

    /**
     * 数值
     * minimum: 1
     * maximum: 1024
     * @return channelReferCount
     */
    public Long getChannelReferCount() {
        return channelReferCount;
    }

    public void setChannelReferCount(Long channelReferCount) {
        this.channelReferCount = channelReferCount;
    }

    public ShowCollectorParserResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowCollectorParserResponse withModules(List<ShowModuleVo> modules) {
        this.modules = modules;
        return this;
    }

    public ShowCollectorParserResponse addModulesItem(ShowModuleVo modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    public ShowCollectorParserResponse withModules(Consumer<List<ShowModuleVo>> modulesSetter) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        modulesSetter.accept(this.modules);
        return this;
    }

    /**
     * 相关描述信息
     * @return modules
     */
    public List<ShowModuleVo> getModules() {
        return modules;
    }

    public void setModules(List<ShowModuleVo> modules) {
        this.modules = modules;
    }

    public ShowCollectorParserResponse withParserId(String parserId) {
        this.parserId = parserId;
        return this;
    }

    /**
     * UUID
     * @return parserId
     */
    public String getParserId() {
        return parserId;
    }

    public void setParserId(String parserId) {
        this.parserId = parserId;
    }

    public ShowCollectorParserResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 相关标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCollectorParserResponse that = (ShowCollectorParserResponse) obj;
        return Objects.equals(this.channelReferCount, that.channelReferCount)
            && Objects.equals(this.description, that.description) && Objects.equals(this.modules, that.modules)
            && Objects.equals(this.parserId, that.parserId) && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelReferCount, description, modules, parserId, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCollectorParserResponse {\n");
        sb.append("    channelReferCount: ").append(toIndentedString(channelReferCount)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
        sb.append("    parserId: ").append(toIndentedString(parserId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
