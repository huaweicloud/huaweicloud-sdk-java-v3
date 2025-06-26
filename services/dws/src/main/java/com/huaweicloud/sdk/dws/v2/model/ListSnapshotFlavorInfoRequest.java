package com.huaweicloud.sdk.dws.v2.model;

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
public class ListSnapshotFlavorInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    private String snapshotId;

    /**
     * **参数解释**： 过滤快照规格类型，用于区分仅查询快照原始规格，还是包含可恢复的规格。 **约束限制**： 不涉及。 **取值范围**： snapshot：仅查询快照的规格信息 restore：同时查询恢复快照可用的规格信息 **默认取值**： snapshot
     */
    public static final class TypeEnum {

        /**
         * Enum SNAPSHOT for value: "snapshot"
         */
        public static final TypeEnum SNAPSHOT = new TypeEnum("snapshot");

        /**
         * Enum RESTORE for value: "restore"
         */
        public static final TypeEnum RESTORE = new TypeEnum("restore");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("snapshot", SNAPSHOT);
            map.put("restore", RESTORE);
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
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fine_grained_restore")

    private Boolean fineGrainedRestore;

    public ListSnapshotFlavorInfoRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * **参数解释**： 快照ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public ListSnapshotFlavorInfoRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 过滤快照规格类型，用于区分仅查询快照原始规格，还是包含可恢复的规格。 **约束限制**： 不涉及。 **取值范围**： snapshot：仅查询快照的规格信息 restore：同时查询恢复快照可用的规格信息 **默认取值**： snapshot
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListSnapshotFlavorInfoRequest withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * **参数解释**： 恢复时的目标可用区，用以过滤目标可用区下可恢复的规格。 恢复3az集群时需传递3个可用区编码，英文逗号分割（无空格）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 快照原始集群所在可用区。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public ListSnapshotFlavorInfoRequest withFineGrainedRestore(Boolean fineGrainedRestore) {
        this.fineGrainedRestore = fineGrainedRestore;
        return this;
    }

    /**
     * **参数解释**： 是否是细粒度备份恢复，用以过滤恢复时的可用规格。 **约束限制**： 不涉及。 **取值范围**： true|false **默认取值**： false
     * @return fineGrainedRestore
     */
    public Boolean getFineGrainedRestore() {
        return fineGrainedRestore;
    }

    public void setFineGrainedRestore(Boolean fineGrainedRestore) {
        this.fineGrainedRestore = fineGrainedRestore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSnapshotFlavorInfoRequest that = (ListSnapshotFlavorInfoRequest) obj;
        return Objects.equals(this.snapshotId, that.snapshotId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.fineGrainedRestore, that.fineGrainedRestore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotId, type, azCode, fineGrainedRestore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotFlavorInfoRequest {\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    fineGrainedRestore: ").append(toIndentedString(fineGrainedRestore)).append("\n");
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
