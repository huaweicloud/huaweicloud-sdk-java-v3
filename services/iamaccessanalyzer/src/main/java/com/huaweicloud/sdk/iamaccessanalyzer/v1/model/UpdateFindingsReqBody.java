package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateFindingsReqBody
 */
public class UpdateFindingsReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_urn")

    private String resourceUrn;

    /**
     * 状态表示为更新查找状态而要采取的操作。使用“存档”将活动查找更改为存档查找。使用“活动”将存档的查找更改为活动查找。
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("active");

        /**
         * Enum ARCHIVED for value: "archived"
         */
        public static final StatusEnum ARCHIVED = new StatusEnum("archived");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("archived", ARCHIVED);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public UpdateFindingsReqBody withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public UpdateFindingsReqBody addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public UpdateFindingsReqBody withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 要更新的调查结果的ID。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public UpdateFindingsReqBody withResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
        return this;
    }

    /**
     * 唯一的资源名称。
     * @return resourceUrn
     */
    public String getResourceUrn() {
        return resourceUrn;
    }

    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    public UpdateFindingsReqBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态表示为更新查找状态而要采取的操作。使用“存档”将活动查找更改为存档查找。使用“活动”将存档的查找更改为活动查找。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFindingsReqBody that = (UpdateFindingsReqBody) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.resourceUrn, that.resourceUrn)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, resourceUrn, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFindingsReqBody {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    resourceUrn: ").append(toIndentedString(resourceUrn)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
