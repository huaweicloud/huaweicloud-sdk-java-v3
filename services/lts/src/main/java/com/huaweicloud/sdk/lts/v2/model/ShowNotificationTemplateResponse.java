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
public class ShowNotificationTemplateResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_time")

    private Long modifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ShowNotificationTemplateResponse withName(String name) {
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

    public ShowNotificationTemplateResponse withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ShowNotificationTemplateResponse addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ShowNotificationTemplateResponse withType(Consumer<List<String>> typeSetter) {
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

    public ShowNotificationTemplateResponse withDesc(String desc) {
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

    public ShowNotificationTemplateResponse withSource(String source) {
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

    public ShowNotificationTemplateResponse withTemplates(List<SubTemplateResBody> templates) {
        this.templates = templates;
        return this;
    }

    public ShowNotificationTemplateResponse addTemplatesItem(SubTemplateResBody templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ShowNotificationTemplateResponse withTemplates(Consumer<List<SubTemplateResBody>> templatesSetter) {
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

    public ShowNotificationTemplateResponse withLocale(String locale) {
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

    public ShowNotificationTemplateResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，为毫秒时间戳
     * minimum: 0
     * maximum: 1700000000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowNotificationTemplateResponse withModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 更新时间，为毫秒时间戳
     * minimum: 0
     * maximum: 1700000000000
     * @return modifyTime
     */
    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public ShowNotificationTemplateResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，获取方式请参见：获取账号ID、项目ID、日志组ID、日志流ID（https://support.huaweicloud.com/api-lts/lts_api_0006.html）。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNotificationTemplateResponse that = (ShowNotificationTemplateResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.desc, that.desc) && Objects.equals(this.source, that.source)
            && Objects.equals(this.templates, that.templates) && Objects.equals(this.locale, that.locale)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.modifyTime, that.modifyTime)
            && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, desc, source, templates, locale, createTime, modifyTime, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNotificationTemplateResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
