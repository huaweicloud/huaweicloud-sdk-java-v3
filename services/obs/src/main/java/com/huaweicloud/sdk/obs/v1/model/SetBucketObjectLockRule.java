package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 桶级WORM策略的规则容器，Rule是DefaultRetention的父节点。 ObjectLockEnabled为Enabled时必选，不携带则会清空当前配置的桶级默认WORM策略。 
 */
@JacksonXmlRootElement(localName = "Rule")
public class SetBucketObjectLockRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DefaultRetention")

    @JacksonXmlProperty(localName = "DefaultRetention")

    private SetBucketObjectLockDefaultRetention defaultRetention;

    public SetBucketObjectLockRule withDefaultRetention(SetBucketObjectLockDefaultRetention defaultRetention) {
        this.defaultRetention = defaultRetention;
        return this;
    }

    public SetBucketObjectLockRule withDefaultRetention(
        Consumer<SetBucketObjectLockDefaultRetention> defaultRetentionSetter) {
        if (this.defaultRetention == null) {
            this.defaultRetention = new SetBucketObjectLockDefaultRetention();
            defaultRetentionSetter.accept(this.defaultRetention);
        }

        return this;
    }

    /**
     * Get defaultRetention
     * @return defaultRetention
     */
    public SetBucketObjectLockDefaultRetention getDefaultRetention() {
        return defaultRetention;
    }

    public void setDefaultRetention(SetBucketObjectLockDefaultRetention defaultRetention) {
        this.defaultRetention = defaultRetention;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBucketObjectLockRule that = (SetBucketObjectLockRule) obj;
        return Objects.equals(this.defaultRetention, that.defaultRetention);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultRetention);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBucketObjectLockRule {\n");
        sb.append("    defaultRetention: ").append(toIndentedString(defaultRetention)).append("\n");
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
