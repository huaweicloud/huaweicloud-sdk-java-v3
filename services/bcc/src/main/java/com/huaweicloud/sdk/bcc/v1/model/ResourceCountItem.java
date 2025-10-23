package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceCountItem
 */
public class ResourceCountItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprotected")

    private ProtectionCount unprotected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected")

    private ProtectionCount _protected;

    public ResourceCountItem withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 日期, 如\"2025-05-19\"。
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ResourceCountItem withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 资源总数
     * minimum: 1
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ResourceCountItem withUnprotected(ProtectionCount unprotected) {
        this.unprotected = unprotected;
        return this;
    }

    public ResourceCountItem withUnprotected(Consumer<ProtectionCount> unprotectedSetter) {
        if (this.unprotected == null) {
            this.unprotected = new ProtectionCount();
            unprotectedSetter.accept(this.unprotected);
        }

        return this;
    }

    /**
     * Get unprotected
     * @return unprotected
     */
    public ProtectionCount getUnprotected() {
        return unprotected;
    }

    public void setUnprotected(ProtectionCount unprotected) {
        this.unprotected = unprotected;
    }

    public ResourceCountItem withProtected(ProtectionCount _protected) {
        this._protected = _protected;
        return this;
    }

    public ResourceCountItem withProtected(Consumer<ProtectionCount> _protectedSetter) {
        if (this._protected == null) {
            this._protected = new ProtectionCount();
            _protectedSetter.accept(this._protected);
        }

        return this;
    }

    /**
     * Get _protected
     * @return _protected
     */
    public ProtectionCount getProtected() {
        return _protected;
    }

    public void setProtected(ProtectionCount _protected) {
        this._protected = _protected;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceCountItem that = (ResourceCountItem) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.total, that.total)
            && Objects.equals(this.unprotected, that.unprotected) && Objects.equals(this._protected, that._protected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, total, unprotected, _protected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceCountItem {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    unprotected: ").append(toIndentedString(unprotected)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
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
