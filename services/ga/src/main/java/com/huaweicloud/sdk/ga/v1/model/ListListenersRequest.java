package com.huaweicloud.sdk.ga.v1.model;

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
public class ListListenersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 配置状态，可选范围: - ACTIVE：运行中 - PENDING：待定 - ERROR：错误 - DELETING：正在删除
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final StatusEnum PENDING = new StatusEnum("PENDING");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("PENDING", PENDING);
            map.put("ERROR", ERROR);
            map.put("DELETING", DELETING);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerator_id")

    private String acceleratorId;

    public ListListenersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询每页的资源个数。如果不设置，则默认为500。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListListenersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询的起始的资源ID，表示上一页最后一条查询资源记录的ID。不指定时表示查询第一页。 必须与limit一起使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListListenersRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 分页的顺序，true表示从后往前分页，false表示从前往后分页，默认为false。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListListenersRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListListenersRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称，取值范围：0~64个字符之间，只能由数字、字母、中划线和中文组成。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListListenersRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 配置状态，可选范围: - ACTIVE：运行中 - PENDING：待定 - ERROR：错误 - DELETING：正在删除
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListListenersRequest withAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }

    /**
     * 全球加速器ID。
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return acceleratorId;
    }

    public void setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListListenersRequest listListenersRequest = (ListListenersRequest) o;
        return Objects.equals(this.limit, listListenersRequest.limit)
            && Objects.equals(this.marker, listListenersRequest.marker)
            && Objects.equals(this.pageReverse, listListenersRequest.pageReverse)
            && Objects.equals(this.id, listListenersRequest.id) && Objects.equals(this.name, listListenersRequest.name)
            && Objects.equals(this.status, listListenersRequest.status)
            && Objects.equals(this.acceleratorId, listListenersRequest.acceleratorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, pageReverse, id, name, status, acceleratorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListListenersRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    acceleratorId: ").append(toIndentedString(acceleratorId)).append("\n");
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
