package com.huaweicloud.sdk.lts.v2.model;

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
public class UpdateNotificationTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<SubTemplateResBody> templates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private String locale;

    public UpdateNotificationTemplateResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：**  消息模板名称。 **取值范围：**  不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateNotificationTemplateResponse withType(List<String> type) {
        this.type = type;
        return this;
    }

    public UpdateNotificationTemplateResponse addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public UpdateNotificationTemplateResponse withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * **参数解释：**  消息通知方式。 **取值范围：**  - sms - dingding - wechat - webhook - email - voice - feishu - welink
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public UpdateNotificationTemplateResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * **参数解释：**  消息模板描述。 **取值范围：**  不涉及。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public UpdateNotificationTemplateResponse withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释：**  消息模板来源。 **取值范围：**  不涉及。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public UpdateNotificationTemplateResponse withTemplates(List<SubTemplateResBody> templates) {
        this.templates = templates;
        return this;
    }

    public UpdateNotificationTemplateResponse addTemplatesItem(SubTemplateResBody templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public UpdateNotificationTemplateResponse withTemplates(Consumer<List<SubTemplateResBody>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * **参数解释：**  不同通知渠道下消息模板的详细信息。
     * @return templates
     */
    public List<SubTemplateResBody> getTemplates() {
        return templates;
    }

    public void setTemplates(List<SubTemplateResBody> templates) {
        this.templates = templates;
    }

    public UpdateNotificationTemplateResponse withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * **参数解释：**  消息头语言，系统在发送消息时会默认添加消息头，中文如：“尊敬的用户...”；英文如：“Dear User...”。 **取值范围：**  - zh-cn - en-us
     * @return locale
     */
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNotificationTemplateResponse that = (UpdateNotificationTemplateResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.desc, that.desc) && Objects.equals(this.source, that.source)
            && Objects.equals(this.templates, that.templates) && Objects.equals(this.locale, that.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, desc, source, templates, locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNotificationTemplateResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
