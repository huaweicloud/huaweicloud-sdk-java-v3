package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowQuotasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includeTagsQuota")

    private String includeTagsQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "onlyQuota")

    private String onlyQuota;

    public ShowQuotasRequest withIncludeTagsQuota(String includeTagsQuota) {
        this.includeTagsQuota = includeTagsQuota;
        return this;
    }

    /**
     * **参数解释**： 是否包含标签配额标志。 **约束限制**： 不涉及。 **取值范围**： - true：包含配额。 - false：不包含配额。 **默认取值**： true。
     * @return includeTagsQuota
     */
    public String getIncludeTagsQuota() {
        return includeTagsQuota;
    }

    public void setIncludeTagsQuota(String includeTagsQuota) {
        this.includeTagsQuota = includeTagsQuota;
    }

    public ShowQuotasRequest withOnlyQuota(String onlyQuota) {
        this.onlyQuota = onlyQuota;
        return this;
    }

    /**
     * **参数解释**： 查询指定配额引擎。 **约束限制**： 不涉及。 **取值范围**： - reliability：RocketMQ消息引擎别称。 - kafka：kafka消息引擎别称。 **默认取值**： 不涉及。
     * @return onlyQuota
     */
    public String getOnlyQuota() {
        return onlyQuota;
    }

    public void setOnlyQuota(String onlyQuota) {
        this.onlyQuota = onlyQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQuotasRequest that = (ShowQuotasRequest) obj;
        return Objects.equals(this.includeTagsQuota, that.includeTagsQuota)
            && Objects.equals(this.onlyQuota, that.onlyQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeTagsQuota, onlyQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotasRequest {\n");
        sb.append("    includeTagsQuota: ").append(toIndentedString(includeTagsQuota)).append("\n");
        sb.append("    onlyQuota: ").append(toIndentedString(onlyQuota)).append("\n");
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
