package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 结构化模板简略对象 */
public class BriefStructTemplateModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    /** 结构化类型，当前支持regex,json,split,nginx */
    public static final class TemplateTypeEnum {

        /** Enum REGEX for value: "regex" */
        public static final TemplateTypeEnum REGEX = new TemplateTypeEnum("regex");

        /** Enum JSON for value: "json" */
        public static final TemplateTypeEnum JSON = new TemplateTypeEnum("json");

        /** Enum SPLIT for value: "split" */
        public static final TemplateTypeEnum SPLIT = new TemplateTypeEnum("split");

        /** Enum NGINX for value: "nginx" */
        public static final TemplateTypeEnum NGINX = new TemplateTypeEnum("nginx");

        private static final Map<String, TemplateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TemplateTypeEnum> createStaticFields() {
            Map<String, TemplateTypeEnum> map = new HashMap<>();
            map.put("regex", REGEX);
            map.put("json", JSON);
            map.put("split", SPLIT);
            map.put("nginx", NGINX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TemplateTypeEnum(String value) {
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
        public static TemplateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TemplateTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TemplateTypeEnum(value);
            }
            return result;
        }

        public static TemplateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TemplateTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TemplateTypeEnum) {
                return this.value.equals(((TemplateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private TemplateTypeEnum templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public BriefStructTemplateModel withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 模板创建/更新时间 minimum: 0 maximum: 20000000000000
     * 
     * @return createTime */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BriefStructTemplateModel withId(String id) {
        this.id = id;
        return this;
    }

    /** 模板id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BriefStructTemplateModel withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /** 模板名称
     * 
     * @return templateName */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public BriefStructTemplateModel withTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
        return this;
    }

    /** 结构化类型，当前支持regex,json,split,nginx
     * 
     * @return templateType */
    public TemplateTypeEnum getTemplateType() {
        return templateType;
    }

    public void setTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
    }

    public BriefStructTemplateModel withProjectId(String projectId) {
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
        BriefStructTemplateModel briefStructTemplateModel = (BriefStructTemplateModel) o;
        return Objects.equals(this.createTime, briefStructTemplateModel.createTime)
            && Objects.equals(this.id, briefStructTemplateModel.id)
            && Objects.equals(this.templateName, briefStructTemplateModel.templateName)
            && Objects.equals(this.templateType, briefStructTemplateModel.templateType)
            && Objects.equals(this.projectId, briefStructTemplateModel.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, id, templateName, templateType, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BriefStructTemplateModel {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
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
