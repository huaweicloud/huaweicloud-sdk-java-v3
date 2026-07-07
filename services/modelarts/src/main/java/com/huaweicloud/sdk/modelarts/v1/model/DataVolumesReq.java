package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 动态挂载存储请求体。
 */
public class DataVolumesReq {

    /**
     * **参数解释**：动态挂载存储类型。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - OBS：对象存储服务 - OBSFS：并行文件系统PFS - EFS：高性能弹性文件服务SFS Turbo  **默认取值**：无。
     */
    public static final class CategoryEnum {

        /**
         * Enum OBS for value: "OBS"
         */
        public static final CategoryEnum OBS = new CategoryEnum("OBS");

        /**
         * Enum OBSFS for value: "OBSFS"
         */
        public static final CategoryEnum OBSFS = new CategoryEnum("OBSFS");

        /**
         * Enum EFS for value: "EFS"
         */
        public static final CategoryEnum EFS = new CategoryEnum("EFS");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("OBS", OBS);
            map.put("OBSFS", OBSFS);
            map.put("EFS", EFS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_path")

    private String mountPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "efs_id")

    private String efsId;

    public DataVolumesReq withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**：动态挂载存储类型。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - OBS：对象存储服务 - OBSFS：并行文件系统PFS - EFS：高性能弹性文件服务SFS Turbo  **默认取值**：无。
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public DataVolumesReq withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * **参数解释**：在Notebook实例中挂载的路径。 **约束限制**：必须是/data目录的子目录。 **取值范围**：限制长度为256个字符，必须在Notebook的/data/的子目录下。 **默认取值**：无。
     * @return mountPath
     */
    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public DataVolumesReq withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * **参数解释**：存储路径，示例：obs://modelarts/notebook/ 或 da669f6e-5591-4c10-b2a7-18d053a75677.sfsturbo.internal:/notebook。 **约束限制**：并行文件系统PFS 或 高性能弹性文件服务SFS Turbo中合法的挂载路径。 **取值范围**：限制长度为256个字符。 **默认取值**：不涉及。
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public DataVolumesReq withEfsId(String efsId) {
        this.efsId = efsId;
        return this;
    }

    /**
     * **参数解释**：高性能弹性文件服务SFS Turbo实例id。 **约束限制**：若category字段为EFS，则此字段必填。 **取值范围**：合法UUID类型。 **默认取值**：无
     * @return efsId
     */
    public String getEfsId() {
        return efsId;
    }

    public void setEfsId(String efsId) {
        this.efsId = efsId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataVolumesReq that = (DataVolumesReq) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.mountPath, that.mountPath)
            && Objects.equals(this.uri, that.uri) && Objects.equals(this.efsId, that.efsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, mountPath, uri, efsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataVolumesReq {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    efsId: ").append(toIndentedString(efsId)).append("\n");
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
