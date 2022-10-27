package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListComponentSnapshotsResponse extends SdkResponse {

    /**
     * API版本。
     */
    public static final class ApiVersionEnum {

        /**
         * Enum V1 for value: "v1"
         */
        public static final ApiVersionEnum V1 = new ApiVersionEnum("v1");

        private static final Map<String, ApiVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiVersionEnum> createStaticFields() {
            Map<String, ApiVersionEnum> map = new HashMap<>();
            map.put("v1", V1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiVersionEnum(String value) {
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
        public static ApiVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApiVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiVersionEnum(value);
            }
            return result;
        }

        public static ApiVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApiVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiVersionEnum) {
                return this.value.equals(((ApiVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private ApiVersionEnum apiVersion;

    /**
     * 资源种类。
     */
    public static final class KindEnum {

        /**
         * Enum COMPONENTSNAPSHOT for value: "ComponentSnapshot"
         */
        public static final KindEnum COMPONENTSNAPSHOT = new KindEnum("ComponentSnapshot");

        private static final Map<String, KindEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KindEnum> createStaticFields() {
            Map<String, KindEnum> map = new HashMap<>();
            map.put("ComponentSnapshot", COMPONENTSNAPSHOT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KindEnum(String value) {
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
        public static KindEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            KindEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KindEnum(value);
            }
            return result;
        }

        public static KindEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            KindEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KindEnum) {
                return this.value.equals(((KindEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private KindEnum kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<ComponentSnapshotItem> items = null;

    public ListComponentSnapshotsResponse withApiVersion(ApiVersionEnum apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本。
     * @return apiVersion
     */
    public ApiVersionEnum getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(ApiVersionEnum apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ListComponentSnapshotsResponse withKind(KindEnum kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 资源种类。
     * @return kind
     */
    public KindEnum getKind() {
        return kind;
    }

    public void setKind(KindEnum kind) {
        this.kind = kind;
    }

    public ListComponentSnapshotsResponse withItems(List<ComponentSnapshotItem> items) {
        this.items = items;
        return this;
    }

    public ListComponentSnapshotsResponse addItemsItem(ComponentSnapshotItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListComponentSnapshotsResponse withItems(Consumer<List<ComponentSnapshotItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 快照列表。
     * @return items
     */
    public List<ComponentSnapshotItem> getItems() {
        return items;
    }

    public void setItems(List<ComponentSnapshotItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListComponentSnapshotsResponse listComponentSnapshotsResponse = (ListComponentSnapshotsResponse) o;
        return Objects.equals(this.apiVersion, listComponentSnapshotsResponse.apiVersion)
            && Objects.equals(this.kind, listComponentSnapshotsResponse.kind)
            && Objects.equals(this.items, listComponentSnapshotsResponse.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListComponentSnapshotsResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
