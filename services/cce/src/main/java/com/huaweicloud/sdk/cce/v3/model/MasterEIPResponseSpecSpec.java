package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MasterEIPResponseSpecSpec
 */
public class MasterEIPResponseSpecSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private EipSpec eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IsDynamic")

    private Boolean isDynamic;

    public MasterEIPResponseSpecSpec withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 弹性网卡ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MasterEIPResponseSpecSpec withEip(EipSpec eip) {
        this.eip = eip;
        return this;
    }

    public MasterEIPResponseSpecSpec withEip(Consumer<EipSpec> eipSetter) {
        if (this.eip == null) {
            this.eip = new EipSpec();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public EipSpec getEip() {
        return eip;
    }

    public void setEip(EipSpec eip) {
        this.eip = eip;
    }

    public MasterEIPResponseSpecSpec withIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    /**
     * 是否动态创建
     * @return isDynamic
     */
    public Boolean getIsDynamic() {
        return isDynamic;
    }

    public void setIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MasterEIPResponseSpecSpec that = (MasterEIPResponseSpecSpec) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.eip, that.eip)
            && Objects.equals(this.isDynamic, that.isDynamic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eip, isDynamic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MasterEIPResponseSpecSpec {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    isDynamic: ").append(toIndentedString(isDynamic)).append("\n");
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
