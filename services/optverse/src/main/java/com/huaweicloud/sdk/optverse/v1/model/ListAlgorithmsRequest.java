package com.huaweicloud.sdk.optverse.v1.model;

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
public class ListAlgorithmsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lang")

    private String lang;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    /**
     * **参数解释**： 可见性 **约束限制**： 不涉及 **取值范围**： PUBLIC, PRIVATE **默认取值**： 无 
     */
    public static final class VisibilityEnum {

        /**
         * Enum PUBLIC for value: "PUBLIC"
         */
        public static final VisibilityEnum PUBLIC = new VisibilityEnum("PUBLIC");

        /**
         * Enum PRIVATE for value: "PRIVATE"
         */
        public static final VisibilityEnum PRIVATE = new VisibilityEnum("PRIVATE");

        private static final Map<String, VisibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibilityEnum> createStaticFields() {
            Map<String, VisibilityEnum> map = new HashMap<>();
            map.put("PUBLIC", PUBLIC);
            map.put("PRIVATE", PRIVATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VisibilityEnum(value));
        }

        public static VisibilityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VisibilityEnum) {
                return this.value.equals(((VisibilityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private VisibilityEnum visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_start")

    private Long createTimeStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_end")

    private Long createTimeEnd;

    public ListAlgorithmsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释**： 排序规则，目前默认创建时间降序。 **约束限制**： 不涉及 **取值范围**： - DESC：降序 - ASC：升序 **默认取值**： DESC 
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListAlgorithmsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 限制量，单次查询总量，必须由数字组成，默认为100，取值范围[1,1000]。 **约束限制**： 不涉及 **取值范围**： [1,1000] **默认取值**： 100 
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAlgorithmsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 偏移量，查询起始偏移，必须由数字组成，默认为0，取值范围[0,100000000]。 **约束限制**： 不涉及 **取值范围**： [0,100000000] **默认取值**： 0 
     * minimum: 0
     * maximum: 100000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAlgorithmsRequest withLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * **参数解释**： 编程语言，可选python,c++,java **约束限制**： 不涉及 **取值范围**： python,c++,java **默认取值**： 0 
     * @return lang
     */
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public ListAlgorithmsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 算法id **约束限制**： 不涉及 **取值范围**： 长度[0,64] **默认取值**： 不涉及 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListAlgorithmsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 算法名称 **约束限制**： 不涉及 **取值范围**： 长度[0,128] **默认取值**： 0 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAlgorithmsRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**： 用户名 **约束限制**： 不涉及 **取值范围**： 长度[0,256] **默认取值**： 0 
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ListAlgorithmsRequest withVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释**： 可见性 **约束限制**： 不涉及 **取值范围**： PUBLIC, PRIVATE **默认取值**： 无 
     * @return visibility
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public ListAlgorithmsRequest withCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }

    /**
     * **参数解释**： 创建时间过滤条件，初始过滤时间 **约束限制**： 不涉及 **取值范围**： [0,9999999999999] **默认取值**： 无 
     * minimum: 0
     * maximum: 9999999999999
     * @return createTimeStart
     */
    public Long getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public ListAlgorithmsRequest withCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }

    /**
     * **参数解释**： 创建时间过滤条件，终止过滤时间 **约束限制**： 不涉及 **取值范围**： [0,9999999999999] **默认取值**： 无 
     * minimum: 0
     * maximum: 9999999999999
     * @return createTimeEnd
     */
    public Long getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlgorithmsRequest that = (ListAlgorithmsRequest) obj;
        return Objects.equals(this.order, that.order) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.lang, that.lang)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.createTimeStart, that.createTimeStart)
            && Objects.equals(this.createTimeEnd, that.createTimeEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, limit, offset, lang, id, name, userId, visibility, createTimeStart, createTimeEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlgorithmsRequest {\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    createTimeStart: ").append(toIndentedString(createTimeStart)).append("\n");
        sb.append("    createTimeEnd: ").append(toIndentedString(createTimeEnd)).append("\n");
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
