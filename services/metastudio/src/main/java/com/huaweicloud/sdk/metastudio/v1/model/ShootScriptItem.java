package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 剧本参数配置。
 */
public class ShootScriptItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_no")

    private Integer sequenceNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shoot_script")

    private ShootScript shootScript;

    public ShootScriptItem withSequenceNo(Integer sequenceNo) {
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

    public ShootScriptItem withShootScript(ShootScript shootScript) {
        this.shootScript = shootScript;
        return this;
    }

    public ShootScriptItem withShootScript(Consumer<ShootScript> shootScriptSetter) {
        if (this.shootScript == null) {
            this.shootScript = new ShootScript();
            shootScriptSetter.accept(this.shootScript);
        }

        return this;
    }

    /**
     * Get shootScript
     * @return shootScript
     */
    public ShootScript getShootScript() {
        return shootScript;
    }

    public void setShootScript(ShootScript shootScript) {
        this.shootScript = shootScript;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShootScriptItem that = (ShootScriptItem) obj;
        return Objects.equals(this.sequenceNo, that.sequenceNo) && Objects.equals(this.shootScript, that.shootScript);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequenceNo, shootScript);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShootScriptItem {\n");
        sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
        sb.append("    shootScript: ").append(toIndentedString(shootScript)).append("\n");
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
