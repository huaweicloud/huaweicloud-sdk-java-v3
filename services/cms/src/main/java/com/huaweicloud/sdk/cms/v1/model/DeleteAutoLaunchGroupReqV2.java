package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This is a delete Request Object
 */
public class DeleteAutoLaunchGroupReqV2 {

    /**
     * 删除智能购买组时组内实例的中断行为。枚举值 terminate：释放，由delete_publicip和delete_volume决定是否释放弹性公网IP和磁盘 noTermination：不释放，弹性公网IP和磁盘也不释放 默认值：terminate
     */
    public static final class DeleteInstancesEnum {

        /**
         * Enum TERMINATE for value: "terminate"
         */
        public static final DeleteInstancesEnum TERMINATE = new DeleteInstancesEnum("terminate");

        /**
         * Enum NOTERMINATION for value: "noTermination"
         */
        public static final DeleteInstancesEnum NOTERMINATION = new DeleteInstancesEnum("noTermination");

        private static final Map<String, DeleteInstancesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteInstancesEnum> createStaticFields() {
            Map<String, DeleteInstancesEnum> map = new HashMap<>();
            map.put("terminate", TERMINATE);
            map.put("noTermination", NOTERMINATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteInstancesEnum(String value) {
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
        public static DeleteInstancesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DeleteInstancesEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeleteInstancesEnum(value);
            }
            return result;
        }

        public static DeleteInstancesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DeleteInstancesEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteInstancesEnum) {
                return this.value.equals(((DeleteInstancesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_instances")

    private DeleteInstancesEnum deleteInstances;

    public DeleteAutoLaunchGroupReqV2 withDeleteInstances(DeleteInstancesEnum deleteInstances) {
        this.deleteInstances = deleteInstances;
        return this;
    }

    /**
     * 删除智能购买组时组内实例的中断行为。枚举值 terminate：释放，由delete_publicip和delete_volume决定是否释放弹性公网IP和磁盘 noTermination：不释放，弹性公网IP和磁盘也不释放 默认值：terminate
     * @return deleteInstances
     */
    public DeleteInstancesEnum getDeleteInstances() {
        return deleteInstances;
    }

    public void setDeleteInstances(DeleteInstancesEnum deleteInstances) {
        this.deleteInstances = deleteInstances;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAutoLaunchGroupReqV2 deleteAutoLaunchGroupReqV2 = (DeleteAutoLaunchGroupReqV2) o;
        return Objects.equals(this.deleteInstances, deleteAutoLaunchGroupReqV2.deleteInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAutoLaunchGroupReqV2 {\n");
        sb.append("    deleteInstances: ").append(toIndentedString(deleteInstances)).append("\n");
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
