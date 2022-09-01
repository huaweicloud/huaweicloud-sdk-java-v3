package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImportConnectionReq
 */
public class ImportConnectionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    @JacksonXmlProperty(localName = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    @JacksonXmlProperty(localName = "params")

    private List<ConnectionParam> params = null;

    /**
    * Gets or Sets sameNamePolicy
    */
    public static final class SameNamePolicyEnum {

        /**
         * Enum SKIP for value: "SKIP"
         */
        public static final SameNamePolicyEnum SKIP = new SameNamePolicyEnum("SKIP");

        /**
         * Enum OVERWRITE for value: "OVERWRITE"
         */
        public static final SameNamePolicyEnum OVERWRITE = new SameNamePolicyEnum("OVERWRITE");

        private static final Map<String, SameNamePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SameNamePolicyEnum> createStaticFields() {
            Map<String, SameNamePolicyEnum> map = new HashMap<>();
            map.put("SKIP", SKIP);
            map.put("OVERWRITE", OVERWRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SameNamePolicyEnum(String value) {
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
        public static SameNamePolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SameNamePolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SameNamePolicyEnum(value);
            }
            return result;
        }

        public static SameNamePolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SameNamePolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SameNamePolicyEnum) {
                return this.value.equals(((SameNamePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sameNamePolicy")

    @JacksonXmlProperty(localName = "sameNamePolicy")

    private SameNamePolicyEnum sameNamePolicy;

    public ImportConnectionReq withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ImportConnectionReq withParams(List<ConnectionParam> params) {
        this.params = params;
        return this;
    }

    public ImportConnectionReq addParamsItem(ConnectionParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public ImportConnectionReq withParams(Consumer<List<ConnectionParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 连接参数
     * @return params
     */
    public List<ConnectionParam> getParams() {
        return params;
    }

    public void setParams(List<ConnectionParam> params) {
        this.params = params;
    }

    public ImportConnectionReq withSameNamePolicy(SameNamePolicyEnum sameNamePolicy) {
        this.sameNamePolicy = sameNamePolicy;
        return this;
    }

    /**
     * Get sameNamePolicy
     * @return sameNamePolicy
     */
    public SameNamePolicyEnum getSameNamePolicy() {
        return sameNamePolicy;
    }

    public void setSameNamePolicy(SameNamePolicyEnum sameNamePolicy) {
        this.sameNamePolicy = sameNamePolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportConnectionReq importConnectionReq = (ImportConnectionReq) o;
        return Objects.equals(this.path, importConnectionReq.path)
            && Objects.equals(this.params, importConnectionReq.params)
            && Objects.equals(this.sameNamePolicy, importConnectionReq.sameNamePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, params, sameNamePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportConnectionReq {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    sameNamePolicy: ").append(toIndentedString(sameNamePolicy)).append("\n");
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
