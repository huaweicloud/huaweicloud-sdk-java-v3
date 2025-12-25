package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新虚拟接口可靠性探测扩展信息的请求体
 */
public class UpdateExtendAttributeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_attribute")

    private VifExtendAttribute extendAttribute;

    public UpdateExtendAttributeRequestBody withExtendAttribute(VifExtendAttribute extendAttribute) {
        this.extendAttribute = extendAttribute;
        return this;
    }

    public UpdateExtendAttributeRequestBody withExtendAttribute(Consumer<VifExtendAttribute> extendAttributeSetter) {
        if (this.extendAttribute == null) {
            this.extendAttribute = new VifExtendAttribute();
            extendAttributeSetter.accept(this.extendAttribute);
        }

        return this;
    }

    /**
     * Get extendAttribute
     * @return extendAttribute
     */
    public VifExtendAttribute getExtendAttribute() {
        return extendAttribute;
    }

    public void setExtendAttribute(VifExtendAttribute extendAttribute) {
        this.extendAttribute = extendAttribute;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateExtendAttributeRequestBody that = (UpdateExtendAttributeRequestBody) obj;
        return Objects.equals(this.extendAttribute, that.extendAttribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extendAttribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateExtendAttributeRequestBody {\n");
        sb.append("    extendAttribute: ").append(toIndentedString(extendAttribute)).append("\n");
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
