package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateYmlsReq
 */
public class UpdateYmlsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit")

    private UpdateYmlsReqEdit edit;

    /**
     * 节点类型 目前koosearch集群涉及不同类型的节点。 kos: koosearch的搜索中控节点 kos-doc: koosearch的文档解析节点
     */
    public static final class InstTypeEnum {

        /**
         * Enum KOS for value: "kos"
         */
        public static final InstTypeEnum KOS = new InstTypeEnum("kos");

        /**
         * Enum KOS_DOC for value: "kos-doc"
         */
        public static final InstTypeEnum KOS_DOC = new InstTypeEnum("kos-doc");

        private static final Map<String, InstTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstTypeEnum> createStaticFields() {
            Map<String, InstTypeEnum> map = new HashMap<>();
            map.put("kos", KOS);
            map.put("kos-doc", KOS_DOC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstTypeEnum(String value) {
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
        public static InstTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstTypeEnum(value));
        }

        public static InstTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstTypeEnum) {
                return this.value.equals(((InstTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inst_type")

    private InstTypeEnum instType;

    public UpdateYmlsReq withEdit(UpdateYmlsReqEdit edit) {
        this.edit = edit;
        return this;
    }

    public UpdateYmlsReq withEdit(Consumer<UpdateYmlsReqEdit> editSetter) {
        if (this.edit == null) {
            this.edit = new UpdateYmlsReqEdit();
            editSetter.accept(this.edit);
        }

        return this;
    }

    /**
     * Get edit
     * @return edit
     */
    public UpdateYmlsReqEdit getEdit() {
        return edit;
    }

    public void setEdit(UpdateYmlsReqEdit edit) {
        this.edit = edit;
    }

    public UpdateYmlsReq withInstType(InstTypeEnum instType) {
        this.instType = instType;
        return this;
    }

    /**
     * 节点类型 目前koosearch集群涉及不同类型的节点。 kos: koosearch的搜索中控节点 kos-doc: koosearch的文档解析节点
     * @return instType
     */
    public InstTypeEnum getInstType() {
        return instType;
    }

    public void setInstType(InstTypeEnum instType) {
        this.instType = instType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateYmlsReq that = (UpdateYmlsReq) obj;
        return Objects.equals(this.edit, that.edit) && Objects.equals(this.instType, that.instType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edit, instType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateYmlsReq {\n");
        sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
        sb.append("    instType: ").append(toIndentedString(instType)).append("\n");
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
