package com.huaweicloud.sdk.roma.v2.model;

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

/** ExportOpenApiReq */
public class ExportOpenApiReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    /** 导出API的定义范围： - spec：基础定义，只包括api前端定义 - proxy：全量定义，包括api前后端定义 - all：扩展定义，包括api前后端定义以及流控、访问控制、自定义认证等扩展定义 -
     * dev：开发定义，包括未发布的api的前后端定义 */
    public static final class DefineEnum {

        /** Enum SPEC for value: "spec" */
        public static final DefineEnum SPEC = new DefineEnum("spec");

        /** Enum PROXY for value: "proxy" */
        public static final DefineEnum PROXY = new DefineEnum("proxy");

        /** Enum ALL for value: "all" */
        public static final DefineEnum ALL = new DefineEnum("all");

        /** Enum DEV for value: "dev" */
        public static final DefineEnum DEV = new DefineEnum("dev");

        private static final Map<String, DefineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DefineEnum> createStaticFields() {
            Map<String, DefineEnum> map = new HashMap<>();
            map.put("spec", SPEC);
            map.put("proxy", PROXY);
            map.put("all", ALL);
            map.put("dev", DEV);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DefineEnum(String value) {
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
        public static DefineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DefineEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DefineEnum(value);
            }
            return result;
        }

        public static DefineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DefineEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DefineEnum) {
                return this.value.equals(((DefineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "define")

    private DefineEnum define;

    /** 导出的API定义的格式 */
    public static final class TypeEnum {

        /** Enum JSON for value: "json" */
        public static final TypeEnum JSON = new TypeEnum("json");

        /** Enum YAML for value: "yaml" */
        public static final TypeEnum YAML = new TypeEnum("yaml");

        /** Enum YML for value: "yml" */
        public static final TypeEnum YML = new TypeEnum("yml");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("json", JSON);
            map.put("yaml", YAML);
            map.put("yml", YML);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apis")

    private List<String> apis = null;

    public ExportOpenApiReq withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /** API分组发布的环境ID
     * 
     * @return envId */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ExportOpenApiReq withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** API分组ID
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ExportOpenApiReq withDefine(DefineEnum define) {
        this.define = define;
        return this;
    }

    /** 导出API的定义范围： - spec：基础定义，只包括api前端定义 - proxy：全量定义，包括api前后端定义 - all：扩展定义，包括api前后端定义以及流控、访问控制、自定义认证等扩展定义 -
     * dev：开发定义，包括未发布的api的前后端定义
     * 
     * @return define */
    public DefineEnum getDefine() {
        return define;
    }

    public void setDefine(DefineEnum define) {
        this.define = define;
    }

    public ExportOpenApiReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 导出的API定义的格式
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ExportOpenApiReq withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 导出的API定义版本，默认为当前时间
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ExportOpenApiReq withApis(List<String> apis) {
        this.apis = apis;
        return this;
    }

    public ExportOpenApiReq addApisItem(String apisItem) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        this.apis.add(apisItem);
        return this;
    }

    public ExportOpenApiReq withApis(Consumer<List<String>> apisSetter) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        apisSetter.accept(this.apis);
        return this;
    }

    /** 导出的API ID列表
     * 
     * @return apis */
    public List<String> getApis() {
        return apis;
    }

    public void setApis(List<String> apis) {
        this.apis = apis;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportOpenApiReq exportOpenApiReq = (ExportOpenApiReq) o;
        return Objects.equals(this.envId, exportOpenApiReq.envId)
            && Objects.equals(this.groupId, exportOpenApiReq.groupId)
            && Objects.equals(this.define, exportOpenApiReq.define) && Objects.equals(this.type, exportOpenApiReq.type)
            && Objects.equals(this.version, exportOpenApiReq.version)
            && Objects.equals(this.apis, exportOpenApiReq.apis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envId, groupId, define, type, version, apis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportOpenApiReq {\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    define: ").append(toIndentedString(define)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
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
