package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * hpc cache 联动任务请求
 */
public class CreateHpcCacheTaskReq {

    /**
     * 操作类型，当前支持import(普通导入)，export(导出)，import_metadata(元数据导入)，preload(数据预热)
     */
    public static final class TypeEnum {

        /**
         * Enum IMPORT for value: "import"
         */
        public static final TypeEnum IMPORT = new TypeEnum("import");

        /**
         * Enum EXPORT for value: "export"
         */
        public static final TypeEnum EXPORT = new TypeEnum("export");

        /**
         * Enum IMPORT_METADATA for value: "import_metadata"
         */
        public static final TypeEnum IMPORT_METADATA = new TypeEnum("import_metadata");

        /**
         * Enum PRELOAD for value: "preload"
         */
        public static final TypeEnum PRELOAD = new TypeEnum("preload");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("import", IMPORT);
            map.put("export", EXPORT);
            map.put("import_metadata", IMPORT_METADATA);
            map.put("preload", PRELOAD);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_target")

    private String srcTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_prefix")

    private String srcPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_target")

    private String destTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_prefix")

    private String destPrefix;

    public CreateHpcCacheTaskReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 操作类型，当前支持import(普通导入)，export(导出)，import_metadata(元数据导入)，preload(数据预热)
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateHpcCacheTaskReq withSrcTarget(String srcTarget) {
        this.srcTarget = srcTarget;
        return this;
    }

    /**
     * 源端对象。OBS桶绑定文件系统后的文件系统路径名称
     * @return srcTarget
     */
    public String getSrcTarget() {
        return srcTarget;
    }

    public void setSrcTarget(String srcTarget) {
        this.srcTarget = srcTarget;
    }

    public CreateHpcCacheTaskReq withSrcPrefix(String srcPrefix) {
        this.srcPrefix = srcPrefix;
        return this;
    }

    /**
     * 源端路径前缀。例如，'/mnt/sfs_turbo' 为您的挂载目录，对于导入任务，前缀为prefix，则会导入到 '/mnt/sfs_turbo/prefix'；如导入前缀为空，则会直接导入到 '/mnt/sfs_turbo'。对于导出任务，前缀为prefix，则会导出到 '/mnt/sfs_turbo/prefix'；如导出前缀为空，则会直接导出到 '/mnt/sfs_turbo'。
     * @return srcPrefix
     */
    public String getSrcPrefix() {
        return srcPrefix;
    }

    public void setSrcPrefix(String srcPrefix) {
        this.srcPrefix = srcPrefix;
    }

    public CreateHpcCacheTaskReq withDestTarget(String destTarget) {
        this.destTarget = destTarget;
        return this;
    }

    /**
     * 目的端对象。目前只支持和src_target保持一致
     * @return destTarget
     */
    public String getDestTarget() {
        return destTarget;
    }

    public void setDestTarget(String destTarget) {
        this.destTarget = destTarget;
    }

    public CreateHpcCacheTaskReq withDestPrefix(String destPrefix) {
        this.destPrefix = destPrefix;
        return this;
    }

    /**
     * 目的端路径。目前只支持和src_prefix保持一致
     * @return destPrefix
     */
    public String getDestPrefix() {
        return destPrefix;
    }

    public void setDestPrefix(String destPrefix) {
        this.destPrefix = destPrefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateHpcCacheTaskReq that = (CreateHpcCacheTaskReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.srcTarget, that.srcTarget)
            && Objects.equals(this.srcPrefix, that.srcPrefix) && Objects.equals(this.destTarget, that.destTarget)
            && Objects.equals(this.destPrefix, that.destPrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, srcTarget, srcPrefix, destTarget, destPrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHpcCacheTaskReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    srcTarget: ").append(toIndentedString(srcTarget)).append("\n");
        sb.append("    srcPrefix: ").append(toIndentedString(srcPrefix)).append("\n");
        sb.append("    destTarget: ").append(toIndentedString(destTarget)).append("\n");
        sb.append("    destPrefix: ").append(toIndentedString(destPrefix)).append("\n");
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
