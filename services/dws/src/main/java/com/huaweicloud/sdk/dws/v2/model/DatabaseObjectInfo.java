package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 对象信息。 **取值范围**： 不涉及。
 */
public class DatabaseObjectInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obj_name")

    private String objName;

    public DatabaseObjectInfo withObjName(String objName) {
        this.objName = objName;
        return this;
    }

    /**
     * **参数解释**： 对象名称。 **取值范围**： 不涉及。
     * @return objName
     */
    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseObjectInfo that = (DatabaseObjectInfo) obj;
        return Objects.equals(this.objName, that.objName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseObjectInfo {\n");
        sb.append("    objName: ").append(toIndentedString(objName)).append("\n");
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
