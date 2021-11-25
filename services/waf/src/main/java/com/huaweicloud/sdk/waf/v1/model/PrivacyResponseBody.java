package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 隐私屏蔽响应体 */
public class PrivacyResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /** 屏蔽字段 */
    public static final class CategoryEnum {

        /** Enum PARAMS for value: "params" */
        public static final CategoryEnum PARAMS = new CategoryEnum("params");

        /** Enum COOKIE for value: "cookie" */
        public static final CategoryEnum COOKIE = new CategoryEnum("cookie");

        /** Enum HEADER for value: "header" */
        public static final CategoryEnum HEADER = new CategoryEnum("header");

        /** Enum FORM for value: "form" */
        public static final CategoryEnum FORM = new CategoryEnum("form");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("params", PARAMS);
            map.put("cookie", COOKIE);
            map.put("header", HEADER);
            map.put("form", FORM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CategoryEnum(value);
            }
            return result;
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private String index;

    public PrivacyResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /** 规则id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PrivacyResponseBody withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /** 策略id
     * 
     * @return policyid */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public PrivacyResponseBody withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /** 创建规则的时间，格式为13位毫秒时间戳
     * 
     * @return timestamp */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public PrivacyResponseBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 规则状态，0：关闭，1：开启
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public PrivacyResponseBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 隐私屏蔽规则应用的url
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PrivacyResponseBody withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /** 屏蔽字段
     * 
     * @return category */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public PrivacyResponseBody withIndex(String index) {
        this.index = index;
        return this;
    }

    /** 屏蔽字段名
     * 
     * @return index */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivacyResponseBody privacyResponseBody = (PrivacyResponseBody) o;
        return Objects.equals(this.id, privacyResponseBody.id)
            && Objects.equals(this.policyid, privacyResponseBody.policyid)
            && Objects.equals(this.timestamp, privacyResponseBody.timestamp)
            && Objects.equals(this.status, privacyResponseBody.status)
            && Objects.equals(this.url, privacyResponseBody.url)
            && Objects.equals(this.category, privacyResponseBody.category)
            && Objects.equals(this.index, privacyResponseBody.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, policyid, timestamp, status, url, category, index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivacyResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
