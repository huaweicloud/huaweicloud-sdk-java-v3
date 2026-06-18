package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateOIDCProviderThumbprintReqBody
 */
public class UpdateOIDCProviderThumbprintReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbprints")

    private List<String> thumbprints = null;

    public UpdateOIDCProviderThumbprintReqBody withThumbprints(List<String> thumbprints) {
        this.thumbprints = thumbprints;
        return this;
    }

    public UpdateOIDCProviderThumbprintReqBody addThumbprintsItem(String thumbprintsItem) {
        if (this.thumbprints == null) {
            this.thumbprints = new ArrayList<>();
        }
        this.thumbprints.add(thumbprintsItem);
        return this;
    }

    public UpdateOIDCProviderThumbprintReqBody withThumbprints(Consumer<List<String>> thumbprintsSetter) {
        if (this.thumbprints == null) {
            this.thumbprints = new ArrayList<>();
        }
        thumbprintsSetter.accept(this.thumbprints);
        return this;
    }

    /**
     * **参数解释**： OIDC 身份提供商的服务器证书指纹列表。  **约束限制**： 列表元素数量取值范围为[1,5]个，每个元素字符串长度为64。  **取值范围**： 不涉及。  **默认取值**： 不涉及。
     * @return thumbprints
     */
    public List<String> getThumbprints() {
        return thumbprints;
    }

    public void setThumbprints(List<String> thumbprints) {
        this.thumbprints = thumbprints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOIDCProviderThumbprintReqBody that = (UpdateOIDCProviderThumbprintReqBody) obj;
        return Objects.equals(this.thumbprints, that.thumbprints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thumbprints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOIDCProviderThumbprintReqBody {\n");
        sb.append("    thumbprints: ").append(toIndentedString(thumbprints)).append("\n");
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
