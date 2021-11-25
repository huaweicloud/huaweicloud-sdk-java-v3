package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
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

    /** 语言，必填，目前可填zh-cn和en-us */
    public static final class LocaleEnum {

        /** Enum ZH_CN for value: "zh-cn" */
        public static final LocaleEnum ZH_CN = new LocaleEnum("zh-cn");

        /** Enum EN_US for value: "en-us" */
        public static final LocaleEnum EN_US = new LocaleEnum("en-us");

        private static final Map<String, LocaleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocaleEnum> createStaticFields() {
            Map<String, LocaleEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocaleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LocaleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LocaleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LocaleEnum(value);
            }
            return result;
        }

        public static LocaleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LocaleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LocaleEnum) {
                return this.value.equals(((LocaleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private LocaleEnum locale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<SubTemplate> templates = null;

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

    /** 通知规则名称，必填，只含有汉字、数字、字母、下划线、中划线，不能以下划线等特殊符号开头和结尾，长度为 1 - 100，创建后不可修改
     * 
     * @return name */
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

    /** 保留字段，非必填，只支持sms（短信），dingding（钉钉），wechat（企业微信），email（邮件）和webhook（网络钩子）
     * 
     * @return type */
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

    /** 模板描述，必填，只含有汉字、数字、字母、下划线不能以下划线开头和结尾，长度为0--1024
     * 
     * @return desc */
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

    /** 模板来源，目前必填为LTS，否则会筛选不出来
     * 
     * @return source */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ShowNotificationTemplateResponse withLocale(LocaleEnum locale) {
        this.locale = locale;
        return this;
    }

    /** 语言，必填，目前可填zh-cn和en-us
     * 
     * @return locale */
    public LocaleEnum getLocale() {
        return locale;
    }

    public void setLocale(LocaleEnum locale) {
        this.locale = locale;
    }

    public ShowNotificationTemplateResponse withTemplates(List<SubTemplate> templates) {
        this.templates = templates;
        return this;
    }

    public ShowNotificationTemplateResponse addTemplatesItem(SubTemplate templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ShowNotificationTemplateResponse withTemplates(Consumer<List<SubTemplate>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /** 模板正文，为一个数组
     * 
     * @return templates */
    public List<SubTemplate> getTemplates() {
        return templates;
    }

    public void setTemplates(List<SubTemplate> templates) {
        this.templates = templates;
    }

    public ShowNotificationTemplateResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间，为毫秒时间戳 minimum: 0 maximum: 1700000000000
     * 
     * @return createTime */
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

    /** 更新时间，为毫秒时间戳 minimum: 0 maximum: 1700000000000
     * 
     * @return modifyTime */
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

    /** 项目ID，获取方式请参见：获取账号ID、项目ID、日志组ID、日志流ID（https://support.huaweicloud.com/api-lts/lts_api_0006.html）。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNotificationTemplateResponse showNotificationTemplateResponse = (ShowNotificationTemplateResponse) o;
        return Objects.equals(this.name, showNotificationTemplateResponse.name)
            && Objects.equals(this.type, showNotificationTemplateResponse.type)
            && Objects.equals(this.desc, showNotificationTemplateResponse.desc)
            && Objects.equals(this.source, showNotificationTemplateResponse.source)
            && Objects.equals(this.locale, showNotificationTemplateResponse.locale)
            && Objects.equals(this.templates, showNotificationTemplateResponse.templates)
            && Objects.equals(this.createTime, showNotificationTemplateResponse.createTime)
            && Objects.equals(this.modifyTime, showNotificationTemplateResponse.modifyTime)
            && Objects.equals(this.projectId, showNotificationTemplateResponse.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, desc, source, locale, templates, createTime, modifyTime, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNotificationTemplateResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
