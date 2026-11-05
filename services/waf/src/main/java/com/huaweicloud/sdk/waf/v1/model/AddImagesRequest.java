package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddImagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atlas_id")

    private String atlasId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddImagesBody body;

    public AddImagesRequest withAtlasId(String atlasId) {
        this.atlasId = atlasId;
        return this;
    }

    /**
     * 图库ID
     * @return atlasId
     */
    public String getAtlasId() {
        return atlasId;
    }

    public void setAtlasId(String atlasId) {
        this.atlasId = atlasId;
    }

    public AddImagesRequest withBody(AddImagesBody body) {
        this.body = body;
        return this;
    }

    public AddImagesRequest withBody(Consumer<AddImagesBody> bodySetter) {
        if (this.body == null) {
            this.body = new AddImagesBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddImagesBody getBody() {
        return body;
    }

    public void setBody(AddImagesBody body) {
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
        AddImagesRequest that = (AddImagesRequest) obj;
        return Objects.equals(this.atlasId, that.atlasId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atlasId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddImagesRequest {\n");
        sb.append("    atlasId: ").append(toIndentedString(atlasId)).append("\n");
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
