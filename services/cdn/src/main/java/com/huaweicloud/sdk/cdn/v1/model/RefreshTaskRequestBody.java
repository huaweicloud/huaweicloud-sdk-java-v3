package com.huaweicloud.sdk.cdn.v1.model;

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
 * RefreshTaskRequestBody
 */
public class RefreshTaskRequestBody {

    /**
     * 刷新的类型，其值可以为file：文件，或directory：目录，默认为file。
     */
    public static final class TypeEnum {

        /**
         * Enum FILE for value: "file"
         */
        public static final TypeEnum FILE = new TypeEnum("file");

        /**
         * Enum DIRECTORY for value: "directory"
         */
        public static final TypeEnum DIRECTORY = new TypeEnum("directory");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("file", FILE);
            map.put("directory", DIRECTORY);
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

    /**
     * 目录刷新方式，all：刷新目录下全部资源；detect_modify_refresh：刷新目录下已变更的资源，默认值为all。
     */
    public static final class ModeEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final ModeEnum ALL = new ModeEnum("all");

        /**
         * Enum DETECT_MODIFY_REFRESH for value: "detect_modify_refresh"
         */
        public static final ModeEnum DETECT_MODIFY_REFRESH = new ModeEnum("detect_modify_refresh");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("detect_modify_refresh", DETECT_MODIFY_REFRESH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh_url_encode")

    private Boolean zhUrlEncode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<String> urls = null;

    public RefreshTaskRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 刷新的类型，其值可以为file：文件，或directory：目录，默认为file。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RefreshTaskRequestBody withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 目录刷新方式，all：刷新目录下全部资源；detect_modify_refresh：刷新目录下已变更的资源，默认值为all。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public RefreshTaskRequestBody withZhUrlEncode(Boolean zhUrlEncode) {
        this.zhUrlEncode = zhUrlEncode;
        return this;
    }

    /**
     * 是否对url中的中文字符进行编码后刷新，false代表不开启，true代表开启，开启后仅刷新转码后的URL。
     * @return zhUrlEncode
     */
    public Boolean getZhUrlEncode() {
        return zhUrlEncode;
    }

    public void setZhUrlEncode(Boolean zhUrlEncode) {
        this.zhUrlEncode = zhUrlEncode;
    }

    public RefreshTaskRequestBody withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    public RefreshTaskRequestBody addUrlsItem(String urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public RefreshTaskRequestBody withUrls(Consumer<List<String>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 需要刷新的URL必须带有“http://”或“https://”，多个URL用逗号分隔，单个url的长度限制为4096字符，单次最多输入1000个url，如果输入的是目录，支持100个目录刷新。  >   如果您需要刷新的URL中有中文，请同时刷新中文URL和转码后的URL。 
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RefreshTaskRequestBody that = (RefreshTaskRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.zhUrlEncode, that.zhUrlEncode) && Objects.equals(this.urls, that.urls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, mode, zhUrlEncode, urls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefreshTaskRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    zhUrlEncode: ").append(toIndentedString(zhUrlEncode)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
