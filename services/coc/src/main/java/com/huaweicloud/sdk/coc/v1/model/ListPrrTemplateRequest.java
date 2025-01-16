package com.huaweicloud.sdk.coc.v1.model;

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
public class ListPrrTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 应用类型 core: 核心应用 non-core: 非核心应用
     */
    public static final class ApplicationTypeEnum {

        /**
         * Enum CORE for value: "core"
         */
        public static final ApplicationTypeEnum CORE = new ApplicationTypeEnum("core");

        /**
         * Enum NON_CORE for value: "non-core"
         */
        public static final ApplicationTypeEnum NON_CORE = new ApplicationTypeEnum("non-core");

        private static final Map<String, ApplicationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApplicationTypeEnum> createStaticFields() {
            Map<String, ApplicationTypeEnum> map = new HashMap<>();
            map.put("core", CORE);
            map.put("non-core", NON_CORE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApplicationTypeEnum(String value) {
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
        public static ApplicationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApplicationTypeEnum(value));
        }

        public static ApplicationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApplicationTypeEnum) {
                return this.value.equals(((ApplicationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_type")

    private ApplicationTypeEnum applicationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListPrrTemplateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListPrrTemplateRequest withApplicationType(ApplicationTypeEnum applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * 应用类型 core: 核心应用 non-core: 非核心应用
     * @return applicationType
     */
    public ApplicationTypeEnum getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(ApplicationTypeEnum applicationType) {
        this.applicationType = applicationType;
    }

    public ListPrrTemplateRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页参数
     * minimum: 1
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPrrTemplateRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPrrTemplateRequest that = (ListPrrTemplateRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.applicationType, that.applicationType)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, applicationType, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrrTemplateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
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
