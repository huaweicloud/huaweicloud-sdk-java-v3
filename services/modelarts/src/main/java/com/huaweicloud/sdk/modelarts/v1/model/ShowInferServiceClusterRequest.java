package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowInferServiceClusterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-User-Token")

    private String xUserToken;

    public ShowInferServiceClusterRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 资源池ID，查询指定资源池下的服务，默认不过滤。可通过[查询资源池列表](ShowPool.xml)获取。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowInferServiceClusterRequest withXUserToken(String xUserToken) {
        this.xUserToken = xUserToken;
        return this;
    }

    /**
     * **参数解释：** 用户Token。[通过调用IAM服务获取用户Token接口获取响应消息头中X-Subject-Token的值。](tag:hws,hws_hk)获取方法请参见[[获取IAM用户Token（使用密码）](modelarts_03_0004.xml)](tag:hws,hws_hk)[[获取Token](modelarts_03_0015.xml)](tag:hcs,hcs_sm)。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return xUserToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-User-Token")
    public String getXUserToken() {
        return xUserToken;
    }

    public void setXUserToken(String xUserToken) {
        this.xUserToken = xUserToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInferServiceClusterRequest that = (ShowInferServiceClusterRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.xUserToken, that.xUserToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, xUserToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInferServiceClusterRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    xUserToken: ").append(toIndentedString(xUserToken)).append("\n");
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
