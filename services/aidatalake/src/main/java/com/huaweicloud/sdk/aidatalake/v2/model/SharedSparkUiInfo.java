package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Spark UI 共享链接及其到期时间。
 */
public class SharedSparkUiInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_at")

    private Long expiredAt;

    public SharedSparkUiInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**：共享链接凭证。 **约束限制**：不涉及。 **取值范围**：共享URL格式，长度为1~1024个字符。 **默认取值**：不涉及。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SharedSparkUiInfo withExpiredAt(Long expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * **参数解释**：过期时间时间戳，共享链接使用到该时间之后不可用，毫秒。 **约束限制**：毫秒时间戳。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return expiredAt
     */
    public Long getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Long expiredAt) {
        this.expiredAt = expiredAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SharedSparkUiInfo that = (SharedSparkUiInfo) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.expiredAt, that.expiredAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, expiredAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SharedSparkUiInfo {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
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
