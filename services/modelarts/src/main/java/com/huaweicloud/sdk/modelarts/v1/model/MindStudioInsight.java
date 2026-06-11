package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MindStudio Insight连接信息。
 */
public class MindStudioInsight {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    public MindStudioInsight withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**：训练作业的MindStudio Insight地址。 **取值范围**：不涉及。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MindStudioInsight withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * **参数解释**：训练作业的MindStudio Insight token。 **取值范围**：不涉及。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MindStudioInsight that = (MindStudioInsight) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MindStudioInsight {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
