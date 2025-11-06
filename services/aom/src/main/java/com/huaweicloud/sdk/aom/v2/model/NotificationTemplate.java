package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 消息通知模板列表。
 */
public class NotificationTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private String locale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_time")

    private Long modifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private String templates;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    public NotificationTemplate withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 消息通知模板创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public NotificationTemplate withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 消息通知模板描述。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public NotificationTemplate withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 消息通知模板所属企业项目id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public NotificationTemplate withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * 消息通知模板语言。
     * @return locale
     */
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public NotificationTemplate withModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 消息通知模板修改时间。
     * @return modifyTime
     */
    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public NotificationTemplate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 消息通知模板名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NotificationTemplate withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 消息通知模板所属项目id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public NotificationTemplate withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 消息通知模板来源。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public NotificationTemplate withTemplates(String templates) {
        this.templates = templates;
        return this;
    }

    /**
     * 消息通知模板内容。 消息通知模板内容为json字符串，具体内容是由下列参数拼接成json数组后转义而来。  | 名称 |是否必选  |参数类型  |说明  | |--|--|--|--| |content  |是  |string  |消息模板内容。|  |subType  |是  |string  |消息模板发送类型，支持：email，sms，webhook。| | topic | 否 | string |邮件主题。| | sendType |否  |string  |当消息模板发送类型为“webhook”时需要指定消息模板格式，支持：HTML、JSON。  | | version |是  |string  |默认为v2。 |
     * @return templates
     */
    public String getTemplates() {
        return templates;
    }

    public void setTemplates(String templates) {
        this.templates = templates;
    }

    public NotificationTemplate withType(List<String> type) {
        this.type = type;
        return this;
    }

    public NotificationTemplate addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public NotificationTemplate withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 消息通知方式。
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotificationTemplate that = (NotificationTemplate) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.locale, that.locale) && Objects.equals(this.modifyTime, that.modifyTime)
            && Objects.equals(this.name, that.name) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.source, that.source) && Objects.equals(this.templates, that.templates)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(createTime, desc, enterpriseProjectId, locale, modifyTime, name, projectId, source, templates, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationTemplate {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
