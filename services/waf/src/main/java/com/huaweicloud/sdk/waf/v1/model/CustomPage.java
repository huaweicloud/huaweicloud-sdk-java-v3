package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 自定义告警页面
 */
public class CustomPage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    /**
     * **参数解释：** “自定义”告警页面内容类型 **约束限制：** 不涉及 **取值范围：**  - text/html  - text/xml  - application/json  **默认取值：** 不涉及
     */
    public static final class ContentTypeEnum {

        /**
         * Enum TEXT_HTML for value: "text/html"
         */
        public static final ContentTypeEnum TEXT_HTML = new ContentTypeEnum("text/html");

        /**
         * Enum TEXT_XML for value: "text/xml"
         */
        public static final ContentTypeEnum TEXT_XML = new ContentTypeEnum("text/xml");

        /**
         * Enum APPLICATION_JSON for value: "application/json"
         */
        public static final ContentTypeEnum APPLICATION_JSON = new ContentTypeEnum("application/json");

        private static final Map<String, ContentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ContentTypeEnum> createStaticFields() {
            Map<String, ContentTypeEnum> map = new HashMap<>();
            map.put("text/html", TEXT_HTML);
            map.put("text/xml", TEXT_XML);
            map.put("application/json", APPLICATION_JSON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ContentTypeEnum(String value) {
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
        public static ContentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ContentTypeEnum(value));
        }

        public static ContentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ContentTypeEnum) {
                return this.value.equals(((ContentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private ContentTypeEnum contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    public CustomPage withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 返回状态码
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public CustomPage withContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * **参数解释：** “自定义”告警页面内容类型 **约束限制：** 不涉及 **取值范围：**  - text/html  - text/xml  - application/json  **默认取值：** 不涉及
     * @return contentType
     */
    public ContentTypeEnum getContentType() {
        return contentType;
    }

    public void setContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
    }

    public CustomPage withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 根据选择的“页面类型”配置对应的页面内容，具体示例可以参考“Web应用防火墙 WAF”用户手册
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
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
        CustomPage that = (CustomPage) obj;
        return Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.contentType, that.contentType)
            && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, contentType, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomPage {\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
