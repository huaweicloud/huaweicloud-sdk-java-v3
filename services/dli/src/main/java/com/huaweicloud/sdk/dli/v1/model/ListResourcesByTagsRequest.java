package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListResourcesByTagsRequest {

    /**
     * 资源类型
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum DLI_QUEUE for value: "dli_queue"
         */
        public static final ResourceTypeEnum DLI_QUEUE = new ResourceTypeEnum("dli_queue");

        /**
         * Enum DLI_ENHANCED_DATASOURCE for value: "dli_enhanced_datasource"
         */
        public static final ResourceTypeEnum DLI_ENHANCED_DATASOURCE = new ResourceTypeEnum("dli_enhanced_datasource");

        /**
         * Enum DLI_DATABASE for value: "dli_database"
         */
        public static final ResourceTypeEnum DLI_DATABASE = new ResourceTypeEnum("dli_database");

        /**
         * Enum DLI_PACKAGE_RESOURCE for value: "dli_package_resource"
         */
        public static final ResourceTypeEnum DLI_PACKAGE_RESOURCE = new ResourceTypeEnum("dli_package_resource");

        /**
         * Enum DLI_FLINK_JOB for value: "dli_flink_job"
         */
        public static final ResourceTypeEnum DLI_FLINK_JOB = new ResourceTypeEnum("dli_flink_job");

        /**
         * Enum DLI_ELASTIC_RESOURCE_POOL for value: "dli_elastic_resource_pool"
         */
        public static final ResourceTypeEnum DLI_ELASTIC_RESOURCE_POOL =
            new ResourceTypeEnum("dli_elastic_resource_pool");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("dli_queue", DLI_QUEUE);
            map.put("dli_enhanced_datasource", DLI_ENHANCED_DATASOURCE);
            map.put("dli_database", DLI_DATABASE);
            map.put("dli_package_resource", DLI_PACKAGE_RESOURCE);
            map.put("dli_flink_job", DLI_FLINK_JOB);
            map.put("dli_elastic_resource_pool", DLI_ELASTIC_RESOURCE_POOL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListResourcesByTagsRequestBody body;

    public ListResourcesByTagsRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ListResourcesByTagsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListResourcesByTagsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListResourcesByTagsRequest withBody(ListResourcesByTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListResourcesByTagsRequest withBody(Consumer<ListResourcesByTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListResourcesByTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListResourcesByTagsRequestBody getBody() {
        return body;
    }

    public void setBody(ListResourcesByTagsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourcesByTagsRequest that = (ListResourcesByTagsRequest) obj;
        return Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, limit, offset, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourcesByTagsRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
