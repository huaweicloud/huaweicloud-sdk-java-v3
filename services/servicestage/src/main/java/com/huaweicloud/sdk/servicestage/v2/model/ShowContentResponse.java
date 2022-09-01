package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowContentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    @JacksonXmlProperty(localName = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha")

    @JacksonXmlProperty(localName = "sha")

    private String sha;

    /**
     * 编码方式：base64或者text/plain。
     */
    public static final class EncodingEnum {

        /**
         * Enum BASE64 for value: "base64"
         */
        public static final EncodingEnum BASE64 = new EncodingEnum("base64");

        /**
         * Enum TEXT_PLAIN for value: "text/plain"
         */
        public static final EncodingEnum TEXT_PLAIN = new EncodingEnum("text/plain");

        private static final Map<String, EncodingEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncodingEnum> createStaticFields() {
            Map<String, EncodingEnum> map = new HashMap<>();
            map.put("base64", BASE64);
            map.put("text/plain", TEXT_PLAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncodingEnum(String value) {
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
        public static EncodingEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EncodingEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EncodingEnum(value);
            }
            return result;
        }

        public static EncodingEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EncodingEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncodingEnum) {
                return this.value.equals(((EncodingEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding")

    @JacksonXmlProperty(localName = "encoding")

    private EncodingEnum encoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    @JacksonXmlProperty(localName = "content")

    private String content;

    public ShowContentResponse withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 文件路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowContentResponse withSha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * commit 哈希。
     * @return sha
     */
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public ShowContentResponse withEncoding(EncodingEnum encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * 编码方式：base64或者text/plain。
     * @return encoding
     */
    public EncodingEnum getEncoding() {
        return encoding;
    }

    public void setEncoding(EncodingEnum encoding) {
        this.encoding = encoding;
    }

    public ShowContentResponse withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 文件内容。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowContentResponse showContentResponse = (ShowContentResponse) o;
        return Objects.equals(this.path, showContentResponse.path) && Objects.equals(this.sha, showContentResponse.sha)
            && Objects.equals(this.encoding, showContentResponse.encoding)
            && Objects.equals(this.content, showContentResponse.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, sha, encoding, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowContentResponse {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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
