package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * catalog input when grant policy
 */
public class ResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogs")

    private List<CatalogInfo> catalogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uris")

    private List<String> uris = null;

    /**
     * resource type
     */
    public static final class TypeEnum {

        /**
         * Enum CATALOG for value: "CATALOG"
         */
        public static final TypeEnum CATALOG = new TypeEnum("CATALOG");

        /**
         * Enum DATABASE for value: "DATABASE"
         */
        public static final TypeEnum DATABASE = new TypeEnum("DATABASE");

        /**
         * Enum TABLE for value: "TABLE"
         */
        public static final TypeEnum TABLE = new TypeEnum("TABLE");

        /**
         * Enum COLUMN for value: "COLUMN"
         */
        public static final TypeEnum COLUMN = new TypeEnum("COLUMN");

        /**
         * Enum FUNC for value: "FUNC"
         */
        public static final TypeEnum FUNC = new TypeEnum("FUNC");

        /**
         * Enum MODEL for value: "MODEL"
         */
        public static final TypeEnum MODEL = new TypeEnum("MODEL");

        /**
         * Enum URI for value: "URI"
         */
        public static final TypeEnum URI = new TypeEnum("URI");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("CATALOG", CATALOG);
            map.put("DATABASE", DATABASE);
            map.put("TABLE", TABLE);
            map.put("COLUMN", COLUMN);
            map.put("FUNC", FUNC);
            map.put("MODEL", MODEL);
            map.put("URI", URI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    public ResourceInfo withCatalogs(List<CatalogInfo> catalogs) {
        this.catalogs = catalogs;
        return this;
    }

    public ResourceInfo addCatalogsItem(CatalogInfo catalogsItem) {
        if (this.catalogs == null) {
            this.catalogs = new ArrayList<>();
        }
        this.catalogs.add(catalogsItem);
        return this;
    }

    public ResourceInfo withCatalogs(Consumer<List<CatalogInfo>> catalogsSetter) {
        if (this.catalogs == null) {
            this.catalogs = new ArrayList<>();
        }
        catalogsSetter.accept(this.catalogs);
        return this;
    }

    /**
     * catalog info
     * @return catalogs
     */
    public List<CatalogInfo> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<CatalogInfo> catalogs) {
        this.catalogs = catalogs;
    }

    public ResourceInfo withUris(List<String> uris) {
        this.uris = uris;
        return this;
    }

    public ResourceInfo addUrisItem(String urisItem) {
        if (this.uris == null) {
            this.uris = new ArrayList<>();
        }
        this.uris.add(urisItem);
        return this;
    }

    public ResourceInfo withUris(Consumer<List<String>> urisSetter) {
        if (this.uris == null) {
            this.uris = new ArrayList<>();
        }
        urisSetter.accept(this.uris);
        return this;
    }

    /**
     * uri
     * @return uris
     */
    public List<String> getUris() {
        return uris;
    }

    public void setUris(List<String> uris) {
        this.uris = uris;
    }

    public ResourceInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * resource type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceInfo that = (ResourceInfo) obj;
        return Objects.equals(this.catalogs, that.catalogs) && Objects.equals(this.uris, that.uris)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogs, uris, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInfo {\n");
        sb.append("    catalogs: ").append(toIndentedString(catalogs)).append("\n");
        sb.append("    uris: ").append(toIndentedString(uris)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
