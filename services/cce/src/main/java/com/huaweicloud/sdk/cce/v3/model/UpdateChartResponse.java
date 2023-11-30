package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateChartResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private String values;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "translate")

    private String translate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instruction")

    private String instruction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_url")

    private String iconUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public")

    private Boolean _public;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chart_url")

    private String chartUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    public UpdateChartResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模板ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateChartResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateChartResponse withValues(String values) {
        this.values = values;
        return this;
    }

    /**
     * 模板值
     * @return values
     */
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public UpdateChartResponse withTranslate(String translate) {
        this.translate = translate;
        return this;
    }

    /**
     * 模板翻译资源
     * @return translate
     */
    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public UpdateChartResponse withInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }

    /**
     * 模板介绍
     * @return instruction
     */
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public UpdateChartResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 模板版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpdateChartResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateChartResponse withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 模板的来源
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public UpdateChartResponse withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * 模板的图标链接
     * @return iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public UpdateChartResponse withPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * 是否公开模板
     * @return _public
     */
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public UpdateChartResponse withChartUrl(String chartUrl) {
        this.chartUrl = chartUrl;
        return this;
    }

    /**
     * 模板的链接
     * @return chartUrl
     */
    public String getChartUrl() {
        return chartUrl;
    }

    public void setChartUrl(String chartUrl) {
        this.chartUrl = chartUrl;
    }

    public UpdateChartResponse withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public UpdateChartResponse withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateChartResponse that = (UpdateChartResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.values, that.values) && Objects.equals(this.translate, that.translate)
            && Objects.equals(this.instruction, that.instruction) && Objects.equals(this.version, that.version)
            && Objects.equals(this.description, that.description) && Objects.equals(this.source, that.source)
            && Objects.equals(this.iconUrl, that.iconUrl) && Objects.equals(this._public, that._public)
            && Objects.equals(this.chartUrl, that.chartUrl) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            values,
            translate,
            instruction,
            version,
            description,
            source,
            iconUrl,
            _public,
            chartUrl,
            createAt,
            updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateChartResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    translate: ").append(toIndentedString(translate)).append("\n");
        sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    chartUrl: ").append(toIndentedString(chartUrl)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
