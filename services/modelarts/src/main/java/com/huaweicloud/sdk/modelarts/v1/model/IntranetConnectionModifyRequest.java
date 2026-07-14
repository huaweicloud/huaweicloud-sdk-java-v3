package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 修改自定义URL请求体。 **约束限制：** 不涉及。  **取值范围：** 不涉及。  **默认取值：** 不涉及。
 */
public class IntranetConnectionModifyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_urls")

    private List<String> customUrls = null;

    public IntranetConnectionModifyRequest withCustomUrls(List<String> customUrls) {
        this.customUrls = customUrls;
        return this;
    }

    public IntranetConnectionModifyRequest addCustomUrlsItem(String customUrlsItem) {
        if (this.customUrls == null) {
            this.customUrls = new ArrayList<>();
        }
        this.customUrls.add(customUrlsItem);
        return this;
    }

    public IntranetConnectionModifyRequest withCustomUrls(Consumer<List<String>> customUrlsSetter) {
        if (this.customUrls == null) {
            this.customUrls = new ArrayList<>();
        }
        customUrlsSetter.accept(this.customUrls);
        return this;
    }

    /**
     * **参数解释：** 自定义URL，格式为：{协议}://{域名}{路径} **约束限制：** url个数不超过10个，单个url长度不超过1024。 **取值范围：** - 协议范围：http，https，wss，ws。 - 域名范围：支持域名或IP:端口。域名长度不超过63，包含字母、数字、中划线（-)且不能以中划线（-)开头或结尾，顶级域名不能包含数字；端口范围为1-65535。 - 路径范围：斜杠（/）开头，仅包含字母、数字、点号（.）、中划线（-)、下划线（_）、斜杠（/）的路径。 **默认取值：** 不涉及。
     * @return customUrls
     */
    public List<String> getCustomUrls() {
        return customUrls;
    }

    public void setCustomUrls(List<String> customUrls) {
        this.customUrls = customUrls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntranetConnectionModifyRequest that = (IntranetConnectionModifyRequest) obj;
        return Objects.equals(this.customUrls, that.customUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntranetConnectionModifyRequest {\n");
        sb.append("    customUrls: ").append(toIndentedString(customUrls)).append("\n");
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
