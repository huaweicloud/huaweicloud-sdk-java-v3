package com.huaweicloud.sdk.doczip.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 身份提供方信息
 */
public class IDPDetailVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_idp")

    private IDPInfo addIdp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_idp")

    private IDPInfo updateIdp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "del_idp")

    private IDPInfo delIdp;

    public IDPDetailVo withAddIdp(IDPInfo addIdp) {
        this.addIdp = addIdp;
        return this;
    }

    public IDPDetailVo withAddIdp(Consumer<IDPInfo> addIdpSetter) {
        if (this.addIdp == null) {
            this.addIdp = new IDPInfo();
            addIdpSetter.accept(this.addIdp);
        }

        return this;
    }

    /**
     * Get addIdp
     * @return addIdp
     */
    public IDPInfo getAddIdp() {
        return addIdp;
    }

    public void setAddIdp(IDPInfo addIdp) {
        this.addIdp = addIdp;
    }

    public IDPDetailVo withUpdateIdp(IDPInfo updateIdp) {
        this.updateIdp = updateIdp;
        return this;
    }

    public IDPDetailVo withUpdateIdp(Consumer<IDPInfo> updateIdpSetter) {
        if (this.updateIdp == null) {
            this.updateIdp = new IDPInfo();
            updateIdpSetter.accept(this.updateIdp);
        }

        return this;
    }

    /**
     * Get updateIdp
     * @return updateIdp
     */
    public IDPInfo getUpdateIdp() {
        return updateIdp;
    }

    public void setUpdateIdp(IDPInfo updateIdp) {
        this.updateIdp = updateIdp;
    }

    public IDPDetailVo withDelIdp(IDPInfo delIdp) {
        this.delIdp = delIdp;
        return this;
    }

    public IDPDetailVo withDelIdp(Consumer<IDPInfo> delIdpSetter) {
        if (this.delIdp == null) {
            this.delIdp = new IDPInfo();
            delIdpSetter.accept(this.delIdp);
        }

        return this;
    }

    /**
     * Get delIdp
     * @return delIdp
     */
    public IDPInfo getDelIdp() {
        return delIdp;
    }

    public void setDelIdp(IDPInfo delIdp) {
        this.delIdp = delIdp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDPDetailVo that = (IDPDetailVo) obj;
        return Objects.equals(this.addIdp, that.addIdp) && Objects.equals(this.updateIdp, that.updateIdp)
            && Objects.equals(this.delIdp, that.delIdp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addIdp, updateIdp, delIdp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IDPDetailVo {\n");
        sb.append("    addIdp: ").append(toIndentedString(addIdp)).append("\n");
        sb.append("    updateIdp: ").append(toIndentedString(updateIdp)).append("\n");
        sb.append("    delIdp: ").append(toIndentedString(delIdp)).append("\n");
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
