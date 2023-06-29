package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HbaseModifySettingV2
 */
public class HbaseModifySettingV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parm_name")

    private String parmName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_value")

    private String newValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public HbaseModifySettingV2 withParmName(String parmName) {
        this.parmName = parmName;
        return this;
    }

    /**
     * 待修改的参数名
     * @return parmName
     */
    public String getParmName() {
        return parmName;
    }

    public void setParmName(String parmName) {
        this.parmName = parmName;
    }

    public HbaseModifySettingV2 withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * 设置的参数值
     * @return newValue
     */
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public HbaseModifySettingV2 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数ID，可不传
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HbaseModifySettingV2 that = (HbaseModifySettingV2) obj;
        return Objects.equals(this.parmName, that.parmName) && Objects.equals(this.newValue, that.newValue)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parmName, newValue, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HbaseModifySettingV2 {\n");
        sb.append("    parmName: ").append(toIndentedString(parmName)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
