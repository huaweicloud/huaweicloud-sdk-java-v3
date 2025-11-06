package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 只支持修改，desc，local，templates。
 */
public class UpdateNotificationTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private String locale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private String templates;

    public UpdateNotificationTemplate withDesc(String desc) {
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

    public UpdateNotificationTemplate withLocale(String locale) {
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

    public UpdateNotificationTemplate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 消息通知模板名称。通知消息模板名称无法修改
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateNotificationTemplate withTemplates(String templates) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNotificationTemplate that = (UpdateNotificationTemplate) obj;
        return Objects.equals(this.desc, that.desc) && Objects.equals(this.locale, that.locale)
            && Objects.equals(this.name, that.name) && Objects.equals(this.templates, that.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desc, locale, name, templates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNotificationTemplate {\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
