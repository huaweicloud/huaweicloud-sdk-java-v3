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
 * 动态挂载响应体。
 */
public class DataVolumesRes {

    /**
     * **参数解释**：存储类型。可选值为OBS/OBSFS/EFS。 **取值范围**：不涉及。
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
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_path")

    private String mountPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_reason")

    private String failureReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "efs_id")

    private String efsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_type")

    private String mountType;

    public DataVolumesRes withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**：存储类型。可选值为OBS/OBSFS/EFS。 **取值范围**：不涉及。
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public DataVolumesRes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：动态挂载实例ID。 **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataVolumesRes withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * **参数解释**：在Notebook实例中挂载的路径。 **取值范围**：不涉及。
     * @return mountPath
     */
    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public DataVolumesRes withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：动态挂载状态。 **取值范围**：枚举类型，取值如下： - MOUNTING：挂载中 - MOUNT_FAILED：挂载失败 - MOUNTED：已挂载 - UNMOUNTING：卸载中 - UNMOUNT_FAILED：卸载失败 - UNMOUNTED：卸载完成
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataVolumesRes withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * **参数解释**：存储路径。 **取值范围**：不涉及。
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public DataVolumesRes withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * **参数解释**：挂载失败原因，动态挂载状态为MOUNT_FAILED时返回。 **取值范围**：不涉及。
     * @return failureReason
     */
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public DataVolumesRes withEfsId(String efsId) {
        this.efsId = efsId;
        return this;
    }

    /**
     * **参数解释**：EFS存储实例ID。 **取值范围**：不涉及。
     * @return efsId
     */
    public String getEfsId() {
        return efsId;
    }

    public void setEfsId(String efsId) {
        this.efsId = efsId;
    }

    public DataVolumesRes withMountType(String mountType) {
        this.mountType = mountType;
        return this;
    }

    /**
     * **参数解释**：存储挂载类型。 **取值范围**：枚举类型，取值如下：  - STATIC:不支持在实例运行期间挂载以及卸载的存储 - DYNAMIC:支持在实例运行期间挂载以及卸载的存储
     * @return mountType
     */
    public String getMountType() {
        return mountType;
    }

    public void setMountType(String mountType) {
        this.mountType = mountType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataVolumesRes that = (DataVolumesRes) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.id, that.id)
            && Objects.equals(this.mountPath, that.mountPath) && Objects.equals(this.status, that.status)
            && Objects.equals(this.uri, that.uri) && Objects.equals(this.failureReason, that.failureReason)
            && Objects.equals(this.efsId, that.efsId) && Objects.equals(this.mountType, that.mountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, id, mountPath, status, uri, failureReason, efsId, mountType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataVolumesRes {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
        sb.append("    efsId: ").append(toIndentedString(efsId)).append("\n");
        sb.append("    mountType: ").append(toIndentedString(mountType)).append("\n");
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
