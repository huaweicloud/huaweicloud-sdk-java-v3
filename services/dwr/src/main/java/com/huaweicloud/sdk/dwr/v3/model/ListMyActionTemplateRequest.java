package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListMyActionTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    /**
     * 第三方算子模板的注册状态。包括init_created, submit_approve, approved_nok, approved_ok, deprecate_approve, deprecated。init_created：已创建，submit_approve：提交审核，approved_nok：审核未通过，approved_ok：审核通过，deprecate_approve：提交禁用审核，deprecated：已禁用。
     */
    public static final class StatusEnum {

        /**
         * Enum INIT_CREATED for value: "init_created"
         */
        public static final StatusEnum INIT_CREATED = new StatusEnum("init_created");

        /**
         * Enum _SUBMIT_APPROVE for value: " submit_approve"
         */
        public static final StatusEnum _SUBMIT_APPROVE = new StatusEnum(" submit_approve");

        /**
         * Enum _APPROVED_NOK for value: " approved_nok"
         */
        public static final StatusEnum _APPROVED_NOK = new StatusEnum(" approved_nok");

        /**
         * Enum _APPROVED_OK for value: " approved_ok"
         */
        public static final StatusEnum _APPROVED_OK = new StatusEnum(" approved_ok");

        /**
         * Enum _DEPRECATE_APPROVE for value: " deprecate_approve"
         */
        public static final StatusEnum _DEPRECATE_APPROVE = new StatusEnum(" deprecate_approve");

        /**
         * Enum _DEPRECATED for value: " deprecated"
         */
        public static final StatusEnum _DEPRECATED = new StatusEnum(" deprecated");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("init_created", INIT_CREATED);
            map.put(" submit_approve", _SUBMIT_APPROVE);
            map.put(" approved_nok", _APPROVED_NOK);
            map.put(" approved_ok", _APPROVED_OK);
            map.put(" deprecate_approve", _DEPRECATE_APPROVE);
            map.put(" deprecated", _DEPRECATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * 第三方算子模板的分类。默认分类为FileProcess,MediaProcess,ImageProcess,ContentReview,NotificationProcess,VoiceInteraction
     */
    public static final class CategoryEnum {

        /**
         * Enum FILEPROCESS for value: "FileProcess"
         */
        public static final CategoryEnum FILEPROCESS = new CategoryEnum("FileProcess");

        /**
         * Enum MEDIAPROCESS for value: "MediaProcess"
         */
        public static final CategoryEnum MEDIAPROCESS = new CategoryEnum("MediaProcess");

        /**
         * Enum IMAGEPROCESS for value: "ImageProcess"
         */
        public static final CategoryEnum IMAGEPROCESS = new CategoryEnum("ImageProcess");

        /**
         * Enum CONTENTREVIEW for value: "ContentReview"
         */
        public static final CategoryEnum CONTENTREVIEW = new CategoryEnum("ContentReview");

        /**
         * Enum NOTIFICATIONPROCESS for value: "NotificationProcess"
         */
        public static final CategoryEnum NOTIFICATIONPROCESS = new CategoryEnum("NotificationProcess");

        /**
         * Enum VOICEINTERACTION for value: "VoiceInteraction"
         */
        public static final CategoryEnum VOICEINTERACTION = new CategoryEnum("VoiceInteraction");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("FileProcess", FILEPROCESS);
            map.put("MediaProcess", MEDIAPROCESS);
            map.put("ImageProcess", IMAGEPROCESS);
            map.put("ContentReview", CONTENTREVIEW);
            map.put("NotificationProcess", NOTIFICATIONPROCESS);
            map.put("VoiceInteraction", VOICEINTERACTION);
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
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListMyActionTemplateRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 模板前缀。
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ListMyActionTemplateRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 第三方算子模板的注册状态。包括init_created, submit_approve, approved_nok, approved_ok, deprecate_approve, deprecated。init_created：已创建，submit_approve：提交审核，approved_nok：审核未通过，approved_ok：审核通过，deprecate_approve：提交禁用审核，deprecated：已禁用。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListMyActionTemplateRequest withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 第三方算子模板的分类。默认分类为FileProcess,MediaProcess,ImageProcess,ContentReview,NotificationProcess,VoiceInteraction
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public ListMyActionTemplateRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的起始位置。start大于等于1，最大1000，不设置则取默认值1。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListMyActionTemplateRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询，每页显示的条目数量。
     * minimum: 0
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMyActionTemplateRequest listMyActionTemplateRequest = (ListMyActionTemplateRequest) o;
        return Objects.equals(this.prefix, listMyActionTemplateRequest.prefix)
            && Objects.equals(this.status, listMyActionTemplateRequest.status)
            && Objects.equals(this.category, listMyActionTemplateRequest.category)
            && Objects.equals(this.offset, listMyActionTemplateRequest.offset)
            && Objects.equals(this.limit, listMyActionTemplateRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, status, category, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMyActionTemplateRequest {\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
