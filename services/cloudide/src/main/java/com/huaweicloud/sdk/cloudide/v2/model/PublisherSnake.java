package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PublisherSnake
 */
public class PublisherSnake {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_id")

    private String publisherId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_name")

    private String publisherName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    /**
     * 插件作者状态 - DISABLED 验证不通过 - VERIFIED 验证通过
     */
    public static final class PublisherStatusEnum {

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final PublisherStatusEnum DISABLED = new PublisherStatusEnum("DISABLED");

        /**
         * Enum VERIFIED for value: "VERIFIED"
         */
        public static final PublisherStatusEnum VERIFIED = new PublisherStatusEnum("VERIFIED");

        private static final Map<String, PublisherStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PublisherStatusEnum> createStaticFields() {
            Map<String, PublisherStatusEnum> map = new HashMap<>();
            map.put("DISABLED", DISABLED);
            map.put("VERIFIED", VERIFIED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PublisherStatusEnum(String value) {
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
        public static PublisherStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PublisherStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PublisherStatusEnum(value);
            }
            return result;
        }

        public static PublisherStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PublisherStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PublisherStatusEnum) {
                return this.value.equals(((PublisherStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_status")

    private PublisherStatusEnum publisherStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open")

    private Boolean open;

    public PublisherSnake withPublisherId(String publisherId) {
        this.publisherId = publisherId;
        return this;
    }

    /**
     * 发布者id
     * @return publisherId
     */
    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public PublisherSnake withPublisherName(String publisherName) {
        this.publisherName = publisherName;
        return this;
    }

    /**
     * 发布者名称
     * @return publisherName
     */
    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public PublisherSnake withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 发布者展示名
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public PublisherSnake withPublisherStatus(PublisherStatusEnum publisherStatus) {
        this.publisherStatus = publisherStatus;
        return this;
    }

    /**
     * 插件作者状态 - DISABLED 验证不通过 - VERIFIED 验证通过
     * @return publisherStatus
     */
    public PublisherStatusEnum getPublisherStatus() {
        return publisherStatus;
    }

    public void setPublisherStatus(PublisherStatusEnum publisherStatus) {
        this.publisherStatus = publisherStatus;
    }

    public PublisherSnake withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 发布者邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PublisherSnake withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 网页url
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public PublisherSnake withOpen(Boolean open) {
        this.open = open;
        return this;
    }

    /**
     * 是否开源
     * @return open
     */
    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublisherSnake publisherSnake = (PublisherSnake) o;
        return Objects.equals(this.publisherId, publisherSnake.publisherId)
            && Objects.equals(this.publisherName, publisherSnake.publisherName)
            && Objects.equals(this.displayName, publisherSnake.displayName)
            && Objects.equals(this.publisherStatus, publisherSnake.publisherStatus)
            && Objects.equals(this.email, publisherSnake.email) && Objects.equals(this.webUrl, publisherSnake.webUrl)
            && Objects.equals(this.open, publisherSnake.open);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherId, publisherName, displayName, publisherStatus, email, webUrl, open);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublisherSnake {\n");
        sb.append("    publisherId: ").append(toIndentedString(publisherId)).append("\n");
        sb.append("    publisherName: ").append(toIndentedString(publisherName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    publisherStatus: ").append(toIndentedString(publisherStatus)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    open: ").append(toIndentedString(open)).append("\n");
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
