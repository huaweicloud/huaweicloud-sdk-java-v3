package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateShareCacheGroupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateShareCacheGroupsRequstBody body;

    public UpdateShareCacheGroupsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 共享缓存组ID，可通过查询共享缓存组列表接口获取 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateShareCacheGroupsRequest withBody(UpdateShareCacheGroupsRequstBody body) {
        this.body = body;
        return this;
    }

    public UpdateShareCacheGroupsRequest withBody(Consumer<UpdateShareCacheGroupsRequstBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateShareCacheGroupsRequstBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateShareCacheGroupsRequstBody getBody() {
        return body;
    }

    public void setBody(UpdateShareCacheGroupsRequstBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateShareCacheGroupsRequest that = (UpdateShareCacheGroupsRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateShareCacheGroupsRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
