package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Eip
 */
public class Eip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected")

    private ChangedVO _protected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public Eip withProtected(ChangedVO _protected) {
        this._protected = _protected;
        return this;
    }

    public Eip withProtected(Consumer<ChangedVO> _protectedSetter) {
        if (this._protected == null) {
            this._protected = new ChangedVO();
            _protectedSetter.accept(this._protected);
        }

        return this;
    }

    /**
     * Get _protected
     * @return _protected
     */
    public ChangedVO getProtected() {
        return _protected;
    }

    public void setProtected(ChangedVO _protected) {
        this._protected = _protected;
    }

    public Eip withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： EIP数量 **取值范围**： 不涉及
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Eip that = (Eip) obj;
        return Objects.equals(this._protected, that._protected) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_protected, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Eip {\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
