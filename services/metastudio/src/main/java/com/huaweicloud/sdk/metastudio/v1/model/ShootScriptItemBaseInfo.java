package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShootScriptItemBaseInfo
 */
public class ShootScriptItemBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_no")

    private Integer sequenceNo;

    public ShootScriptItemBaseInfo withSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
        return this;
    }

    /**
     * **参数解释**： 剧本序号。 **约束限制**： 同一个剧本序号不重复。 **默认取值**： 不涉及。
     * minimum: 0
     * maximum: 2147483647
     * @return sequenceNo
     */
    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShootScriptItemBaseInfo that = (ShootScriptItemBaseInfo) obj;
        return Objects.equals(this.sequenceNo, that.sequenceNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequenceNo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShootScriptItemBaseInfo {\n");
        sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
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
