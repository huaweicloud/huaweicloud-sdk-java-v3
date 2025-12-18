package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConfigurationUpdateReqV3
 */
public class ConfigurationUpdateReqV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_para")

    private Object updatePara;

    public ConfigurationUpdateReqV3 withUpdatePara(Object updatePara) {
        this.updatePara = updatePara;
        return this;
    }

    /**
     * **参数解释**：  修改参数组相关信息。  **参数范围**：  不涉及。
     * @return updatePara
     */
    public Object getUpdatePara() {
        return updatePara;
    }

    public void setUpdatePara(Object updatePara) {
        this.updatePara = updatePara;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationUpdateReqV3 that = (ConfigurationUpdateReqV3) obj;
        return Objects.equals(this.updatePara, that.updatePara);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updatePara);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationUpdateReqV3 {\n");
        sb.append("    updatePara: ").append(toIndentedString(updatePara)).append("\n");
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
