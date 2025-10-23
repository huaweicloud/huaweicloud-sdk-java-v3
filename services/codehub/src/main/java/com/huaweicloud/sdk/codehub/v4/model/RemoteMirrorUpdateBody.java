package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RemoteMirrorUpdateBody
 */
public class RemoteMirrorUpdateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /**
     * **参数解释：**  分支同步。 **取值范围：** - all，同步全部分支。 - default，同步默认分支。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     */
    public static final class SyncBranchTypeEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final SyncBranchTypeEnum ALL = new SyncBranchTypeEnum("all");

        /**
         * Enum DEFAULT for value: "default"
         */
        public static final SyncBranchTypeEnum DEFAULT = new SyncBranchTypeEnum("default");

        private static final Map<String, SyncBranchTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SyncBranchTypeEnum> createStaticFields() {
            Map<String, SyncBranchTypeEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("default", DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SyncBranchTypeEnum(String value) {
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
        public static SyncBranchTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SyncBranchTypeEnum(value));
        }

        public static SyncBranchTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SyncBranchTypeEnum) {
                return this.value.equals(((SyncBranchTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_branch_type")

    private SyncBranchTypeEnum syncBranchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirroring_enabled")

    private Boolean mirroringEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_uuid")

    private String endpointUuid;

    public RemoteMirrorUpdateBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** 源仓地址。 **取值范围：** 不涉及。 **约束限制：** 以 http:// 或 https:// 开头。 **默认取值：** 不涉及。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public RemoteMirrorUpdateBody withSyncBranchType(SyncBranchTypeEnum syncBranchType) {
        this.syncBranchType = syncBranchType;
        return this;
    }

    /**
     * **参数解释：**  分支同步。 **取值范围：** - all，同步全部分支。 - default，同步默认分支。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return syncBranchType
     */
    public SyncBranchTypeEnum getSyncBranchType() {
        return syncBranchType;
    }

    public void setSyncBranchType(SyncBranchTypeEnum syncBranchType) {
        this.syncBranchType = syncBranchType;
    }

    public RemoteMirrorUpdateBody withMirroringEnabled(Boolean mirroringEnabled) {
        this.mirroringEnabled = mirroringEnabled;
        return this;
    }

    /**
     * **参数解释：**  开启定时同步 **取值范围：** - true，不开启定时同步。 - false，开启定时同步。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return mirroringEnabled
     */
    public Boolean getMirroringEnabled() {
        return mirroringEnabled;
    }

    public void setMirroringEnabled(Boolean mirroringEnabled) {
        this.mirroringEnabled = mirroringEnabled;
    }

    public RemoteMirrorUpdateBody withEndpointUuid(String endpointUuid) {
        this.endpointUuid = endpointUuid;
        return this;
    }

    /**
     * **参数解释：**  拓展点UUID。 **取值范围：** 不涉及。 **约束限制：** 不涉及。 **默认取值：** 不涉及。
     * @return endpointUuid
     */
    public String getEndpointUuid() {
        return endpointUuid;
    }

    public void setEndpointUuid(String endpointUuid) {
        this.endpointUuid = endpointUuid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoteMirrorUpdateBody that = (RemoteMirrorUpdateBody) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.syncBranchType, that.syncBranchType)
            && Objects.equals(this.mirroringEnabled, that.mirroringEnabled)
            && Objects.equals(this.endpointUuid, that.endpointUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, syncBranchType, mirroringEnabled, endpointUuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoteMirrorUpdateBody {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    syncBranchType: ").append(toIndentedString(syncBranchType)).append("\n");
        sb.append("    mirroringEnabled: ").append(toIndentedString(mirroringEnabled)).append("\n");
        sb.append("    endpointUuid: ").append(toIndentedString(endpointUuid)).append("\n");
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
