package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRuleReq
 */
public class CreateRuleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_content")

    private String layoutContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_id")

    private String pluginId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private List<RuleContent> content = null;

    public CreateRuleReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 创建规则的类型。 **约束限制**： 不涉及。 **取值范围**： - Build。 - Gate。 - Deploy。 - Test。 - Normal。 **默认取值**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateRuleReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 规则名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRuleReq withLayoutContent(String layoutContent) {
        this.layoutContent = layoutContent;
        return this;
    }

    /**
     * **参数解释**： 布局内容。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return layoutContent
     */
    public String getLayoutContent() {
        return layoutContent;
    }

    public void setLayoutContent(String layoutContent) {
        this.layoutContent = layoutContent;
    }

    public CreateRuleReq withPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }

    /**
     * **参数解释**： 扩展插件唯一ID。可以通过[查询插件版本详情](ShowPluginVersion.xml)接口，获取响应参数中unique_id。 **约束限制**： 不涉及。 **取值范围**： 32位字符，由数字和字母组成。 **默认取值**： 不涉及。 
     * @return pluginId
     */
    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public CreateRuleReq withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * **参数解释**： 扩展插件名称。 **约束限制**： 仅支持输入大小写英文字母、数字、'-'、'_'。 **取值范围**： 1到50位字符。 **默认取值**： 不涉及。 
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public CreateRuleReq withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * **参数解释**： 插件版本号。 **约束限制**： 必须是类似 x.xx.xx 的格式，其中：x 是 1 到 2 位的数字（范围 0 到 99）。xx 是点后跟随的数字部分，且每部分可以是 1 位或 2 位数字。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public CreateRuleReq withContent(List<RuleContent> content) {
        this.content = content;
        return this;
    }

    public CreateRuleReq addContentItem(RuleContent contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public CreateRuleReq withContent(Consumer<List<RuleContent>> contentSetter) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /**
     * **参数解释**： 规则属性分组列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return content
     */
    public List<RuleContent> getContent() {
        return content;
    }

    public void setContent(List<RuleContent> content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRuleReq that = (CreateRuleReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name)
            && Objects.equals(this.layoutContent, that.layoutContent) && Objects.equals(this.pluginId, that.pluginId)
            && Objects.equals(this.pluginName, that.pluginName)
            && Objects.equals(this.pluginVersion, that.pluginVersion) && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, layoutContent, pluginId, pluginName, pluginVersion, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRuleReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    layoutContent: ").append(toIndentedString(layoutContent)).append("\n");
        sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
