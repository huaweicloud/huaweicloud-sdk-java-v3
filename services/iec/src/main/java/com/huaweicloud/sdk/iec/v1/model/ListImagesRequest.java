package com.huaweicloud.sdk.iec.v1.model;

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
public class ListImagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__imagetype")

    private String imagetype;

    /**
     * 镜像是否是受保护，取值为true/false，一般查询公共镜像时候取值为true，查询私有镜像可以不指定。
     */
    public static final class ProtectedEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final ProtectedEnum TRUE = new ProtectedEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final ProtectedEnum FALSE = new ProtectedEnum("false");

        private static final Map<String, ProtectedEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectedEnum> createStaticFields() {
            Map<String, ProtectedEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectedEnum(String value) {
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
        public static ProtectedEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtectedEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtectedEnum(value);
            }
            return result;
        }

        public static ProtectedEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtectedEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectedEnum) {
                return this.value.equals(((ProtectedEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected")

    private ProtectedEnum _protected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_type")

    private String osType;

    /**
     * 镜像使用环境类型。  目前仅支持系统盘镜像，取值为：FusionCompute
     */
    public static final class VirtualEnvTypeEnum {

        /**
         * Enum FUSIONCOMPUTE for value: "FusionCompute"
         */
        public static final VirtualEnvTypeEnum FUSIONCOMPUTE = new VirtualEnvTypeEnum("FusionCompute");

        private static final Map<String, VirtualEnvTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VirtualEnvTypeEnum> createStaticFields() {
            Map<String, VirtualEnvTypeEnum> map = new HashMap<>();
            map.put("FusionCompute", FUSIONCOMPUTE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VirtualEnvTypeEnum(String value) {
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
        public static VirtualEnvTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VirtualEnvTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VirtualEnvTypeEnum(value);
            }
            return result;
        }

        public static VirtualEnvTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VirtualEnvTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VirtualEnvTypeEnum) {
                return this.value.equals(((VirtualEnvTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_env_type")

    private VirtualEnvTypeEnum virtualEnvType;

    /**
     * 镜像是否可用，取值为true/false。 > 查询公共镜像时，该参数无效。
     */
    public static final class IsregisteredEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IsregisteredEnum TRUE = new IsregisteredEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final IsregisteredEnum FALSE = new IsregisteredEnum("false");

        private static final Map<String, IsregisteredEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsregisteredEnum> createStaticFields() {
            Map<String, IsregisteredEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsregisteredEnum(String value) {
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
        public static IsregisteredEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            IsregisteredEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsregisteredEnum(value);
            }
            return result;
        }

        public static IsregisteredEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            IsregisteredEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsregisteredEnum) {
                return this.value.equals(((IsregisteredEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__isregistered")

    private IsregisteredEnum isregistered;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    /**
     * 用于排序，表示按照哪个字段排序，取值为镜像属性name、status、disk_format、created_at，默认取值为created_at。
     */
    public static final class SortKeyEnum {

        /**
         * Enum NAME for value: "name"
         */
        public static final SortKeyEnum NAME = new SortKeyEnum("name");

        /**
         * Enum STATUS for value: "status"
         */
        public static final SortKeyEnum STATUS = new SortKeyEnum("status");

        /**
         * Enum DISK_FORMAT for value: "disk_format"
         */
        public static final SortKeyEnum DISK_FORMAT = new SortKeyEnum("disk_format");

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final SortKeyEnum CREATED_AT = new SortKeyEnum("created_at");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("name", NAME);
            map.put("status", STATUS);
            map.put("disk_format", DISK_FORMAT);
            map.put("created_at", CREATED_AT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortKeyEnum(value);
            }
            return result;
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private SortKeyEnum sortKey;

    /**
     * 用于排序，表示升序还是降序，取值为asc和desc，与sort_key一起组合使用，默认为降序desc。
     */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private SortDirEnum sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm")

    private String supportKvm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_gpu_type")

    private String supportKvmGpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_ascend_310")

    private String supportKvmAscend310;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_hi1822_hiovs")

    private String supportKvmHi1822Hiovs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_arm")

    private String supportArm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_gpu_t4")

    private String supportGpuT4;

    public ListImagesRequest withImagetype(String imagetype) {
        this.imagetype = imagetype;
        return this;
    }

    /**
     * 镜像类型，目前支持以下类型：  - 公共镜像：gold  - 私有镜像：private
     * @return imagetype
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__imagetype")
    public String getImagetype() {
        return imagetype;
    }

    public void setImagetype(String imagetype) {
        this.imagetype = imagetype;
    }

    public ListImagesRequest withProtected(ProtectedEnum _protected) {
        this._protected = _protected;
        return this;
    }

    /**
     * 镜像是否是受保护，取值为true/false，一般查询公共镜像时候取值为true，查询私有镜像可以不指定。
     * @return _protected
     */
    public ProtectedEnum getProtected() {
        return _protected;
    }

    public void setProtected(ProtectedEnum _protected) {
        this._protected = _protected;
    }

    public ListImagesRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 镜像ID，精确匹配。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListImagesRequest withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * 是否被其他租户可见，取值如下：  - public：公共镜像  - private：私有镜像
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public ListImagesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 镜像状态。取值如下：  - saving：表示镜像正在上传文件到后端存储  - deleted：表示镜像已经删除  - killed：表示镜像上传错误  - active：表示镜像可以正常使用
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListImagesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像名称，匹配规则为精确匹配。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListImagesRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 镜像系统类型，取值如下：  - Linux - Windows - Other
     * @return osType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_type")
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListImagesRequest withVirtualEnvType(VirtualEnvTypeEnum virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
        return this;
    }

    /**
     * 镜像使用环境类型。  目前仅支持系统盘镜像，取值为：FusionCompute
     * @return virtualEnvType
     */
    public VirtualEnvTypeEnum getVirtualEnvType() {
        return virtualEnvType;
    }

    public void setVirtualEnvType(VirtualEnvTypeEnum virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
    }

    public ListImagesRequest withIsregistered(IsregisteredEnum isregistered) {
        this.isregistered = isregistered;
        return this;
    }

    /**
     * 镜像是否可用，取值为true/false。 > 查询公共镜像时，该参数无效。
     * @return isregistered
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__isregistered")
    public IsregisteredEnum getIsregistered() {
        return isregistered;
    }

    public void setIsregistered(IsregisteredEnum isregistered) {
        this.isregistered = isregistered;
    }

    public ListImagesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页，表示查询几条镜像记录，取值为正整数，最大（默认）取值为500
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListImagesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页，表示查询偏移量，表示从整个列表查询结果中的该位置向后进行查询，并非页数偏移，默认取值为0，表示查询第一页。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListImagesRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 用于排序，表示按照哪个字段排序，取值为镜像属性name、status、disk_format、created_at，默认取值为created_at。
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ListImagesRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 用于排序，表示升序还是降序，取值为asc和desc，与sort_key一起组合使用，默认为降序desc。
     * @return sortDir
     */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    public ListImagesRequest withSupportKvm(String supportKvm) {
        this.supportKvm = supportKvm;
        return this;
    }

    /**
     * 如果镜像支持KVM，取值为true，否则无该属性。
     * @return supportKvm
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm")
    public String getSupportKvm() {
        return supportKvm;
    }

    public void setSupportKvm(String supportKvm) {
        this.supportKvm = supportKvm;
    }

    public ListImagesRequest withSupportKvmGpuType(String supportKvmGpuType) {
        this.supportKvmGpuType = supportKvmGpuType;
        return this;
    }

    /**
     * 如果镜像是支持KVM虚拟化平台下的GPU类型，取值为“V100_vGPU”或者“RTX5000”，否则无该属性。
     * @return supportKvmGpuType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_gpu_type")
    public String getSupportKvmGpuType() {
        return supportKvmGpuType;
    }

    public void setSupportKvmGpuType(String supportKvmGpuType) {
        this.supportKvmGpuType = supportKvmGpuType;
    }

    public ListImagesRequest withSupportKvmAscend310(String supportKvmAscend310) {
        this.supportKvmAscend310 = supportKvmAscend310;
        return this;
    }

    /**
     * 如果镜像支持AI加速，取值为true，否则无该属性。
     * @return supportKvmAscend310
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_ascend_310")
    public String getSupportKvmAscend310() {
        return supportKvmAscend310;
    }

    public void setSupportKvmAscend310(String supportKvmAscend310) {
        this.supportKvmAscend310 = supportKvmAscend310;
    }

    public ListImagesRequest withSupportKvmHi1822Hiovs(String supportKvmHi1822Hiovs) {
        this.supportKvmHi1822Hiovs = supportKvmHi1822Hiovs;
        return this;
    }

    /**
     * 如果镜像支持计算增强，取值为true，否则无该属性。
     * @return supportKvmHi1822Hiovs
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_hi1822_hiovs")
    public String getSupportKvmHi1822Hiovs() {
        return supportKvmHi1822Hiovs;
    }

    public void setSupportKvmHi1822Hiovs(String supportKvmHi1822Hiovs) {
        this.supportKvmHi1822Hiovs = supportKvmHi1822Hiovs;
    }

    public ListImagesRequest withSupportArm(String supportArm) {
        this.supportArm = supportArm;
        return this;
    }

    /**
     * 如果镜像为ARM架构类型，取值为true，否则无该属性。
     * @return supportArm
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_arm")
    public String getSupportArm() {
        return supportArm;
    }

    public void setSupportArm(String supportArm) {
        this.supportArm = supportArm;
    }

    public ListImagesRequest withSupportGpuT4(String supportGpuT4) {
        this.supportGpuT4 = supportGpuT4;
        return this;
    }

    /**
     * 如果镜像支持GPU T4，取值为true，否则无该属性。
     * @return supportGpuT4
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_gpu_t4")
    public String getSupportGpuT4() {
        return supportGpuT4;
    }

    public void setSupportGpuT4(String supportGpuT4) {
        this.supportGpuT4 = supportGpuT4;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListImagesRequest listImagesRequest = (ListImagesRequest) o;
        return Objects.equals(this.imagetype, listImagesRequest.imagetype)
            && Objects.equals(this._protected, listImagesRequest._protected)
            && Objects.equals(this.id, listImagesRequest.id)
            && Objects.equals(this.visibility, listImagesRequest.visibility)
            && Objects.equals(this.status, listImagesRequest.status)
            && Objects.equals(this.name, listImagesRequest.name)
            && Objects.equals(this.osType, listImagesRequest.osType)
            && Objects.equals(this.virtualEnvType, listImagesRequest.virtualEnvType)
            && Objects.equals(this.isregistered, listImagesRequest.isregistered)
            && Objects.equals(this.limit, listImagesRequest.limit)
            && Objects.equals(this.offset, listImagesRequest.offset)
            && Objects.equals(this.sortKey, listImagesRequest.sortKey)
            && Objects.equals(this.sortDir, listImagesRequest.sortDir)
            && Objects.equals(this.supportKvm, listImagesRequest.supportKvm)
            && Objects.equals(this.supportKvmGpuType, listImagesRequest.supportKvmGpuType)
            && Objects.equals(this.supportKvmAscend310, listImagesRequest.supportKvmAscend310)
            && Objects.equals(this.supportKvmHi1822Hiovs, listImagesRequest.supportKvmHi1822Hiovs)
            && Objects.equals(this.supportArm, listImagesRequest.supportArm)
            && Objects.equals(this.supportGpuT4, listImagesRequest.supportGpuT4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imagetype,
            _protected,
            id,
            visibility,
            status,
            name,
            osType,
            virtualEnvType,
            isregistered,
            limit,
            offset,
            sortKey,
            sortDir,
            supportKvm,
            supportKvmGpuType,
            supportKvmAscend310,
            supportKvmHi1822Hiovs,
            supportArm,
            supportGpuT4);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImagesRequest {\n");
        sb.append("    imagetype: ").append(toIndentedString(imagetype)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    virtualEnvType: ").append(toIndentedString(virtualEnvType)).append("\n");
        sb.append("    isregistered: ").append(toIndentedString(isregistered)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    supportKvm: ").append(toIndentedString(supportKvm)).append("\n");
        sb.append("    supportKvmGpuType: ").append(toIndentedString(supportKvmGpuType)).append("\n");
        sb.append("    supportKvmAscend310: ").append(toIndentedString(supportKvmAscend310)).append("\n");
        sb.append("    supportKvmHi1822Hiovs: ").append(toIndentedString(supportKvmHi1822Hiovs)).append("\n");
        sb.append("    supportArm: ").append(toIndentedString(supportArm)).append("\n");
        sb.append("    supportGpuT4: ").append(toIndentedString(supportGpuT4)).append("\n");
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
