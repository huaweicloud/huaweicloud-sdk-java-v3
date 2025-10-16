package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 项目属性。
 */
public class ArticlePropertiesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_object_name")

    private String destinationObjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_object_owner")

    private String destinationObjectOwner;

    /**
     * 插入交付格式。
     */
    public static final class InsertDeliveryFormatEnum {

        /**
         * Enum DO_NOT_INSERT for value: "do_not_insert"
         */
        public static final InsertDeliveryFormatEnum DO_NOT_INSERT = new InsertDeliveryFormatEnum("do_not_insert");

        /**
         * Enum INSERT for value: "insert"
         */
        public static final InsertDeliveryFormatEnum INSERT = new InsertDeliveryFormatEnum("insert");

        /**
         * Enum INSERT_WITHOUT_COLUMN_LIST for value: "insert_without_column_list"
         */
        public static final InsertDeliveryFormatEnum INSERT_WITHOUT_COLUMN_LIST =
            new InsertDeliveryFormatEnum("insert_without_column_list");

        /**
         * Enum CALL_PROCEDURE for value: "call_procedure"
         */
        public static final InsertDeliveryFormatEnum CALL_PROCEDURE = new InsertDeliveryFormatEnum("call_procedure");

        private static final Map<String, InsertDeliveryFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InsertDeliveryFormatEnum> createStaticFields() {
            Map<String, InsertDeliveryFormatEnum> map = new HashMap<>();
            map.put("do_not_insert", DO_NOT_INSERT);
            map.put("insert", INSERT);
            map.put("insert_without_column_list", INSERT_WITHOUT_COLUMN_LIST);
            map.put("call_procedure", CALL_PROCEDURE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InsertDeliveryFormatEnum(String value) {
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
        public static InsertDeliveryFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InsertDeliveryFormatEnum(value));
        }

        public static InsertDeliveryFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InsertDeliveryFormatEnum) {
                return this.value.equals(((InsertDeliveryFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_delivery_format")

    private InsertDeliveryFormatEnum insertDeliveryFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_stored_procedure")

    private String insertStoredProcedure;

    /**
     * 更新交付格式。
     */
    public static final class UpdateDeliveryFormatEnum {

        /**
         * Enum DO_NOT_UPDATE for value: "do_not_update"
         */
        public static final UpdateDeliveryFormatEnum DO_NOT_UPDATE = new UpdateDeliveryFormatEnum("do_not_update");

        /**
         * Enum UPDATE for value: "update"
         */
        public static final UpdateDeliveryFormatEnum UPDATE = new UpdateDeliveryFormatEnum("update");

        /**
         * Enum CALL_PROCEDURE for value: "call_procedure"
         */
        public static final UpdateDeliveryFormatEnum CALL_PROCEDURE = new UpdateDeliveryFormatEnum("call_procedure");

        /**
         * Enum MCALL_PROCEDURE for value: "mcall_procedure"
         */
        public static final UpdateDeliveryFormatEnum MCALL_PROCEDURE = new UpdateDeliveryFormatEnum("mcall_procedure");

        /**
         * Enum XCALL_PROCEDURE for value: "xcall_procedure"
         */
        public static final UpdateDeliveryFormatEnum XCALL_PROCEDURE = new UpdateDeliveryFormatEnum("xcall_procedure");

        /**
         * Enum SCALL_PROCEDURE for value: "scall_procedure"
         */
        public static final UpdateDeliveryFormatEnum SCALL_PROCEDURE = new UpdateDeliveryFormatEnum("scall_procedure");

        private static final Map<String, UpdateDeliveryFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UpdateDeliveryFormatEnum> createStaticFields() {
            Map<String, UpdateDeliveryFormatEnum> map = new HashMap<>();
            map.put("do_not_update", DO_NOT_UPDATE);
            map.put("update", UPDATE);
            map.put("call_procedure", CALL_PROCEDURE);
            map.put("mcall_procedure", MCALL_PROCEDURE);
            map.put("xcall_procedure", XCALL_PROCEDURE);
            map.put("scall_procedure", SCALL_PROCEDURE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UpdateDeliveryFormatEnum(String value) {
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
        public static UpdateDeliveryFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UpdateDeliveryFormatEnum(value));
        }

        public static UpdateDeliveryFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UpdateDeliveryFormatEnum) {
                return this.value.equals(((UpdateDeliveryFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_delivery_format")

    private UpdateDeliveryFormatEnum updateDeliveryFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_stored_procedure")

    private String updateStoredProcedure;

    /**
     * 删除交付格式。
     */
    public static final class DeleteDeliveryFormatEnum {

        /**
         * Enum DO_NOT_DELETE for value: "do_not_delete"
         */
        public static final DeleteDeliveryFormatEnum DO_NOT_DELETE = new DeleteDeliveryFormatEnum("do_not_delete");

        /**
         * Enum DELETE for value: "delete"
         */
        public static final DeleteDeliveryFormatEnum DELETE = new DeleteDeliveryFormatEnum("delete");

        /**
         * Enum CALL_PROCEDURE for value: "call_procedure"
         */
        public static final DeleteDeliveryFormatEnum CALL_PROCEDURE = new DeleteDeliveryFormatEnum("call_procedure");

        /**
         * Enum XCALL_PROCEDURE for value: "xcall_procedure"
         */
        public static final DeleteDeliveryFormatEnum XCALL_PROCEDURE = new DeleteDeliveryFormatEnum("xcall_procedure");

        private static final Map<String, DeleteDeliveryFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteDeliveryFormatEnum> createStaticFields() {
            Map<String, DeleteDeliveryFormatEnum> map = new HashMap<>();
            map.put("do_not_delete", DO_NOT_DELETE);
            map.put("delete", DELETE);
            map.put("call_procedure", CALL_PROCEDURE);
            map.put("xcall_procedure", XCALL_PROCEDURE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteDeliveryFormatEnum(String value) {
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
        public static DeleteDeliveryFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteDeliveryFormatEnum(value));
        }

        public static DeleteDeliveryFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteDeliveryFormatEnum) {
                return this.value.equals(((DeleteDeliveryFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_delivery_format")

    private DeleteDeliveryFormatEnum deleteDeliveryFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_stored_procedure")

    private String deleteStoredProcedure;

    public ArticlePropertiesRequest withDestinationObjectName(String destinationObjectName) {
        this.destinationObjectName = destinationObjectName;
        return this;
    }

    /**
     * 目标对象名称。
     * @return destinationObjectName
     */
    public String getDestinationObjectName() {
        return destinationObjectName;
    }

    public void setDestinationObjectName(String destinationObjectName) {
        this.destinationObjectName = destinationObjectName;
    }

    public ArticlePropertiesRequest withDestinationObjectOwner(String destinationObjectOwner) {
        this.destinationObjectOwner = destinationObjectOwner;
        return this;
    }

    /**
     * 目标对象命名空间。
     * @return destinationObjectOwner
     */
    public String getDestinationObjectOwner() {
        return destinationObjectOwner;
    }

    public void setDestinationObjectOwner(String destinationObjectOwner) {
        this.destinationObjectOwner = destinationObjectOwner;
    }

    public ArticlePropertiesRequest withInsertDeliveryFormat(InsertDeliveryFormatEnum insertDeliveryFormat) {
        this.insertDeliveryFormat = insertDeliveryFormat;
        return this;
    }

    /**
     * 插入交付格式。
     * @return insertDeliveryFormat
     */
    public InsertDeliveryFormatEnum getInsertDeliveryFormat() {
        return insertDeliveryFormat;
    }

    public void setInsertDeliveryFormat(InsertDeliveryFormatEnum insertDeliveryFormat) {
        this.insertDeliveryFormat = insertDeliveryFormat;
    }

    public ArticlePropertiesRequest withInsertStoredProcedure(String insertStoredProcedure) {
        this.insertStoredProcedure = insertStoredProcedure;
        return this;
    }

    /**
     * 插入存储过程。插入交付格式填call_procedure时该项必填。
     * @return insertStoredProcedure
     */
    public String getInsertStoredProcedure() {
        return insertStoredProcedure;
    }

    public void setInsertStoredProcedure(String insertStoredProcedure) {
        this.insertStoredProcedure = insertStoredProcedure;
    }

    public ArticlePropertiesRequest withUpdateDeliveryFormat(UpdateDeliveryFormatEnum updateDeliveryFormat) {
        this.updateDeliveryFormat = updateDeliveryFormat;
        return this;
    }

    /**
     * 更新交付格式。
     * @return updateDeliveryFormat
     */
    public UpdateDeliveryFormatEnum getUpdateDeliveryFormat() {
        return updateDeliveryFormat;
    }

    public void setUpdateDeliveryFormat(UpdateDeliveryFormatEnum updateDeliveryFormat) {
        this.updateDeliveryFormat = updateDeliveryFormat;
    }

    public ArticlePropertiesRequest withUpdateStoredProcedure(String updateStoredProcedure) {
        this.updateStoredProcedure = updateStoredProcedure;
        return this;
    }

    /**
     * 更新存储过程。更新交付格式填(m/x/s)call_procedure时该项必填。
     * @return updateStoredProcedure
     */
    public String getUpdateStoredProcedure() {
        return updateStoredProcedure;
    }

    public void setUpdateStoredProcedure(String updateStoredProcedure) {
        this.updateStoredProcedure = updateStoredProcedure;
    }

    public ArticlePropertiesRequest withDeleteDeliveryFormat(DeleteDeliveryFormatEnum deleteDeliveryFormat) {
        this.deleteDeliveryFormat = deleteDeliveryFormat;
        return this;
    }

    /**
     * 删除交付格式。
     * @return deleteDeliveryFormat
     */
    public DeleteDeliveryFormatEnum getDeleteDeliveryFormat() {
        return deleteDeliveryFormat;
    }

    public void setDeleteDeliveryFormat(DeleteDeliveryFormatEnum deleteDeliveryFormat) {
        this.deleteDeliveryFormat = deleteDeliveryFormat;
    }

    public ArticlePropertiesRequest withDeleteStoredProcedure(String deleteStoredProcedure) {
        this.deleteStoredProcedure = deleteStoredProcedure;
        return this;
    }

    /**
     * 删除存储过程。删除交付格式填(x)call_procedure时该项必填。
     * @return deleteStoredProcedure
     */
    public String getDeleteStoredProcedure() {
        return deleteStoredProcedure;
    }

    public void setDeleteStoredProcedure(String deleteStoredProcedure) {
        this.deleteStoredProcedure = deleteStoredProcedure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArticlePropertiesRequest that = (ArticlePropertiesRequest) obj;
        return Objects.equals(this.destinationObjectName, that.destinationObjectName)
            && Objects.equals(this.destinationObjectOwner, that.destinationObjectOwner)
            && Objects.equals(this.insertDeliveryFormat, that.insertDeliveryFormat)
            && Objects.equals(this.insertStoredProcedure, that.insertStoredProcedure)
            && Objects.equals(this.updateDeliveryFormat, that.updateDeliveryFormat)
            && Objects.equals(this.updateStoredProcedure, that.updateStoredProcedure)
            && Objects.equals(this.deleteDeliveryFormat, that.deleteDeliveryFormat)
            && Objects.equals(this.deleteStoredProcedure, that.deleteStoredProcedure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationObjectName,
            destinationObjectOwner,
            insertDeliveryFormat,
            insertStoredProcedure,
            updateDeliveryFormat,
            updateStoredProcedure,
            deleteDeliveryFormat,
            deleteStoredProcedure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArticlePropertiesRequest {\n");
        sb.append("    destinationObjectName: ").append(toIndentedString(destinationObjectName)).append("\n");
        sb.append("    destinationObjectOwner: ").append(toIndentedString(destinationObjectOwner)).append("\n");
        sb.append("    insertDeliveryFormat: ").append(toIndentedString(insertDeliveryFormat)).append("\n");
        sb.append("    insertStoredProcedure: ").append(toIndentedString(insertStoredProcedure)).append("\n");
        sb.append("    updateDeliveryFormat: ").append(toIndentedString(updateDeliveryFormat)).append("\n");
        sb.append("    updateStoredProcedure: ").append(toIndentedString(updateStoredProcedure)).append("\n");
        sb.append("    deleteDeliveryFormat: ").append(toIndentedString(deleteDeliveryFormat)).append("\n");
        sb.append("    deleteStoredProcedure: ").append(toIndentedString(deleteStoredProcedure)).append("\n");
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
